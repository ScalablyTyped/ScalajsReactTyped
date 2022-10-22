package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Guid")
@js.native
open class Guid protected ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.Guid {
  def this(guidText: String) = this()
}
object Guid {
  
  @JSGlobal("SP.Guid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getEmpty(): typingsJapgolly.sharepoint.SP.Guid = ^.asInstanceOf[js.Dynamic].applyDynamic("get_empty")().asInstanceOf[typingsJapgolly.sharepoint.SP.Guid]
  
  /* static member */
  inline def isValid(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def newGuid(): typingsJapgolly.sharepoint.SP.Guid = ^.asInstanceOf[js.Dynamic].applyDynamic("newGuid")().asInstanceOf[typingsJapgolly.sharepoint.SP.Guid]
}
