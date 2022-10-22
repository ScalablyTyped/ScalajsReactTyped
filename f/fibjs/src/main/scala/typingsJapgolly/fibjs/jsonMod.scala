package typingsJapgolly.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief json 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var json = encoding.json;,```,或者,```JavaScript,var json = require('json');,```
  */
object jsonMod {
  
  @JSImport("json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encode(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
