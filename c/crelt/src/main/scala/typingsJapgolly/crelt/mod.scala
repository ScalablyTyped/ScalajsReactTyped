package typingsJapgolly.crelt

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crelt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elt: String, children: Child*): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(elt.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HTMLElement]
  inline def default(elt: HTMLElement, children: Child*): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(elt.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HTMLElement]
  
  type Child = js.UndefOr[String | Node | Null | js.Array[Any]]
}
