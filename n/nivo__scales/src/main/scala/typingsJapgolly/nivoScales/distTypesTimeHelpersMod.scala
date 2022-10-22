package typingsJapgolly.nivoScales

import typingsJapgolly.nivoScales.anon.Format
import typingsJapgolly.nivoScales.nivoScalesStrings.day
import typingsJapgolly.nivoScales.nivoScalesStrings.hour
import typingsJapgolly.nivoScales.nivoScalesStrings.millisecond
import typingsJapgolly.nivoScales.nivoScalesStrings.minute
import typingsJapgolly.nivoScales.nivoScalesStrings.month
import typingsJapgolly.nivoScales.nivoScalesStrings.second
import typingsJapgolly.nivoScales.nivoScalesStrings.year
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeHelpersMod {
  
  @JSImport("@nivo/scales/dist/types/timeHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDateNormalizer(hasFormatPrecisionUseUTC: Format): js.Function1[/* value */ js.UndefOr[js.Date | String], js.UndefOr[js.Date]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDateNormalizer")(hasFormatPrecisionUseUTC.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ js.UndefOr[js.Date | String], js.UndefOr[js.Date]]]
  
  inline def createPrecisionMethod(precision: TIME_PRECISION): js.Function1[/* date */ js.Date, js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrecisionMethod")(precision.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* date */ js.Date, js.Date]]
  
  @JSImport("@nivo/scales/dist/types/timeHelpers", "precisionCutOffs")
  @js.native
  val precisionCutOffs: js.Array[js.Function1[/* date */ js.Date, Unit]] = js.native
  
  @JSImport("@nivo/scales/dist/types/timeHelpers", "precisionCutOffsByType")
  @js.native
  val precisionCutOffsByType: Record[TIME_PRECISION, js.Array[js.Function1[/* date */ js.Date, Unit]]] = js.native
  
  @JSImport("@nivo/scales/dist/types/timeHelpers", "timePrecisions")
  @js.native
  val timePrecisions: js.Tuple7[millisecond, second, minute, hour, day, month, year] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoScales.nivoScalesStrings.millisecond
    - typingsJapgolly.nivoScales.nivoScalesStrings.second
    - typingsJapgolly.nivoScales.nivoScalesStrings.minute
    - typingsJapgolly.nivoScales.nivoScalesStrings.hour
    - typingsJapgolly.nivoScales.nivoScalesStrings.day
    - typingsJapgolly.nivoScales.nivoScalesStrings.month
    - typingsJapgolly.nivoScales.nivoScalesStrings.year
  */
  trait TIME_PRECISION extends StObject
}
