package typingsJapgolly.webpackDevMiddleware

import typingsJapgolly.std.Exclude
import typingsJapgolly.webpackDevMiddleware.mod.Context
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-only`
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-warnings`
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.detailed
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.minimal
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.none
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.normal
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.summary
import typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsSetupHooksMod {
  
  /** @typedef {import("webpack").Configuration} Configuration */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").MultiCompiler} MultiCompiler */
  /** @typedef {import("webpack").Stats} Stats */
  /** @typedef {import("webpack").MultiStats} MultiStats */
  /** @typedef {import("../index.js").IncomingMessage} IncomingMessage */
  /** @typedef {import("../index.js").ServerResponse} ServerResponse */
  /** @typedef {Configuration["stats"]} StatsOptions */
  /** @typedef {{ children: Configuration["stats"][] }} MultiStatsOptions */
  /** @typedef {Exclude<Configuration["stats"], boolean | string | undefined>} NormalizedStatsOptions */
  /** @typedef {{ children: StatsOptions[], colors?: any }} MultiNormalizedStatsOptions */
  /**
    * @template {IncomingMessage} Request
    * @template {ServerResponse} Response
    * @param {import("../index.js").Context<Request, Response>} context
    */
  inline def apply[Request_1 /* <: typingsJapgolly.node.httpMod.IncomingMessage */, Response_1 /* <: typingsJapgolly.webpackDevMiddleware.mod.ServerResponse */](context: Context[Request_1, Response_1]): Unit = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("webpack-dev-middleware/types/utils/setupHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Compiler = typingsJapgolly.webpack.mod.Compiler
  
  type Configuration = typingsJapgolly.webpack.mod.Configuration
  
  type IncomingMessage = typingsJapgolly.webpackDevMiddleware.mod.IncomingMessage
  
  type MultiCompiler = typingsJapgolly.webpack.mod.MultiCompiler
  
  trait MultiNormalizedStatsOptions extends StObject {
    
    var children: js.Array[StatsOptions]
    
    var colors: js.UndefOr[Any] = js.undefined
  }
  object MultiNormalizedStatsOptions {
    
    inline def apply(children: js.Array[StatsOptions]): MultiNormalizedStatsOptions = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiNormalizedStatsOptions]
    }
    
    extension [Self <: MultiNormalizedStatsOptions](x: Self) {
      
      inline def setChildren(value: js.Array[StatsOptions]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: StatsOptions*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColors(value: Any): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    }
  }
  
  type MultiStats = typingsJapgolly.webpack.mod.MultiStats
  
  trait MultiStatsOptions extends StObject {
    
    var children: js.Array[
        js.UndefOr[
          Boolean | typingsJapgolly.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
        ]
      ]
  }
  object MultiStatsOptions {
    
    inline def apply(
      children: js.Array[
          js.UndefOr[
            Boolean | typingsJapgolly.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
          ]
        ]
    ): MultiStatsOptions = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiStatsOptions]
    }
    
    extension [Self <: MultiStatsOptions](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              js.UndefOr[
                Boolean | typingsJapgolly.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
              ]
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (js.UndefOr[
              Boolean | typingsJapgolly.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
            ])*
      ): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  type NormalizedStatsOptions = Exclude[
    js.UndefOr[
      Boolean | typingsJapgolly.webpack.mod.StatsOptions | none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed
    ], 
    js.UndefOr[Boolean | String]
  ]
  
  type ServerResponse = typingsJapgolly.webpackDevMiddleware.mod.ServerResponse
  
  type Stats = typingsJapgolly.webpack.mod.Stats
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.webpack.mod.StatsOptions
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.none
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.verbose
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.summary
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-only`
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.`errors-warnings`
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.minimal
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.normal
    - typingsJapgolly.webpackDevMiddleware.webpackDevMiddlewareStrings.detailed
    - scala.Unit
  */
  type StatsOptions = js.UndefOr[_StatsOptions | Boolean | typingsJapgolly.webpack.mod.StatsOptions]
  
  trait _StatsOptions extends StObject
}
