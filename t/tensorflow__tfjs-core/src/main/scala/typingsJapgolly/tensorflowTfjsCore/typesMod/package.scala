package typingsJapgolly.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type LoadHandler = js.Function0[js.Promise[typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifacts]]
  type OnProgressCallback = js.Function1[/* fraction */ scala.Double, scala.Unit]
  type SaveHandler = js.Function1[
    /* modelArtifact */ typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifacts, 
    js.Promise[typingsJapgolly.tensorflowTfjsCore.typesMod.SaveResult]
  ]
  type WeightsManifestConfig = js.Array[typingsJapgolly.tensorflowTfjsCore.typesMod.WeightsManifestGroupConfig]
}
