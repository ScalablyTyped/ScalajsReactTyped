package typingsJapgolly.rcMenu

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcMenu.anon.Active
import typingsJapgolly.rcMenu.anon.Selected
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextPrivateContextMod extends Shortcut {
  
  @JSImport("rc-menu/es/context/PrivateContext", JSImport.Default)
  @js.native
  val default: Context[PrivateContextProps] = js.native
  
  trait PrivateContextProps extends StObject {
    
    var _internalRenderMenuItem: js.UndefOr[
        js.Function3[/* originNode */ Element, /* menuItemProps */ Any, /* stateProps */ Selected, Element]
      ] = js.undefined
    
    var _internalRenderSubMenuItem: js.UndefOr[
        js.Function3[/* originNode */ Element, /* subMenuItemProps */ Any, /* stateProps */ Active, Element]
      ] = js.undefined
  }
  object PrivateContextProps {
    
    inline def apply(): PrivateContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrivateContextProps]
    }
    
    extension [Self <: PrivateContextProps](x: Self) {
      
      inline def set_internalRenderMenuItem(value: (/* originNode */ Element, /* menuItemProps */ Any, /* stateProps */ Selected) => Element): Self = StObject.set(x, "_internalRenderMenuItem", js.Any.fromFunction3(value))
      
      inline def set_internalRenderMenuItemUndefined: Self = StObject.set(x, "_internalRenderMenuItem", js.undefined)
      
      inline def set_internalRenderSubMenuItem(value: (/* originNode */ Element, /* subMenuItemProps */ Any, /* stateProps */ Active) => Element): Self = StObject.set(x, "_internalRenderSubMenuItem", js.Any.fromFunction3(value))
      
      inline def set_internalRenderSubMenuItemUndefined: Self = StObject.set(x, "_internalRenderSubMenuItem", js.undefined)
    }
  }
  
  type _To = Context[PrivateContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextPrivateContextMod.foo` */
  override def _to: Context[PrivateContextProps] = default
}
