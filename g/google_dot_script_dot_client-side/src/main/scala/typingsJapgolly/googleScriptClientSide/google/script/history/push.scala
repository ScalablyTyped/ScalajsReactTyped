package typingsJapgolly.googleScriptClientSide.google.script.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.script.history.push")
@js.native
object push extends js.Object {
  /**
    * Pushes the provided state object, URL parameters and URL fragment onto the browser history stack.
    * @param stateObject An developer-defined object to be associated with a browser history event, and which resurfaces when the state is popped.
    * Typically used to store application state information (such as page data) for future retrieval.
    * @param params An object containing URL parameters to associate with this state.
    * For example, {foo: “bar”, fiz: “baz”} equates to "?foo=bar&fiz=baz".
    * Alternatively, arrays can be used: {foo: [“bar”, “cat”], fiz: “baz”} equates to "?foo=bar&foo=cat&fiz=baz".
    * If null or undefined, the current URL parameters are not changed. If empty, the URL parameters are cleared.
    * @param hash The string URL fragment appearing after the '#' character.
    * If null or undefined, the current URL fragment is not changed. If empty, the URL fragment is cleared.
    */
  def apply(stateObject: State): Unit = js.native
  def apply(stateObject: State, params: Query): Unit = js.native
  def apply(stateObject: State, params: Query, hash: String): Unit = js.native
}

