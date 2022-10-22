package typingsJapgolly.dragControls.anon

import org.scalablytyped.runtime.Instantiable10
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.three.mod.Texture
import typingsJapgolly.three.srcConstantsMod.Mapping
import typingsJapgolly.three.srcConstantsMod.PixelFormat
import typingsJapgolly.three.srcConstantsMod.TextureDataType
import typingsJapgolly.three.srcConstantsMod.TextureEncoding
import typingsJapgolly.three.srcConstantsMod.TextureFilter
import typingsJapgolly.three.srcConstantsMod.Wrapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTexture
  extends StObject
     with Instantiable10[
      /* image */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement], 
      /* mapping */ js.UndefOr[Mapping], 
      /* wrapS */ js.UndefOr[Wrapping], 
      /* wrapT */ js.UndefOr[Wrapping], 
      /* magFilter */ js.UndefOr[TextureFilter], 
      /* minFilter */ js.UndefOr[TextureFilter], 
      /* format */ js.UndefOr[PixelFormat], 
      /* type */ js.UndefOr[TextureDataType], 
      /* anisotropy */ js.UndefOr[Double], 
      /* encoding */ js.UndefOr[TextureEncoding], 
      Texture
    ] {
  
  var DEFAULT_IMAGE: Any = js.native
  
  var DEFAULT_MAPPING: Any = js.native
}
