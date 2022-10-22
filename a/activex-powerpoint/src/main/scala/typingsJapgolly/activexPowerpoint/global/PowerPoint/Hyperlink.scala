package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoHyperlinkType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Hyperlink")
@js.native
/* private */ open class Hyperlink ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlink {
  
  /* CompleteClass */
  override def AddToFavorites(): Unit = js.native
  
  /* CompleteClass */
  var Address: String = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def CreateNewDocument(FileName: String, EditNow: MsoTriState, Overwrite: MsoTriState): Unit = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var EmailSubject: String = js.native
  
  /* CompleteClass */
  override def Follow(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Hyperlink_typekey")
  var PowerPointDotHyperlink_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlink = js.native
  
  /* CompleteClass */
  var ScreenTip: String = js.native
  
  /* CompleteClass */
  var ShowAndReturn: MsoTriState = js.native
  
  /* CompleteClass */
  var SubAddress: String = js.native
  
  /* CompleteClass */
  var TextToDisplay: String = js.native
  
  /* CompleteClass */
  override val Type: MsoHyperlinkType = js.native
}
