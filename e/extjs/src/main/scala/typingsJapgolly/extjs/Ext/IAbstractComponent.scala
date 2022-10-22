package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.extjs.Ext.enums.IWidget
import typingsJapgolly.extjs.Ext.util.IPositionable
import typingsJapgolly.extjs.Ext.util.IRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.IClass because Already inherited
- typingsJapgolly.extjs.Ext.util.IObservable because var conflicts: addEvents, addListener, addManagedListener, alias, alternateClassName, callOverridden, callParent, callSuper, clearListeners, clearManagedListeners, config, enableBubble, extend, fireEvent, fireEventArgs, getInitialConfig, hasListener, inheritableStatics, initConfig, mixins, mon, mun, on, relayEvents, removeListener, removeManagedListener, requires, resumeEvent, resumeEvents, self, singleton, statics, suspendEvent, suspendEvents, un, uses. Inlined listeners, hasListeners, isObservable
- typingsJapgolly.extjs.Ext.IBase because Already inherited
- typingsJapgolly.extjs.Ext.state.IStateful because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined saveDelay, stateEvents, stateId, stateful, addEvents, addListener, addManagedListener, addStateEvents, applyState, clearListeners, clearManagedListeners, destroy, enableBubble, fireEvent, fireEventArgs, getState, hasListener, mon, mun, on, relayEvents, removeListener, removeManagedListener, resumeEvent, resumeEvents, savePropToState, savePropsToState, saveState, suspendEvent, suspendEvents, un
- typingsJapgolly.extjs.Ext.util.IRenderable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined afterRender, doAutoRender, ensureAttachedToBody, getInsertPosition, initRenderData, onRender, render
- typingsJapgolly.extjs.Ext.util.IElementContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined addChildEls, removeChildEls
- typingsJapgolly.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ trait IAbstractComponent
  extends StObject
     with IPositionable {
  
  /** [Property] (Boolean) */
  var _isLayoutRoot: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  var addClass: js.UndefOr[js.Function1[/* cls */ js.UndefOr[Any], IComponent]] = js.undefined
  
  /** [Method] Adds a CSS class to the top level element representing this component
    * @param cls String/String[] The CSS class name to add.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[Any], IComponent]] = js.undefined
  
  /** [Method] Adds a cls to the uiCls array which will also call addUIClsToElement and adds to all elements of this component
    * @param classes String/String[] A string or an array of strings to add to the uiCls.
    * @param skip Object (Boolean) skip true to skip adding it to the class and do it later (via the return).
    */
  var addClsWithUI: js.UndefOr[js.Function2[/* classes */ js.UndefOr[Any], /* skip */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  var addEvents: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Appends an event handler to this object
    * @param element Object
    * @param listeners Object
    * @param scope Object
    * @param options Object
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addListener: js.UndefOr[
    js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
  ] = js.undefined
  
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addManagedListener: js.UndefOr[
    js.Function5[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
  ] = js.undefined
  
  /** [Method] Save a property to the given state object if it is not its default or configured value
    * @param state Object The state object.
    * @param propName String The name of the property on this object to save.
    * @param value String The value of the state property (defaults to this[propName]).
    * @returns Boolean The state object or a new object if state was null and the property was saved.
    */
  var addPropertyToState: js.UndefOr[
    js.Function3[
      /* state */ js.UndefOr[Any], 
      /* propName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[java.lang.String], 
      Boolean
    ]
  ] = js.undefined
  
  /** [Method] Add events that will trigger the state to be saved
    * @param events String/String[] The event name or an array of event names.
    */
  var addStateEvents: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
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
      /* oldWidth */ js.UndefOr[Any], 
      /* oldHeight */ js.UndefOr[Any], 
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
  @JSName("alignTo")
  var alignTo_IAbstractComponent: js.UndefOr[
    js.Function4[
      /* element */ js.UndefOr[Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[Array], 
      /* animate */ js.UndefOr[Any], 
      IPositionable
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
  @JSName("anchorTo")
  var anchorTo_IAbstractComponent: js.UndefOr[
    js.Function6[
      /* element */ js.UndefOr[Any], 
      /* position */ js.UndefOr[java.lang.String], 
      /* offsets */ js.UndefOr[Array], 
      /* animate */ js.UndefOr[Any], 
      /* monitorScroll */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      IPositionable
    ]
  ] = js.undefined
  
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[Any] = js.undefined
  
  /** [Method] Applies the state to the object
    * @param state Object The state
    */
  var applyState: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String/Object) */
  var autoEl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Ext.ComponentLoader/Object/String/Boolean) */
  var autoLoad: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean/String/HTMLElement/Ext.Element) */
  var autoRender: js.UndefOr[Any] = js.undefined
  
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
  var border: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object[]) */
  var childEls: js.UndefOr[Array] = js.undefined
  
  /** [Method] Removes all listeners for this object including the managed listeners */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Removes all managed listeners for this object  */
  var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var cls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String/Object) */
  var componentLayout: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var contentEl: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Property] (String) */
  var contentPaddingProperty: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[Any] = js.undefined
  
  /** [Method] Destroys the Component  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
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
  
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  var enableBubble: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Ensures that this component is attached to document body
    * @param runLayout Boolean True to run the component's layout.
    */
  var ensureAttachedToBody: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Retrieves plugin from this component s collection by its ptype
    * @param ptype String The Plugin's ptype as specified by the class's alias configuration.
    * @returns Ext.AbstractPlugin plugin instance.
    */
  var findPlugin: js.UndefOr[js.Function1[/* ptype */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ java.lang.String, /* repeated */ Any, Boolean]] = js.undefined
  
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEventArgs: js.UndefOr[js.Function2[js.UndefOr[java.lang.String], js.UndefOr[Array], Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Forces this component to redo its componentLayout  */
  var forceComponentLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var frame: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Object) */
  var frameSize: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var getActiveAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Provides the link for Observable s fireEvent method to bubble up the ownership hierarchy
    * @returns Ext.container.Container the Container which owns this Component.
    */
  var getBubbleTarget: js.UndefOr[js.Function0[typingsJapgolly.extjs.Ext.container.IContainer]] = js.undefined
  
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
  var getInsertPosition: js.UndefOr[js.Function1[js.UndefOr[Any], HTMLElement]] = js.undefined
  
  /** [Method] Returns the value of itemId assigned to this component or when that is not set returns the value of id
    * @returns String
    */
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Gets the Ext ComponentLoader for this Component
    * @returns Ext.ComponentLoader The loader instance, null if it doesn't exist.
    */
  var getLoader: js.UndefOr[js.Function0[IComponentLoader]] = js.undefined
  
  /** [Method] Retrieves a plugin from this component s collection by its pluginId
    * @param pluginId String
    * @returns Ext.AbstractPlugin plugin instance.
    */
  var getPlugin: js.UndefOr[js.Function1[/* pluginId */ js.UndefOr[java.lang.String], IAbstractPlugin]] = js.undefined
  
  /** [Method] Gets the current size of the component s underlying element
    * @returns Object An object containing the element's size {width: (element width), height: (element height)}
    */
  var getSize: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns an object that describes how this component s width and height are managed
    * @param ownerCtSizeModel Object
    * @returns Object The size model for this component.
    */
  var getSizeModel: js.UndefOr[js.Function1[/* ownerCtSizeModel */ js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] The supplied default state gathering method for the AbstractComponent class
    * @returns Object
    */
  var getState: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Gets the current width of the component s underlying element
    * @returns Number
    */
  var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
    * @returns String The xtype hierarchy string
    */
  var getXTypes: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var hasActiveFx: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
    * @param className String The CSS class to check for.
    * @returns Boolean true if the class exists, else false.
    */
  var hasCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
  
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  var hasListener: js.UndefOr[js.Function1[js.UndefOr[java.lang.String], Boolean]] = js.undefined
  
  /** [Property] (Object) */
  var hasListeners: js.UndefOr[Any] = js.undefined
  
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
  var html: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Initialize any events on this component */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Initialized the renderData to be used when rendering the renderTpl
    * @returns Object Object with keys and values that are going to be applied to the renderTpl
    */
  var initRenderData: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  
  /** [Property] (Boolean) */
  var isObservable: js.UndefOr[Boolean] = js.undefined
  
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
  
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Ext.ComponentLoader/Object) */
  var loader: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[Any] = js.undefined
  
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
  
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var mon: js.UndefOr[
    js.Function5[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
  ] = js.undefined
  
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var mun: js.UndefOr[
    js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Unit]
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
  
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var on: js.UndefOr[
    js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Any]
  ] = js.undefined
  
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
      /* width */ js.UndefOr[Any], 
      /* height */ js.UndefOr[Any], 
      /* oldWidth */ js.UndefOr[Any], 
      /* oldHeight */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var overCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Property] (Ext.Container) */
  var ownerCt: js.UndefOr[IContainer] = js.undefined
  
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Ext.AbstractPlugin[]/Ext.AbstractPlugin/Object[]/Object/Ext.enums.Plugin[]/Ext.enums.Plugin) */
  var plugins: js.UndefOr[Any] = js.undefined
  
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
  var registerFloatingItem: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  var relayEvents: js.UndefOr[
    js.Function3[js.UndefOr[Any], js.UndefOr[Array], js.UndefOr[java.lang.String], Any]
  ] = js.undefined
  
  /** [Method] Remove any anchor to this element
    * @returns Ext.util.Positionable this
    */
  @JSName("removeAnchor")
  var removeAnchor_IAbstractComponent: js.UndefOr[js.Function0[IPositionable]] = js.undefined
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  var removeChildEls: js.UndefOr[js.Function1[js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Removes a CSS class from the top level element representing this component
    * @param cls String/String[] The CSS class name to remove.
    * @returns Ext.Component Returns the Component to allow method chaining.
    */
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[Any], IComponent]] = js.undefined
  
  /** [Method] Removes a cls to the uiCls array which will also call removeUIClsFromElement and removes it from all elements of thi
    * @param cls String/String[] A string or an array of strings to remove to the uiCls.
    */
  var removeClsWithUI: js.UndefOr[js.Function1[/* cls */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var removeListener: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Any], js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var removeManagedListener: js.UndefOr[
    js.Function4[js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Method which removes a specified UI  uiCls from the components element
    * @param ui String The UI to add to the element.
    */
  var removeUIClsFromElement: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Renders the Component into the passed HTML element
    * @param container Ext.Element/HTMLElement/String The element this Component should be rendered into. If it is being created from existing markup, this should be omitted.
    * @param position String/Number The element ID or DOM node index within the container before which this component will be inserted (defaults to appending to the end of the container)
    */
  var render: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var renderData: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var renderSelectors: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var renderTo: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Ext.XTemplate/String/String[]) */
  var renderTpl: js.UndefOr[Any] = js.undefined
  
  /** [Property] (Boolean) */
  var rendered: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  var resumeEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /** [Method] Resumes firing events see suspendEvents */
  var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var saveDelay: js.UndefOr[Double] = js.undefined
  
  /** [Method] Conditionally saves a single property from this object to the given state object
    * @param propName String The name of the property to save.
    * @param state Object The state object in to which to save the property.
    * @param stateName String The name to use for the property in state.
    * @returns Boolean True if the property was saved, false if not.
    */
  var savePropToState: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Any], js.UndefOr[java.lang.String], Boolean]
  ] = js.undefined
  
  /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
    * @param propNames String/String[] The name (or array of names) of the property to save.
    * @param state Object The state object in to which to save the property values.
    * @returns Object state
    */
  var savePropsToState: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[Any], Any]] = js.undefined
  
  /** [Method] Saves the state of the object to the persistence store  */
  var saveState: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  var sequenceFx: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method]
    * @param border String/Number The border, see border. If a falsey value is passed the border will be removed.
    */
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the element s box
    * @param box Object The box to fill {x, y, width, height}
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  @JSName("setBox")
  var setBox_IAbstractComponent: js.UndefOr[
    js.Function2[/* box */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], IPositionable]
  ] = js.undefined
  
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
    js.Function2[/* dock */ js.UndefOr[Any], /* layoutParent */ js.UndefOr[Boolean], IComponent]
  ] = js.undefined
  
  /** [Method] Sets the height of the component
    * @param height Number The new height to set. This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], IComponent]] = js.undefined
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  @JSName("setLocalXY")
  var setLocalXY_IAbstractComponent: js.UndefOr[js.Function2[/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Any], IPositionable]] = js.undefined
  
  /** [Method] Overridden in Ext rtl AbstractComponent
    * @param x Object
    * @returns Ext.util.Positionable this
    */
  @JSName("setLocalX")
  var setLocalX_IAbstractComponent: js.UndefOr[js.Function1[/* x */ js.UndefOr[Any], IPositionable]] = js.undefined
  
  /** [Method] Sets the local y coordinate of this element using CSS style
    * @param y Object
    * @returns Ext.util.Positionable this
    */
  @JSName("setLocalY")
  var setLocalY_IAbstractComponent: js.UndefOr[js.Function1[/* y */ js.UndefOr[Any], IPositionable]] = js.undefined
  
  /** [Method] Sets the margin on the target element
    * @param margin Number/String The margin to set. See the margin config.
    */
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the element s position and size to the specified region
    * @param region Ext.util.Region The region to fill
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  @JSName("setRegion")
  var setRegion_IAbstractComponent: js.UndefOr[
    js.Function2[/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[Any], IPositionable]
  ] = js.undefined
  
  /** [Method] Sets the width and height of this Component
    * @param width Number/String/Object The new width to set. This may be one of:  A Number specifying the new width in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS width style. A size object in the format {width: widthValue, height: heightValue}. undefined to leave the width unchanged.
    * @param height Number/String The new height to set (not required if a size object is passed as the first arg). This may be one of:  A Number specifying the new height in the Element's Ext.Element.defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used. undefined to leave the height unchanged.
    * @returns Ext.Component this
    */
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any], IComponent]
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
  
  /** [Method] Sets the position of the DOM element in page coordinates
    * @param xy Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  @JSName("setXY")
  var setXY_IAbstractComponent: js.UndefOr[
    js.Function2[/* xy */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], IPositionable]
  ] = js.undefined
  
  /** [Method] Sets the X position of the DOM element based on page coordinates
    * @param x Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  @JSName("setX")
  var setX_IAbstractComponent: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], IPositionable]
  ] = js.undefined
  
  /** [Method] Sets the Y position of the DOM element based on page coordinates
    * @param y Object
    * @param animate Object
    * @returns Ext.util.Positionable this
    */
  @JSName("setY")
  var setY_IAbstractComponent: js.UndefOr[
    js.Function2[/* y */ js.UndefOr[Any], /* animate */ js.UndefOr[Any], IPositionable]
  ] = js.undefined
  
  /** [Config Option] (Boolean/Number) */
  var shrinkWrap: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String[]) */
  var stateEvents: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var stateId: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var stateful: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[Any] = js.undefined
  
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  var suspendEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  var suspendEvents: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Ext.XTemplate/Ext.Template/String/String[]) */
  var tpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var ui: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var un: js.UndefOr[
    js.Function3[js.UndefOr[java.lang.String], js.UndefOr[Any], js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Navigates up the ownership hierarchy searching for an ancestor Container which matches any passed simple selector or
    * @param selector String/Ext.Component The simple selector component or actual component to test. If not passed the immediate owner/activater is returned.
    * @param limit String/Number/Ext.Component This may be a selector upon which to stop the upward scan, or a limit of teh number of steps, or Component reference to stop on.
    * @returns Ext.container.Container The matching ancestor Container (or undefined if no match was found).
    */
  var up: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[Any], 
      /* limit */ js.UndefOr[Any], 
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
      /* htmlOrData */ js.UndefOr[Any], 
      /* loadScripts */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Updates this component s layout
    * @param options Object An object with layout options.
    */
  var updateLayout: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Ext.enums.Widget) */
  var xtype: js.UndefOr[IWidget] = js.undefined
}
object IAbstractComponent {
  
