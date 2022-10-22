package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typingsJapgolly.node.utilMod.TextDecoder
import typingsJapgolly.node.utilMod.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcPlatformNodeSerializerMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/platform/node/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = ^.asInstanceOf[js.Dynamic].applyDynamic("newSerializer")(databaseId.asInstanceOf[js.Any]).asInstanceOf[JsonProtoSerializer]
  
  inline def newTextDecoder(): TextDecoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextDecoder")().asInstanceOf[TextDecoder]
  
  inline def newTextEncoder(): TextEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextEncoder")().asInstanceOf[TextEncoder]
}
