package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import typingsJapgolly.mongodb.anon.Coll
import typingsJapgolly.mongodb.anon.DictshardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mod.ChangeStreamInsertDocument[TSchema]
  - typingsJapgolly.mongodb.mod.ChangeStreamUpdateDocument[TSchema]
  - typingsJapgolly.mongodb.mod.ChangeStreamReplaceDocument[TSchema]
  - typingsJapgolly.mongodb.mod.ChangeStreamDeleteDocument[TSchema]
  - typingsJapgolly.mongodb.mod.ChangeStreamDropDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamRenameDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamDropDatabaseDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamInvalidateDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamCreateIndexDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamCreateDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamCollModDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamDropIndexDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamShardCollectionDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamReshardCollectionDocument
  - typingsJapgolly.mongodb.mod.ChangeStreamRefineCollectionShardKeyDocument
*/
trait ChangeStreamDocument[TSchema /* <: Document */] extends StObject
object ChangeStreamDocument {
  
  inline def ChangeStreamCollModDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): typingsJapgolly.mongodb.mod.ChangeStreamCollModDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "modify")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamCollModDocument]
  }
  
  inline def ChangeStreamCreateDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): typingsJapgolly.mongodb.mod.ChangeStreamCreateDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "create")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamCreateDocument]
  }
  
  inline def ChangeStreamCreateIndexDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): typingsJapgolly.mongodb.mod.ChangeStreamCreateIndexDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "createIndexes")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamCreateIndexDocument]
  }
  
  inline def ChangeStreamDeleteDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typingsJapgolly.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    ns: ChangeStreamNameSpace
  ): typingsJapgolly.mongodb.mod.ChangeStreamDeleteDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "delete")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamDeleteDocument[TSchema]]
  }
  
  inline def ChangeStreamDropDatabaseDocument(_id: ResumeToken, ns: typingsJapgolly.mongodb.anon.Db): typingsJapgolly.mongodb.mod.ChangeStreamDropDatabaseDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "dropDatabase")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamDropDatabaseDocument]
  }
  
  inline def ChangeStreamDropDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary, ns: ChangeStreamNameSpace): typingsJapgolly.mongodb.mod.ChangeStreamDropDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "drop")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamDropDocument]
  }
  
  inline def ChangeStreamDropIndexDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): typingsJapgolly.mongodb.mod.ChangeStreamDropIndexDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "dropIndexes")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamDropIndexDocument]
  }
  
  inline def ChangeStreamInsertDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typingsJapgolly.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    fullDocument: TSchema,
    ns: ChangeStreamNameSpace
  ): typingsJapgolly.mongodb.mod.ChangeStreamInsertDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "insert")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamInsertDocument[TSchema]]
  }
  
  inline def ChangeStreamInvalidateDocument(_id: ResumeToken): typingsJapgolly.mongodb.mod.ChangeStreamInvalidateDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], operationType = "invalidate")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamInvalidateDocument]
  }
  
  inline def ChangeStreamRefineCollectionShardKeyDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): typingsJapgolly.mongodb.mod.ChangeStreamRefineCollectionShardKeyDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "refineCollectionShardKey")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamRefineCollectionShardKeyDocument]
  }
  
  inline def ChangeStreamRenameDocument(
    _id: ResumeToken,
    collectionUUID: typingsJapgolly.bson.mod.Binary,
    ns: ChangeStreamNameSpace,
    to: Coll
  ): typingsJapgolly.mongodb.mod.ChangeStreamRenameDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "rename", to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamRenameDocument]
  }
  
  inline def ChangeStreamReplaceDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    documentKey: DictshardKey[TSchema],
    fullDocument: TSchema,
    ns: ChangeStreamNameSpace
  ): typingsJapgolly.mongodb.mod.ChangeStreamReplaceDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], fullDocument = fullDocument.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "replace")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamReplaceDocument[TSchema]]
  }
  
  inline def ChangeStreamReshardCollectionDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): typingsJapgolly.mongodb.mod.ChangeStreamReshardCollectionDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "reshardCollection")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamReshardCollectionDocument]
  }
  
  inline def ChangeStreamShardCollectionDocument(_id: ResumeToken, collectionUUID: typingsJapgolly.bson.mod.Binary): typingsJapgolly.mongodb.mod.ChangeStreamShardCollectionDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], operationType = "shardCollection")
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamShardCollectionDocument]
  }
  
  inline def ChangeStreamUpdateDocument[TSchema /* <: Document */](
    _id: ResumeToken,
    collectionUUID: typingsJapgolly.bson.mod.Binary,
    documentKey: DictshardKey[TSchema],
    ns: ChangeStreamNameSpace,
    updateDescription: UpdateDescription[TSchema]
  ): typingsJapgolly.mongodb.mod.ChangeStreamUpdateDocument[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], collectionUUID = collectionUUID.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "update", updateDescription = updateDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mongodb.mod.ChangeStreamUpdateDocument[TSchema]]
  }
}
