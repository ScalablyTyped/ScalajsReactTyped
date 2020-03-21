package typingsJapgolly.wonderFrp

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.wonderFrp.coreSchedulerMod.Scheduler
import typingsJapgolly.wonderFrp.streamAnonymousStreamMod.AnonymousStream
import typingsJapgolly.wonderFrp.streamDeferStreamMod.DeferStream
import typingsJapgolly.wonderFrp.streamFromArrayStreamMod.FromArrayStream
import typingsJapgolly.wonderFrp.streamFromEventPatternStreamMod.FromEventPatternStream
import typingsJapgolly.wonderFrp.streamFromPromiseStreamMod.FromPromiseStream
import typingsJapgolly.wonderFrp.streamIntervalRequestStreamMod.IntervalRequestStream
import typingsJapgolly.wonderFrp.streamIntervalStreamMod.IntervalStream
import typingsJapgolly.wonderFrp.streamTimeoutStreamMod.TimeoutStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/global/Operator", JSImport.Namespace)
@js.native
object globalOperatorMod extends js.Object {
  @js.native
  class Operator () extends js.Object
  
  var callFunc: js.Function2[/* func */ js.Function, /* context */ js.UndefOr[js.Any], AnonymousStream] = js.native
  var createStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.createStream */ js.Any = js.native
  var defer: js.Function1[/* buildStreamFunc */ js.Function, DeferStream] = js.native
  var empty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.empty */ js.Any = js.native
  var fromArray: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.fromArray */ js.Any = js.native
  var fromEvent: js.Function2[/* dom */ HTMLElement, /* eventName */ String, FromEventPatternStream] = js.native
  var fromEventPattern: js.Function2[
    /* addHandler */ js.Function, 
    /* removeHandler */ js.Function, 
    FromEventPatternStream
  ] = js.native
  var fromPromise: js.Function2[/* promise */ js.Any, /* scheduler */ js.UndefOr[Scheduler], FromPromiseStream] = js.native
  var interval: js.Function2[/* interval */ js.Any, /* scheduler */ js.UndefOr[Scheduler], IntervalStream] = js.native
  var intervalRequest: js.Function1[/* scheduler */ js.UndefOr[Scheduler], IntervalRequestStream] = js.native
  var judge: js.Function3[
    /* condition */ js.Function, 
    /* thenSource */ js.Function, 
    /* elseSource */ js.Function, 
    js.Any
  ] = js.native
  var just: js.Function1[/* returnValue */ js.Any, AnonymousStream] = js.native
  var timeout: js.Function2[/* time */ js.Any, /* scheduler */ js.UndefOr[Scheduler], TimeoutStream] = js.native
  /* static members */
  @js.native
  object Operator extends js.Object {
    def createStream(subscribeFunc: js.Any): AnonymousStream = js.native
    def empty(): AnonymousStream = js.native
    def fromArray(array: js.Array[_]): FromArrayStream = js.native
    def fromArray(array: js.Array[_], scheduler: Scheduler): FromArrayStream = js.native
  }
  
}

