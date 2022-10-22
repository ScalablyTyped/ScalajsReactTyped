package typingsJapgolly.reactDndPreview.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDndPreview.distEsmContextMod.PreviewState
import typingsJapgolly.reactDndPreview.distEsmPreviewMod.PreviewGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  object Children {
    
    inline def apply[T, El /* <: Element */](): Builder[T, El] = {
      val __props = js.Dynamic.literal()
      new Builder[T, El](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactDndPreview.anon.Children[T, El]]))
    }
    
    @JSImport("react-dnd-preview/dist/esm", "Preview")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[T, El /* <: Element */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def children(value: (PreviewGenerator[T, El]) | Node): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenFunction1(value: /* state */ PreviewState[T, El] => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    }
    
    implicit def make[T, El /* <: Element */](companion: Children.type): Builder[T, El] = new Builder[T, El](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps[T, El /* <: Element */](p: typingsJapgolly.reactDndPreview.anon.Children[T, El]): Builder[T, El] = new Builder[T, El](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Generator {
    
    inline def apply[T, El /* <: Element */](generator: /* state */ PreviewState[T, El] => typingsJapgolly.react.mod.global.JSX.Element): Builder[T, El] = {
      val __props = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
      new Builder[T, El](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactDndPreview.anon.Generator[T, El]]))
    }
    
    @JSImport("react-dnd-preview/dist/esm", "Preview")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[T, El /* <: Element */] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object]
    
    def withProps[T, El /* <: Element */](p: typingsJapgolly.reactDndPreview.anon.Generator[T, El]): Builder[T, El] = new Builder[T, El](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
