package typingsJapgolly.webpack.anon

import typingsJapgolly.tapable.mod.HookMap
import typingsJapgolly.tapable.mod.SyncHook
import typingsJapgolly.tapable.mod.SyncWaterfallHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import typingsJapgolly.webpack.mod.ResolveOptionsWithDependencyType
import typingsJapgolly.webpack.mod.Resolver
import typingsJapgolly.webpack.mod.UserResolveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  resolveOptions :tapable.tapable.HookMap<tapable.tapable.SyncWaterfallHook<[webpack.webpack.ResolveOptionsWithDependencyType], tapable.tapable.UnsetAdditionalOptions>>,   resolver :tapable.tapable.HookMap<tapable.tapable.SyncHook<[webpack.webpack.Resolver, webpack.webpack.UserResolveOptions, webpack.webpack.ResolveOptionsWithDependencyType], void, tapable.tapable.UnsetAdditionalOptions>>}> */
trait ReadonlyresolveOptionsHoo extends StObject {
  
  val resolveOptions: HookMap[
    SyncWaterfallHook[js.Array[ResolveOptionsWithDependencyType], UnsetAdditionalOptions]
  ]
  
  val resolver: HookMap[
    SyncHook[
      js.Tuple3[Resolver, UserResolveOptions, ResolveOptionsWithDependencyType], 
      Unit, 
      UnsetAdditionalOptions
    ]
  ]
}
object ReadonlyresolveOptionsHoo {
  
  inline def apply(
    resolveOptions: HookMap[
      SyncWaterfallHook[js.Array[ResolveOptionsWithDependencyType], UnsetAdditionalOptions]
    ],
    resolver: HookMap[
      SyncHook[
        js.Tuple3[Resolver, UserResolveOptions, ResolveOptionsWithDependencyType], 
        Unit, 
        UnsetAdditionalOptions
      ]
    ]
  ): ReadonlyresolveOptionsHoo = {
    val __obj = js.Dynamic.literal(resolveOptions = resolveOptions.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyresolveOptionsHoo]
  }
  
  extension [Self <: ReadonlyresolveOptionsHoo](x: Self) {
    
    inline def setResolveOptions(
      value: HookMap[
          SyncWaterfallHook[js.Array[ResolveOptionsWithDependencyType], UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
    
    inline def setResolver(
      value: HookMap[
          SyncHook[
            js.Tuple3[Resolver, UserResolveOptions, ResolveOptionsWithDependencyType], 
            Unit, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
  }
}
