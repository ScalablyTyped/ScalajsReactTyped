package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.ReadableStream
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.BundleElement
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcUtilBundleReaderMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/bundle_reader", "SizedBundleElement")
  @js.native
  open class SizedBundleElement protected () extends StObject {
    def this(payload: BundleElement, byteLength: Double) = this()
    
    val byteLength: Double = js.native
    
    def isBundleMetadata(): Boolean = js.native
    
    val payload: BundleElement = js.native
  }
  
  trait BundleReader extends StObject {
    
    def close(): js.Promise[Unit]
    
    /**
      * Returns the metadata of the bundle.
      */
    def getMetadata(): js.Promise[BundleMetadata]
    
    /**
      * Returns the next BundleElement (together with its byte size in the bundle)
      * that has not been read from underlying ReadableStream. Returns null if we
      * have reached the end of the stream.
      */
    def nextElement(): js.Promise[SizedBundleElement | Null]
    
    var serializer: JsonProtoSerializer
  }
  object BundleReader {
    
    inline def apply(
      close: CallbackTo[js.Promise[Unit]],
      getMetadata: CallbackTo[js.Promise[BundleMetadata]],
      nextElement: CallbackTo[js.Promise[SizedBundleElement | Null]],
      serializer: JsonProtoSerializer
    ): BundleReader = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, getMetadata = getMetadata.toJsFn, nextElement = nextElement.toJsFn, serializer = serializer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleReader]
    }
    
    extension [Self <: BundleReader](x: Self) {
      
      inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setGetMetadata(value: CallbackTo[js.Promise[BundleMetadata]]): Self = StObject.set(x, "getMetadata", value.toJsFn)
      
      inline def setNextElement(value: CallbackTo[js.Promise[SizedBundleElement | Null]]): Self = StObject.set(x, "nextElement", value.toJsFn)
      
      inline def setSerializer(value: JsonProtoSerializer): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    }
  }
  
  type BundleSource = ReadableStream[js.typedarray.Uint8Array] | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array
}
