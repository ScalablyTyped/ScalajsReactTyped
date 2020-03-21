package typingsJapgolly.dojo.dojox.calendar

import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dojo.Stateful
import typingsJapgolly.dojo.dojoStrings.edited
import typingsJapgolly.dojo.dojoStrings.focused
import typingsJapgolly.dojo.dojoStrings.hovered
import typingsJapgolly.dojo.dojoStrings.item
import typingsJapgolly.dojo.dojoStrings.moveEnabled
import typingsJapgolly.dojo.dojoStrings.owner
import typingsJapgolly.dojo.dojoStrings.resizeEnabled
import typingsJapgolly.dojo.dojoStrings.selected
import typingsJapgolly.dojo.dojoStrings.storeState
import typingsJapgolly.dojo.dojoStrings.visibilityLimits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/_RendererMixin.html
  *
  * This class is the base class of calendar renderers.
  *
  */
@JSGlobal("dojox.calendar._RendererMixin")
@js.native
class RendererMixin () extends Stateful {
  /**
    * Indicates that the item displayed by this renderer is in editing mode.
    *
    */
  var edited: Boolean = js.native
  /**
    * Indicates that the item displayed by this renderer is focused.
    *
    */
  var focused: Boolean = js.native
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
    *
    */
  var visibilityLimits: js.Object = js.native
  /**
    *
    * @param part
    */
  def getDisplayValue(part: js.Any): js.Any = js.native
  @JSName("get")
  def get_edited(property: edited): Boolean = js.native
  @JSName("get")
  def get_focused(property: focused): Boolean = js.native
  @JSName("get")
  def get_hovered(property: hovered): Boolean = js.native
  @JSName("get")
  def get_item(property: item): js.Object = js.native
  @JSName("get")
  def get_moveEnabled(property: moveEnabled): Boolean = js.native
  @JSName("get")
  def get_owner(property: owner): js.Object = js.native
  @JSName("get")
  def get_resizeEnabled(property: resizeEnabled): Boolean = js.native
  @JSName("get")
  def get_selected(property: selected): Boolean = js.native
  @JSName("get")
  def get_storeState(property: storeState): Boolean = js.native
  @JSName("get")
  def get_visibilityLimits(property: visibilityLimits): js.Object = js.native
  @JSName("set")
  def set_edited(property: edited, value: Boolean): Unit = js.native
  @JSName("set")
  def set_focused(property: focused, value: Boolean): Unit = js.native
  @JSName("set")
  def set_hovered(property: hovered, value: Boolean): Unit = js.native
  @JSName("set")
  def set_item(property: item, value: js.Object): Unit = js.native
  @JSName("set")
  def set_moveEnabled(property: moveEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_owner(property: owner, value: js.Object): Unit = js.native
  @JSName("set")
  def set_resizeEnabled(property: resizeEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selected(property: selected, value: Boolean): Unit = js.native
  @JSName("set")
  def set_storeState(property: storeState, value: Boolean): Unit = js.native
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
  def watch_edited(
    property: edited,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_focused(
    property: focused,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_hovered(
    property: hovered,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_item(
    property: item,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_moveEnabled(
    property: moveEnabled,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_owner(
    property: owner,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_resizeEnabled(
    property: resizeEnabled,
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
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_storeState(
    property: storeState,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_visibilityLimits(
    property: visibilityLimits,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

