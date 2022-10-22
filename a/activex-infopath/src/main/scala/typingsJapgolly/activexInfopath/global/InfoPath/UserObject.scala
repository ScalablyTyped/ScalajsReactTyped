package typingsJapgolly.activexInfopath.global.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.UserObject")
@js.native
/* private */ open class UserObject ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath.UserObject {
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.UserObject_typekey")
  var InfoPathDotUserObject_typekey: typingsJapgolly.activexInfopath.InfoPath.UserObject = js.native
  
  /* CompleteClass */
  override def IsCurrentUser(bstrUsername: String): Boolean = js.native
  
  /* CompleteClass */
  override def IsUserMemberOf(bstrGroupname: String): Boolean = js.native
}
