package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.mongodbStrings.reshardCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamReshardCollectionDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocumentOperationDescription
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: reshardCollection
}
object ChangeStreamReshardCollectionDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): ChangeStreamReshardCollectionDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "reshardCollection")
    __obj.asInstanceOf[ChangeStreamReshardCollectionDocument]
  }
  
  extension [Self <: ChangeStreamReshardCollectionDocument](x: Self) {
    
    inline def setOperationType(value: reshardCollection): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
