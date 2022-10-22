package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmCsmCsmMod.CSM
import typingsJapgolly.three.srcThreeMod.Box3Helper
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import typingsJapgolly.three.srcThreeMod.Group
import typingsJapgolly.three.srcThreeMod.LineBasicMaterial
import typingsJapgolly.three.srcThreeMod.LineSegments
import typingsJapgolly.three.srcThreeMod.Mesh
import typingsJapgolly.three.srcThreeMod.MeshBasicMaterial
import typingsJapgolly.three.srcThreeMod.PlaneGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmCsmCsmhelperMod {
  
  @JSImport("three/examples/jsm/csm/CSMHelper", "CSMHelper")
  @js.native
  open class CSMHelper[TCSM /* <: CSM */] protected () extends Group {
    def this(csm: TCSM) = this()
    
    var cascadeLines: js.Array[Box3Helper] = js.native
    
    var cascadePlanes: js.Array[Mesh[PlaneGeometry, MeshBasicMaterial]] = js.native
    
    var csm: TCSM = js.native
    
    var displayFrustum: Boolean = js.native
    
    var displayPlanes: Boolean = js.native
    
    var displayShadowBounds: Boolean = js.native
    
    var frustumLines: LineSegments[BufferGeometry, LineBasicMaterial] = js.native
    
    var shadowLines: js.Array[Box3Helper] = js.native
    
    def update(): Unit = js.native
    
    def updateVisibility(): Unit = js.native
  }
}
