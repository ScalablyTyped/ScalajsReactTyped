package typingsJapgolly.activexInfopath.global.InfoPath

import typingsJapgolly.activexAdodb.ADODB.Error
import typingsJapgolly.activexAdodb.ADODB.Errors
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath._XDocument")
@js.native
/* private */ open class _XDocument ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath._XDocument {
  
  /* CompleteClass */
  override val DOM: IXMLDOMDocument = js.native
  
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
  override def ImportFile(bstrFileURI: String): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath._XDocument_typekey")
  var InfoPathDot_XDocument_typekey: typingsJapgolly.activexInfopath.InfoPath._XDocument = js.native
  
  /* CompleteClass */
  override val IsDOMReadOnly: Boolean = js.native
  
  /* CompleteClass */
  override val IsDirty: Boolean = js.native
  
  /* CompleteClass */
  override val IsNew: Boolean = js.native
  
  /* CompleteClass */
  override val IsReadOnly: Boolean = js.native
  
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
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override def SaveAs(bstrFileUrl: String): Unit = js.native
  
  /* CompleteClass */
  override def SetDataVariable(lVariableNumber: Double, bstrVariableValue: String): Unit = js.native
  
  /* CompleteClass */
  override val Solution: typingsJapgolly.activexInfopath.InfoPath.SolutionObject = js.native
  
  /* CompleteClass */
  override def Submit(): Unit = js.native
  
  /* CompleteClass */
  override val UI: typingsJapgolly.activexInfopath.InfoPath.UI = js.native
  
  /* CompleteClass */
  override val URI: String = js.native
  
  /* CompleteClass */
  override val View: typingsJapgolly.activexInfopath.InfoPath.ViewObject = js.native
  
  /* CompleteClass */
  override val ViewInfos: typingsJapgolly.activexInfopath.InfoPath.ViewInfosCollection = js.native
}
