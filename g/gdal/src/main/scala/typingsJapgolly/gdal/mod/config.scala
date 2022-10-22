package typingsJapgolly.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("gdal", "config")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def set(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
