package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.PolygonHierarchy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCorePolygonHierarchyMod {
  
  @JSImport("cesium/Source/Core/PolygonHierarchy", JSImport.Default)
  @js.native
  open class default () extends PolygonHierarchy {
    def this(positions: js.Array[Cartesian3]) = this()
    def this(positions: js.Array[Cartesian3], holes: js.Array[PolygonHierarchy]) = this()
    def this(positions: Unit, holes: js.Array[PolygonHierarchy]) = this()
  }
}
