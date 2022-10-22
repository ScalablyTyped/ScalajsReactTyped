package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs extends StObject {
  
  /** A list of expected directories, relative to the execution root. All paths MUST be delimited by forward slashes. */
  var directories: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of expected files, relative to the execution root. All paths MUST be delimited by forward slashes. */
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The destination to which any stderr should be sent. The method by which the bot should send the stream contents to that destination is not defined in this API. As examples, the
    * destination could be a file referenced in the `files` field in this message, or it could be a URI that must be written via the ByteStream API.
    */
  var stderrDestination: js.UndefOr[String] = js.undefined
  
  /**
    * The destination to which any stdout should be sent. The method by which the bot should send the stream contents to that destination is not defined in this API. As examples, the
    * destination could be a file referenced in the `files` field in this message, or it could be a URI that must be written via the ByteStream API.
    */
  var stdoutDestination: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs]
  }
  
  extension [Self <: GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs](x: Self) {
    
    inline def setDirectories(value: js.Array[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: String*): Self = StObject.set(x, "directories", js.Array(value*))
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setStderrDestination(value: String): Self = StObject.set(x, "stderrDestination", value.asInstanceOf[js.Any])
    
    inline def setStderrDestinationUndefined: Self = StObject.set(x, "stderrDestination", js.undefined)
    
    inline def setStdoutDestination(value: String): Self = StObject.set(x, "stdoutDestination", value.asInstanceOf[js.Any])
    
    inline def setStdoutDestinationUndefined: Self = StObject.set(x, "stdoutDestination", js.undefined)
  }
}
