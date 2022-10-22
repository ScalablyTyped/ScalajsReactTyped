package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuLauncher
  extends StObject
     with Control
     with IModalController
object MenuLauncher {
  
  inline def apply(
    createComponentForDisplayMode: String => Any,
    dispose: Callback,
    get_enabled: CallbackTo[Boolean],
    get_id: CallbackTo[String],
    get_root: CallbackTo[Root],
    set_enabled: Boolean => Boolean
  ): MenuLauncher = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = dispose.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_root = get_root.toJsFn, set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[MenuLauncher]
  }
}
