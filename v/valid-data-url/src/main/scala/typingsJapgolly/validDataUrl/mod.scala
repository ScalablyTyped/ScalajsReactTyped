package typingsJapgolly.validDataUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(candidate: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(candidate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("valid-data-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("valid-data-url", "regex")
  @js.native
  def regex: js.RegExp = js.native
  inline def regex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regex")(x.asInstanceOf[js.Any])
}
