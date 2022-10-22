package typingsJapgolly.activexInfopath.global.InfoPath

import typingsJapgolly.activexInfopath.InfoPath.XdReadOnlyViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.IInitEventHandler")
@js.native
/* private */ open class IInitEventHandler ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath.IInitEventHandler {
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.IInitEventHandler_typekey")
  var InfoPathDotIInitEventHandler_typekey: typingsJapgolly.activexInfopath.InfoPath.IInitEventHandler = js.native
  
  /* CompleteClass */
  override def InitEventHandler(
    punkSender: Any,
    pDocument: typingsJapgolly.activexInfopath.InfoPath._XDocument,
    pROMode: XdReadOnlyViewMode
  ): Unit = js.native
}
