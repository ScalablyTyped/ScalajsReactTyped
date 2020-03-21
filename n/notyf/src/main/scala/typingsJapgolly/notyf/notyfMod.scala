package typingsJapgolly.notyf

import typingsJapgolly.notyf.notyfModelsMod.NotyfArray
import typingsJapgolly.notyf.notyfModelsMod.NotyfNotification
import typingsJapgolly.notyf.notyfOptionsMod.INotyfOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf/notyf", JSImport.Namespace)
@js.native
object notyfMod extends js.Object {
  @js.native
  trait Notyf extends js.Object {
    var _pushNotification: js.Any = js.native
    var normalizeOptions: js.Any = js.native
    var notifications: NotyfArray[NotyfNotification] = js.native
    var options: INotyfOptions = js.native
    var registerTypes: js.Any = js.native
    var view: js.Any = js.native
    def error(payload: String): Unit = js.native
    def error(payload: PartialINotyfNotification): Unit = js.native
    def open(options: DeepPartialINotyfNotifica): Unit = js.native
    def success(payload: String): Unit = js.native
    def success(payload: PartialINotyfNotification): Unit = js.native
  }
  
  @js.native
  class default () extends Notyf {
    def this(opts: PartialINotyfOptions) = this()
  }
  
}

