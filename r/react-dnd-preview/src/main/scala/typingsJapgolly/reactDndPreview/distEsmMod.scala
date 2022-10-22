package typingsJapgolly.reactDndPreview

import org.scalajs.dom.Element
import typingsJapgolly.reactDndPreview.distEsmContextMod.PreviewState
import typingsJapgolly.reactDndPreview.distEsmPreviewMod.PreviewProps
import typingsJapgolly.reactDndPreview.distEsmUsePreviewMod.usePreviewState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("react-dnd-preview/dist/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd-preview/dist/esm", "Context")
  @js.native
  val Context: typingsJapgolly.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  inline def Preview[T, El /* <: Element */](props: PreviewProps[T, El]): typingsJapgolly.react.mod.global.JSX.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Preview")(props.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element | Null]
  
  inline def usePreview[T, El /* <: Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
}
