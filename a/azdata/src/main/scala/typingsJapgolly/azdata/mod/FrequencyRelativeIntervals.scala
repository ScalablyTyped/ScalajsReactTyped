package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrequencyRelativeIntervals extends StObject
@JSImport("azdata", "FrequencyRelativeIntervals")
@js.native
object FrequencyRelativeIntervals extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrequencyRelativeIntervals & Double] = js.native
  
  @js.native
  sealed trait First
    extends StObject
       with FrequencyRelativeIntervals
  /* 1 */ val First: typingsJapgolly.azdata.mod.FrequencyRelativeIntervals.First & Double = js.native
  
  @js.native
  sealed trait Fourth
    extends StObject
       with FrequencyRelativeIntervals
  /* 8 */ val Fourth: typingsJapgolly.azdata.mod.FrequencyRelativeIntervals.Fourth & Double = js.native
  
  @js.native
  sealed trait Last
    extends StObject
       with FrequencyRelativeIntervals
  /* 16 */ val Last: typingsJapgolly.azdata.mod.FrequencyRelativeIntervals.Last & Double = js.native
  
  @js.native
  sealed trait Second
    extends StObject
       with FrequencyRelativeIntervals
  /* 2 */ val Second: typingsJapgolly.azdata.mod.FrequencyRelativeIntervals.Second & Double = js.native
  
  @js.native
  sealed trait Third
    extends StObject
       with FrequencyRelativeIntervals
  /* 4 */ val Third: typingsJapgolly.azdata.mod.FrequencyRelativeIntervals.Third & Double = js.native
}
