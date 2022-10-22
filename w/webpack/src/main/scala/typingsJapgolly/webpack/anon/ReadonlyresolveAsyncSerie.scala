package typingsJapgolly.webpack.anon

import typingsJapgolly.tapable.mod.AsyncSeriesBailHook
import typingsJapgolly.tapable.mod.HookMap
import typingsJapgolly.tapable.mod.SyncBailHook
import typingsJapgolly.tapable.mod.SyncHook
import typingsJapgolly.tapable.mod.SyncWaterfallHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import typingsJapgolly.webpack.mod.ResolveData
import typingsJapgolly.webpack.mod.ResourceDataWithData
import typingsJapgolly.webpack.webpackBooleans.`false`
import typingsJapgolly.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  resolve :tapable.tapable.AsyncSeriesBailHook<[webpack.webpack.ResolveData], false | void | webpack.webpack.Module, tapable.tapable.UnsetAdditionalOptions>,   resolveForScheme :tapable.tapable.HookMap<tapable.tapable.AsyncSeriesBailHook<[webpack.webpack.ResourceDataWithData, webpack.webpack.ResolveData], true | void, tapable.tapable.UnsetAdditionalOptions>>,   resolveInScheme :tapable.tapable.HookMap<tapable.tapable.AsyncSeriesBailHook<[webpack.webpack.ResourceDataWithData, webpack.webpack.ResolveData], true | void, tapable.tapable.UnsetAdditionalOptions>>,   factorize :tapable.tapable.AsyncSeriesBailHook<[webpack.webpack.ResolveData], webpack.webpack.Module, tapable.tapable.UnsetAdditionalOptions>,   beforeResolve :tapable.tapable.AsyncSeriesBailHook<[webpack.webpack.ResolveData], false | void, tapable.tapable.UnsetAdditionalOptions>,   afterResolve :tapable.tapable.AsyncSeriesBailHook<[webpack.webpack.ResolveData], false | void, tapable.tapable.UnsetAdditionalOptions>,   createModule :tapable.tapable.AsyncSeriesBailHook<[std.Partial<webpack.webpack.NormalModuleCreateData & {  settings :webpack.webpack.ModuleSettings}>, webpack.webpack.ResolveData], void | webpack.webpack.Module, tapable.tapable.UnsetAdditionalOptions>,   module :tapable.tapable.SyncWaterfallHook<[webpack.webpack.Module, std.Partial<webpack.webpack.NormalModuleCreateData & {  settings :webpack.webpack.ModuleSettings}>, webpack.webpack.ResolveData], webpack.webpack.Module>,   createParser :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<any, any, tapable.tapable.UnsetAdditionalOptions>>,   parser :tapable.tapable.HookMap<tapable.tapable.SyncHook<any, void, tapable.tapable.UnsetAdditionalOptions>>,   createGenerator :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<any, any, tapable.tapable.UnsetAdditionalOptions>>,   generator :tapable.tapable.HookMap<tapable.tapable.SyncHook<any, void, tapable.tapable.UnsetAdditionalOptions>>}> */
trait ReadonlyresolveAsyncSerie extends StObject {
  
  val afterResolve: AsyncSeriesBailHook[js.Array[ResolveData], `false` | Unit, UnsetAdditionalOptions]
  
  val beforeResolve: AsyncSeriesBailHook[js.Array[ResolveData], `false` | Unit, UnsetAdditionalOptions]
  
  val createGenerator: HookMap[SyncBailHook[Any, Any, UnsetAdditionalOptions]]
  
  val createModule: AsyncSeriesBailHook[
    js.Tuple2[PartialNormalModuleCreate, ResolveData], 
    Unit | typingsJapgolly.webpack.mod.Module, 
    UnsetAdditionalOptions
  ]
  
  val createParser: HookMap[SyncBailHook[Any, Any, UnsetAdditionalOptions]]
  
  val factorize: AsyncSeriesBailHook[js.Array[ResolveData], typingsJapgolly.webpack.mod.Module, UnsetAdditionalOptions]
  
  val generator: HookMap[SyncHook[Any, Unit, UnsetAdditionalOptions]]
  
  val module: SyncWaterfallHook[
    js.Tuple3[typingsJapgolly.webpack.mod.Module, PartialNormalModuleCreate, ResolveData], 
    typingsJapgolly.webpack.mod.Module
  ]
  
  val parser: HookMap[SyncHook[Any, Unit, UnsetAdditionalOptions]]
  
  val resolve: AsyncSeriesBailHook[
    js.Array[ResolveData], 
    `false` | Unit | typingsJapgolly.webpack.mod.Module, 
    UnsetAdditionalOptions
  ]
  
  val resolveForScheme: HookMap[
    AsyncSeriesBailHook[js.Tuple2[ResourceDataWithData, ResolveData], `true` | Unit, UnsetAdditionalOptions]
  ]
  
