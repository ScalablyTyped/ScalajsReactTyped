package typingsJapgolly.useItEventListener

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@use-it/event-listener", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A custom React Hook that provides a declarative useEventListener.
    */
  def default[T /* <: ReactEventFrom[Element] */](eventName: String, handler: EventHandler[T]): Unit = js.native
  def default[T /* <: ReactEventFrom[Element] */](eventName: String, handler: EventHandler[T], element: HTMLElement): Unit = js.native
}

