package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersBoxHelperMod {
  
  @JSImport("three/src/helpers/BoxHelper", "BoxHelper")
  @js.native
  open class BoxHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    /**
      * @param object
      * @param [color=0xffff00]
      */
    def this(`object`: Object3D[Event]) = this()
    def this(`object`: Object3D[Event], color: ColorRepresentation) = this()
    
    def setFromObject(`object`: Object3D[Event]): this.type = js.native
    
    def update(): Unit = js.native
    def update(`object`: Object3D[Event]): Unit = js.native
  }
}
