package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPointsMod {
  
  @JSImport("three/src/objects/Points", "Points")
  @js.native
  /**
    * @param geometry An instance of BufferGeometry.
    * @param material An instance of Material (optional).
    */
  open class Points[TGeometry /* <: BufferGeometry */, TMaterial /* <: Material | js.Array[Material] */] () extends Object3D[Event] {
    def this(geometry: TGeometry) = this()
    def this(geometry: TGeometry, material: TMaterial) = this()
    def this(geometry: Unit, material: TMaterial) = this()
    
    /**
      * An instance of BufferGeometry, where each vertex designates the position of a particle in the system.
      */
    var geometry: TGeometry = js.native
    
    val isPoints: `true` = js.native
    
    /**
      * An instance of Material, defining the object's appearance. Default is a PointsMaterial with randomised colour.
      */
    var material: TMaterial = js.native
    
    var morphTargetDictionary: js.UndefOr[StringDictionary[Double]] = js.native
    
    var morphTargetInfluences: js.UndefOr[js.Array[Double]] = js.native
    
    @JSName("type")
    var type_Points: typingsJapgolly.three.threeStrings.Points = js.native
    
    def updateMorphTargets(): Unit = js.native
  }
}
