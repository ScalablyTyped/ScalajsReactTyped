package typingsJapgolly.lib0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimeMod {
  
  @JSImport("lib0/dist/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDate(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDate")().asInstanceOf[js.Date]
  
  inline def getUnixTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")().asInstanceOf[Double]
  
  inline def humanizeDuration(d: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("humanizeDuration")(d.asInstanceOf[js.Any]).asInstanceOf[String]
}
