package typingsJapgolly.wordpressDataControls

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.wordpressApiFetch.mod.APIFetchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data-controls", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apiFetch(options: APIFetchOptions): Unit = js.native
  def dispatch(storeKey: String, actionName: String, args: js.Any*): Unit = js.native
  def select(storeKey: String, selectorName: String, args: js.Any*): Unit = js.native
  @js.native
  object controls extends js.Object {
    def API_FETCH(action: AnyAction): js.Promise[_] = js.native
    def DISPATCH(action: AnyAction): Unit = js.native
    def SELECT(action: AnyAction): js.Any = js.native
  }
  
}

