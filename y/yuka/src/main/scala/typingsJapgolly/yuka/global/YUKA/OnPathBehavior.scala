package typingsJapgolly.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.OnPathBehavior")
@js.native
/**
  * Constructs a new on path behavior.
  *
  * @param [path] - The path to stay close to.
  * @param [radius] - Defines the width of the path. With a smaller radius, the vehicle will have to follow the path more closely.
  * @param [predictionFactor] - Determines how far the behavior predicts the movement of the vehicle.
  */
open class OnPathBehavior ()
  extends typingsJapgolly.yuka.mod.OnPathBehavior {
  def this(path: typingsJapgolly.yuka.srcSteeringPathMod.Path) = this()
  def this(path: Unit, radius: Double) = this()
  def this(path: typingsJapgolly.yuka.srcSteeringPathMod.Path, radius: Double) = this()
  def this(path: Unit, radius: Double, predictionFactor: Double) = this()
  def this(path: Unit, radius: Unit, predictionFactor: Double) = this()
  def this(path: typingsJapgolly.yuka.srcSteeringPathMod.Path, radius: Double, predictionFactor: Double) = this()
  def this(path: typingsJapgolly.yuka.srcSteeringPathMod.Path, radius: Unit, predictionFactor: Double) = this()
}
