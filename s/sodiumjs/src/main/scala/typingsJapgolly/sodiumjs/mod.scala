package typingsJapgolly.sodiumjs

import typingsJapgolly.sodiumjs.distTypingsSodiumLambdaMod.Lambda1_
import typingsJapgolly.sodiumjs.distTypingsSodiumLambdaMod.Lambda2_
import typingsJapgolly.sodiumjs.distTypingsSodiumLambdaMod.Lambda3_
import typingsJapgolly.sodiumjs.distTypingsSodiumLambdaMod.Lambda4_
import typingsJapgolly.sodiumjs.distTypingsSodiumLambdaMod.Lambda5_
import typingsJapgolly.sodiumjs.distTypingsSodiumLambdaMod.Lambda6_
import typingsJapgolly.sodiumjs.distTypingsSodiumVertexMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sodiumjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sodiumjs", "Cell")
  @js.native
  open class Cell[A] protected ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A] {
    def this(initValue: A) = this()
    def this(initValue: A, str: typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]) = this()
  }
  /* static members */
  object Cell {
    
    @JSImport("sodiumjs", "Cell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs", "Cell._liftArray")
    @js.native
    def _liftArray: Any = js.native
    inline def _liftArray_=(x: Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_liftArray")(x.asInstanceOf[js.Any])
    
    /**
      * Apply a value inside a cell to a function inside a cell. This is the
      * primitive for all function lifting.
      */
    inline def apply[A, B](
      cf: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[js.Function1[/* a */ A, B]],
      ca: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A]
    ): typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(cf.asInstanceOf[js.Any], ca.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[B]]
    inline def apply[A, B](
      cf: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[js.Function1[/* a */ A, B]],
      ca: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A],
      sources: js.Array[Source]
    ): typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(cf.asInstanceOf[js.Any], ca.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[B]]
    
    /**
      * Fantasy-land Algebraic Data Type Compatability.
      * Cell satisfies the Functor, Apply, Applicative categories
      * @see {@link https://github.com/fantasyland/fantasy-land} for more info
      */
    inline def `fantasy-landSlashof`[A](a: A): typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fantasy-land/of")(a.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A]]
    
    /**
      * Lift an array of cells into a cell of an array.
      */
    inline def liftArray[A](ca: js.Array[typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A]]): typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftArray")(ca.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[js.Array[A]]]
    
    /**
      * Unwrap a cell inside another cell to give a time-varying cell implementation.
      */
    inline def switchC[A](
      cca: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A]]
    ): typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchC")(cca.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A]]
    
    /**
      * Unwrap a stream inside a cell to give a time-varying stream implementation.
      */
    inline def switchS[A](
      csa: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]]
    ): typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("switchS")(csa.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]]
  }
  
  @JSImport("sodiumjs", "CellLoop")
  @js.native
  open class CellLoop[A] ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumCellLoopMod.CellLoop[A]
  
  @JSImport("sodiumjs", "CellSink")
  @js.native
  open class CellSink[A] protected ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumCellSinkMod.CellSink[A] {
    /**
      * Construct a writable cell with the specified initial value. If multiple values are
      * sent in the same transaction, the specified function is used to combine them.
      *
      * If the function is not supplied, then an exception will be thrown in this case.
      */
    def this(initValue: A) = this()
    def this(initValue: A, f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(initValue: A, f: Lambda2_[A, A, A]) = this()
  }
  
  @JSImport("sodiumjs", "IOAction")
  @js.native
  open class IOAction ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumIoactionMod.IOAction
  /* static members */
  object IOAction {
    
    @JSImport("sodiumjs", "IOAction")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Convert a function that performs asynchronous I/O taking input A
      * and returning a value of type B into an I/O action of type
      * (sa : Stream<A>) => Stream<B>
      */
    inline def fromAsync[A, B](performIO: js.Function2[/* a */ A, /* result */ js.Function1[/* b */ B, scala.Unit], scala.Unit]): js.Function1[
        /* sa */ typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A], 
        typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsync")(performIO.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A], 
        typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[B]
      ]]
  }
  
  @JSImport("sodiumjs", "MillisecondsTimerSystem")
  @js.native
  open class MillisecondsTimerSystem ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumMillisecondsTimerSystemMod.MillisecondsTimerSystem
  
  @JSImport("sodiumjs", "Operational")
  @js.native
  open class Operational ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumOperationalMod.Operational
  /* static members */
  object Operational {
    
    @JSImport("sodiumjs", "Operational")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Push each event onto a new transaction guaranteed to come before the next externally
      * initiated transaction. Same as {@link split(Stream)} but it works on a single value.
      */
    inline def defer[A](s: typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]): typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(s.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]]
    
    /**
      * Push each event in the list onto a newly created transaction guaranteed
      * to come before the next externally initiated transaction. Note that the semantics
      * are such that two different invocations of split() can put events into the same
      * new transaction, so the resulting stream's events could be simultaneous with
      * events output by split() or {@link defer(Stream)} invoked elsewhere in the code.
      */
    inline def split[A](s: typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[js.Array[A]]): typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(s.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]]
    
    /**
      * A stream that gives the updates/steps for a {@link Cell}.
      * <P>
      * This is an OPERATIONAL primitive, which is not part of the main Sodium
      * API. It breaks the property of non-detectability of cell steps/updates.
      * The rule with this primitive is that you should only use it in functions
      * that do not allow the caller to detect the cell updates.
      */
    inline def updates[A](c: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A]): typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("updates")(c.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]]
    
    /**
      * A stream that is guaranteed to fire once in the transaction where value() is invoked, giving
      * the current value of the cell, and thereafter behaves like {@link updates(Cell)},
      * firing for each update/step of the cell's value.
      * <P>
      * This is an OPERATIONAL primitive, which is not part of the main Sodium
      * API. It breaks the property of non-detectability of cell steps/updates.
      * The rule with this primitive is that you should only use it in functions
      * that do not allow the caller to detect the cell updates.
      */
    inline def value[A](c: typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[A]): typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(c.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A]]
  }
  
  @JSImport("sodiumjs", "Router")
  @js.native
  open class Router[A, K] protected ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumRouterMod.Router[A, K] {
    def this(
      inStream: typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A],
      selector: js.Function1[/* a */ A, js.Array[K]]
    ) = this()
    def this(
      inStream: typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A],
      selector: js.Function1[/* a */ A, js.Array[K]],
      keyToStr: js.Function1[/* k */ K, String]
    ) = this()
  }
  
  @JSImport("sodiumjs", "SecondsTimerSystem")
  @js.native
  open class SecondsTimerSystem ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumSecondsTimerSystemMod.SecondsTimerSystem
  
  @JSImport("sodiumjs", "Stream")
  @js.native
  open class Stream[A] ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[A] {
    def this(vertex: typingsJapgolly.sodiumjs.distTypingsSodiumVertexMod.Vertex) = this()
  }
  
  @JSImport("sodiumjs", "StreamLoop")
  @js.native
  open class StreamLoop[A] ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.StreamLoop[A]
  
  @JSImport("sodiumjs", "StreamSink")
  @js.native
  open class StreamSink[A] ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumStreamSinkMod.StreamSink[A] {
    def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(f: Lambda2_[A, A, A]) = this()
  }
  
  @JSImport("sodiumjs", "TimerSystem")
  @js.native
  open class TimerSystem protected ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumTimerSystemMod.TimerSystem {
    def this(impl: typingsJapgolly.sodiumjs.distTypingsSodiumTimerSystemMod.TimerSystemImpl) = this()
  }
  
  /* note: abstract class */ @JSImport("sodiumjs", "TimerSystemImpl")
  @js.native
  open class TimerSystemImpl ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumTimerSystemMod.TimerSystemImpl
  
  @JSImport("sodiumjs", "Transaction")
  @js.native
  open class Transaction ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumTransactionMod.Transaction
  /* static members */
  object Transaction {
    
    @JSImport("sodiumjs", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _collectCyclesAtEnd(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_collectCyclesAtEnd")().asInstanceOf[scala.Unit]
    
    @JSImport("sodiumjs", "Transaction.collectCyclesAtEnd")
    @js.native
    def collectCyclesAtEnd: Any = js.native
    inline def collectCyclesAtEnd_=(x: Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectCyclesAtEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs", "Transaction.currentTransaction")
    @js.native
    def currentTransaction: typingsJapgolly.sodiumjs.distTypingsSodiumTransactionMod.Transaction = js.native
    inline def currentTransaction_=(x: typingsJapgolly.sodiumjs.distTypingsSodiumTransactionMod.Transaction): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentTransaction")(x.asInstanceOf[js.Any])
    
    /**
      * Add a runnable that will be executed whenever a transaction is started.
      * That runnable may start transactions itself, which will not cause the
      * hooks to be run recursively.
      *
      * The main use case of this is the implementation of a time/alarm system.
      */
    inline def onStart(r: js.Function0[scala.Unit]): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onStart")(r.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
    
    @JSImport("sodiumjs", "Transaction.onStartHooks")
    @js.native
    def onStartHooks: Any = js.native
    inline def onStartHooks_=(x: Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartHooks")(x.asInstanceOf[js.Any])
    
    inline def run[A](f: js.Function0[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(f.asInstanceOf[js.Any]).asInstanceOf[A]
    
    @JSImport("sodiumjs", "Transaction.runningOnStartHooks")
    @js.native
    def runningOnStartHooks: Any = js.native
    inline def runningOnStartHooks_=(x: Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runningOnStartHooks")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sodiumjs", "Tuple2")
  @js.native
  open class Tuple2[A, B] protected ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumTuple2Mod.Tuple2[A, B] {
    def this(a: A, b: B) = this()
  }
  
  @JSImport("sodiumjs", "Unit")
  @js.native
  open class Unit ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumUnitMod.Unit
  /* static members */
  object Unit {
    
    @JSImport("sodiumjs", "Unit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs", "Unit.UNIT")
    @js.native
    def UNIT: typingsJapgolly.sodiumjs.distTypingsSodiumUnitMod.Unit = js.native
    inline def UNIT_=(x: typingsJapgolly.sodiumjs.distTypingsSodiumUnitMod.Unit): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sodiumjs", "Vertex")
  @js.native
  open class Vertex protected ()
    extends typingsJapgolly.sodiumjs.distTypingsSodiumVertexMod.Vertex {
    def this(name: String, rank: Double, sources: js.Array[Source]) = this()
  }
  /* static members */
  object Vertex {
    
    @JSImport("sodiumjs", "Vertex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs", "Vertex.NULL")
    @js.native
    def NULL: typingsJapgolly.sodiumjs.distTypingsSodiumVertexMod.Vertex = js.native
    inline def NULL_=(x: typingsJapgolly.sodiumjs.distTypingsSodiumVertexMod.Vertex): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    inline def collectCycles(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("collectCycles")().asInstanceOf[scala.Unit]
    
    inline def collectRoots(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("collectRoots")().asInstanceOf[scala.Unit]
    
    @JSImport("sodiumjs", "Vertex.collectingCycles")
    @js.native
    def collectingCycles: Boolean = js.native
    inline def collectingCycles_=(x: Boolean): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectingCycles")(x.asInstanceOf[js.Any])
    
    inline def markRoots(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markRoots")().asInstanceOf[scala.Unit]
    
    inline def scanRoots(): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanRoots")().asInstanceOf[scala.Unit]
    
    @JSImport("sodiumjs", "Vertex.toBeFreedList")
    @js.native
    def toBeFreedList: js.Array[typingsJapgolly.sodiumjs.distTypingsSodiumVertexMod.Vertex] = js.native
    inline def toBeFreedList_=(x: js.Array[typingsJapgolly.sodiumjs.distTypingsSodiumVertexMod.Vertex]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toBeFreedList")(x.asInstanceOf[js.Any])
  }
  
  inline def getTotalRegistrations(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTotalRegistrations")().asInstanceOf[Double]
  
  inline def lambda1[A, B](
    f: js.Function1[/* a */ A, B],
    deps: js.Array[
      typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[Any] | typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[Any]
    ]
  ): Lambda1_[A, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda1")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda1_[A, B]]
  
  inline def lambda2[A, B, C](
    f: js.Function2[/* a */ A, /* b */ B, C],
    deps: js.Array[
      typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[Any] | typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[Any]
    ]
  ): Lambda2_[A, B, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda2")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda2_[A, B, C]]
  
  inline def lambda3[A, B, C, D](
    f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D],
    deps: js.Array[
      typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[Any] | typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[Any]
    ]
  ): Lambda3_[A, B, C, D] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda3")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda3_[A, B, C, D]]
  
  inline def lambda4[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[
      typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[Any] | typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[Any]
    ]
  ): Lambda4_[A, B, C, D, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda4")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda4_[A, B, C, D, E]]
  
  inline def lambda5[A, B, C, D, E, F](
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[
      typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[Any] | typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[Any]
    ]
  ): Lambda5_[A, B, C, D, E, F] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda5")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda5_[A, B, C, D, E, F]]
  
  inline def lambda6[A, B, C, D, E, F, G](
    f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
    deps: js.Array[
      typingsJapgolly.sodiumjs.distTypingsSodiumStreamMod.Stream[Any] | typingsJapgolly.sodiumjs.distTypingsSodiumCellMod.Cell[Any]
    ]
  ): Lambda6_[A, B, C, D, E, F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("lambda6")(f.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Lambda6_[A, B, C, D, E, F, G]]
}
