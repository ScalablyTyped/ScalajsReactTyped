package typingsJapgolly.inversifyExpressUtils

import typingsJapgolly.inversify.interfacesMod.interfaces.Container
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.Controller
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typingsJapgolly.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def cleanUpMetadata(): Unit = js.native
  def getControllerMetadata(constructor: js.Any): ControllerMetadata = js.native
  def getControllerMethodMetadata(constructor: js.Any): js.Array[ControllerMethodMetadata] = js.native
  def getControllerParameterMetadata(constructor: js.Any): ControllerParameterMetadata = js.native
  def getControllersFromContainer(container: Container, forceControllers: Boolean): js.Array[Controller] = js.native
  def getControllersFromMetadata(): js.Array[_] = js.native
  def instanceOfIHttpActionResult(value: js.Any): /* is inversify-express-utils.inversify-express-utils/dts/interfaces.interfaces.IHttpActionResult */ Boolean = js.native
}

