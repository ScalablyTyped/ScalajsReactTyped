package typingsJapgolly.firebaseFirestore

import org.scalajs.dom.ReadableStreamReader
import typingsJapgolly.firebaseFirestore.distFirestoreSrcUtilBundleReaderMod.BundleSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcPlatformBrowserByteStreamReaderMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/browser/byte_stream_reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toByteStreamReader(source: BundleSource, bytesPerRead: Double): ReadableStreamReader[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("toByteStreamReader")(source.asInstanceOf[js.Any], bytesPerRead.asInstanceOf[js.Any])).asInstanceOf[ReadableStreamReader[js.typedarray.Uint8Array]]
}
