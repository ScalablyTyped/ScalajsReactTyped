package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.mod.ProjectionPicker
import typingsJapgolly.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsProjectionPickerProjectionPickerMod {
  
  @JSImport("cesium/Source/Widgets/ProjectionPicker/ProjectionPicker", JSImport.Default)
  @js.native
  open class default protected () extends ProjectionPicker {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
  }
}
