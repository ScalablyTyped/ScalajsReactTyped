package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.Reason
import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChannelMod.ScaleChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcCompileSplitMod.Explicit
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgDomain
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgNonUnionDomain
import typingsJapgolly.vegaLite.vegaLiteBooleans.`true`
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import typingsJapgolly.vegaTypings.typesSpecScaleMod.ScaleData
import typingsJapgolly.vegaTypings.typesSpecScaleMod.SortField
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileScaleDomainMod {
  
  @JSImport("vega-lite/build/src/compile/scale/domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleDomain(model: Model, channel: ScaleChannel): SignalRef | ScaleData | (js.Array[String | Double | Boolean | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleDomain")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[SignalRef | ScaleData | (js.Array[String | Double | Boolean | SignalRef])]
  
  inline def canUseUnaggregatedDomain_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null], scaleType: ScaleType): Reason = (^.asInstanceOf[js.Dynamic].applyDynamic("canUseUnaggregatedDomain")(fieldDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[Reason]
  
  inline def domainSort(model: UnitModel, channel: ScaleChannel, scaleType: ScaleType): js.UndefOr[`true` | SortField] = (^.asInstanceOf[js.Dynamic].applyDynamic("domainSort")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true` | SortField]]
  
  inline def getFieldFromDomain(domain: VgDomain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeDomains(domains: js.Array[VgNonUnionDomain]): VgDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDomains")(domains.asInstanceOf[js.Any]).asInstanceOf[VgDomain]
  
  inline def parseDomainForChannel(model: UnitModel, channel: ScaleChannel): Explicit[js.Array[VgNonUnionDomain]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDomainForChannel")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Explicit[js.Array[VgNonUnionDomain]]]
  
  inline def parseScaleDomain(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleDomain")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
