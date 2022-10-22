package typingsJapgolly.xmlCore

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.xmlCore.distTypesTypesMod.AssocArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMod {
  
  @JSImport("xml-core/dist/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Parse(xmlString: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(xmlString.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  @JSImport("xml-core/dist/types/utils", "Select")
  @js.native
  val Select: SelectNodes = js.native
  
  inline def SelectNamespaces(node: Element): AssocArray[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectNamespaces")(node.asInstanceOf[js.Any]).asInstanceOf[AssocArray[String]]
  
  inline def SelectSingleNode(node: Node, path: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleNode")(node.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def Stringify(target: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Stringify")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def isDocument(obj: Any): /* is std.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Document */ Boolean]
  
  inline def isElement(obj: Any): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
  
  type SelectNodes = js.Function2[/* node */ Node, /* xPath */ String, js.Array[Node]]
}
