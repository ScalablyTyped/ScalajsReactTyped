package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXTemplate extends ITemplate {
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object
  		* @param out Object
  		* @param parent Object
  		* @returns Array The given out array.
  		*/
  @JSName("applyOut")
  var applyOut_IXTemplate: js.UndefOr[
    js.Function3[
      /* values */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* parent */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  /** [Config Option] (String/Array) */
  var definitions: js.UndefOr[js.Any] = js.undefined
}

object IXTemplate {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    append: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    apply: /* values */ js.UndefOr[js.Any] => CallbackTo[java.lang.String] = null,
    applyOut: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[js.Any], /* parent */ js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    applyTemplate: /* values */ js.UndefOr[js.Any] => CallbackTo[java.lang.String] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    compile: js.UndefOr[CallbackTo[IXTemplate]] = js.undefined,
    compiled: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    definitions: js.Any = null,
    disableFormats: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IXTemplate] = null,
    insertAfter: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertBefore: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertFirst: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    isTemplate: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    overwrite: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    requires: Array = null,
    self: IClass = null,
    set: (/* html */ js.UndefOr[java.lang.String], /* compile */ js.UndefOr[Boolean]) => CallbackTo[IXTemplate] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IXTemplate = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => append(t0, t1, t2).runNow()))
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: /* values */ js.UndefOr[js.Any]) => apply(t0).runNow()))
    if (applyOut != null) __obj.updateDynamic("applyOut")(js.Any.fromFunction3((t0: /* values */ js.UndefOr[js.Any], t1: /* out */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[js.Any]) => applyOut(t0, t1, t2).runNow()))
    if (applyTemplate != null) __obj.updateDynamic("applyTemplate")(js.Any.fromFunction1((t0: /* values */ js.UndefOr[js.Any]) => applyTemplate(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    compile.foreach(p => __obj.updateDynamic("compile")(p.toJsFn))
    if (!js.isUndefined(compiled)) __obj.updateDynamic("compiled")(compiled.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFormats)) __obj.updateDynamic("disableFormats")(disableFormats.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertAfter(t0, t1, t2).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertBefore(t0, t1, t2).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertFirst(t0, t1, t2).runNow()))
    if (!js.isUndefined(isTemplate)) __obj.updateDynamic("isTemplate")(isTemplate.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (overwrite != null) __obj.updateDynamic("overwrite")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => overwrite(t0, t1, t2).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* html */ js.UndefOr[java.lang.String], t1: /* compile */ js.UndefOr[scala.Boolean]) => set(t0, t1).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXTemplate]
  }
}

