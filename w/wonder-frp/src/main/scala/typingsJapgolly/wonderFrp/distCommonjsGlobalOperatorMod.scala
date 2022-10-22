package typingsJapgolly.wonderFrp

import org.scalajs.dom.HTMLElement
import typingsJapgolly.wonderFrp.distCommonjsCoreSchedulerMod.Scheduler
import typingsJapgolly.wonderFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
import typingsJapgolly.wonderFrp.distCommonjsStreamDeferStreamMod.DeferStream
import typingsJapgolly.wonderFrp.distCommonjsStreamFromArrayStreamMod.FromArrayStream
import typingsJapgolly.wonderFrp.distCommonjsStreamFromEventPatternStreamMod.FromEventPatternStream
import typingsJapgolly.wonderFrp.distCommonjsStreamFromPromiseStreamMod.FromPromiseStream
import typingsJapgolly.wonderFrp.distCommonjsStreamIntervalRequestStreamMod.IntervalRequestStream
import typingsJapgolly.wonderFrp.distCommonjsStreamIntervalStreamMod.IntervalStream
import typingsJapgolly.wonderFrp.distCommonjsStreamTimeoutStreamMod.TimeoutStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsGlobalOperatorMod {
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "Operator")
  @js.native
  open class Operator () extends StObject
  /* static members */
  object Operator {
    
    @JSImport("wonder-frp/dist/commonjs/global/Operator", "Operator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createStream(subscribeFunc: Any): AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(subscribeFunc.asInstanceOf[js.Any]).asInstanceOf[AnonymousStream]
    
    inline def empty(): AnonymousStream = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[AnonymousStream]
    
    inline def fromArray(array: js.Array[Any]): FromArrayStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[FromArrayStream]
    inline def fromArray(array: js.Array[Any], scheduler: Scheduler): FromArrayStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[FromArrayStream]
  }
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "callFunc")
  @js.native
  def callFunc: js.Function2[/* func */ js.Function, /* context */ js.UndefOr[Any], AnonymousStream] = js.native
  inline def callFunc_=(x: js.Function2[/* func */ js.Function, /* context */ js.UndefOr[Any], AnonymousStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callFunc")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "createStream")
  @js.native
  def createStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.createStream */ Any = js.native
  inline def createStream_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.createStream */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createStream")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "defer")
  @js.native
  def defer: js.Function1[/* buildStreamFunc */ js.Function, DeferStream] = js.native
  inline def defer_=(x: js.Function1[/* buildStreamFunc */ js.Function, DeferStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defer")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "empty")
  @js.native
  def empty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.empty */ Any = js.native
  inline def empty_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.empty */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "fromArray")
  @js.native
  def fromArray: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.fromArray */ Any = js.native
  inline def fromArray_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Operator.fromArray */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromArray")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "fromEvent")
  @js.native
  def fromEvent: js.Function2[/* dom */ HTMLElement, /* eventName */ String, FromEventPatternStream] = js.native
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "fromEventPattern")
  @js.native
  def fromEventPattern: js.Function2[
    /* addHandler */ js.Function, 
    /* removeHandler */ js.Function, 
    FromEventPatternStream
  ] = js.native
  inline def fromEventPattern_=(
    x: js.Function2[
      /* addHandler */ js.Function, 
      /* removeHandler */ js.Function, 
      FromEventPatternStream
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEventPattern")(x.asInstanceOf[js.Any])
  
  inline def fromEvent_=(x: js.Function2[/* dom */ HTMLElement, /* eventName */ String, FromEventPatternStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromEvent")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "fromPromise")
  @js.native
  def fromPromise: js.Function2[/* promise */ Any, /* scheduler */ js.UndefOr[Scheduler], FromPromiseStream] = js.native
  inline def fromPromise_=(x: js.Function2[/* promise */ Any, /* scheduler */ js.UndefOr[Scheduler], FromPromiseStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromPromise")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "interval")
  @js.native
  def interval: js.Function2[/* interval */ Any, /* scheduler */ js.UndefOr[Scheduler], IntervalStream] = js.native
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "intervalRequest")
  @js.native
  def intervalRequest: js.Function1[/* scheduler */ js.UndefOr[Scheduler], IntervalRequestStream] = js.native
  inline def intervalRequest_=(x: js.Function1[/* scheduler */ js.UndefOr[Scheduler], IntervalRequestStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intervalRequest")(x.asInstanceOf[js.Any])
  
  inline def interval_=(x: js.Function2[/* interval */ Any, /* scheduler */ js.UndefOr[Scheduler], IntervalStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "judge")
  @js.native
  def judge: js.Function3[
    /* condition */ js.Function, 
    /* thenSource */ js.Function, 
    /* elseSource */ js.Function, 
    Any
  ] = js.native
  inline def judge_=(
    x: js.Function3[
      /* condition */ js.Function, 
      /* thenSource */ js.Function, 
      /* elseSource */ js.Function, 
      Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("judge")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "just")
  @js.native
  def just: js.Function1[/* returnValue */ Any, AnonymousStream] = js.native
  inline def just_=(x: js.Function1[/* returnValue */ Any, AnonymousStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("just")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/global/Operator", "timeout")
  @js.native
  def timeout: js.Function2[/* time */ Any, /* scheduler */ js.UndefOr[Scheduler], TimeoutStream] = js.native
  inline def timeout_=(x: js.Function2[/* time */ Any, /* scheduler */ js.UndefOr[Scheduler], TimeoutStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
}
