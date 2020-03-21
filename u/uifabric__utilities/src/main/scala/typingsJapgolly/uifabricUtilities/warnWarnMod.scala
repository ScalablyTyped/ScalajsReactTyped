package typingsJapgolly.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/warn/warn", JSImport.Namespace)
@js.native
object warnWarnMod extends js.Object {
  def setWarningCallback(): Unit = js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  def warn(message: String): Unit = js.native
  type ISettingsMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.ISettingsMap with js.Any
}

