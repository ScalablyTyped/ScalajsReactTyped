package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplate extends IBase {
  /** [Method] Applies the supplied values to the template and appends the new node s to the specified el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return an Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns an HTML fragment of this template with the specified values applied
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment.
  		*/
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object/Array The template values. See apply.
  		* @param out Array The array to which output is pushed.
  		* @returns Array The given out array.
  		*/
  var applyOut: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] Alias for apply
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment.
  		*/
  var applyTemplate: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Compiles the template into an internal function eliminating the RegEx overhead
  		* @returns Ext.Template this
  		*/
  var compile: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var compiled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableFormats: js.UndefOr[Boolean] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s after el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s before el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return an Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s as the first child of el
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Property] (Boolean) */
  var isTemplate: js.UndefOr[Boolean] = js.undefined
  /** [Method] Applies the supplied values to the template and overwrites the content of el with the new node s
  		* @param el String/HTMLElement/Ext.Element The context element.
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element.
  		*/
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Sets the HTML used as the template and optionally compiles it
  		* @param html String
  		* @param compile Boolean true to compile the template.
  		* @returns Ext.Template this
  		*/
  var set: js.UndefOr[
    js.Function2[
      /* html */ js.UndefOr[java.lang.String], 
      /* compile */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
}

object ITemplate {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    append: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    apply: /* values */ js.UndefOr[js.Any] => CallbackTo[java.lang.String] = null,
    applyOut: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array]) => CallbackTo[Array] = null,
    applyTemplate: /* values */ js.UndefOr[js.Any] => CallbackTo[java.lang.String] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    compile: js.UndefOr[CallbackTo[ITemplate]] = js.undefined,
    compiled: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disableFormats: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insertAfter: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertBefore: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertFirst: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    isTemplate: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    overwrite: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    set: (/* html */ js.UndefOr[java.lang.String], /* compile */ js.UndefOr[Boolean]) => CallbackTo[ITemplate] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITemplate = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => append(t0, t1, t2).runNow()))
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: /* values */ js.UndefOr[js.Any]) => apply(t0).runNow()))
    if (applyOut != null) __obj.updateDynamic("applyOut")(js.Any.fromFunction2((t0: /* values */ js.UndefOr[js.Any], t1: /* out */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => applyOut(t0, t1).runNow()))
    if (applyTemplate != null) __obj.updateDynamic("applyTemplate")(js.Any.fromFunction1((t0: /* values */ js.UndefOr[js.Any]) => applyTemplate(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    compile.foreach(p => __obj.updateDynamic("compile")(p.toJsFn))
    if (!js.isUndefined(compiled)) __obj.updateDynamic("compiled")(compiled.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(disableFormats)) __obj.updateDynamic("disableFormats")(disableFormats.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertAfter(t0, t1, t2).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertBefore(t0, t1, t2).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertFirst(t0, t1, t2).runNow()))
    if (!js.isUndefined(isTemplate)) __obj.updateDynamic("isTemplate")(isTemplate.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (overwrite != null) __obj.updateDynamic("overwrite")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* values */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => overwrite(t0, t1, t2).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* html */ js.UndefOr[java.lang.String], t1: /* compile */ js.UndefOr[scala.Boolean]) => set(t0, t1).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplate]
  }
}

