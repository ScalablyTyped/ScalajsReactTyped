package typingsJapgolly.urlParams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(oldUrl: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def add(oldUrl: String, param: String, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createUrlObject(oldUrl: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlObject")(oldUrl.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def remove(oldUrl: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def remove(oldUrl: String, param: String, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def set(oldUrl: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def set(oldUrl: String, param: String, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(oldUrl.asInstanceOf[js.Any], param.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
}
