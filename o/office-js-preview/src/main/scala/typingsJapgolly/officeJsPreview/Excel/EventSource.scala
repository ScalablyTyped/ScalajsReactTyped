package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventSource extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.EventSource")
@js.native
object EventSource extends StObject {
  
  /**
    * Local means the event comes from a local user session.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait local
    extends StObject
       with EventSource
  
  /**
    * Remote means the event comes from a remote user session.
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  @js.native
  sealed trait remote
    extends StObject
       with EventSource
}
