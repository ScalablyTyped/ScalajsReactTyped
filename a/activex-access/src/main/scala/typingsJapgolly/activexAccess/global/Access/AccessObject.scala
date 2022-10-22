package typingsJapgolly.activexAccess.global.Access

import typingsJapgolly.activexAccess.Access.AcCurrentView
import typingsJapgolly.activexAccess.Access.AcObjectType
import typingsJapgolly.activexAccess.Access.AccessObjectProperties
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.AccessObject")
@js.native
/* private */ open class AccessObject ()
  extends StObject
     with typingsJapgolly.activexAccess.Access.AccessObject {
  
  /* private */ /* CompleteClass */
  @JSName("Access.AccessObject_typekey")
  var AccessDotAccessObject_typekey: typingsJapgolly.activexAccess.Access.AccessObject = js.native
  
  /* CompleteClass */
  override val Attributes: Double = js.native
  
  /* CompleteClass */
  override val CurrentView: AcCurrentView = js.native
  
  /* CompleteClass */
  override val DateCreated: VarDate = js.native
  
  /* CompleteClass */
  override val DateModified: VarDate = js.native
  
  /* CompleteClass */
  var FullName: String = js.native
  
  /* CompleteClass */
  override def GetDependencyInfo(): typingsJapgolly.activexAccess.Access.DependencyInfo = js.native
  
  /* CompleteClass */
  override def IsDependentUpon(ObjectType: AcObjectType, ObjectName: String): Boolean = js.native
  
  /* CompleteClass */
  override val IsLoaded: Boolean = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  override val IsWeb: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Properties(Index: String): typingsJapgolly.activexAccess.Access.AccessObjectProperty = js.native
  /* CompleteClass */
  override def Properties(Index: Double): typingsJapgolly.activexAccess.Access.AccessObjectProperty = js.native
  /* CompleteClass */
  @JSName("Properties")
  override val Properties_Original: AccessObjectProperties = js.native
  
  /* CompleteClass */
  override val Type: AcObjectType = js.native
  
  /* CompleteClass */
  override val _Name: String = js.native
}
