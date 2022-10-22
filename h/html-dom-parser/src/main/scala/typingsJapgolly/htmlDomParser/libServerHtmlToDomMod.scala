package typingsJapgolly.htmlDomParser

import typingsJapgolly.domhandler.mod.Comment
import typingsJapgolly.domhandler.mod.DomHandlerOptions
import typingsJapgolly.domhandler.mod.Element
import typingsJapgolly.domhandler.mod.ProcessingInstruction
import typingsJapgolly.domhandler.mod.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServerHtmlToDomMod {
  
  @JSImport("html-dom-parser/lib/server/html-to-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): js.Array[Comment | Element | ProcessingInstruction | Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def default(html: String, options: DomHandlerOptions): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
}
