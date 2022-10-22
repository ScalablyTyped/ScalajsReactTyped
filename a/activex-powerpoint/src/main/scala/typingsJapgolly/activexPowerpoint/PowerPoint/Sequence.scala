package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoRGBType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sequence extends StObject {
  
  /**
    * @param PowerPoint.MsoAnimateByLevel [Level=0]
    * @param PowerPoint.MsoAnimTriggerType [trigger=1]
    * @param number [Index=-1]
    */
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: Unit, trigger: Unit, Index: Double): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: Unit, trigger: MsoAnimTriggerType): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: Unit, trigger: MsoAnimTriggerType, Index: Double): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: MsoAnimateByLevel): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: MsoAnimateByLevel, trigger: Unit, Index: Double): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: MsoAnimateByLevel, trigger: MsoAnimTriggerType): Effect = js.native
  def AddEffect(
    Shape: Shape,
    effectId: MsoAnimEffect,
    Level: MsoAnimateByLevel,
    trigger: MsoAnimTriggerType,
    Index: Double
  ): Effect = js.native
  
  /**
    * @param string [bookmark='']
    * @param PowerPoint.MsoAnimateByLevel [Level=0]
    */
  def AddTriggerEffect(pShape: Shape, effectId: MsoAnimEffect, trigger: MsoAnimTriggerType, pTriggerShape: Shape): Effect = js.native
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: String
  ): Effect = js.native
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: String,
    Level: MsoAnimateByLevel
  ): Effect = js.native
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: Unit,
    Level: MsoAnimateByLevel
  ): Effect = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /** @param number [Index=-1] */
  def Clone(Effect: Effect): Effect = js.native
  def Clone(Effect: Effect, Index: Double): Effect = js.native
  
  /**
    * @param Office.MsoRGBType [DimColor=0]
    * @param PowerPoint.PpColorSchemeIndex [DimSchemeColor=0]
    */
  def ConvertToAfterEffect(Effect: Effect, After: MsoAnimAfterEffect): Effect = js.native
  def ConvertToAfterEffect(Effect: Effect, After: MsoAnimAfterEffect, DimColor: Unit, DimSchemeColor: PpColorSchemeIndex): Effect = js.native
  def ConvertToAfterEffect(Effect: Effect, After: MsoAnimAfterEffect, DimColor: MsoRGBType): Effect = js.native
  def ConvertToAfterEffect(
    Effect: Effect,
    After: MsoAnimAfterEffect,
    DimColor: MsoRGBType,
    DimSchemeColor: PpColorSchemeIndex
  ): Effect = js.native
  
  def ConvertToAnimateBackground(Effect: Effect, AnimateBackground: MsoTriState): Effect = js.native
  
  def ConvertToAnimateInReverse(Effect: Effect, animateInReverse: MsoTriState): Effect = js.native
  
  def ConvertToBuildLevel(Effect: Effect, Level: MsoAnimateByLevel): Effect = js.native
  
  def ConvertToTextUnitEffect(Effect: Effect, unitEffect: MsoAnimTextUnitEffect): Effect = js.native
  
  val Count: Double = js.native
  
  def FindFirstAnimationFor(Shape: Shape): Effect = js.native
  
  def FindFirstAnimationForClick(click: Double): Effect = js.native
  
  def Item(Index: Double): Effect = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.Sequence_typekey")
  var PowerPointDotSequence_typekey: Sequence = js.native
}
