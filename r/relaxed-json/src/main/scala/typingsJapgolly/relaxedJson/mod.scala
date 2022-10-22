package typingsJapgolly.relaxedJson

import typingsJapgolly.relaxedJson.anon.Duplicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("relaxed-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(text: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def parse(text: String, opts: Duplicate): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parse(text: String, reviver: Reviver): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transform(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Reviver = js.ThisFunction2[/* this */ js.Object, /* key */ String, /* value */ Any, Any]
}
