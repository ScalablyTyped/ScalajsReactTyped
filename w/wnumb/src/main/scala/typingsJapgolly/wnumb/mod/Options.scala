package typingsJapgolly.wnumb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The number of decimals to include in the result. Limited to 7. */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * Reverse the operations set in encoder.
    * Use this option to undo modifications made while encoding the value.
    * function( value ){
    *   return value / 1.32;
    * }
    */
  var decoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  /**
    * Similar to encoder, but applied after all other formatting options are applied.
    */
  var edit: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  /**
    * This is a powerful option to manually modify the slider output.
    * For example, to show a number in another currency:
    * function( value ){
    *  return value * 1.32;
    * }
    */
  var encoder: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  /**
    * The decimal separator.
    * Defaults to '.' if thousand isn't already set to '.'.
    */
  var mark: js.UndefOr[String] = js.undefined
  /**
    * The prefix for negative values. Defaults to '-' if negativeBefore isn't set.
    */
  var negative: js.UndefOr[String] = js.undefined
  /**
    * The prefix for a negative number. Inserted before prefix.
    */
  var negativeBefore: js.UndefOr[String] = js.undefined
  /**
    * A string to prepend to the number. Use cases include prefixing with money symbols such as '$' or '€'.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * A number to append to a number. For example: ',-'.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Separator for large numbers. For example: ' ' would result in a formatted number of 1 000 000.
    */
  var thousand: js.UndefOr[String] = js.undefined
  /**
    * Similar to decoder and the reverse for edit.
    * Applied before all other formatting options are applied.
    */
  var undo: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    decimals: Int | Double = null,
    decoder: /* value */ Double => CallbackTo[Double] = null,
    edit: /* value */ Double => CallbackTo[Double] = null,
    encoder: /* value */ Double => CallbackTo[Double] = null,
    mark: String = null,
    negative: String = null,
    negativeBefore: String = null,
    prefix: String = null,
    suffix: String = null,
    thousand: String = null,
    undo: /* value */ Double => CallbackTo[Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (decoder != null) __obj.updateDynamic("decoder")(js.Any.fromFunction1((t0: /* value */ scala.Double) => decoder(t0).runNow()))
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1((t0: /* value */ scala.Double) => edit(t0).runNow()))
    if (encoder != null) __obj.updateDynamic("encoder")(js.Any.fromFunction1((t0: /* value */ scala.Double) => encoder(t0).runNow()))
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (negativeBefore != null) __obj.updateDynamic("negativeBefore")(negativeBefore.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (thousand != null) __obj.updateDynamic("thousand")(thousand.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(js.Any.fromFunction1((t0: /* value */ scala.Double) => undo(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

