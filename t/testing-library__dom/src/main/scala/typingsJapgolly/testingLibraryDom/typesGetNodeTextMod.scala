package typingsJapgolly.testingLibraryDom

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetNodeTextMod {
  
  @JSImport("@testing-library/dom/types/get-node-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNodeText(node: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeText")(node.asInstanceOf[js.Any]).asInstanceOf[String]
}
