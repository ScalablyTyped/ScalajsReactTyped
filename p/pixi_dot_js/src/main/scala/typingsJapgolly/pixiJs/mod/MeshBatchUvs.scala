package typingsJapgolly.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "MeshBatchUvs")
@js.native
open class MeshBatchUvs protected ()
  extends typingsJapgolly.pixiMesh.mod.MeshBatchUvs {
  /**
    * @param uvBuffer - Buffer with normalized uv's
    * @param uvMatrix - Material UV matrix
    */
  def this(
    uvBuffer: typingsJapgolly.pixiCore.mod.Buffer,
    uvMatrix: typingsJapgolly.pixiCore.mod.TextureMatrix
  ) = this()
}
