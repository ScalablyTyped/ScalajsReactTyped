package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SizeMode")
@js.native
open class SizeMode protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SizeMode {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SizeMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SizeMode.Auto")
  @js.native
  def Auto: SizeMode = js.native
  inline def Auto_=(x: SizeMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Auto")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SizeMode.Percentage")
  @js.native
  def Percentage: SizeMode = js.native
  inline def Percentage_=(x: SizeMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SizeMode.Pixels")
  @js.native
  def Pixels: SizeMode = js.native
  inline def Pixels_=(x: SizeMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixels")(x.asInstanceOf[js.Any])
}
