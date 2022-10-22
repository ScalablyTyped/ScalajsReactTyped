package typingsJapgolly.activexAccess.global.Access

import typingsJapgolly.activexAccess.Access.SmartTagActions
import typingsJapgolly.activexAccess.Access.SmartTagProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.SmartTag")
@js.native
/* private */ open class SmartTag ()
  extends StObject
     with typingsJapgolly.activexAccess.Access.SmartTag {
  
  /* private */ /* CompleteClass */
  @JSName("Access.SmartTag_typekey")
  var AccessDotSmartTag_typekey: typingsJapgolly.activexAccess.Access.SmartTag = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexAccess.Access.Application = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  override val IsMissing: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Properties(Index: String): typingsJapgolly.activexAccess.Access.SmartTagProperty = js.native
  /* CompleteClass */
  override def Properties(Index: Double): typingsJapgolly.activexAccess.Access.SmartTagProperty = js.native
  /* CompleteClass */
  @JSName("Properties")
  override val Properties_Original: SmartTagProperties = js.native
  
  /* CompleteClass */
  override def SmartTagActions(Index: String): typingsJapgolly.activexAccess.Access.SmartTagAction = js.native
  /* CompleteClass */
  override def SmartTagActions(Index: Double): typingsJapgolly.activexAccess.Access.SmartTagAction = js.native
  /* CompleteClass */
  @JSName("SmartTagActions")
  override val SmartTagActions_Original: SmartTagActions = js.native
  
  /* CompleteClass */
  override val XML: String = js.native
}
