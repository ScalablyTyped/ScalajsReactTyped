package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalSubjectMod.Subject
import typingsJapgolly.rxjs.internalSubscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/util/canReportError", JSImport.Namespace)
@js.native
object internalUtilCanReportErrorMod extends js.Object {
  def canReportError(observer: Subject[_]): Boolean = js.native
  def canReportError(observer: Subscriber[_]): Boolean = js.native
}

