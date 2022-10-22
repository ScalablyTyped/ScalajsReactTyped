package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.FileManagerType")
@js.native
open class FileManagerType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object FileManagerType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FileManagerType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FileManagerType.Both")
  @js.native
  def Both: FileManagerType = js.native
  inline def Both_=(x: FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Both")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FileManagerType.Download")
  @js.native
  def Download: FileManagerType = js.native
  inline def Download_=(x: FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Download")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FileManagerType.Upload")
  @js.native
  def Upload: FileManagerType = js.native
  inline def Upload_=(x: FileManagerType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Upload")(x.asInstanceOf[js.Any])
}
