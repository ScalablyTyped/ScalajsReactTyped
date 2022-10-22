package typingsJapgolly.watsonDeveloperCloud.naturalLanguageClassifierV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response from the classifier for multiple phrases. */
trait ClassificationCollection extends StObject {
  
  /** Unique identifier for this classifier. */
  var classifier_id: js.UndefOr[String] = js.undefined
  
  /** An array of classifier responses for each submitted phrase. */
  var collection: js.UndefOr[js.Array[CollectionItem]] = js.undefined
  
  /** Link to the classifier. */
  var url: js.UndefOr[String] = js.undefined
}
object ClassificationCollection {
  
  inline def apply(): ClassificationCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationCollection]
  }
  
  extension [Self <: ClassificationCollection](x: Self) {
    
    inline def setClassifier_id(value: String): Self = StObject.set(x, "classifier_id", value.asInstanceOf[js.Any])
    
    inline def setClassifier_idUndefined: Self = StObject.set(x, "classifier_id", js.undefined)
    
    inline def setCollection(value: js.Array[CollectionItem]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setCollectionVarargs(value: CollectionItem*): Self = StObject.set(x, "collection", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
