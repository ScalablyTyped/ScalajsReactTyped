package typingsJapgolly.yuka.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka", "GoalEvaluator")
@js.native
/**
  * Constructs a new goal evaluator.
  *
  * @param characterBias - Can be used to adjust the preferences of agents.
  */
open class GoalEvaluator[T /* <: typingsJapgolly.yuka.srcCoreGameEntityMod.GameEntity */] ()
  extends typingsJapgolly.yuka.srcYukaMod.GoalEvaluator[T] {
  def this(characterBias: Double) = this()
}
