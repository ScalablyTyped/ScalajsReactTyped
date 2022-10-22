package typingsJapgolly.next.anon

import typingsJapgolly.next.distLibLoadCustomRoutesMod.RouteHas
import typingsJapgolly.next.nextStrings.cookie
import typingsJapgolly.next.nextStrings.header
import typingsJapgolly.next.nextStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with RouteHas {
  
  var key: String
  
  var `type`: header | query | cookie
  
  var value: js.UndefOr[String] = js.undefined
}
object Type {
  
  inline def apply(key: String, `type`: header | query | cookie): Type = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: header | query | cookie): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
