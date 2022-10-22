package typingsJapgolly.activexInfopath.InfoPath

import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewObject extends StObject {
  
  def DisableAutoUpdate(): Unit = js.native
  
  def EnableAutoUpdate(): Unit = js.native
  
  def ExecuteAction(bstrAction: String): Unit = js.native
  def ExecuteAction(bstrAction: String, varXmlToEdit: Any): Unit = js.native
  
  def Export(bstrURL: String, bstrFormat: String): Unit = js.native
  
  def ForceUpdate(): Unit = js.native
  
  def GetContextNodes(): XMLNodesCollection = js.native
  def GetContextNodes(varNode: Any): XMLNodesCollection = js.native
  def GetContextNodes(varNode: Any, varViewContext: Any): XMLNodesCollection = js.native
  def GetContextNodes(varNode: Unit, varViewContext: Any): XMLNodesCollection = js.native
  
  def GetSelectedNodes(): XMLNodesCollection = js.native
  
  /* private */ @JSName("InfoPath.ViewObject_typekey")
  var InfoPathDotViewObject_typekey: ViewObject = js.native
  
  val Name: String = js.native
  
  def SelectNodes(pxnStartNode: IXMLDOMNode): Unit = js.native
  def SelectNodes(pxnStartNode: IXMLDOMNode, varEndNode: Any): Unit = js.native
  def SelectNodes(pxnStartNode: IXMLDOMNode, varEndNode: Any, varViewContext: Any): Unit = js.native
  def SelectNodes(pxnStartNode: IXMLDOMNode, varEndNode: Unit, varViewContext: Any): Unit = js.native
  
  def SelectText(pxnField: IXMLDOMNode): Unit = js.native
  def SelectText(pxnField: IXMLDOMNode, varViewContext: Any): Unit = js.native
  
  def SwitchView(bstrName: String): Unit = js.native
  
  val Window: typingsJapgolly.activexInfopath.InfoPath.Window = js.native
}
