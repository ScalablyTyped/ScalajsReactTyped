package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "Face3")
@js.native
class Face3 protected ()
  extends typingsJapgolly.wonderJs.face3Mod.Face3 {
  def this(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typingsJapgolly.wonderJs.vector3Mod.Vector3,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
  ) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "Face3")
@js.native
object Face3 extends js.Object {
  def create(aIndex: Double, bIndex: Double, cIndex: Double): typingsJapgolly.wonderJs.face3Mod.Face3 = js.native
  def create(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typingsJapgolly.wonderJs.vector3Mod.Vector3
  ): typingsJapgolly.wonderJs.face3Mod.Face3 = js.native
  def create(
    aIndex: Double,
    bIndex: Double,
    cIndex: Double,
    faceNormal: typingsJapgolly.wonderJs.vector3Mod.Vector3,
    vertexNormals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Vector3> */ js.Any
  ): typingsJapgolly.wonderJs.face3Mod.Face3 = js.native
}

