package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AlertType extends StObject
@JSImport("azdata", "AlertType")
@js.native
object AlertType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlertType & Double] = js.native
  
  @js.native
  sealed trait nonSqlServerEvent
    extends StObject
       with AlertType
  /* 3 */ val nonSqlServerEvent: typingsJapgolly.azdata.mod.AlertType.nonSqlServerEvent & Double = js.native
  
  @js.native
  sealed trait sqlServerEvent
    extends StObject
       with AlertType
  /* 1 */ val sqlServerEvent: typingsJapgolly.azdata.mod.AlertType.sqlServerEvent & Double = js.native
  
  @js.native
  sealed trait sqlServerPerformanceCondition
    extends StObject
       with AlertType
  /* 2 */ val sqlServerPerformanceCondition: typingsJapgolly.azdata.mod.AlertType.sqlServerPerformanceCondition & Double = js.native
  
  @js.native
  sealed trait wmiEvent
    extends StObject
       with AlertType
  /* 4 */ val wmiEvent: typingsJapgolly.azdata.mod.AlertType.wmiEvent & Double = js.native
}
