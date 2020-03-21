package typingsJapgolly.frecency.mod

import typingsJapgolly.frecency.AnonExactQueryMatchWeight
import typingsJapgolly.frecency.AnonFrecencyScore
import typingsJapgolly.frecency.AnonKeepScores
import typingsJapgolly.frecency.AnonSearchQuery
import typingsJapgolly.frecency.AnonSearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frecency", JSImport.Default)
@js.native
class default[T] protected () extends Frecency[T] {
  def this(constructOpts: AnonExactQueryMatchWeight) = this()
  /* CompleteClass */
  override var sort: js.Function1[
    (/* arg */ AnonKeepScores[T]) | (/* arg */ AnonSearchResults[T]), 
    js.Array[(T with AnonFrecencyScore) | T]
  ] = js.native
  /* CompleteClass */
  override def save(arg: AnonSearchQuery[T]): Unit = js.native
}

