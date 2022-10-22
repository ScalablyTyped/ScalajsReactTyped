package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** Source name for content indexed by the Indexing API. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Predefined content source for Google Apps. */
  var predefinedSource: js.UndefOr[String] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPredefinedSource(value: String): Self = StObject.set(x, "predefinedSource", value.asInstanceOf[js.Any])
    
    inline def setPredefinedSourceUndefined: Self = StObject.set(x, "predefinedSource", js.undefined)
  }
}
