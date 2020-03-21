package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.InternalListener
import typingsJapgolly.xstream.mod.Operator
import typingsJapgolly.xstream.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream/extra/dropRepeats", JSImport.Namespace)
@js.native
object dropRepeatsMod extends js.Object {
  @js.native
  class DropRepeatsOperator[T] protected () extends Operator[T, T] {
    def this(ins: Stream[T]) = this()
    def this(ins: Stream[T], fn: js.Function2[/* x */ T, /* y */ T, Boolean]) = this()
    /* CompleteClass */
    override var ins: Stream[T] = js.native
    /* CompleteClass */
    override var out: Stream[T] = js.native
    /* CompleteClass */
    override var `type`: String = js.native
    var v: js.Any = js.native
    /* CompleteClass */
    override def _c(): Unit = js.native
    /* CompleteClass */
    override def _e(err: js.Any): Unit = js.native
    /* CompleteClass */
    override def _n(v: T): Unit = js.native
    /* CompleteClass */
    override def _start(listener: InternalListener[T]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[T]): Unit = js.native
    /* CompleteClass */
    override def _stop(): Unit = js.native
    def isEq(x: T, y: T): Boolean = js.native
  }
  
  def default[T](): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
  def default[T](isEqual: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Function1[/* ins */ Stream[T], Stream[T]] = js.native
}

