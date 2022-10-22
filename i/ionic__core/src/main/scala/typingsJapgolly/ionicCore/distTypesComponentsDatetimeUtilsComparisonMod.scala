package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimeParts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeUtilsComparisonMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/utils/comparison", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAfter(baseParts: DatetimeParts, compareParts: DatetimeParts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfter")(baseParts.asInstanceOf[js.Any], compareParts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBefore(baseParts: DatetimeParts, compareParts: DatetimeParts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(baseParts.asInstanceOf[js.Any], compareParts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSameDay(baseParts: DatetimeParts, compareParts: DatetimeParts): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameDay")(baseParts.asInstanceOf[js.Any], compareParts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def warnIfValueOutOfBounds(value: js.Array[DatetimeParts], min: DatetimeParts, max: DatetimeParts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnIfValueOutOfBounds")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def warnIfValueOutOfBounds(value: DatetimeParts, min: DatetimeParts, max: DatetimeParts): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warnIfValueOutOfBounds")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
