package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.extjs.Ext.enums.IWidget
import typingsJapgolly.extjs.Ext.state.IStateful
import typingsJapgolly.extjs.Ext.util.IPositionable
import typingsJapgolly.extjs.Ext.util.IRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.util.IRenderable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined afterRender, doAutoRender, ensureAttachedToBody, getInsertPosition, initRenderData, onRender, render
- typingsJapgolly.extjs.Ext.util.IElementContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined addChildEls, removeChildEls
- typingsJapgolly.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx
- typingsJapgolly.extjs.Ext.util.IPositionable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined alignTo, anchorTo, calculateConstrainedPosition, getAlignToXY, getAnchorXY, getBox, getConstrainVector, getLocalX, getLocalXY, getLocalY, getOffsetsTo, getRegion, getViewRegion, getX, getXY, getY, move, removeAnchor, setBox, setLocalX, setLocalXY, setLocalY, setRegion, setX, setXY, setY, translatePoints */ trait IAbstractComponent extends IStateful {
  /** [Property] (Boolean) */
  var _isLayoutRoot: js.UndefOr[Boolean] = js.undefined
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Adds a CSS class to the top level element representing this component
  		* @param cls String/String[] The CSS class name to add.
  		* @returns Ext.Component Returns the Component to allow method chaining.
  		*/
  var addClass: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Adds a CSS class to the top level element representing this component
  		* @param cls String/String[] The CSS class name to add.
  		* @returns Ext.Component Returns the Component to allow method chaining.
  		*/
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Adds a cls to the uiCls array which will also call addUIClsToElement and adds to all elements of this component
  		* @param classes String/String[] A string or an array of strings to add to the uiCls.
  		* @param skip Object (Boolean) skip true to skip adding it to the class and do it later (via the return).
  		*/
  var addClsWithUI: js.UndefOr[
    js.Function2[/* classes */ js.UndefOr[js.Any], /* skip */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Save a property to the given state object if it is not its default or configured value
  		* @param state Object The state object.
  		* @param propName String The name of the property on this object to save.
  		* @param value String The value of the state property (defaults to this[propName]).
  		* @returns Boolean The state object or a new object if state was null and the property was saved.
  		*/
  var addPropertyToState: js.UndefOr[
    js.Function3[
      /* state */ js.UndefOr[js.Any], 
      /* propName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String], 
      Boolean
    ]
  ] = js.undefined
  /** [Method] Method which adds a specified UI  uiCls to the components element
  		* @param ui String The UI to remove from the element.
  		*/
  var addUIClsToElement: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Called by the layout system after the Component has been laid out
  		* @param width Number The width that was set
  		* @param height Number The height that was set
  		* @param oldWidth Number/undefined The old width, or undefined if this was the initial layout.
  		* @param oldHeight Number/undefined The old height, or undefined if this was the initial layout.
  		*/
  var afterComponentLayout: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Allows addition of behavior after rendering is complete  */
  var afterRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method called after a Component has been positioned
  		* @param x Number
  		* @param y Number
  		*/
  var afterSetPosition: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Aligns the element with another element relative to the specified anchor points
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var alignTo: js.UndefOr[
    js.Function4[
      js.UndefOr[js.Any], 
      js.UndefOr[java.lang.String], 
      js.UndefOr[Array], 
      js.UndefOr[js.Any], 
      this.type | IPositionable
    ]
  ] = js.undefined
  /** [Method] Anchors an element to another element and realigns it when the window is resized
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
  		* @param callback Function The function to call after the animation finishes
  		* @returns Ext.util.Positionable this
  		*/
  var anchorTo: js.UndefOr[
    js.Function6[
      js.UndefOr[js.Any], 
      js.UndefOr[java.lang.String], 
      js.UndefOr[Array], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      this.type | IPositionable
    ]
  ] = js.undefined
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var autoEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.ComponentLoader/Object/String/Boolean) */
  var autoLoad: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/String/HTMLElement/Ext.Element) */
  var autoRender: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var autoShow: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method to do any pre blur processing
  		* @param e Ext.EventObject The event object
  		*/
  var beforeBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  /** [Method] Occurs before componentLayout is run
  		* @param adjWidth Number The box-adjusted width that was set.
  		* @param adjHeight Number The box-adjusted height that was set.
  		*/
  var beforeComponentLayout: js.UndefOr[
    js.Function2[/* adjWidth */ js.UndefOr[Double], /* adjHeight */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Invoked before the Component is destroyed  */
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method to do any pre focus processing
  		* @param e Ext.EventObject The event object
  		*/
  var beforeFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  /** [Method] Occurs before componentLayout is run  */
  var beforeLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number/String/Boolean) */
  var border: js.UndefOr[js.Any] = js.undefined
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
  		* @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
  		* @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
  		* @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
  		* @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
  		*/
  var calculateConstrainedPosition: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Boolean], js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Config Option] (Object[]) */
  var childEls: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var cls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Object) */
  var componentLayout: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var contentEl: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var contentPaddingProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Disable the component
  		* @param silent Boolean Passing true will suppress the disable event from being fired.
  		*/
  var disable: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Handles autoRender  */
  var doAutoRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] This method needs to be called whenever you change something on this component that requires the Component s layout t
  		* @returns Ext.container.Container this
  		*/
  var doComponentLayout: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.container.IContainer]] = js.undefined
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /** [Method] Enable the component
  		* @param silent Boolean Passing true will suppress the enable event from being fired.
  		*/
  var enable: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Ensures that this component is attached to document body
  		* @param runLayout Boolean True to run the component's layout.
  		*/
  var ensureAttachedToBody: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Retrieves plugin from this component s collection by its ptype
  		* @param ptype String The Plugin's ptype as specified by the class's alias configuration.
  		* @returns Ext.AbstractPlugin plugin instance.
  		*/
  var findPlugin: js.UndefOr[js.Function1[/* ptype */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.undefined
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.undefined
  /** [Method] Forces this component to redo its componentLayout  */
  var forceComponentLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var frame: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Object) */
  var frameSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the x y coordinates to align this element with another element
  		* @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
  		* @param position String The position to align to
  		* @param offsets Number[] Offset the positioning by [x, y]
  		* @returns Number[] [x, y]
  		*/
  var getAlignToXY: js.UndefOr[
    js.Function3[js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
  		* @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
  		* @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
  		* @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
  		* @returns Number[] [x, y] An array containing the element's x and y coordinates
  		*/
  var getAnchorXY: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Boolean], js.UndefOr[js.Any], Array]
  ] = js.undefined
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
  		* @param contentBox Boolean If true a box for the content of the element is returned.
  		* @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
  		* @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
  		*/
  var getBox: js.UndefOr[js.Function2[js.UndefOr[Boolean], js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Provides the link for Observable s fireEvent method to bubble up the ownership hierarchy
  		* @returns Ext.container.Container the Container which owns this Component.
  		*/
  var getBubbleTarget: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.container.IContainer]] = js.undefined
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
  		* @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
  		* @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
  		* @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
  		* @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
  		*/
  var getConstrainVector: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Array], _]] = js.undefined
  /** [Method] Retrieves the top level element representing this component
  		* @returns Ext.dom.Element
  		*/
  var getEl: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined
  /** [Method] Gets the current height of the component s underlying element
  		* @returns Number
  		*/
  var getHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Retrieves the id of this component
  		* @returns String
  		*/
  var getId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] This function takes the position argument passed to onRender and returns a DOM element that you can use in the insert
  		* @param position String/Number/Ext.dom.Element/HTMLElement Index, element id or element you want to put this component before.
  		* @returns HTMLElement DOM element that you can use in the insertBefore
  		*/
  var getInsertPosition: js.UndefOr[js.Function1[js.UndefOr[js.Any], HTMLElement]] = js.undefined
  /** [Method] Returns the value of itemId assigned to this component or when that is not set returns the value of id
  		* @returns String
  		*/
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the Ext ComponentLoader for this Component
  		* @returns Ext.ComponentLoader The loader instance, null if it doesn't exist.
  		*/
  var getLoader: js.UndefOr[js.Function0[IComponentLoader]] = js.undefined
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @returns Number The local x coordinate
  		*/
  var getLocalX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @returns Number[] The local XY position of the element
  		*/
  var getLocalXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
  		* @returns Number The local y coordinate
  		*/
  var getLocalY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the offsets of this element from the passed element
  		* @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
  		* @returns Number[] The XY page offsets (e.g. [100, -200])
  		*/
  var getOffsetsTo: js.UndefOr[js.Function1[js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Retrieves a plugin from this component s collection by its pluginId
  		* @param pluginId String
  		* @returns Ext.AbstractPlugin plugin instance.
  		*/
  var getPlugin: js.UndefOr[js.Function1[/* pluginId */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.undefined
  /** [Method] Returns a region object that defines the area of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
  		*/
  var getRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  /** [Method] Gets the current size of the component s underlying element
  		* @returns Object An object containing the element's size {width: (element width), height: (element height)}
  		*/
  var getSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns an object that describes how this component s width and height are managed
  		* @param ownerCtSizeModel Object
  		* @returns Object The size model for this component.
  		*/
  var getSizeModel: js.UndefOr[js.Function1[/* ownerCtSizeModel */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the content region of this element
  		* @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
  		*/
  var getViewRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  /** [Method] Gets the current width of the component s underlying element
  		* @returns Number
  		*/
  var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Gets the current X position of the DOM element based on page coordinates
  		* @returns Number The X position of the element
  		*/
  var getX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
  		* @returns String The xtype hierarchy string
  		*/
  var getXTypes: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Gets the current position of the DOM element based on page coordinates
  		* @returns Number[] The XY position of the element
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
  		* @returns Number The Y position of the element
  		*/
  var getY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param className String The CSS class to check for.
  		* @returns Boolean true if the class exists, else false.
  		*/
  var hasCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  /** [Method] Checks if there is currently a specified uiCls
  		* @param cls String The cls to check.
  		*/
  var hasUICls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var hideMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Object) */
  var html: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Initialize any events on this component */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
  		* @returns Object Object with keys and values that are going to be applied to the renderTpl
  		*/
  var initRenderData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Tests whether this Component matches the selector string
  		* @param selector String The selector string to test against.
  		* @returns Boolean true if this Component matches the selector.
  		*/
  var is: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  /** [Property] (Boolean) */
  var isComponent: js.UndefOr[Boolean] = js.undefined
  /** [Method] Determines whether this component is the descendant of a particular container
  		* @param container Ext.Container
  		* @returns Boolean true if the component is the descendant of a particular container, otherwise false.
  		*/
  var isDescendantOf: js.UndefOr[js.Function1[/* container */ js.UndefOr[IContainer], Boolean]] = js.undefined
  /** [Method] Method to determine whether this Component is currently disabled
  		* @returns Boolean the disabled state of this Component.
  		*/
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Method to determine whether this Component is draggable
  		* @returns Boolean the draggable state of this component.
  		*/
  var isDraggable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Method to determine whether this Component is droppable
  		* @returns Boolean the droppable state of this component.
  		*/
  var isDroppable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Method to determine whether this Component is floating
  		* @returns Boolean the floating state of this component.
  		*/
  var isFloating: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Method to determine whether this Component is currently set to hidden
  		* @returns Boolean the hidden state of this Component.
  		*/
  var isHidden: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Determines whether this Component is the root of a layout  */
  var isLayoutRoot: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if layout is suspended for this component
  		* @returns Boolean true layout of this component is suspended.
  		*/
  var isLayoutSuspended: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this component is visible
  		* @param deep Boolean Pass true to interrogate the visibility status of all parent Containers to determine whether this Component is truly visible to the user. Generally, to determine whether a Component is hidden, the no argument form is needed. For example when creating dynamically laid out UIs in a hidden Container before showing them.
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  var isVisible: js.UndefOr[js.Function1[/* deep */ js.UndefOr[Boolean], Boolean]] = js.undefined
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component
  		* @param shallow Boolean true to check whether this Component is directly of the specified xtype, false to check whether this Component is descended from the xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  var isXType: js.UndefOr[
    js.Function2[/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean], Boolean]
  ] = js.undefined
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.ComponentLoader/Object) */
  var loader: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var maskOnDisable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minWidth: js.UndefOr[Double] = js.undefined
  /** [Method] Move the element relative to its current position
  		* @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
  		* @param distance Number How far to move the element in pixels
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		*/
  var move: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Double], js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Returns the next node in the Component tree in tree traversal order
  		* @param selector String A ComponentQuery selector to filter the following nodes.
  		* @returns Ext.Component The next node (or the next node which matches the selector). Returns null if there is no matching node.
  		*/
  var nextNode: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
  /** [Method] Returns the next sibling of this Component
  		* @param selector String A ComponentQuery selector to filter the following items.
  		* @returns Ext.Component The next sibling (or the next sibling which matches the selector). Returns null if there is no matching sibling.
  		*/
  var nextSibling: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
  /** [Method] Method to manage awareness of when components are added to their respective Container firing an added event
  		* @param container Ext.container.Container Container which holds the component.
  		* @param pos Number Position at which the component was added.
  		*/
  var onAdded: js.UndefOr[
    js.Function2[
      /* container */ js.UndefOr[typingsJapgolly.extjs.Ext.container.IContainer], 
      /* pos */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Allows addition of behavior to the disable operation  */
  var onDisable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the enable operation  */
  var onEnable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Called after the component is moved this method is empty by default but can be implemented by any subclass that need
  		* @param x Number The new x position.
  		* @param y Number The new y position.
  		*/
  var onPosition: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event
  		* @param destroying Boolean Will be passed as true if the Container performing the remove operation will delete this Component upon remove.
  		*/
  var onRemoved: js.UndefOr[js.Function1[/* destroying */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created
  		* @param parentNode Ext.core.Element The parent Element in which this Component's encapsulating element is contained.
  		* @param containerIdx Number The index within the parent Container's child collection of this Component.
  		*/
  var onRender: js.UndefOr[
    js.Function2[js.UndefOr[typingsJapgolly.extjs.Ext.core.IElement], js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Allows addition of behavior to the resize operation
  		* @param width Object
  		* @param height Object
  		* @param oldWidth Object
  		* @param oldHeight Object
  		*/
  var onResize: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var overCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Container) */
  var ownerCt: js.UndefOr[IContainer] = js.undefined
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.AbstractPlugin[]/Ext.AbstractPlugin/Object[]/Object/Ext.enums.Plugin[]/Ext.enums.Plugin) */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /** [Method] Template method to do any post blur processing
  		* @param e Ext.EventObject The event object
  		*/
  var postBlur: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  /** [Method] Returns the previous node in the Component tree in tree traversal order
  		* @param selector String A ComponentQuery selector to filter the preceding nodes.
  		* @returns Ext.Component The previous node (or the previous node which matches the selector). Returns null if there is no matching node.
  		*/
  var previousNode: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
  /** [Method] Returns the previous sibling of this Component
  		* @param selector String A ComponentQuery selector to filter the preceding items.
  		* @returns Ext.Component The previous sibling (or the previous sibling which matches the selector). Returns null if there is no matching sibling.
  		*/
  var previousSibling: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IComponent]] = js.undefined
  /** [Method] Called by Component doAutoRender Register a Container configured floating true with this Component s ZIndexManager
  		* @param cmp Object
  		*/
  var registerFloatingItem: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Remove any anchor to this element
  		* @returns Ext.util.Positionable this
  		*/
  var removeAnchor: js.UndefOr[js.Function0[this.type | IPositionable]] = js.undefined
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
  		* @param testFn Function The test function.
  		*/
  var removeChildEls: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes a CSS class from the top level element representing this component
  		* @param cls String/String[] The CSS class name to remove.
  		* @returns Ext.Component Returns the Component to allow method chaining.
  		*/
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Removes a cls to the uiCls array which will also call removeUIClsFromElement and removes it from all elements of thi
  		* @param cls String/String[] A string or an array of strings to remove to the uiCls.
  		*/
  var removeClsWithUI: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Method which removes a specified UI  uiCls from the components element
  		* @param ui String The UI to add to the element.
  		*/
  var removeUIClsFromElement: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Renders the Component into the passed HTML element
  		* @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
  		* @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
  		*/
  var render: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var renderData: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var renderSelectors: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var renderTo: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var renderTpl: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var rendered: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var rtl: js.UndefOr[Boolean] = js.undefined
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method]
  		* @param border String/Number The border, see border. If a falsey value is passed the border will be removed.
  		*/
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the element s box
  		* @param box Object The box to fill {x, y, width, height}
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setBox: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], this.type | IPositionable]] = js.undefined
  /** [Method] Enable or disable the component
  		* @param disabled Boolean true to disable.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the dock position of this component in its parent panel
  		* @param dock Object The dock position.
  		* @param layoutParent Boolean true to re-layout parent.
  		* @returns Ext.Component this
  		*/
  var setDocked: js.UndefOr[
    js.Function2[/* dock */ js.UndefOr[js.Any], /* layoutParent */ js.UndefOr[Boolean], IComponent]
  ] = js.undefined
  /** [Method] Sets the height of the component
  		* @param height Number The new height to set. This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. undefined to leave the height unchanged.
  		* @returns Ext.Component this
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], IComponent]] = js.undefined
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @param x Object
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalX: js.UndefOr[js.Function1[js.UndefOr[js.Any | Double], this.type | IPositionable]] = js.undefined
  /** [Method] Overridden in Ext rtl AbstractComponent
  		* @param x Object
  		* @param y Object
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalXY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any | Double], this.type | IPositionable]
  ] = js.undefined
  /** [Method] Sets the local y coordinate of this element using CSS style
  		* @param y Object
  		* @returns Ext.util.Positionable this
  		*/
  var setLocalY: js.UndefOr[js.Function1[js.UndefOr[js.Any | Double], this.type | IPositionable]] = js.undefined
  /** [Method] Sets the margin on the target element
  		* @param margin Number/String The margin to set. See the margin config.
  		*/
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the element s position and size to the specified region
  		* @param region Ext.util.Region The region to fill
  		* @param animate Boolean/Object true for the default animation or a standard Element animation config object
  		* @returns Ext.util.Positionable this
  		*/
  var setRegion: js.UndefOr[js.Function2[js.UndefOr[IRegion], js.UndefOr[js.Any], this.type | IPositionable]] = js.undefined
  /** [Method] Sets the width and height of this Component
  		* @param width Number/String/Object The new width to set. This may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style. A size object in the format {width: widthValue, height: heightValue}. undefined to leave the width unchanged.
  		* @param height Number/String The new height to set (not required if a size object is passed as the first arg). This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used. undefined to leave the height unchanged.
  		* @returns Ext.Component this
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], IComponent]
  ] = js.undefined
  /** [Method] Sets the UI for the component
  		* @param ui String The new UI for the component.
  		*/
  var setUI: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Convenience function to hide or show this component by Boolean
  		* @param visible Boolean true to show, false to hide.
  		* @returns Ext.Component this
  		*/
  var setVisible: js.UndefOr[js.Function1[/* visible */ js.UndefOr[Boolean], IComponent]] = js.undefined
  /** [Method] Sets the width of the component
  		* @param width Number The new width to setThis may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style.
  		* @returns Ext.Component this
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], IComponent]] = js.undefined
  /** [Method] Sets the X position of the DOM element based on page coordinates
  		* @param x Object
  		* @param animate Object
  		* @returns Ext.util.Positionable this
  		*/
  var setX: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Double], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.undefined
  /** [Method] Sets the position of the DOM element in page coordinates
  		* @param xy Object
  		* @param animate Object
  		* @returns Ext.util.Positionable this
  		*/
  var setXY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Array], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.undefined
  /** [Method] Sets the Y position of the DOM element based on page coordinates
  		* @param y Object
  		* @param animate Object
  		* @returns Ext.util.Positionable this
  		*/
  var setY: js.UndefOr[
    js.Function2[js.UndefOr[js.Any | Double], js.UndefOr[js.Any], this.type | IPositionable]
  ] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var shrinkWrap: js.UndefOr[js.Any] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Ext.XTemplate/Ext.Template/String/String[]) */
  var tpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Translates the passed page coordinates into left top css values for the element
  		* @param x Number/Array The page x or an array containing [x, y]
  		* @param y Number The page y, required if x is not an array
  		* @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
  		*/
  var translatePoints: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[Double], _]] = js.undefined
  /** [Config Option] (String) */
  var ui: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Navigates up the ownership hierarchy searching for an ancestor Container which matches any passed simple selector or
  		* @param selector String/Ext.Component The simple selector component or actual component to test. If not passed the immediate owner/activater is returned.
  		* @param limit String/Number/Ext.Component This may be a selector upon which to stop the upward scan, or a limit of teh number of steps, or Component reference to stop on.
  		* @returns Ext.container.Container The matching ancestor Container (or undefined if no match was found).
  		*/
  var up: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* limit */ js.UndefOr[js.Any], 
      typingsJapgolly.extjs.Ext.container.IContainer
    ]
  ] = js.undefined
  /** [Method] Update the content area of a component
  		* @param htmlOrData String/Object If this component has been configured with a template via the tpl config then it will use this argument as data to populate the template. If this component was not configured with a template, the components content area will be updated via Ext.Element update.
  		* @param loadScripts Boolean Only legitimate when using the html configuration.
  		* @param callback Function Only legitimate when using the html configuration. Callback to execute when scripts have finished loading.
  		*/
  var update: js.UndefOr[
    js.Function3[
      /* htmlOrData */ js.UndefOr[js.Any], 
      /* loadScripts */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Updates this component s layout
  		* @param options Object An object with layout options.
  		*/
  var updateLayout: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Ext.enums.Widget) */
  var xtype: js.UndefOr[IWidget] = js.undefined
}

