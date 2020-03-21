package typingsJapgolly.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.objection.objectionStrings.ModelValidation
  - typingsJapgolly.objection.objectionStrings.RelationExpression
  - typingsJapgolly.objection.objectionStrings.UnallowedRelation
  - typingsJapgolly.objection.objectionStrings.InvalidGraph
*/
trait ValidationErrorType extends js.Object

object ValidationErrorType {
  @scala.inline
  def InvalidGraph: typingsJapgolly.objection.objectionStrings.InvalidGraph = this.cast("InvalidGraph")
  @scala.inline
  def ModelValidation: typingsJapgolly.objection.objectionStrings.ModelValidation = this.cast("ModelValidation")
  @scala.inline
  def RelationExpression: typingsJapgolly.objection.objectionStrings.RelationExpression = this.cast("RelationExpression")
  @scala.inline
  def UnallowedRelation: typingsJapgolly.objection.objectionStrings.UnallowedRelation = this.cast("UnallowedRelation")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

