package typingsJapgolly.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArray[T]
  extends KnockoutObservable[js.Array[T]]
     with KnockoutObservableArrayFunctions[T] {
  def extend(requestedExtenders: AnonPaged): KnockoutPagedObservableArray[T] = js.native
}

