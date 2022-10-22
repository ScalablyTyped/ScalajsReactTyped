package typingsJapgolly.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.sharepointStrings.AND
import typingsJapgolly.sharepoint.sharepointStrings.OR
import typingsJapgolly.sharepoint.sharepointStrings.and_
import typingsJapgolly.sharepoint.sharepointStrings.or_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinementCategory extends StObject {
  
  /** Use KQL */
  var k: Boolean
  
  /**  token to display value map */
  var m: StringDictionary[String] | Null
  
  /** Refiner Name (Mapped property) */
  var n: String
  
  var o: String | and_ | or_ | AND | OR
  
  /** Values, prefixed by ǂǂ for taxonomy terms */
  var t: js.Array[String]
}
object RefinementCategory {
  
  inline def apply(k: Boolean, n: String, o: String | and_ | or_ | AND | OR, t: js.Array[String]): RefinementCategory = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], m = null)
    __obj.asInstanceOf[RefinementCategory]
  }
  
  extension [Self <: RefinementCategory](x: Self) {
    
    inline def setK(value: Boolean): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setM(value: StringDictionary[String]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMNull: Self = StObject.set(x, "m", null)
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setO(value: String | and_ | or_ | AND | OR): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setT(value: js.Array[String]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTVarargs(value: String*): Self = StObject.set(x, "t", js.Array(value*))
  }
}
