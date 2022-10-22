package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.distEngineContainerMod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsLayerUtilsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/utils/layer_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printSummary(model: Container): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def printSummary(model: Container, lineLength: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printSummary(model: Container, lineLength: Double, positions: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printSummary(
    model: Container,
    lineLength: Double,
    positions: js.Array[Double],
    printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], printFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printSummary(
    model: Container,
    lineLength: Double,
    positions: Unit,
    printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], printFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printSummary(model: Container, lineLength: Unit, positions: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printSummary(
    model: Container,
    lineLength: Unit,
    positions: js.Array[Double],
    printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], printFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def printSummary(
    model: Container,
    lineLength: Unit,
    positions: Unit,
    printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printSummary")(model.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], printFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
