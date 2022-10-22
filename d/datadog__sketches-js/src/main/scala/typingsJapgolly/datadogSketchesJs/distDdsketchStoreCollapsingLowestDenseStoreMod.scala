package typingsJapgolly.datadogSketchesJs

import typingsJapgolly.datadogSketchesJs.distDdsketchStoreDenseStoreMod.DenseStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchStoreCollapsingLowestDenseStoreMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/store/CollapsingLowestDenseStore", "CollapsingLowestDenseStore")
  @js.native
  open class CollapsingLowestDenseStore protected () extends DenseStore {
    /**
      * Initialize a new CollapsingLowestDenseStore
      *
      * @param binLimit The maximum number of bins
      * @param chunkSize The number of bins to add each time the bins grow (default 128)
      */
    def this(binLimit: Double) = this()
    def this(binLimit: Double, chunkSize: Double) = this()
    
    /** The maximum number of bins */
    var binLimit: Double = js.native
    
    /**
      * Directly clone the contents of the parameter `store` into this store
      *
      * @param store The store to be copied into the caller store
      */
    def copy(store: CollapsingLowestDenseStore): Unit = js.native
    
    /** Whether the store has been collapsed to make room for additional keys */
    var isCollapsed: Boolean = js.native
    
    /**
      * Merge the contents of the parameter `store` into this store
      *
      * @param store The store to merge into the caller store
      */
    def merge(store: CollapsingLowestDenseStore): Unit = js.native
  }
}
