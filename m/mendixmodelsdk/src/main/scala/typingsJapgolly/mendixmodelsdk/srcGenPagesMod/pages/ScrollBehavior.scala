package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollBehavior")
@js.native
open class ScrollBehavior protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ScrollBehavior {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollBehavior.FullWidget")
  @js.native
  def FullWidget: ScrollBehavior = js.native
  inline def FullWidget_=(x: ScrollBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FullWidget")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ScrollBehavior.PerRegion")
  @js.native
  def PerRegion: ScrollBehavior = js.native
  inline def PerRegion_=(x: ScrollBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PerRegion")(x.asInstanceOf[js.Any])
}
