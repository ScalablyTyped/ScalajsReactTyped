package typingsJapgolly.matterJs.global.Matter

import typingsJapgolly.matterJs.mod.IMouseConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.MouseConstraint")
@js.native
open class MouseConstraint ()
  extends typingsJapgolly.matterJs.mod.MouseConstraint
/* static members */
object MouseConstraint {
  
  @JSGlobal("Matter.MouseConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new mouse constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {engine} engine
    * @param {} options
    * @returns {MouseConstraint} A new MouseConstraint
    */
  inline def create(engine: typingsJapgolly.matterJs.mod.Engine): typingsJapgolly.matterJs.mod.MouseConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(engine.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matterJs.mod.MouseConstraint]
  inline def create(engine: typingsJapgolly.matterJs.mod.Engine, options: IMouseConstraintDefinition): typingsJapgolly.matterJs.mod.MouseConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(engine.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.MouseConstraint]
}
