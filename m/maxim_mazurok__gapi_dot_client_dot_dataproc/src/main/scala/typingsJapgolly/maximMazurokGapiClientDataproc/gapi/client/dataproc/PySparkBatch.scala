package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PySparkBatch extends StObject {
  
  /** Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip. */
  var archiveUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect
    * batch submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. HCFS URIs of files to be placed in the working directory of each executor. */
  var fileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. HCFS URIs of jar files to add to the classpath of the Spark driver and tasks. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The HCFS URI of the main Python file to use as the Spark driver. Must be a .py file. */
  var mainPythonFileUri: js.UndefOr[String] = js.undefined
  
  /** Optional. HCFS file URIs of Python files to pass to the PySpark framework. Supported file types: .py, .egg, and .zip. */
  var pythonFileUris: js.UndefOr[js.Array[String]] = js.undefined
}
object PySparkBatch {
  
  inline def apply(): PySparkBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PySparkBatch]
  }
  
  extension [Self <: PySparkBatch](x: Self) {
    
    inline def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    inline def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    inline def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value*))
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    inline def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    inline def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value*))
    
    inline def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    inline def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    inline def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value*))
    
    inline def setMainPythonFileUri(value: String): Self = StObject.set(x, "mainPythonFileUri", value.asInstanceOf[js.Any])
    
    inline def setMainPythonFileUriUndefined: Self = StObject.set(x, "mainPythonFileUri", js.undefined)
    
    inline def setPythonFileUris(value: js.Array[String]): Self = StObject.set(x, "pythonFileUris", value.asInstanceOf[js.Any])
    
    inline def setPythonFileUrisUndefined: Self = StObject.set(x, "pythonFileUris", js.undefined)
    
    inline def setPythonFileUrisVarargs(value: String*): Self = StObject.set(x, "pythonFileUris", js.Array(value*))
  }
}
