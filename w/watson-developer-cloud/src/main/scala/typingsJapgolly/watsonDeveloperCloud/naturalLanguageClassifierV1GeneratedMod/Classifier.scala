package typingsJapgolly.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A classifier for natural language phrases. */
trait Classifier extends StObject {
  
  /** Unique identifier for this classifier. */
  var classifier_id: String
  
  /** Date and time (UTC) the classifier was created. */
  var created: js.UndefOr[String] = js.undefined
  
  /** The language used for the classifier. */
  var language: js.UndefOr[String] = js.undefined
  
  /** User-supplied name for the classifier. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The state of the classifier. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Additional detail about the status. */
  var status_description: js.UndefOr[String] = js.undefined
  
  /** Link to the classifier. */
  var url: String
}
object Classifier {
  
  inline def apply(classifier_id: String, url: String): Classifier = {
    val __obj = js.Dynamic.literal(classifier_id = classifier_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
  
  extension [Self <: Classifier](x: Self) {
    
    inline def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatus_description(value: String): Self = StObject.set(x, "status_description", value.asInstanceOf[js.Any])
    
    inline def setStatus_descriptionUndefined: Self = StObject.set(x, "status_description", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
