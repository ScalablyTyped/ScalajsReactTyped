package typingsJapgolly.sharp.mod

import typingsJapgolly.sharp.sharpStrings.cubic
import typingsJapgolly.sharp.sharpStrings.lanczos2
import typingsJapgolly.sharp.sharpStrings.lanczos3
import typingsJapgolly.sharp.sharpStrings.mitchell
import typingsJapgolly.sharp.sharpStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelEnum extends StObject {
  
  var cubic: typingsJapgolly.sharp.sharpStrings.cubic
  
  var lanczos2: typingsJapgolly.sharp.sharpStrings.lanczos2
  
  var lanczos3: typingsJapgolly.sharp.sharpStrings.lanczos3
  
  var mitchell: typingsJapgolly.sharp.sharpStrings.mitchell
  
  var nearest: typingsJapgolly.sharp.sharpStrings.nearest
}
object KernelEnum {
  
  inline def apply(): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = "cubic", lanczos2 = "lanczos2", lanczos3 = "lanczos3", mitchell = "mitchell", nearest = "nearest")
    __obj.asInstanceOf[KernelEnum]
  }
  
  extension [Self <: KernelEnum](x: Self) {
    
    inline def setCubic(value: cubic): Self = StObject.set(x, "cubic", value.asInstanceOf[js.Any])
    
    inline def setLanczos2(value: lanczos2): Self = StObject.set(x, "lanczos2", value.asInstanceOf[js.Any])
    
    inline def setLanczos3(value: lanczos3): Self = StObject.set(x, "lanczos3", value.asInstanceOf[js.Any])
    
    inline def setMitchell(value: mitchell): Self = StObject.set(x, "mitchell", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
