package typingsJapgolly.three

import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import typingsJapgolly.three.srcThreeMod.Curve
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscRollerCoasterMod {
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterGeometry")
  @js.native
  open class RollerCoasterGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterLiftersGeometry")
  @js.native
  open class RollerCoasterLiftersGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "RollerCoasterShadowGeometry")
  @js.native
  open class RollerCoasterShadowGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "SkyGeometry")
  @js.native
  open class SkyGeometry protected () extends BufferGeometry {
    def this(curve: Curve[Vector3], divisions: Double) = this()
  }
  
  @JSImport("three/examples/jsm/misc/RollerCoaster", "TreesGeometry")
  @js.native
  open class TreesGeometry protected () extends BufferGeometry {
    def this(landscape: Mesh[
            typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry, 
            Material | js.Array[Material]
          ]) = this()
  }
}
