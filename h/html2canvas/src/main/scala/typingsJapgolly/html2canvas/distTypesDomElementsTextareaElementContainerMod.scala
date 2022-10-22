package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomElementsTextareaElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/elements/textarea-element-container", "TextareaElementContainer")
  @js.native
  open class TextareaElementContainer protected () extends ElementContainer {
    def this(context: Context, element: HTMLTextAreaElement) = this()
    
    val value: String = js.native
  }
}
