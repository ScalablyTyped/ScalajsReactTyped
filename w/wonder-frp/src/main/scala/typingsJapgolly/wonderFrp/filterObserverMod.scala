package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.iobserverMod.IObserver
import typingsJapgolly.wonderFrp.observerMod.Observer
import typingsJapgolly.wonderFrp.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/FilterObserver", JSImport.Namespace)
@js.native
object filterObserverMod extends js.Object {
  @js.native
  class FilterObserver protected () extends Observer {
    def this(prevObserver: IObserver, predicate: js.Function1[/* value */ js.Any, Boolean], source: Stream) = this()
    var i: Double = js.native
    var prevObserver: IObserver = js.native
    var source: Stream = js.native
    /* protected */ def predicate(value: js.Any): Boolean = js.native
    /* protected */ def predicate(value: js.Any, index: Double): Boolean = js.native
    /* protected */ def predicate(value: js.Any, index: Double, source: Stream): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FilterObserver extends js.Object {
    def create(
      prevObserver: IObserver,
      predicate: js.Function3[
          /* value */ js.Any, 
          /* index */ js.UndefOr[Double], 
          /* source */ js.UndefOr[Stream], 
          Boolean
        ],
      source: Stream
    ): FilterObserver = js.native
  }
  
}

