package typingsJapgolly.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBuffer extends StObject {
  
  /**
    * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
    */
  var data: String | js.typedarray.ArrayBuffer
  
  /**
    * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
    */
  var isBuffer: js.UndefOr[Boolean] = js.undefined
}
object IsBuffer {
  
  inline def apply(data: String | js.typedarray.ArrayBuffer): IsBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBuffer]
  }
  
  extension [Self <: IsBuffer](x: Self) {
    
    inline def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIsBuffer(value: Boolean): Self = StObject.set(x, "isBuffer", value.asInstanceOf[js.Any])
    
    inline def setIsBufferUndefined: Self = StObject.set(x, "isBuffer", js.undefined)
  }
}
