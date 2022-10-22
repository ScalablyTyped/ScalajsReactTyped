package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcAxisMod.AxisInternal
import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChannelMod.NonPositionScaleChannel
import typingsJapgolly.vegaLite.buildSrcChannelMod.PositionChannel
import typingsJapgolly.vegaLite.buildSrcChannelMod.ScaleChannel
import typingsJapgolly.vegaLite.buildSrcChannelMod.SingleDefChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typingsJapgolly.vegaLite.buildSrcCompileAxisComponentMod.AxisInternalIndex
import typingsJapgolly.vegaLite.buildSrcCompileLegendComponentMod.LegendInternalIndex
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.ModelWithField
import typingsJapgolly.vegaLite.buildSrcCompileScaleComponentMod.ScaleIndex
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcLegendMod.LegendInternal
import typingsJapgolly.vegaLite.buildSrcMarkMod.Mark
import typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef
import typingsJapgolly.vegaLite.buildSrcProjectionMod.Projection
import typingsJapgolly.vegaLite.buildSrcScaleMod.Domain
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionParameter
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import typingsJapgolly.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import typingsJapgolly.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typingsJapgolly.vegaLite.buildSrcStackMod.StackProperties
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileUnitMod {
  
  @JSImport("vega-lite/build/src/compile/unit", "UnitModel")
  @js.native
  open class UnitModel protected () extends ModelWithField {
    def this(
      spec: NormalizedUnitSpec,
      parent: Model,
      parentGivenName: String,
      parentGivenSize: LayoutSizeMixins,
      config: Config[SignalRef]
    ) = this()
    
    def axis(channel: PositionChannel): AxisInternal = js.native
    
    val encoding: Encoding[String] = js.native
    
    def hasProjection: Boolean = js.native
    
    /* private */ var initAxes: Any = js.native
    
    /* private */ var initAxis: Any = js.native
    
    /* private */ var initLegends: Any = js.native
    
    /* private */ var initScale: Any = js.native
    
    /* private */ var initScales: Any = js.native
    
    def legend(channel: NonPositionScaleChannel): LegendInternal = js.native
    
    def mark: Mark = js.native
    
    val markDef: MarkDef[Mark, SignalRef] = js.native
    
    /**
      * Return specified Vega-Lite scale domain for a particular channel
      * @param channel
      */
    def scaleDomain(channel: ScaleChannel): Domain = js.native
    
    val selection: js.Array[SelectionParameter[SelectionType]] = js.native
    
    /* protected */ var specifiedAxes: AxisInternalIndex = js.native
    
    /* protected */ var specifiedLegends: LegendInternalIndex = js.native
    
    var specifiedProjection: Projection[ExprRef | SignalRef] = js.native
    
    val specifiedScales: ScaleIndex = js.native
    
    val stack: StackProperties = js.native
    
    def typedFieldDef(channel: SingleDefChannel): TypedFieldDef[String, Any, Boolean | BinParams | binned] = js.native
  }
}
