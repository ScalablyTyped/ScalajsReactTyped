package typingsJapgolly.wechatMiniprogram.anon

import typingsJapgolly.wechatMiniprogram.DB.IUpdateCondition
import typingsJapgolly.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.DB.ISetSingleDocumentOptions> */
trait RQISetSingleDocumentOptio extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var data: IUpdateCondition
}
object RQISetSingleDocumentOptio {
  
  inline def apply(data: IUpdateCondition): RQISetSingleDocumentOptio = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQISetSingleDocumentOptio]
  }
  
  extension [Self <: RQISetSingleDocumentOptio](x: Self) {
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
