package typingsJapgolly.parcelCore

import typingsJapgolly.parcelCore.anon.PartialFarmOptions
import typingsJapgolly.parcelTypes.mod.AsyncSubscription
import typingsJapgolly.parcelTypes.mod.BuildEvent
import typingsJapgolly.parcelTypes.mod.BuildSuccessEvent
import typingsJapgolly.parcelTypes.mod.InitialParcelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@parcel/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@parcel/core", JSImport.Default)
  @js.native
  open class default protected () extends Parcel {
    def this(options: InitialParcelOptions) = this()
  }
  
  @JSImport("@parcel/core", "Parcel")
  @js.native
  open class Parcel protected () extends StObject {
    def this(options: InitialParcelOptions) = this()
    
    def run(): js.Promise[BuildSuccessEvent] = js.native
    
    def watch(): js.Promise[AsyncSubscription] = js.native
    def watch(
      cb: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* buildEvent */ js.UndefOr[BuildEvent], Any]
    ): js.Promise[AsyncSubscription] = js.native
  }
  
  inline def createWorkerFarm(): typingsJapgolly.parcelWorkers.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkerFarm")().asInstanceOf[typingsJapgolly.parcelWorkers.mod.default]
  inline def createWorkerFarm(options: PartialFarmOptions): typingsJapgolly.parcelWorkers.mod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkerFarm")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.parcelWorkers.mod.default]
}
