package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ShowMessageType")
@js.native
open class ShowMessageType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ShowMessageType {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ShowMessageType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ShowMessageType.Error")
  @js.native
  def Error: ShowMessageType = js.native
  inline def Error_=(x: ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ShowMessageType.Information")
  @js.native
  def Information: ShowMessageType = js.native
  inline def Information_=(x: ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Information")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ShowMessageType.Warning")
  @js.native
  def Warning: ShowMessageType = js.native
  inline def Warning_=(x: ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
}
