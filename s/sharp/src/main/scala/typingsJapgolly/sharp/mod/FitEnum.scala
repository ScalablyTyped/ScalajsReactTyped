package typingsJapgolly.sharp.mod

import typingsJapgolly.sharp.sharpStrings.contain
import typingsJapgolly.sharp.sharpStrings.cover
import typingsJapgolly.sharp.sharpStrings.fill
import typingsJapgolly.sharp.sharpStrings.inside
import typingsJapgolly.sharp.sharpStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitEnum extends StObject {
  
  var contain: typingsJapgolly.sharp.sharpStrings.contain
  
  var cover: typingsJapgolly.sharp.sharpStrings.cover
  
  var fill: typingsJapgolly.sharp.sharpStrings.fill
  
  var inside: typingsJapgolly.sharp.sharpStrings.inside
  
  var outside: typingsJapgolly.sharp.sharpStrings.outside
}
object FitEnum {
  
  inline def apply(): FitEnum = {
    val __obj = js.Dynamic.literal(contain = "contain", cover = "cover", fill = "fill", inside = "inside", outside = "outside")
    __obj.asInstanceOf[FitEnum]
  }
  
  extension [Self <: FitEnum](x: Self) {
    
    inline def setContain(value: contain): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setCover(value: cover): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setFill(value: fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setInside(value: inside): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    inline def setOutside(value: outside): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
  }
}
