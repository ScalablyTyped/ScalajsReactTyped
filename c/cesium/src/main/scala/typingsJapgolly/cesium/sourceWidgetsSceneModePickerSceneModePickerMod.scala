package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.mod.Scene
import typingsJapgolly.cesium.mod.SceneModePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsSceneModePickerSceneModePickerMod {
  
  @JSImport("cesium/Source/Widgets/SceneModePicker/SceneModePicker", JSImport.Default)
  @js.native
  open class default protected () extends SceneModePicker {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
    def this(container: String, scene: Scene, duration: Double) = this()
    def this(container: Element, scene: Scene, duration: Double) = this()
  }
}
