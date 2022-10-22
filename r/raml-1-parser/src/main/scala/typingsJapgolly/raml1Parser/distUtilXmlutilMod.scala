package typingsJapgolly.raml1Parser

import typingsJapgolly.raml1Parser.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilXmlutilMod {
  
  @JSImport("raml-1-parser/dist/util/xmlutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isXmlScheme(content: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXmlScheme")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseXML(value: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parseXML(value: String, errorsHandler: Error): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(value.asInstanceOf[js.Any], errorsHandler.asInstanceOf[js.Any])).asInstanceOf[Any]
}
