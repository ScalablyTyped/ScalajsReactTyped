package typingsJapgolly.glaze.anon

import typingsJapgolly.glaze.glazeStrings.background
import typingsJapgolly.glaze.glazeStrings.margin
import typingsJapgolly.glaze.glazeStrings.marginBottom
import typingsJapgolly.glaze.glazeStrings.marginLeft
import typingsJapgolly.glaze.glazeStrings.marginRight
import typingsJapgolly.glaze.glazeStrings.marginTop
import typingsJapgolly.glaze.glazeStrings.marginX
import typingsJapgolly.glaze.glazeStrings.marginY
import typingsJapgolly.glaze.glazeStrings.padding
import typingsJapgolly.glaze.glazeStrings.paddingBottom
import typingsJapgolly.glaze.glazeStrings.paddingLeft
import typingsJapgolly.glaze.glazeStrings.paddingRight
import typingsJapgolly.glaze.glazeStrings.paddingTop
import typingsJapgolly.glaze.glazeStrings.paddingX
import typingsJapgolly.glaze.glazeStrings.paddingY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bg extends StObject {
  
  val bg: background
  
  val m: margin
  
  val mb: marginBottom
  
  val ml: marginLeft
  
  val mr: marginRight
  
  val mt: marginTop
  
  val mx: marginX
  
  val my: marginY
  
  val p: padding
  
  val pb: paddingBottom
  
  val pl: paddingLeft
  
  val pr: paddingRight
  
  val pt: paddingTop
  
  val px: paddingX
  
  val py: paddingY
}
object Bg {
  
  inline def apply(): Bg = {
    val __obj = js.Dynamic.literal(bg = "background", m = "margin", mb = "marginBottom", ml = "marginLeft", mr = "marginRight", mt = "marginTop", mx = "marginX", my = "marginY", p = "padding", pb = "paddingBottom", pl = "paddingLeft", pr = "paddingRight", pt = "paddingTop", px = "paddingX", py = "paddingY")
    __obj.asInstanceOf[Bg]
  }
  
  extension [Self <: Bg](x: Self) {
    
    inline def setBg(value: background): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setM(value: margin): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMb(value: marginBottom): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMl(value: marginLeft): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMr(value: marginRight): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    inline def setMt(value: marginTop): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMx(value: marginX): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
    
    inline def setMy(value: marginY): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    inline def setP(value: padding): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPb(value: paddingBottom): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    inline def setPl(value: paddingLeft): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setPr(value: paddingRight): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPt(value: paddingTop): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setPx(value: paddingX): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    inline def setPy(value: paddingY): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
  }
}
