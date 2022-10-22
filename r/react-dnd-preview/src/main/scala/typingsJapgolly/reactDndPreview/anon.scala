package typingsJapgolly.reactDndPreview

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.reactDndPreview.distEsmContextMod.PreviewState
import typingsJapgolly.reactDndPreview.distEsmPreviewMod.PreviewGenerator
import typingsJapgolly.reactDndPreview.distEsmPreviewMod.PreviewProps
import typingsJapgolly.reactDndPreview.distEsmUsePreviewMod.usePreviewState
import typingsJapgolly.reactDndPreview.reactDndPreviewBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[T, El /* <: Element */]
    extends StObject
       with PreviewProps[T, El] {
    
    var children: (PreviewGenerator[T, El]) | Node
  }
  object Children {
    
    inline def apply[T, El /* <: Element */](): Children[T, El] = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Children[T, El]]
    }
    
    extension [Self <: Children[?, ?], T, El /* <: Element */](x: Self & (Children[T, El])) {
      
      inline def setChildren(value: (PreviewGenerator[T, El]) | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* state */ PreviewState[T, El] => typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Display
    extends StObject
       with usePreviewState[Any, Any] {
    
    var display: `false`
  }
  object Display {
    
    inline def apply(): Display = {
      val __obj = js.Dynamic.literal(display = false)
      __obj.asInstanceOf[Display]
    }
    
    extension [Self <: Display](x: Self) {
      
      inline def setDisplay(value: `false`): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    }
  }
  
  trait Generator[T, El /* <: Element */]
    extends StObject
       with PreviewProps[T, El] {
    
    var generator: PreviewGenerator[T, El]
  }
  object Generator {
    
    inline def apply[T, El /* <: Element */](generator: /* state */ PreviewState[T, El] => typingsJapgolly.react.mod.global.JSX.Element): Generator[T, El] = {
      val __obj = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
      __obj.asInstanceOf[Generator[T, El]]
    }
    
    extension [Self <: Generator[?, ?], T, El /* <: Element */](x: Self & (Generator[T, El])) {
      
      inline def setGenerator(value: /* state */ PreviewState[T, El] => typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "generator", js.Any.fromFunction1(value))
    }
  }
}
