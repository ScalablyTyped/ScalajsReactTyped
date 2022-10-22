package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 广播的制造商信息, 仅安卓支持 */
trait ManufacturerData extends StObject {
  
  /** 制造商ID，0x 开头的十六进制 */
  var manufacturerId: String
  
  /** 制造商信息 */
  var manufacturerSpecificData: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object ManufacturerData {
  
  inline def apply(manufacturerId: String): ManufacturerData = {
    val __obj = js.Dynamic.literal(manufacturerId = manufacturerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManufacturerData]
  }
  
  extension [Self <: ManufacturerData](x: Self) {
    
    inline def setManufacturerId(value: String): Self = StObject.set(x, "manufacturerId", value.asInstanceOf[js.Any])
    
    inline def setManufacturerSpecificData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "manufacturerSpecificData", value.asInstanceOf[js.Any])
    
    inline def setManufacturerSpecificDataUndefined: Self = StObject.set(x, "manufacturerSpecificData", js.undefined)
  }
}
