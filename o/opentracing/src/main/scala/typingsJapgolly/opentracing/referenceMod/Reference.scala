package typingsJapgolly.opentracing.referenceMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reference extends js.Object {
  var _referencedContext: typingsJapgolly.opentracing.spanContextMod.default
  var _type: String
  /**
    * @return {SpanContext} The SpanContext being referred to (e.g., the
    *         parent in a REFERENCE_CHILD_OF Reference).
    */
  def referencedContext(): typingsJapgolly.opentracing.spanContextMod.default
  /**
    * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
    *         REFERENCE_FOLLOWS_FROM).
    */
  def `type`(): String
}

object Reference {
  @scala.inline
  def apply(
    _referencedContext: typingsJapgolly.opentracing.spanContextMod.default,
    _type: String,
    referencedContext: CallbackTo[typingsJapgolly.opentracing.spanContextMod.default],
    `type`: CallbackTo[String]
  ): Reference = {
    val __obj = js.Dynamic.literal(_referencedContext = _referencedContext.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any])
    __obj.updateDynamic("referencedContext")(referencedContext.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[Reference]
  }
}

