package typingsJapgolly.mendixmodelsdk.mod.settings

import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "settings.RoundingMode")
@js.native
open class RoundingMode protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.settings.RoundingMode {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RoundingMode {
  
  @JSImport("mendixmodelsdk", "settings.RoundingMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.RoundingMode.HalfEven")
  @js.native
  def HalfEven: typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.RoundingMode = js.native
  inline def HalfEven_=(x: typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HalfEven")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.RoundingMode.HalfUp")
  @js.native
  def HalfUp: typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.RoundingMode = js.native
  inline def HalfUp_=(x: typingsJapgolly.mendixmodelsdk.srcGenSettingsMod.settings.RoundingMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HalfUp")(x.asInstanceOf[js.Any])
}
