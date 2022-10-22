package typingsJapgolly.datadogSketchesJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchStoreMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/store", "CollapsingHighestDenseStore")
  @js.native
  open class CollapsingHighestDenseStore protected ()
    extends typingsJapgolly.datadogSketchesJs.distDdsketchStoreCollapsingHighestDenseStoreMod.CollapsingHighestDenseStore {
    /**
      * Initialize a new CollapsingHighestDenseStore
      *
      * @param binLimit The maximum number of bins
      * @param chunkSize The number of bins to add each time the bins grow (default 128)
      */
    def this(binLimit: Double) = this()
    def this(binLimit: Double, chunkSize: Double) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/store", "CollapsingLowestDenseStore")
  @js.native
  open class CollapsingLowestDenseStore protected ()
    extends typingsJapgolly.datadogSketchesJs.distDdsketchStoreCollapsingLowestDenseStoreMod.CollapsingLowestDenseStore {
    /**
      * Initialize a new CollapsingLowestDenseStore
      *
      * @param binLimit The maximum number of bins
      * @param chunkSize The number of bins to add each time the bins grow (default 128)
      */
    def this(binLimit: Double) = this()
    def this(binLimit: Double, chunkSize: Double) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/store", "DenseStore")
  @js.native
  /**
    * Initialize a new DenseStore
    *
    * @param chunkSize The number of bins to add each time the bins grow (default 128)
    */
  open class DenseStore ()
    extends typingsJapgolly.datadogSketchesJs.distDdsketchStoreDenseStoreMod.DenseStore {
    def this(chunkSize: Double) = this()
  }
  /* static members */
  object DenseStore {
    
    @JSImport("@datadog/sketches-js/dist/ddsketch/store", "DenseStore")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromProto(): typingsJapgolly.datadogSketchesJs.distDdsketchStoreDenseStoreMod.DenseStore = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")().asInstanceOf[typingsJapgolly.datadogSketchesJs.distDdsketchStoreDenseStoreMod.DenseStore]
    inline def fromProto(
      protoStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStore */ Any
    ): typingsJapgolly.datadogSketchesJs.distDdsketchStoreDenseStoreMod.DenseStore = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")(protoStore.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.datadogSketchesJs.distDdsketchStoreDenseStoreMod.DenseStore]
  }
}
