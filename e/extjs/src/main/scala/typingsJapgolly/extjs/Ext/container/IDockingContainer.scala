package typingsJapgolly.extjs.Ext.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDockingContainer extends IBase {
  /** [Method] Adds docked item s to the container
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' parameter on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		* @param pos Number The index at which the Component will be added
  		* @returns Ext.Component[] The added components.
  		*/
  var addDocked: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double], Array]
  ] = js.undefined
  /** [Config Option] (Object) */
  var defaultDockWeights: js.UndefOr[js.Any] = js.undefined
  /** [Method] Finds a docked component by id itemId or position
  		* @param comp String/Number The id, itemId or position of the docked component (see getComponent for details)
  		* @returns Ext.Component The docked component (if found)
  		*/
  var getDockedComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Retrieves an array of all currently docked Components
  		* @param selector String A ComponentQuery selector string to filter the returned items.
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] The array of docked components meeting the specified criteria.
  		*/
  var getDockedItems: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.undefined
  /** [Method] Inserts docked item s to the panel at the indicated position
  		* @param pos Number The index at which the Component will be inserted
  		* @param component Object/Object[] The Component or array of components to add. The components must include a 'dock' paramater on each component to indicate where it should be docked ('top', 'right', 'bottom', 'left').
  		*/
  var insertDocked: js.UndefOr[
    js.Function2[/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Invoked after a docked item is added to the Panel
  		* @param component Ext.Component
  		*/
  var onDockedAdd: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Invoked after a docked item is removed from the Panel
  		* @param component Ext.Component
  		*/
  var onDockedRemove: js.UndefOr[js.Function1[/* component */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Removes the docked item from the panel
  		* @param item Ext.Component The Component to remove.
  		* @param autoDestroy Boolean Destroy the component after removal.
  		*/
  var removeDocked: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
}

object IDockingContainer {
  @scala.inline
  def apply(
    addDocked: (/* component */ js.UndefOr[js.Any], /* pos */ js.UndefOr[Double]) => CallbackTo[Array] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    config: js.Any = null,
    defaultDockWeights: js.Any = null,
    extend: String = null,
    getDockedComponent: /* comp */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    getDockedItems: (/* selector */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => CallbackTo[Array] = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IDockingContainer] = null,
    insertDocked: (/* pos */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => Callback = null,
    mixins: js.Any = null,
    onDockedAdd: /* component */ js.UndefOr[IComponent] => Callback = null,
    onDockedRemove: /* component */ js.UndefOr[IComponent] => Callback = null,
    removeDocked: (/* item */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Callback = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDockingContainer = {
    val __obj = js.Dynamic.literal()
    if (addDocked != null) __obj.updateDynamic("addDocked")(js.Any.fromFunction2((t0: /* component */ js.UndefOr[js.Any], t1: /* pos */ js.UndefOr[scala.Double]) => addDocked(t0, t1).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultDockWeights != null) __obj.updateDynamic("defaultDockWeights")(defaultDockWeights.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDockedComponent != null) __obj.updateDynamic("getDockedComponent")(js.Any.fromFunction1((t0: /* comp */ js.UndefOr[js.Any]) => getDockedComponent(t0).runNow()))
    if (getDockedItems != null) __obj.updateDynamic("getDockedItems")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[java.lang.String], t1: /* beforeBody */ js.UndefOr[scala.Boolean]) => getDockedItems(t0, t1).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertDocked != null) __obj.updateDynamic("insertDocked")(js.Any.fromFunction2((t0: /* pos */ js.UndefOr[scala.Double], t1: /* component */ js.UndefOr[js.Any]) => insertDocked(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (onDockedAdd != null) __obj.updateDynamic("onDockedAdd")(js.Any.fromFunction1((t0: /* component */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => onDockedAdd(t0).runNow()))
    if (onDockedRemove != null) __obj.updateDynamic("onDockedRemove")(js.Any.fromFunction1((t0: /* component */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => onDockedRemove(t0).runNow()))
    if (removeDocked != null) __obj.updateDynamic("removeDocked")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent], t1: /* autoDestroy */ js.UndefOr[scala.Boolean]) => removeDocked(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDockingContainer]
  }
}

