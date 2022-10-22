package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor
import typingsJapgolly.html2canvas.html2canvasInts.`0`
import typingsJapgolly.html2canvas.html2canvasInts.`1`
import typingsJapgolly.html2canvas.html2canvasInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsPaintOrderMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/paint-order", "paintOrder")
  @js.native
  val paintOrder: IPropertyListDescriptor[PaintOrder_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.html2canvasInts.`0`
    - typingsJapgolly.html2canvas.html2canvasInts.`1`
    - typingsJapgolly.html2canvas.html2canvasInts.`2`
  */
  trait PAINT_ORDER_LAYER extends StObject
  object PAINT_ORDER_LAYER {
    
    inline def FILL: `0` = 0.asInstanceOf[`0`]
    
    inline def MARKERS: `2` = 2.asInstanceOf[`2`]
    
    inline def STROKE: `1` = 1.asInstanceOf[`1`]
  }
  
  type PaintOrder_ = js.Array[PAINT_ORDER_LAYER]
}
