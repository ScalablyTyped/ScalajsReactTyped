package typingsJapgolly.notyf

import typingsJapgolly.notyf.notyfMod.default
import typingsJapgolly.notyf.notyfOptionsMod.INotyfOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Notyf () extends default {
    def this(opts: PartialINotyfOptions) = this()
  }
  
  @js.native
  class NotyfArray[T] ()
    extends typingsJapgolly.notyf.notyfModelsMod.NotyfArray[T]
  
  @js.native
  class NotyfNotification protected ()
    extends typingsJapgolly.notyf.notyfModelsMod.NotyfNotification {
    def this(options: DeepPartialINotyfNotifica) = this()
  }
  
  @js.native
  class NotyfView ()
    extends typingsJapgolly.notyf.notyfViewMod.NotyfView
  
  val DEFAULT_OPTIONS: INotyfOptions = js.native
  @js.native
  object NotyfArrayEvent extends js.Object {
    /* 0 */ val Add: typingsJapgolly.notyf.notyfModelsMod.NotyfArrayEvent.Add with Double = js.native
    /* 1 */ val Remove: typingsJapgolly.notyf.notyfModelsMod.NotyfArrayEvent.Remove with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.notyf.notyfModelsMod.NotyfArrayEvent with Double] = js.native
  }
  
}

