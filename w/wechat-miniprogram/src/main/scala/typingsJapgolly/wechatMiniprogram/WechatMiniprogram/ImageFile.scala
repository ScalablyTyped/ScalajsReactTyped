package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 图片的本地临时文件列表
  *
  * 最低基础库： `1.2.0` */
trait ImageFile extends StObject {
  
  /** 本地临时文件路径 (本地路径) */
  var path: String
  
  /** 本地临时文件大小，单位 B */
  var size: Double
}
object ImageFile {
  
  inline def apply(path: String, size: Double): ImageFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
  
  extension [Self <: ImageFile](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
