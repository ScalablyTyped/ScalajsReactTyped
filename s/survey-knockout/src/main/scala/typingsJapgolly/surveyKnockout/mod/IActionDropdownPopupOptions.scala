package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionDropdownPopupOptions
  extends StObject
     with IListModel
     with IPopupOptionsBase
object IActionDropdownPopupOptions {
  
  inline def apply(items: Any, onSelectionChanged: (Action, Any) => Callback): IActionDropdownPopupOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onSelectionChanged = js.Any.fromFunction2((t0: Action, t1: Any) => (onSelectionChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[IActionDropdownPopupOptions]
  }
}
