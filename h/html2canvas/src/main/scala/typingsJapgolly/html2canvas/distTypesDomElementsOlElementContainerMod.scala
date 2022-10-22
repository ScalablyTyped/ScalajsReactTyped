package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLOListElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomElementsOlElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/elements/ol-element-container", "OLElementContainer")
  @js.native
  open class OLElementContainer protected () extends ElementContainer {
    def this(context: Context, element: HTMLOListElement) = this()
    
    val reversed: Boolean = js.native
    
    val start: Double = js.native
  }
}
