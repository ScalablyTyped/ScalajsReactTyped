package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.center
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.left
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Alignment {
  
  @JSImport("@blueprintjs/core", "Alignment")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Alignment.CENTER")
  @js.native
  def CENTER: center = js.native
  inline def CENTER_=(x: center): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Alignment.LEFT")
  @js.native
  def LEFT: left = js.native
  inline def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Alignment.RIGHT")
  @js.native
  def RIGHT: right = js.native
  inline def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
}
