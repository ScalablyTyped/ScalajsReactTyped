package typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod

import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Masking")
@js.native
open class Masking () extends Layer {
  def this(args: MaskingArgs) = this()
  
  var maskValue: Double = js.native
}
/* static members */
object Masking {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Masking")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Masking.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
