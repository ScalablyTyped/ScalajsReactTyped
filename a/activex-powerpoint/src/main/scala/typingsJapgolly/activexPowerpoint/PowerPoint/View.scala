package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  var DisplaySlideMiniature: MsoTriState = js.native
  
  def GotoSlide(Index: Double): Unit = js.native
  
  val MediaControlsHeight: Double = js.native
  
  val MediaControlsLeft: Double = js.native
  
  val MediaControlsTop: Double = js.native
  
  val MediaControlsVisible: MsoTriState = js.native
  
  val MediaControlsWidth: Double = js.native
  
  val Parent: Any = js.native
  
  def Paste(): Unit = js.native
  
  /**
    * @param PowerPoint.PpPasteDataType [DataType=0]
    * @param Office.MsoTriState [DisplayAsIcon=0]
    * @param string [IconFileName='']
    * @param number [IconIndex=0]
    * @param string [IconLabel='']
    * @param Office.MsoTriState [Link=0]
    */
  def PasteSpecial(
    DataType: js.UndefOr[PpPasteDataType],
    DisplayAsIcon: js.UndefOr[MsoTriState],
    IconFileName: js.UndefOr[String],
    IconIndex: js.UndefOr[Double],
    IconLabel: js.UndefOr[String],
    Link: js.UndefOr[MsoTriState]
  ): Unit = js.native
  
  def Player(ShapeId: Any): typingsJapgolly.activexPowerpoint.PowerPoint.Player = js.native
  
  /* private */ @JSName("PowerPoint.View_typekey")
  var PowerPointDotView_typekey: View = js.native
  
  val PrintOptions: typingsJapgolly.activexPowerpoint.PowerPoint.PrintOptions = js.native
  
  /**
    * @param number [From=-1]
    * @param number [To=-1]
    * @param string [PrintToFile='']
    * @param number [Copies=0]
    * @param Office.MsoTriState [Collate=-99]
    */
  def PrintOut(): Unit = js.native
  def PrintOut(From: Double): Unit = js.native
  def PrintOut(From: Double, To: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  
  var Slide: Any = js.native
  
  val Type: PpViewType = js.native
  
  var Zoom: Double = js.native
  
  var ZoomToFit: MsoTriState = js.native
}
