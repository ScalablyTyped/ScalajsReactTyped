package typingsJapgolly.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigFunction = js.Function1[
    /* api */ typingsJapgolly.babelCore.mod.ConfigAPI, 
    typingsJapgolly.babelCore.mod.TransformOptions
  ]
  type FileParseCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsJapgolly.babelCore.mod.ParseResult | scala.Null, 
    js.Any
  ]
  type FileResultCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsJapgolly.babelCore.mod.BabelFileResult | scala.Null, 
    js.Any
  ]
  type MatchPattern = java.lang.String | js.RegExp | (js.Function2[
    /* filename */ js.UndefOr[java.lang.String], 
    /* context */ typingsJapgolly.babelCore.mod.MatchPatternContext, 
    scala.Boolean
  ])
  type Node = typingsJapgolly.babelTypes.mod.Node
  type ParseResult = typingsJapgolly.babelTypes.mod.File_ | typingsJapgolly.babelTypes.mod.Program_
  type PluginItem = typingsJapgolly.babelCore.mod.ConfigItem | typingsJapgolly.babelCore.mod.PluginObj[js.Any] | typingsJapgolly.babelCore.mod.PluginTarget | (js.Tuple2[
    typingsJapgolly.babelCore.mod.PluginTarget, 
    typingsJapgolly.babelCore.mod.PluginOptions
  ]) | (js.Tuple3[
    typingsJapgolly.babelCore.mod.PluginTarget, 
    typingsJapgolly.babelCore.mod.PluginOptions, 
    js.UndefOr[java.lang.String]
  ])
  type PluginOptions = js.UndefOr[js.Object | typingsJapgolly.babelCore.babelCoreBooleans.`false`]
  type PluginTarget = java.lang.String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
  type SimpleCacheCallback[T /* <: typingsJapgolly.babelCore.mod.SimpleCacheKey */] = js.Function0[T]
  type SimpleCacheKey = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
}
