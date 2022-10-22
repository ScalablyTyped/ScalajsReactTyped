package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Player extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application
  
  var CurrentPosition: Double
  
  def GoToNextBookmark(): Unit
  
  def GoToPreviousBookmark(): Unit
  
  val Parent: Any
  
  def Pause(): Unit
  
  def Play(): Unit
  
  /* private */ @JSName("PowerPoint.Player_typekey")
  var PowerPointDotPlayer_typekey: Player
  
  val State: PpPlayerState
  
  def Stop(): Unit
}
object Player {
  
  inline def apply(
    Application: Application,
    CurrentPosition: Double,
    GoToNextBookmark: Callback,
    GoToPreviousBookmark: Callback,
    Parent: Any,
    Pause: Callback,
    Play: Callback,
    PowerPointDotPlayer_typekey: Player,
    State: PpPlayerState,
    Stop: Callback
  ): Player = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CurrentPosition = CurrentPosition.asInstanceOf[js.Any], GoToNextBookmark = GoToNextBookmark.toJsFn, GoToPreviousBookmark = GoToPreviousBookmark.toJsFn, Parent = Parent.asInstanceOf[js.Any], Pause = Pause.toJsFn, Play = Play.toJsFn, State = State.asInstanceOf[js.Any], Stop = Stop.toJsFn)
    __obj.updateDynamic("PowerPoint.Player_typekey")(PowerPointDotPlayer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  extension [Self <: Player](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCurrentPosition(value: Double): Self = StObject.set(x, "CurrentPosition", value.asInstanceOf[js.Any])
    
    inline def setGoToNextBookmark(value: Callback): Self = StObject.set(x, "GoToNextBookmark", value.toJsFn)
    
    inline def setGoToPreviousBookmark(value: Callback): Self = StObject.set(x, "GoToPreviousBookmark", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Callback): Self = StObject.set(x, "Pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "Play", value.toJsFn)
    
    inline def setPowerPointDotPlayer_typekey(value: Player): Self = StObject.set(x, "PowerPoint.Player_typekey", value.asInstanceOf[js.Any])
    
    inline def setState(value: PpPlayerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "Stop", value.toJsFn)
  }
}
