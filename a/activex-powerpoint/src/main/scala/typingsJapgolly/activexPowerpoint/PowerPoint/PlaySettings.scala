package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaySettings extends StObject {
  
  var ActionVerb: String
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  var HideWhileNotPlaying: MsoTriState
  
  var LoopUntilStopped: MsoTriState
  
  val Parent: Any
  
  var PauseAnimation: MsoTriState
  
  var PlayOnEntry: MsoTriState
  
  /* private */ @JSName("PowerPoint.PlaySettings_typekey")
  var PowerPointDotPlaySettings_typekey: PlaySettings
  
  var RewindMovie: MsoTriState
  
  var StopAfterSlides: Double
}
object PlaySettings {
  
  inline def apply(
    ActionVerb: String,
    Application: Application,
    HideWhileNotPlaying: MsoTriState,
    LoopUntilStopped: MsoTriState,
    Parent: Any,
    PauseAnimation: MsoTriState,
    PlayOnEntry: MsoTriState,
    PowerPointDotPlaySettings_typekey: PlaySettings,
    RewindMovie: MsoTriState,
    StopAfterSlides: Double
  ): PlaySettings = {
    val __obj = js.Dynamic.literal(ActionVerb = ActionVerb.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], HideWhileNotPlaying = HideWhileNotPlaying.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PauseAnimation = PauseAnimation.asInstanceOf[js.Any], PlayOnEntry = PlayOnEntry.asInstanceOf[js.Any], RewindMovie = RewindMovie.asInstanceOf[js.Any], StopAfterSlides = StopAfterSlides.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaySettings_typekey")(PowerPointDotPlaySettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaySettings]
  }
  
  extension [Self <: PlaySettings](x: Self) {
    
    inline def setActionVerb(value: String): Self = StObject.set(x, "ActionVerb", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setHideWhileNotPlaying(value: MsoTriState): Self = StObject.set(x, "HideWhileNotPlaying", value.asInstanceOf[js.Any])
    
    inline def setLoopUntilStopped(value: MsoTriState): Self = StObject.set(x, "LoopUntilStopped", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPauseAnimation(value: MsoTriState): Self = StObject.set(x, "PauseAnimation", value.asInstanceOf[js.Any])
    
    inline def setPlayOnEntry(value: MsoTriState): Self = StObject.set(x, "PlayOnEntry", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotPlaySettings_typekey(value: PlaySettings): Self = StObject.set(x, "PowerPoint.PlaySettings_typekey", value.asInstanceOf[js.Any])
    
    inline def setRewindMovie(value: MsoTriState): Self = StObject.set(x, "RewindMovie", value.asInstanceOf[js.Any])
    
    inline def setStopAfterSlides(value: Double): Self = StObject.set(x, "StopAfterSlides", value.asInstanceOf[js.Any])
  }
}
