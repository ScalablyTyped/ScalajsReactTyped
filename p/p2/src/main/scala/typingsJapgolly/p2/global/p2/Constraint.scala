package typingsJapgolly.p2.global.p2

import typingsJapgolly.p2.mod.ConstraintOptions
import typingsJapgolly.p2.p2Ints.`1`
import typingsJapgolly.p2.p2Ints.`2`
import typingsJapgolly.p2.p2Ints.`3`
import typingsJapgolly.p2.p2Ints.`4`
import typingsJapgolly.p2.p2Ints.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Constraint")
@js.native
open class Constraint protected ()
  extends typingsJapgolly.p2.mod.Constraint {
  def this(
    bodyA: typingsJapgolly.p2.mod.Body,
    bodyB: typingsJapgolly.p2.mod.Body,
    `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Constraint.DISTANCE */ Any
  ) = this()
  def this(
    bodyA: typingsJapgolly.p2.mod.Body,
    bodyB: typingsJapgolly.p2.mod.Body,
    `type`: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Constraint.DISTANCE */ Any,
    options: ConstraintOptions
  ) = this()
}
/* static members */
object Constraint {
  
  @JSGlobal("p2.Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.Constraint.DISTANCE")
  @js.native
  def DISTANCE: `1` = js.native
  inline def DISTANCE_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISTANCE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.GEAR")
  @js.native
  def GEAR: `2` = js.native
  inline def GEAR_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEAR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.LOCK")
  @js.native
  def LOCK: `3` = js.native
  inline def LOCK_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCK")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.PRISMATIC")
  @js.native
  def PRISMATIC: `4` = js.native
  inline def PRISMATIC_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRISMATIC")(x.asInstanceOf[js.Any])
  
  @JSGlobal("p2.Constraint.REVOLUTE")
  @js.native
  def REVOLUTE: `5` = js.native
  inline def REVOLUTE_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REVOLUTE")(x.asInstanceOf[js.Any])
}
