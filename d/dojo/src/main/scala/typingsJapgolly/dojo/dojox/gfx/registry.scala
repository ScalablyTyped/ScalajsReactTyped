package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/registry.html
  *
  *
  */
trait registry extends js.Object {
  /**
    * Returns the shape that matches the specified id.
    *
    * @param id The unique identifier for this Shape.
    */
  def byId(id: String): Shape
  /**
    * Removes the specified shape from the registry.
    *
    * @param s The shape to unregister.
    * @param recurse               Optional
    */
  def dispose(s: Shape, recurse: Boolean): Unit
  /**
    * Register the specified shape into the graphics registry.
    *
    * @param s The shape to register.
    */
  def register(s: Shape): Double
}

object registry {
  @scala.inline
  def apply(
    byId: String => CallbackTo[Shape],
    dispose: (Shape, Boolean) => Callback,
    register: Shape => CallbackTo[Double]
  ): registry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("byId")(js.Any.fromFunction1((t0: java.lang.String) => byId(t0).runNow()))
    __obj.updateDynamic("dispose")(js.Any.fromFunction2((t0: typingsJapgolly.dojo.dojox.gfx.shape.Shape, t1: scala.Boolean) => dispose(t0, t1).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dojox.gfx.shape.Shape) => register(t0).runNow()))
    __obj.asInstanceOf[registry]
  }
}

