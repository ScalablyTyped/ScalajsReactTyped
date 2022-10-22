package typingsJapgolly.fluentuiDateTimeUtilities

import typingsJapgolly.fluentuiDateTimeUtilities.libDateValuesDateValuesMod.DayOfWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateGridIsContiguousMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/isContiguous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isContiguous(days: js.Array[DayOfWeek], isSingleWeek: Boolean, firstDayOfWeek: DayOfWeek): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContiguous")(days.asInstanceOf[js.Any], isSingleWeek.asInstanceOf[js.Any], firstDayOfWeek.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
