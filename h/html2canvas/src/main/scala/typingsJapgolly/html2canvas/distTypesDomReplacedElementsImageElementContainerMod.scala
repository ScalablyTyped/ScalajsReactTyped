package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import typingsJapgolly.html2canvas.distTypesDomReplacedElementsMod.ReplacedElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomReplacedElementsImageElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/image-element-container", "ImageElementContainer")
  @js.native
  open class ImageElementContainer protected ()
    extends ElementContainer
       with ReplacedElementContainer {
    def this(context: Context, img: HTMLImageElement) = this()
    
    var intrinsicHeight: Double = js.native
    
    var intrinsicWidth: Double = js.native
    
    var src: String = js.native
  }
}
