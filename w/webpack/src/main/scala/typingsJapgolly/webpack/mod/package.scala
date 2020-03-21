package typingsJapgolly.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BannerPlugin = typingsJapgolly.webpack.mod.BannerPlugin_
  /**
    * @deprecated Use RuleSetCondition instead
    */
  type Condition = typingsJapgolly.webpack.mod.RuleSetCondition
  type ConfigurationFactory = js.Function2[
    /* env */ java.lang.String | (typingsJapgolly.std.Record[java.lang.String, scala.Boolean | scala.Double | java.lang.String]), 
    /* args */ typingsJapgolly.webpack.mod.CliConfigOptions, 
    typingsJapgolly.webpack.mod.Configuration | js.Promise[typingsJapgolly.webpack.mod.Configuration]
  ]
  type DllPlugin = typingsJapgolly.webpack.mod.DllPlugin_
  type DllReferencePlugin = typingsJapgolly.webpack.mod.DllReferencePlugin_
  type Entry = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type EntryFunc = js.Function0[
    java.lang.String | js.Array[java.lang.String] | typingsJapgolly.webpack.mod.Entry | (js.Promise[
      java.lang.String | js.Array[java.lang.String] | typingsJapgolly.webpack.mod.Entry
    ])
  ]
  type EvalSourceMapDevToolPlugin = typingsJapgolly.webpack.mod.EvalSourceMapDevToolPlugin_
  /** @deprecated use webpack.EvalSourceMapDevToolPlugin.Options */
  type EvalSourceMapDevToolPluginOptions = typingsJapgolly.webpack.mod.EvalSourceMapDevToolPlugin.Options
  type ExternalsElement = java.lang.String | js.RegExp | typingsJapgolly.webpack.mod.ExternalsObjectElement | typingsJapgolly.webpack.mod.ExternalsFunctionElement
  type ExternalsFunctionElement = js.Function3[
    /* context */ js.Any, 
    /* request */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit], 
    js.Any
  ]
  type ExternalsObjectElement = org.scalablytyped.runtime.StringDictionary[
    scala.Boolean | java.lang.String | js.Array[java.lang.String] | (typingsJapgolly.std.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]])
  ]
  type ICompiler = typingsJapgolly.webpack.mod.ICompiler_
  type Loader_ = java.lang.String | typingsJapgolly.webpack.mod.NewLoader
  type MultiConfigurationFactory = js.Function2[
    /* env */ java.lang.String | (typingsJapgolly.std.Record[java.lang.String, scala.Boolean | scala.Double | java.lang.String]), 
    /* args */ typingsJapgolly.webpack.mod.CliConfigOptions, 
    js.Array[typingsJapgolly.webpack.mod.Configuration] | js.Promise[js.Array[typingsJapgolly.webpack.mod.Configuration]]
  ]
  /** @deprecated use webpack.Options.Performance */
  type PerformanceOptions = typingsJapgolly.webpack.mod.Options.Performance
  /**
    * @deprecated Use RuleSetRule instead
    */
  type Rule = typingsJapgolly.webpack.mod.RuleSetRule
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.RegExp
    - java.lang.String
    - js.Function1[/ * path * / java.lang.String, scala.Boolean]
    - typingsJapgolly.webpack.mod.RuleSetConditions
    - typingsJapgolly.webpack.AnonAnd
  */
  type RuleSetCondition = typingsJapgolly.webpack.mod._RuleSetCondition | (js.Function1[/* path */ java.lang.String, scala.Boolean]) | js.RegExp | java.lang.String
  type RuleSetQuery = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  type RuleSetUse = typingsJapgolly.webpack.mod.RuleSetUseItem | js.Array[typingsJapgolly.webpack.mod.RuleSetUseItem] | (js.Function1[
    /* data */ js.Any, 
    typingsJapgolly.webpack.mod.RuleSetUseItem | js.Array[typingsJapgolly.webpack.mod.RuleSetUseItem]
  ])
  type RuleSetUseItem = java.lang.String | typingsJapgolly.webpack.mod.RuleSetLoader | (js.Function1[/* data */ js.Any, java.lang.String | typingsJapgolly.webpack.mod.RuleSetLoader])
  type SourceMapDevToolPlugin = typingsJapgolly.webpack.mod.SourceMapDevToolPlugin_
  /** @deprecated use webpack.SourceMapDevToolPlugin.Options */
  type SourceMapDevToolPluginOptions = typingsJapgolly.webpack.mod.SourceMapDevToolPlugin.Options
  type Stats = typingsJapgolly.webpack.mod.Stats_
  /** @deprecated use webpack.optimize.UglifyJsPlugin.CommentFilter */
  type UglifyCommentFunction = typingsJapgolly.webpack.mod.optimize.UglifyJsPlugin.CommentFilter
  /** @deprecated use webpack.optimize.UglifyJsPlugin.Options */
  type UglifyPluginOptions = typingsJapgolly.webpack.mod.optimize.UglifyJsPlugin.Options
  /** @deprecated use webpack.Options.WatchOptions */
  type WatchOptions = typingsJapgolly.webpack.mod.Options.WatchOptions
}
