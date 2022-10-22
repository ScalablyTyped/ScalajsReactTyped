package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.autosizeAutosizeTypeAutoS
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import typingsJapgolly.vegaLite.buildSrcSpecMod.NormalizedSpec
import typingsJapgolly.vegaLite.buildSrcSpecMod.TopLevelSpec
import typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.AutoSizeParams
import typingsJapgolly.vegaLite.buildSrcSpecToplevelMod.TopLevel
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeMod {
  
  @JSImport("vega-lite/build/src/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(spec: TopLevelSpec & LayoutSizeMixins): TopLevel[NormalizedSpec] & LayoutSizeMixins = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any]).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
  inline def normalize(spec: TopLevelSpec & LayoutSizeMixins, config: Config[SignalRef]): TopLevel[NormalizedSpec] & LayoutSizeMixins = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
  
  inline def normalizeAutoSize(spec: TopLevel[NormalizedSpec], sizeInfo: autosizeAutosizeTypeAutoS): AutoSizeParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAutoSize")(spec.asInstanceOf[js.Any], sizeInfo.asInstanceOf[js.Any])).asInstanceOf[AutoSizeParams]
  inline def normalizeAutoSize(
    spec: TopLevel[NormalizedSpec],
    sizeInfo: autosizeAutosizeTypeAutoS,
    config: Config[ExprRef | SignalRef]
  ): AutoSizeParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAutoSize")(spec.asInstanceOf[js.Any], sizeInfo.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AutoSizeParams]
}
