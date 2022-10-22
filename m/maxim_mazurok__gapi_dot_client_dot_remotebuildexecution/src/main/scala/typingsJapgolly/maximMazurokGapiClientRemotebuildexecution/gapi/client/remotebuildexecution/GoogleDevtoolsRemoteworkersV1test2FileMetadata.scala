package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2FileMetadata extends StObject {
  
  /** If the file is small enough, its contents may also or alternatively be listed here. */
  var contents: js.UndefOr[String] = js.undefined
  
  /** A pointer to the contents of the file. The method by which a client retrieves the contents from a CAS system is not defined here. */
  var digest: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
  
  /** Properties of the file */
  var isExecutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path of this file. If this message is part of the CommandOutputs.outputs fields, the path is relative to the execution root and must correspond to an entry in
    * CommandTask.outputs.files. If this message is part of a Directory message, then the path is relative to the root of that directory. All paths MUST be delimited by forward slashes.
    */
  var path: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2FileMetadata {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2FileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2FileMetadata]
  }
  
  extension [Self <: GoogleDevtoolsRemoteworkersV1test2FileMetadata](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setDigest(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    inline def setIsExecutableUndefined: Self = StObject.set(x, "isExecutable", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
