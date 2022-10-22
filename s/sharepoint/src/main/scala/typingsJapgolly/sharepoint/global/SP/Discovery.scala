package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Discovery {
  
  @JSGlobal("SP.Discovery.Case")
  @js.native
  open class Case protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Discovery.Case {
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ) = this()
  }
  
  @JSGlobal("SP.Discovery.Export")
  @js.native
  open class Export protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Discovery.Export {
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      item: typingsJapgolly.sharepoint.SP.ListItem[Any]
    ) = this()
  }
  
  @JSGlobal("SP.Discovery.ExportStatus")
  @js.native
  object ExportStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Discovery.ExportStatus & Double] = js.native
    
    /* 2 */ val complete: typingsJapgolly.sharepoint.SP.Discovery.ExportStatus.complete & Double = js.native
    
    /* 3 */ val failed: typingsJapgolly.sharepoint.SP.Discovery.ExportStatus.failed & Double = js.native
    
    /* 0 */ val notStarted: typingsJapgolly.sharepoint.SP.Discovery.ExportStatus.notStarted & Double = js.native
    
    /* 1 */ val started: typingsJapgolly.sharepoint.SP.Discovery.ExportStatus.started & Double = js.native
  }
}
