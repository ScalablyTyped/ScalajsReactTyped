package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexPowerpoint.PowerPoint.PpPlayerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Player")
@js.native
/* private */ open class Player ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Player {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var CurrentPosition: Double = js.native
  
  /* CompleteClass */
  override def GoToNextBookmark(): Unit = js.native
  
  /* CompleteClass */
  override def GoToPreviousBookmark(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Pause(): Unit = js.native
  
  /* CompleteClass */
  override def Play(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Player_typekey")
  var PowerPointDotPlayer_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Player = js.native
  
  /* CompleteClass */
  override val State: PpPlayerState = js.native
  
  /* CompleteClass */
  override def Stop(): Unit = js.native
}
