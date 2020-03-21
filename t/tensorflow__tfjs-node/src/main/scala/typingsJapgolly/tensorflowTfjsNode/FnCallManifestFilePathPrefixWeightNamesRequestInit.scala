package typingsJapgolly.tensorflowTfjsNode

import org.scalajs.dom.experimental.RequestInit
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallManifestFilePathPrefixWeightNamesRequestInit extends js.Object {
  def apply(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  def apply(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  def apply(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  def apply(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
}

