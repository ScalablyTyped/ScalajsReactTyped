package typingsJapgolly.jss.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jss.jssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var onChangeValue: js.UndefOr[
    js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | `false`]
  ] = js.undefined
  var onCreateRule: js.UndefOr[
    js.Function3[/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions, Rule]
  ] = js.undefined
  var onProcessRule: js.UndefOr[
    js.Function2[
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.undefined
  var onProcessSheet: js.UndefOr[
    js.Function1[/* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], Unit]
  ] = js.undefined
  var onProcessStyle: js.UndefOr[
    js.Function3[
      /* style */ JssStyle, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      JssStyle
    ]
  ] = js.undefined
  var onUpdate: js.UndefOr[
    js.Function3[
      /* data */ js.Object, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    onChangeValue: (/* value */ String, /* prop */ String, /* rule */ Rule) => CallbackTo[String | Null | `false`] = null,
    onCreateRule: (/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions) => CallbackTo[Rule] = null,
    onProcessRule: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Callback = null,
    onProcessSheet: /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]] => Callback = null,
    onProcessStyle: (/* style */ JssStyle, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => CallbackTo[JssStyle] = null,
    onUpdate: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Callback = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (onChangeValue != null) __obj.updateDynamic("onChangeValue")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* prop */ java.lang.String, t2: /* rule */ typingsJapgolly.jss.mod.Rule) => onChangeValue(t0, t1, t2).runNow()))
    if (onCreateRule != null) __obj.updateDynamic("onCreateRule")(js.Any.fromFunction3((t0: /* name */ java.lang.String, t1: /* decl */ typingsJapgolly.jss.mod.JssStyle, t2: /* options */ typingsJapgolly.jss.mod.RuleOptions) => onCreateRule(t0, t1, t2).runNow()))
    if (onProcessRule != null) __obj.updateDynamic("onProcessRule")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.mod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String | scala.Double | js.Symbol]]) => onProcessRule(t0, t1).runNow()))
    if (onProcessSheet != null) __obj.updateDynamic("onProcessSheet")(js.Any.fromFunction1((t0: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String | scala.Double | js.Symbol]]) => onProcessSheet(t0).runNow()))
    if (onProcessStyle != null) __obj.updateDynamic("onProcessStyle")(js.Any.fromFunction3((t0: /* style */ typingsJapgolly.jss.mod.JssStyle, t1: /* rule */ typingsJapgolly.jss.mod.Rule, t2: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String | scala.Double | js.Symbol]]) => onProcessStyle(t0, t1, t2).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction3((t0: /* data */ js.Object, t1: /* rule */ typingsJapgolly.jss.mod.Rule, t2: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String | scala.Double | js.Symbol]]) => onUpdate(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Plugin]
  }
}

