package typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod

import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
@js.native
open class StackedRNNCells protected () extends RNNCell {
  def this(args: StackedRNNCellsArgs) = this()
  
  /* protected */ var cells: js.Array[RNNCell] = js.native
  
  @JSName("stateSize")
  def stateSize_MStackedRNNCells: js.Array[Double] = js.native
}
/* static members */
object StackedRNNCells {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  
  /** @nocollapse */
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
}
