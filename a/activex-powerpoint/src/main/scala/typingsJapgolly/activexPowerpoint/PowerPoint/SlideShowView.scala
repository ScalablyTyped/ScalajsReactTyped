package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowView")
@js.native
class SlideShowView protected () extends js.Object {
  var AcceleratorsEnabled: MsoTriState = js.native
  val AdvanceMode: PpSlideShowAdvanceMode = js.native
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val CurrentShowPosition: Double = js.native
  val IsNamedShow: MsoTriState = js.native
  val LastSlideViewed: typingsJapgolly.activexPowerpoint.PowerPoint.Slide = js.native
  val MediaControlsHeight: Double = js.native
  val MediaControlsLeft: Double = js.native
  val MediaControlsTop: Double = js.native
  val MediaControlsVisible: MsoTriState = js.native
  val MediaControlsWidth: Double = js.native
  val Parent: js.Any = js.native
  val PointerColor: ColorFormat = js.native
  var PointerType: PpSlideShowPointerType = js.native
  @JSName("PowerPoint.SlideShowView_typekey")
  var PowerPointDotSlideShowView_typekey: SlideShowView = js.native
  val PresentationElapsedTime: Double = js.native
  val Slide: typingsJapgolly.activexPowerpoint.PowerPoint.Slide = js.native
  var SlideElapsedTime: Double = js.native
  val SlideShowName: String = js.native
  var State: PpSlideShowState = js.native
  val Zoom: Double = js.native
  def DrawLine(BeginX: Double, BeginY: Double, EndX: Double, EndY: Double): Unit = js.native
  def EndNamedShow(): Unit = js.native
  def EraseDrawing(): Unit = js.native
  def Exit(): Unit = js.native
  def First(): Unit = js.native
  def FirstAnimationIsAutomatic(): Boolean = js.native
  def GetClickCount(): Double = js.native
  def GetClickIndex(): Double = js.native
  def GotoClick(Index: Double): Unit = js.native
  def GotoNamedShow(SlideShowName: String): Unit = js.native
  /** @param Office.MsoTriState [ResetSlide=-1] */
  def GotoSlide(Index: Double): Unit = js.native
  def GotoSlide(Index: Double, ResetSlide: MsoTriState): Unit = js.native
  def InstallTracker(pTracker: MouseTracker, Presenter: MsoTriState): Unit = js.native
  def Last(): Unit = js.native
  def Next(): Unit = js.native
  def Player(ShapeId: js.Any): typingsJapgolly.activexPowerpoint.PowerPoint.Player = js.native
  def Previous(): Unit = js.native
  def ResetSlideTime(): Unit = js.native
}

