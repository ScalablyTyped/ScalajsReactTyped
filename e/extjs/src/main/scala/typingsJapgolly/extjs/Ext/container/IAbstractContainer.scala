package typingsJapgolly.extjs.Ext.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.IQueryable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined child, down, query, queryBy, queryById */ trait IAbstractContainer extends IComponent {
  /** [Config Option] (String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.undefined
  /** [Method] Adds Component s to this Container
  		* @param component Ext.Component[]|Object[]/Ext.Component.../Object... Either one or more Components to add or an Array of Components to add. See items for additional information.
  		* @returns Ext.Component[]/Ext.Component The Components that were added.
  		*/
  var add: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Invoked after the Container has laid out and rendered if necessary its child Components
  		* @param layout Ext.layout.container.Container
  		*/
  var afterLayout: js.UndefOr[
    js.Function1[
      /* layout */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.container.IContainer], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String[]) */
  var bubbleEvents: js.UndefOr[Array] = js.undefined
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
  		* @param fn Function The function to call
  		* @param scope Object The scope of the function (defaults to current component)
  		* @param args Array The args to call the function with. The current component always passed as the last argument.
  		* @returns Ext.Container this
  		*/
  var cascade: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      typingsJapgolly.extjs.Ext.IContainer
    ]
  ] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector or component
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching child Ext.Component (or null if no match was found).
  		*/
  var child: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Determines whether the passed Component is either an immediate child of this Container or whether it is a descendant
  		* @param comp Ext.Component The Component to test.
  		* @param deep Boolean Pass true to test for the Component being a descendant at any level.
  		* @returns Boolean true if the passed Component is contained at the specified level.
  		*/
  var contains: js.UndefOr[
    js.Function2[/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean], Boolean]
  ] = js.undefined
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object/Function) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var detachOnRemove: js.UndefOr[Boolean] = js.undefined
  /** [Method] Inherit docs Disable all immediate children that was previously disabled Override disable because onDisable only gets
  		* @returns Ext.container.AbstractContainer this
  		*/
  @JSName("disable")
  var disable_IAbstractContainer: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Manually force this container s layout to be recalculated
  		* @returns Ext.container.Container this
  		*/
  var doLayout: js.UndefOr[js.Function0[IContainer]] = js.undefined
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String/Ext.Component An Ext.ComponentQuery selector or Ext.Component. If no selector is specified, the first child will be returned.
  		* @returns Object Ext.Component The matching descendant Ext.Component (or null if no match was found).
  		*/
  var down: js.UndefOr[js.Function1[js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Examines this container s items property and gets a direct child component of this container
  		* @param comp String/Number This parameter may be any of the following:  a String : representing the itemId or id of the child component. a Number : representing the position of the child component within the items property For additional information see Ext.util.MixedCollection.get.
  		* @returns Ext.Component The component (if found).
  		*/
  var getComponent: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Returns the layout instance currently associated with this Container
  		* @returns Ext.layout.container.Container The layout
  		*/
  var getLayout: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.layout.container.IContainer]] = js.undefined
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th
  		* @param deep Object
  		*/
  var getRefItems: js.UndefOr[js.Function1[/* deep */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Inserts a Component into this Container at a specified index
  		* @param index Number The index at which the Component will be inserted into the Container's items collection
  		* @param component Ext.Component/Object The child Component to insert. Ext uses lazy rendering, and will only render the inserted Component should it become necessary. A Component config object may be passed in order to avoid the overhead of constructing a real Component object if lazy rendering might mean that the inserted Component will not be rendered immediately. To take advantage of this 'lazy instantiation', set the Ext.Component.xtype config property to the registered type of the Component wanted. For a list of all available xtypes, see Ext.enums.Widget.
  		* @returns Ext.Component component The Component (or config object) that was inserted with the Container's default config values applied.
  		*/
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any], IComponent]
  ] = js.undefined
  /** [Method] Determines whether this Container is an ancestor of the passed Component
  		* @param possibleDescendant Ext.Component The Component to test for presence within this Container's subtree.
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* possibleDescendant */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Config Option] (Object/Object[]) */
  var items: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.enums.Layout/Object) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Method] Moves a Component within the Container
  		* @param fromIdx Number/Ext.Component The index/component to move.
  		* @param toIdx Number The new index for the Component.
  		* @returns Ext.Component component The Component that was moved.
  		*/
  @JSName("move")
  var move_IAbstractContainer: js.UndefOr[
    js.Function2[/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double], IComponent]
  ] = js.undefined
  /** [Method] This method is invoked after a new Component has been added
  		* @param component Ext.Component
  		* @param position Number
  		*/
  var onAdd: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] This method is invoked before adding a new child Component
  		* @param item Ext.Component
  		*/
  var onBeforeAdd: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need  */
  @JSName("onPosition")
  var onPosition_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This method is invoked after a new Component has been removed
  		* @param component Ext.Component
  		* @param autoDestroy Boolean
  		*/
  var onRemove: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Allows addition of behavior to the resize operation  */
  @JSName("onResize")
  var onResize_IAbstractContainer: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector. If no selector is specified all items will be returned.
  		* @returns Ext.Component[] Components which matched the selector
  		*/
  var query: js.UndefOr[js.Function1[js.UndefOr[String], Array]] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed function
  		* @param fn Function The matcher function. It will be called with a single argument, the component being tested.
  		* @param scope Object The scope in which to run the function. If not specified, it will default to the active component.
  		* @returns Ext.Component[] Components matched by the passed function
  		*/
  var queryBy: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Finds a component at any level under this container matching the id itemId
  		* @param id String The id to find
  		* @returns Ext.Component The matching id, null if not found
  		*/
  var queryById: js.UndefOr[js.Function1[js.UndefOr[String], IComponent]] = js.undefined
  /** [Method] Removes a component from this container
  		* @param component Ext.Component/String The component reference or id to remove.
  		* @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
  		* @returns Ext.Component component The Component that was removed.
  		*/
  var remove: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[js.Any], 
      /* autoDestroy */ js.UndefOr[Boolean], 
      IComponent
    ]
  ] = js.undefined
  /** [Method] Removes all components from this container
  		* @param autoDestroy Boolean True to automatically invoke the removed Component's Ext.Component.destroy function. Defaults to the value of this Container's autoDestroy config.
  		* @returns Ext.Component[] Array of the removed components
  		*/
  var removeAll: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Array]] = js.undefined
  /** [Config Option] (Boolean) */
  var suspendLayout: js.UndefOr[Boolean] = js.undefined
}

