package typingsJapgolly.senchaTouch.Ext.lib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.scroll.IView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends typingsJapgolly.senchaTouch.Ext.IComponent {
  /** [Config Option] (Object/String/Number) */
  var activeItem: js.UndefOr[js.Any] = js.undefined
  /** [Method] Adds one or more Components to this Container
  		* @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
  		* @returns Ext.Component The last item added to the Container from the newItems array.
  		*/
  var add: js.UndefOr[
    js.Function1[/* newItems */ js.UndefOr[js.Any], typingsJapgolly.senchaTouch.Ext.IComponent]
  ] = js.undefined
  /** [Method] Adds an array of Components to this Container
  		* @param items Array The array of items to add to this container.
  		* @returns Array The array of items after they have been added.
  		*/
  var addAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Array]] = js.undefined
  /** [Method] Animates to the supplied activeItem with a specified animation
  		* @param activeItem Object/Number The item or item index to make active.
  		* @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
  		*/
  var animateActiveItem: js.UndefOr[
    js.Function2[/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
  		* @returns Object
  		*/
  var applyMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Object/Boolean) */
  var cardSwitchAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Method] Retrieves the first direct child of this container which matches the passed selector
  		* @param selector String An Ext.ComponentQuery selector.
  		* @returns Ext.Component
  		*/
  var child: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[String], typingsJapgolly.senchaTouch.Ext.IComponent]
  ] = js.undefined
  /** [Config Option] (Object) */
  var control: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultType: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Method] Retrieves the first descendant of this container which matches the passed selector
  		* @param selector String An Ext.ComponentQuery selector.
  		* @returns Ext.Component
  		*/
  var down: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[String], typingsJapgolly.senchaTouch.Ext.IComponent]
  ] = js.undefined
  /** [Method] Returns the value of activeItem
  		* @returns Object/String/Number
  		*/
  var getActiveItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the Component for a given index in the Container s items
  		* @param index Number The index of the Component to return.
  		* @returns Ext.Component The item at the specified index, if found.
  		*/
  var getAt: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typingsJapgolly.senchaTouch.Ext.IComponent]
  ] = js.undefined
  /** [Method] Returns the value of autoDestroy
  		* @returns Boolean
  		*/
  var getAutoDestroy: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Examines this container s items property and gets a direct child component of this container
  		* @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
  		* @returns Ext.Component The component (if found).
  		*/
  var getComponent: js.UndefOr[
    js.Function1[/* component */ js.UndefOr[js.Any], typingsJapgolly.senchaTouch.Ext.IComponent]
  ] = js.undefined
  /** [Method] Returns the value of control
  		* @returns Object
  		*/
  var getControl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaultType
  		* @returns String
  		*/
  var getDefaultType: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
  		* @param component String/Number The id or index of the component to find.
  		* @returns Ext.Component/Boolean The docked component, if found.
  		*/
  var getDockedComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns all the Ext Component docked items in this container
  		* @returns Array The docked items of this container.
  		*/
  var getDockedItems: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of hideOnMaskTap
  		* @returns Boolean
  		*/
  var getHideOnMaskTap: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns all inner items of this container
  		* @returns Array The inner items of this container.
  		*/
  var getInnerItems: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of items
  		* @returns Array/Object
  		*/
  var getItems: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of masked
  		* @returns Boolean/Object/Ext.Mask/Ext.LoadMask
  		*/
  var getMasked: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of modal
  		* @returns Boolean
  		*/
  var getModal: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
  		* @returns Ext.scroll.View The scroll view.
  		*/
  var getScrollable: js.UndefOr[js.Function0[IView]] = js.undefined
  /** [Method] Hides this Component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("hide")
  var hide_IContainer: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.IComponent]] = js.undefined
  /** [Method] Adds a child Component at the given index
  		* @param index Number The index to insert the Component at.
  		* @param item Object The Component to insert.
  		*/
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Array/Object) */
  var items: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/String) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience method which calls setMasked with a value of true to show the mask
  		* @param mask Object
  		*/
  var mask: js.UndefOr[js.Function1[/* mask */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean/Object/Ext.Mask/Ext.LoadMask) */
  var masked: js.UndefOr[js.Any] = js.undefined
  /** [Method] Retrieves all descendant components which match the passed selector
  		* @param selector String Selector complying to an Ext.ComponentQuery selector.
  		* @returns Array Ext.Component's which matched the selector.
  		*/
  var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[String], Array]] = js.undefined
  /** [Method] Removes an item from this Container optionally destroying it
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  var remove: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* destroy */ js.UndefOr[Boolean], 
      typingsJapgolly.senchaTouch.Ext.IComponent
    ]
  ] = js.undefined
  /** [Method] Removes all items currently in the Container optionally destroying them all
  		* @param destroy Boolean If true, destroys each removed Component.
  		* @param everything Boolean If true, completely remove all items including docked / centered and floating items.
  		* @returns Ext.Component this
  		*/
  var removeAll: js.UndefOr[
    js.Function2[
      /* destroy */ js.UndefOr[Boolean], 
      /* everything */ js.UndefOr[Boolean], 
      typingsJapgolly.senchaTouch.Ext.IComponent
    ]
  ] = js.undefined
  /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Removes a docked item from this Container
  		* @param item Object The item to remove.
  		* @param destroy Boolean Calls the Component's destroy method if true.
  		* @returns Ext.Component this
  		*/
  var removeDocked: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* destroy */ js.UndefOr[Boolean], 
      typingsJapgolly.senchaTouch.Ext.IComponent
    ]
  ] = js.undefined
  /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
  		* @param index Number The index of the Component to remove.
  		* @returns Ext.Container this
  		*/
  var removeInnerAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Config Option] (Boolean/String/Object) */
  var scrollable: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of activeItem
  		* @param activeItem Object/String/Number The new value.
  		*/
  var setActiveItem: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of autoDestroy
  		* @param autoDestroy Boolean The new value.
  		*/
  var setAutoDestroy: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of control
  		* @param control Object The new value.
  		*/
  var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of defaultType
  		* @param defaultType String The new value.
  		*/
  var setDefaultType: js.UndefOr[js.Function1[/* defaultType */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of hideOnMaskTap
  		* @param hideOnMaskTap Boolean The new value.
  		*/
  var setHideOnMaskTap: js.UndefOr[js.Function1[/* hideOnMaskTap */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of items
  		* @param items Array/Object The new value.
  		*/
  var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout Object/String The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of masked
  		* @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
  		*/
  var setMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of modal
  		* @param modal Boolean The new value.
  		*/
  var setModal: js.UndefOr[js.Function1[/* modal */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of scrollable
  		* @param scrollable Boolean/String/Object The new value.
  		* @returns Ext.scroll.View The scroll view.
  		*/
  @JSName("setScrollable")
  var setScrollable_IContainer: js.UndefOr[js.Function1[/* scrollable */ js.UndefOr[js.Any], IView]] = js.undefined
  /** [Method] Shows this component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("show")
  var show_IContainer: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.IComponent]] = js.undefined
  /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
  var unmask: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IContainer {
  @scala.inline
  def apply(
    IComponent: typingsJapgolly.senchaTouch.Ext.IComponent = null,
    activeItem: js.Any = null,
    add: /* newItems */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    addAll: /* items */ js.UndefOr[Array] => CallbackTo[Array] = null,
    animateActiveItem: (/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any]) => Callback = null,
    applyMasked: /* masked */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    cardSwitchAnimation: js.Any = null,
    child: /* selector */ js.UndefOr[String] => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    control: js.Any = null,
    defaultType: String = null,
    defaults: js.Any = null,
    down: /* selector */ js.UndefOr[String] => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    getActiveItem: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getAt: /* index */ js.UndefOr[Double] => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    getAutoDestroy: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getComponent: /* component */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    getControl: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDefaultType: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDefaults: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getDockedComponent: /* component */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getDockedItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getHideOnMaskTap: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInnerItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getItems: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getMasked: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModal: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getScrollable: js.UndefOr[CallbackTo[IView]] = js.undefined,
    hide: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent]] = js.undefined,
    insert: (/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any]) => Callback = null,
    items: js.Any = null,
    layout: js.Any = null,
    mask: /* mask */ js.UndefOr[js.Any] => Callback = null,
    masked: js.Any = null,
    query: /* selector */ js.UndefOr[String] => CallbackTo[Array] = null,
    remove: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    removeAll: (/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    removeAt: /* index */ js.UndefOr[Double] => CallbackTo[IContainer] = null,
    removeDocked: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent] = null,
    removeInnerAt: /* index */ js.UndefOr[Double] => CallbackTo[IContainer] = null,
    scrollable: js.Any = null,
    setActiveItem: /* activeItem */ js.UndefOr[js.Any] => Callback = null,
    setAutoDestroy: /* autoDestroy */ js.UndefOr[Boolean] => Callback = null,
    setControl: /* control */ js.UndefOr[js.Any] => Callback = null,
    setDefaultType: /* defaultType */ js.UndefOr[String] => Callback = null,
    setDefaults: /* defaults */ js.UndefOr[js.Any] => Callback = null,
    setHideOnMaskTap: /* hideOnMaskTap */ js.UndefOr[Boolean] => Callback = null,
    setItems: /* items */ js.UndefOr[js.Any] => Callback = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => Callback = null,
    setMasked: /* masked */ js.UndefOr[js.Any] => Callback = null,
    setModal: /* modal */ js.UndefOr[Boolean] => Callback = null,
    setScrollable: /* scrollable */ js.UndefOr[js.Any] => CallbackTo[IView] = null,
    show: js.UndefOr[CallbackTo[typingsJapgolly.senchaTouch.Ext.IComponent]] = js.undefined,
    unmask: js.UndefOr[Callback] = js.undefined
  ): IContainer = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* newItems */ js.UndefOr[js.Any]) => add(t0).runNow()))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => addAll(t0).runNow()))
    if (animateActiveItem != null) __obj.updateDynamic("animateActiveItem")(js.Any.fromFunction2((t0: /* activeItem */ js.UndefOr[js.Any], t1: /* animation */ js.UndefOr[js.Any]) => animateActiveItem(t0, t1).runNow()))
    if (applyMasked != null) __obj.updateDynamic("applyMasked")(js.Any.fromFunction1((t0: /* masked */ js.UndefOr[js.Any]) => applyMasked(t0).runNow()))
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (cardSwitchAnimation != null) __obj.updateDynamic("cardSwitchAnimation")(cardSwitchAnimation.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => child(t0).runNow()))
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => down(t0).runNow()))
    getActiveItem.foreach(p => __obj.updateDynamic("getActiveItem")(p.toJsFn))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getAt(t0).runNow()))
    getAutoDestroy.foreach(p => __obj.updateDynamic("getAutoDestroy")(p.toJsFn))
    if (getComponent != null) __obj.updateDynamic("getComponent")(js.Any.fromFunction1((t0: /* component */ js.UndefOr[js.Any]) => getComponent(t0).runNow()))
    getControl.foreach(p => __obj.updateDynamic("getControl")(p.toJsFn))
    getDefaultType.foreach(p => __obj.updateDynamic("getDefaultType")(p.toJsFn))
    getDefaults.foreach(p => __obj.updateDynamic("getDefaults")(p.toJsFn))
    if (getDockedComponent != null) __obj.updateDynamic("getDockedComponent")(js.Any.fromFunction1((t0: /* component */ js.UndefOr[js.Any]) => getDockedComponent(t0).runNow()))
    getDockedItems.foreach(p => __obj.updateDynamic("getDockedItems")(p.toJsFn))
    getHideOnMaskTap.foreach(p => __obj.updateDynamic("getHideOnMaskTap")(p.toJsFn))
    getInnerItems.foreach(p => __obj.updateDynamic("getInnerItems")(p.toJsFn))
    getItems.foreach(p => __obj.updateDynamic("getItems")(p.toJsFn))
    getMasked.foreach(p => __obj.updateDynamic("getMasked")(p.toJsFn))
    getModal.foreach(p => __obj.updateDynamic("getModal")(p.toJsFn))
    getScrollable.foreach(p => __obj.updateDynamic("getScrollable")(p.toJsFn))
    hide.foreach(p => __obj.updateDynamic("hide")(p.toJsFn))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* item */ js.UndefOr[js.Any]) => insert(t0, t1).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction1((t0: /* mask */ js.UndefOr[js.Any]) => mask(t0).runNow()))
    if (masked != null) __obj.updateDynamic("masked")(masked.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => query(t0).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* destroy */ js.UndefOr[scala.Boolean]) => remove(t0, t1).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction2((t0: /* destroy */ js.UndefOr[scala.Boolean], t1: /* everything */ js.UndefOr[scala.Boolean]) => removeAll(t0, t1).runNow()))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => removeAt(t0).runNow()))
    if (removeDocked != null) __obj.updateDynamic("removeDocked")(js.Any.fromFunction2((t0: /* item */ js.UndefOr[js.Any], t1: /* destroy */ js.UndefOr[scala.Boolean]) => removeDocked(t0, t1).runNow()))
    if (removeInnerAt != null) __obj.updateDynamic("removeInnerAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => removeInnerAt(t0).runNow()))
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (setActiveItem != null) __obj.updateDynamic("setActiveItem")(js.Any.fromFunction1((t0: /* activeItem */ js.UndefOr[js.Any]) => setActiveItem(t0).runNow()))
    if (setAutoDestroy != null) __obj.updateDynamic("setAutoDestroy")(js.Any.fromFunction1((t0: /* autoDestroy */ js.UndefOr[scala.Boolean]) => setAutoDestroy(t0).runNow()))
    if (setControl != null) __obj.updateDynamic("setControl")(js.Any.fromFunction1((t0: /* control */ js.UndefOr[js.Any]) => setControl(t0).runNow()))
    if (setDefaultType != null) __obj.updateDynamic("setDefaultType")(js.Any.fromFunction1((t0: /* defaultType */ js.UndefOr[java.lang.String]) => setDefaultType(t0).runNow()))
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: /* defaults */ js.UndefOr[js.Any]) => setDefaults(t0).runNow()))
    if (setHideOnMaskTap != null) __obj.updateDynamic("setHideOnMaskTap")(js.Any.fromFunction1((t0: /* hideOnMaskTap */ js.UndefOr[scala.Boolean]) => setHideOnMaskTap(t0).runNow()))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Any]) => setItems(t0).runNow()))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1((t0: /* layout */ js.UndefOr[js.Any]) => setLayout(t0).runNow()))
    if (setMasked != null) __obj.updateDynamic("setMasked")(js.Any.fromFunction1((t0: /* masked */ js.UndefOr[js.Any]) => setMasked(t0).runNow()))
    if (setModal != null) __obj.updateDynamic("setModal")(js.Any.fromFunction1((t0: /* modal */ js.UndefOr[scala.Boolean]) => setModal(t0).runNow()))
    if (setScrollable != null) __obj.updateDynamic("setScrollable")(js.Any.fromFunction1((t0: /* scrollable */ js.UndefOr[js.Any]) => setScrollable(t0).runNow()))
    show.foreach(p => __obj.updateDynamic("show")(p.toJsFn))
    unmask.foreach(p => __obj.updateDynamic("unmask")(p.toJsFn))
    __obj.asInstanceOf[IContainer]
  }
}

