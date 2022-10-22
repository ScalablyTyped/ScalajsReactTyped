package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.CompositeEntityCollection
import typingsJapgolly.cesium.mod.DataSource
import typingsJapgolly.cesium.mod.EntityCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesEntityCollectionMod {
  
  @JSImport("cesium/Source/DataSources/EntityCollection", JSImport.Default)
  @js.native
  open class default () extends EntityCollection {
    def this(owner: CompositeEntityCollection) = this()
    def this(owner: DataSource) = this()
  }
}
