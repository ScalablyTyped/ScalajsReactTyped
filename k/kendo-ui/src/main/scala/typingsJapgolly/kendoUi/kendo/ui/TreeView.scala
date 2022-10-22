package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.HierarchicalDataSource
import typingsJapgolly.kendoUi.kendo.data.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeView
  extends StObject
     with Widget {
  
  def append(nodeData: Any): JQuery = js.native
  def append(nodeData: Any, parentNode: Unit, success: js.Function): JQuery = js.native
  def append(nodeData: Any, parentNode: JQuery): JQuery = js.native
  def append(nodeData: Any, parentNode: JQuery, success: js.Function): JQuery = js.native
  def append(nodeData: JQuery): JQuery = js.native
  def append(nodeData: JQuery, parentNode: Unit, success: js.Function): JQuery = js.native
  def append(nodeData: JQuery, parentNode: JQuery): JQuery = js.native
  def append(nodeData: JQuery, parentNode: JQuery, success: js.Function): JQuery = js.native
  
  def collapse(nodes: String): Unit = js.native
  def collapse(nodes: Element): Unit = js.native
  def collapse(nodes: JQuery): Unit = js.native
  
  def dataItem(node: String): Node = js.native
  def dataItem(node: Element): Node = js.native
  def dataItem(node: JQuery): Node = js.native
  
  var dataSource: DataSource = js.native
  
  def detach(node: String): JQuery = js.native
  def detach(node: Element): JQuery = js.native
  def detach(node: JQuery): JQuery = js.native
  
  def enable(nodes: String): Unit = js.native
  def enable(nodes: String, enable: Boolean): Unit = js.native
  def enable(nodes: Element): Unit = js.native
  def enable(nodes: Element, enable: Boolean): Unit = js.native
  def enable(nodes: Boolean): Unit = js.native
  def enable(nodes: Boolean, enable: Boolean): Unit = js.native
  def enable(nodes: JQuery): Unit = js.native
  def enable(nodes: JQuery, enable: Boolean): Unit = js.native
  
  def expand(nodes: String): Unit = js.native
  def expand(nodes: Element): Unit = js.native
  def expand(nodes: JQuery): Unit = js.native
  
  def expandPath(path: Any, complete: js.Function): Unit = js.native
  
  def expandTo(targetNode: Any): Unit = js.native
  def expandTo(targetNode: Node): Unit = js.native
  
  def findByText(text: String): JQuery = js.native
  
  def findByUid(uid: String): JQuery = js.native
  
  def focus(): Unit = js.native
  
  def insertAfter(nodeData: Any, referenceNode: JQuery): JQuery = js.native
  
  def insertBefore(nodeData: Any, referenceNode: JQuery): JQuery = js.native
  
  def items(): Any = js.native
  
  @JSName("options")
  var options_TreeView: TreeViewOptions = js.native
  
  def parent(node: String): JQuery = js.native
  def parent(node: Element): JQuery = js.native
  def parent(node: JQuery): JQuery = js.native
  
  def remove(node: String): Unit = js.native
  def remove(node: Element): Unit = js.native
  def remove(node: JQuery): Unit = js.native
  
  def select(): Unit = js.native
  def select(node: String): Unit = js.native
  def select(node: Element): Unit = js.native
  def select(node: JQuery): Unit = js.native
  @JSName("select")
  def select_JQuery(): JQuery = js.native
  
  def setDataSource(dataSource: HierarchicalDataSource): Unit = js.native
  
  def text(node: String): String = js.native
  def text(node: String, newText: String): Unit = js.native
  def text(node: Element): String = js.native
  def text(node: Element, newText: String): Unit = js.native
  def text(node: JQuery): String = js.native
  def text(node: JQuery, newText: String): Unit = js.native
  
  def toggle(node: String): Unit = js.native
  def toggle(node: Element): Unit = js.native
  def toggle(node: JQuery): Unit = js.native
  
  def updateIndeterminate(node: JQuery): Unit = js.native
  
  var wrapper: JQuery = js.native
}
