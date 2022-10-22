package typingsJapgolly.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeriodType extends StObject
@JSImport("tableau-js-api/enums", "PeriodType")
@js.native
object PeriodType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PeriodType & String] = js.native
  
  @js.native
  sealed trait DAY
    extends StObject
       with PeriodType
  /* "day" */ val DAY: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.DAY & String = js.native
  
  @js.native
  sealed trait HOUR
    extends StObject
       with PeriodType
  /* "hour" */ val HOUR: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.HOUR & String = js.native
  
  @js.native
  sealed trait MINUTE
    extends StObject
       with PeriodType
  /* "minute" */ val MINUTE: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.MINUTE & String = js.native
  
  @js.native
  sealed trait MONTH
    extends StObject
       with PeriodType
  /* "month" */ val MONTH: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.MONTH & String = js.native
  
  @js.native
  sealed trait QUARTER
    extends StObject
       with PeriodType
  /* "quarter" */ val QUARTER: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.QUARTER & String = js.native
  
  @js.native
  sealed trait SECOND
    extends StObject
       with PeriodType
  /* "second" */ val SECOND: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.SECOND & String = js.native
  
  @js.native
  sealed trait WEEK
    extends StObject
       with PeriodType
  /* "week" */ val WEEK: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.WEEK & String = js.native
  
  @js.native
  sealed trait YEAR
    extends StObject
       with PeriodType
  /* "year" */ val YEAR: typingsJapgolly.tableauJsApi.enumsMod.PeriodType.YEAR & String = js.native
}
