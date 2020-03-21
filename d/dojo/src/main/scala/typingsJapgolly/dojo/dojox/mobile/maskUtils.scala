package typingsJapgolly.dojo.dojox.mobile

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_maskUtils.html
  *
  * Utility methods to clip rounded corners of various elements (Switch, ScrollablePane, scrollbars in scrollable widgets).
  * Uses -webkit-mask-image on webkit, or SVG on other browsers.
  *
  */
trait maskUtils extends js.Object {
  /**
    * Creates and sets a mask for the specified node.
    *
    * @param node
    * @param x
    * @param y
    * @param r
    * @param b
    * @param w
    * @param h
    * @param rx
    * @param ry
    * @param e
    */
  def createRoundMask(
    node: HTMLElement,
    x: js.Any,
    y: js.Any,
    r: js.Any,
    b: js.Any,
    w: js.Any,
    h: js.Any,
    rx: Double,
    ry: Double,
    e: js.Any
  ): Unit
}

object maskUtils {
  @scala.inline
  def apply(
    createRoundMask: (HTMLElement, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, Double, Double, js.Any) => Callback
  ): maskUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createRoundMask")(js.Any.fromFunction10((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any, t5: js.Any, t6: js.Any, t7: scala.Double, t8: scala.Double, t9: js.Any) => createRoundMask(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9).runNow()))
    __obj.asInstanceOf[maskUtils]
  }
}

