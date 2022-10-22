package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.libComponentsTextMod.Props
import typingsJapgolly.reactSketchapp.libRenderersSketchRendererMod.SketchRenderer
import typingsJapgolly.reactSketchapp.libTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderersTextRendererMod {
  
  @JSImport("react-sketchapp/lib/renderers/TextRenderer", "TextRenderer")
  @js.native
  open class TextRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(props: Props): String = js.native
  }
}
