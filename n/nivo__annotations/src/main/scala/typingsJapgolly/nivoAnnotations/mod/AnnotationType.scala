package typingsJapgolly.nivoAnnotations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.circle
  - typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.dot
  - typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.rect
*/
trait AnnotationType extends js.Object

object AnnotationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.circle = this.cast("circle")
  @scala.inline
  def dot: typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.dot = this.cast("dot")
  @scala.inline
  def rect: typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.rect = this.cast("rect")
}

