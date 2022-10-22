package typingsJapgolly.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationBehaviors extends StObject {
  
  /** @param number [Index=-1] */
  def Add(Type: MsoAnimType): AnimationBehavior = js.native
  def Add(Type: MsoAnimType, Index: Double): AnimationBehavior = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): AnimationBehavior = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.AnimationBehaviors_typekey")
  var PowerPointDotAnimationBehaviors_typekey: AnimationBehaviors = js.native
}