  inline def apply(): IAbstractComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractComponent]
  }
  
  extension [Self <: IAbstractComponent](x: Self) {
    
    inline def setAddChildEls(value: Callback): Self = StObject.set(x, "addChildEls", value.toJsFn)
    
    inline def setAddChildElsUndefined: Self = StObject.set(x, "addChildEls", js.undefined)
    
    inline def setAddClass(value: /* cls */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
    
    inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    inline def setAddCls(value: /* cls */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "addCls", js.Any.fromFunction1(value))
    
    inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
    
    inline def setAddClsWithUI(value: (/* classes */ js.UndefOr[Any], /* skip */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "addClsWithUI", js.Any.fromFunction2((t0: /* classes */ js.UndefOr[Any], t1: /* skip */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setAddClsWithUIUndefined: Self = StObject.set(x, "addClsWithUI", js.undefined)
    
    inline def setAddEvents(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "addEvents", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
    
    inline def setAddListener(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
    
    inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    inline def setAddManagedListener(
      value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
    
    inline def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
    
    inline def setAddPropertyToState(
      value: (/* state */ js.UndefOr[Any], /* propName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => Boolean
    ): Self = StObject.set(x, "addPropertyToState", js.Any.fromFunction3(value))
    
    inline def setAddPropertyToStateUndefined: Self = StObject.set(x, "addPropertyToState", js.undefined)
    
    inline def setAddStateEvents(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "addStateEvents", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setAddStateEventsUndefined: Self = StObject.set(x, "addStateEvents", js.undefined)
    
    inline def setAddUIClsToElement(value: /* ui */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "addUIClsToElement", js.Any.fromFunction1((t0: /* ui */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setAddUIClsToElementUndefined: Self = StObject.set(x, "addUIClsToElement", js.undefined)
    
    inline def setAfterComponentLayout(
      value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* oldWidth */ js.UndefOr[Any], /* oldHeight */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "afterComponentLayout", js.Any.fromFunction4((t0: /* width */ js.UndefOr[Double], t1: /* height */ js.UndefOr[Double], t2: /* oldWidth */ js.UndefOr[Any], t3: /* oldHeight */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setAfterComponentLayoutUndefined: Self = StObject.set(x, "afterComponentLayout", js.undefined)
    
    inline def setAfterRender(value: Callback): Self = StObject.set(x, "afterRender", value.toJsFn)
    
    inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    inline def setAfterSetPosition(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "afterSetPosition", js.Any.fromFunction2((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setAfterSetPositionUndefined: Self = StObject.set(x, "afterSetPosition", js.undefined)
    
    inline def setAlignTo(
      value: (/* element */ js.UndefOr[Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array], /* animate */ js.UndefOr[Any]) => IPositionable
    ): Self = StObject.set(x, "alignTo", js.Any.fromFunction4(value))
    
    inline def setAlignToUndefined: Self = StObject.set(x, "alignTo", js.undefined)
    
    inline def setAnchorTo(
      value: (/* element */ js.UndefOr[Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[Array], /* animate */ js.UndefOr[Any], /* monitorScroll */ js.UndefOr[Any], /* callback */ js.UndefOr[Any]) => IPositionable
    ): Self = StObject.set(x, "anchorTo", js.Any.fromFunction6(value))
    
    inline def setAnchorToUndefined: Self = StObject.set(x, "anchorTo", js.undefined)
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setApplyState(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "applyState", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setApplyStateUndefined: Self = StObject.set(x, "applyState", js.undefined)
    
    inline def setAutoEl(value: Any): Self = StObject.set(x, "autoEl", value.asInstanceOf[js.Any])
    
    inline def setAutoElUndefined: Self = StObject.set(x, "autoEl", js.undefined)
    
    inline def setAutoLoad(value: Any): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
    
    inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
    
    inline def setAutoRender(value: Any): Self = StObject.set(x, "autoRender", value.asInstanceOf[js.Any])
    
    inline def setAutoRenderUndefined: Self = StObject.set(x, "autoRender", js.undefined)
    
    inline def setAutoShow(value: Boolean): Self = StObject.set(x, "autoShow", value.asInstanceOf[js.Any])
    
    inline def setAutoShowUndefined: Self = StObject.set(x, "autoShow", js.undefined)
    
    inline def setBaseCls(value: java.lang.String): Self = StObject.set(x, "baseCls", value.asInstanceOf[js.Any])
    
    inline def setBaseClsUndefined: Self = StObject.set(x, "baseCls", js.undefined)
    
    inline def setBeforeBlur(value: /* e */ js.UndefOr[IEventObject] => Callback): Self = StObject.set(x, "beforeBlur", js.Any.fromFunction1((t0: /* e */ js.UndefOr[IEventObject]) => value(t0).runNow()))
    
    inline def setBeforeBlurUndefined: Self = StObject.set(x, "beforeBlur", js.undefined)
    
    inline def setBeforeComponentLayout(value: (/* adjWidth */ js.UndefOr[Double], /* adjHeight */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "beforeComponentLayout", js.Any.fromFunction2((t0: /* adjWidth */ js.UndefOr[Double], t1: /* adjHeight */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setBeforeComponentLayoutUndefined: Self = StObject.set(x, "beforeComponentLayout", js.undefined)
    
    inline def setBeforeDestroy(value: Callback): Self = StObject.set(x, "beforeDestroy", value.toJsFn)
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeFocus(value: /* e */ js.UndefOr[IEventObject] => Callback): Self = StObject.set(x, "beforeFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[IEventObject]) => value(t0).runNow()))
    
    inline def setBeforeFocusUndefined: Self = StObject.set(x, "beforeFocus", js.undefined)
    
    inline def setBeforeLayout(value: Callback): Self = StObject.set(x, "beforeLayout", value.toJsFn)
    
    inline def setBeforeLayoutUndefined: Self = StObject.set(x, "beforeLayout", js.undefined)
    
    inline def setBorder(value: Any): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setChildEls(value: Array): Self = StObject.set(x, "childEls", value.asInstanceOf[js.Any])
    
    inline def setChildElsUndefined: Self = StObject.set(x, "childEls", js.undefined)
    
    inline def setClearListeners(value: Callback): Self = StObject.set(x, "clearListeners", value.toJsFn)
    
    inline def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
    
    inline def setClearManagedListeners(value: Callback): Self = StObject.set(x, "clearManagedListeners", value.toJsFn)
    
    inline def setClearManagedListenersUndefined: Self = StObject.set(x, "clearManagedListeners", js.undefined)
    
    inline def setCls(value: java.lang.String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setComponentCls(value: java.lang.String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    
    inline def setComponentClsUndefined: Self = StObject.set(x, "componentCls", js.undefined)
    
    inline def setComponentLayout(value: Any): Self = StObject.set(x, "componentLayout", value.asInstanceOf[js.Any])
    
    inline def setComponentLayoutUndefined: Self = StObject.set(x, "componentLayout", js.undefined)
    
    inline def setContentEl(value: java.lang.String): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
    
    inline def setContentElUndefined: Self = StObject.set(x, "contentEl", js.undefined)
    
    inline def setContentPaddingProperty(value: java.lang.String): Self = StObject.set(x, "contentPaddingProperty", value.asInstanceOf[js.Any])
    
    inline def setContentPaddingPropertyUndefined: Self = StObject.set(x, "contentPaddingProperty", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDisable(value: /* silent */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "disable", js.Any.fromFunction1((t0: /* silent */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledCls(value: java.lang.String): Self = StObject.set(x, "disabledCls", value.asInstanceOf[js.Any])
    
    inline def setDisabledClsUndefined: Self = StObject.set(x, "disabledCls", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDoAutoRender(value: Callback): Self = StObject.set(x, "doAutoRender", value.toJsFn)
    
    inline def setDoAutoRenderUndefined: Self = StObject.set(x, "doAutoRender", js.undefined)
    
    inline def setDoComponentLayout(value: CallbackTo[typingsJapgolly.extjs.Ext.container.IContainer]): Self = StObject.set(x, "doComponentLayout", value.toJsFn)
    
    inline def setDoComponentLayoutUndefined: Self = StObject.set(x, "doComponentLayout", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEnable(value: /* silent */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "enable", js.Any.fromFunction1((t0: /* silent */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setEnableBubble(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setEnsureAttachedToBody(value: js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "ensureAttachedToBody", js.Any.fromFunction1((t0: js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setEnsureAttachedToBodyUndefined: Self = StObject.set(x, "ensureAttachedToBody", js.undefined)
    
    inline def setFindPlugin(value: /* ptype */ js.UndefOr[java.lang.String] => IAbstractPlugin): Self = StObject.set(x, "findPlugin", js.Any.fromFunction1(value))
    
    inline def setFindPluginUndefined: Self = StObject.set(x, "findPlugin", js.undefined)
    
    inline def setFireEvent(value: (/* eventName */ java.lang.String, /* repeated */ Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
    
    inline def setFireEventArgs(value: (js.UndefOr[java.lang.String], js.UndefOr[Array]) => Boolean): Self = StObject.set(x, "fireEventArgs", js.Any.fromFunction2(value))
    
    inline def setFireEventArgsUndefined: Self = StObject.set(x, "fireEventArgs", js.undefined)
    
    inline def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
    
    inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    
    inline def setForceComponentLayout(value: Callback): Self = StObject.set(x, "forceComponentLayout", value.toJsFn)
    
    inline def setForceComponentLayoutUndefined: Self = StObject.set(x, "forceComponentLayout", js.undefined)
    
    inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameSize(value: Any): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
    
    inline def setFrameSizeUndefined: Self = StObject.set(x, "frameSize", js.undefined)
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setGetActiveAnimation(value: CallbackTo[Any]): Self = StObject.set(x, "getActiveAnimation", value.toJsFn)
    
    inline def setGetActiveAnimationUndefined: Self = StObject.set(x, "getActiveAnimation", js.undefined)
    
    inline def setGetBubbleTarget(value: CallbackTo[typingsJapgolly.extjs.Ext.container.IContainer]): Self = StObject.set(x, "getBubbleTarget", value.toJsFn)
    
    inline def setGetBubbleTargetUndefined: Self = StObject.set(x, "getBubbleTarget", js.undefined)
    
    inline def setGetEl(value: CallbackTo[typingsJapgolly.extjs.Ext.dom.IElement]): Self = StObject.set(x, "getEl", value.toJsFn)
    
    inline def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    inline def setGetId(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
    
    inline def setGetInsertPosition(value: js.UndefOr[Any] => HTMLElement): Self = StObject.set(x, "getInsertPosition", js.Any.fromFunction1(value))
    
    inline def setGetInsertPositionUndefined: Self = StObject.set(x, "getInsertPosition", js.undefined)
    
    inline def setGetItemId(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getItemId", value.toJsFn)
    
    inline def setGetItemIdUndefined: Self = StObject.set(x, "getItemId", js.undefined)
    
    inline def setGetLoader(value: CallbackTo[IComponentLoader]): Self = StObject.set(x, "getLoader", value.toJsFn)
    
    inline def setGetLoaderUndefined: Self = StObject.set(x, "getLoader", js.undefined)
    
    inline def setGetPlugin(value: /* pluginId */ js.UndefOr[java.lang.String] => IAbstractPlugin): Self = StObject.set(x, "getPlugin", js.Any.fromFunction1(value))
    
    inline def setGetPluginUndefined: Self = StObject.set(x, "getPlugin", js.undefined)
    
    inline def setGetSize(value: CallbackTo[Any]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setGetSizeModel(value: /* ownerCtSizeModel */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getSizeModel", js.Any.fromFunction1(value))
    
    inline def setGetSizeModelUndefined: Self = StObject.set(x, "getSizeModel", js.undefined)
    
    inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    inline def setGetState(value: CallbackTo[Any]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
    
    inline def setGetXTypes(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getXTypes", value.toJsFn)
    
    inline def setGetXTypesUndefined: Self = StObject.set(x, "getXTypes", js.undefined)
    
    inline def setHasActiveFx(value: CallbackTo[Any]): Self = StObject.set(x, "hasActiveFx", value.toJsFn)
    
    inline def setHasActiveFxUndefined: Self = StObject.set(x, "hasActiveFx", js.undefined)
    
    inline def setHasCls(value: /* className */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "hasCls", js.Any.fromFunction1(value))
    
    inline def setHasClsUndefined: Self = StObject.set(x, "hasCls", js.undefined)
    
    inline def setHasListener(value: js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
    
    inline def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
    
    inline def setHasListeners(value: Any): Self = StObject.set(x, "hasListeners", value.asInstanceOf[js.Any])
    
    inline def setHasListenersUndefined: Self = StObject.set(x, "hasListeners", js.undefined)
    
    inline def setHasUICls(value: /* cls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "hasUICls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setHasUIClsUndefined: Self = StObject.set(x, "hasUICls", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHideMode(value: java.lang.String): Self = StObject.set(x, "hideMode", value.asInstanceOf[js.Any])
    
    inline def setHideModeUndefined: Self = StObject.set(x, "hideMode", js.undefined)
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitEvents(value: Callback): Self = StObject.set(x, "initEvents", value.toJsFn)
    
    inline def setInitEventsUndefined: Self = StObject.set(x, "initEvents", js.undefined)
    
    inline def setInitRenderData(value: CallbackTo[Any]): Self = StObject.set(x, "initRenderData", value.toJsFn)
    
    inline def setInitRenderDataUndefined: Self = StObject.set(x, "initRenderData", js.undefined)
    
    inline def setIs(value: /* selector */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    inline def setIsComponentUndefined: Self = StObject.set(x, "isComponent", js.undefined)
    
    inline def setIsDescendantOf(value: /* container */ js.UndefOr[IContainer] => Boolean): Self = StObject.set(x, "isDescendantOf", js.Any.fromFunction1(value))
    
    inline def setIsDescendantOfUndefined: Self = StObject.set(x, "isDescendantOf", js.undefined)
    
    inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setIsDraggable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDraggable", value.toJsFn)
    
    inline def setIsDraggableUndefined: Self = StObject.set(x, "isDraggable", js.undefined)
    
    inline def setIsDroppable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDroppable", value.toJsFn)
    
    inline def setIsDroppableUndefined: Self = StObject.set(x, "isDroppable", js.undefined)
    
    inline def setIsFloating(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFloating", value.toJsFn)
    
    inline def setIsFloatingUndefined: Self = StObject.set(x, "isFloating", js.undefined)
    
    inline def setIsHidden(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHidden", value.toJsFn)
    
    inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    inline def setIsLayoutRoot(value: Callback): Self = StObject.set(x, "isLayoutRoot", value.toJsFn)
    
    inline def setIsLayoutRootUndefined: Self = StObject.set(x, "isLayoutRoot", js.undefined)
    
    inline def setIsLayoutSuspended(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLayoutSuspended", value.toJsFn)
    
    inline def setIsLayoutSuspendedUndefined: Self = StObject.set(x, "isLayoutSuspended", js.undefined)
    
    inline def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
    
    inline def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
    
    inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    inline def setIsVisible(value: /* deep */ js.UndefOr[Boolean] => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setIsXType(value: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => Boolean): Self = StObject.set(x, "isXType", js.Any.fromFunction2(value))
    
    inline def setIsXTypeUndefined: Self = StObject.set(x, "isXType", js.undefined)
    
    inline def setItemId(value: java.lang.String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setLoader(value: Any): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaskOnDisable(value: Boolean): Self = StObject.set(x, "maskOnDisable", value.asInstanceOf[js.Any])
    
    inline def setMaskOnDisableUndefined: Self = StObject.set(x, "maskOnDisable", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMon(
      value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
    
    inline def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
    
    inline def setMun(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Callback): Self = StObject.set(x, "mun", js.Any.fromFunction4((t0: js.UndefOr[Any], t1: js.UndefOr[Any], t2: js.UndefOr[Any], t3: js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
    
    inline def setNextNode(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "nextNode", js.Any.fromFunction1(value))
    
    inline def setNextNodeUndefined: Self = StObject.set(x, "nextNode", js.undefined)
    
    inline def setNextSibling(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "nextSibling", js.Any.fromFunction1(value))
    
    inline def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
    
    inline def setOn(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Any): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
    
    inline def setOnAdded(
      value: (/* container */ js.UndefOr[typingsJapgolly.extjs.Ext.container.IContainer], /* pos */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "onAdded", js.Any.fromFunction2((t0: /* container */ js.UndefOr[typingsJapgolly.extjs.Ext.container.IContainer], t1: /* pos */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setOnAddedUndefined: Self = StObject.set(x, "onAdded", js.undefined)
    
    inline def setOnDisable(value: Callback): Self = StObject.set(x, "onDisable", value.toJsFn)
    
    inline def setOnDisableUndefined: Self = StObject.set(x, "onDisable", js.undefined)
    
    inline def setOnEnable(value: Callback): Self = StObject.set(x, "onEnable", value.toJsFn)
    
    inline def setOnEnableUndefined: Self = StObject.set(x, "onEnable", js.undefined)
    
    inline def setOnPosition(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "onPosition", js.Any.fromFunction2((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setOnPositionUndefined: Self = StObject.set(x, "onPosition", js.undefined)
    
    inline def setOnRemoved(value: /* destroying */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "onRemoved", js.Any.fromFunction1((t0: /* destroying */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setOnRemovedUndefined: Self = StObject.set(x, "onRemoved", js.undefined)
    
    inline def setOnRender(value: (js.UndefOr[typingsJapgolly.extjs.Ext.core.IElement], js.UndefOr[Double]) => Callback): Self = StObject.set(x, "onRender", js.Any.fromFunction2((t0: js.UndefOr[typingsJapgolly.extjs.Ext.core.IElement], t1: js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    inline def setOnResize(
      value: (/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any], /* oldWidth */ js.UndefOr[Any], /* oldHeight */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "onResize", js.Any.fromFunction4((t0: /* width */ js.UndefOr[Any], t1: /* height */ js.UndefOr[Any], t2: /* oldWidth */ js.UndefOr[Any], t3: /* oldHeight */ js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOverCls(value: java.lang.String): Self = StObject.set(x, "overCls", value.asInstanceOf[js.Any])
    
    inline def setOverClsUndefined: Self = StObject.set(x, "overCls", js.undefined)
    
    inline def setOwnerCt(value: IContainer): Self = StObject.set(x, "ownerCt", value.asInstanceOf[js.Any])
    
    inline def setOwnerCtUndefined: Self = StObject.set(x, "ownerCt", js.undefined)
    
    inline def setPadding(value: Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPlugins(value: Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPostBlur(value: /* e */ js.UndefOr[IEventObject] => Callback): Self = StObject.set(x, "postBlur", js.Any.fromFunction1((t0: /* e */ js.UndefOr[IEventObject]) => value(t0).runNow()))
    
    inline def setPostBlurUndefined: Self = StObject.set(x, "postBlur", js.undefined)
    
    inline def setPreviousNode(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "previousNode", js.Any.fromFunction1(value))
    
    inline def setPreviousNodeUndefined: Self = StObject.set(x, "previousNode", js.undefined)
    
    inline def setPreviousSibling(value: /* selector */ js.UndefOr[java.lang.String] => IComponent): Self = StObject.set(x, "previousSibling", js.Any.fromFunction1(value))
    
    inline def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
    
    inline def setRegisterFloatingItem(value: /* cmp */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "registerFloatingItem", js.Any.fromFunction1((t0: /* cmp */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setRegisterFloatingItemUndefined: Self = StObject.set(x, "registerFloatingItem", js.undefined)
    
    inline def setRelayEvents(value: (js.UndefOr[Any], js.UndefOr[Array], js.UndefOr[java.lang.String]) => Any): Self = StObject.set(x, "relayEvents", js.Any.fromFunction3(value))
    
    inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
    
    inline def setRemoveAnchor(value: CallbackTo[IPositionable]): Self = StObject.set(x, "removeAnchor", value.toJsFn)
    
    inline def setRemoveAnchorUndefined: Self = StObject.set(x, "removeAnchor", js.undefined)
    
    inline def setRemoveChildEls(value: js.UndefOr[Any] => Callback): Self = StObject.set(x, "removeChildEls", js.Any.fromFunction1((t0: js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setRemoveChildElsUndefined: Self = StObject.set(x, "removeChildEls", js.undefined)
    
    inline def setRemoveCls(value: /* cls */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "removeCls", js.Any.fromFunction1(value))
    
    inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
    
    inline def setRemoveClsWithUI(value: /* cls */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "removeClsWithUI", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setRemoveClsWithUIUndefined: Self = StObject.set(x, "removeClsWithUI", js.undefined)
    
    inline def setRemoveListener(value: (js.UndefOr[java.lang.String], js.UndefOr[Any], js.UndefOr[Any]) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction3((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[Any], t2: js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    
    inline def setRemoveManagedListener(value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Callback): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4((t0: js.UndefOr[Any], t1: js.UndefOr[Any], t2: js.UndefOr[Any], t3: js.UndefOr[Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
    
    inline def setRemoveUIClsFromElement(value: /* ui */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "removeUIClsFromElement", js.Any.fromFunction1((t0: /* ui */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setRemoveUIClsFromElementUndefined: Self = StObject.set(x, "removeUIClsFromElement", js.undefined)
    
    inline def setRender(value: (js.UndefOr[Any], js.UndefOr[Any]) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: js.UndefOr[Any], t1: js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setRenderData(value: Any): Self = StObject.set(x, "renderData", value.asInstanceOf[js.Any])
    
    inline def setRenderDataUndefined: Self = StObject.set(x, "renderData", js.undefined)
    
    inline def setRenderSelectors(value: Any): Self = StObject.set(x, "renderSelectors", value.asInstanceOf[js.Any])
    
    inline def setRenderSelectorsUndefined: Self = StObject.set(x, "renderSelectors", js.undefined)
    
    inline def setRenderTo(value: Any): Self = StObject.set(x, "renderTo", value.asInstanceOf[js.Any])
    
    inline def setRenderToUndefined: Self = StObject.set(x, "renderTo", js.undefined)
    
    inline def setRenderTpl(value: Any): Self = StObject.set(x, "renderTpl", value.asInstanceOf[js.Any])
    
    inline def setRenderTplUndefined: Self = StObject.set(x, "renderTpl", js.undefined)
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setResumeEvent(value: /* repeated */ Any => Callback): Self = StObject.set(x, "resumeEvent", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setResumeEventUndefined: Self = StObject.set(x, "resumeEvent", js.undefined)
    
    inline def setResumeEvents(value: Callback): Self = StObject.set(x, "resumeEvents", value.toJsFn)
    
    inline def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setSaveDelay(value: Double): Self = StObject.set(x, "saveDelay", value.asInstanceOf[js.Any])
    
    inline def setSaveDelayUndefined: Self = StObject.set(x, "saveDelay", js.undefined)
    
    inline def setSavePropToState(value: (js.UndefOr[java.lang.String], js.UndefOr[Any], js.UndefOr[java.lang.String]) => Boolean): Self = StObject.set(x, "savePropToState", js.Any.fromFunction3(value))
    
    inline def setSavePropToStateUndefined: Self = StObject.set(x, "savePropToState", js.undefined)
    
    inline def setSavePropsToState(value: (js.UndefOr[Any], js.UndefOr[Any]) => Any): Self = StObject.set(x, "savePropsToState", js.Any.fromFunction2(value))
    
    inline def setSavePropsToStateUndefined: Self = StObject.set(x, "savePropsToState", js.undefined)
    
    inline def setSaveState(value: Callback): Self = StObject.set(x, "saveState", value.toJsFn)
    
    inline def setSaveStateUndefined: Self = StObject.set(x, "saveState", js.undefined)
    
    inline def setSequenceFx(value: CallbackTo[Any]): Self = StObject.set(x, "sequenceFx", value.toJsFn)
    
    inline def setSequenceFxUndefined: Self = StObject.set(x, "sequenceFx", js.undefined)
    
    inline def setSetBorder(value: /* border */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setBorder", js.Any.fromFunction1((t0: /* border */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetBorderUndefined: Self = StObject.set(x, "setBorder", js.undefined)
    
    inline def setSetBox(value: (/* box */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => IPositionable): Self = StObject.set(x, "setBox", js.Any.fromFunction2(value))
    
    inline def setSetBoxUndefined: Self = StObject.set(x, "setBox", js.undefined)
    
    inline def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    inline def setSetDocked(value: (/* dock */ js.UndefOr[Any], /* layoutParent */ js.UndefOr[Boolean]) => IComponent): Self = StObject.set(x, "setDocked", js.Any.fromFunction2(value))
    
    inline def setSetDockedUndefined: Self = StObject.set(x, "setDocked", js.undefined)
    
    inline def setSetHeight(value: /* height */ js.UndefOr[Double] => IComponent): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetLocalX(value: /* x */ js.UndefOr[Any] => IPositionable): Self = StObject.set(x, "setLocalX", js.Any.fromFunction1(value))
    
    inline def setSetLocalXUndefined: Self = StObject.set(x, "setLocalX", js.undefined)
    
    inline def setSetLocalXY(value: (/* x */ js.UndefOr[Any], /* y */ js.UndefOr[Any]) => IPositionable): Self = StObject.set(x, "setLocalXY", js.Any.fromFunction2(value))
    
    inline def setSetLocalXYUndefined: Self = StObject.set(x, "setLocalXY", js.undefined)
    
    inline def setSetLocalY(value: /* y */ js.UndefOr[Any] => IPositionable): Self = StObject.set(x, "setLocalY", js.Any.fromFunction1(value))
    
    inline def setSetLocalYUndefined: Self = StObject.set(x, "setLocalY", js.undefined)
    
    inline def setSetMargin(value: /* margin */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMargin", js.Any.fromFunction1((t0: /* margin */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMarginUndefined: Self = StObject.set(x, "setMargin", js.undefined)
    
    inline def setSetRegion(value: (/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[Any]) => IPositionable): Self = StObject.set(x, "setRegion", js.Any.fromFunction2(value))
    
    inline def setSetRegionUndefined: Self = StObject.set(x, "setRegion", js.undefined)
    
    inline def setSetSize(value: (/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any]) => IComponent): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSetUI(value: /* ui */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setUI", js.Any.fromFunction1((t0: /* ui */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetUIUndefined: Self = StObject.set(x, "setUI", js.undefined)
    
    inline def setSetVisible(value: /* visible */ js.UndefOr[Boolean] => IComponent): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    inline def setSetVisibleUndefined: Self = StObject.set(x, "setVisible", js.undefined)
    
    inline def setSetWidth(value: /* width */ js.UndefOr[Double] => IComponent): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setSetX(value: (/* x */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => IPositionable): Self = StObject.set(x, "setX", js.Any.fromFunction2(value))
    
    inline def setSetXUndefined: Self = StObject.set(x, "setX", js.undefined)
    
    inline def setSetXY(value: (/* xy */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => IPositionable): Self = StObject.set(x, "setXY", js.Any.fromFunction2(value))
    
    inline def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
    
    inline def setSetY(value: (/* y */ js.UndefOr[Any], /* animate */ js.UndefOr[Any]) => IPositionable): Self = StObject.set(x, "setY", js.Any.fromFunction2(value))
    
    inline def setSetYUndefined: Self = StObject.set(x, "setY", js.undefined)
    
    inline def setShrinkWrap(value: Any): Self = StObject.set(x, "shrinkWrap", value.asInstanceOf[js.Any])
    
    inline def setShrinkWrapUndefined: Self = StObject.set(x, "shrinkWrap", js.undefined)
    
    inline def setStateEvents(value: Array): Self = StObject.set(x, "stateEvents", value.asInstanceOf[js.Any])
    
    inline def setStateEventsUndefined: Self = StObject.set(x, "stateEvents", js.undefined)
    
    inline def setStateId(value: java.lang.String): Self = StObject.set(x, "stateId", value.asInstanceOf[js.Any])
    
    inline def setStateIdUndefined: Self = StObject.set(x, "stateId", js.undefined)
    
    inline def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
    
    inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
    
    inline def setStopAnimation(value: CallbackTo[IElement]): Self = StObject.set(x, "stopAnimation", value.toJsFn)
    
    inline def setStopAnimationUndefined: Self = StObject.set(x, "stopAnimation", js.undefined)
    
    inline def setStopFx(value: CallbackTo[IElement]): Self = StObject.set(x, "stopFx", value.toJsFn)
    
    inline def setStopFxUndefined: Self = StObject.set(x, "stopFx", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuspendEvent(value: /* repeated */ Any => Callback): Self = StObject.set(x, "suspendEvent", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setSuspendEventUndefined: Self = StObject.set(x, "suspendEvent", js.undefined)
    
    inline def setSuspendEvents(value: js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction1((t0: js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
    
    inline def setSyncFx(value: CallbackTo[Any]): Self = StObject.set(x, "syncFx", value.toJsFn)
    
    inline def setSyncFxUndefined: Self = StObject.set(x, "syncFx", js.undefined)
    
    inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    inline def setTplWriteMode(value: java.lang.String): Self = StObject.set(x, "tplWriteMode", value.asInstanceOf[js.Any])
    
    inline def setTplWriteModeUndefined: Self = StObject.set(x, "tplWriteMode", js.undefined)
    
    inline def setUi(value: java.lang.String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    
    inline def setUn(value: (js.UndefOr[java.lang.String], js.UndefOr[Any], js.UndefOr[Any]) => Callback): Self = StObject.set(x, "un", js.Any.fromFunction3((t0: js.UndefOr[java.lang.String], t1: js.UndefOr[Any], t2: js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
    
    inline def setUp(
      value: (/* selector */ js.UndefOr[Any], /* limit */ js.UndefOr[Any]) => typingsJapgolly.extjs.Ext.container.IContainer
    ): Self = StObject.set(x, "up", js.Any.fromFunction2(value))
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    
    inline def setUpdate(
      value: (/* htmlOrData */ js.UndefOr[Any], /* loadScripts */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: /* htmlOrData */ js.UndefOr[Any], t1: /* loadScripts */ js.UndefOr[Boolean], t2: /* callback */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateLayout(value: /* options */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "updateLayout", js.Any.fromFunction1((t0: /* options */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setUpdateLayoutUndefined: Self = StObject.set(x, "updateLayout", js.undefined)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXtype(value: IWidget): Self = StObject.set(x, "xtype", value.asInstanceOf[js.Any])
    
    inline def setXtypeUndefined: Self = StObject.set(x, "xtype", js.undefined)
    
    inline def set_isLayoutRoot(value: Boolean): Self = StObject.set(x, "_isLayoutRoot", value.asInstanceOf[js.Any])
    
    inline def set_isLayoutRootUndefined: Self = StObject.set(x, "_isLayoutRoot", js.undefined)
  }
}
