package typingsJapgolly.domAccessibilityApi

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGetRoleMod {
  
  @JSImport("dom-accessibility-api/dist/getRole", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getLocalName(element: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalName")(element.asInstanceOf[js.Any]).asInstanceOf[String]
}
