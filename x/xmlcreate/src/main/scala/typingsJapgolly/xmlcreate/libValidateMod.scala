package typingsJapgolly.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libValidateMod {
  
  @JSImport("xmlcreate/lib/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixChar(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixChar")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fixName(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixName")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isUndefined(`val`: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def validateChar(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateChar")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateName(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateName")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateSingleChar(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSingleChar")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
