package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typingsJapgolly.html2canvas.distTypesDomReplacedElementsMod.ReplacedElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomReplacedElementsCanvasElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/canvas-element-container", "CanvasElementContainer")
  @js.native
  open class CanvasElementContainer protected ()
    extends ElementContainer
       with ReplacedElementContainer {
    def this(context: Context, canvas: HTMLCanvasElement) = this()
    
    var canvas: HTMLCanvasElement = js.native
    
    var intrinsicHeight: Double = js.native
    
    var intrinsicWidth: Double = js.native
  }
}
