package typingsJapgolly.next

import typingsJapgolly.next.anon.Quality
import typingsJapgolly.next.distServerLibSquooshImageDataMod.default
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibSquooshImplMod {
  
  @JSImport("next/dist/server/lib/squoosh/impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBuffer(_buffer: js.typedarray.Uint8Array): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBuffer")(_buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  inline def decodeBuffer(_buffer: Buffer): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBuffer")(_buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  
  inline def encodeAvif(image: default, hasQuality: Quality): js.Promise[Buffer | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAvif")(image.asInstanceOf[js.Any], hasQuality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def encodeJpeg(image: default, hasQuality: Quality): js.Promise[Buffer | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeJpeg")(image.asInstanceOf[js.Any], hasQuality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def encodePng(image: default): js.Promise[Buffer | js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePng")(image.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def encodeWebp(image: default, hasQuality: Quality): js.Promise[Buffer | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWebp")(image.asInstanceOf[js.Any], hasQuality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | js.typedarray.Uint8Array]]
  
  inline def resize(hasImageWidthHeight: ResizeOpts): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")(hasImageWidthHeight.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  
  inline def rotate(image: default, numRotations: Double): js.Promise[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(image.asInstanceOf[js.Any], numRotations.asInstanceOf[js.Any])).asInstanceOf[js.Promise[default]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.anon.widthnumberheightneverund
    - typingsJapgolly.next.anon.heightnumberwidthneverund
    - typingsJapgolly.next.anon.heightnumberwidthnumberim
  */
  trait ResizeOpts extends StObject
  object ResizeOpts {
    
    inline def heightnumberwidthneverund(height: Double, image: default): typingsJapgolly.next.anon.heightnumberwidthneverund = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.heightnumberwidthneverund]
    }
    
    inline def heightnumberwidthnumberim(height: Double, image: default, width: Double): typingsJapgolly.next.anon.heightnumberwidthnumberim = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.heightnumberwidthnumberim]
    }
    
    inline def widthnumberheightneverund(image: default, width: Double): typingsJapgolly.next.anon.widthnumberheightneverund = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.next.anon.widthnumberheightneverund]
    }
  }
}
