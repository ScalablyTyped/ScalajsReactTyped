package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Ellipsoid
import typingsJapgolly.cesium.mod.Globe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneGlobeMod {
  
  @JSImport("cesium/Source/Scene/Globe", JSImport.Default)
  @js.native
  open class default () extends Globe {
    def this(ellipsoid: Ellipsoid) = this()
  }
}
