package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.gestaltStrings.darkWash
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.lightWash
import typingsJapgolly.gestalt.gestaltStrings.neutral
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadgeObject extends StObject {
  
  var text: String
  
  var `type`: js.UndefOr[info | error | warning | success | neutral | darkWash | lightWash] = js.undefined
}
object BadgeObject {
  
  inline def apply(text: String): BadgeObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeObject]
  }
  
  extension [Self <: BadgeObject](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: info | error | warning | success | neutral | darkWash | lightWash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
