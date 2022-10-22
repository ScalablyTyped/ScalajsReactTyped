package typingsJapgolly.html2canvas

import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typingsJapgolly.html2canvas.distTypesDomReplacedElementsMod.ReplacedElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomReplacedElementsSvgElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/svg-element-container", "SVGElementContainer")
  @js.native
  open class SVGElementContainer protected ()
    extends ElementContainer
       with ReplacedElementContainer {
    def this(context: Context, img: SVGSVGElement) = this()
    
    var intrinsicHeight: Double = js.native
    
    var intrinsicWidth: Double = js.native
    
    var svg: String = js.native
  }
}
