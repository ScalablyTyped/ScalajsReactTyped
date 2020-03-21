package typingsJapgolly.dojo.dojox.gfx3d

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/scheduler.html
  *
  *
  */
trait scheduler_ extends js.Object {
  /**
    *
    */
  var drawer: js.Object
  /**
    *
    */
  var scheduler: js.Object
  /**
    *
    */
  def BinarySearchTree(): Unit
}

object scheduler_ {
  @scala.inline
  def apply(BinarySearchTree: Callback, drawer: js.Object, scheduler: js.Object): scheduler_ = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any])
    __obj.updateDynamic("BinarySearchTree")(BinarySearchTree.toJsFn)
    __obj.asInstanceOf[scheduler_]
  }
}

