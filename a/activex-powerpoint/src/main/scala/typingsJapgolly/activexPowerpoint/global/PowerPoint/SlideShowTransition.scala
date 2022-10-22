package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpEntryEffect
import typingsJapgolly.activexPowerpoint.PowerPoint.PpTransitionSpeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SlideShowTransition")
@js.native
/* private */ open class SlideShowTransition ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition {
  
  /* CompleteClass */
  var AdvanceOnClick: MsoTriState = js.native
  
  /* CompleteClass */
  var AdvanceOnTime: MsoTriState = js.native
  
  /* CompleteClass */
  var AdvanceTime: Double = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Duration: Double = js.native
  
  /* CompleteClass */
  var EntryEffect: PpEntryEffect = js.native
  
  /* CompleteClass */
  var Hidden: MsoTriState = js.native
  
  /* CompleteClass */
  var LoopSoundUntilNext: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.SlideShowTransition_typekey")
  var PowerPointDotSlideShowTransition_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  /* CompleteClass */
  override val SoundEffect: typingsJapgolly.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  var Speed: PpTransitionSpeed = js.native
}
