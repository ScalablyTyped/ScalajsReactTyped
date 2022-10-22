package typingsJapgolly.reactMdMenu.typesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuHookReturnValue extends StObject {
  
  /**
    * A ref containing the menu DivHTMLElement if you need access to it for your
    * use case.
    */
  var menuNodeRef: RefHandle[HTMLDivElement]
  
  /**
    * An object of props that should be provided to the {@link Menu} component.
    */
  var menuProps: ProvidedMenuProps
  
  /**
    * Maybe don't need to provide.
    */
  var menuRef: Ref[HTMLDivElement]
}
object BaseMenuHookReturnValue {
  
  inline def apply(menuNodeRef: RefHandle[HTMLDivElement], menuProps: ProvidedMenuProps): BaseMenuHookReturnValue = {
    val __obj = js.Dynamic.literal(menuNodeRef = menuNodeRef.asInstanceOf[js.Any], menuProps = menuProps.asInstanceOf[js.Any], menuRef = null)
    __obj.asInstanceOf[BaseMenuHookReturnValue]
  }
  
  extension [Self <: BaseMenuHookReturnValue](x: Self) {
    
    inline def setMenuNodeRef(value: RefHandle[HTMLDivElement]): Self = StObject.set(x, "menuNodeRef", value.asInstanceOf[js.Any])
    
    inline def setMenuProps(value: ProvidedMenuProps): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
    
    inline def setMenuRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
    
    inline def setMenuRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "menuRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def setMenuRefNull: Self = StObject.set(x, "menuRef", null)
  }
}
