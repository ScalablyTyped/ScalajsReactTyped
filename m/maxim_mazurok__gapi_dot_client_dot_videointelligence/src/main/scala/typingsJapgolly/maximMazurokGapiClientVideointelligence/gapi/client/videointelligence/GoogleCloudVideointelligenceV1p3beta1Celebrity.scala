package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1Celebrity extends StObject {
  
  /** Textual description of additional information about the celebrity, if applicable. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The celebrity name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the celebrity. Have the format `video-intelligence/kg-mid` indicates a celebrity from preloaded gallery. kg-mid is the id in Google knowledge graph, which is
    * unique for the celebrity.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1Celebrity {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1Celebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1Celebrity]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1Celebrity](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
