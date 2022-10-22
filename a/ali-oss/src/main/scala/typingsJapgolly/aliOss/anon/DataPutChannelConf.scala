package typingsJapgolly.aliOss.anon

import typingsJapgolly.aliOss.mod.NormalSuccessResponse
import typingsJapgolly.aliOss.mod.PutChannelConf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPutChannelConf extends StObject {
  
  var data: PutChannelConf
  
  var res: NormalSuccessResponse
}
object DataPutChannelConf {
  
  inline def apply(data: PutChannelConf, res: NormalSuccessResponse): DataPutChannelConf = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPutChannelConf]
  }
  
  extension [Self <: DataPutChannelConf](x: Self) {
    
    inline def setData(value: PutChannelConf): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
