package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.libModuleComponentsViewMod.Props
import typingsJapgolly.reactSketchapp.libModuleRenderersSketchRendererMod.SketchRenderer
import typingsJapgolly.reactSketchapp.libModuleTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleRenderersViewRendererMod {
  
  @JSImport("react-sketchapp/lib/module/renderers/ViewRenderer", "ViewRenderer")
  @js.native
  open class ViewRenderer protected () extends SketchRenderer {
    def this(bridge: PlatformBridge) = this()
    
    def getDefaultGroupName(_props: Props): String = js.native
  }
}
