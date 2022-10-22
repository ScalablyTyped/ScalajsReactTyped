package typingsJapgolly.gestalt.anon

import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.neutral
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var text: String
  
  var `type`: js.UndefOr[info | error | warning | success | neutral] = js.undefined
}
object Text {
  
  inline def apply(text: String): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: info | error | warning | success | neutral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
