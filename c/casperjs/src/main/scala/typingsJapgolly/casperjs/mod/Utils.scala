package typingsJapgolly.casperjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def betterTypeOf(input: js.Any): js.Any
  def dump(value: js.Any): js.Any
  def fileExt(file: String): js.Any
  def fillBlanks(text: String, pad: Double): js.Any
  def format(f: String, args: js.Any*): js.Any
  def getPropertyPath(obj: js.Any, path: String): js.Any
  def inherits(ctor: js.Any, superCtor: js.Any): js.Any
  def isArray(value: js.Any): js.Any
  def isCasperObject(value: js.Any): js.Any
  def isClipRect(value: js.Any): js.Any
  def isFalsy(subject: js.Any): js.Any
  def isFunction(value: js.Any): js.Any
  def isJsFile(file: String): js.Any
  def isNull(value: js.Any): js.Any
  def isNumber(value: js.Any): js.Any
  def isObject(value: js.Any): js.Any
  def isRegExp(value: js.Any): js.Any
  def isString(value: js.Any): js.Any
  def isTruthy(subject: js.Any): js.Any
  def isType(what: js.Any, `type`: String): js.Any
  def isUndefined(value: js.Any): js.Any
  def isWebPage(what: js.Any): js.Any
  def mergeObjects(origin: js.Any, add: js.Any): js.Any
  def node(name: String, attributes: js.Any): js.Any
  def serialize(value: js.Any): js.Any
  def unique(array: js.Array[_]): js.Any
}

object Utils {
  @scala.inline
  def apply(
    betterTypeOf: js.Any => CallbackTo[js.Any],
    dump: js.Any => CallbackTo[js.Any],
    fileExt: String => CallbackTo[js.Any],
    fillBlanks: (String, Double) => CallbackTo[js.Any],
    format: (String, /* repeated */ js.Any) => CallbackTo[js.Any],
    getPropertyPath: (js.Any, String) => CallbackTo[js.Any],
    inherits: (js.Any, js.Any) => CallbackTo[js.Any],
    isArray: js.Any => CallbackTo[js.Any],
    isCasperObject: js.Any => CallbackTo[js.Any],
    isClipRect: js.Any => CallbackTo[js.Any],
    isFalsy: js.Any => CallbackTo[js.Any],
    isFunction: js.Any => CallbackTo[js.Any],
    isJsFile: String => CallbackTo[js.Any],
    isNull: js.Any => CallbackTo[js.Any],
    isNumber: js.Any => CallbackTo[js.Any],
    isObject: js.Any => CallbackTo[js.Any],
    isRegExp: js.Any => CallbackTo[js.Any],
    isString: js.Any => CallbackTo[js.Any],
    isTruthy: js.Any => CallbackTo[js.Any],
    isType: (js.Any, String) => CallbackTo[js.Any],
    isUndefined: js.Any => CallbackTo[js.Any],
    isWebPage: js.Any => CallbackTo[js.Any],
    mergeObjects: (js.Any, js.Any) => CallbackTo[js.Any],
    node: (String, js.Any) => CallbackTo[js.Any],
    serialize: js.Any => CallbackTo[js.Any],
    unique: js.Array[js.Any] => CallbackTo[js.Any]
  ): Utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("betterTypeOf")(js.Any.fromFunction1((t0: js.Any) => betterTypeOf(t0).runNow()))
    __obj.updateDynamic("dump")(js.Any.fromFunction1((t0: js.Any) => dump(t0).runNow()))
    __obj.updateDynamic("fileExt")(js.Any.fromFunction1((t0: java.lang.String) => fileExt(t0).runNow()))
    __obj.updateDynamic("fillBlanks")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => fillBlanks(t0, t1).runNow()))
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => format(t0, t1).runNow()))
    __obj.updateDynamic("getPropertyPath")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => getPropertyPath(t0, t1).runNow()))
    __obj.updateDynamic("inherits")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => inherits(t0, t1).runNow()))
    __obj.updateDynamic("isArray")(js.Any.fromFunction1((t0: js.Any) => isArray(t0).runNow()))
    __obj.updateDynamic("isCasperObject")(js.Any.fromFunction1((t0: js.Any) => isCasperObject(t0).runNow()))
    __obj.updateDynamic("isClipRect")(js.Any.fromFunction1((t0: js.Any) => isClipRect(t0).runNow()))
    __obj.updateDynamic("isFalsy")(js.Any.fromFunction1((t0: js.Any) => isFalsy(t0).runNow()))
    __obj.updateDynamic("isFunction")(js.Any.fromFunction1((t0: js.Any) => isFunction(t0).runNow()))
    __obj.updateDynamic("isJsFile")(js.Any.fromFunction1((t0: java.lang.String) => isJsFile(t0).runNow()))
    __obj.updateDynamic("isNull")(js.Any.fromFunction1((t0: js.Any) => isNull(t0).runNow()))
    __obj.updateDynamic("isNumber")(js.Any.fromFunction1((t0: js.Any) => isNumber(t0).runNow()))
    __obj.updateDynamic("isObject")(js.Any.fromFunction1((t0: js.Any) => isObject(t0).runNow()))
    __obj.updateDynamic("isRegExp")(js.Any.fromFunction1((t0: js.Any) => isRegExp(t0).runNow()))
    __obj.updateDynamic("isString")(js.Any.fromFunction1((t0: js.Any) => isString(t0).runNow()))
    __obj.updateDynamic("isTruthy")(js.Any.fromFunction1((t0: js.Any) => isTruthy(t0).runNow()))
    __obj.updateDynamic("isType")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => isType(t0, t1).runNow()))
    __obj.updateDynamic("isUndefined")(js.Any.fromFunction1((t0: js.Any) => isUndefined(t0).runNow()))
    __obj.updateDynamic("isWebPage")(js.Any.fromFunction1((t0: js.Any) => isWebPage(t0).runNow()))
    __obj.updateDynamic("mergeObjects")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => mergeObjects(t0, t1).runNow()))
    __obj.updateDynamic("node")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => node(t0, t1).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: js.Any) => serialize(t0).runNow()))
    __obj.updateDynamic("unique")(js.Any.fromFunction1((t0: js.Array[js.Any]) => unique(t0).runNow()))
    __obj.asInstanceOf[Utils]
  }
}

