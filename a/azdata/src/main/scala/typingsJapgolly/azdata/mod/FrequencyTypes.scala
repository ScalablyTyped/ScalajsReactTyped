package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencyTypes extends StObject
@JSImport("azdata", "FrequencyTypes")
@js.native
object FrequencyTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencyTypes & Double] = js.native
  
  @js.native
  sealed trait AutoStart
    extends StObject
       with FrequencyTypes
  /* 1 << 6 */ val AutoStart: typingsJapgolly.azdata.mod.FrequencyTypes.AutoStart & Double = js.native
  
  @js.native
  sealed trait Daily
    extends StObject
       with FrequencyTypes
  /* 1 << 2 */ val Daily: typingsJapgolly.azdata.mod.FrequencyTypes.Daily & Double = js.native
  
  @js.native
  sealed trait Monthly
    extends StObject
       with FrequencyTypes
  /* 1 << 4 */ val Monthly: typingsJapgolly.azdata.mod.FrequencyTypes.Monthly & Double = js.native
  
  @js.native
  sealed trait MonthlyRelative
    extends StObject
       with FrequencyTypes
  /* 1 << 5 */ val MonthlyRelative: typingsJapgolly.azdata.mod.FrequencyTypes.MonthlyRelative & Double = js.native
  
  @js.native
  sealed trait OnIdle
    extends StObject
       with FrequencyTypes
  /* 1 << 7 */ val OnIdle: typingsJapgolly.azdata.mod.FrequencyTypes.OnIdle & Double = js.native
  
  @js.native
  sealed trait OneTime
    extends StObject
       with FrequencyTypes
  /* 1 << 1 */ val OneTime: typingsJapgolly.azdata.mod.FrequencyTypes.OneTime & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with FrequencyTypes
  /* 0 */ val Unknown: typingsJapgolly.azdata.mod.FrequencyTypes.Unknown & Double = js.native
  
  @js.native
  sealed trait Weekly
    extends StObject
       with FrequencyTypes
  /* 1 << 3 */ val Weekly: typingsJapgolly.azdata.mod.FrequencyTypes.Weekly & Double = js.native
}
