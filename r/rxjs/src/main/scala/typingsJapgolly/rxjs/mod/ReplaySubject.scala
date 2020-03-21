package typingsJapgolly.rxjs.mod

import typingsJapgolly.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "ReplaySubject")
@js.native
class ReplaySubject[T] ()
  extends typingsJapgolly.rxjs.replaySubjectMod.ReplaySubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, windowTime: Double) = this()
  def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
}

