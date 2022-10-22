package typingsJapgolly.rcUpload

import typingsJapgolly.rcUpload.esInterfaceMod.RcFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAttrAcceptMod {
  
  @JSImport("rc-upload/es/attr-accept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(file: RcFile, acceptedFiles: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(file: RcFile, acceptedFiles: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
