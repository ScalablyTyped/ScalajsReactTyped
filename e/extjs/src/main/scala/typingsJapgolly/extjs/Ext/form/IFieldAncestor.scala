package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldAncestor extends IBase {
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], 
      /* valid */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
}

object IFieldAncestor {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    extend: String = null,
    fieldDefaults: js.Any = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IFieldAncestor] = null,
    initFieldAncestor: js.UndefOr[Callback] = js.undefined,
    mixins: js.Any = null,
    onFieldErrorChange: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Callback = null,
    onFieldValidityChange: (/* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], /* valid */ js.UndefOr[Boolean]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IFieldAncestor = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fieldDefaults != null) __obj.updateDynamic("fieldDefaults")(fieldDefaults.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initFieldAncestor.foreach(p => __obj.updateDynamic("initFieldAncestor")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (onFieldErrorChange != null) __obj.updateDynamic("onFieldErrorChange")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.ILabelable], t1: /* error */ js.UndefOr[java.lang.String]) => onFieldErrorChange(t0, t1).runNow()))
    if (onFieldValidityChange != null) __obj.updateDynamic("onFieldValidityChange")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], t1: /* valid */ js.UndefOr[scala.Boolean]) => onFieldValidityChange(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldAncestor]
  }
}

