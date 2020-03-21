package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IFloating because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined constrain, fixed, focusOnToFront, shadow, shadowOffset, center, doConstrain, setActive, toBack, toFront */ trait IComponent extends IAbstractComponent {
  /** [Method] Called by the layout system after the Component has been laid out  */
  @JSName("afterComponentLayout")
  var afterComponentLayout_IComponent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Invoked after the Component has been hidden
  		* @param callback Function
  		* @param scope Object
  		*/
  var afterHide: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Allows addition of behavior after rendering is complete  */
  @JSName("afterRender")
  var afterRender_IComponent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method called after a Component has been positioned
  		* @param ax Object
  		* @param ay Object
  		*/
  @JSName("afterSetPosition")
  var afterSetPosition_IComponent: js.UndefOr[js.Function2[/* ax */ js.UndefOr[js.Any], /* ay */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Invoked after the Component is shown after onShow is called
  		* @param animateTarget String/Ext.Element
  		* @param callback Function
  		* @param scope Object
  		*/
  var afterShow: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  /** [Method] Invoked before the Component is shown  */
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Bubbles up the component container heirarchy calling the specified function with each component
  		* @param fn Function The function to call
  		* @param scope Object The scope of the function. Defaults to current node.
  		* @param args Array The args to call the function with. Defaults to passing the current component.
  		* @returns Ext.Component this
  		*/
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Cancel any deferred focus on this component */
  var cancelFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Center this Component in its container
  		* @returns Ext.Component this
  		*/
  var center: js.UndefOr[js.Function0[this.type | IComponent]] = js.undefined
  /** [Method] Clone the current component using the original config values passed into this instance by default
  		* @param overrides Object A new config containing any properties to override in the cloned version. An id property can be passed on this object, otherwise one will be generated to avoid duplicates.
  		* @returns Ext.Component clone The cloned copy of this component
  		*/
  var cloneConfig: js.UndefOr[js.Function1[/* overrides */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Number/String) */
  var columnWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.util.Region/Ext.Element) */
  var constrainTo: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/String) */
  var constraintInsets: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultAlign: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Moves this floating Component into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this floating Component was rendered.
  		*/
  var doConstrain: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Find a container above this component at any level by a custom function
  		* @param fn Function The custom function to call with the arguments (container, this component).
  		* @returns Ext.container.Container The first Container for which the custom function returns true
  		*/
  var findParentBy: js.UndefOr[
    js.Function1[/* fn */ js.UndefOr[js.Any], typingsJapgolly.extjs.Ext.container.IContainer]
  ] = js.undefined
  /** [Method] Find a container above this component at any level by xtype or class See also the up method
  		* @param xtype String/Ext.Class The xtype string for a component, or the class of the component directly
  		* @returns Ext.container.Container The first Container which matches the given xtype or class
  		*/
  var findParentByType: js.UndefOr[
    js.Function1[/* xtype */ js.UndefOr[js.Any], typingsJapgolly.extjs.Ext.container.IContainer]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.Container) */
  var floatParent: js.UndefOr[IContainer] = js.undefined
  /** [Method] Try to focus this component
  		* @param selectText Boolean If applicable, true to also select the text in this component
  		* @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds).
  		* @param callback Function Only needed if the delay parameter is used. A function to call upon focus.
  		* @param scope Function Only needed if the delay parameter is used. The scope (this reference) in which to execute the callback.
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  var focus: js.UndefOr[
    js.Function4[
      /* selectText */ js.UndefOr[Boolean], 
      /* delay */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var focusOnToFront: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var formBind: js.UndefOr[Boolean] = js.undefined
  /** [Method] Gets the current XY position of the component s underlying element
  		* @param local Boolean If true the element's left and top are returned instead of page XY.
  		* @returns Number[] The XY position of the element (e.g., [100, 200])
  		*/
  var getPosition: js.UndefOr[js.Function1[/* local */ js.UndefOr[Boolean], Array]] = js.undefined
  /** [Method] Gets the xtype for this component as registered with Ext ComponentManager
  		* @returns String The xtype
  		*/
  var getXType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @param animateTarget String/Ext.Element/Ext.Component only valid for floating Components such as Windows or ToolTips, or regular Components which have been configured with floating: true.. The target to which the Component should animate while hiding.
  		* @param callback Function A callback function to call after the Component is hidden.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to this Component.
  		* @returns Ext.Component this
  		*/
  var hide: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] The initComponent template method is an important initialization step for a Component  */
  var initComponent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event  */
  @JSName("onAdded")
  var onAdded_IComponent: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the destroy operation  */
  var onDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Possibly animates down to a target element
  		* @param animateTarget String/Ext.Element/Ext.Component
  		* @param callback Function
  		* @param scope Object
  		*/
  var onHide: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Allows addition of behavior to the show operation
  		* @param animateTarget String/Ext.Element
  		* @param callback Function
  		* @param scope Object
  		*/
  var onShow: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Invoked after the afterShow method is complete
  		* @param callback Function
  		* @param scope Object
  		*/
  var onShowComplete: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var overflowX: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var overflowY: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] ("north"/"south"/"east"/"west"/"center") */
  var region: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var resizable: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var resizeHandles: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Scrolls this Component s target element by the passed delta values optionally animating
  		* @param deltaX Number/Number[]/Object Either the x delta, an Array specifying x and y deltas or an object with "x" and "y" properties.
  		* @param deltaY Number/Boolean/Object Either the y delta, or an animate flag or config object.
  		* @param animate Boolean/Object Animate flag/config object if the delta values were passed separately.
  		*/
  var scrollBy: js.UndefOr[
    js.Function3[
      /* deltaX */ js.UndefOr[js.Any], 
      /* deltaY */ js.UndefOr[js.Any], 
      /* animate */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var scrollFlags: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method is called internally by Ext ZIndexManager to signal that a floating Component has either been moved to th
  		* @param active Boolean True to activate the Component, false to deactivate it.
  		* @param newActive Ext.Component The newly active Component which is taking over topmost zIndex position.
  		*/
  var setActive: js.UndefOr[js.Function2[js.UndefOr[Boolean], js.UndefOr[this.type | IComponent], Unit]] = js.undefined
  /** [Method] Sets the overflow on the content element of the component
  		* @param scroll Boolean True to allow the Component to auto scroll.
  		* @returns Ext.Component this
  		*/
  var setAutoScroll: js.UndefOr[js.Function1[/* scroll */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Method] This method changes the region config property for this border region
  		* @param region String The new region value ("north", "south", "east" or "west").
  		* @returns String The previous value of the region property.
  		*/
  var setBorderRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
  /** [Method] This method allows you to show or hide a LoadMask on top of this component
  		* @param load Boolean/Object/String True to show the default LoadMask, a config object that will be passed to the LoadMask constructor, or a message String to show. False to hide the current LoadMask.
  		* @param targetEl Boolean True to mask the targetEl of this Component instead of the this.el. For example, setting this to true on a Panel will cause only the body to be masked.
  		* @returns Ext.LoadMask The LoadMask instance that has just been shown.
  		*/
  var setLoading: js.UndefOr[
    js.Function2[/* load */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[Boolean], ILoadMask]
  ] = js.undefined
  /** [Method] Sets the overflow x y on the content element of the component
  		* @param overflowX String The overflow-x value.
  		* @param overflowY String The overflow-y value.
  		* @returns Ext.Component this
  		*/
  var setOverflowXY: js.UndefOr[
    js.Function2[
      /* overflowX */ js.UndefOr[java.lang.String], 
      /* overflowY */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the page XY position of the component
  		* @param x Number/Number[] The new x position or an array of [x,y].
  		* @param y Number The new y position.
  		* @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
  		* @returns Ext.Component this
  		*/
  var setPagePosition: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the left and top of the component
  		* @param x Number/Number[]/Object The new left, an array of [x,y], or animation config object containing x and y properties.
  		* @param y Number The new top.
  		* @param animate Boolean/Object If true, the Component is animated into its new position. You may also pass an animation configuration.
  		* @returns Ext.Component this
  		*/
  var setPosition: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the weight config property for this component
  		* @param weight Number The new weight value.
  		* @returns Number The previous value of the weight property.
  		*/
  var setRegionWeight: js.UndefOr[js.Function1[/* weight */ js.UndefOr[Double], Double]] = js.undefined
  /** [Config Option] (String/Boolean) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var shadowOffset: js.UndefOr[Double] = js.undefined
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
  		* @param animateTarget String/Ext.Element only valid for floating Components such as Windows or ToolTips, or regular Components which have been configured with floating: true. The target from which the Component should animate from while opening.
  		* @param callback Function A callback function to call after the Component is displayed. Only necessary if animation was specified.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to this Component.
  		* @returns Ext.Component this
  		*/
  var show: js.UndefOr[
    js.Function3[
      /* animateTarget */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Displays component at specific xy position
  		* @param x Number/Number[] The new x position or array of [x,y].
  		* @param y Number The new y position
  		* @param animate Boolean/Object True to animate the Component into its new position. You may also pass an animation configuration.
  		* @returns Ext.Component this
  		*/
  var showAt: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[js.Any], 
      /* y */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Shows this component by the specified Component or Element
  		* @param component Ext.Component/Ext.dom.Element The Ext.Component or Ext.Element to show the component by.
  		* @param position String Alignment position as used by Ext.util.Positionable.getAlignToXY. Defaults to defaultAlign.
  		* @param offsets Number[] Alignment offsets as used by Ext.util.Positionable.getAlignToXY.
  		* @returns Ext.Component this
  		*/
  var showBy: js.UndefOr[
    js.Function3[
      /* component */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[Array], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sends this Component to the back of lower z index than any other visible windows
  		* @returns Ext.Component this
  		*/
  var toBack: js.UndefOr[js.Function0[this.type | IComponent]] = js.undefined
  /** [Method] Brings this floating Component to the front of any other visible floating Components managed by the same ZIndexManag
  		* @param preventFocus Boolean Specify true to prevent the Component from being focused.
  		* @returns Ext.Component this
  		*/
  var toFront: js.UndefOr[js.Function1[js.UndefOr[Boolean], this.type | IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var toFrontOnShow: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the current box measurements of the component s underlying element
  		* @param box Object An object in the format {x, y, width, height}
  		* @returns Ext.Component this
  		*/
  var updateBox: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Ext.ZIndexManager) */
  var zIndexManager: js.UndefOr[IZIndexManager] = js.undefined
  /** [Property] (Ext.Container) */
  var zIndexParent: js.UndefOr[IContainer] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    IAbstractComponent: IAbstractComponent = null,
    afterComponentLayout: js.UndefOr[Callback] = js.undefined,
    afterHide: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    afterRender: js.UndefOr[Callback] = js.undefined,
    afterSetPosition: (/* ax */ js.UndefOr[js.Any], /* ay */ js.UndefOr[js.Any]) => Callback = null,
    afterShow: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    beforeShow: js.UndefOr[Callback] = js.undefined,
    bubble: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => CallbackTo[IComponent] = null,
    cancelFocus: js.UndefOr[Callback] = js.undefined,
    center: js.UndefOr[CallbackTo[IComponent | IComponent]] = js.undefined,
    cloneConfig: /* overrides */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    columnWidth: js.Any = null,
    constrain: js.UndefOr[Boolean] = js.undefined,
    constrainTo: js.Any = null,
    constraintInsets: js.Any = null,
    defaultAlign: java.lang.String = null,
    doConstrain: js.UndefOr[js.Any] => Callback = null,
    findParentBy: /* fn */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.extjs.Ext.container.IContainer] = null,
    findParentByType: /* xtype */ js.UndefOr[js.Any] => CallbackTo[typingsJapgolly.extjs.Ext.container.IContainer] = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    floatParent: IContainer = null,
    focus: (/* selectText */ js.UndefOr[Boolean], /* delay */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    focusOnToFront: js.UndefOr[Boolean] = js.undefined,
    formBind: js.UndefOr[Boolean] = js.undefined,
    getPosition: /* local */ js.UndefOr[Boolean] => CallbackTo[Array] = null,
    getXType: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    hide: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    initComponent: js.UndefOr[Callback] = js.undefined,
    onAdded: js.UndefOr[Callback] = js.undefined,
    onDestroy: js.UndefOr[Callback] = js.undefined,
    onHide: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    onShow: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    onShowComplete: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    overflowX: java.lang.String = null,
    overflowY: java.lang.String = null,
    region: js.Any = null,
    resizable: js.Any = null,
    resizeHandles: java.lang.String = null,
    scrollBy: (/* deltaX */ js.UndefOr[js.Any], /* deltaY */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => Callback = null,
    scrollFlags: js.Any = null,
    setActive: (js.UndefOr[Boolean], js.UndefOr[IComponent]) => Callback = null,
    setAutoScroll: /* scroll */ js.UndefOr[Boolean] => CallbackTo[IComponent] = null,
    setBorderRegion: /* region */ js.UndefOr[java.lang.String] => CallbackTo[java.lang.String] = null,
    setLoading: (/* load */ js.UndefOr[js.Any], /* targetEl */ js.UndefOr[Boolean]) => CallbackTo[ILoadMask] = null,
    setOverflowXY: (/* overflowX */ js.UndefOr[java.lang.String], /* overflowY */ js.UndefOr[java.lang.String]) => CallbackTo[IComponent] = null,
    setPagePosition: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    setPosition: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    setRegionWeight: /* weight */ js.UndefOr[Double] => CallbackTo[Double] = null,
    shadow: js.Any = null,
    shadowOffset: Int | Double = null,
    show: (/* animateTarget */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    showAt: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    showBy: (/* component */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array]) => CallbackTo[IComponent] = null,
    toBack: js.UndefOr[CallbackTo[IComponent | IComponent]] = js.undefined,
    toFront: js.UndefOr[Boolean] => CallbackTo[IComponent | IComponent] = null,
    toFrontOnShow: js.UndefOr[Boolean] = js.undefined,
    updateBox: /* box */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    zIndexManager: IZIndexManager = null,
    zIndexParent: IContainer = null
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    if (IAbstractComponent != null) js.Dynamic.global.Object.assign(__obj, IAbstractComponent)
    afterComponentLayout.foreach(p => __obj.updateDynamic("afterComponentLayout")(p.toJsFn))
    if (afterHide != null) __obj.updateDynamic("afterHide")(js.Any.fromFunction2((t0: /* callback */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => afterHide(t0, t1).runNow()))
    afterRender.foreach(p => __obj.updateDynamic("afterRender")(p.toJsFn))
    if (afterSetPosition != null) __obj.updateDynamic("afterSetPosition")(js.Any.fromFunction2((t0: /* ax */ js.UndefOr[js.Any], t1: /* ay */ js.UndefOr[js.Any]) => afterSetPosition(t0, t1).runNow()))
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction3((t0: /* animateTarget */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => afterShow(t0, t1, t2).runNow()))
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.asInstanceOf[js.Any])
    beforeShow.foreach(p => __obj.updateDynamic("beforeShow")(p.toJsFn))
    if (bubble != null) __obj.updateDynamic("bubble")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => bubble(t0, t1, t2).runNow()))
    cancelFocus.foreach(p => __obj.updateDynamic("cancelFocus")(p.toJsFn))
    center.foreach(p => __obj.updateDynamic("center")(p.toJsFn))
    if (cloneConfig != null) __obj.updateDynamic("cloneConfig")(js.Any.fromFunction1((t0: /* overrides */ js.UndefOr[js.Any]) => cloneConfig(t0).runNow()))
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain.asInstanceOf[js.Any])
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(constrainTo.asInstanceOf[js.Any])
    if (constraintInsets != null) __obj.updateDynamic("constraintInsets")(constraintInsets.asInstanceOf[js.Any])
    if (defaultAlign != null) __obj.updateDynamic("defaultAlign")(defaultAlign.asInstanceOf[js.Any])
    if (doConstrain != null) __obj.updateDynamic("doConstrain")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => doConstrain(t0).runNow()))
    if (findParentBy != null) __obj.updateDynamic("findParentBy")(js.Any.fromFunction1((t0: /* fn */ js.UndefOr[js.Any]) => findParentBy(t0).runNow()))
    if (findParentByType != null) __obj.updateDynamic("findParentByType")(js.Any.fromFunction1((t0: /* xtype */ js.UndefOr[js.Any]) => findParentByType(t0).runNow()))
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (floatParent != null) __obj.updateDynamic("floatParent")(floatParent.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction4((t0: /* selectText */ js.UndefOr[scala.Boolean], t1: /* delay */ js.UndefOr[js.Any], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => focus(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(focusOnToFront)) __obj.updateDynamic("focusOnToFront")(focusOnToFront.asInstanceOf[js.Any])
    if (!js.isUndefined(formBind)) __obj.updateDynamic("formBind")(formBind.asInstanceOf[js.Any])
    if (getPosition != null) __obj.updateDynamic("getPosition")(js.Any.fromFunction1((t0: /* local */ js.UndefOr[scala.Boolean]) => getPosition(t0).runNow()))
    getXType.foreach(p => __obj.updateDynamic("getXType")(p.toJsFn))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction3((t0: /* animateTarget */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => hide(t0, t1, t2).runNow()))
    initComponent.foreach(p => __obj.updateDynamic("initComponent")(p.toJsFn))
    onAdded.foreach(p => __obj.updateDynamic("onAdded")(p.toJsFn))
    onDestroy.foreach(p => __obj.updateDynamic("onDestroy")(p.toJsFn))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction3((t0: /* animateTarget */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => onHide(t0, t1, t2).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction3((t0: /* animateTarget */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => onShow(t0, t1, t2).runNow()))
    if (onShowComplete != null) __obj.updateDynamic("onShowComplete")(js.Any.fromFunction2((t0: /* callback */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => onShowComplete(t0, t1).runNow()))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (resizeHandles != null) __obj.updateDynamic("resizeHandles")(resizeHandles.asInstanceOf[js.Any])
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction3((t0: /* deltaX */ js.UndefOr[js.Any], t1: /* deltaY */ js.UndefOr[js.Any], t2: /* animate */ js.UndefOr[js.Any]) => scrollBy(t0, t1, t2).runNow()))
    if (scrollFlags != null) __obj.updateDynamic("scrollFlags")(scrollFlags.asInstanceOf[js.Any])
    if (setActive != null) __obj.updateDynamic("setActive")(js.Any.fromFunction2((t0: js.UndefOr[scala.Boolean], t1: js.UndefOr[typingsJapgolly.extjs.Ext.IComponent]) => setActive(t0, t1).runNow()))
    if (setAutoScroll != null) __obj.updateDynamic("setAutoScroll")(js.Any.fromFunction1((t0: /* scroll */ js.UndefOr[scala.Boolean]) => setAutoScroll(t0).runNow()))
    if (setBorderRegion != null) __obj.updateDynamic("setBorderRegion")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[java.lang.String]) => setBorderRegion(t0).runNow()))
    if (setLoading != null) __obj.updateDynamic("setLoading")(js.Any.fromFunction2((t0: /* load */ js.UndefOr[js.Any], t1: /* targetEl */ js.UndefOr[scala.Boolean]) => setLoading(t0, t1).runNow()))
    if (setOverflowXY != null) __obj.updateDynamic("setOverflowXY")(js.Any.fromFunction2((t0: /* overflowX */ js.UndefOr[java.lang.String], t1: /* overflowY */ js.UndefOr[java.lang.String]) => setOverflowXY(t0, t1).runNow()))
    if (setPagePosition != null) __obj.updateDynamic("setPagePosition")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => setPagePosition(t0, t1, t2).runNow()))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => setPosition(t0, t1, t2).runNow()))
    if (setRegionWeight != null) __obj.updateDynamic("setRegionWeight")(js.Any.fromFunction1((t0: /* weight */ js.UndefOr[scala.Double]) => setRegionWeight(t0).runNow()))
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shadowOffset != null) __obj.updateDynamic("shadowOffset")(shadowOffset.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction3((t0: /* animateTarget */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => show(t0, t1, t2).runNow()))
    if (showAt != null) __obj.updateDynamic("showAt")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[js.Any], t1: /* y */ js.UndefOr[scala.Double], t2: /* animate */ js.UndefOr[js.Any]) => showAt(t0, t1, t2).runNow()))
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction3((t0: /* component */ js.UndefOr[js.Any], t1: /* position */ js.UndefOr[java.lang.String], t2: /* offsets */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => showBy(t0, t1, t2).runNow()))
    toBack.foreach(p => __obj.updateDynamic("toBack")(p.toJsFn))
    if (toFront != null) __obj.updateDynamic("toFront")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => toFront(t0).runNow()))
    if (!js.isUndefined(toFrontOnShow)) __obj.updateDynamic("toFrontOnShow")(toFrontOnShow.asInstanceOf[js.Any])
    if (updateBox != null) __obj.updateDynamic("updateBox")(js.Any.fromFunction1((t0: /* box */ js.UndefOr[js.Any]) => updateBox(t0).runNow()))
    if (zIndexManager != null) __obj.updateDynamic("zIndexManager")(zIndexManager.asInstanceOf[js.Any])
    if (zIndexParent != null) __obj.updateDynamic("zIndexParent")(zIndexParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent]
  }
}

