package typingsJapgolly.requireindex

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def apply(path: String, basenames: js.Array[String]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], basenames.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  @JSImport("requireindex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
