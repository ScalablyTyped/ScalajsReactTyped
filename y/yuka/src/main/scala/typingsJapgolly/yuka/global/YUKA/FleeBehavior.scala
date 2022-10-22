package typingsJapgolly.yuka.global.YUKA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("YUKA.FleeBehavior")
@js.native
/**
  * Constructs a new flee behavior.
  *
  * @param [target] - The target vector.
  * @param [panicDistance] - The agent only flees from the target if it is inside this radius.
  */
open class FleeBehavior ()
  extends typingsJapgolly.yuka.mod.FleeBehavior {
  def this(target: typingsJapgolly.yuka.srcMathVector3Mod.Vector3) = this()
  def this(target: Unit, panicDistance: Double) = this()
  def this(target: typingsJapgolly.yuka.srcMathVector3Mod.Vector3, panicDistance: Double) = this()
}
