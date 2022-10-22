package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2DirectoryNode extends StObject {
  
  /** The digest of the Directory object represented. See Digest for information about how to take the digest of a proto message. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /** The name of the directory. */
  var name: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2DirectoryNode {
  
  inline def apply(): BuildBazelRemoteExecutionV2DirectoryNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2DirectoryNode]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2DirectoryNode](x: Self) {
    
    inline def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
