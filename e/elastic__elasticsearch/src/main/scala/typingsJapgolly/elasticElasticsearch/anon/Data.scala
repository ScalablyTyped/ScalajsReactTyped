package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecuritySuggestUserProfilesHint
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var hint: js.UndefOr[SecuritySuggestUserProfilesHint] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[long] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: String | js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHint(value: SecuritySuggestUserProfilesHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
