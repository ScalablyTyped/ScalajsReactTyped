package typingsJapgolly.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 编码与解码模块，用于处理不同的数据编码格式与二进制之间的转换
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,```
  */
object encodingMod {
  
  @JSImport("encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object base32 {
    
    @JSImport("encoding", "base32")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: String): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
    
    inline def encode(data: ClassBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object base64 {
    
    @JSImport("encoding", "base64")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: String): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
    
    inline def encode(data: ClassBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encode(data: ClassBuffer, url: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object base64vlq {
    
    @JSImport("encoding", "base64vlq")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def encode(data: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encode(data: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object bson {
    
    @JSImport("encoding", "bson")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: ClassBuffer): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def encode(data: js.Object): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  }
  
  inline def decodeURI(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeURI")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeURI(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURI")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeURIComponent(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURIComponent")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object hex {
    
    @JSImport("encoding", "hex")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: String): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
    
    inline def encode(data: ClassBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object iconv {
    
    @JSImport("encoding", "iconv")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(charset: String, data: ClassBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def encode(charset: String, data: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
    
    inline def isEncoding(charset: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(charset.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object json {
    
    @JSImport("encoding", "json")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def encode(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def jsstr(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsstr")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def jsstr(str: String, json: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsstr")(str.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[String]
}
