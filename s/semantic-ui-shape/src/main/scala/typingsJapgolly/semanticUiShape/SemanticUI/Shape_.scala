package typingsJapgolly.semanticUiShape.SemanticUI

import typingsJapgolly.semanticUiShape.JQuery
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typingsJapgolly.semanticUiShape.SemanticUI.Shape.Translation
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
trait Shape_ extends js.Object {
  var settings: ShapeSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Flips the shape over counter-clockwise
    */
  def apply(behavior: `flip back`): JQuery = js.native
  /**
    * Flips the shape downward
    */
  def apply(behavior: `flip down`): JQuery = js.native
  /**
    * Flips the shape left
    */
  def apply(behavior: `flip left`): JQuery = js.native
  /**
    * Flips the shape over clock-wise
    */
  def apply(behavior: `flip over`): JQuery = js.native
  /**
    * Flips the shape right
    */
  def apply(behavior: `flip right`): JQuery = js.native
  /**
    * Flips the shape upward
    */
  def apply(behavior: `flip up`): JQuery = js.native
  /**
    * Returns translation for next side staged below
    */
  def apply(behavior: `get transform down`): Translation = js.native
  /**
    * Returns translation for next side staged left
    */
  def apply(behavior: `get transform left`): Translation = js.native
  /**
    * Returns translation for next side staged right
    */
  def apply(behavior: `get transform right`): Translation = js.native
  /**
    * Returns translation for next side staged up
    */
  def apply(behavior: `get transform up`): Translation = js.native
  /**
    * Returns whether shape is currently animating
    */
  def apply(behavior: `is animating`): Boolean = js.native
  /**
    * Set the next side to next sibling to active element
    */
  def apply(behavior: `set default side`): JQuery = js.native
  /**
    * Set the next side to a specific selector
    */
  def apply(behavior: `set next side`, selector: String): JQuery = js.native
  def apply(behavior: `set next side`, selector: JQuery): JQuery = js.native
  /**
    * Sets shape to the content size of the next side
    */
  def apply(behavior: `set stage size`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Queues an animation until after current animation
    */
  def apply(behavior: queue, animation: String): JQuery = js.native
  /**
    * Refreshes the selector cache for element sides
    */
  def apply(behavior: refresh): JQuery = js.native
  /**
    * Forces a reflow on element
    */
  def apply(behavior: repaint): JQuery = js.native
  /**
    * Removes all inline styles
    */
  def apply(behavior: reset): JQuery = js.native
  def apply(behavior: setting, name: beforeChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: beforeChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: height): next | initial | Double = js.native
  def apply(behavior: setting, name: height, value: Double): JQuery = js.native
  def apply(behavior: setting, name: height, value: initial): JQuery = js.native
  def apply(behavior: setting, name: height, value: next): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: width): next | initial | Double = js.native
  def apply(behavior: setting, name: width, value: Double): JQuery = js.native
  def apply(behavior: setting, name: width, value: initial): JQuery = js.native
  def apply(behavior: setting, name: width, value: next): JQuery = js.native
  def apply(behavior: setting, value: ShapeSettings): JQuery = js.native
  def apply(settings: ShapeSettings): JQuery = js.native
}

