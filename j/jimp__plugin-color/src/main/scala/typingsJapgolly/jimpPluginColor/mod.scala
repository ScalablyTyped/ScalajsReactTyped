package typingsJapgolly.jimpPluginColor

import typingsJapgolly.jimpCore.typesEtcMod.ImageCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Color]
  
  @js.native
  trait Color extends StObject {
    
    def brightness(`val`: Double): this.type = js.native
    def brightness(`val`: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def color(actions: js.Array[ColorAction]): this.type = js.native
    def color(actions: js.Array[ColorAction], cb: ImageCallback[this.type]): this.type = js.native
    
    def colour(actions: js.Array[ColorAction]): this.type = js.native
    def colour(actions: js.Array[ColorAction], cb: ImageCallback[this.type]): this.type = js.native
    
    def contrast(`val`: Double): this.type = js.native
    def contrast(`val`: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def convolute(kernel: js.Array[js.Array[Double]]): this.type = js.native
    def convolute(kernel: js.Array[js.Array[Double]], cb: ImageCallback[this.type]): this.type = js.native
    def convolute(kernel: js.Array[js.Array[Double]], x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def convolute(
      kernel: js.Array[js.Array[Double]],
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    
    def convolution(kernel: js.Array[js.Array[Double]]): this.type = js.native
    def convolution(kernel: js.Array[js.Array[Double]], cb: ImageCallback[this.type]): this.type = js.native
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String): this.type = js.native
    def convolution[T](kernel: js.Array[js.Array[Double]], edgeHandling: String, cb: ImageCallback[this.type]): this.type = js.native
    
    def fade(f: Double): this.type = js.native
    def fade(f: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def grayscale(): this.type = js.native
    def grayscale(cb: ImageCallback[this.type]): this.type = js.native
    
    def greyscale(): this.type = js.native
    def greyscale(cb: ImageCallback[this.type]): this.type = js.native
    
    def opacity(f: Double): this.type = js.native
    def opacity(f: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def opaque(): this.type = js.native
    def opaque(cb: ImageCallback[this.type]): this.type = js.native
    
    def pixelate(size: Double): this.type = js.native
    def pixelate(size: Double, cb: ImageCallback[this.type]): this.type = js.native
    def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def pixelate(size: Double, x: Double, y: Double, w: Double, h: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def posterize(n: Double): this.type = js.native
    def posterize(n: Double, cb: ImageCallback[this.type]): this.type = js.native
    
    def sepia(): this.type = js.native
    def sepia(cb: ImageCallback[this.type]): this.type = js.native
  }
  
  trait ColorAction extends StObject {
    
    @JSName("apply")
    var apply: ColorActionName
    
    var params: Any
  }
  object ColorAction {
    
    inline def apply(apply: ColorActionName, params: Any): ColorAction = {
      val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorAction]
    }
    
    extension [Self <: ColorAction](x: Self) {
      
      inline def setApply(value: ColorActionName): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.mix
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.tint
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.shade
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.xor
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.red
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.green
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.blue
    - typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.hue
  */
  trait ColorActionName extends StObject
  object ColorActionName {
    
    inline def blue: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.blue = "blue".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.blue]
    
    inline def green: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.green = "green".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.green]
    
    inline def hue: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.hue = "hue".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.hue]
    
    inline def mix: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.mix = "mix".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.mix]
    
    inline def red: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.red = "red".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.red]
    
    inline def shade: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.shade = "shade".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.shade]
    
    inline def tint: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.tint = "tint".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.tint]
    
    inline def xor: typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.xor = "xor".asInstanceOf[typingsJapgolly.jimpPluginColor.jimpPluginColorStrings.xor]
  }
}
