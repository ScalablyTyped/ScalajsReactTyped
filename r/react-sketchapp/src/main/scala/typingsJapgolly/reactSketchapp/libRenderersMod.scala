package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.libRenderersArtboardRendererMod.ArtboardRenderer
import typingsJapgolly.reactSketchapp.libRenderersImageRendererMod.ImageRenderer
import typingsJapgolly.reactSketchapp.libRenderersSvgRendererMod.SvgRenderer
import typingsJapgolly.reactSketchapp.libRenderersSymbolInstanceRendererMod.SymbolInstanceRenderer
import typingsJapgolly.reactSketchapp.libRenderersSymbolMasterRendererMod.SymbolMasterRenderer
import typingsJapgolly.reactSketchapp.libRenderersTextRendererMod.TextRenderer
import typingsJapgolly.reactSketchapp.libRenderersViewRendererMod.ViewRenderer
import typingsJapgolly.reactSketchapp.libTypesMod.PlatformBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderersMod {
  
  @JSImport("react-sketchapp/lib/renderers", "sketch_artboard")
  @js.native
  open class sketchArtboard protected () extends ArtboardRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/renderers", "sketch_image")
  @js.native
  open class sketchImage protected () extends ImageRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/renderers", "sketch_svg")
  @js.native
  open class sketchSvg protected () extends SvgRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/renderers", "sketch_symbolinstance")
  @js.native
  open class sketchSymbolinstance protected () extends SymbolInstanceRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/renderers", "sketch_symbolmaster")
  @js.native
  open class sketchSymbolmaster protected () extends SymbolMasterRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/renderers", "sketch_text")
  @js.native
  open class sketchText protected () extends TextRenderer {
    def this(bridge: PlatformBridge) = this()
  }
  
  @JSImport("react-sketchapp/lib/renderers", "sketch_view")
  @js.native
  open class sketchView protected () extends ViewRenderer {
    def this(bridge: PlatformBridge) = this()
  }
}
