package typingsJapgolly.scrivito.mod

import typingsJapgolly.scrivito.scrivitoStrings.bottom
import typingsJapgolly.scrivito.scrivitoStrings.center
import typingsJapgolly.scrivito.scrivitoStrings.left
import typingsJapgolly.scrivito.scrivitoStrings.right
import typingsJapgolly.scrivito.scrivitoStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.scrivito.mod.OptimizeForFit
  - typingsJapgolly.scrivito.mod.OptimizeForResize
*/
trait OptimizeDefinition extends StObject
object OptimizeDefinition {
  
  inline def OptimizeForFit(crop: center | top | left | right | bottom): typingsJapgolly.scrivito.mod.OptimizeForFit = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], fit = "crop")
    __obj.asInstanceOf[typingsJapgolly.scrivito.mod.OptimizeForFit]
  }
  
  inline def OptimizeForResize(): typingsJapgolly.scrivito.mod.OptimizeForResize = {
    val __obj = js.Dynamic.literal(fit = "resize")
    __obj.asInstanceOf[typingsJapgolly.scrivito.mod.OptimizeForResize]
  }
}
