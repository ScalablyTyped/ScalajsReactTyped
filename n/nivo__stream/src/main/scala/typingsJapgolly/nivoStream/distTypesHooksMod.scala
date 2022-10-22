package typingsJapgolly.nivoStream

import typingsJapgolly.nivoStream.anon.BorderColor
import typingsJapgolly.nivoStream.anon.GetBorderColor
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/stream/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStream[RawDatum /* <: StreamDatum */](
    hasWidthHeightDataKeysLabelValueFormatOffsetTypeOrderCurveColorsBorderColorDotSizeDotColorDotBorderWidthDotBorderColor: BorderColor[RawDatum]
  ): GetBorderColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useStream")(hasWidthHeightDataKeysLabelValueFormatOffsetTypeOrderCurveColorsBorderColorDotSizeDotColorDotBorderWidthDotBorderColor.asInstanceOf[js.Any]).asInstanceOf[GetBorderColor]
}
