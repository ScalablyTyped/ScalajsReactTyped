package typingsJapgolly.evernote.anon

import typingsJapgolly.evernote.mod.Types.UserIdentityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongIdentifier extends StObject {
  
  var longIdentifier: js.UndefOr[Double] = js.undefined
  
  var stringIdentifier: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[UserIdentityType] = js.undefined
}
object LongIdentifier {
  
  inline def apply(): LongIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongIdentifier]
  }
  
  extension [Self <: LongIdentifier](x: Self) {
    
    inline def setLongIdentifier(value: Double): Self = StObject.set(x, "longIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLongIdentifierUndefined: Self = StObject.set(x, "longIdentifier", js.undefined)
    
    inline def setStringIdentifier(value: String): Self = StObject.set(x, "stringIdentifier", value.asInstanceOf[js.Any])
    
    inline def setStringIdentifierUndefined: Self = StObject.set(x, "stringIdentifier", js.undefined)
    
    inline def setType(value: UserIdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
