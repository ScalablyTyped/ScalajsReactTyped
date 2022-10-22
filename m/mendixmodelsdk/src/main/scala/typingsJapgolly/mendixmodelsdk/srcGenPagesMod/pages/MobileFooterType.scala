package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.MobileFooterType")
@js.native
open class MobileFooterType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object MobileFooterType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.MobileFooterType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.MobileFooterType.Custom")
  @js.native
  def Custom: MobileFooterType = js.native
  inline def Custom_=(x: MobileFooterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.MobileFooterType.MenuBar")
  @js.native
  def MenuBar: MobileFooterType = js.native
  inline def MenuBar_=(x: MobileFooterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuBar")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.MobileFooterType.None")
  @js.native
  def None: MobileFooterType = js.native
  inline def None_=(x: MobileFooterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
}
