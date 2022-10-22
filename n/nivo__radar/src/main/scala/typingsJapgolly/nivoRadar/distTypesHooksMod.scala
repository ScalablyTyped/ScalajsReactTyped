package typingsJapgolly.nivoRadar

import typingsJapgolly.nivoRadar.anon.AngleStep
import typingsJapgolly.nivoRadar.anon.Colors
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/radar/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRadar[D /* <: Record[String, Any] */](
    hasDataKeysIndexByRotationDegreesMaxValueValueFormatCurveWidthHeightColorsLegendsDefsFill: Colors[D]
  ): AngleStep[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRadar")(hasDataKeysIndexByRotationDegreesMaxValueValueFormatCurveWidthHeightColorsLegendsDefsFill.asInstanceOf[js.Any]).asInstanceOf[AngleStep[D]]
}
