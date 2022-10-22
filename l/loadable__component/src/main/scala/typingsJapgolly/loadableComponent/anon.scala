package typingsJapgolly.loadableComponent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.loadableComponent.mod.LoadableLibrary
import typingsJapgolly.loadableComponent.mod.OptionsWithoutResolver
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[Module] extends StObject {
    
    var children: js.UndefOr[js.Function1[/* module */ Module, Node]] = js.undefined
    
    var fallback: js.UndefOr[Element] = js.undefined
    
    var ref: js.UndefOr[Ref[Module]] = js.undefined
  }
  object Children {
    
    inline def apply[Module](): Children[Module] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[Module]]
    }
    
    extension [Self <: Children[?], Module](x: Self & Children[Module]) {
      
      inline def setChildren(value: /* module */ Module => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFallback(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setRef(value: Ref[Module]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Module | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Module | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Default[Component /* <: ComponentClassP[Any & js.Object] */] extends StObject {
    
    var default: Component
  }
  object Default {
    
    inline def apply[Component /* <: ComponentClassP[Any & js.Object] */](default: Component): Default[Component] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[Component]]
    }
    
    extension [Self <: Default[?], Component /* <: ComponentClassP[Any & js.Object] */](x: Self & Default[Component]) {
      
      inline def setDefault(value: Component): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[Props, Module](loadFn: js.Function1[/* props */ Props, js.Promise[Module]]): LoadableLibrary[Module] = js.native
    def apply[Props, Module](
      loadFn: js.Function1[/* props */ Props, js.Promise[Module]],
      options: OptionsWithoutResolver[Props]
    ): LoadableLibrary[Module] = js.native
  }
}
