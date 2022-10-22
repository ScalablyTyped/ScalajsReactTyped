package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.EntityCollection
import typingsJapgolly.cesium.mod.PolylineVisualizer
import typingsJapgolly.cesium.mod.PrimitiveCollection
import typingsJapgolly.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesPolylineVisualizerMod {
  
  @JSImport("cesium/Source/DataSources/PolylineVisualizer", JSImport.Default)
  @js.native
  open class default protected () extends PolylineVisualizer {
    def this(scene: Scene, entityCollection: EntityCollection) = this()
    def this(scene: Scene, entityCollection: EntityCollection, primitives: PrimitiveCollection) = this()
    def this(
      scene: Scene,
      entityCollection: EntityCollection,
      primitives: Unit,
      groundPrimitives: PrimitiveCollection
    ) = this()
    def this(
      scene: Scene,
      entityCollection: EntityCollection,
      primitives: PrimitiveCollection,
      groundPrimitives: PrimitiveCollection
    ) = this()
  }
}
