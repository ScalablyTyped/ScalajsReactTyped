package typingsJapgolly.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait frequency extends StObject
@JSImport("itunesconnectanalytics", "frequency")
@js.native
object frequency extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[frequency & String] = js.native
  
  @js.native
  sealed trait days
    extends StObject
       with frequency
  /* "DAY" */ val days: typingsJapgolly.itunesconnectanalytics.mod.frequency.days & String = js.native
  
  @js.native
  sealed trait months
    extends StObject
       with frequency
  /* "MONTH" */ val months: typingsJapgolly.itunesconnectanalytics.mod.frequency.months & String = js.native
  
  @js.native
  sealed trait weeks
    extends StObject
       with frequency
  /* "WEEK" */ val weeks: typingsJapgolly.itunesconnectanalytics.mod.frequency.weeks & String = js.native
}
