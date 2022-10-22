package typingsJapgolly.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contenttype
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var item_id: js.UndefOr[String] = js.undefined
}
object Contenttype {
  
  inline def apply(): Contenttype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contenttype]
  }
  
  extension [Self <: Contenttype](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
    
    inline def setItem_idUndefined: Self = StObject.set(x, "item_id", js.undefined)
  }
}
