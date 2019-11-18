package typingsJapgolly.jss.jssMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jss.jssNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var onChangeValue: js.UndefOr[
    js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | `false`]
  ] = js.undefined
  var onCreateRule: js.UndefOr[
    js.Function3[/* name */ String, /* decl */ Style, /* options */ RuleOptions, Rule]
  ] = js.undefined
  var onProcessRule: js.UndefOr[js.Function2[/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]], Unit]] = js.undefined
  var onProcessSheet: js.UndefOr[js.Function1[/* sheet */ js.UndefOr[StyleSheet[String]], Unit]] = js.undefined
  var onProcessStyle: js.UndefOr[
    js.Function3[/* style */ Style, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]], Style]
  ] = js.undefined
  var onUpdate: js.UndefOr[
    js.Function3[
      /* data */ js.Object, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String]], 
      Unit
    ]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    onChangeValue: (/* value */ String, /* prop */ String, /* rule */ Rule) => CallbackTo[String | Null | `false`] = null,
    onCreateRule: (/* name */ String, /* decl */ Style, /* options */ RuleOptions) => CallbackTo[Rule] = null,
    onProcessRule: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => Callback = null,
    onProcessSheet: /* sheet */ js.UndefOr[StyleSheet[String]] => Callback = null,
    onProcessStyle: (/* style */ Style, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[Style] = null,
    onUpdate: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => Callback = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (onChangeValue != null) __obj.updateDynamic("onChangeValue")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* prop */ java.lang.String, t2: /* rule */ typingsJapgolly.jss.jssMod.Rule) => onChangeValue(t0, t1, t2).runNow()))
    if (onCreateRule != null) __obj.updateDynamic("onCreateRule")(js.Any.fromFunction3((t0: /* name */ java.lang.String, t1: /* decl */ typingsJapgolly.jss.jssMod.Style, t2: /* options */ typingsJapgolly.jss.jssMod.RuleOptions) => onCreateRule(t0, t1, t2).runNow()))
    if (onProcessRule != null) __obj.updateDynamic("onProcessRule")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.jssMod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.jssMod.StyleSheet[java.lang.String]]) => onProcessRule(t0, t1).runNow()))
    if (onProcessSheet != null) __obj.updateDynamic("onProcessSheet")(js.Any.fromFunction1((t0: /* sheet */ js.UndefOr[typingsJapgolly.jss.jssMod.StyleSheet[java.lang.String]]) => onProcessSheet(t0).runNow()))
    if (onProcessStyle != null) __obj.updateDynamic("onProcessStyle")(js.Any.fromFunction3((t0: /* style */ typingsJapgolly.jss.jssMod.Style, t1: /* rule */ typingsJapgolly.jss.jssMod.Rule, t2: /* sheet */ js.UndefOr[typingsJapgolly.jss.jssMod.StyleSheet[java.lang.String]]) => onProcessStyle(t0, t1, t2).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction3((t0: /* data */ js.Object, t1: /* rule */ typingsJapgolly.jss.jssMod.Rule, t2: /* sheet */ js.UndefOr[typingsJapgolly.jss.jssMod.StyleSheet[java.lang.String]]) => onUpdate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Plugin]
  }
}

