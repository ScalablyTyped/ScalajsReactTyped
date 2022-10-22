package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyIdentValueDescriptor
import typingsJapgolly.html2canvas.html2canvasStrings.italic
import typingsJapgolly.html2canvas.html2canvasStrings.normal
import typingsJapgolly.html2canvas.html2canvasStrings.oblique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsFontStyleMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/font-style", "fontStyle")
  @js.native
  val fontStyle: IPropertyIdentValueDescriptor[FONT_STYLE] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.html2canvasStrings.normal
    - typingsJapgolly.html2canvas.html2canvasStrings.italic
    - typingsJapgolly.html2canvas.html2canvasStrings.oblique
  */
  trait FONT_STYLE extends StObject
  object FONT_STYLE {
    
    inline def ITALIC: italic = "italic".asInstanceOf[italic]
    
    inline def NORMAL: normal = "normal".asInstanceOf[normal]
    
    inline def OBLIQUE: oblique = "oblique".asInstanceOf[oblique]
  }
}
