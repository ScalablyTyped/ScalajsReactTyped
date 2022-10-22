package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpSlideShowAdvanceMode
import typingsJapgolly.activexPowerpoint.PowerPoint.PpSlideShowRangeType
import typingsJapgolly.activexPowerpoint.PowerPoint.PpSlideShowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SlideShowSettings")
@js.native
/* private */ open class SlideShowSettings ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowSettings {
  
  /* CompleteClass */
  var AdvanceMode: PpSlideShowAdvanceMode = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var EndingSlide: Double = js.native
  
  /* CompleteClass */
  var LoopUntilStopped: MsoTriState = js.native
  
  /* CompleteClass */
  override val NamedSlideShows: typingsJapgolly.activexPowerpoint.PowerPoint.NamedSlideShows = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PointerColor: typingsJapgolly.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.SlideShowSettings_typekey")
  var PowerPointDotSlideShowSettings_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowSettings = js.native
  
  /* CompleteClass */
  var RangeType: PpSlideShowRangeType = js.native
  
  /* CompleteClass */
  override def Run(): typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowWindow = js.native
  
  /* CompleteClass */
  var ShowMediaControls: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowPresenterView: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowScrollbar: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowType: PpSlideShowType = js.native
  
  /* CompleteClass */
  var ShowWithAnimation: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowWithNarration: MsoTriState = js.native
  
  /* CompleteClass */
  var SlideShowName: String = js.native
  
  /* CompleteClass */
  var StartingSlide: Double = js.native
}
