package typingsJapgolly.reactDndPreview

import org.scalajs.dom.Element
import typingsJapgolly.reactDndPreview.distEsmUsePreviewMod.usePreviewStateContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContextMod {
  
  @JSImport("react-dnd-preview/dist/esm/Context", "Context")
  @js.native
  val Context: typingsJapgolly.react.mod.Context[js.UndefOr[PreviewState[Any, Element]]] = js.native
  
  type PreviewState[T, El /* <: Element */] = usePreviewStateContent[T, El]
}
