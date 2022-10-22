package typingsJapgolly.joi.mod

import typingsJapgolly.joi.joiStrings.all
import typingsJapgolly.joi.joiStrings.any
import typingsJapgolly.joi.joiStrings.one
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.joi.mod.Schema because Already inherited */ @js.native
trait AlternativesSchema[TSchema]
  extends StObject
     with AnySchema[TSchema] {
  
  def conditional(ref: String, options: js.Array[WhenOptions]): this.type = js.native
  /**
    * Adds a conditional alternative schema type, either based on another key value, or a schema peeking into the current value.
    */
  def conditional(ref: String, options: WhenOptions): this.type = js.native
  def conditional(ref: Reference, options: js.Array[WhenOptions]): this.type = js.native
  def conditional(ref: Reference, options: WhenOptions): this.type = js.native
  def conditional(ref: Schema[Any], options: WhenSchemaOptions): this.type = js.native
  
  /**
    * Requires the validated value to match a specific set of the provided alternative.try() schemas.
    * Cannot be combined with `alternatives.conditional()`.
    */
  def `match`(mode: any | all | one): this.type = js.native
  
  /**
    * Adds an alternative schema type for attempting to match against the validated value.
    */
  def `try`(types: SchemaLikeWithoutArray*): this.type = js.native
}
