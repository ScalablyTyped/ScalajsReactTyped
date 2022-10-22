package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.anon.Coll
import typingsJapgolly.mongodb.mongodbStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamRenameDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocumentCollectionUUID
     with ChangeStreamDocument[Any] {
  
  /** The "from" namespace that the rename occured on */
  var ns: ChangeStreamNameSpace
  
  /** Describes the type of operation represented in this change notification */
  var operationType: rename
  
  /** The new name for the `ns.coll` collection */
  var to: Coll
}
object ChangeStreamRenameDocument {
  
  inline def apply(
    _id: ResumeToken,
    collectionUUID: typingsJapgolly.bson.mod.Binary,
    ns: ChangeStreamNameSpace,
    to: Coll
  ): ChangeStreamRenameDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "rename", to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamRenameDocument]
  }
  
  extension [Self <: ChangeStreamRenameDocument](x: Self) {
    
    inline def setNs(value: ChangeStreamNameSpace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: rename): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Coll): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
