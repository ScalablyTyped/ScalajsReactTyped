package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file in a SharePoint Web site that can be a Web Part Page, an item in a document library, or a file in a folder. */
@JSGlobal("SP.File")
@js.native
open class File ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.File
object File {
  
  @JSGlobal("SP.File")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getContentVerFromTag(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, contentTag: String): typingsJapgolly.sharepoint.SP.IntResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getContentVerFromTag")(context.asInstanceOf[js.Any], contentTag.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.IntResult]
}
