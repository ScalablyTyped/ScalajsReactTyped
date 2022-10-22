package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.end
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.full
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HandleType {
  
  @JSImport("@blueprintjs/core", "HandleType")
  @js.native
  val ^ : js.Any = js.native
  
  /** An end handle appears as the right or bottom half of a square. */
  @JSImport("@blueprintjs/core", "HandleType.END")
  @js.native
  def END: end = js.native
  inline def END_=(x: end): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
  
  /** A full handle appears as a small square. */
  @JSImport("@blueprintjs/core", "HandleType.FULL")
  @js.native
  def FULL: full = js.native
  inline def FULL_=(x: full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULL")(x.asInstanceOf[js.Any])
  
  /** A start handle appears as the left or top half of a square. */
  @JSImport("@blueprintjs/core", "HandleType.START")
  @js.native
  def START: start = js.native
  inline def START_=(x: start): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START")(x.asInstanceOf[js.Any])
}
