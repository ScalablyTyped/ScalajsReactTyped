package typingsJapgolly.attrAccept

import typingsJapgolly.attrAccept.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("attr-accept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(file: Name, acceptedFiles: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(file: Name, acceptedFiles: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
