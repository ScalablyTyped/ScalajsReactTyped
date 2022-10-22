package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.mongodbStrings.refineCollectionShardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamRefineCollectionShardKeyDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocumentOperationDescription
     with ChangeStreamDocument[Any] {
  
  /** Describes the type of operation represented in this change notification */
  var operationType: refineCollectionShardKey
}
object ChangeStreamRefineCollectionShardKeyDocument {
  
  inline def apply(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): ChangeStreamRefineCollectionShardKeyDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "refineCollectionShardKey")
    __obj.asInstanceOf[ChangeStreamRefineCollectionShardKeyDocument]
  }
  
  extension [Self <: ChangeStreamRefineCollectionShardKeyDocument](x: Self) {
    
    inline def setOperationType(value: refineCollectionShardKey): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
