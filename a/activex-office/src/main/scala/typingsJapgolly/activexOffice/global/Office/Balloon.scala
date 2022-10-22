package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.BalloonCheckboxes
import typingsJapgolly.activexOffice.Office.BalloonLabels
import typingsJapgolly.activexOffice.Office.MsoAnimationType
import typingsJapgolly.activexOffice.Office.MsoBalloonButtonType
import typingsJapgolly.activexOffice.Office.MsoBalloonType
import typingsJapgolly.activexOffice.Office.MsoButtonSetType
import typingsJapgolly.activexOffice.Office.MsoIconType
import typingsJapgolly.activexOffice.Office.MsoModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.Balloon")
@js.native
/* private */ open class Balloon ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.Balloon {
  
  /* CompleteClass */
  var Animation: MsoAnimationType = js.native
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var BalloonType: MsoBalloonType = js.native
  
  /* CompleteClass */
  var Button: MsoButtonSetType = js.native
  
  /* CompleteClass */
  var Callback: String = js.native
  
  /* CompleteClass */
  override def Checkboxes(Index: Double): typingsJapgolly.activexOffice.Office.BalloonCheckbox = js.native
  /* CompleteClass */
  @JSName("Checkboxes")
  override val Checkboxes_Original: BalloonCheckboxes = js.native
  
  /* CompleteClass */
  override def Close(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Heading: String = js.native
  
  /* CompleteClass */
  var Icon: MsoIconType = js.native
  
  /* CompleteClass */
  override def Labels(Index: Double): typingsJapgolly.activexOffice.Office.BalloonLabel = js.native
  /* CompleteClass */
  @JSName("Labels")
  override val Labels_Original: BalloonLabels = js.native
  
  /* CompleteClass */
  var Mode: MsoModeType = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.Balloon_typekey")
  var OfficeDotBalloon_typekey: typingsJapgolly.activexOffice.Office.Balloon = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Private: Double = js.native
  
  /* CompleteClass */
  override def SetAvoidRectangle(Left: Double, Top: Double, Right: Double, Bottom: Double): Unit = js.native
  
  /* CompleteClass */
  override def Show(): MsoBalloonButtonType = js.native
  
  /* CompleteClass */
  var Text: String = js.native
}
