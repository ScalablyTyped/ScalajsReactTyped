package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXTemplateParser extends IBase {
  /** [Method] This method is called to process lt tpl case action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doCase: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl default gt */
  var doDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl else gt */
  var doElse: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl elseif action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doElseIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl gt
  		* @param type String The type of action that is being ended.
  		* @param actions Object The other actions keyed by the attribute name (such as 'exec').
  		*/
  var doEnd: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process text
  		* @param text String
  		*/
  var doEval: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl exec action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name.
  		*/
  var doExec: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process expressions like  expr
  		* @param expr String The body of the expression (inside "{[" and "]}").
  		*/
  var doExpr: js.UndefOr[js.Function1[/* expr */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl for action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doFor: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl foreach action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doForEach: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl if action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doIf: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl switch action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doSwitch: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process simple tags like tag  */
  var doTag: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This method is called to process a piece of raw text from the tpl
  		* @param text String
  		*/
  var doText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] This method is called to process an empty lt tpl gt */
  var doTpl: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Number) */
  var level: js.UndefOr[Double] = js.undefined
}

object IXTemplateParser {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    doCase: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doDefault: js.UndefOr[Callback] = js.undefined,
    doElse: js.UndefOr[Callback] = js.undefined,
    doElseIf: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doEnd: (/* type */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doEval: /* text */ js.UndefOr[java.lang.String] => Callback = null,
    doExec: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doExpr: /* expr */ js.UndefOr[java.lang.String] => Callback = null,
    doFor: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doForEach: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doIf: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doSwitch: (/* action */ js.UndefOr[java.lang.String], /* actions */ js.UndefOr[js.Any]) => Callback = null,
    doTag: js.UndefOr[Callback] = js.undefined,
    doText: /* text */ js.UndefOr[java.lang.String] => Callback = null,
    doTpl: js.UndefOr[Callback] = js.undefined,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IXTemplateParser] = null,
    level: Int | Double = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IXTemplateParser = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (doCase != null) __obj.updateDynamic("doCase")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doCase(t0, t1).runNow()))
    doDefault.foreach(p => __obj.updateDynamic("doDefault")(p.toJsFn))
    doElse.foreach(p => __obj.updateDynamic("doElse")(p.toJsFn))
    if (doElseIf != null) __obj.updateDynamic("doElseIf")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doElseIf(t0, t1).runNow()))
    if (doEnd != null) __obj.updateDynamic("doEnd")(js.Any.fromFunction2((t0: /* type */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doEnd(t0, t1).runNow()))
    if (doEval != null) __obj.updateDynamic("doEval")(js.Any.fromFunction1((t0: /* text */ js.UndefOr[java.lang.String]) => doEval(t0).runNow()))
    if (doExec != null) __obj.updateDynamic("doExec")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doExec(t0, t1).runNow()))
    if (doExpr != null) __obj.updateDynamic("doExpr")(js.Any.fromFunction1((t0: /* expr */ js.UndefOr[java.lang.String]) => doExpr(t0).runNow()))
    if (doFor != null) __obj.updateDynamic("doFor")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doFor(t0, t1).runNow()))
    if (doForEach != null) __obj.updateDynamic("doForEach")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doForEach(t0, t1).runNow()))
    if (doIf != null) __obj.updateDynamic("doIf")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doIf(t0, t1).runNow()))
    if (doSwitch != null) __obj.updateDynamic("doSwitch")(js.Any.fromFunction2((t0: /* action */ js.UndefOr[java.lang.String], t1: /* actions */ js.UndefOr[js.Any]) => doSwitch(t0, t1).runNow()))
    doTag.foreach(p => __obj.updateDynamic("doTag")(p.toJsFn))
    if (doText != null) __obj.updateDynamic("doText")(js.Any.fromFunction1((t0: /* text */ js.UndefOr[java.lang.String]) => doText(t0).runNow()))
    doTpl.foreach(p => __obj.updateDynamic("doTpl")(p.toJsFn))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXTemplateParser]
  }
}

