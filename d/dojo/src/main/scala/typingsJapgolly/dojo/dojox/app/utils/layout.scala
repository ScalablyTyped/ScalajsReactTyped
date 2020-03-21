package typingsJapgolly.dojo.dojox.app.utils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/utils/layout.html
  *
  *
  */
trait layout extends js.Object {
  /**
    * Layout a bunch of child dom nodes within a parent dom node
    *
    * @param container parent node
    * @param dim {l, t, w, h} object specifying dimensions of container into which to place children
    * @param children a list of children
    * @param changedRegionId               OptionalIf specified, the slider for the region with the specified id has been dragged, and thusthe region's height or width should be adjusted according to changedRegionSize
    * @param changedRegionSize               OptionalSee changedRegionId.
    */
  def layoutChildren(
    container: HTMLElement,
    dim: js.Object,
    children: js.Array[_],
    changedRegionId: String,
    changedRegionSize: Double
  ): Unit
  /**
    * Given the margin-box size of a node, return its content box size.
    * Functions like domGeometry.contentBox() but is more reliable since it doesn't have
    * to wait for the browser to compute sizes.
    *
    * @param node
    * @param mb
    */
  def marginBox2contentBox(node: HTMLElement, mb: js.Object): js.Object
}

object layout {
  @scala.inline
  def apply(
    layoutChildren: (HTMLElement, js.Object, js.Array[js.Any], String, Double) => Callback,
    marginBox2contentBox: (HTMLElement, js.Object) => CallbackTo[js.Object]
  ): layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layoutChildren")(js.Any.fromFunction5((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Object, t2: js.Array[js.Any], t3: java.lang.String, t4: scala.Double) => layoutChildren(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("marginBox2contentBox")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Object) => marginBox2contentBox(t0, t1).runNow()))
    __obj.asInstanceOf[layout]
  }
}

