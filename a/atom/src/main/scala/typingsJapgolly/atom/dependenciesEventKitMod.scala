package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesEventKitMod {
  
  @JSImport("atom/dependencies/event-kit", "CompositeDisposable")
  @js.native
  open class CompositeDisposable protected ()
    extends StObject
       with DisposableLike {
    /** Construct an instance, optionally with one or more disposables. */
    def this(disposables: DisposableLike*) = this()
    
    // Managing Disposables
    /**
      *  Add disposables to be disposed when the composite is disposed.
      *  If this object has already been disposed, this method has no effect.
      */
    def add(disposables: DisposableLike*): Unit = js.native
    
    /**
      *  Clear all disposables. They will not be disposed by the next call to
      *  dispose.
      */
    def clear(): Unit = js.native
    
    /** Alias to CompositeDisposable::remove. */
    def delete(disposable: DisposableLike): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /** Remove a previously added disposable. */
    def remove(disposable: DisposableLike): Unit = js.native
  }
  
  @JSImport("atom/dependencies/event-kit", "Disposable")
  @js.native
  /** Construct a Disposable. */
  open class Disposable ()
    extends StObject
       with DisposableLike {
    def this(disposableAction: js.Function0[Unit]) = this()
    
    /** A callback which will be called within dispose(). */
    var disposalAction: js.UndefOr[js.Function0[Unit]] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  /* static members */
  object Disposable {
    
    @JSImport("atom/dependencies/event-kit", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /** Ensure that Object correctly implements the Disposable contract. */
    inline def isDisposable(`object`: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("atom/dependencies/event-kit", "Emitter")
  @js.native
  /** Construct an emitter. */
  open class Emitter[OptionalEmissions, RequiredEmissions] ()
    extends StObject
       with DisposableLike {
    
    /** Clear out any existing subscribers. */
    def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    // Event Emission
    /** Invoke the handlers registered via ::on for the given event name. */
    def emit[T /* <: /* keyof OptionalEmissions */ String */](eventName: T): Unit = js.native
    def emit[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      value: /* import warning: importer.ImportType#apply Failed type conversion: OptionalEmissions[T] */ js.Any
    ): Unit = js.native
    
    // Event Subscription
    /** Registers a handler to be invoked whenever the given event is emitted. */
    def on[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      handler: js.Function1[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
          ], 
          Unit
        ]
    ): Disposable = js.native
    
    /**
      *  Register the given handler function to be invoked the next time an event
      *  with the given name is emitted via ::emit.
      */
    def once[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      handler: js.Function1[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
          ], 
          Unit
        ]
    ): Disposable = js.native
    
    /**
      *  Register the given handler function to be invoked before all other
      *  handlers existing at the time of subscription whenever events by the
      *  given name are emitted via ::emit.
      */
    def preempt[T /* <: /* keyof OptionalEmissions */ String */](
      eventName: T,
      handler: js.Function1[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: RequiredEmissions[T] */ /* value */ js.Any
          ], 
          Unit
        ]
    ): Disposable = js.native
  }
  
  trait DisposableLike extends StObject {
    
    def dispose(): Unit
  }
  object DisposableLike {
    
    inline def apply(dispose: Callback): DisposableLike = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
      __obj.asInstanceOf[DisposableLike]
    }
    
    extension [Self <: DisposableLike](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
}
