package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Cartographic
import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.EllipsoidGeodesic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreEllipsoidGeodesicMod {
  
  @JSImport("cesium/Source/Core/EllipsoidGeodesic", JSImport.Default)
  @js.native
  open class default () extends EllipsoidGeodesic {
    def this(start: Cartographic) = this()
    def this(start: Unit, end: Cartographic) = this()
    def this(start: Cartographic, end: Cartographic) = this()
    def this(start: Unit, end: Unit, ellipsoid: Ellipsoid) = this()
    def this(start: Unit, end: Cartographic, ellipsoid: Ellipsoid) = this()
    def this(start: Cartographic, end: Unit, ellipsoid: Ellipsoid) = this()
    def this(start: Cartographic, end: Cartographic, ellipsoid: Ellipsoid) = this()
  }
}
