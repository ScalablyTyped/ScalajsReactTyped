package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpBaselineAlignment
import typingsJapgolly.activexPowerpoint.PowerPoint.PpDirection
import typingsJapgolly.activexPowerpoint.PowerPoint.PpParagraphAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ParagraphFormat")
@js.native
/* private */ open class ParagraphFormat ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.ParagraphFormat {
  
  /* CompleteClass */
  var Alignment: PpParagraphAlignment = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var BaseLineAlignment: PpBaselineAlignment = js.native
  
  /* CompleteClass */
  override val Bullet: typingsJapgolly.activexPowerpoint.PowerPoint.BulletFormat = js.native
  
  /* CompleteClass */
  var FarEastLineBreakControl: MsoTriState = js.native
  
  /* CompleteClass */
  var HangingPunctuation: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleAfter: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleBefore: MsoTriState = js.native
  
  /* CompleteClass */
  var LineRuleWithin: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.ParagraphFormat_typekey")
  var PowerPointDotParagraphFormat_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.ParagraphFormat = js.native
  
  /* CompleteClass */
  var SpaceAfter: Double = js.native
  
  /* CompleteClass */
  var SpaceBefore: Double = js.native
  
  /* CompleteClass */
  var SpaceWithin: Double = js.native
  
  /* CompleteClass */
  var TextDirection: PpDirection = js.native
  
  /* CompleteClass */
  var WordWrap: MsoTriState = js.native
}
