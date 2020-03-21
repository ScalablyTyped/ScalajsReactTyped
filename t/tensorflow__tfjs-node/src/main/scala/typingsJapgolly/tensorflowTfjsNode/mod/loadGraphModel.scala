package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.typesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "loadGraphModel")
@js.native
object loadGraphModel extends js.Object {
  def apply(modelUrl: String): js.Promise[typingsJapgolly.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: String, options: LoadOptions): js.Promise[typingsJapgolly.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: IOHandler): js.Promise[typingsJapgolly.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: IOHandler, options: LoadOptions): js.Promise[typingsJapgolly.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
}

