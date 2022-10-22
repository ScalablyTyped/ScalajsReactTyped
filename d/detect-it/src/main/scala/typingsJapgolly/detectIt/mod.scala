package typingsJapgolly.detectIt

import typingsJapgolly.detectIt.detectItStrings.hybrid
import typingsJapgolly.detectIt.detectItStrings.mouse
import typingsJapgolly.detectIt.detectItStrings.mouseOnly
import typingsJapgolly.detectIt.detectItStrings.touch
import typingsJapgolly.detectIt.detectItStrings.touchOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-it", "deviceType")
  @js.native
  val deviceType: mouseOnly | touchOnly | hybrid = js.native
  
  @JSImport("detect-it", "primaryInput")
  @js.native
  val primaryInput: mouse | touch = js.native
  
  @JSImport("detect-it", "supportsPassiveEvents")
  @js.native
  val supportsPassiveEvents: Boolean = js.native
  
  @JSImport("detect-it", "supportsPointerEvents")
  @js.native
  val supportsPointerEvents: Boolean = js.native
  
  @JSImport("detect-it", "supportsTouchEvents")
  @js.native
  val supportsTouchEvents: Boolean = js.native
}
