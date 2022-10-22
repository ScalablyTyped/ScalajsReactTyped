package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.MsoDocInspectorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.DocumentInspector")
@js.native
/* private */ open class DocumentInspector ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.DocumentInspector {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Description: String = js.native
  
  /* CompleteClass */
  override def Fix(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  
  /* CompleteClass */
  override def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: typingsJapgolly.activexOffice.Office.DocumentInspector = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
}
