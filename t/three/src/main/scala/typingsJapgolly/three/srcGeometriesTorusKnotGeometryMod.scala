package typingsJapgolly.three

import typingsJapgolly.three.anon.P
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesTorusKnotGeometryMod {
  
  @JSImport("three/src/geometries/TorusKnotGeometry", "TorusKnotGeometry")
  @js.native
  open class TorusKnotGeometry protected () extends BufferGeometry {
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
    
    var parameters: P = js.native
  }
  /* static members */
  object TorusKnotGeometry {
    
    @JSImport("three/src/geometries/TorusKnotGeometry", "TorusKnotGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): TorusKnotGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[TorusKnotGeometry]
  }
}
