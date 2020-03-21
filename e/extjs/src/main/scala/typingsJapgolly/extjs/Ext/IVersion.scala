package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersion extends js.Object {
  /** [Method] Returns whether this version equals to the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version equals to the target, false otherwise
  		*/
  @JSName("equals")
  var equals_FIVersion: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns the build component value
  		* @returns Number build
  		*/
  var getBuild: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the major component value
  		* @returns Number major
  		*/
  var getMajor: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the minor component value
  		* @returns Number minor
  		*/
  var getMinor: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the patch component value
  		* @returns Number patch
  		*/
  var getPatch: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the release component value
  		* @returns Number release
  		*/
  var getRelease: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns shortVersion version without dots and release
  		* @returns String
  		*/
  var getShortVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Convenient alias to isGreaterThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Convenient alias to isGreaterThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var gtEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if greater than the target, false otherwise
  		*/
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if greater than or equal to the target, false otherwise
  		*/
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if smaller than the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if smaller than the target, false otherwise
  		*/
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if less than or equal to the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version if less than or equal to the target, false otherwise
  		*/
  var isLessThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThan
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var lt: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Convenient alias to isLessThanOrEqual
  		* @param target String/Number
  		* @returns Boolean
  		*/
  var ltEq: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version matches the supplied argument
  		* @param target String/Number The version to compare with
  		* @returns Boolean True if this version matches the target, false otherwise
  		*/
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns this format  major minor patch build release
  		* @returns Number[]
  		*/
  var toArray: js.UndefOr[js.Function0[Array]] = js.undefined
}

object IVersion {
  @scala.inline
  def apply(
    equals: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    getBuild: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMajor: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinor: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getPatch: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getRelease: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getShortVersion: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    gt: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    gtEq: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isGreaterThan: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isGreaterThanOrEqual: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isLessThan: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isLessThanOrEqual: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    lt: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    ltEq: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    `match`: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    toArray: js.UndefOr[CallbackTo[Array]] = js.undefined
  ): IVersion = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => equals(t0).runNow()))
    getBuild.foreach(p => __obj.updateDynamic("getBuild")(p.toJsFn))
    getMajor.foreach(p => __obj.updateDynamic("getMajor")(p.toJsFn))
    getMinor.foreach(p => __obj.updateDynamic("getMinor")(p.toJsFn))
    getPatch.foreach(p => __obj.updateDynamic("getPatch")(p.toJsFn))
    getRelease.foreach(p => __obj.updateDynamic("getRelease")(p.toJsFn))
    getShortVersion.foreach(p => __obj.updateDynamic("getShortVersion")(p.toJsFn))
    if (gt != null) __obj.updateDynamic("gt")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => gt(t0).runNow()))
    if (gtEq != null) __obj.updateDynamic("gtEq")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => gtEq(t0).runNow()))
    if (isGreaterThan != null) __obj.updateDynamic("isGreaterThan")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isGreaterThan(t0).runNow()))
    if (isGreaterThanOrEqual != null) __obj.updateDynamic("isGreaterThanOrEqual")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isGreaterThanOrEqual(t0).runNow()))
    if (isLessThan != null) __obj.updateDynamic("isLessThan")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isLessThan(t0).runNow()))
    if (isLessThanOrEqual != null) __obj.updateDynamic("isLessThanOrEqual")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isLessThanOrEqual(t0).runNow()))
    if (lt != null) __obj.updateDynamic("lt")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => lt(t0).runNow()))
    if (ltEq != null) __obj.updateDynamic("ltEq")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => ltEq(t0).runNow()))
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => `match`(t0).runNow()))
    toArray.foreach(p => __obj.updateDynamic("toArray")(p.toJsFn))
    __obj.asInstanceOf[IVersion]
  }
}

