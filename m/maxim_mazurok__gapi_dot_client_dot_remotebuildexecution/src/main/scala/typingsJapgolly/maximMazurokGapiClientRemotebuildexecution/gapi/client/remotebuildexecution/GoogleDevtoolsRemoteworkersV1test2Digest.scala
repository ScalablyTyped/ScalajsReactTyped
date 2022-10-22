package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2Digest extends StObject {
  
  /** A string-encoded hash (eg "1a2b3c", not the byte array [0x1a, 0x2b, 0x3c]) using an implementation-defined hash algorithm (eg SHA-256). */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the contents. While this is not strictly required as part of an identifier (after all, any given hash will have exactly one canonical size), it's useful in almost all
    * cases when one might want to send or retrieve blobs of content and is included here for this reason.
    */
  var sizeBytes: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2Digest {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2Digest]
  }
  
  extension [Self <: GoogleDevtoolsRemoteworkersV1test2Digest](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
