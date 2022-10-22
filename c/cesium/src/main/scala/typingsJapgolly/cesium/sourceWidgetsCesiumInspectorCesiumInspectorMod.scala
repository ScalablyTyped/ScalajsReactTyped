package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.mod.CesiumInspector
import typingsJapgolly.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsCesiumInspectorCesiumInspectorMod {
  
  @JSImport("cesium/Source/Widgets/CesiumInspector/CesiumInspector", JSImport.Default)
  @js.native
  open class default protected () extends CesiumInspector {
    def this(container: String, scene: Scene) = this()
    def this(container: Element, scene: Scene) = this()
  }
}
