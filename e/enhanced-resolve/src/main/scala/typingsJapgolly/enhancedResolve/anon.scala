package typingsJapgolly.enhancedResolve

import japgolly.scalajs.react.Callback
import typingsJapgolly.enhancedResolve.mod.FileSystemCallback
import typingsJapgolly.enhancedResolve.mod.FileSystemStats
import typingsJapgolly.enhancedResolve.mod.ResolveContext
import typingsJapgolly.enhancedResolve.mod.ResolveRequest
import typingsJapgolly.enhancedResolve.mod.Resolver
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.tapable.mod.AsyncSeriesBailHook
import typingsJapgolly.tapable.mod.AsyncSeriesHook
import typingsJapgolly.tapable.mod.SyncHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Apply extends StObject {
    
    @JSName("apply")
    def apply(arg0: Resolver): Unit
  }
  object Apply {
    
    inline def apply(apply: Resolver => Callback): Apply = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Resolver) => apply(t0).runNow()))
      __obj.asInstanceOf[Apply]
    }
    
    extension [Self <: Apply](x: Self) {
      
      inline def setApply(value: Resolver => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Resolver) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(arg0: String, arg1: js.Object, arg2: FileSystemCallback[String | Buffer]): Unit = js.native
    def apply(arg0: String, arg1: FileSystemCallback[FileSystemStats]): Unit = js.native
  }
  
  @js.native
  trait FnCallArg0Arg1Arg2 extends StObject {
    
    def apply(arg0: String, arg1: js.Object, arg2: FileSystemCallback[js.Object]): Unit = js.native
    def apply(arg0: String, arg1: FileSystemCallback[js.Object]): Unit = js.native
  }
  
  trait ForceRelative extends StObject {
    
    var forceRelative: Boolean
    
    var name: js.Array[String]
  }
  object ForceRelative {
    
    inline def apply(forceRelative: Boolean, name: js.Array[String]): ForceRelative = {
      val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceRelative]
    }
    
    extension [Self <: ForceRelative](x: Self) {
      
      inline def setForceRelative(value: Boolean): Self = StObject.set(x, "forceRelative", value.asInstanceOf[js.Any])
      
      inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var forceRelative: Boolean
    
    var name: String | js.Array[String]
  }
  object Name {
    
    inline def apply(forceRelative: Boolean, name: String | js.Array[String]): Name = {
      val __obj = js.Dynamic.literal(forceRelative = forceRelative.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setForceRelative(value: Boolean): Self = StObject.set(x, "forceRelative", value.asInstanceOf[js.Any])
      
      inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    }
  }
  
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
}
