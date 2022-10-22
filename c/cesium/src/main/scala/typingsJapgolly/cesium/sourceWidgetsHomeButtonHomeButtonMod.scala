package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.mod.HomeButton
import typingsJapgolly.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsHomeButtonHomeButtonMod {
  
  @JSImport("cesium/Source/Widgets/HomeButton/HomeButton", JSImport.Default)
  @js.native
  open class default protected () extends HomeButton {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
    def this(container: String, scene: Scene, duration: Double) = this()
    def this(container: Element, scene: Scene, duration: Double) = this()
  }
}
