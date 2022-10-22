package typingsJapgolly.blackEngine.mod

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Texture")
@js.native
open class Texture protected ()
  extends typingsJapgolly.blackEngine.texturesTextureMod.Texture {
  def this(
    nativeElement: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
    region: js.UndefOr[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle],
    untrimmedRegion: js.UndefOr[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle],
    scale: js.UndefOr[Double],
    registrationPoint: js.UndefOr[typingsJapgolly.blackEngine.geomVectorMod.Vector],
    slice9borders: js.UndefOr[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle]
  ) = this()
}
/* static members */
object Texture {
  
  @JSImport("black-engine", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBase64String(string: String): typingsJapgolly.blackEngine.texturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(string.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture]
  
  inline def fromCanvas(canvas: HTMLCanvasElement): typingsJapgolly.blackEngine.texturesTextureMod.Texture | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture | Null]
  
  inline def fromCanvasAsImage(canvas: Element): typingsJapgolly.blackEngine.texturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture]
  inline def fromCanvasAsImage(canvas: Element, `type`: String): typingsJapgolly.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture]
  inline def fromCanvasAsImage(canvas: Element, `type`: String, quality: Double): typingsJapgolly.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture]
  inline def fromCanvasAsImage(canvas: Element, `type`: Unit, quality: Double): typingsJapgolly.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.texturesTextureMod.Texture]
  
  inline def getScaleFactorFromName(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleFactorFromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeScaleFactorFromName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeScaleFactorFromName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
