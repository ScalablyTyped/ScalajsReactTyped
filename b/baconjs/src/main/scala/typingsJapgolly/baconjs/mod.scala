package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.anon.Fn0
import typingsJapgolly.baconjs.anon.Fn1
import typingsJapgolly.baconjs.anon.Fn10
import typingsJapgolly.baconjs.anon.Fn2
import typingsJapgolly.baconjs.anon.Fn3
import typingsJapgolly.baconjs.anon.Fn4
import typingsJapgolly.baconjs.anon.Fn5
import typingsJapgolly.baconjs.anon.Fn6
import typingsJapgolly.baconjs.anon.Fn7
import typingsJapgolly.baconjs.anon.Fn8
import typingsJapgolly.baconjs.anon.Fn9
import typingsJapgolly.baconjs.anon.FnCall
import typingsJapgolly.baconjs.anon.FnCallF
import typingsJapgolly.baconjs.anon.FnCallFXs
import typingsJapgolly.baconjs.anon.FnCallFnMe
import typingsJapgolly.baconjs.anon.FnCallX
import typingsJapgolly.baconjs.anon.FnCallXXs
import typingsJapgolly.baconjs.anon.FnCallXs
import typingsJapgolly.baconjs.anon.FnCallXsF
import typingsJapgolly.baconjs.anon.FnCallXsSeedF
import typingsJapgolly.baconjs.anon.FnCallXsX
import typingsJapgolly.baconjs.typesBusMod.default
import typingsJapgolly.baconjs.typesCombinetemplateMod.CombinedTemplate
import typingsJapgolly.baconjs.typesCompositeunsubscribeMod.Subscription
import typingsJapgolly.baconjs.typesFrombinderMod.Binder
import typingsJapgolly.baconjs.typesFrombinderMod.EventTransformer
import typingsJapgolly.baconjs.typesFromeventMod.EventSourceFn
import typingsJapgolly.baconjs.typesFrompollMod.PollFunction
import typingsJapgolly.baconjs.typesObservableMod.EventStreamOptions
import typingsJapgolly.baconjs.typesReplyMod.Reply
import typingsJapgolly.baconjs.typesRetryMod.RetryOptions
import typingsJapgolly.baconjs.typesSchedulerMod.Scheduler
import typingsJapgolly.baconjs.typesSpyMod.Spy_
import typingsJapgolly.baconjs.typesTypesMod.EventSink
import typingsJapgolly.baconjs.typesTypesMod.Function0
import typingsJapgolly.baconjs.typesTypesMod.Function1
import typingsJapgolly.baconjs.typesTypesMod.Function2
import typingsJapgolly.baconjs.typesTypesMod.Function3
import typingsJapgolly.baconjs.typesTypesMod.Function4
import typingsJapgolly.baconjs.typesTypesMod.Function5
import typingsJapgolly.baconjs.typesTypesMod.Function6
import typingsJapgolly.baconjs.typesTypesMod.Sink
import typingsJapgolly.baconjs.typesTypesMod.Subscribe
import typingsJapgolly.baconjs.typesTypesMod.Unsub
import typingsJapgolly.baconjs.typesTypesMod.VoidSink
import typingsJapgolly.baconjs.typesUpdateMod.UpdatePattern
import typingsJapgolly.baconjs.typesWhenMod.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("baconjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baconjs", "Bus")
  @js.native
  open class Bus[V] () extends default[V]
  
  @JSImport("baconjs", "CompositeUnsubscribe")
  @js.native
  open class CompositeUnsubscribe ()
    extends typingsJapgolly.baconjs.typesCompositeunsubscribeMod.default {
    def this(ss: js.Array[Subscription]) = this()
  }
  
  @JSImport("baconjs", "Desc")
  @js.native
  open class Desc protected ()
    extends typingsJapgolly.baconjs.typesDescribeMod.Desc {
    def this(context: Any, method: String) = this()
    def this(context: Any, method: String, args: js.Array[Any]) = this()
  }
  
  @JSImport("baconjs", "End")
  @js.native
  open class End ()
    extends typingsJapgolly.baconjs.typesEventMod.End
  
  @JSImport("baconjs", "Error")
  @js.native
  open class Error protected ()
    extends typingsJapgolly.baconjs.typesEventMod.Error {
    def this(error: Any) = this()
  }
  
  /* note: abstract class */ @JSImport("baconjs", "Event")
  @js.native
  open class Event[V] ()
    extends typingsJapgolly.baconjs.typesEventMod.Event[V]
  
  @JSImport("baconjs", "EventStream")
  @js.native
  open class EventStream[V] protected ()
    extends typingsJapgolly.baconjs.typesObservableMod.EventStream[V] {
    def this(desc: typingsJapgolly.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
    def this(
      desc: typingsJapgolly.baconjs.typesDescribeMod.Desc,
      subscribe: Subscribe[V],
      handler: EventSink[V]
    ) = this()
    def this(
      desc: typingsJapgolly.baconjs.typesDescribeMod.Desc,
      subscribe: Subscribe[V],
      handler: Unit,
      options: EventStreamOptions
    ) = this()
    def this(
      desc: typingsJapgolly.baconjs.typesDescribeMod.Desc,
      subscribe: Subscribe[V],
      handler: EventSink[V],
      options: EventStreamOptions
    ) = this()
  }
  
  @JSImport("baconjs", "Initial")
  @js.native
  open class Initial[V] protected ()
    extends typingsJapgolly.baconjs.typesEventMod.Initial[V] {
    def this(value: V) = this()
  }
  
  @JSImport("baconjs", "Next")
  @js.native
  open class Next[V] protected ()
    extends typingsJapgolly.baconjs.typesEventMod.Next[V] {
    def this(value: V) = this()
  }
  
  /* note: abstract class */ @JSImport("baconjs", "Observable")
  @js.native
  open class Observable[V] protected ()
    extends typingsJapgolly.baconjs.typesObservableMod.Observable[V] {
    def this(desc: typingsJapgolly.baconjs.typesDescribeMod.Desc) = this()
  }
  
  @JSImport("baconjs", "Property")
  @js.native
  open class Property[V] protected ()
    extends typingsJapgolly.baconjs.typesObservableMod.Property[V] {
    def this(desc: typingsJapgolly.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
    def this(
      desc: typingsJapgolly.baconjs.typesDescribeMod.Desc,
      subscribe: Subscribe[V],
      handler: EventSink[V]
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("baconjs", "Value")
  @js.native
  open class Value[V] protected ()
    extends typingsJapgolly.baconjs.typesEventMod.Value[V] {
    def this(value: V) = this()
  }
  
  object _empty {
    
    @JSImport("baconjs", "$")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Creates an EventStream from events on a
      jQuery or Zepto.js object. You can pass optional arguments to add a
      jQuery live selector and/or a function that processes the jQuery
      event and its parameters, if given, like this:
      
      ```js
      $("#my-div").asEventStream("click", ".more-specific-selector")
      $("#my-div").asEventStream("click", ".more-specific-selector", function(event, args) { return args[0] })
      $("#my-div").asEventStream("click", function(event, args) { return args[0] })
      ```
      
      Note: you need to install the `asEventStream` method on JQuery by calling
      [init()](#_.aseventstream) as in `Bacon.$.init($)`.
      */
    inline def asEventStream(eventName: String, selector: String, eventTransformer: Any): typingsJapgolly.baconjs.typesObservableMod.EventStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("asEventStream")(eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[Any]]
    inline def asEventStream(eventName: String, selector: Unit, eventTransformer: Any): typingsJapgolly.baconjs.typesObservableMod.EventStream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("asEventStream")(eventName.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[Any]]
    
    /**
      * Installs the [asEventStream](#_.aseventstream) to the given jQuery/Zepto object (the `$` object).
      */
    inline def init(jQuery: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(jQuery.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object _underscore {
    
    @JSImport("baconjs", "_")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs", "_.all")
    @js.native
    def all: Fn7 = js.native
    inline def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def all_=(x: Fn7): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.always")
    @js.native
    def always: FnCallX = js.native
    inline def always[A](x: A): js.Function0[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("always")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function0[A]]
    inline def always_=(x: FnCallX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("always")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.any")
    @js.native
    def any: Any = js.native
    inline def any_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.bind")
    @js.native
    def bind: FnCallFnMe = js.native
    inline def bind[F /* <: js.Function */](fn: F, me: Any): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], me.asInstanceOf[js.Any])).asInstanceOf[F]
    inline def bind_=(x: FnCallFnMe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bind")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.contains")
    @js.native
    def contains: FnCallXsX = js.native
    inline def contains[A](xs: js.Array[A], x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(xs.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def contains_=(x: FnCallXsX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.each")
    @js.native
    def each: Fn3 = js.native
    inline def each[A](xs: Any, f: js.Function2[/* key */ String, /* x */ A, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def each_=(x: Fn3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("each")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.empty")
    @js.native
    def empty: Fn0 = js.native
    inline def empty[A](xs: js.Array[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(xs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def empty_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.filter")
    @js.native
    def filter: FnCallFXs = js.native
    inline def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
    inline def filter_=(x: FnCallFXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.flatMap")
    @js.native
    def flatMap: Fn9 = js.native
    inline def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
    inline def flatMap_=(x: Fn9): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatMap")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.fold")
    @js.native
    def fold: FnCallXsSeedF = js.native
    inline def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(xs.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[A]
    inline def fold_=(x: FnCallXsSeedF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fold")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.head")
    @js.native
    def head: FnCallXs = js.native
    inline def head[V](xs: js.Array[V]): V = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(xs.asInstanceOf[js.Any]).asInstanceOf[V]
    inline def head_=(x: FnCallXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.id")
    @js.native
    def id: Fn5 = js.native
    inline def id[A](x: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(x.asInstanceOf[js.Any]).asInstanceOf[A]
    inline def id_=(x: Fn5): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.indexOf")
    @js.native
    def indexOf: FnCall = js.native
    inline def indexOf[A](xs: js.Array[A], x: A): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(xs.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexOf_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.indexWhere")
    @js.native
    def indexWhere: FnCallXsF = js.native
    inline def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexWhere")(xs.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexWhere_=(x: FnCallXsF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexWhere")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.isFunction")
    @js.native
    def isFunction: js.Function1[/* f */ Any, /* is std.Function */ Boolean] = js.native
    inline def isFunction(f: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(f.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    inline def isFunction_=(x: js.Function1[/* f */ Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.last")
    @js.native
    def last: Fn6 = js.native
    inline def last[A](xs: js.Array[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(xs.asInstanceOf[js.Any]).asInstanceOf[A]
    inline def last_=(x: Fn6): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("last")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.map")
    @js.native
    def map: Fn2 = js.native
    inline def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
    inline def map_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.negate")
    @js.native
    def negate: FnCallF = js.native
    inline def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
    inline def negate_=(x: FnCallF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negate")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.remove")
    @js.native
    def remove: Fn8 = js.native
    inline def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[V]]]
    inline def remove_=(x: Fn8): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.tail")
    @js.native
    def tail: Fn1 = js.native
    inline def tail[V](xs: js.Array[V]): js.Array[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[V]]
    inline def tail_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tail")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.toArray")
    @js.native
    def toArray: Fn4 = js.native
    inline def toArray[A](xs: A): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
    inline def toArray[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
    inline def toArray_=(x: Fn4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toArray")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.toFunction")
    @js.native
    def toFunction: Fn10 = js.native
    inline def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ V, V2]]
    inline def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ V, V2]]
    inline def toFunction_=(x: Fn10): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.toString")
    @js.native
    def toString_ : js.Function1[/* obj */ Any, String] = js.native
    
    inline def toString_(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toString__=(x: js.Function1[/* obj */ Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toString")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs", "_.without")
    @js.native
    def without: FnCallXXs = js.native
    inline def without[A](x: A, xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("without")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
    inline def without_=(x: FnCallXXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("without")(x.asInstanceOf[js.Any])
  }
  
  inline def combine[R](fn: js.Function, observables: js.Array[typingsJapgolly.baconjs.typesObservableMod.default[Any]]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], observables.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[R](fn: Function0[R]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[R](observables: js.Array[typingsJapgolly.baconjs.typesObservableMod.default[Any]], fn: js.Function): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(observables.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, R](a: typingsJapgolly.baconjs.typesObservableMod.default[V], fn: Function1[V, R]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, R](fn: Function1[V, R], a: typingsJapgolly.baconjs.typesObservableMod.default[V]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    fn: Function2[V, V2, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, R](
    fn: Function2[V, V2, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    fn: Function3[V, V2, V3, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, R](
    fn: Function3[V, V2, V3, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, V4, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    fn: Function4[V, V2, V3, V4, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, V4, R](
    fn: Function4[V, V2, V3, V4, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, V4, V5, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, V4, V5, V6, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5],
    f: typingsJapgolly.baconjs.typesObservableMod.default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combine[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5],
    f: typingsJapgolly.baconjs.typesObservableMod.default[V6]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  
  inline def combineAsArray[V](
    streams: (typingsJapgolly.baconjs.typesObservableMod.default[V] | js.Array[typingsJapgolly.baconjs.typesObservableMod.default[V]])*
  ): typingsJapgolly.baconjs.typesObservableMod.Property[js.Array[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAsArray")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[js.Array[V]]]
  
  inline def combineTemplate[T](template: T): typingsJapgolly.baconjs.typesObservableMod.Property[CombinedTemplate[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[CombinedTemplate[T]]]
  
  inline def combineTwo[V, V2, R](
    left: typingsJapgolly.baconjs.typesObservableMod.default[V],
    right: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    f: Function2[V, V2, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTwo")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  
  inline def combineWith[R](fn: js.Function, observables: js.Array[typingsJapgolly.baconjs.typesObservableMod.default[Any]]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], observables.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[R](fn: Function0[R]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[R](observables: js.Array[typingsJapgolly.baconjs.typesObservableMod.default[Any]], fn: js.Function): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(observables.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, R](a: typingsJapgolly.baconjs.typesObservableMod.default[V], fn: Function1[V, R]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, R](fn: Function1[V, R], a: typingsJapgolly.baconjs.typesObservableMod.default[V]): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    fn: Function2[V, V2, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, R](
    fn: Function2[V, V2, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    fn: Function3[V, V2, V3, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, R](
    fn: Function3[V, V2, V3, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, V4, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    fn: Function4[V, V2, V3, V4, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, V4, R](
    fn: Function4[V, V2, V3, V4, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, V6, R](
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5],
    f: typingsJapgolly.baconjs.typesObservableMod.default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: typingsJapgolly.baconjs.typesObservableMod.default[V],
    b: typingsJapgolly.baconjs.typesObservableMod.default[V2],
    c: typingsJapgolly.baconjs.typesObservableMod.default[V3],
    d: typingsJapgolly.baconjs.typesObservableMod.default[V4],
    e: typingsJapgolly.baconjs.typesObservableMod.default[V5],
    f: typingsJapgolly.baconjs.typesObservableMod.default[V6]
  ): typingsJapgolly.baconjs.typesObservableMod.Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[R]]
  
  inline def concatAll[V](
    streams_ : (typingsJapgolly.baconjs.typesObservableMod.default[V] | js.Array[typingsJapgolly.baconjs.typesObservableMod.default[V]])*
  ): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(streams_.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def constant[V](x: V): typingsJapgolly.baconjs.typesObservableMod.Property[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(x.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[V]]
  
  inline def fromArray[T](values: js.Array[T | typingsJapgolly.baconjs.typesEventMod.Event[T]]): typingsJapgolly.baconjs.typesObservableMod.EventStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[T]]
  
  inline def fromBinder[V](binder: Binder[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinder")(binder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromBinder[V](binder: Binder[V], eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinder")(binder.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def fromCallback[V](f: js.Function, args: Any*): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCallback")(scala.List(f.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def fromESObservable[V](_observable: Any): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromESObservable")(_observable.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def fromEvent[V](target: Any, eventSource: String): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromEvent[V](target: Any, eventSource: String, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromEvent[V](target: Any, eventSource: EventSourceFn): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromEvent[V](target: Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def fromEventTarget[V](target: Any, eventSource: String): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventTarget")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromEventTarget[V](target: Any, eventSource: String, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventTarget")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromEventTarget[V](target: Any, eventSource: EventSourceFn): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventTarget")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromEventTarget[V](target: Any, eventSource: EventSourceFn, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEventTarget")(target.asInstanceOf[js.Any], eventSource.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def fromNodeCallback[V](f: js.Function, args: Any*): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodeCallback")(scala.List(f.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def fromPoll[V](delay: Double, poll: PollFunction[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoll")(delay.asInstanceOf[js.Any], poll.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def fromPromise[V](promise: js.Promise[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromPromise[V](promise: js.Promise[V], abort: Boolean): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any], abort.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromPromise[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any], abort.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def fromPromise[V](promise: js.Promise[V], abort: Unit, eventTransformer: EventTransformer[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any], abort.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def getScheduler(): Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("getScheduler")().asInstanceOf[Scheduler]
  
  inline def groupSimultaneous[V](
    streams: (typingsJapgolly.baconjs.typesObservableMod.default[V] | js.Array[typingsJapgolly.baconjs.typesObservableMod.default[V]])*
  ): typingsJapgolly.baconjs.typesObservableMod.EventStream[js.Array[js.Array[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSimultaneous")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[js.Array[js.Array[V]]]]
  
  inline def hasValue[V](e: typingsJapgolly.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Value<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Value<V> */ Boolean]
  
  inline def interval[V](delay: Double, value: V): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def isEnd[V](e: typingsJapgolly.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.End */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnd")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.End */ Boolean]
  
  inline def isError[V](e: typingsJapgolly.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Error */ Boolean]
  
  inline def isEvent[V](e: Any): /* is baconjs.baconjs/types/event.Event<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Event<V> */ Boolean]
  
  inline def isInitial[V](e: typingsJapgolly.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Initial<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInitial")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Initial<V> */ Boolean]
  
  inline def isNext[V](e: typingsJapgolly.baconjs.typesEventMod.Event[V]): /* is baconjs.baconjs/types/event.Next<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNext")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Next<V> */ Boolean]
  
  inline def later[V](delay: Double, value: V): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("later")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def mergeAll[V](
    streams: (typingsJapgolly.baconjs.typesObservableMod.default[V] | js.Array[typingsJapgolly.baconjs.typesObservableMod.default[V]])*
  ): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  @JSImport("baconjs", "more")
  @js.native
  val more: Reply = js.native
  
  inline def never[V](): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  @JSImport("baconjs", "noMore")
  @js.native
  val noMore: Reply = js.native
  
  @JSImport("baconjs", "nullSink")
  @js.native
  val nullSink: Sink[Any] = js.native
  
  @JSImport("baconjs", "nullVoidSink")
  @js.native
  val nullVoidSink: VoidSink = js.native
  
  inline def onValues(args: Any*): Unsub = ^.asInstanceOf[js.Dynamic].applyDynamic("onValues")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unsub]
  
  inline def once[V](value: V): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  inline def once[V](value: typingsJapgolly.baconjs.typesEventMod.Event[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def repeat[V](
    generator: js.Function1[
      /* iteration */ Double, 
      js.UndefOr[typingsJapgolly.baconjs.typesObservableMod.default[V]]
    ]
  ): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(generator.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def repeatedly[V](delay: Double, values: js.Array[V | typingsJapgolly.baconjs.typesEventMod.Event[V]]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatedly")(delay.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def retry[V](options: RetryOptions[V]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def sequentially[V](delay: Double, values: js.Array[V | typingsJapgolly.baconjs.typesEventMod.Event[V]]): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequentially")(delay.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def setScheduler(newScheduler: Scheduler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setScheduler")(newScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def silence[V](duration: Double): typingsJapgolly.baconjs.typesObservableMod.EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("silence")(duration.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[V]]
  
  inline def spy(spy: Spy_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(spy.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def `try`[In, Out](f: js.Function1[/* value */ In, Out]): js.Function1[/* value */ In, typingsJapgolly.baconjs.typesObservableMod.EventStream[Out]] = ^.asInstanceOf[js.Dynamic].applyDynamic("try")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ In, typingsJapgolly.baconjs.typesObservableMod.EventStream[Out]]]
  
  inline def update[Out](initial: Out, patterns: UpdatePattern[Out]*): typingsJapgolly.baconjs.typesObservableMod.Property[Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(scala.List(initial.asInstanceOf[js.Any]).`++`(patterns.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.Property[Out]]
  
  @JSImport("baconjs", "version")
  @js.native
  val version: /* "__version__" */ String = js.native
  
  inline def when[O](patterns: Pattern[O]*): typingsJapgolly.baconjs.typesObservableMod.EventStream[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(patterns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[O]]
  
  inline def zipAsArray[V](
    args: (typingsJapgolly.baconjs.typesObservableMod.default[V] | js.Array[typingsJapgolly.baconjs.typesObservableMod.default[V]])*
  ): typingsJapgolly.baconjs.typesObservableMod.default[js.Array[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAsArray")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[js.Array[V]]]
  
  inline def zipWith[Out](
    f: js.Function1[/* repeated */ Any, Out],
    streams: typingsJapgolly.baconjs.typesObservableMod.default[Any]*
  ): typingsJapgolly.baconjs.typesObservableMod.EventStream[Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(scala.List(f.asInstanceOf[js.Any]).`++`(streams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.EventStream[Out]]
}
