package typingsJapgolly.reactSketchapp

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactSketchapp.libTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderMod {
  
  @JSImport("react-sketchapp/lib/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(bridge: PlatformBridge): js.Function2[/* element */ Element, /* container */ js.UndefOr[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* element */ Element, /* container */ js.UndefOr[Any], Any]]
  
  inline def renderLayers(layers: js.Array[Any], container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLayers")(layers.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
}
