package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.CompositeEntityCollection
import typingsJapgolly.cesium.mod.DataSource
import typingsJapgolly.cesium.mod.EntityCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesCompositeEntityCollectionMod {
  
  @JSImport("cesium/Source/DataSources/CompositeEntityCollection", JSImport.Default)
  @js.native
  open class default () extends CompositeEntityCollection {
    def this(collections: js.Array[EntityCollection]) = this()
    def this(collections: js.Array[EntityCollection], owner: CompositeEntityCollection) = this()
    def this(collections: js.Array[EntityCollection], owner: DataSource) = this()
    def this(collections: Unit, owner: CompositeEntityCollection) = this()
    def this(collections: Unit, owner: DataSource) = this()
  }
}
