package typingsJapgolly.firebaseStorage

import org.scalajs.dom.Blob
import typingsJapgolly.firebaseStorage.distNodeEsmSrcPublicTypesMod.StorageReference
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcApiDotbrowserMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/api.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlob(ref: StorageReference): js.Promise[Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Blob]]
  inline def getBlob(ref: StorageReference, maxDownloadSizeBytes: Double): js.Promise[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlob")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  
  inline def getStream(ref: StorageReference): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  inline def getStream(ref: StorageReference, maxDownloadSizeBytes: Double): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(ref.asInstanceOf[js.Any], maxDownloadSizeBytes.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
}