object IAbstractContainer {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    activeItem: js.Any = null,
    add: /* component */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    afterLayout: /* layout */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.container.IContainer] => Callback = null,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    bubbleEvents: Array = null,
    cascade: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => CallbackTo[typingsJapgolly.extjs.Ext.IContainer] = null,
    child: js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    contains: (/* comp */ js.UndefOr[IComponent], /* deep */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    defaultType: String = null,
    defaults: js.Any = null,
    detachOnRemove: js.UndefOr[Boolean] = js.undefined,
    disable: js.UndefOr[CallbackTo[IAbstractContainer]] = js.undefined,
    doLayout: js.UndefOr[CallbackTo[IContainer]] = js.undefined,
    down: js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getComponent: /* comp */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    getLayout: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.layout.container.IContainer]] = js.undefined,
    getRefItems: /* deep */ js.UndefOr[js.Any] => Callback = null,
    insert: (/* index */ js.UndefOr[Double], /* component */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    isAncestor: /* possibleDescendant */ js.UndefOr[IComponent] => Callback = null,
    items: js.Any = null,
    layout: js.Any = null,
    move: (/* fromIdx */ js.UndefOr[js.Any], /* toIdx */ js.UndefOr[Double]) => CallbackTo[IComponent] = null,
    onAdd: (/* component */ js.UndefOr[IComponent], /* position */ js.UndefOr[Double]) => Callback = null,
    onBeforeAdd: /* item */ js.UndefOr[IComponent] => Callback = null,
    onPosition: js.UndefOr[Callback] = js.undefined,
    onRemove: (/* component */ js.UndefOr[IComponent], /* autoDestroy */ js.UndefOr[Boolean]) => Callback = null,
    onResize: js.UndefOr[Callback] = js.undefined,
    query: js.UndefOr[String] => CallbackTo[Array] = null,
    queryBy: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    queryById: js.UndefOr[String] => CallbackTo[IComponent] = null,
    remove: (/* component */ js.UndefOr[js.Any], /* autoDestroy */ js.UndefOr[Boolean]) => CallbackTo[IComponent] = null,
    removeAll: /* autoDestroy */ js.UndefOr[Boolean] => CallbackTo[Array] = null,
    suspendLayout: js.UndefOr[Boolean] = js.undefined
  ): IAbstractContainer = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* component */ js.UndefOr[js.Any]) => add(t0).runNow()))
    if (afterLayout != null) __obj.updateDynamic("afterLayout")(js.Any.fromFunction1((t0: /* layout */ js.UndefOr[typingsJapgolly.extjs.Ext.layout.container.IContainer]) => afterLayout(t0).runNow()))
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (cascade != null) __obj.updateDynamic("cascade")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => cascade(t0, t1, t2).runNow()))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => child(t0).runNow()))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction2((t0: /* comp */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent], t1: /* deep */ js.UndefOr[scala.Boolean]) => contains(t0, t1).runNow()))
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(detachOnRemove)) __obj.updateDynamic("detachOnRemove")(detachOnRemove.asInstanceOf[js.Any])
    disable.foreach(p => __obj.updateDynamic("disable")(p.toJsFn))
    doLayout.foreach(p => __obj.updateDynamic("doLayout")(p.toJsFn))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => down(t0).runNow()))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction1((t0: /* comp */ js.UndefOr[js.Any]) => getComponent(t0).runNow()))
    getLayout.foreach(p => __obj.updateDynamic("getLayout")(p.toJsFn))
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction1((t0: /* deep */ js.UndefOr[js.Any]) => getRefItems(t0).runNow()))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* component */ js.UndefOr[js.Any]) => insert(t0, t1).runNow()))
    if (isAncestor != null) __obj.updateDynamic("isAncestor")(js.Any.fromFunction1((t0: /* possibleDescendant */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => isAncestor(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction2((t0: /* fromIdx */ js.UndefOr[js.Any], t1: /* toIdx */ js.UndefOr[scala.Double]) => move(t0, t1).runNow()))
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2((t0: /* component */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent], t1: /* position */ js.UndefOr[scala.Double]) => onAdd(t0, t1).runNow()))
    if (onBeforeAdd != null) __obj.updateDynamic("onBeforeAdd")(js.Any.fromFunction1((t0: /* item */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => onBeforeAdd(t0).runNow()))
    onPosition.foreach(p => __obj.updateDynamic("onPosition")(p.toJsFn))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2((t0: /* component */ js.UndefOr[typingsJapgolly.extjs.Ext.IComponent], t1: /* autoDestroy */ js.UndefOr[scala.Boolean]) => onRemove(t0, t1).runNow()))
    onResize.foreach(p => __obj.updateDynamic("onResize")(p.toJsFn))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => query(t0).runNow()))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any]) => queryBy(t0, t1).runNow()))
    if (queryById != null) __obj.updateDynamic("queryById")(js.Any.fromFunction1((t0: js.UndefOr[java.lang.String]) => queryById(t0).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* component */ js.UndefOr[js.Any], t1: /* autoDestroy */ js.UndefOr[scala.Boolean]) => remove(t0, t1).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* autoDestroy */ js.UndefOr[scala.Boolean]) => removeAll(t0).runNow()))
    if (!js.isUndefined(suspendLayout)) __obj.updateDynamic("suspendLayout")(suspendLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractContainer]
  }
}

