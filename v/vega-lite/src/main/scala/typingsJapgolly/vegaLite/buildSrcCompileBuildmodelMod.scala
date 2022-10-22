package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import typingsJapgolly.vegaLite.buildSrcSpecMod.NormalizedSpec
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileBuildmodelMod {
  
  @JSImport("vega-lite/build/src/compile/buildmodel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildModel(
    spec: NormalizedSpec,
    parent: Model,
    parentGivenName: String,
    unitSize: LayoutSizeMixins,
    config: Config[SignalRef]
  ): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("buildModel")(spec.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], parentGivenName.asInstanceOf[js.Any], unitSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Model]
}
