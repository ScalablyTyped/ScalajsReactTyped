package typingsJapgolly.bounceJs.mod

import typingsJapgolly.jquery.JQueryPromise
import typingsJapgolly.jquery.JQuery_
import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounce extends js.Object {
  def applyTo(elements: js.Array[Element]): Unit = js.native
  def applyTo(elements: js.Array[Element], options: AnimationOptions): Unit = js.native
  def applyTo(elements: JQuery_[HTMLElement]): JQueryPromise[Unit] = js.native
  def applyTo(elements: JQuery_[HTMLElement], options: AnimationOptions): JQueryPromise[Unit] = js.native
  def applyTo(element: Element): Unit = js.native
  def applyTo(element: Element, options: AnimationOptions): Unit = js.native
  def define(name: String): Bounce = js.native
  def deserialize(serailized: js.Array[SerailizedComponent[Double | Point2D]]): Bounce = js.native
  def remove(): Unit = js.native
  def rotate(options: BounceOptions[Double]): Bounce = js.native
  def scale(options: BounceOptions[Point2D]): Bounce = js.native
  def serialize(): js.Array[SerailizedComponent[Double | Point2D]] = js.native
  def skew(options: BounceOptions[Point2D]): Bounce = js.native
  def translate(options: BounceOptions[Point2D]): Bounce = js.native
}

