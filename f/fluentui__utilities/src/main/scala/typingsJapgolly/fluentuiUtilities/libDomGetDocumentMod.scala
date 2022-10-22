package typingsJapgolly.fluentuiUtilities

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomGetDocumentMod {
  
  @JSImport("@fluentui/utilities/lib/dom/getDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocument(): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[js.UndefOr[Document]]
  inline def getDocument(rootElement: HTMLElement): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(rootElement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Document]]
}
