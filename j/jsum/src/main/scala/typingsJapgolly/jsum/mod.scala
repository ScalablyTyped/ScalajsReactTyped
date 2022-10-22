package typingsJapgolly.jsum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digest(obj: Any, hashAlgorithm: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(obj.asInstanceOf[js.Any], hashAlgorithm.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
