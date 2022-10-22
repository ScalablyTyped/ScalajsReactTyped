package typingsJapgolly.three

import typingsJapgolly.three.anon.Segments
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesCircleGeometryMod {
  
  @JSImport("three/src/geometries/CircleGeometry", "CircleGeometry")
  @js.native
  /**
    * @param [radius=1]
    * @param [segments=8]
    * @param [thetaStart=0]
    * @param [thetaLength=Math.PI * 2]
    */
  open class CircleGeometry () extends BufferGeometry {
    def this(radius: Double) = this()
    def this(radius: Double, segments: Double) = this()
    def this(radius: Unit, segments: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Double, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Double, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Unit, segments: Double, thetaStart: Unit, thetaLength: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Double, thetaLength: Double) = this()
    def this(radius: Unit, segments: Unit, thetaStart: Unit, thetaLength: Double) = this()
    
    var parameters: Segments = js.native
  }
  /* static members */
  object CircleGeometry {
    
    @JSImport("three/src/geometries/CircleGeometry", "CircleGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): CircleGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[CircleGeometry]
  }
}
