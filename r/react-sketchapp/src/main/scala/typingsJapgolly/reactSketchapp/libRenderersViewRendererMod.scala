package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.libComponentsViewMod.Props
import typingsJapgolly.reactSketchapp.libRenderersSketchRendererMod.SketchRenderer
import typingsJapgolly.reactSketchapp.libTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderersViewRendererMod {
  
  @JSImport("react-sketchapp/lib/renderers/ViewRenderer", "ViewRenderer")
  @js.native
  open class ViewRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(_props: Props): String = js.native
  }
}
