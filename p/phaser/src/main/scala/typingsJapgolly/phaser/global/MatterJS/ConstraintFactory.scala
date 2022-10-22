package typingsJapgolly.phaser.global.MatterJS

import typingsJapgolly.phaser.MatterJS.ConstraintType
import typingsJapgolly.phaser.MatterJS.IConstraintDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MatterJS.ConstraintFactory")
@js.native
open class ConstraintFactory ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.ConstraintFactory {
  
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  /* CompleteClass */
  override def create(options: IConstraintDefinition): ConstraintType = js.native
}
