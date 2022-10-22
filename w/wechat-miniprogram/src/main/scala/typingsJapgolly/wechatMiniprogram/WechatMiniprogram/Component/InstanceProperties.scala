package typingsJapgolly.wechatMiniprogram.WechatMiniprogram.Component

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceProperties extends StObject {
  
  /** 节点dataset */
  var dataset: Record[String, String]
  
  /** 节点id */
  var id: String
  
  /** 组件的文件路径 */
  var is: String
}
object InstanceProperties {
  
  inline def apply(dataset: Record[String, String], id: String, is: String): InstanceProperties = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProperties]
  }
  
  extension [Self <: InstanceProperties](x: Self) {
    
    inline def setDataset(value: Record[String, String]): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
  }
}
