package typingsJapgolly.mendixmodelsdk.mod.microflows

import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ErrorHandlingType")
@js.native
open class ErrorHandlingType protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.microflows.ErrorHandlingType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ErrorHandlingType {
  
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Abort")
  @js.native
  def Abort: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType = js.native
  inline def Abort_=(x: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Abort")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Continue")
  @js.native
  def Continue: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType = js.native
  inline def Continue_=(x: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Continue")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Custom")
  @js.native
  def Custom: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.CustomWithoutRollBack")
  @js.native
  def CustomWithoutRollBack: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType = js.native
  inline def CustomWithoutRollBack_=(x: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomWithoutRollBack")(x.asInstanceOf[js.Any])
  
  inline def Custom_=(x: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ErrorHandlingType.Rollback")
  @js.native
  def Rollback: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType = js.native
  inline def Rollback_=(x: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ErrorHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rollback")(x.asInstanceOf[js.Any])
}
