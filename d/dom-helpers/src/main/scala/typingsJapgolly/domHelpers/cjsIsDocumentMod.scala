package typingsJapgolly.domHelpers

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsIsDocumentMod {
  
  @JSImport("dom-helpers/cjs/isDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Document): /* is std.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.Document */ Boolean]
  inline def default(element: Element): /* is std.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.Document */ Boolean]
  inline def default(element: Window): /* is std.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.Document */ Boolean]
}
