package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/BehaviorSubject", JSImport.Namespace)
@js.native
object behaviorSubjectMod extends js.Object {
  @js.native
  class BehaviorSubject[T] protected () extends Subject[T] {
    def this(_value: T) = this()
    var _value: js.Any = js.native
    val value: T = js.native
    def getValue(): T = js.native
  }
  
}

