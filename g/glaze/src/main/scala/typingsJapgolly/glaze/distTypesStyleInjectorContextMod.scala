package typingsJapgolly.glaze

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.glaze.distTypesStyleInjectorMod.StyleInjector
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStyleInjectorContextMod {
  
  @JSImport("glaze/dist-types/StyleInjectorContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("glaze/dist-types/StyleInjectorContext", "StyleInjectorContext")
  @js.native
  val StyleInjectorContext: Context[StyleInjector] = js.native
  
  inline def StyleInjectorProvider(hasChildrenInjector: StyleInjectorProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleInjectorProvider")(hasChildrenInjector.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StyleInjectorProviderProps extends StObject {
    
    var children: Node
    
    var injector: js.UndefOr[StyleInjector] = js.undefined
  }
  object StyleInjectorProviderProps {
    
    inline def apply(): StyleInjectorProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[StyleInjectorProviderProps]
    }
    
    extension [Self <: StyleInjectorProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInjector(value: StyleInjector): Self = StObject.set(x, "injector", value.asInstanceOf[js.Any])
      
      inline def setInjectorUndefined: Self = StObject.set(x, "injector", js.undefined)
    }
  }
}
