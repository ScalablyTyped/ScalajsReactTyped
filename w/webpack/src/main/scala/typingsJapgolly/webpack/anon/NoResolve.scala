package typingsJapgolly.webpack.anon

import typingsJapgolly.tapable.mod.AsyncSeriesBailHook
import typingsJapgolly.tapable.mod.AsyncSeriesHook
import typingsJapgolly.tapable.mod.SyncHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import typingsJapgolly.webpack.mod.ResolveContext
import typingsJapgolly.webpack.mod.ResolveRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoResolve extends StObject {
  
  var noResolve: SyncHook[js.Tuple2[ResolveRequest, js.Error], Unit, UnsetAdditionalOptions]
  
  var resolve: AsyncSeriesBailHook[
    js.Tuple2[ResolveRequest, ResolveContext], 
    Null | ResolveRequest, 
    UnsetAdditionalOptions
  ]
  
  var resolveStep: SyncHook[
    js.Tuple2[
      AsyncSeriesBailHook[
        js.Tuple2[ResolveRequest, ResolveContext], 
        Null | ResolveRequest, 
        UnsetAdditionalOptions
      ], 
      ResolveRequest
    ], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  var result: AsyncSeriesHook[js.Tuple2[ResolveRequest, ResolveContext], UnsetAdditionalOptions]
}
object NoResolve {
  
  inline def apply(
    noResolve: SyncHook[js.Tuple2[ResolveRequest, js.Error], Unit, UnsetAdditionalOptions],
    resolve: AsyncSeriesBailHook[
      js.Tuple2[ResolveRequest, ResolveContext], 
      Null | ResolveRequest, 
      UnsetAdditionalOptions
    ],
    resolveStep: SyncHook[
      js.Tuple2[
        AsyncSeriesBailHook[
          js.Tuple2[ResolveRequest, ResolveContext], 
          Null | ResolveRequest, 
          UnsetAdditionalOptions
        ], 
        ResolveRequest
      ], 
      Unit, 
      UnsetAdditionalOptions
    ],
    result: AsyncSeriesHook[js.Tuple2[ResolveRequest, ResolveContext], UnsetAdditionalOptions]
  ): NoResolve = {
    val __obj = js.Dynamic.literal(noResolve = noResolve.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], resolveStep = resolveStep.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoResolve]
  }
  
  extension [Self <: NoResolve](x: Self) {
    
    inline def setNoResolve(value: SyncHook[js.Tuple2[ResolveRequest, js.Error], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
    
    inline def setResolve(
      value: AsyncSeriesBailHook[
          js.Tuple2[ResolveRequest, ResolveContext], 
          Null | ResolveRequest, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveStep(
      value: SyncHook[
          js.Tuple2[
            AsyncSeriesBailHook[
              js.Tuple2[ResolveRequest, ResolveContext], 
              Null | ResolveRequest, 
              UnsetAdditionalOptions
            ], 
            ResolveRequest
          ], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "resolveStep", value.asInstanceOf[js.Any])
    
    inline def setResult(value: AsyncSeriesHook[js.Tuple2[ResolveRequest, ResolveContext], UnsetAdditionalOptions]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
