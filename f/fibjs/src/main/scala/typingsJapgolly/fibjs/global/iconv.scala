package typingsJapgolly.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconv {
  
  @JSGlobal("__iconv")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(charset: String, data: typingsJapgolly.fibjs.ClassBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(charset: String, data: String): typingsJapgolly.fibjs.ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fibjs.ClassBuffer]
  
  inline def isEncoding(charset: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(charset.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
