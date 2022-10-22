package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisSearch.distCommandsMod.PropertyName
import typingsJapgolly.redisSearch.redisSearchStrings.ASC
import typingsJapgolly.redisSearch.redisSearchStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: js.UndefOr[ASC | DESC] = js.undefined
  
  var property: PropertyName
}
object Direction {
  
  inline def apply(property: PropertyName): Direction = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: ASC | DESC): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setProperty(value: PropertyName): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
