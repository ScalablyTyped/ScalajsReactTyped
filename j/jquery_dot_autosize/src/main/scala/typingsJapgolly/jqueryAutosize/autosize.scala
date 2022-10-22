package typingsJapgolly.jqueryAutosize

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autosize {
  
  @js.native
  trait AutosizeStatic extends StObject {
    
    def apply(el: Element): Unit = js.native
    def apply(el: NodeList[Node]): Unit = js.native
    def apply(el: JQuery[HTMLElement]): Unit = js.native
  }
}
