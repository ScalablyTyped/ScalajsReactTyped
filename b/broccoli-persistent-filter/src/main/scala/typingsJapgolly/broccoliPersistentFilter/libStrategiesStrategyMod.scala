package typingsJapgolly.broccoliPersistentFilter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.broccoliPersistentFilter.anon.Recordoutputstring
import typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.FSFacade
import typingsJapgolly.broccoliPersistentFilter.libDependenciesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStrategiesStrategyMod {
  
  trait Context extends StObject {
    
    var cacheKey: js.UndefOr[js.Function0[String]] = js.undefined
    
    var cacheKeyProcessString: js.UndefOr[js.Function2[/* contents */ String, /* relativePath */ String, String]] = js.undefined
    
    def postProcess(v: typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult, relativePath: String): typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | js.Promise[typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult]
    
    def processString(contents: String, relativePath: String): String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | (js.Promise[String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult])
  }
  object Context {
    
    inline def apply(
      postProcess: (typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult, String) => typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | js.Promise[typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult],
      processString: (String, String) => String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | (js.Promise[String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult])
    ): Context = {
      val __obj = js.Dynamic.literal(postProcess = js.Any.fromFunction2(postProcess), processString = js.Any.fromFunction2(processString))
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setCacheKey(value: CallbackTo[String]): Self = StObject.set(x, "cacheKey", value.toJsFn)
      
      inline def setCacheKeyProcessString(value: (/* contents */ String, /* relativePath */ String) => String): Self = StObject.set(x, "cacheKeyProcessString", js.Any.fromFunction2(value))
      
      inline def setCacheKeyProcessStringUndefined: Self = StObject.set(x, "cacheKeyProcessString", js.undefined)
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setPostProcess(
        value: (typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult, String) => typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | js.Promise[typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult]
      ): Self = StObject.set(x, "postProcess", js.Any.fromFunction2(value))
      
      inline def setProcessString(
        value: (String, String) => String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | (js.Promise[String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult])
      ): Self = StObject.set(x, "processString", js.Any.fromFunction2(value))
    }
  }
  
  trait InstrumentationSchema extends StObject {
    
    var persistentCacheHit: Double
    
    var persistentCachePrime: Double
  }
  object InstrumentationSchema {
    
    inline def apply(persistentCacheHit: Double, persistentCachePrime: Double): InstrumentationSchema = {
      val __obj = js.Dynamic.literal(persistentCacheHit = persistentCacheHit.asInstanceOf[js.Any], persistentCachePrime = persistentCachePrime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentationSchema]
    }
    
    extension [Self <: InstrumentationSchema](x: Self) {
      
      inline def setPersistentCacheHit(value: Double): Self = StObject.set(x, "persistentCacheHit", value.asInstanceOf[js.Any])
      
      inline def setPersistentCachePrime(value: Double): Self = StObject.set(x, "persistentCachePrime", value.asInstanceOf[js.Any])
    }
  }
  
  type ProcessStringResult[Data] = Recordoutputstring & Data
  
  trait Strategy extends StObject {
    
    def init(ctx: Context): Unit
    
    def initialDependencies(rootFS: FSFacade, inputEncoding: String): ^
    
    def processString(
      ctx: Context,
      contents: String,
      relativePath: String,
      forceInvalidation: Boolean,
      instrumentation: InstrumentationSchema
    ): String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | (js.Promise[String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult])
    
    def sealDependencies(dependencies: ^): Unit
  }
  object Strategy {
    
    inline def apply(
      init: Context => Callback,
      initialDependencies: (FSFacade, String) => ^,
      processString: (Context, String, String, Boolean, InstrumentationSchema) => String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | (js.Promise[String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult]),
      sealDependencies: ^ => Callback
    ): Strategy = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: Context) => init(t0).runNow()), initialDependencies = js.Any.fromFunction2(initialDependencies), processString = js.Any.fromFunction5(processString), sealDependencies = js.Any.fromFunction1((t0: ^) => sealDependencies(t0).runNow()))
      __obj.asInstanceOf[Strategy]
    }
    
    extension [Self <: Strategy](x: Self) {
      
      inline def setInit(value: Context => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Context) => value(t0).runNow()))
      
      inline def setInitialDependencies(value: (FSFacade, String) => ^): Self = StObject.set(x, "initialDependencies", js.Any.fromFunction2(value))
      
      inline def setProcessString(
        value: (Context, String, String, Boolean, InstrumentationSchema) => String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult | (js.Promise[String | typingsJapgolly.broccoliPersistentFilter.anon.ProcessStringResult])
      ): Self = StObject.set(x, "processString", js.Any.fromFunction5(value))
      
      inline def setSealDependencies(value: ^ => Callback): Self = StObject.set(x, "sealDependencies", js.Any.fromFunction1((t0: ^) => value(t0).runNow()))
    }
  }
}
