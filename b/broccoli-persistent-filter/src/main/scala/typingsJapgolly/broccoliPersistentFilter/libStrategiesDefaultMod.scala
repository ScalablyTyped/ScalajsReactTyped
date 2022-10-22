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

object libStrategiesDefaultMod {
  
  @JSImport("broccoli-persistent-filter/lib/strategies/default", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DefaultStrategy {
    
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def init(ctx: Context): Unit = js.native
    
    /* CompleteClass */
    override def initialDependencies(rootFS: FSFacade, inputEncoding: String): typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^ = js.native
    
    /* CompleteClass */
    override def processString(ctx: Context, contents: String, relativePath: String): js.Promise[String] = js.native
    /* CompleteClass */
    override def processString(
      ctx: Context,
      contents: String,
      relativePath: String,
      forceInvalidation: Boolean,
      instrumentation: InstrumentationSchema
    ): String | ProcessStringResult | (js.Promise[String | ProcessStringResult]) = js.native
    
    /* CompleteClass */
    override def sealDependencies(dependencies: typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^): Unit = js.native
  }
  
  trait DefaultStrategy
    extends StObject
       with Strategy {
    
    def init(): Unit
    
    def processString(ctx: Context, contents: String, relativePath: String): js.Promise[String]
  }
  object DefaultStrategy {
    
    inline def apply(
      init: Callback,
      initialDependencies: (FSFacade, String) => typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^,
      processString: (Context, String, String) => js.Promise[String],
      sealDependencies: typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^ => Callback
    ): DefaultStrategy = {
      val __obj = js.Dynamic.literal(init = init.toJsFn, initialDependencies = js.Any.fromFunction2(initialDependencies), processString = js.Any.fromFunction3(processString), sealDependencies = js.Any.fromFunction1((t0: typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^) => sealDependencies(t0).runNow()))
      __obj.asInstanceOf[DefaultStrategy]
    }
    
    extension [Self <: DefaultStrategy](x: Self) {
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setProcessString(value: (Context, String, String) => js.Promise[String]): Self = StObject.set(x, "processString", js.Any.fromFunction3(value))
    }
  }
}
