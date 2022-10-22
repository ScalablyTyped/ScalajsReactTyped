package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.mod.Viewer
import typingsJapgolly.cesium.mod.Viewer.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsViewerViewerMod {
  
  @JSImport("cesium/Source/Widgets/Viewer/Viewer", JSImport.Default)
  @js.native
  open class default protected () extends Viewer {
    def this(container: String) = this()
    def this(container: Element) = this()
    def this(container: String, options: ConstructorOptions) = this()
    def this(container: Element, options: ConstructorOptions) = this()
  }
}
