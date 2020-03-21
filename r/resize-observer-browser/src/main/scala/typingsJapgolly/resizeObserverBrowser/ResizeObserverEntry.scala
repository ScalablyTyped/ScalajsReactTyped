package typingsJapgolly.resizeObserverBrowser

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.DOMRectReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverEntry extends js.Object {
  val borderBoxSize: ResizeObserverSize
  val contentBoxSize: ResizeObserverSize
  val contentRect: DOMRectReadOnly
  val target: Element
}

object ResizeObserverEntry {
  @scala.inline
  def apply(
    borderBoxSize: ResizeObserverSize,
    contentBoxSize: ResizeObserverSize,
    contentRect: DOMRectReadOnly,
    target: Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizeObserverEntry]
  }
}

