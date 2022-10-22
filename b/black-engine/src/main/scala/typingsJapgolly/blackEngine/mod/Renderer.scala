package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Renderer")
@js.native
open class Renderer ()
  extends typingsJapgolly.blackEngine.driversRendererMod.Renderer
/* static members */
object Renderer {
  
  @JSImport("black-engine", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Renderer.__colorCache")
  @js.native
  val colorCache: typingsJapgolly.blackEngine.utilsMapMapMod.MapMap = js.native
  
  @JSImport("black-engine", "Renderer.__dirty")
  @js.native
  val dirty: Boolean = js.native
  
  inline def getColoredTexture(texture: typingsJapgolly.blackEngine.texturesTextureMod.Texture): typingsJapgolly.blackEngine.texturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("getColoredTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture]
  inline def getColoredTexture(texture: typingsJapgolly.blackEngine.texturesTextureMod.Texture, color: Double): typingsJapgolly.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("getColoredTexture")(texture.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture]
  
  @JSImport("black-engine", "Renderer.skipUnchangedFrames")
  @js.native
  val skipUnchangedFrames: Boolean = js.native
}
