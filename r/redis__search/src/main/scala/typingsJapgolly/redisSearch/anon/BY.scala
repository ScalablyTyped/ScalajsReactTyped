package typingsJapgolly.redisSearch.anon

import typingsJapgolly.redisSearch.distCommandsMod.PropertyName
import typingsJapgolly.redisSearch.redisSearchStrings.ASC
import typingsJapgolly.redisSearch.redisSearchStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BY extends StObject {
  
  var BY: PropertyName
  
  var DIRECTION: js.UndefOr[ASC | DESC] = js.undefined
}
object BY {
  
  inline def apply(BY: PropertyName): BY = {
    val __obj = js.Dynamic.literal(BY = BY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BY]
  }
  
  extension [Self <: BY](x: Self) {
    
    inline def setBY(value: PropertyName): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
    
    inline def setDIRECTION(value: ASC | DESC): Self = StObject.set(x, "DIRECTION", value.asInstanceOf[js.Any])
    
    inline def setDIRECTIONUndefined: Self = StObject.set(x, "DIRECTION", js.undefined)
  }
}
