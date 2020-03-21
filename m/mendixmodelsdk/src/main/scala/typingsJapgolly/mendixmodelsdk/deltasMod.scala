package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.commonMod.common.IVoidCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas", JSImport.Namespace)
@js.native
object deltasMod extends js.Object {
  @js.native
  class DeltaManager protected ()
    extends typingsJapgolly.mendixmodelsdk.deltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaProcessor protected ()
    extends typingsJapgolly.mendixmodelsdk.deltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @js.native
  class DeltaSender protected ()
    extends typingsJapgolly.mendixmodelsdk.deltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
  
}

