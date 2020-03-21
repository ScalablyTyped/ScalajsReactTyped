package typingsJapgolly.dojo.dojox.mobile

import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_EditableIconMixin.html
  *
  * A mixin for IconContainer to make it editable.
  *
  */
@JSGlobal("dojox.mobile._EditableIconMixin")
@js.native
class EditableIconMixin () extends js.Object {
  /**
    *
    */
  var deleteIconForEdit: String = js.native
  /**
    *
    */
  var threshold: Double = js.native
  /**
    * User-defined function to handle clicks for the delete icon.
    *
    * @param e
    */
  def deleteIconClicked(e: Event_): Unit = js.native
  /**
    * Deletes the given item.
    *
    * @param item
    */
  def deleteItem(item: WidgetBase): Unit = js.native
  /**
    * Destroys the container.
    *
    */
  def destroy(): Unit = js.native
  /**
    * Ends the editing.
    *
    */
  def endEdit(): Unit = js.native
  /**
    * Moves a child without animation.
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def moveChild(widget: Double, insertIndex: Double): Unit = js.native
  /**
    * Moves a child without animation.
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def moveChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Moves a child with animation.
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def moveChildWithAnimation(widget: Double, insertIndex: Double): Unit = js.native
  /**
    * Moves a child with animation.
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def moveChildWithAnimation(widget: WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    * @param item
    */
  def onDeleteItem(item: WidgetBase): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    */
  def onEndEdit(): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    * @param item
    * @param from
    * @param to
    */
  def onMoveItem(item: WidgetBase, from: Double, to: Double): Unit = js.native
  /**
    * Stub function to connect to from your application.
    *
    */
  def onStartEdit(): Unit = js.native
  /**
    * Removes the given child with animation.
    *
    * @param widget
    */
  def removeChildWithAnimation(widget: Double): Unit = js.native
  /**
    * Removes the given child with animation.
    *
    * @param widget
    */
  def removeChildWithAnimation(widget: WidgetBase): Unit = js.native
  /**
    * Scales an item according to the specified ratio.
    *
    * @param widget
    * @param ratio
    */
  def scaleItem(widget: WidgetBase, ratio: Double): Unit = js.native
  /**
    * Starts the editing.
    *
    */
  def startEdit(): Unit = js.native
}

