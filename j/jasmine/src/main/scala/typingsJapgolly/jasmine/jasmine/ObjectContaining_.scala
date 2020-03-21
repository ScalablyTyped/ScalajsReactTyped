package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jasmine.jasmineStrings.ObjectContaining
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectContaining_[T]
  extends AsymmetricMatcher[js.Any]
     with _Expected[T] {
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ ObjectContaining with js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ ObjectContaining with js.Any
    ]
  ] = js.undefined
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean
}

object ObjectContaining_ {
  @scala.inline
  def apply[T](
    asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => CallbackTo[Boolean],
    jasmineMatches: (js.Any, js.Array[js.Any], js.Array[js.Any]) => CallbackTo[Boolean],
    jasmineToString: js.UndefOr[CallbackTo[String]] = js.undefined,
    `new`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ ObjectContaining with js.Any => CallbackTo[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ ObjectContaining with js.Any
    ] = null
  ): ObjectContaining_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asymmetricMatch")(js.Any.fromFunction2((t0: js.Any, t1: js.Array[typingsJapgolly.jasmine.jasmine.CustomEqualityTester]) => asymmetricMatch(t0, t1).runNow()))
    __obj.updateDynamic("jasmineMatches")(js.Any.fromFunction3((t0: js.Any, t1: js.Array[js.Any], t2: js.Array[js.Any]) => jasmineMatches(t0, t1, t2).runNow()))
    jasmineToString.foreach(p => __obj.updateDynamic("jasmineToString")(p.toJsFn))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typingsJapgolly.jasmine.jasmineStrings.ObjectContaining with js.Any) => `new`(t0).runNow()))
    __obj.asInstanceOf[ObjectContaining_[T]]
  }
}

