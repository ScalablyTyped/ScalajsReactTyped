package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.baseStreamMod.BaseStream
import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import typingsJapgolly.wonderFrp.observerMod.Observer
import typingsJapgolly.wonderFrp.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/FilterStream", JSImport.Namespace)
@js.native
object filterStreamMod extends js.Object {
  @js.native
  class FilterStream protected () extends BaseStream {
    def this(
      source: Stream,
      predicate: js.Function3[
            /* value */ js.Any, 
            /* index */ js.UndefOr[Double], 
            /* source */ js.UndefOr[Stream], 
            Boolean
          ],
      thisArg: js.Any
    ) = this()
    var _source: js.Any = js.native
    /* private */ def _innerPredicate(predicate: js.Any, self: js.Any): js.Any = js.native
    /* protected */ def createObserver(observer: IObserver): Observer = js.native
    /* protected */ def createStreamForInternalFilter(source: Stream, innerPredicate: js.Any, thisArg: js.Any): Stream = js.native
    def internalFilter(
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: js.Any
    ): Stream = js.native
    def predicate(value: js.Any): Boolean = js.native
    def predicate(value: js.Any, index: Double): Boolean = js.native
    def predicate(value: js.Any, index: Double, source: Stream): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FilterStream extends js.Object {
    def create(
      source: Stream,
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      thisArg: js.Any
    ): FilterStream = js.native
  }
  
}

