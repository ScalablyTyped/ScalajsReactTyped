package typingsJapgolly.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localIndexeddbSchemaMod {
  type DbClientMetadataKey = java.lang.String
  type DbCollectionParentKey = js.Tuple2[
    java.lang.String, 
    typingsJapgolly.firebaseFirestore.localEncodedResourcePathMod.EncodedResourcePath
  ]
  type DbDocumentMutationKey = js.Tuple3[
    java.lang.String, 
    typingsJapgolly.firebaseFirestore.localEncodedResourcePathMod.EncodedResourcePath, 
    typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId
  ]
  type DbMutationBatchKey = typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId
  type DbMutationQueueKey = java.lang.String
  type DbPrimaryClientKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbPrimaryClient.key */ js.Any
  type DbQuery = typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.QueryTarget | typingsJapgolly.firebaseFirestore.firestoreProtoApiMod.DocumentsTarget
  type DbRemoteDocumentGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbRemoteDocumentGlobal.key */ js.Any
  type DbRemoteDocumentKey = js.Array[java.lang.String]
  type DbTargetDocumentKey = js.Tuple2[
    typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId, 
    typingsJapgolly.firebaseFirestore.localEncodedResourcePathMod.EncodedResourcePath
  ]
  type DbTargetGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbTargetGlobal.key */ js.Any
  type DbTargetKey = typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId
  type DbTimestampKey = js.Tuple2[/* seconds */ scala.Double, /* nanos */ scala.Double]
}
