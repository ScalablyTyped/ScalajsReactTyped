package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLSelectElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomElementsSelectElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/elements/select-element-container", "SelectElementContainer")
  @js.native
  open class SelectElementContainer protected () extends ElementContainer {
    def this(context: Context, element: HTMLSelectElement) = this()
    
    val value: String = js.native
  }
}
