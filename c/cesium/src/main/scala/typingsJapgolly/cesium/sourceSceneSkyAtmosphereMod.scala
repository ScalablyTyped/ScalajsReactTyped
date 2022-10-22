package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.SkyAtmosphere
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneSkyAtmosphereMod {
  
  @JSImport("cesium/Source/Scene/SkyAtmosphere", JSImport.Default)
  @js.native
  open class default () extends SkyAtmosphere {
    def this(ellipsoid: Ellipsoid) = this()
  }
}
