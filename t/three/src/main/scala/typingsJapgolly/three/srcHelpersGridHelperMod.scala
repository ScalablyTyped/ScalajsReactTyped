package typingsJapgolly.three

import typingsJapgolly.three.srcCoreBufferGeometryMod.BufferGeometry
import typingsJapgolly.three.srcMaterialsMaterialMod.Material
import typingsJapgolly.three.srcObjectsLineSegmentsMod.LineSegments
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersGridHelperMod {
  
  @JSImport("three/src/helpers/GridHelper", "GridHelper")
  @js.native
  /**
    * @param [size=10]
    * @param [divisions=10]
    * @param [color1=0x444444]
    * @param [color2=0x888888]
    */
  open class GridHelper ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(size: Double) = this()
    def this(size: Double, divisions: Double) = this()
    def this(size: Unit, divisions: Double) = this()
    def this(size: Double, divisions: Double, color1: ColorRepresentation) = this()
    def this(size: Double, divisions: Unit, color1: ColorRepresentation) = this()
    def this(size: Unit, divisions: Double, color1: ColorRepresentation) = this()
    def this(size: Unit, divisions: Unit, color1: ColorRepresentation) = this()
    def this(size: Double, divisions: Double, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Double, divisions: Double, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    def this(size: Double, divisions: Unit, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Double, divisions: Unit, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Double, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Double, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Unit, color1: Unit, color2: ColorRepresentation) = this()
    def this(size: Unit, divisions: Unit, color1: ColorRepresentation, color2: ColorRepresentation) = this()
    
    /**
      * @deprecated Colors should be specified in the constructor.
      */
    def setColors(): Unit = js.native
    def setColors(color1: Unit, color2: ColorRepresentation): Unit = js.native
    def setColors(color1: ColorRepresentation): Unit = js.native
    def setColors(color1: ColorRepresentation, color2: ColorRepresentation): Unit = js.native
  }
}
