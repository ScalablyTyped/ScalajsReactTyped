package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideShowSettings extends StObject {
  
  var AdvanceMode: PpSlideShowAdvanceMode
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  var EndingSlide: Double
  
  var LoopUntilStopped: MsoTriState
  
  val NamedSlideShows: typingsJapgolly.activexPowerpoint.PowerPoint.NamedSlideShows
  
  val Parent: Any
  
  val PointerColor: ColorFormat
  
  /* private */ @JSName("PowerPoint.SlideShowSettings_typekey")
  var PowerPointDotSlideShowSettings_typekey: SlideShowSettings
  
  var RangeType: PpSlideShowRangeType
  
  def Run(): SlideShowWindow
  
  var ShowMediaControls: MsoTriState
  
  var ShowPresenterView: MsoTriState
  
  var ShowScrollbar: MsoTriState
  
  var ShowType: PpSlideShowType
  
  var ShowWithAnimation: MsoTriState
  
  var ShowWithNarration: MsoTriState
  
  var SlideShowName: String
  
  var StartingSlide: Double
}
object SlideShowSettings {
  
  inline def apply(
    AdvanceMode: PpSlideShowAdvanceMode,
    Application: Application,
    EndingSlide: Double,
    LoopUntilStopped: MsoTriState,
    NamedSlideShows: NamedSlideShows,
    Parent: Any,
    PointerColor: ColorFormat,
    PowerPointDotSlideShowSettings_typekey: SlideShowSettings,
    RangeType: PpSlideShowRangeType,
    Run: CallbackTo[SlideShowWindow],
    ShowMediaControls: MsoTriState,
    ShowPresenterView: MsoTriState,
    ShowScrollbar: MsoTriState,
    ShowType: PpSlideShowType,
    ShowWithAnimation: MsoTriState,
    ShowWithNarration: MsoTriState,
    SlideShowName: String,
    StartingSlide: Double
  ): SlideShowSettings = {
    val __obj = js.Dynamic.literal(AdvanceMode = AdvanceMode.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], EndingSlide = EndingSlide.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], NamedSlideShows = NamedSlideShows.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PointerColor = PointerColor.asInstanceOf[js.Any], RangeType = RangeType.asInstanceOf[js.Any], Run = Run.toJsFn, ShowMediaControls = ShowMediaControls.asInstanceOf[js.Any], ShowPresenterView = ShowPresenterView.asInstanceOf[js.Any], ShowScrollbar = ShowScrollbar.asInstanceOf[js.Any], ShowType = ShowType.asInstanceOf[js.Any], ShowWithAnimation = ShowWithAnimation.asInstanceOf[js.Any], ShowWithNarration = ShowWithNarration.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], StartingSlide = StartingSlide.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowSettings_typekey")(PowerPointDotSlideShowSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowSettings]
  }
  
  extension [Self <: SlideShowSettings](x: Self) {
    
    inline def setAdvanceMode(value: PpSlideShowAdvanceMode): Self = StObject.set(x, "AdvanceMode", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setEndingSlide(value: Double): Self = StObject.set(x, "EndingSlide", value.asInstanceOf[js.Any])
    
    inline def setLoopUntilStopped(value: MsoTriState): Self = StObject.set(x, "LoopUntilStopped", value.asInstanceOf[js.Any])
    
    inline def setNamedSlideShows(value: NamedSlideShows): Self = StObject.set(x, "NamedSlideShows", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPointerColor(value: ColorFormat): Self = StObject.set(x, "PointerColor", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotSlideShowSettings_typekey(value: SlideShowSettings): Self = StObject.set(x, "PowerPoint.SlideShowSettings_typekey", value.asInstanceOf[js.Any])
    
    inline def setRangeType(value: PpSlideShowRangeType): Self = StObject.set(x, "RangeType", value.asInstanceOf[js.Any])
    
    inline def setRun(value: CallbackTo[SlideShowWindow]): Self = StObject.set(x, "Run", value.toJsFn)
    
    inline def setShowMediaControls(value: MsoTriState): Self = StObject.set(x, "ShowMediaControls", value.asInstanceOf[js.Any])
    
    inline def setShowPresenterView(value: MsoTriState): Self = StObject.set(x, "ShowPresenterView", value.asInstanceOf[js.Any])
    
    inline def setShowScrollbar(value: MsoTriState): Self = StObject.set(x, "ShowScrollbar", value.asInstanceOf[js.Any])
    
    inline def setShowType(value: PpSlideShowType): Self = StObject.set(x, "ShowType", value.asInstanceOf[js.Any])
    
    inline def setShowWithAnimation(value: MsoTriState): Self = StObject.set(x, "ShowWithAnimation", value.asInstanceOf[js.Any])
    
    inline def setShowWithNarration(value: MsoTriState): Self = StObject.set(x, "ShowWithNarration", value.asInstanceOf[js.Any])
    
    inline def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
    
    inline def setStartingSlide(value: Double): Self = StObject.set(x, "StartingSlide", value.asInstanceOf[js.Any])
  }
}