  val resolveInScheme: HookMap[
    AsyncSeriesBailHook[js.Tuple2[ResourceDataWithData, ResolveData], `true` | Unit, UnsetAdditionalOptions]
  ]
}
object ReadonlyresolveAsyncSerie {
  
  inline def apply(
    afterResolve: AsyncSeriesBailHook[js.Array[ResolveData], `false` | Unit, UnsetAdditionalOptions],
    beforeResolve: AsyncSeriesBailHook[js.Array[ResolveData], `false` | Unit, UnsetAdditionalOptions],
    createGenerator: HookMap[SyncBailHook[Any, Any, UnsetAdditionalOptions]],
    createModule: AsyncSeriesBailHook[
      js.Tuple2[PartialNormalModuleCreate, ResolveData], 
      Unit | typingsJapgolly.webpack.mod.Module, 
      UnsetAdditionalOptions
    ],
    createParser: HookMap[SyncBailHook[Any, Any, UnsetAdditionalOptions]],
    factorize: AsyncSeriesBailHook[js.Array[ResolveData], typingsJapgolly.webpack.mod.Module, UnsetAdditionalOptions],
    generator: HookMap[SyncHook[Any, Unit, UnsetAdditionalOptions]],
    module: SyncWaterfallHook[
      js.Tuple3[typingsJapgolly.webpack.mod.Module, PartialNormalModuleCreate, ResolveData], 
      typingsJapgolly.webpack.mod.Module
    ],
    parser: HookMap[SyncHook[Any, Unit, UnsetAdditionalOptions]],
    resolve: AsyncSeriesBailHook[
      js.Array[ResolveData], 
      `false` | Unit | typingsJapgolly.webpack.mod.Module, 
      UnsetAdditionalOptions
    ],
    resolveForScheme: HookMap[
      AsyncSeriesBailHook[js.Tuple2[ResourceDataWithData, ResolveData], `true` | Unit, UnsetAdditionalOptions]
    ],
    resolveInScheme: HookMap[
      AsyncSeriesBailHook[js.Tuple2[ResourceDataWithData, ResolveData], `true` | Unit, UnsetAdditionalOptions]
    ]
  ): ReadonlyresolveAsyncSerie = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve.asInstanceOf[js.Any], beforeResolve = beforeResolve.asInstanceOf[js.Any], createGenerator = createGenerator.asInstanceOf[js.Any], createModule = createModule.asInstanceOf[js.Any], createParser = createParser.asInstanceOf[js.Any], factorize = factorize.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], resolveForScheme = resolveForScheme.asInstanceOf[js.Any], resolveInScheme = resolveInScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyresolveAsyncSerie]
  }
  
  extension [Self <: ReadonlyresolveAsyncSerie](x: Self) {
    
    inline def setAfterResolve(value: AsyncSeriesBailHook[js.Array[ResolveData], `false` | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterResolve", value.asInstanceOf[js.Any])
    
    inline def setBeforeResolve(value: AsyncSeriesBailHook[js.Array[ResolveData], `false` | Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeResolve", value.asInstanceOf[js.Any])
    
    inline def setCreateGenerator(value: HookMap[SyncBailHook[Any, Any, UnsetAdditionalOptions]]): Self = StObject.set(x, "createGenerator", value.asInstanceOf[js.Any])
    
    inline def setCreateModule(
      value: AsyncSeriesBailHook[
          js.Tuple2[PartialNormalModuleCreate, ResolveData], 
          Unit | typingsJapgolly.webpack.mod.Module, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "createModule", value.asInstanceOf[js.Any])
    
    inline def setCreateParser(value: HookMap[SyncBailHook[Any, Any, UnsetAdditionalOptions]]): Self = StObject.set(x, "createParser", value.asInstanceOf[js.Any])
    
    inline def setFactorize(
      value: AsyncSeriesBailHook[js.Array[ResolveData], typingsJapgolly.webpack.mod.Module, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "factorize", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: HookMap[SyncHook[Any, Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setModule(
      value: SyncWaterfallHook[
          js.Tuple3[typingsJapgolly.webpack.mod.Module, PartialNormalModuleCreate, ResolveData], 
          typingsJapgolly.webpack.mod.Module
        ]
    ): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setParser(value: HookMap[SyncHook[Any, Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setResolve(
      value: AsyncSeriesBailHook[
          js.Array[ResolveData], 
          `false` | Unit | typingsJapgolly.webpack.mod.Module, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveForScheme(
      value: HookMap[
          AsyncSeriesBailHook[js.Tuple2[ResourceDataWithData, ResolveData], `true` | Unit, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "resolveForScheme", value.asInstanceOf[js.Any])
    
    inline def setResolveInScheme(
      value: HookMap[
          AsyncSeriesBailHook[js.Tuple2[ResourceDataWithData, ResolveData], `true` | Unit, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "resolveInScheme", value.asInstanceOf[js.Any])
  }
}