object IAbstractComponent {
  @scala.inline
  def apply(
    _isLayoutRoot: js.UndefOr[Boolean] = js.undefined,
    addChildEls: js.UndefOr[Callback] = js.undefined,
    addClass: /* cls */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    addCls: /* cls */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    addClsWithUI: (/* classes */ js.UndefOr[js.Any], /* skip */ js.UndefOr[js.Any]) => Callback = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    addPropertyToState: (/* state */ js.UndefOr[js.Any], /* propName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => CallbackTo[Boolean] = null,
    addStateEvents: /* events */ js.UndefOr[js.Any] => Callback = null,
    addUIClsToElement: /* ui */ js.UndefOr[java.lang.String] => Callback = null,
    afterComponentLayout: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Callback = null,
    afterRender: js.UndefOr[Callback] = js.undefined,
    afterSetPosition: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    alias: Array = null,
    alignTo: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], js.UndefOr[js.Any]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    alternateClassName: js.Any = null,
    anchorTo: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    animate: js.Any = null,
    applyState: /* state */ js.UndefOr[js.Any] => Callback = null,
    autoEl: js.Any = null,
    autoLoad: js.Any = null,
    autoRender: js.Any = null,
    autoShow: js.UndefOr[Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    beforeBlur: /* e */ js.UndefOr[IEventObject] => Callback = null,
    beforeComponentLayout: (/* adjWidth */ js.UndefOr[Double], /* adjHeight */ js.UndefOr[Double]) => Callback = null,
    beforeDestroy: js.UndefOr[Callback] = js.undefined,
    beforeFocus: /* e */ js.UndefOr[IEventObject] => Callback = null,
    beforeLayout: js.UndefOr[Callback] = js.undefined,
    border: js.Any = null,
    calculateConstrainedPosition: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Boolean], js.UndefOr[Array]) => CallbackTo[Array] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    childEls: Array = null,
    clearListeners: js.UndefOr[Callback] = js.undefined,
    clearManagedListeners: js.UndefOr[Callback] = js.undefined,
    cls: java.lang.String = null,
    componentCls: java.lang.String = null,
    componentLayout: js.Any = null,
    config: js.Any = null,
    contentEl: java.lang.String = null,
    contentPaddingProperty: java.lang.String = null,
    data: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    disable: /* silent */ js.UndefOr[Boolean] => Callback = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledCls: java.lang.String = null,
    doAutoRender: js.UndefOr[Callback] = js.undefined,
    doComponentLayout: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.container.IContainer]] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    enable: /* silent */ js.UndefOr[Boolean] => Callback = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Callback = null,
    ensureAttachedToBody: js.UndefOr[Boolean] => Callback = null,
    extend: java.lang.String = null,
    findPlugin: /* ptype */ js.UndefOr[java.lang.String] => CallbackTo[IAbstractPlugin] = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => CallbackTo[Boolean] = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => CallbackTo[Boolean] = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    forceComponentLayout: js.UndefOr[Callback] = js.undefined,
    frame: js.UndefOr[Boolean] = js.undefined,
    frameSize: js.Any = null,
    getActiveAnimation: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getAlignToXY: (js.UndefOr[js.Any], js.UndefOr[java.lang.String], js.UndefOr[Array]) => CallbackTo[Array] = null,
    getAnchorXY: (js.UndefOr[java.lang.String], js.UndefOr[Boolean], js.UndefOr[js.Any]) => CallbackTo[Array] = null,
    getBox: (js.UndefOr[Boolean], js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    getBubbleTarget: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.container.IContainer]] = js.undefined,
    getConstrainVector: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[Array]) => CallbackTo[js.Any] = null,
    getEl: js.UndefOr[CallbackTo[typingsJapgolly.extjs.Ext.dom.IElement]] = js.undefined,
    getHeight: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getId: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => CallbackTo[js.Any] = null,
    getInsertPosition: js.UndefOr[js.Any] => CallbackTo[HTMLElement] = null,
    getItemId: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getLoader: js.UndefOr[CallbackTo[IComponentLoader]] = js.undefined,
    getLocalX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getLocalXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getLocalY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getOffsetsTo: js.UndefOr[js.Any] => CallbackTo[Array] = null,
    getPlugin: /* pluginId */ js.UndefOr[java.lang.String] => CallbackTo[IAbstractPlugin] = null,
    getRegion: js.UndefOr[CallbackTo[IRegion]] = js.undefined,
    getSize: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getSizeModel: /* ownerCtSizeModel */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    getState: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getViewRegion: js.UndefOr[CallbackTo[IRegion]] = js.undefined,
    getWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXTypes: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    hasActiveFx: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    hasCls: /* className */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    hasListeners: js.Any = null,
    hasUICls: /* cls */ js.UndefOr[java.lang.String] => Callback = null,
    height: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hideMode: java.lang.String = null,
    html: js.Any = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[IAbstractComponent] = null,
    initEvents: js.UndefOr[Callback] = js.undefined,
    initRenderData: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    is: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[Boolean] = null,
    isComponent: js.UndefOr[Boolean] = js.undefined,
    isDescendantOf: /* container */ js.UndefOr[IContainer] => CallbackTo[Boolean] = null,
    isDisabled: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isDraggable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isDroppable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFloating: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isHidden: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLayoutRoot: js.UndefOr[Callback] = js.undefined,
    isLayoutSuspended: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isVisible: /* deep */ js.UndefOr[Boolean] => CallbackTo[Boolean] = null,
    isXType: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    itemId: java.lang.String = null,
    listeners: js.Any = null,
    loader: js.Any = null,
    margin: js.Any = null,
    maskOnDisable: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    move: (js.UndefOr[java.lang.String], js.UndefOr[Double], js.UndefOr[js.Any]) => Callback = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    nextNode: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[IComponent] = null,
    nextSibling: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[IComponent] = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onAdded: (/* container */ js.UndefOr[typingsJapgolly.extjs.Ext.container.IContainer], /* pos */ js.UndefOr[Double]) => Callback = null,
    onDisable: js.UndefOr[Callback] = js.undefined,
    onEnable: js.UndefOr[Callback] = js.undefined,
    onPosition: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    onRemoved: /* destroying */ js.UndefOr[Boolean] => Callback = null,
    onRender: (js.UndefOr[typingsJapgolly.extjs.Ext.core.IElement], js.UndefOr[Double]) => Callback = null,
    onResize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Callback = null,
    overCls: java.lang.String = null,
    ownerCt: IContainer = null,
    padding: js.Any = null,
    plugins: js.Any = null,
    postBlur: /* e */ js.UndefOr[IEventObject] => Callback = null,
    previousNode: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[IComponent] = null,
    previousSibling: /* selector */ js.UndefOr[java.lang.String] => CallbackTo[IComponent] = null,
    registerFloatingItem: /* cmp */ js.UndefOr[js.Any] => Callback = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => CallbackTo[js.Any] = null,
    removeAnchor: js.UndefOr[CallbackTo[IAbstractComponent | IPositionable]] = js.undefined,
    removeChildEls: js.UndefOr[js.Any] => Callback = null,
    removeCls: /* cls */ js.UndefOr[js.Any] => CallbackTo[IComponent] = null,
    removeClsWithUI: /* cls */ js.UndefOr[js.Any] => Callback = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    removeUIClsFromElement: /* ui */ js.UndefOr[java.lang.String] => Callback = null,
    render: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Callback = null,
    renderData: js.Any = null,
    renderSelectors: js.Any = null,
    renderTo: js.Any = null,
    renderTpl: js.Any = null,
    rendered: js.UndefOr[Boolean] = js.undefined,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Callback = null,
    resumeEvents: js.UndefOr[Callback] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined,
    saveDelay: Int | Double = null,
    savePropToState: (/* propName */ js.UndefOr[java.lang.String], /* state */ js.UndefOr[js.Any], /* stateName */ js.UndefOr[java.lang.String]) => CallbackTo[Boolean] = null,
    savePropsToState: (/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    saveState: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    sequenceFx: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setBorder: /* border */ js.UndefOr[js.Any] => Callback = null,
    setBox: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Callback = null,
    setDocked: (/* dock */ js.UndefOr[js.Any], /* layoutParent */ js.UndefOr[Boolean]) => CallbackTo[IComponent] = null,
    setHeight: /* height */ js.UndefOr[Double] => CallbackTo[IComponent] = null,
    setLocalX: js.UndefOr[js.Any | Double] => CallbackTo[IAbstractComponent | IPositionable] = null,
    setLocalXY: (js.UndefOr[js.Any], js.UndefOr[js.Any | Double]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    setLocalY: js.UndefOr[js.Any | Double] => CallbackTo[IAbstractComponent | IPositionable] = null,
    setMargin: /* margin */ js.UndefOr[js.Any] => Callback = null,
    setRegion: (js.UndefOr[IRegion], js.UndefOr[js.Any]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => CallbackTo[IComponent] = null,
    setUI: /* ui */ js.UndefOr[java.lang.String] => Callback = null,
    setVisible: /* visible */ js.UndefOr[Boolean] => CallbackTo[IComponent] = null,
    setWidth: /* width */ js.UndefOr[Double] => CallbackTo[IComponent] = null,
    setX: (js.UndefOr[js.Any | Double], js.UndefOr[js.Any]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    setXY: (js.UndefOr[js.Any | Array], js.UndefOr[js.Any]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    setY: (js.UndefOr[js.Any | Double], js.UndefOr[js.Any]) => CallbackTo[IAbstractComponent | IPositionable] = null,
    shrinkWrap: js.Any = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    stateEvents: Array = null,
    stateId: java.lang.String = null,
    stateful: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stopAnimation: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    stopFx: js.UndefOr[CallbackTo[IElement]] = js.undefined,
    style: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Callback = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Callback = null,
    syncFx: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    tpl: js.Any = null,
    tplWriteMode: java.lang.String = null,
    translatePoints: (js.UndefOr[js.Any], js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    ui: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    up: (/* selector */ js.UndefOr[js.Any], /* limit */ js.UndefOr[js.Any]) => CallbackTo[typingsJapgolly.extjs.Ext.container.IContainer] = null,
    update: (/* htmlOrData */ js.UndefOr[js.Any], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any]) => Callback = null,
    updateLayout: /* options */ js.UndefOr[js.Any] => Callback = null,
    uses: Array = null,
    width: Int | Double = null,
    xtype: IWidget = null
  ): IAbstractComponent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_isLayoutRoot)) __obj.updateDynamic("_isLayoutRoot")(_isLayoutRoot.asInstanceOf[js.Any])
    addChildEls.foreach(p => __obj.updateDynamic("addChildEls")(p.toJsFn))
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[js.Any]) => addClass(t0).runNow()))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[js.Any]) => addCls(t0).runNow()))
    if (addClsWithUI != null) __obj.updateDynamic("addClsWithUI")(js.Any.fromFunction2((t0: /* classes */ js.UndefOr[js.Any], t1: /* skip */ js.UndefOr[js.Any]) => addClsWithUI(t0, t1).runNow()))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => addEvents(t0).runNow()))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => addListener(t0, t1, t2, t3).runNow()))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => addManagedListener(t0, t1, t2, t3, t4).runNow()))
    if (addPropertyToState != null) __obj.updateDynamic("addPropertyToState")(js.Any.fromFunction3((t0: /* state */ js.UndefOr[js.Any], t1: /* propName */ js.UndefOr[java.lang.String], t2: /* value */ js.UndefOr[java.lang.String]) => addPropertyToState(t0, t1, t2).runNow()))
    if (addStateEvents != null) __obj.updateDynamic("addStateEvents")(js.Any.fromFunction1((t0: /* events */ js.UndefOr[js.Any]) => addStateEvents(t0).runNow()))
    if (addUIClsToElement != null) __obj.updateDynamic("addUIClsToElement")(js.Any.fromFunction1((t0: /* ui */ js.UndefOr[java.lang.String]) => addUIClsToElement(t0).runNow()))
    if (afterComponentLayout != null) __obj.updateDynamic("afterComponentLayout")(js.Any.fromFunction4((t0: /* width */ js.UndefOr[scala.Double], t1: /* height */ js.UndefOr[scala.Double], t2: /* oldWidth */ js.UndefOr[js.Any], t3: /* oldHeight */ js.UndefOr[js.Any]) => afterComponentLayout(t0, t1, t2, t3).runNow()))
    afterRender.foreach(p => __obj.updateDynamic("afterRender")(p.toJsFn))
    if (afterSetPosition != null) __obj.updateDynamic("afterSetPosition")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => afterSetPosition(t0, t1).runNow()))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alignTo != null) __obj.updateDynamic("alignTo")(js.Any.fromFunction4((t0: js.UndefOr[js.Any], t1: js.UndefOr[java.lang.String], t2: js.UndefOr[typingsJapgolly.extjs.Ext.Array], t3: js.UndefOr[js.Any]) => alignTo(t0, t1, t2, t3).runNow()))
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (anchorTo != null) __obj.updateDynamic("anchorTo")(js.Any.fromFunction6((t0: js.UndefOr[js.Any], t1: js.UndefOr[java.lang.String], t2: js.UndefOr[typingsJapgolly.extjs.Ext.Array], t3: js.UndefOr[js.Any], t4: js.UndefOr[js.Any], t5: js.UndefOr[js.Any]) => anchorTo(t0, t1, t2, t3, t4, t5).runNow()))
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (applyState != null) __obj.updateDynamic("applyState")(js.Any.fromFunction1((t0: /* state */ js.UndefOr[js.Any]) => applyState(t0).runNow()))
    if (autoEl != null) __obj.updateDynamic("autoEl")(autoEl.asInstanceOf[js.Any])
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (autoRender != null) __obj.updateDynamic("autoRender")(autoRender.asInstanceOf[js.Any])
    if (!js.isUndefined(autoShow)) __obj.updateDynamic("autoShow")(autoShow.asInstanceOf[js.Any])
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls.asInstanceOf[js.Any])
    if (beforeBlur != null) __obj.updateDynamic("beforeBlur")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.extjs.Ext.IEventObject]) => beforeBlur(t0).runNow()))
    if (beforeComponentLayout != null) __obj.updateDynamic("beforeComponentLayout")(js.Any.fromFunction2((t0: /* adjWidth */ js.UndefOr[scala.Double], t1: /* adjHeight */ js.UndefOr[scala.Double]) => beforeComponentLayout(t0, t1).runNow()))
    beforeDestroy.foreach(p => __obj.updateDynamic("beforeDestroy")(p.toJsFn))
    if (beforeFocus != null) __obj.updateDynamic("beforeFocus")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.extjs.Ext.IEventObject]) => beforeFocus(t0).runNow()))
    beforeLayout.foreach(p => __obj.updateDynamic("beforeLayout")(p.toJsFn))
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (calculateConstrainedPosition != null) __obj.updateDynamic("calculateConstrainedPosition")(js.Any.fromFunction4((t0: js.UndefOr[js.Any], t1: js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: js.UndefOr[scala.Boolean], t3: js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => calculateConstrainedPosition(t0, t1, t2, t3).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (childEls != null) __obj.updateDynamic("childEls")(childEls.asInstanceOf[js.Any])
    clearListeners.foreach(p => __obj.updateDynamic("clearListeners")(p.toJsFn))
    clearManagedListeners.foreach(p => __obj.updateDynamic("clearManagedListeners")(p.toJsFn))
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls.asInstanceOf[js.Any])
    if (componentLayout != null) __obj.updateDynamic("componentLayout")(componentLayout.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl.asInstanceOf[js.Any])
    if (contentPaddingProperty != null) __obj.updateDynamic("contentPaddingProperty")(contentPaddingProperty.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => disable(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls.asInstanceOf[js.Any])
    doAutoRender.foreach(p => __obj.updateDynamic("doAutoRender")(p.toJsFn))
    doComponentLayout.foreach(p => __obj.updateDynamic("doComponentLayout")(p.toJsFn))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => enable(t0).runNow()))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1((t0: /* eventNames */ js.UndefOr[js.Any]) => enableBubble(t0).runNow()))
    if (ensureAttachedToBody != null) __obj.updateDynamic("ensureAttachedToBody")(js.Any.fromFunction1((t0: js.UndefOr[scala.Boolean]) => ensureAttachedToBody(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (findPlugin != null) __obj.updateDynamic("findPlugin")(js.Any.fromFunction1((t0: /* ptype */ js.UndefOr[java.lang.String]) => findPlugin(t0).runNow()))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* eventName */ java.lang.String, t1: /* repeated */ js.Any) => fireEvent(t0, t1).runNow()))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => fireEventArgs(t0, t1).runNow()))
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    forceComponentLayout.foreach(p => __obj.updateDynamic("forceComponentLayout")(p.toJsFn))
    if (!js.isUndefined(frame)) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (frameSize != null) __obj.updateDynamic("frameSize")(frameSize.asInstanceOf[js.Any])
    getActiveAnimation.foreach(p => __obj.updateDynamic("getActiveAnimation")(p.toJsFn))
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(js.Any.fromFunction3((t0: js.UndefOr[js.Any], t1: js.UndefOr[java.lang.String], t2: js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => getAlignToXY(t0, t1, t2).runNow()))
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(js.Any.fromFunction3((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[scala.Boolean], t2: js.UndefOr[js.Any]) => getAnchorXY(t0, t1, t2).runNow()))
    if (getBox != null) __obj.updateDynamic("getBox")(js.Any.fromFunction2((t0: js.UndefOr[scala.Boolean], t1: js.UndefOr[scala.Boolean]) => getBox(t0, t1).runNow()))
    getBubbleTarget.foreach(p => __obj.updateDynamic("getBubbleTarget")(p.toJsFn))
    if (getConstrainVector != null) __obj.updateDynamic("getConstrainVector")(js.Any.fromFunction3((t0: js.UndefOr[js.Any], t1: js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => getConstrainVector(t0, t1, t2).runNow()))
    getEl.foreach(p => __obj.updateDynamic("getEl")(p.toJsFn))
    getHeight.foreach(p => __obj.updateDynamic("getHeight")(p.toJsFn))
    getId.foreach(p => __obj.updateDynamic("getId")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getInsertPosition != null) __obj.updateDynamic("getInsertPosition")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => getInsertPosition(t0).runNow()))
    getItemId.foreach(p => __obj.updateDynamic("getItemId")(p.toJsFn))
    getLoader.foreach(p => __obj.updateDynamic("getLoader")(p.toJsFn))
    getLocalX.foreach(p => __obj.updateDynamic("getLocalX")(p.toJsFn))
    getLocalXY.foreach(p => __obj.updateDynamic("getLocalXY")(p.toJsFn))
    getLocalY.foreach(p => __obj.updateDynamic("getLocalY")(p.toJsFn))
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => getOffsetsTo(t0).runNow()))
    if (getPlugin != null) __obj.updateDynamic("getPlugin")(js.Any.fromFunction1((t0: /* pluginId */ js.UndefOr[java.lang.String]) => getPlugin(t0).runNow()))
    getRegion.foreach(p => __obj.updateDynamic("getRegion")(p.toJsFn))
    getSize.foreach(p => __obj.updateDynamic("getSize")(p.toJsFn))
    if (getSizeModel != null) __obj.updateDynamic("getSizeModel")(js.Any.fromFunction1((t0: /* ownerCtSizeModel */ js.UndefOr[js.Any]) => getSizeModel(t0).runNow()))
    getState.foreach(p => __obj.updateDynamic("getState")(p.toJsFn))
    getViewRegion.foreach(p => __obj.updateDynamic("getViewRegion")(p.toJsFn))
    getWidth.foreach(p => __obj.updateDynamic("getWidth")(p.toJsFn))
    getX.foreach(p => __obj.updateDynamic("getX")(p.toJsFn))
    getXTypes.foreach(p => __obj.updateDynamic("getXTypes")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    getY.foreach(p => __obj.updateDynamic("getY")(p.toJsFn))
    hasActiveFx.foreach(p => __obj.updateDynamic("hasActiveFx")(p.toJsFn))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1((t0: /* className */ js.UndefOr[java.lang.String]) => hasCls(t0).runNow()))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1((t0: /* eventName */ js.UndefOr[java.lang.String]) => hasListener(t0).runNow()))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (hasUICls != null) __obj.updateDynamic("hasUICls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => hasUICls(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hideMode != null) __obj.updateDynamic("hideMode")(hideMode.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    initEvents.foreach(p => __obj.updateDynamic("initEvents")(p.toJsFn))
    initRenderData.foreach(p => __obj.updateDynamic("initRenderData")(p.toJsFn))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => is(t0).runNow()))
    if (!js.isUndefined(isComponent)) __obj.updateDynamic("isComponent")(isComponent.asInstanceOf[js.Any])
    if (isDescendantOf != null) __obj.updateDynamic("isDescendantOf")(js.Any.fromFunction1((t0: /* container */ js.UndefOr[typingsJapgolly.extjs.Ext.IContainer]) => isDescendantOf(t0).runNow()))
    isDisabled.foreach(p => __obj.updateDynamic("isDisabled")(p.toJsFn))
    isDraggable.foreach(p => __obj.updateDynamic("isDraggable")(p.toJsFn))
    isDroppable.foreach(p => __obj.updateDynamic("isDroppable")(p.toJsFn))
    isFloating.foreach(p => __obj.updateDynamic("isFloating")(p.toJsFn))
    isHidden.foreach(p => __obj.updateDynamic("isHidden")(p.toJsFn))
    isLayoutRoot.foreach(p => __obj.updateDynamic("isLayoutRoot")(p.toJsFn))
    isLayoutSuspended.foreach(p => __obj.updateDynamic("isLayoutSuspended")(p.toJsFn))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction1((t0: /* deep */ js.UndefOr[scala.Boolean]) => isVisible(t0).runNow()))
    if (isXType != null) __obj.updateDynamic("isXType")(js.Any.fromFunction2((t0: /* xtype */ js.UndefOr[java.lang.String], t1: /* shallow */ js.UndefOr[scala.Boolean]) => isXType(t0, t1).runNow()))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(maskOnDisable)) __obj.updateDynamic("maskOnDisable")(maskOnDisable.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any], t4: /* options */ js.UndefOr[js.Any]) => mon(t0, t1, t2, t3, t4).runNow()))
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction3((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[scala.Double], t2: js.UndefOr[js.Any]) => move(t0, t1, t2).runNow()))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => mun(t0, t1, t2, t3).runNow()))
    if (nextNode != null) __obj.updateDynamic("nextNode")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => nextNode(t0).runNow()))
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => nextSibling(t0).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4((t0: /* eventName */ js.UndefOr[js.Any], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any], t3: /* options */ js.UndefOr[js.Any]) => on(t0, t1, t2, t3).runNow()))
    if (onAdded != null) __obj.updateDynamic("onAdded")(js.Any.fromFunction2((t0: /* container */ js.UndefOr[typingsJapgolly.extjs.Ext.container.IContainer], t1: /* pos */ js.UndefOr[scala.Double]) => onAdded(t0, t1).runNow()))
    onDisable.foreach(p => __obj.updateDynamic("onDisable")(p.toJsFn))
    onEnable.foreach(p => __obj.updateDynamic("onEnable")(p.toJsFn))
    if (onPosition != null) __obj.updateDynamic("onPosition")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => onPosition(t0, t1).runNow()))
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(js.Any.fromFunction1((t0: /* destroying */ js.UndefOr[scala.Boolean]) => onRemoved(t0).runNow()))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.core.IElement], t1: js.UndefOr[scala.Double]) => onRender(t0, t1).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction4((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any], t2: /* oldWidth */ js.UndefOr[js.Any], t3: /* oldHeight */ js.UndefOr[js.Any]) => onResize(t0, t1, t2, t3).runNow()))
    if (overCls != null) __obj.updateDynamic("overCls")(overCls.asInstanceOf[js.Any])
    if (ownerCt != null) __obj.updateDynamic("ownerCt")(ownerCt.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (postBlur != null) __obj.updateDynamic("postBlur")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[typingsJapgolly.extjs.Ext.IEventObject]) => postBlur(t0).runNow()))
    if (previousNode != null) __obj.updateDynamic("previousNode")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => previousNode(t0).runNow()))
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(js.Any.fromFunction1((t0: /* selector */ js.UndefOr[java.lang.String]) => previousSibling(t0).runNow()))
    if (registerFloatingItem != null) __obj.updateDynamic("registerFloatingItem")(js.Any.fromFunction1((t0: /* cmp */ js.UndefOr[js.Any]) => registerFloatingItem(t0).runNow()))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3((t0: /* origin */ js.UndefOr[js.Any], t1: /* events */ js.UndefOr[typingsJapgolly.extjs.Ext.Array], t2: /* prefix */ js.UndefOr[java.lang.String]) => relayEvents(t0, t1, t2).runNow()))
    removeAnchor.foreach(p => __obj.updateDynamic("removeAnchor")(p.toJsFn))
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(js.Any.fromFunction1((t0: js.UndefOr[js.Any]) => removeChildEls(t0).runNow()))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[js.Any]) => removeCls(t0).runNow()))
    if (removeClsWithUI != null) __obj.updateDynamic("removeClsWithUI")(js.Any.fromFunction1((t0: /* cls */ js.UndefOr[js.Any]) => removeClsWithUI(t0).runNow()))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => removeListener(t0, t1, t2).runNow()))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4((t0: /* item */ js.UndefOr[js.Any], t1: /* ename */ js.UndefOr[js.Any], t2: /* fn */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => removeManagedListener(t0, t1, t2, t3).runNow()))
    if (removeUIClsFromElement != null) __obj.updateDynamic("removeUIClsFromElement")(js.Any.fromFunction1((t0: /* ui */ js.UndefOr[java.lang.String]) => removeUIClsFromElement(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any]) => render(t0, t1).runNow()))
    if (renderData != null) __obj.updateDynamic("renderData")(renderData.asInstanceOf[js.Any])
    if (renderSelectors != null) __obj.updateDynamic("renderSelectors")(renderSelectors.asInstanceOf[js.Any])
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo.asInstanceOf[js.Any])
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(rendered)) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => resumeEvent(t0).runNow()))
    resumeEvents.foreach(p => __obj.updateDynamic("resumeEvents")(p.toJsFn))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (saveDelay != null) __obj.updateDynamic("saveDelay")(saveDelay.asInstanceOf[js.Any])
    if (savePropToState != null) __obj.updateDynamic("savePropToState")(js.Any.fromFunction3((t0: /* propName */ js.UndefOr[java.lang.String], t1: /* state */ js.UndefOr[js.Any], t2: /* stateName */ js.UndefOr[java.lang.String]) => savePropToState(t0, t1, t2).runNow()))
    if (savePropsToState != null) __obj.updateDynamic("savePropsToState")(js.Any.fromFunction2((t0: /* propNames */ js.UndefOr[js.Any], t1: /* state */ js.UndefOr[js.Any]) => savePropsToState(t0, t1).runNow()))
    saveState.foreach(p => __obj.updateDynamic("saveState")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    sequenceFx.foreach(p => __obj.updateDynamic("sequenceFx")(p.toJsFn))
    if (setBorder != null) __obj.updateDynamic("setBorder")(js.Any.fromFunction1((t0: /* border */ js.UndefOr[js.Any]) => setBorder(t0).runNow()))
    if (setBox != null) __obj.updateDynamic("setBox")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any]) => setBox(t0, t1).runNow()))
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[scala.Boolean]) => setDisabled(t0).runNow()))
    if (setDocked != null) __obj.updateDynamic("setDocked")(js.Any.fromFunction2((t0: /* dock */ js.UndefOr[js.Any], t1: /* layoutParent */ js.UndefOr[scala.Boolean]) => setDocked(t0, t1).runNow()))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: /* height */ js.UndefOr[scala.Double]) => setHeight(t0).runNow()))
    if (setLocalX != null) __obj.updateDynamic("setLocalX")(js.Any.fromFunction1((t0: js.UndefOr[js.Any | scala.Double]) => setLocalX(t0).runNow()))
    if (setLocalXY != null) __obj.updateDynamic("setLocalXY")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[js.Any | scala.Double]) => setLocalXY(t0, t1).runNow()))
    if (setLocalY != null) __obj.updateDynamic("setLocalY")(js.Any.fromFunction1((t0: js.UndefOr[js.Any | scala.Double]) => setLocalY(t0).runNow()))
    if (setMargin != null) __obj.updateDynamic("setMargin")(js.Any.fromFunction1((t0: /* margin */ js.UndefOr[js.Any]) => setMargin(t0).runNow()))
    if (setRegion != null) __obj.updateDynamic("setRegion")(js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.util.IRegion], t1: js.UndefOr[js.Any]) => setRegion(t0, t1).runNow()))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2((t0: /* width */ js.UndefOr[js.Any], t1: /* height */ js.UndefOr[js.Any]) => setSize(t0, t1).runNow()))
    if (setUI != null) __obj.updateDynamic("setUI")(js.Any.fromFunction1((t0: /* ui */ js.UndefOr[java.lang.String]) => setUI(t0).runNow()))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction1((t0: /* visible */ js.UndefOr[scala.Boolean]) => setVisible(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[scala.Double]) => setWidth(t0).runNow()))
    if (setX != null) __obj.updateDynamic("setX")(js.Any.fromFunction2((t0: js.UndefOr[js.Any | scala.Double], t1: js.UndefOr[js.Any]) => setX(t0, t1).runNow()))
    if (setXY != null) __obj.updateDynamic("setXY")(js.Any.fromFunction2((t0: js.UndefOr[js.Any | typingsJapgolly.extjs.Ext.Array], t1: js.UndefOr[js.Any]) => setXY(t0, t1).runNow()))
    if (setY != null) __obj.updateDynamic("setY")(js.Any.fromFunction2((t0: js.UndefOr[js.Any | scala.Double], t1: js.UndefOr[js.Any]) => setY(t0, t1).runNow()))
    if (shrinkWrap != null) __obj.updateDynamic("shrinkWrap")(shrinkWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (stateEvents != null) __obj.updateDynamic("stateEvents")(stateEvents.asInstanceOf[js.Any])
    if (stateId != null) __obj.updateDynamic("stateId")(stateId.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    stopAnimation.foreach(p => __obj.updateDynamic("stopAnimation")(p.toJsFn))
    stopFx.foreach(p => __obj.updateDynamic("stopFx")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => suspendEvent(t0).runNow()))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1((t0: /* queueSuspended */ js.UndefOr[scala.Boolean]) => suspendEvents(t0).runNow()))
    syncFx.foreach(p => __obj.updateDynamic("syncFx")(p.toJsFn))
    if (tpl != null) __obj.updateDynamic("tpl")(tpl.asInstanceOf[js.Any])
    if (tplWriteMode != null) __obj.updateDynamic("tplWriteMode")(tplWriteMode.asInstanceOf[js.Any])
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(js.Any.fromFunction2((t0: js.UndefOr[js.Any], t1: js.UndefOr[scala.Double]) => translatePoints(t0, t1).runNow()))
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3((t0: /* eventName */ js.UndefOr[java.lang.String], t1: /* fn */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => un(t0, t1, t2).runNow()))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction2((t0: /* selector */ js.UndefOr[js.Any], t1: /* limit */ js.UndefOr[js.Any]) => up(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3((t0: /* htmlOrData */ js.UndefOr[js.Any], t1: /* loadScripts */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any]) => update(t0, t1, t2).runNow()))
    if (updateLayout != null) __obj.updateDynamic("updateLayout")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[js.Any]) => updateLayout(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xtype != null) __obj.updateDynamic("xtype")(xtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstractComponent]
  }
}

