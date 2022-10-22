package typingsJapgolly.rsocketFlowable

import typingsJapgolly.rsocketFlowable.flowableMod.Source
import typingsJapgolly.rsocketFlowable.flowableMod.default
import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.IPublisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-flowable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rsocket-flowable", "Flowable")
  @js.native
  open class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  object Flowable {
    
    @JSImport("rsocket-flowable", "Flowable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(error: js.Error): typingsJapgolly.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rsocketFlowable.flowableMod.Flowable[scala.Nothing]]
    
    inline def just[U](values: U*): typingsJapgolly.rsocketFlowable.flowableMod.Flowable[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.rsocketFlowable.flowableMod.Flowable[U]]
    
    inline def never(): typingsJapgolly.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[typingsJapgolly.rsocketFlowable.flowableMod.Flowable[scala.Nothing]]
  }
  
  @JSImport("rsocket-flowable", "FlowableProcessor")
  @js.native
  open class FlowableProcessor[T, R] protected ()
    extends typingsJapgolly.rsocketFlowable.flowableProcessorMod.default[T, R] {
    def this(source: IPublisher[T]) = this()
    def this(source: IPublisher[T], fn: js.Function1[/* a */ T, R]) = this()
  }
  
  @JSImport("rsocket-flowable", "Single")
  @js.native
  open class Single[T] protected ()
    extends typingsJapgolly.rsocketFlowable.singleMod.default[T] {
    def this(source: typingsJapgolly.rsocketFlowable.singleMod.Source[T]) = this()
  }
  /* static members */
  object Single {
    
    @JSImport("rsocket-flowable", "Single")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(error: js.Error): typingsJapgolly.rsocketFlowable.singleMod.Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rsocketFlowable.singleMod.Single[scala.Nothing]]
    
    inline def never(): typingsJapgolly.rsocketFlowable.singleMod.Single[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[typingsJapgolly.rsocketFlowable.singleMod.Single[scala.Nothing]]
    
    inline def of[U](value: U): typingsJapgolly.rsocketFlowable.singleMod.Single[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rsocketFlowable.singleMod.Single[U]]
  }
  
  inline def every(ms: Double): default[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(ms.asInstanceOf[js.Any]).asInstanceOf[default[Double]]
}
