package typingsJapgolly.reactDndPreview

import org.scalajs.dom.Element
import typingsJapgolly.reactDndPreview.distEsmContextMod.PreviewState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmPreviewMod {
  
  @JSImport("react-dnd-preview/dist/esm/Preview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Preview[T, El /* <: Element */](props: PreviewProps[T, El]): typingsJapgolly.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Preview")(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element | Null]
  
  type PreviewGenerator[T, El /* <: Element */] = js.Function1[/* state */ PreviewState[T, El], typingsJapgolly.react.mod.global.JSX.Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactDndPreview.anon.Children[T, El]
    - typingsJapgolly.reactDndPreview.anon.Generator[T, El]
  */
  trait PreviewProps[T, El /* <: Element */] extends StObject
  object PreviewProps {
    
    inline def Children[T, El /* <: Element */](): typingsJapgolly.reactDndPreview.anon.Children[T, El] = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[typingsJapgolly.reactDndPreview.anon.Children[T, El]]
    }
    
    inline def Generator[T, El /* <: Element */](generator: /* state */ PreviewState[T, El] => typingsJapgolly.react.mod.global.JSX.Element): typingsJapgolly.reactDndPreview.anon.Generator[T, El] = {
      val __obj = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
      __obj.asInstanceOf[typingsJapgolly.reactDndPreview.anon.Generator[T, El]]
    }
  }
}
