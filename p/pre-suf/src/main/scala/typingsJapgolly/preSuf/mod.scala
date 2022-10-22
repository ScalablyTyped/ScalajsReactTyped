package typingsJapgolly.preSuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pre-suf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureEnding(str: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureEnding")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ensureLeading(str: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLeading")(str.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeEnding(str: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEnding")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeLeading(str: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLeading")(str.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
}
