package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.MsoAnimAfterEffect
import typingsJapgolly.activexPowerpoint.PowerPoint.MsoAnimTextUnitEffect
import typingsJapgolly.activexPowerpoint.PowerPoint.MsoAnimateByLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.EffectInformation")
@js.native
/* private */ open class EffectInformation ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.EffectInformation {
  
  /* CompleteClass */
  override val AfterEffect: MsoAnimAfterEffect = js.native
  
  /* CompleteClass */
  override val AnimateBackground: MsoTriState = js.native
  
  /* CompleteClass */
  override val AnimateTextInReverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val BuildByLevelEffect: MsoAnimateByLevel = js.native
  
  /* CompleteClass */
  override val Dim: typingsJapgolly.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PlaySettings: typingsJapgolly.activexPowerpoint.PowerPoint.PlaySettings = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.EffectInformation_typekey")
  var PowerPointDotEffectInformation_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.EffectInformation = js.native
  
  /* CompleteClass */
  override val SoundEffect: typingsJapgolly.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  override val TextUnitEffect: MsoAnimTextUnitEffect = js.native
}
