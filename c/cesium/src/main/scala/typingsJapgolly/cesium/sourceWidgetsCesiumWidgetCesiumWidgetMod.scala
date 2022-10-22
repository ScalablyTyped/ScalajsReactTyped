package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.anon.BlurActiveElementOnCanvasFocus
import typingsJapgolly.cesium.mod.CesiumWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsCesiumWidgetCesiumWidgetMod {
  
  @JSImport("cesium/Source/Widgets/CesiumWidget/CesiumWidget", JSImport.Default)
  @js.native
  open class default protected () extends CesiumWidget {
    def this(container: String) = this()
    def this(container: Element) = this()
    def this(container: String, options: BlurActiveElementOnCanvasFocus) = this()
    def this(container: Element, options: BlurActiveElementOnCanvasFocus) = this()
  }
}
