package typingsJapgolly.officeUiFabricReact.indexBundleMod

import typingsJapgolly.uifabricUtilities.globalSettingsMod.IChangeEventCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings")
@js.native
class GlobalSettings ()
  extends typingsJapgolly.officeUiFabricReact.mod.GlobalSettings

/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings")
@js.native
object GlobalSettings extends js.Object {
  def addChangeListener(cb: IChangeEventCallback): Unit = js.native
  def getValue[T](key: String): T = js.native
  def getValue[T](key: String, defaultValue: T): T = js.native
  def getValue[T](key: String, defaultValue: js.Function0[T]): T = js.native
  def removeChangeListener(cb: IChangeEventCallback): Unit = js.native
  def setValue[T](key: String, value: T): T = js.native
}

