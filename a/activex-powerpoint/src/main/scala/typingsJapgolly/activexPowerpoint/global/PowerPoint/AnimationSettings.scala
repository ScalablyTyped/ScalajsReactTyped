package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpAdvanceMode
import typingsJapgolly.activexPowerpoint.PowerPoint.PpAfterEffect
import typingsJapgolly.activexPowerpoint.PowerPoint.PpChartUnitEffect
import typingsJapgolly.activexPowerpoint.PowerPoint.PpEntryEffect
import typingsJapgolly.activexPowerpoint.PowerPoint.PpTextLevelEffect
import typingsJapgolly.activexPowerpoint.PowerPoint.PpTextUnitEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.AnimationSettings")
@js.native
/* private */ open class AnimationSettings ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.AnimationSettings {
  
  /* CompleteClass */
  var AdvanceMode: PpAdvanceMode = js.native
  
  /* CompleteClass */
  var AdvanceTime: Double = js.native
  
  /* CompleteClass */
  var AfterEffect: PpAfterEffect = js.native
  
  /* CompleteClass */
  var Animate: MsoTriState = js.native
  
  /* CompleteClass */
  var AnimateBackground: MsoTriState = js.native
  
  /* CompleteClass */
  var AnimateTextInReverse: MsoTriState = js.native
  
  /* CompleteClass */
  var AnimationOrder: Double = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var ChartUnitEffect: PpChartUnitEffect = js.native
  
  /* CompleteClass */
  override val DimColor: typingsJapgolly.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  var EntryEffect: PpEntryEffect = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PlaySettings: typingsJapgolly.activexPowerpoint.PowerPoint.PlaySettings = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.AnimationSettings_typekey")
  var PowerPointDotAnimationSettings_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.AnimationSettings = js.native
  
  /* CompleteClass */
  override val SoundEffect: typingsJapgolly.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  var TextLevelEffect: PpTextLevelEffect = js.native
  
  /* CompleteClass */
  var TextUnitEffect: PpTextUnitEffect = js.native
}
