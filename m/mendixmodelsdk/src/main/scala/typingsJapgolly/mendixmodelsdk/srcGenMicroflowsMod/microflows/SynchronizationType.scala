package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SynchronizationType")
@js.native
open class SynchronizationType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SynchronizationType {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SynchronizationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SynchronizationType.All")
  @js.native
  def All: SynchronizationType = js.native
  inline def All_=(x: SynchronizationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SynchronizationType.Specific")
  @js.native
  def Specific: SynchronizationType = js.native
  inline def Specific_=(x: SynchronizationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Specific")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SynchronizationType.Unsynchronized")
  @js.native
  def Unsynchronized: SynchronizationType = js.native
  inline def Unsynchronized_=(x: SynchronizationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unsynchronized")(x.asInstanceOf[js.Any])
}
