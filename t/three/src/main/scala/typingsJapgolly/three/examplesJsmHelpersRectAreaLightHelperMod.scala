package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcThreeMod.Line
import typingsJapgolly.three.srcThreeMod.RectAreaLight
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersRectAreaLightHelperMod {
  
  @JSImport("three/examples/jsm/helpers/RectAreaLightHelper", "RectAreaLightHelper")
  @js.native
  open class RectAreaLightHelper protected ()
    extends Line[BufferGeometry, Material | js.Array[Material]] {
    def this(light: RectAreaLight) = this()
    def this(light: RectAreaLight, color: ColorRepresentation) = this()
    
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    def dispose(): Unit = js.native
    
    var light: RectAreaLight = js.native
  }
}
