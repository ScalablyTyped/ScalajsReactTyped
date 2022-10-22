package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.mod.Scene
import typingsJapgolly.cesium.mod.VRButtonViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsVrbuttonVrbuttonviewmodelMod {
  
  @JSImport("cesium/Source/Widgets/VRButton/VRButtonViewModel", JSImport.Default)
  @js.native
  open class default protected () extends VRButtonViewModel {
    def this(scene: Scene) = this()
    def this(scene: Scene, vrElement: String) = this()
    def this(scene: Scene, vrElement: Element) = this()
  }
}
