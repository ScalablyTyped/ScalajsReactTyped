package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import typingsJapgolly.mongodb.anon.DictshardKey
import typingsJapgolly.mongodb.mongodbStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDeleteDocument[TSchema /* <: Document */]
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentKey[TSchema]
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocument[TSchema] {
  
  /**
    * Contains the pre-image of the modified or deleted document if the
    * pre-image is available for the change event and either 'required' or
    * 'whenAvailable' was specified for the 'fullDocumentBeforeChange' option
    * when creating the change stream. If 'whenAvailable' was specified but the
    * pre-image is unavailable, this will be explicitly set to null.
    */
  var fullDocumentBeforeChange: js.UndefOr[TSchema] = js.undefined
  
  /** Namespace the delete event occured on */
  var ns: ChangeStreamNameSpace
  
  /** Describes the type of operation represented in this change notification */
  var operationType: delete
}
object ChangeStreamDeleteDocument {
  
  inline def apply[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typingsJapgolly.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    ns: ChangeStreamNameSpace
  ): ChangeStreamDeleteDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "delete")
    __obj.asInstanceOf[ChangeStreamDeleteDocument[TSchema]]
  }
  
  extension [Self <: ChangeStreamDeleteDocument[?], TSchema /* <: Document */](x: Self & ChangeStreamDeleteDocument[TSchema]) {
    
    inline def setFullDocumentBeforeChange(value: TSchema): Self = StObject.set(x, "fullDocumentBeforeChange", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChangeUndefined: Self = StObject.set(x, "fullDocumentBeforeChange", js.undefined)
    
    inline def setNs(value: ChangeStreamNameSpace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: delete): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
