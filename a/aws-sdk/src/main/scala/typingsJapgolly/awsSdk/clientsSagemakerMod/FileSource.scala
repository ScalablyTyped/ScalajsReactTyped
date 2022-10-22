package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSource extends StObject {
  
  /**
    * The digest of the file source.
    */
  var ContentDigest: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ContentDigest] = js.undefined
  
  /**
    * The type of content stored in the file source.
    */
  var ContentType: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ContentType] = js.undefined
  
  /**
    * The Amazon S3 URI for the file source.
    */
  var S3Uri: typingsJapgolly.awsSdk.clientsSagemakerMod.S3Uri
}
object FileSource {
  
  inline def apply(S3Uri: S3Uri): FileSource = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSource]
  }
  
  extension [Self <: FileSource](x: Self) {
    
    inline def setContentDigest(value: ContentDigest): Self = StObject.set(x, "ContentDigest", value.asInstanceOf[js.Any])
    
    inline def setContentDigestUndefined: Self = StObject.set(x, "ContentDigest", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
