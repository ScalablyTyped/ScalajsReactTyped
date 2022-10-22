package typingsJapgolly.broccoliPersistentFilter

import japgolly.scalajs.react.Callback
import typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult
import typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.FSFacade
import typingsJapgolly.broccoliPersistentFilter.libStrategiesStrategyMod.Context
import typingsJapgolly.broccoliPersistentFilter.libStrategiesStrategyMod.InstrumentationSchema
import typingsJapgolly.broccoliPersistentFilter.libStrategiesStrategyMod.Strategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessorMod {
  
  @JSImport("broccoli-persistent-filter/lib/processor", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Processor {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def init(ctx: Context): Unit = js.native
    
    /* CompleteClass */
    override def initialDependencies(rootFS: FSFacade, inputEncoding: String): typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^ = js.native
    
    /* CompleteClass */
    var persistent: Boolean = js.native
    
    /* CompleteClass */
    override def processString(
      ctx: Context,
      contents: String,
      relativePath: String,
      forceInvalidation: Boolean,
      instrumentation: InstrumentationSchema
    ): String | ProcessStringResult | (js.Promise[String | ProcessStringResult]) = js.native
    
    /* CompleteClass */
    var processor: Strategy = js.native
    
    /* CompleteClass */
    override def sealDependencies(dependencies: typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^): Unit = js.native
    
    /* CompleteClass */
    override def setStrategy(strategy: Strategy): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var persist: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    }
  }
  
  trait Processor
    extends StObject
       with Strategy {
    
    var persistent: Boolean
    
    var processor: Strategy
    
    def setStrategy(strategy: Strategy): Unit
  }
  object Processor {
    
    inline def apply(
      init: Context => Callback,
      initialDependencies: (FSFacade, String) => typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^,
      persistent: Boolean,
      processString: (Context, String, String, Boolean, InstrumentationSchema) => String | ProcessStringResult | (js.Promise[String | ProcessStringResult]),
      processor: Strategy,
      sealDependencies: typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^ => Callback,
      setStrategy: Strategy => Callback
    ): Processor = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: Context) => init(t0).runNow()), initialDependencies = js.Any.fromFunction2(initialDependencies), persistent = persistent.asInstanceOf[js.Any], processString = js.Any.fromFunction5(processString), processor = processor.asInstanceOf[js.Any], sealDependencies = js.Any.fromFunction1((t0: typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^) => sealDependencies(t0).runNow()), setStrategy = js.Any.fromFunction1((t0: Strategy) => setStrategy(t0).runNow()))
      __obj.asInstanceOf[Processor]
    }
    
    extension [Self <: Processor](x: Self) {
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setProcessor(value: Strategy): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      inline def setSetStrategy(value: Strategy => Callback): Self = StObject.set(x, "setStrategy", js.Any.fromFunction1((t0: Strategy) => value(t0).runNow()))
    }
  }
}
