package typingsJapgolly.dojo.dojox.form

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.Widget
import typingsJapgolly.dojo.dijit.form.FormWidget
import typingsJapgolly.dojo.dojoStrings.`accept-charset`
import typingsJapgolly.dojo.dojoStrings.accept
import typingsJapgolly.dojo.dojoStrings.action
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.contextRequire
import typingsJapgolly.dojo.dojoStrings.encType
import typingsJapgolly.dojo.dojoStrings.method
import typingsJapgolly.dojo.dojoStrings.name
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.target
import typingsJapgolly.dojo.dojoStrings.watching
import typingsJapgolly.dojo.dojoStrings.widgetsInTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/Manager.html
  *
  * The widget to orchestrate dynamic forms.
  * This widget hosts dojox.form.manager mixins.
  * See _Mixin for more info.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dojox.form.manager.ClassMixin because Inheritance from two classes. Inlined addClass, gatherClassState, removeClass
- typingsJapgolly.dojo.dojox.form.manager.DisplayMixin because Inheritance from two classes. Inlined gatherDisplayState, hide, show
- typingsJapgolly.dojo.dojox.form.manager.EnableMixin because Inheritance from two classes. Inlined disable, enable, gatherEnableState
- typingsJapgolly.dojo.dojox.form.manager.ValueMixin because Inheritance from two classes. Inlined elementValue, gatherFormValues, setFormValues
- typingsJapgolly.dojo.dojox.form.manager.FormMixin because Inheritance from two classes. Inlined accept, `accept-charset`, action, encType, method, name, target, reset, submit, validate, onReset, onSubmit
- typingsJapgolly.dojo.dojox.form.manager.NodeMixin because Inheritance from two classes. Inlined formNodeValue, formNodeValue, formNodeValue, inspectFormNodes, registerNode, registerNode, registerNodeDescendants, registerNodeDescendants, unregisterNode, unregisterNodeDescendants, unregisterNodeDescendants
- typingsJapgolly.dojo.dojox.form.manager.Mixin because Inheritance from two classes. Inlined watching, destroy, formPointValue, formPointValue, formPointValue, formWidgetValue, formWidgetValue, formWidgetValue, inspect, inspectAttachedPoints, inspectFormWidgets, registerWidget, registerWidget, registerWidget, registerWidgetDescendants, registerWidgetDescendants, registerWidgetDescendants, unregisterWidget, unregisterWidgetDescendants, unregisterWidgetDescendants, unregisterWidgetDescendants
- typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, buildRendering, destroyRendering
- typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup */ @JSGlobal("dojox.form.Manager")
@js.native
class Manager_ () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var accept: String = js.native
  /**
    *
    */
  var `accept-charset`: String = js.native
  /**
    *
    */
  var action: String = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    *
    */
  var encType: String = js.native
  /**
    *
    */
  var method: String = js.native
  /**
    *
    */
  var name: String = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Manager_ : String = js.native
  /**
    *
    */
  var target: String = js.native
  /**
    *
    */
  var watching: Boolean = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * Add a class to nodes according to the supplied set of names
    *
    * @param className Class name to add.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  /**
    * Add a class to nodes according to the supplied set of names
    *
    * @param className Class name to add.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def addClass(className: String, names: js.Object): js.Function = js.native
  /**
    * Disable form controls according to the supplied state object
    * returning the previous state.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto enable and false to disable. If an array, all names in thearray will be disabled. If omitted, disables all.
    */
  /**
    * Disable form controls according to the supplied state object
    * returning the previous state.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto enable and false to disable. If an array, all names in thearray will be disabled. If omitted, disables all.
    */
  def disable(state: js.Object): js.Any = js.native
  /**
    * Set or get a form widget/element or an attached point node by name.
    *
    * @param name The name.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a form widget/element or an attached point node by name.
    *
    * @param name The name.
    * @param value               OptionalOptional. The value to set.
    */
  def elementValue(name: String, value: js.Object): js.Any = js.native
  /**
    * Enable form controls according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto enable and false to disable. If an array, all names in thearray will be set to defaultState. If omitted, all formelements will be set to defaultState.
    * @param defaultState The default state (true, if omitted).
    */
  /**
    * Enable form controls according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto enable and false to disable. If an array, all names in thearray will be set to defaultState. If omitted, all formelements will be set to defaultState.
    * @param defaultState The default state (true, if omitted).
    */
  def enable(state: js.Object, defaultState: Boolean): js.Function = js.native
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  def formNodeValue(elem: String, value: js.Object): js.Any = js.native
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  def formNodeValue(elem: js.Array[_], value: js.Object): js.Any = js.native
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a form element by name.
    *
    * @param elem Form element's name, DOM node, or array or radio nodes.
    * @param value               OptionalOptional. The value to set.
    */
  def formNodeValue(elem: typingsJapgolly.std.HTMLElement, value: js.Object): js.Any = js.native
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  def formPointValue(elem: String, value: js.Object): js.Any = js.native
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  def formPointValue(elem: js.Array[_], value: js.Object): js.Any = js.native
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a node context by name (using dojoAttachPoint).
    *
    * @param elem A node.
    * @param value               OptionalOptional. The value to set.
    */
  def formPointValue(elem: js.Object, value: js.Object): js.Any = js.native
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  def formWidgetValue(elem: String, value: js.Object): js.Any = js.native
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  def formWidgetValue(elem: js.Array[_], value: js.Object): js.Any = js.native
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  /**
    * Set or get a form widget by name.
    *
    * @param elem Form element's name, widget object, or array or radio widgets.
    * @param value               OptionalOptional. The value to set.
    */
  def formWidgetValue(elem: js.Object, value: js.Object): js.Any = js.native
  /**
    * Gather the presence of a certain class in all controlled elements.
    *
    * @param className The class name to test for.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  /**
    * Gather the presence of a certain class in all controlled elements.
    *
    * @param className The class name to test for.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def gatherClassState(className: String, names: js.Object): js.Any = js.native
  /**
    * Gather display state of all attached elements and return as a dictionary.
    *
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known attach point nodes are to be processed.
    */
  /**
    * Gather display state of all attached elements and return as a dictionary.
    *
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known attach point nodes are to be processed.
    */
  def gatherDisplayState(names: js.Object): js.Any = js.native
  /**
    * Gather enable state of all form elements and return as a dictionary.
    *
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  /**
    * Gather enable state of all form elements and return as a dictionary.
    *
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def gatherEnableState(names: js.Object): js.Any = js.native
  /**
    * Collect form values.
    *
    * @param names               OptionalIf it is an array, it is a list of names of form elements to be collected.If it is an object, dictionary keys are names to be collected.If it is omitted, all known form elements are to be collected.
    */
  /**
    * Collect form values.
    *
    * @param names               OptionalIf it is an array, it is a list of names of form elements to be collected.If it is an object, dictionary keys are names to be collected.If it is omitted, all known form elements are to be collected.
    */
  def gatherFormValues(names: js.Object): js.Any = js.native
  @JSName("get")
  def get_accept(property: accept): String = js.native
  @JSName("get")
  def get_acceptcharset(property: `accept-charset`): String = js.native
  @JSName("get")
  def get_action(property: action): String = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_encType(property: encType): String = js.native
  @JSName("get")
  def get_method(property: method): String = js.native
  @JSName("get")
  def get_name(property: name): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_target(property: target): String = js.native
  @JSName("get")
  def get_watching(property: watching): Boolean = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    * Hide attached nodes according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto show and false to hide. If an array, all names in thearray will be hidden. If omitted, all form elementswill be hidden.
    */
  /**
    * Hide attached nodes according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto show and false to hide. If an array, all names in thearray will be hidden. If omitted, all form elementswill be hidden.
    */
  def hide(state: js.Object): js.Any = js.native
  /**
    * Run an inspector function on controlled elements returning a result object.
    *
    * @param inspector A function to be called on a widget, form element, and an attached node.Takes three arguments: a name, a node (domNode in the case of widget) oran array of such objects, and a supplied value. Runs in the context ofthe form manager. Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all controlled elements will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  /**
    * Run an inspector function on controlled elements returning a result object.
    *
    * @param inspector A function to be called on a widget, form element, and an attached node.Takes three arguments: a name, a node (domNode in the case of widget) oran array of such objects, and a supplied value. Runs in the context ofthe form manager. Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all controlled elements will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspect(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Any = js.native
  /**
    * Run an inspector function on "dojoAttachPoint" nodes returning a result object.
    *
    * @param inspector A function to be called on a node. Takes three arguments: a name, a node oran array of nodes, and a supplied value. Runs in the context of the form manager.Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all attached point nodes will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  /**
    * Run an inspector function on "dojoAttachPoint" nodes returning a result object.
    *
    * @param inspector A function to be called on a node. Takes three arguments: a name, a node oran array of nodes, and a supplied value. Runs in the context of the form manager.Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all attached point nodes will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspectAttachedPoints(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Object = js.native
  /**
    * Run an inspector function on controlled form elements returning a result object.
    *
    * @param inspector A function to be called on a form element. Takes three arguments: a name, a node oran array of nodes, and a supplied value. Runs in the context of the form manager.Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all form elements will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  /**
    * Run an inspector function on controlled form elements returning a result object.
    *
    * @param inspector A function to be called on a form element. Takes three arguments: a name, a node oran array of nodes, and a supplied value. Runs in the context of the form manager.Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all form elements will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspectFormNodes(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Object = js.native
  /**
    * Run an inspector function on controlled widgets returning a result object.
    *
    * @param inspector A function to be called on a widget. Takes three arguments: a name, a widget objector an array of widget objects, and a supplied value. Runs in the context ofthe form manager. Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all widgets will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  /**
    * Run an inspector function on controlled widgets returning a result object.
    *
    * @param inspector A function to be called on a widget. Takes three arguments: a name, a widget objector an array of widget objects, and a supplied value. Runs in the context ofthe form manager. Returns a value that will be collected and returned as a state.
    * @param state               OptionalOptional. If a name-value dictionary --- only listed names will be processed.If an array, all names in the array will be processed with defaultValue.If omitted or null, all widgets will be processed with defaultValue.
    * @param defaultValue               OptionalOptional. The default state (true, if omitted).
    */
  def inspectFormWidgets(inspector: js.Function, state: js.Object, defaultValue: js.Object): js.Object = js.native
  /**
    * Make sure that every widget that has a validator function returns true.
    *
    */
  @JSName("isValid")
  def isValid_MManager_(): Boolean = js.native
  /**
    * Callback when user resets the form. This method is intended
    * to be over-ridden. When the reset method is called
    * programmatically, the return value from onReset is used
    * to compute whether or not resetting should proceed
    *
    */
  /**
    * Callback when user resets the form. This method is intended
    * to be over-ridden. When the reset method is called
    * programmatically, the return value from onReset is used
    * to compute whether or not resetting should proceed
    *
    */
  def onReset(): Boolean = js.native
  /**
    * Callback when user submits the form. This method is
    * intended to be over-ridden, but by default it checks and
    * returns the validity of form elements. When the submit
    * method is called programmatically, the return value from
    * onSubmit is used to compute whether or not submission
    * should proceed
    *
    */
  /**
    * Callback when user submits the form. This method is
    * intended to be over-ridden, but by default it checks and
    * returns the validity of form elements. When the submit
    * method is called programmatically, the return value from
    * onSubmit is used to compute whether or not submission
    * should proceed
    *
    */
  def onSubmit(): js.Any = js.native
  /**
    * Register a node with the form manager
    *
    * @param node A node, or its id
    */
  /**
    * Register a node with the form manager
    *
    * @param node A node, or its id
    */
  def registerNode(node: String): js.Any = js.native
  /**
    * Register a node with the form manager
    *
    * @param node A node, or its id
    */
  /**
    * Register a node with the form manager
    *
    * @param node A node, or its id
    */
  def registerNode(node: typingsJapgolly.std.HTMLElement): js.Any = js.native
  /**
    * Register node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  /**
    * Register node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def registerNodeDescendants(node: String): js.Any = js.native
  /**
    * Register node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  /**
    * Register node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def registerNodeDescendants(node: typingsJapgolly.std.HTMLElement): js.Any = js.native
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidget(widget: String): js.Any = js.native
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidget(widget: FormWidget): js.Any = js.native
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Register a widget with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidget(widget: typingsJapgolly.std.HTMLElement): js.Any = js.native
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidgetDescendants(widget: String): js.Any = js.native
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidgetDescendants(widget: Widget): js.Any = js.native
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Register widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def registerWidgetDescendants(widget: typingsJapgolly.std.HTMLElement): js.Any = js.native
  /**
    * Remove a class from nodes according to the supplied set of names
    *
    * @param className Class name to remove.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  /**
    * Remove a class from nodes according to the supplied set of names
    *
    * @param className Class name to remove.
    * @param names               OptionalIf it is an array, it is a list of names to be processed.If it is an object, dictionary keys are names to be processed.If it is omitted, all known form elements are to be processed.
    */
  def removeClass(className: String, names: js.Object): js.Function = js.native
  /**
    * Resets form widget values.
    *
    */
  /**
    * Resets form widget values.
    *
    */
  def reset(): js.Function = js.native
  /**
    * Set values to form elements
    *
    * @param values A dictionary of key-value pairs.
    */
  /**
    * Set values to form elements
    *
    * @param values A dictionary of key-value pairs.
    */
  def setFormValues(values: js.Object): js.Function = js.native
  @JSName("set")
  def set_accept(property: accept, value: String): Unit = js.native
  @JSName("set")
  def set_acceptcharset(property: `accept-charset`, value: String): Unit = js.native
  @JSName("set")
  def set_action(property: action, value: String): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_encType(property: encType, value: String): Unit = js.native
  @JSName("set")
  def set_method(property: method, value: String): Unit = js.native
  @JSName("set")
  def set_name(property: name, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_target(property: target, value: String): Unit = js.native
  @JSName("set")
  def set_watching(property: watching, value: Boolean): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  /**
    * Show attached nodes according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto show and false to hide. If an array, all names in thearray will be set to defaultState. If omitted, all formelements will be set to defaultState.
    * @param defaultState               OptionalThe default state (true, if omitted).
    */
  /**
    * Show attached nodes according to the supplied state object.
    *
    * @param state               OptionalOptional. If a name-value dictionary, the value is trueto show and false to hide. If an array, all names in thearray will be set to defaultState. If omitted, all formelements will be set to defaultState.
    * @param defaultState               OptionalThe default state (true, if omitted).
    */
  def show(state: js.Object, defaultState: Boolean): js.Function = js.native
  /**
    * programmatically submit form if and only if the onSubmit returns true
    *
    */
  /**
    * programmatically submit form if and only if the onSubmit returns true
    *
    */
  def submit(): Unit = js.native
  /**
    * Removes the node by name from internal tables unregistering
    * connected observers
    *
    * @param name Name of the to unregister
    */
  /**
    * Removes the node by name from internal tables unregistering
    * connected observers
    *
    * @param name Name of the to unregister
    */
  def unregisterNode(name: String): js.Any = js.native
  /**
    * Unregister node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  /**
    * Unregister node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def unregisterNodeDescendants(node: String): js.Any = js.native
  /**
    * Unregister node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  /**
    * Unregister node's descendants (form nodes) with the form manager
    *
    * @param node A widget, or its widgetId, or its DOM node
    */
  def unregisterNodeDescendants(node: typingsJapgolly.std.HTMLElement): js.Any = js.native
  /**
    * Removes the widget by name from internal tables unregistering
    * connected observers
    *
    * @param name Name of the to unregister
    */
  /**
    * Removes the widget by name from internal tables unregistering
    * connected observers
    *
    * @param name Name of the to unregister
    */
  def unregisterWidget(name: String): js.Any = js.native
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def unregisterWidgetDescendants(widget: String): js.Any = js.native
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def unregisterWidgetDescendants(widget: Widget): js.Any = js.native
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  /**
    * Unregister widget's descendants with the form manager
    *
    * @param widget A widget, or its widgetId, or its DOM node
    */
  def unregisterWidgetDescendants(widget: typingsJapgolly.std.HTMLElement): js.Any = js.native
  /**
    * validate() returns if the form is valid - same as isValid -
    * but provides a few additional (ui-specific) features: it
    * will highlight any sub-widgets that are not valid it will
    * call focus() on the first invalid sub-widget
    *
    */
  /**
    * validate() returns if the form is valid - same as isValid -
    * but provides a few additional (ui-specific) features: it
    * will highlight any sub-widgets that are not valid it will
    * call focus() on the first invalid sub-widget
    *
    */
  def validate(): Boolean = js.native
  @JSName("watch")
  def watch_accept(
    property: accept,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_acceptcharset(
    property: `accept-charset`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_action(
    property: action,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_contextRequire(
    property: contextRequire,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_encType(
    property: encType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_method(
    property: method,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_name(
    property: name,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_target(
    property: target,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_watching(
    property: watching,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(
    property: widgetsInTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

