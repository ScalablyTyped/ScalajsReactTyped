package typingsJapgolly.broccoliPlugin.readCompatMod

import typingsJapgolly.broccoliNodeApi.mod.CallbackObject
import typingsJapgolly.broccoliNodeApi.mod.InputNode
import typingsJapgolly.broccoliNodeApi.mod.TransformNodeInfo
import typingsJapgolly.broccoliPlugin.interfacesMod.MapSeriesIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("broccoli-plugin/dist/read_compat", JSImport.Default)
@js.native
class default protected () extends ReadCompat {
  def this(plugin: PluginWithDescription) = this()
  /* CompleteClass */
  override var _priorBuildInputNodeOutputPaths: js.Any = js.native
  /* CompleteClass */
  override var callbackObject: CallbackObject = js.native
  /* CompleteClass */
  override var inputBasePath: String = js.native
  /* CompleteClass */
  override var inputPaths: js.Array[String] = js.native
  /* CompleteClass */
  override var outputPath: String = js.native
  /* CompleteClass */
  override var pluginInterface: TransformNodeInfo = js.native
  /* CompleteClass */
  override def cleanup(): Unit = js.native
  /* CompleteClass */
  override def read(readTree: MapSeriesIterator[InputNode]): js.Promise[String] = js.native
}

