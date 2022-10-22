package typingsJapgolly.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionStorageMod {
  
  @JSImport("@fluentui/utilities/lib/sessionStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getItem(key: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def setItem(key: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
