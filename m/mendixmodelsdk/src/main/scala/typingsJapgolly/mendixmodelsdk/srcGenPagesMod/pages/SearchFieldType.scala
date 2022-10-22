package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchFieldType")
@js.native
open class SearchFieldType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SearchFieldType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchFieldType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchFieldType.Hidden")
  @js.native
  def Hidden: SearchFieldType = js.native
  inline def Hidden_=(x: SearchFieldType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hidden")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchFieldType.Normal")
  @js.native
  def Normal: SearchFieldType = js.native
  inline def Normal_=(x: SearchFieldType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Normal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SearchFieldType.ReadOnly")
  @js.native
  def ReadOnly: SearchFieldType = js.native
  inline def ReadOnly_=(x: SearchFieldType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(x.asInstanceOf[js.Any])
}
