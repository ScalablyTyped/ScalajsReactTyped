package typingsJapgolly.s3UploadStream

import typingsJapgolly.awsSdk.clientsS3Mod.PutObjectRequest
import typingsJapgolly.awsSdk.mod.S3
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(client: S3): S3StreamUploader = ^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any]).asInstanceOf[S3StreamUploader]
  
  @JSImport("s3-upload-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait S3StreamUploader extends StObject {
    
    def upload(destinationDetails: PutObjectRequest): S3WriteStream = js.native
    def upload(destinationDetails: PutObjectRequest, sessionDetails: Any): S3WriteStream = js.native
  }
  
  @js.native
  trait S3WriteStream extends Writable {
    
    def concurrentParts(numberOfParts: Double): Unit = js.native
    
    def maxPartSize(sizeInBytes: Double): Unit = js.native
  }
}
