package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the current cost of doing background work. Used as a hint to background tasks about how much work they can do. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundWorkCostValue")
@js.native
object BackgroundWorkCostValue extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue & Double
  ] = js.native
  
  /* 2 */ val high: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.high & Double = js.native
  
  /* 0 */ val low: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.low & Double = js.native
  
  /* 1 */ val medium: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BackgroundWorkCostValue.medium & Double = js.native
}
