package typingsJapgolly.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.reactNativeJoi.mod._SchemaLike because Already inherited
- typingsJapgolly.reactNativeJoi.mod._Schema because Already inherited */ @js.native
trait BinarySchema extends AnySchema {
  /**
    * Sets the string encoding format if a string input is converted to a buffer.
    */
  def encoding(encoding: String): this.type = js.native
  /**
    * Specifies the exact length of the buffer:
    */
  def length(limit: Double): this.type = js.native
  /**
    * Specifies the maximum length of the buffer.
    */
  def max(limit: Double): this.type = js.native
  /**
    * Specifies the minimum length of the buffer.
    */
  def min(limit: Double): this.type = js.native
}

