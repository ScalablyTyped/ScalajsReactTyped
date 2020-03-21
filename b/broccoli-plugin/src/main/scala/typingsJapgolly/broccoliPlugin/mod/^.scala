package typingsJapgolly.broccoliPlugin.mod

import typingsJapgolly.broccoliNodeApi.mod.FeatureSet
import typingsJapgolly.broccoliNodeApi.mod.InputNode
import typingsJapgolly.broccoliNodeApi.mod.TransformNodeInfo
import typingsJapgolly.broccoliPlugin.interfacesMod.PluginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("broccoli-plugin", JSImport.Namespace)
@js.native
class ^ protected () extends Plugin {
  def this(inputNodes: js.Array[InputNode]) = this()
  def this(inputNodes: js.Array[InputNode], options: PluginOptions) = this()
  /**
    The node's feature set, indicating the API version
    */
  /* CompleteClass */
  override var __broccoliFeatures__ : FeatureSet = js.native
  /**
    A function to be called by the Builder, taking the Builder's feature set as
    an argument and returning a `NodeInfo` object
    */
  /* CompleteClass */
  override def __broccoliGetInfo__(builderFeatures: FeatureSet): TransformNodeInfo = js.native
}

