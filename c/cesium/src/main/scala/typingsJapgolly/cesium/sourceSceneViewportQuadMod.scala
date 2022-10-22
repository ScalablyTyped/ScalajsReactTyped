package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.BoundingRectangle
import typingsJapgolly.cesium.mod.Material
import typingsJapgolly.cesium.mod.ViewportQuad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneViewportQuadMod {
  
  @JSImport("cesium/Source/Scene/ViewportQuad", JSImport.Default)
  @js.native
  open class default () extends ViewportQuad {
    def this(rectangle: BoundingRectangle) = this()
    def this(rectangle: Unit, material: Material) = this()
    def this(rectangle: BoundingRectangle, material: Material) = this()
  }
}
