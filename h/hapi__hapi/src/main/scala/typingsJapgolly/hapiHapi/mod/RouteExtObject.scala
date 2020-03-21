package typingsJapgolly.hapiHapi.mod

import typingsJapgolly.hapiHapi.mod.Lifecycle.Method
import typingsJapgolly.hapiHapi.mod.Lifecycle.ReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteExtObject extends js.Object {
  @JSName("method")
  var method_Original: Method = js.native
  var options: js.UndefOr[ServerExtOptions] = js.native
  def method(request: Request, h: ResponseToolkit): ReturnValue = js.native
  def method(request: Request, h: ResponseToolkit, err: js.Error): ReturnValue = js.native
}

