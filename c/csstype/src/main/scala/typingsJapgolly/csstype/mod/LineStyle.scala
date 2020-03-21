package typingsJapgolly.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.csstype.csstypeStrings.dashed
  - typingsJapgolly.csstype.csstypeStrings.dotted
  - typingsJapgolly.csstype.csstypeStrings.double
  - typingsJapgolly.csstype.csstypeStrings.groove
  - typingsJapgolly.csstype.csstypeStrings.hidden
  - typingsJapgolly.csstype.csstypeStrings.inset
  - typingsJapgolly.csstype.csstypeStrings.none
  - typingsJapgolly.csstype.csstypeStrings.outset
  - typingsJapgolly.csstype.csstypeStrings.ridge
  - typingsJapgolly.csstype.csstypeStrings.solid
*/
trait LineStyle
  extends _BorderBlockEndProperty[js.Any]
     with _BorderBlockProperty[js.Any]
     with _BorderBlockStartProperty[js.Any]
     with _BorderBottomProperty[js.Any]
     with _BorderInlineEndProperty[js.Any]
     with _BorderInlineProperty[js.Any]
     with _BorderInlineStartProperty[js.Any]
     with _BorderLeftProperty[js.Any]
     with _BorderProperty[js.Any]
     with _BorderRightProperty[js.Any]
     with _BorderStyleProperty
     with _BorderTopProperty[js.Any]
     with _ColumnRuleProperty[js.Any]
     with _ColumnRuleStyleProperty
     with _OutlineProperty[js.Any]
     with _OutlineStyleProperty
     with _WebkitBorderBeforeProperty[js.Any]
     with _WebkitBorderBeforeStyleProperty

object LineStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typingsJapgolly.csstype.csstypeStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typingsJapgolly.csstype.csstypeStrings.dotted = this.cast("dotted")
  @scala.inline
  def double: typingsJapgolly.csstype.csstypeStrings.double = this.cast("double")
  @scala.inline
  def groove: typingsJapgolly.csstype.csstypeStrings.groove = this.cast("groove")
  @scala.inline
  def hidden: typingsJapgolly.csstype.csstypeStrings.hidden = this.cast("hidden")
  @scala.inline
  def inset: typingsJapgolly.csstype.csstypeStrings.inset = this.cast("inset")
  @scala.inline
  def none: typingsJapgolly.csstype.csstypeStrings.none = this.cast("none")
  @scala.inline
  def outset: typingsJapgolly.csstype.csstypeStrings.outset = this.cast("outset")
  @scala.inline
  def ridge: typingsJapgolly.csstype.csstypeStrings.ridge = this.cast("ridge")
  @scala.inline
  def solid: typingsJapgolly.csstype.csstypeStrings.solid = this.cast("solid")
}

