package typingsJapgolly.reactAsync.mod

import org.scalajs.dom.experimental.RequestInit
import typingsJapgolly.reactAsync.reactAsyncStrings.run
import typingsJapgolly.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "useFetch")
@js.native
object useFetch extends js.Object {
  def apply[T](input: RequestInfo): (AsyncInitialWithout[run, T]) with FetchRun[T] = js.native
  def apply[T](input: RequestInfo, init: RequestInit): (AsyncInitialWithout[run, T]) with FetchRun[T] = js.native
  def apply[T](input: RequestInfo, init: RequestInit, options: FetchOptions[T]): (AsyncInitialWithout[run, T]) with FetchRun[T] = js.native
}

