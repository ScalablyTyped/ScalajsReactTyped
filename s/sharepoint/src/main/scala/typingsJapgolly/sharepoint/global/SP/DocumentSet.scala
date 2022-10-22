package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSet {
  
  @JSGlobal("SP.DocumentSet.DocumentSet")
  @js.native
  open class DocumentSet ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.ClientObject
  object DocumentSet {
    
    @JSGlobal("SP.DocumentSet.DocumentSet")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(
      context: typingsJapgolly.sharepoint.SP.ClientContext,
      parentFolder: typingsJapgolly.sharepoint.SP.Folder,
      name: String,
      ctid: typingsJapgolly.sharepoint.SP.ContentTypeId
    ): typingsJapgolly.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(context.asInstanceOf[js.Any], parentFolder.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ctid.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
  }
}
