package typingsJapgolly.safeJsonStringify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: js.Object): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: js.Array[Any], space: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: js.Array[Any], space: Double): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: ReplacerFn): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: ReplacerFn, space: String): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: js.Object, replacer: ReplacerFn, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("safe-json-stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureProperties(obj: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureProperties")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  // see https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter
  type ReplacerFn = js.Function2[/* key */ Any, /* value */ Any, Any]
}
