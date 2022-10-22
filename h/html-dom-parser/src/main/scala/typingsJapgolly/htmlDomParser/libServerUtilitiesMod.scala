package typingsJapgolly.htmlDomParser

import org.scalajs.dom.Comment
import org.scalajs.dom.Element
import org.scalajs.dom.ProcessingInstruction
import org.scalajs.dom.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServerUtilitiesMod {
  
  @JSImport("html-dom-parser/lib/server/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsetRootParent(nodes: Nodes): Nodes = ^.asInstanceOf[js.Dynamic].applyDynamic("unsetRootParent")(nodes.asInstanceOf[js.Any]).asInstanceOf[Nodes]
  
  type Nodes = js.Array[Comment | Element | ProcessingInstruction | Text]
}
