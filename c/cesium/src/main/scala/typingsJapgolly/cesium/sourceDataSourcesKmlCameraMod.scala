package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.HeadingPitchRoll
import typingsJapgolly.cesium.mod.KmlCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesKmlCameraMod {
  
  @JSImport("cesium/Source/DataSources/KmlCamera", JSImport.Default)
  @js.native
  open class default protected () extends KmlCamera {
    def this(position: Cartesian3, headingPitchRoll: HeadingPitchRoll) = this()
  }
}
