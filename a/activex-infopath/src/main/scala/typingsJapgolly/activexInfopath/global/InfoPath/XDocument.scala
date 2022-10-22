package typingsJapgolly.activexInfopath.global.InfoPath

import typingsJapgolly.activexAdodb.ADODB.Error
import typingsJapgolly.activexAdodb.ADODB.Errors
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMDocument
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.XDocument")
@js.native
/* private */ open class XDocument ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath.XDocument {
  
  /* CompleteClass */
  override def CreateDOM(): IXMLDOMDocument = js.native
  
  /* CompleteClass */
  override val DOM: IXMLDOMDocument = js.native
  
  /* CompleteClass */
  override val DataAdapters: typingsJapgolly.activexInfopath.InfoPath.DataAdaptersCollection = js.native
  
  /* CompleteClass */
  override val DataObjects: typingsJapgolly.activexInfopath.InfoPath.DataObjectsCollection = js.native
  
  /* CompleteClass */
  override def Errors(Index: Any): Error = js.native
  /* CompleteClass */
  @JSName("Errors")
  override val Errors_Original: Errors = js.native
  
  /* CompleteClass */
  override val Extension: Any = js.native
  
  /* CompleteClass */
  override def GetDOM(bstrName: String): IXMLDOMDocument = js.native
  
  /* CompleteClass */
  override def GetDataVariable(lVariableNumber: Double): String = js.native
  
  /* CompleteClass */
  override def GetNamedNodeProperty(varMainDOMNode: Any, bstrPropertyName: String, bstrDefaultValue: String): String = js.native
  
  /* CompleteClass */
  override def ImportDOM(pxDoc: IXMLDOMDocument): Unit = js.native
  
  /* CompleteClass */
  override def ImportFile(bstrFileURI: String): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.XDocument_typekey")
  var InfoPathDotXDocument_typekey: typingsJapgolly.activexInfopath.InfoPath.XDocument = js.native
  
  /* CompleteClass */
  override val IsDOMReadOnly: Boolean = js.native
  
  /* CompleteClass */
  override val IsDirty: Boolean = js.native
  
  /* CompleteClass */
  override val IsNew: Boolean = js.native
  
  /* CompleteClass */
  override val IsReadOnly: Boolean = js.native
  
  /* CompleteClass */
  override val IsRecovered: Boolean = js.native
  
  /* CompleteClass */
  override val IsSigned: Boolean = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  override def PrintOut(): Unit = js.native
  
  /* CompleteClass */
  override def Query(): Unit = js.native
  
  /* CompleteClass */
  override val QueryAdapter: Any = js.native
  
  /* CompleteClass */
  var Role: String = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override def SaveAs(bstrFileUrl: String): Unit = js.native
  
  /* CompleteClass */
  override def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit = js.native
  
  /* CompleteClass */
  override def SetDirty(vfIsDirty: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def SetNamedNodeProperty(pxmlMainDOMNode: IXMLDOMNode, bstrPropertyName: String, bstrValue: String): Unit = js.native
  
  /* CompleteClass */
  override val SignedDataBlocks: typingsJapgolly.activexInfopath.InfoPath.SignedDataBlocksCollection = js.native
  
  /* CompleteClass */
  override val Solution: typingsJapgolly.activexInfopath.InfoPath.SolutionObject = js.native
  
  /* CompleteClass */
  override def Submit(): Unit = js.native
  
  /* CompleteClass */
  override val UI: typingsJapgolly.activexInfopath.InfoPath.UI = js.native
  
  /* CompleteClass */
  override val URI: String = js.native
  
  /* CompleteClass */
  override val Util: typingsJapgolly.activexInfopath.InfoPath.UtilObject = js.native
  
  /* CompleteClass */
  override val View: typingsJapgolly.activexInfopath.InfoPath.ViewObject = js.native
  
  /* CompleteClass */
  override val ViewInfos: typingsJapgolly.activexInfopath.InfoPath.ViewInfosCollection = js.native
}
