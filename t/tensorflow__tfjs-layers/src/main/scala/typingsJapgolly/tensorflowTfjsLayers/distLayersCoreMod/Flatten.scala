package typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod

import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Flatten")
@js.native
open class Flatten () extends Layer {
  def this(args: FlattenLayerArgs) = this()
  
  /* private */ var dataFormat: Any = js.native
}
/* static members */
object Flatten {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Flatten")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Flatten.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
