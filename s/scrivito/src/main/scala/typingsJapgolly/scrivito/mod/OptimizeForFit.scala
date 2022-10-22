package typingsJapgolly.scrivito.mod

import typingsJapgolly.scrivito.scrivitoStrings.bottom
import typingsJapgolly.scrivito.scrivitoStrings.center
import typingsJapgolly.scrivito.scrivitoStrings.crop
import typingsJapgolly.scrivito.scrivitoStrings.left
import typingsJapgolly.scrivito.scrivitoStrings.right
import typingsJapgolly.scrivito.scrivitoStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeForFit
  extends StObject
     with OptimizeFor
     with OptimizeDefinition {
  
  var crop: center | top | left | right | bottom
  
  var fit: crop
}
object OptimizeForFit {
  
  inline def apply(crop: center | top | left | right | bottom): OptimizeForFit = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], fit = "crop")
    __obj.asInstanceOf[OptimizeForFit]
  }
  
  extension [Self <: OptimizeForFit](x: Self) {
    
    inline def setCrop(value: center | top | left | right | bottom): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setFit(value: crop): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
  }
}
