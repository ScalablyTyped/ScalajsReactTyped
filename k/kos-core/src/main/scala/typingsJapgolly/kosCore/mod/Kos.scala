package typingsJapgolly.kosCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.kosCore.AnonDispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kos extends js.Object {
  var Util: typingsJapgolly.kosCore.mod.Util = js.native
  def Wrapper(config: WrapperConfig): js.Function1[ComponentClassP[js.Any with KosProps[_] with js.Object], _] = js.native
  def getModel(namespace: String): KosModel[_] = js.native
  def registeModel(model: js.Any): Unit = js.native
  def removeModel(namespace: String): Unit = js.native
  def start(Layout: ComponentClassP[js.Object]): Unit = js.native
  def start(Layout: ComponentClassP[js.Object], container: String): Unit = js.native
  def use(middleware: js.Function1[/* api */ AnonDispatch, Unit]): Unit = js.native
}

