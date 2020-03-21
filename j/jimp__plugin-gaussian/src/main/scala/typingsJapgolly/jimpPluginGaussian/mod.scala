package typingsJapgolly.jimpPluginGaussian

import typingsJapgolly.jimpCore.etcMod.ImageCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/plugin-gaussian", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Gaussian extends js.Object {
    def gaussian(r: Double): this.type = js.native
    def gaussian(r: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
  
  def default(): Gaussian = js.native
}

