package typingsJapgolly.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends /* key */ StringDictionary[KnockoutBindingHandler] {
  def notifySubscribers(): Unit = js.native
  def notifySubscribers(valueToWrite: T): Unit = js.native
  def notifySubscribers(valueToWrite: T, event: String): Unit = js.native
}

