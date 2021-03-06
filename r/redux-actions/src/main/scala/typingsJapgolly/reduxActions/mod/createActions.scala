package typingsJapgolly.reduxActions.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-actions", "createActions")
@js.native
object createActions extends js.Object {
  def apply(actionMapOrIdentityAction: String, identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[_]]] = js.native
  def apply(actionMapOrIdentityAction: ActionMap[_, _], identityActions: (String | Options)*): StringDictionary[ActionFunctionAny[Action[_]]] = js.native
}

