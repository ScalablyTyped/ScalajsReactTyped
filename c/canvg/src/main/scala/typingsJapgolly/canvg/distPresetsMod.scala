package typingsJapgolly.canvg

import typingsJapgolly.canvg.anon.CreateCanvas
import typingsJapgolly.canvg.anon.CreateImage
import typingsJapgolly.canvg.distPresetsNodeMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPresetsMod {
  
  @JSImport("canvg/dist/presets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def node(hasDOMParserCanvasFetch: IConfig): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("node")(hasDOMParserCanvasFetch.asInstanceOf[js.Any]).asInstanceOf[CreateCanvas]
  
  inline def offscreen(): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")().asInstanceOf[CreateImage]
  inline def offscreen(hasDOMParserFallback: typingsJapgolly.canvg.distPresetsOffscreenMod.IConfig): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")(hasDOMParserFallback.asInstanceOf[js.Any]).asInstanceOf[CreateImage]
}
