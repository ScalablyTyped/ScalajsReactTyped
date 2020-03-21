package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVersion extends js.Object {
  /** [Method] Create a closure for deprecated code
  		* @param packageName String The package name.
  		* @param since String The last version before it's deprecated.
  		* @param closure Function The callback function to be executed with the specified version is less than the current version.
  		* @param scope Object The execution scope (this) if the closure
  		*/
  var deprecate: js.UndefOr[
    js.Function4[
      /* packageName */ js.UndefOr[java.lang.String], 
      /* since */ js.UndefOr[java.lang.String], 
      /* closure */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Returns whether this version equals to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version equals to the target, false otherwise.
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
  /** [Method] Get the version number of the supplied package name will return the last registered version last Ext setVersion  c
  		* @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
  		* @returns Ext.Version The version.
  		*/
  var getVersion: js.UndefOr[js.Function1[/* packageName */ js.UndefOr[java.lang.String], this.type]] = js.undefined
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
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if greater than the target, false otherwise.
  		*/
  var isGreaterThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if greater than or equal to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if greater than or equal to the target, false otherwise.
  		*/
  var isGreaterThanOrEqual: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if smaller than the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if smaller than the target, false otherwise.
  		*/
  var isLessThan: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Returns whether this version if less than or equal to the supplied argument
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version if less than or equal to the target, false otherwise.
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
  		* @param target String/Number The version to compare with.
  		* @returns Boolean true if this version matches the target, false otherwise.
  		*/
  var `match`: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Set version number for the given package name
  		* @param packageName String The package name, for example: 'core', 'touch', 'extjs'.
  		* @param version String/Ext.Version The version, for example: '1.2.3alpha', '2.4.0-dev'.
  		* @returns any
  		*/
  var setVersion: js.UndefOr[
    js.Function2[/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Returns this format  major minor patch build release
  		* @returns Number[]
  		*/
  var toArray: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method]
  		* @param value Number
  		* @returns Number
  		*/
  var toNumber: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Double]] = js.undefined
}

object IVersion {
  @scala.inline
  def apply(
    deprecate: (/* packageName */ js.UndefOr[java.lang.String], /* since */ js.UndefOr[java.lang.String], /* closure */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    equals: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    getBuild: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMajor: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getMinor: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getPatch: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getRelease: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getShortVersion: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getVersion: /* packageName */ js.UndefOr[java.lang.String] => CallbackTo[IVersion] = null,
    gt: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    gtEq: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isGreaterThan: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isGreaterThanOrEqual: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isLessThan: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    isLessThanOrEqual: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    lt: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    ltEq: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    `match`: /* target */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    setVersion: (/* packageName */ js.UndefOr[java.lang.String], /* version */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    toArray: js.UndefOr[CallbackTo[Array]] = js.undefined,
    toNumber: /* value */ js.UndefOr[Double] => CallbackTo[Double] = null
  ): IVersion = {
    val __obj = js.Dynamic.literal()
    if (deprecate != null) __obj.updateDynamic("deprecate")(js.Any.fromFunction4((t0: /* packageName */ js.UndefOr[java.lang.String], t1: /* since */ js.UndefOr[java.lang.String], t2: /* closure */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => deprecate(t0, t1, t2, t3).runNow()))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => equals(t0).runNow()))
    getBuild.foreach(p => __obj.updateDynamic("getBuild")(p.toJsFn))
    getMajor.foreach(p => __obj.updateDynamic("getMajor")(p.toJsFn))
    getMinor.foreach(p => __obj.updateDynamic("getMinor")(p.toJsFn))
    getPatch.foreach(p => __obj.updateDynamic("getPatch")(p.toJsFn))
    getRelease.foreach(p => __obj.updateDynamic("getRelease")(p.toJsFn))
    getShortVersion.foreach(p => __obj.updateDynamic("getShortVersion")(p.toJsFn))
    if (getVersion != null) __obj.updateDynamic("getVersion")(js.Any.fromFunction1((t0: /* packageName */ js.UndefOr[java.lang.String]) => getVersion(t0).runNow()))
    if (gt != null) __obj.updateDynamic("gt")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => gt(t0).runNow()))
    if (gtEq != null) __obj.updateDynamic("gtEq")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => gtEq(t0).runNow()))
    if (isGreaterThan != null) __obj.updateDynamic("isGreaterThan")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isGreaterThan(t0).runNow()))
    if (isGreaterThanOrEqual != null) __obj.updateDynamic("isGreaterThanOrEqual")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isGreaterThanOrEqual(t0).runNow()))
    if (isLessThan != null) __obj.updateDynamic("isLessThan")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isLessThan(t0).runNow()))
    if (isLessThanOrEqual != null) __obj.updateDynamic("isLessThanOrEqual")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => isLessThanOrEqual(t0).runNow()))
    if (lt != null) __obj.updateDynamic("lt")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => lt(t0).runNow()))
    if (ltEq != null) __obj.updateDynamic("ltEq")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => ltEq(t0).runNow()))
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[js.Any]) => `match`(t0).runNow()))
    if (setVersion != null) __obj.updateDynamic("setVersion")(js.Any.fromFunction2((t0: /* packageName */ js.UndefOr[java.lang.String], t1: /* version */ js.UndefOr[js.Any]) => setVersion(t0, t1).runNow()))
    toArray.foreach(p => __obj.updateDynamic("toArray")(p.toJsFn))
    if (toNumber != null) __obj.updateDynamic("toNumber")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => toNumber(t0).runNow()))
    __obj.asInstanceOf[IVersion]
  }
}

