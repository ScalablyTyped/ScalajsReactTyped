package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor
import typingsJapgolly.html2canvas.html2canvasInts.`0`
import typingsJapgolly.html2canvas.html2canvasInts.`1`
import typingsJapgolly.html2canvas.html2canvasInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsBackgroundClipMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-clip", "backgroundClip")
  @js.native
  val backgroundClip: IPropertyListDescriptor[BackgroundClip_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.html2canvasInts.`0`
    - typingsJapgolly.html2canvas.html2canvasInts.`1`
    - typingsJapgolly.html2canvas.html2canvasInts.`2`
  */
  trait BACKGROUND_CLIP extends StObject
  object BACKGROUND_CLIP {
    
    inline def BORDER_BOX: `0` = 0.asInstanceOf[`0`]
    
    inline def CONTENT_BOX: `2` = 2.asInstanceOf[`2`]
    
    inline def PADDING_BOX: `1` = 1.asInstanceOf[`1`]
  }
  
  type BackgroundClip_ = js.Array[BACKGROUND_CLIP]
}
