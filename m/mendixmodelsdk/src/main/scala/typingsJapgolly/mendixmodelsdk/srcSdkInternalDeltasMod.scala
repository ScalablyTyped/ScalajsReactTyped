package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IVoidCallback
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalDeltasMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaManager")
  @js.native
  open class DeltaManager protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltaManagerMod.DeltaManager {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaProcessor")
  @js.native
  open class DeltaProcessor protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltaProcessorMod.DeltaProcessor {
    def this(model: AbstractModel) = this()
  }
  
  @JSImport("mendixmodelsdk/src/sdk/internal/deltas", "DeltaSender")
  @js.native
  open class DeltaSender protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalDeltasDeltaSenderMod.DeltaSender {
    def this(model: AbstractModel, flushCallback: IVoidCallback, errorCallback: IErrorCallback) = this()
  }
}
