package typingsJapgolly.resizeObserverPolyfill.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.resizeObserverPolyfill.mod._Global_.ResizeObserverCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resize-observer-polyfill", JSImport.Default)
@js.native
class defaultCls protected () extends ResizeObserver {
  def this(callback: ResizeObserverCallback) = this()
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(target: Element): Unit = js.native
  /* CompleteClass */
  override def unobserve(target: Element): Unit = js.native
}

