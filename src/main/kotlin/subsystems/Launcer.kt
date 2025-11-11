package subsystems

import com.revrobotics.spark.SparkMax
import com.revrobotics.spark.SparkClosedLoopController
import com.revrobotics.spark.SparkLowLevel
import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.Subsystem

object Launcer : Subsystem {
    val launcherMotor = SparkMax(6, SparkLowLevel.MotorType.kBrushless)
    private val launcherFollowerMotor = SparkMax(5, SparkLowLevel.MotorType.kBrushless)

    val LAUNCH: Command
        get() =
            runOnce {
                launcherMotor.set(1.0)
                launcherFollowerMotor.set(1.0)
            }

    val INTAKE: Command
        get() =
            runOnce {
                launcherMotor.set(-1.0)
                launcherFollowerMotor.set(-1.0)
            }

    init {

    }
}

