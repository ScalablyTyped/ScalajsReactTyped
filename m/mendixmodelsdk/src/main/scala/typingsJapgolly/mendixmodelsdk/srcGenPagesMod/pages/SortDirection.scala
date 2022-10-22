package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SortDirection")
@js.native
open class SortDirection protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SortDirection {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SortDirection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SortDirection.Ascending")
  @js.native
  def Ascending: SortDirection = js.native
  inline def Ascending_=(x: SortDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SortDirection.Descending")
  @js.native
  def Descending: SortDirection = js.native
  inline def Descending_=(x: SortDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
}
