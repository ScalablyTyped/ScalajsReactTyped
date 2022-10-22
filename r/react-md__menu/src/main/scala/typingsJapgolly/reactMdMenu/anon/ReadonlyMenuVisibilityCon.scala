package typingsJapgolly.reactMdMenu.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/MenuVisibilityProvider.MenuVisibilityContext> */
trait ReadonlyMenuVisibilityCon extends StObject {
  
  val setVisible: Dispatch[SetStateAction[Boolean]]
  
  val visible: Boolean
}
object ReadonlyMenuVisibilityCon {
  
  inline def apply(setVisible: SetStateAction[Boolean] => Callback, visible: Boolean): ReadonlyMenuVisibilityCon = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setVisible(t0).runNow()), visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMenuVisibilityCon]
  }
  
  extension [Self <: ReadonlyMenuVisibilityCon](x: Self) {
    
    inline def setSetVisible(value: SetStateAction[Boolean] => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: SetStateAction[Boolean]) => value(t0).runNow()))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
