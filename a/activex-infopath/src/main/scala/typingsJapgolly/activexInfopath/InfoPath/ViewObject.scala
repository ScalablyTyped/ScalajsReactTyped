package typingsJapgolly.activexInfopath.InfoPath

import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.ViewObject")
@js.native
class ViewObject protected () extends js.Object {
  @JSName("InfoPath.ViewObject_typekey")
  var InfoPathDotViewObject_typekey: ViewObject = js.native
  val Name: String = js.native
  val Window: typingsJapgolly.activexInfopath.InfoPath.Window = js.native
  def DisableAutoUpdate(): Unit = js.native
  def EnableAutoUpdate(): Unit = js.native
  def ExecuteAction(bstrAction: String): Unit = js.native
  def ExecuteAction(bstrAction: String, varXmlToEdit: js.Any): Unit = js.native
  def Export(bstrURL: String, bstrFormat: String): Unit = js.native
  def ForceUpdate(): Unit = js.native
  def GetContextNodes(): XMLNodesCollection = js.native
  def GetContextNodes(varNode: js.Any): XMLNodesCollection = js.native
  def GetContextNodes(varNode: js.Any, varViewContext: js.Any): XMLNodesCollection = js.native
  def GetSelectedNodes(): XMLNodesCollection = js.native
  def SelectNodes(pxnStartNode: IXMLDOMNode): Unit = js.native
  def SelectNodes(pxnStartNode: IXMLDOMNode, varEndNode: js.Any): Unit = js.native
  def SelectNodes(pxnStartNode: IXMLDOMNode, varEndNode: js.Any, varViewContext: js.Any): Unit = js.native
  def SelectText(pxnField: IXMLDOMNode): Unit = js.native
  def SelectText(pxnField: IXMLDOMNode, varViewContext: js.Any): Unit = js.native
  def SwitchView(bstrName: String): Unit = js.native
}

