package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.EntityCollection
import typingsJapgolly.cesium.mod.ModelVisualizer
import typingsJapgolly.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesModelVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/ModelVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends ModelVisualizer {
    def this(scene: Scene, entityCollection: EntityCollection) = this()
  }
}
