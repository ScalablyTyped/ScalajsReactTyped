package typingsJapgolly.globalyzer

import typingsJapgolly.globalyzer.anon.Base
import typingsJapgolly.globalyzer.anon.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(glob: String): Base = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[Base]
  inline def apply(glob: String, options: Strict): Base = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Base]
  
  @JSImport("globalyzer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
