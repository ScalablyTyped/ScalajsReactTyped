package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashtagData extends StObject {
  
  var searchText: js.UndefOr[String] = js.undefined
}
object HashtagData {
  
  inline def apply(): HashtagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashtagData]
  }
  
  extension [Self <: HashtagData](x: Self) {
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}
