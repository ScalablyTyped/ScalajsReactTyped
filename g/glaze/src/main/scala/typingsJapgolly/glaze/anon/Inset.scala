package typingsJapgolly.glaze.anon

import typingsJapgolly.glaze.glazeStrings.bottom
import typingsJapgolly.glaze.glazeStrings.height
import typingsJapgolly.glaze.glazeStrings.left
import typingsJapgolly.glaze.glazeStrings.marginBottom
import typingsJapgolly.glaze.glazeStrings.marginLeft
import typingsJapgolly.glaze.glazeStrings.marginRight
import typingsJapgolly.glaze.glazeStrings.marginTop
import typingsJapgolly.glaze.glazeStrings.paddingBottom
import typingsJapgolly.glaze.glazeStrings.paddingLeft
import typingsJapgolly.glaze.glazeStrings.paddingRight
import typingsJapgolly.glaze.glazeStrings.paddingTop
import typingsJapgolly.glaze.glazeStrings.right
import typingsJapgolly.glaze.glazeStrings.top
import typingsJapgolly.glaze.glazeStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inset extends StObject {
  
  val inset: js.Tuple4[top, right, bottom, left]
  
  val insetX: js.Tuple2[left, right]
  
  val insetY: js.Tuple2[top, bottom]
  
  val marginX: js.Tuple2[marginLeft, marginRight]
  
  val marginY: js.Tuple2[marginTop, marginBottom]
  
  val paddingX: js.Tuple2[paddingLeft, paddingRight]
  
  val paddingY: js.Tuple2[paddingTop, paddingBottom]
  
  val size: js.Tuple2[width, height]
}
object Inset {
  
  inline def apply(
    inset: js.Tuple4[top, right, bottom, left],
    insetX: js.Tuple2[left, right],
    insetY: js.Tuple2[top, bottom],
    marginX: js.Tuple2[marginLeft, marginRight],
    marginY: js.Tuple2[marginTop, marginBottom],
    paddingX: js.Tuple2[paddingLeft, paddingRight],
    paddingY: js.Tuple2[paddingTop, paddingBottom],
    size: js.Tuple2[width, height]
  ): Inset = {
    val __obj = js.Dynamic.literal(inset = inset.asInstanceOf[js.Any], insetX = insetX.asInstanceOf[js.Any], insetY = insetY.asInstanceOf[js.Any], marginX = marginX.asInstanceOf[js.Any], marginY = marginY.asInstanceOf[js.Any], paddingX = paddingX.asInstanceOf[js.Any], paddingY = paddingY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inset]
  }
  
  extension [Self <: Inset](x: Self) {
    
    inline def setInset(value: js.Tuple4[top, right, bottom, left]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetX(value: js.Tuple2[left, right]): Self = StObject.set(x, "insetX", value.asInstanceOf[js.Any])
    
    inline def setInsetY(value: js.Tuple2[top, bottom]): Self = StObject.set(x, "insetY", value.asInstanceOf[js.Any])
    
    inline def setMarginX(value: js.Tuple2[marginLeft, marginRight]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
    
    inline def setMarginY(value: js.Tuple2[marginTop, marginBottom]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
    
    inline def setPaddingX(value: js.Tuple2[paddingLeft, paddingRight]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    inline def setPaddingY(value: js.Tuple2[paddingTop, paddingBottom]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Tuple2[width, height]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
