package typingsJapgolly.semanticUiShape

import typingsJapgolly.semanticUiShape.SemanticUI.Shape
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.Translation
import typingsJapgolly.semanticUiShape.SemanticUI.ShapeSettings
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip back`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip down`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip left`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip over`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip right`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`flip up`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform down`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform left`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform right`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`get transform up`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`is animating`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`set default side`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`set next side`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.`set stage size`
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.beforeChange
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.className
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.debug
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.destroy
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.duration
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.error
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.height
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.initial
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.name
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.namespace
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.next
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.onChange
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.performance
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.queue
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.refresh
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.repaint
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.reset
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.selector
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.setting
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.silent
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.verbose
import typingsJapgolly.semanticUiShape.semanticUiShapeStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("shape")
  var shape_Original: Shape = js.native
  def shape(): JQuery = js.native
  def shape(behavior: setting, name: beforeChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def shape(behavior: setting, name: beforeChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def shape(behavior: setting, name: className): ClassNameSettings = js.native
  def shape(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def shape(behavior: setting, name: debug): Boolean = js.native
  def shape(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: duration): Double = js.native
  def shape(behavior: setting, name: duration, value: Double): JQuery = js.native
  def shape(behavior: setting, name: error): ErrorSettings = js.native
  def shape(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def shape(behavior: setting, name: height): next | initial | Double = js.native
  def shape(behavior: setting, name: height, value: Double): JQuery = js.native
  def shape(behavior: setting, name: height, value: initial): JQuery = js.native
  def shape(behavior: setting, name: height, value: next): JQuery = js.native
  def shape(behavior: setting, name: name): String = js.native
  def shape(behavior: setting, name: namespace): String = js.native
  def shape(behavior: setting, name: namespace, value: String): JQuery = js.native
  def shape(behavior: setting, name: name, value: String): JQuery = js.native
  def shape(behavior: setting, name: onChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def shape(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def shape(behavior: setting, name: performance): Boolean = js.native
  def shape(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: selector): SelectorSettings = js.native
  def shape(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def shape(behavior: setting, name: silent): Boolean = js.native
  def shape(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: verbose): Boolean = js.native
  def shape(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def shape(behavior: setting, name: width): next | initial | Double = js.native
  def shape(behavior: setting, name: width, value: Double): JQuery = js.native
  def shape(behavior: setting, name: width, value: initial): JQuery = js.native
  def shape(behavior: setting, name: width, value: next): JQuery = js.native
  def shape(settings: ShapeSettings): JQuery = js.native
  @JSName("shape")
  def shape_destroy(behavior: destroy): JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  @JSName("shape")
  def shape_flipback(behavior: `flip back`): JQuery = js.native
  /**
    * Flips the shape downward
    */
  @JSName("shape")
  def shape_flipdown(behavior: `flip down`): JQuery = js.native
  /**
    * Flips the shape left
    */
  @JSName("shape")
  def shape_flipleft(behavior: `flip left`): JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  @JSName("shape")
  def shape_flipover(behavior: `flip over`): JQuery = js.native
  /**
    * Flips the shape right
    */
  @JSName("shape")
  def shape_flipright(behavior: `flip right`): JQuery = js.native
  /**
    * Flips the shape upward
    */
  @JSName("shape")
  def shape_flipup(behavior: `flip up`): JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  @JSName("shape")
  def shape_gettransformdown(behavior: `get transform down`): Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  @JSName("shape")
  def shape_gettransformleft(behavior: `get transform left`): Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  @JSName("shape")
  def shape_gettransformright(behavior: `get transform right`): Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  @JSName("shape")
  def shape_gettransformup(behavior: `get transform up`): Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  @JSName("shape")
  def shape_isanimating(behavior: `is animating`): Boolean = js.native
  /**
    * Queues an animation until after current animation
    */
  @JSName("shape")
  def shape_queue(behavior: queue, animation: String): JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  @JSName("shape")
  def shape_refresh(behavior: refresh): JQuery = js.native
  /**
    * Forces a reflow on element
    */
  @JSName("shape")
  def shape_repaint(behavior: repaint): JQuery = js.native
  /**
    * Removes all inline styles
    */
  @JSName("shape")
  def shape_reset(behavior: reset): JQuery = js.native
  /**
    * Set the next side to next sibling to active element
    */
  @JSName("shape")
  def shape_setdefaultside(behavior: `set default side`): JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: String): JQuery = js.native
  @JSName("shape")
  def shape_setnextside(behavior: `set next side`, selector: JQuery): JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  @JSName("shape")
  def shape_setstagesize(behavior: `set stage size`): JQuery = js.native
  @JSName("shape")
  def shape_setting(behavior: setting, value: ShapeSettings): JQuery = js.native
}

