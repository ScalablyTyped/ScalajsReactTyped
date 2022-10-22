package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencySubDayTypes extends StObject
@JSImport("azdata", "FrequencySubDayTypes")
@js.native
object FrequencySubDayTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencySubDayTypes & Double] = js.native
  
  @js.native
  sealed trait Hour
    extends StObject
       with FrequencySubDayTypes
  /* 8 */ val Hour: typingsJapgolly.azdata.mod.FrequencySubDayTypes.Hour & Double = js.native
  
  @js.native
  sealed trait Minute
    extends StObject
       with FrequencySubDayTypes
  /* 4 */ val Minute: typingsJapgolly.azdata.mod.FrequencySubDayTypes.Minute & Double = js.native
  
  @js.native
  sealed trait Once
    extends StObject
       with FrequencySubDayTypes
  /* 1 */ val Once: typingsJapgolly.azdata.mod.FrequencySubDayTypes.Once & Double = js.native
  
  @js.native
  sealed trait Second
    extends StObject
       with FrequencySubDayTypes
  /* 2 */ val Second: typingsJapgolly.azdata.mod.FrequencySubDayTypes.Second & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with FrequencySubDayTypes
  /* 0 */ val Unknown: typingsJapgolly.azdata.mod.FrequencySubDayTypes.Unknown & Double = js.native
}
