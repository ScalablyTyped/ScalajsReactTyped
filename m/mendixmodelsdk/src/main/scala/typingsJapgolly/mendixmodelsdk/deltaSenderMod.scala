package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.commonMod.common.IVoidCallback
import typingsJapgolly.mendixmodelsdk.deltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaSender", JSImport.Namespace)
@js.native
object deltaSenderMod extends js.Object {
  @js.native
  class DeltaSender protected () extends js.Object {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
    var errorCallback: js.Any = js.native
    var flushCallback: js.Any = js.native
    var hasError: js.Any = js.native
    var isClosing: Boolean = js.native
    var model: js.Any = js.native
    var pending: Boolean = js.native
    var processQueue: js.Any = js.native
    var queue: js.Any = js.native
    var sendDeltas: js.Any = js.native
    def closeConnection(): Unit = js.native
    def flush(): Unit = js.native
    def scheduleDeltas(deltas: js.Array[Delta]): Unit = js.native
  }
  
}

