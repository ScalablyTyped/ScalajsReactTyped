package typingsJapgolly.htmlDomParser

import typingsJapgolly.domhandler.mod.DataNode
import typingsJapgolly.domhandler.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientHtmlToDomMod {
  
  @JSImport("html-dom-parser/lib/client/html-to-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): js.Array[DataNode | Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode | Element]]
}
