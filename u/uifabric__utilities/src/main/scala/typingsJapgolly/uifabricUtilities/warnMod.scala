package typingsJapgolly.uifabricUtilities

import typingsJapgolly.uifabricUtilities.warnControlledUsageMod.IWarnControlledUsageParams
import typingsJapgolly.uifabricUtilities.warnWarnMod.ISettingsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/warn", JSImport.Namespace)
@js.native
object warnMod extends js.Object {
  def resetControlledWarnings(): Unit = js.native
  def setWarningCallback(): Unit = js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  def warn(message: String): Unit = js.native
  def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = js.native
  def warnControlledUsage[P](params: IWarnControlledUsageParams[P]): Unit = js.native
  def warnDeprecations[P](componentName: String, props: P, deprecationMap: ISettingsMap[P]): Unit = js.native
  def warnMutuallyExclusive[P](componentName: String, props: P, exclusiveMap: ISettingsMap[P]): Unit = js.native
}

