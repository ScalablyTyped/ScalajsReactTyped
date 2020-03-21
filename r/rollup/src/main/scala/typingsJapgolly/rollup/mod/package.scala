package typingsJapgolly.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddonHook = java.lang.String | (js.ThisFunction0[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    java.lang.String | js.Promise[java.lang.String]
  ])
  type EmitAsset = js.Function2[
    /* name */ java.lang.String, 
    /* source */ js.UndefOr[java.lang.String | typingsJapgolly.node.Buffer], 
    java.lang.String
  ]
  type EmitChunk = js.Function2[
    /* id */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.rollup.AnonName], 
    java.lang.String
  ]
  type EmitFile = js.Function1[/* emittedFile */ typingsJapgolly.rollup.mod.EmittedFile, java.lang.String]
  type ExternalOption = js.Array[java.lang.String] | typingsJapgolly.rollup.mod.IsExternal
  type GetManualChunk = js.Function1[/* id */ java.lang.String, js.UndefOr[java.lang.String | scala.Null]]
  type GlobalsOption = org.scalablytyped.runtime.StringDictionary[java.lang.String] | (js.Function1[/* name */ java.lang.String, java.lang.String])
  type HasModuleSideEffects = js.Function2[/* id */ java.lang.String, /* external */ scala.Boolean, scala.Boolean]
  type InputOption = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type IsExternal = js.Function3[
    /* source */ java.lang.String, 
    /* importer */ java.lang.String, 
    /* isResolved */ scala.Boolean, 
    js.UndefOr[scala.Boolean | scala.Null]
  ]
  type IsPureModule = js.Function1[/* id */ java.lang.String, js.UndefOr[scala.Boolean | scala.Null]]
  type LoadHook = js.ThisFunction1[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* id */ java.lang.String, 
    js.Promise[typingsJapgolly.rollup.mod.LoadResult] | typingsJapgolly.rollup.mod.LoadResult
  ]
  type LoadResult = js.UndefOr[typingsJapgolly.rollup.mod.SourceDescription | java.lang.String | scala.Null]
  type ManualChunksOption = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | typingsJapgolly.rollup.mod.GetManualChunk
  type ModuleSideEffectsOption = scala.Boolean | typingsJapgolly.rollup.rollupStrings.`no-external` | js.Array[java.lang.String] | typingsJapgolly.rollup.mod.HasModuleSideEffects
  type OptionsPaths = (typingsJapgolly.std.Record[java.lang.String, java.lang.String]) | (js.Function1[/* id */ java.lang.String, java.lang.String])
  type OutputBundle = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.rollup.mod.OutputAsset | typingsJapgolly.rollup.mod.OutputChunk]
  type OutputBundleWithPlaceholders = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.rollup.mod.OutputAsset | typingsJapgolly.rollup.mod.OutputChunk | typingsJapgolly.rollup.mod.FilePlaceholder
  ]
  type PluginImpl[O /* <: js.Object */] = js.Function1[/* options */ js.UndefOr[O], typingsJapgolly.rollup.mod.Plugin]
  type PureModulesOption = scala.Boolean | js.Array[java.lang.String] | typingsJapgolly.rollup.mod.IsPureModule
  type RenderChunkHook = js.ThisFunction3[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* chunk */ typingsJapgolly.rollup.mod.RenderedChunk, 
    /* options */ typingsJapgolly.rollup.mod.OutputOptions, 
    (js.Promise[typingsJapgolly.rollup.AnonCode | scala.Null]) | typingsJapgolly.rollup.AnonCode | java.lang.String | scala.Null
  ]
  type ResolveAssetUrlHook = js.ThisFunction1[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* options */ typingsJapgolly.rollup.AnonAssetFileName, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolveDynamicImportHook = js.ThisFunction2[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* specifier */ java.lang.String | typingsJapgolly.estree.mod.Node, 
    /* importer */ java.lang.String, 
    js.Promise[typingsJapgolly.rollup.mod.ResolveIdResult] | typingsJapgolly.rollup.mod.ResolveIdResult
  ]
  type ResolveFileUrlHook = js.ThisFunction1[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* options */ typingsJapgolly.rollup.AnonAssetReferenceId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolveIdHook = js.ThisFunction2[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* source */ java.lang.String, 
    /* importer */ js.UndefOr[java.lang.String], 
    js.Promise[typingsJapgolly.rollup.mod.ResolveIdResult] | typingsJapgolly.rollup.mod.ResolveIdResult
  ]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.rollup.rollupBooleans.`false`
    - scala.Null
    - `js.undefined`
    - typingsJapgolly.rollup.mod.PartialResolvedId
  */
  type ResolveIdResult = js.UndefOr[typingsJapgolly.rollup.mod._ResolveIdResult | java.lang.String | scala.Null]
  type ResolveImportMetaHook = js.ThisFunction2[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* prop */ java.lang.String | scala.Null, 
    /* options */ typingsJapgolly.rollup.AnonChunkId, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type ResolvedIdMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.rollup.mod.ResolvedId]
  type SerializablePluginCache = org.scalablytyped.runtime.StringDictionary[js.Tuple2[scala.Double, js.Any]]
  type SerializedTimings = org.scalablytyped.runtime.StringDictionary[js.Tuple3[scala.Double, scala.Double, scala.Double]]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rollup.mod.ExistingRawSourceMap
    - java.lang.String
    - scala.Null
    - typingsJapgolly.rollup.AnonMappings
  */
  type SourceMapInput = typingsJapgolly.rollup.mod._SourceMapInput | java.lang.String | scala.Null
  type SourceMapSegment = js.Array[scala.Double] | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type TransformChunkHook = js.ThisFunction2[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* options */ typingsJapgolly.rollup.mod.OutputOptions, 
    js.UndefOr[
      (js.Promise[js.UndefOr[typingsJapgolly.rollup.AnonCode | scala.Null]]) | typingsJapgolly.rollup.AnonCode | scala.Null
    ]
  ]
  type TransformHook = js.ThisFunction2[
    /* this */ typingsJapgolly.rollup.mod.PluginContext, 
    /* code */ java.lang.String, 
    /* id */ java.lang.String, 
    js.Promise[typingsJapgolly.rollup.mod.TransformResult] | typingsJapgolly.rollup.mod.TransformResult
  ]
  type TransformResult = js.UndefOr[
    java.lang.String | scala.Null | typingsJapgolly.rollup.mod.TransformSourceDescription
  ]
  type WarningHandler = js.Function1[/* warning */ typingsJapgolly.rollup.mod.RollupWarning, scala.Unit]
  type WarningHandlerWithDefault = js.Function2[
    /* warning */ typingsJapgolly.rollup.mod.RollupWarning, 
    /* defaultHandler */ typingsJapgolly.rollup.mod.WarningHandler, 
    scala.Unit
  ]
}
