package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ValueRange")
@js.native
/* private */ open class ValueRange ()
  extends typingsJapgolly.jsJodaCore.mod.ValueRange
/* static members */
object ValueRange {
  
  @JSGlobal("JSJoda.ValueRange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of(minSmallest: Double, minLargest: Double, maxSmallest: Double, maxLargest: Double): typingsJapgolly.jsJodaCore.mod.ValueRange = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(minSmallest.asInstanceOf[js.Any], minLargest.asInstanceOf[js.Any], maxSmallest.asInstanceOf[js.Any], maxLargest.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ValueRange]
  inline def of(min: Double, maxSmallest: Double, maxLargest: Double): typingsJapgolly.jsJodaCore.mod.ValueRange = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(min.asInstanceOf[js.Any], maxSmallest.asInstanceOf[js.Any], maxLargest.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ValueRange]
  inline def of(min: Double, max: Double): typingsJapgolly.jsJodaCore.mod.ValueRange = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ValueRange]
}
