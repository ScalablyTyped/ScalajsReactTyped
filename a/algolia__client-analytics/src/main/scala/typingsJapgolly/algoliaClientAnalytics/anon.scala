package typingsJapgolly.algoliaClientAnalytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientAnalytics.mod.AddABTestResponse
import typingsJapgolly.algoliaClientAnalytics.mod.DeleteABTestResponse
import typingsJapgolly.algoliaClientAnalytics.mod.GetABTestResponse
import typingsJapgolly.algoliaClientAnalytics.mod.GetABTestsResponse
import typingsJapgolly.algoliaClientAnalytics.mod.StopABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.AddABTestResponse>> */
  trait ReadonlyPromiseAddABTestR extends StObject {
    
    def `catch`[TResult](): js.Promise[AddABTestResponse | TResult]
    
    def `finally`(): js.Promise[AddABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseAddABTestR {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[AddABTestResponse | Any]],
      `finally`: CallbackTo[js.Promise[AddABTestResponse]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromiseAddABTestR = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromiseAddABTestR]
    }
    
    extension [Self <: ReadonlyPromiseAddABTestR](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[AddABTestResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[AddABTestResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>> */
  trait ReadonlyPromiseDeleteABTe extends StObject {
    
    def `catch`[TResult](): js.Promise[DeleteABTestResponse | TResult]
    
    def `finally`(): js.Promise[DeleteABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseDeleteABTe {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[DeleteABTestResponse | Any]],
      `finally`: CallbackTo[js.Promise[DeleteABTestResponse]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromiseDeleteABTe = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromiseDeleteABTe]
    }
    
    extension [Self <: ReadonlyPromiseDeleteABTe](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[DeleteABTestResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[DeleteABTestResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestResponse>> */
  trait ReadonlyPromiseGetABTestR extends StObject {
    
    def `catch`[TResult](): js.Promise[GetABTestResponse | TResult]
    
    def `finally`(): js.Promise[GetABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseGetABTestR {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[GetABTestResponse | Any]],
      `finally`: CallbackTo[js.Promise[GetABTestResponse]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromiseGetABTestR = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromiseGetABTestR]
    }
    
    extension [Self <: ReadonlyPromiseGetABTestR](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[GetABTestResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[GetABTestResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestsResponse>> */
  trait ReadonlyPromiseGetABTests extends StObject {
    
    def `catch`[TResult](): js.Promise[GetABTestsResponse | TResult]
    
    def `finally`(): js.Promise[GetABTestsResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseGetABTests {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[GetABTestsResponse | Any]],
      `finally`: CallbackTo[js.Promise[GetABTestsResponse]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromiseGetABTests = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromiseGetABTests]
    }
    
    extension [Self <: ReadonlyPromiseGetABTests](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[GetABTestsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[GetABTestsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
  
  /* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.StopABTestResponse>> */
  trait ReadonlyPromiseStopABTest extends StObject {
    
    def `catch`[TResult](): js.Promise[StopABTestResponse | TResult]
    
    def `finally`(): js.Promise[StopABTestResponse]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromiseStopABTest {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[StopABTestResponse | Any]],
      `finally`: CallbackTo[js.Promise[StopABTestResponse]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromiseStopABTest = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromiseStopABTest]
    }
    
    extension [Self <: ReadonlyPromiseStopABTest](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[StopABTestResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[StopABTestResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
}
