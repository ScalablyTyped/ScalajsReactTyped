package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.UserPermission")
@js.native
/* private */ open class UserPermission ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.UserPermission {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var ExpirationDate: VarDate = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.UserPermission_typekey")
  var OfficeDotUserPermission_typekey: typingsJapgolly.activexOffice.Office.UserPermission = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Permission: Double = js.native
  
  /* CompleteClass */
  override def Remove(): Unit = js.native
  
  /* CompleteClass */
  override val UserId: String = js.native
}
