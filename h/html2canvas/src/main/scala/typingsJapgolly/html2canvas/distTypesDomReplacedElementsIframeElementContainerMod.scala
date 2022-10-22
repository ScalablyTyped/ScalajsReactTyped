package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesCssTypesColorMod.Color_
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomReplacedElementsIframeElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/iframe-element-container", "IFrameElementContainer")
  @js.native
  open class IFrameElementContainer protected () extends ElementContainer {
    def this(context: Context, iframe: HTMLIFrameElement) = this()
    
    var backgroundColor: Color_ = js.native
    
    var height: Double = js.native
    
    var src: String = js.native
    
    var tree: js.UndefOr[ElementContainer] = js.native
    
    var width: Double = js.native
  }
}
