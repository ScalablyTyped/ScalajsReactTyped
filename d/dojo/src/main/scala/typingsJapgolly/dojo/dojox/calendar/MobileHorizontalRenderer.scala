package typingsJapgolly.dojo.dojox.calendar

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.dojo.dojoStrings.arrowPadding
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.edited
import typingsJapgolly.dojo.dojoStrings.hovered
import typingsJapgolly.dojo.dojoStrings.item
import typingsJapgolly.dojo.dojoStrings.mobile
import typingsJapgolly.dojo.dojoStrings.moveEnabled
import typingsJapgolly.dojo.dojoStrings.owner
import typingsJapgolly.dojo.dojoStrings.resizeEnabled
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.selected
import typingsJapgolly.dojo.dojoStrings.storeState
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import typingsJapgolly.dojo.dojoStrings.visibilityLimits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/MobileHorizontalRenderer.html
  *
  * The mobile specific item horizontal renderer.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.dojo.dojo.Stateful because Already inherited
- typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typingsJapgolly.dojo.dojox.calendar.RendererMixin because Inheritance from two classes. Inlined edited, set_edited, get_edited, watch_edited, set_focused, get_focused, watch_focused, hovered, set_hovered, get_hovered, watch_hovered, item, set_item, get_item, watch_item, moveEnabled, set_moveEnabled, get_moveEnabled, watch_moveEnabled, owner, set_owner, get_owner, watch_owner, resizeEnabled, set_resizeEnabled, get_resizeEnabled, watch_resizeEnabled, selected, set_selected, get_selected, watch_selected, storeState, set_storeState, get_storeState, watch_storeState, visibilityLimits, set_visibilityLimits, get_visibilityLimits, watch_visibilityLimits, get, getDisplayValue, postscript, set, updateRendering, watch
- typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calendar.MobileHorizontalRenderer")
@js.native
class MobileHorizontalRenderer () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The padding size in pixels to apply to the label container on left and/or right side, to show the arrows correctly.
    *
    */
  var arrowPadding: Double = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Indicates that the item displayed by this renderer is in editing mode.
    *
    */
  var edited: Boolean = js.native
  /**
    * Indicates that the item displayed by this renderer is hovered.
    *
    */
  var hovered: Boolean = js.native
  /**
    * The layout item displayed by this renderer.
    *
    */
  var item: js.Object = js.native
  /**
    *
    */
  var mobile: Boolean = js.native
  /**
    * Whether the event displayed by this renderer can be moved.
    *
    */
  var moveEnabled: Boolean = js.native
  /**
    * The view that contains this renderer.
    *
    */
  var owner: js.Object = js.native
  /**
    * Whether the event displayed by this renderer can be resized.
    *
    */
  var resizeEnabled: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Indicates that the item displayed by this renderer is selected.
    *
    */
  var selected: Boolean = js.native
  /**
    * Indicates that the item displayed by this renderer is not in the store, being saved to the store or in the store.
    *
    */
  var storeState: Boolean = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_MobileHorizontalRenderer: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    *
    */
  var visibilityLimits: js.Object = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  /**
    *
    * @param part
    */
  def getDisplayValue(part: js.Any): js.Any = js.native
  @JSName("get")
  def get_arrowPadding(property: arrowPadding): Double = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_edited(property: edited): Boolean = js.native
  @JSName("get")
  def get_hovered(property: hovered): Boolean = js.native
  @JSName("get")
  def get_item(property: item): js.Object = js.native
  @JSName("get")
  def get_mobile(property: mobile): Boolean = js.native
  @JSName("get")
  def get_moveEnabled(property: moveEnabled): Boolean = js.native
  @JSName("get")
  def get_owner(property: owner): js.Object = js.native
  @JSName("get")
  def get_resizeEnabled(property: resizeEnabled): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_selected(property: selected): Boolean = js.native
  @JSName("get")
  def get_storeState(property: storeState): Boolean = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_visibilityLimits(property: visibilityLimits): js.Object = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_arrowPadding(property: arrowPadding, value: Double): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_edited(property: edited, value: Boolean): Unit = js.native
  @JSName("set")
  def set_hovered(property: hovered, value: Boolean): Unit = js.native
  @JSName("set")
  def set_item(property: item, value: js.Object): Unit = js.native
  @JSName("set")
  def set_mobile(property: mobile, value: Boolean): Unit = js.native
  @JSName("set")
  def set_moveEnabled(property: moveEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_owner(property: owner, value: js.Object): Unit = js.native
  @JSName("set")
  def set_resizeEnabled(property: resizeEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: Boolean): Unit = js.native
  @JSName("set")
  def set_storeState(property: storeState, value: Boolean): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_visibilityLimits(property: visibilityLimits, value: js.Object): Unit = js.native
  /**
    * Updates the visual appearance of the renderer according the new values of the properties and the new size of the component.
    *
    * @param w               OptionalThe width in pixels of the renderer.
    * @param h               OptionalThe height in pixels of the renderer.
    */
  def updateRendering(w: Double, h: Double): Unit = js.native
  @JSName("watch")
  def watch_arrowPadding(
    property: arrowPadding,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_edited(
    property: edited,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hovered(
    property: hovered,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_item(
    property: item,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_mobile(
    property: mobile,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_moveEnabled(
    property: moveEnabled,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_owner(
    property: owner,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_resizeEnabled(
    property: resizeEnabled,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
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
  def watch_selected(
    property: selected,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_storeState(
    property: storeState,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_visibilityLimits(
    property: visibilityLimits,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): AnonUnwatch = js.native
}

