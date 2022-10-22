package typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.AppServiceState")
@js.native
open class AppServiceState protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AppServiceState {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.AppServiceState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.AppServiceState.Consumable")
  @js.native
  def Consumable: AppServiceState = js.native
  inline def Consumable_=(x: AppServiceState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumable")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.AppServiceState.Deprecated")
  @js.native
  def Deprecated: AppServiceState = js.native
  inline def Deprecated_=(x: AppServiceState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Deprecated")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.AppServiceState.Draft")
  @js.native
  def Draft: AppServiceState = js.native
  inline def Draft_=(x: AppServiceState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Draft")(x.asInstanceOf[js.Any])
}
