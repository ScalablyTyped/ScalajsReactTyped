package typingsJapgolly.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.TorusKnotGeometry")
@js.native
open class TorusKnotGeometry protected ()
  extends typingsJapgolly.three.mod.TorusKnotGeometry {
  /**
    * @param [radius=1]
    * @param [tube=0.4]
    * @param [radialSegments=64]
    * @param [tubularSegments=8]
    * @param [p=2]
    * @param [q=3]
    */
  def this(
    radius: js.UndefOr[Double],
    tube: js.UndefOr[Double],
    tubularSegments: js.UndefOr[Double],
    radialSegments: js.UndefOr[Double],
    p: js.UndefOr[Double],
    q: js.UndefOr[Double]
  ) = this()
}
/* static members */
object TorusKnotGeometry {
  
  @JSGlobal("THREE.TorusKnotGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typingsJapgolly.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcGeometriesTorusKnotGeometryMod.TorusKnotGeometry]
}
