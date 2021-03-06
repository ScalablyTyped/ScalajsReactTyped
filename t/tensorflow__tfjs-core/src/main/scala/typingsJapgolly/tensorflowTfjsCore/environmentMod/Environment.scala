package typingsJapgolly.tensorflowTfjsCore.environmentMod

import typingsJapgolly.tensorflowTfjsCore.platformMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/environment", "Environment")
@js.native
class Environment protected () extends js.Object {
  def this(global: js.Any) = this()
  var evaluateFlag: js.Any = js.native
  val features: Flags = js.native
  var flagRegistry: js.Any = js.native
  var flags: js.Any = js.native
  var global: js.Any = js.native
  var platform: Platform = js.native
  var platformName: String = js.native
  var populateURLFlags: js.Any = js.native
  var urlFlags: js.Any = js.native
  def get(flagName: String): FlagValue = js.native
  def getBool(flagName: String): Boolean = js.native
  def getFlags(): Flags = js.native
  def getNumber(flagName: String): Double = js.native
  def registerFlag(flagName: String, evaluationFn: js.Function0[FlagValue]): Unit = js.native
  def registerFlag(
    flagName: String,
    evaluationFn: js.Function0[FlagValue],
    setHook: js.Function1[/* value */ FlagValue, Unit]
  ): Unit = js.native
  def reset(): Unit = js.native
  def set(flagName: String, value: FlagValue): Unit = js.native
  def setFlags(flags: Flags): Unit = js.native
  def setPlatform(platformName: String, platform: Platform): Unit = js.native
}

