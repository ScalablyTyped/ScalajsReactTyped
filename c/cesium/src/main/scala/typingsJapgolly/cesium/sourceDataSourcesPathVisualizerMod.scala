package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.EntityCollection
import typingsJapgolly.cesium.mod.PathVisualizer
import typingsJapgolly.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesPathVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/PathVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends PathVisualizer {
    def this(scene: Scene, entityCollection: EntityCollection) = this()
  }
}
