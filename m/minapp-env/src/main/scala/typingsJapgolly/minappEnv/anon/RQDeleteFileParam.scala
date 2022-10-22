package typingsJapgolly.minappEnv.anon

import typingsJapgolly.minappEnv.Array
import typingsJapgolly.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.ICloud.DeleteFileParam> */
trait RQDeleteFileParam extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var fileList: Array[String]
}
object RQDeleteFileParam {
  
  inline def apply(fileList: Array[String]): RQDeleteFileParam = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDeleteFileParam]
  }
  
  extension [Self <: RQDeleteFileParam](x: Self) {
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setFileList(value: Array[String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
  }
}
