package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libUtilsTimeIntervalMod.IntervalMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsChooseMaskMod {
  
  @JSImport("@antv/scale/lib/utils/choose-mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chooseNiceTimeMask(date: js.Date, intervalMap: IntervalMap): String = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseNiceTimeMask")(date.asInstanceOf[js.Any], intervalMap.asInstanceOf[js.Any])).asInstanceOf[String]
}
