package typingsJapgolly.matterJs.global.Matter

import typingsJapgolly.matterJs.mod.IConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Constraint")
@js.native
open class Constraint ()
  extends typingsJapgolly.matterJs.mod.Constraint
/* static members */
object Constraint {
  
  @JSGlobal("Matter.Constraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @returns {constraint} constraint
    */
  inline def create(options: IConstraintDefinition): typingsJapgolly.matterJs.mod.Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matterJs.mod.Constraint]
  
  /**
    * Returns the world-space position of `constraint.pointA`, accounting for `constraint.bodyA`.
    * @method pointAWorld
    * @param {constraint} constraint
    * @returns {Vector} the world-space position
    */
  inline def pointAWorld(constraint: typingsJapgolly.matterJs.mod.Constraint): typingsJapgolly.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("pointAWorld")(constraint.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matterJs.mod.Vector]
  
  /**
    * Returns the world-space position of `constraint.pointB`, accounting for `constraint.bodyB`.
    * @method pointBWorld
    * @param {constraint} constraint
    * @returns {Vector} the world-space position
    */
  inline def pointBWorld(constraint: typingsJapgolly.matterJs.mod.Constraint): typingsJapgolly.matterJs.mod.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("pointBWorld")(constraint.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matterJs.mod.Vector]
}
