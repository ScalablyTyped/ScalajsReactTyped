package typingsJapgolly.activexAccess.global.Access

import typingsJapgolly.activexAccess.Access.DependencyObjects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Access.DependencyInfo")
@js.native
/* private */ open class DependencyInfo ()
  extends StObject
     with typingsJapgolly.activexAccess.Access.DependencyInfo {
  
  /* private */ /* CompleteClass */
  @JSName("Access.DependencyInfo_typekey")
  var AccessDotDependencyInfo_typekey: typingsJapgolly.activexAccess.Access.DependencyInfo = js.native
  
  /* CompleteClass */
  override def Dependants(Index: String): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def Dependants(Index: Double): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("Dependants")
  override val Dependants_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override def Dependencies(Index: String): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def Dependencies(Index: Double): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("Dependencies")
  override val Dependencies_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override def InsufficientPermissions(Index: String): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def InsufficientPermissions(Index: Double): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("InsufficientPermissions")
  override val InsufficientPermissions_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override def IsMemberSafe(dispid: Double): Boolean = js.native
  
  /* CompleteClass */
  override def OutOfDateObjects(Index: String): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def OutOfDateObjects(Index: Double): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("OutOfDateObjects")
  override val OutOfDateObjects_Original: DependencyObjects = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def UnsupportedObjects(Index: String): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  override def UnsupportedObjects(Index: Double): typingsJapgolly.activexAccess.Access.AccessObject = js.native
  /* CompleteClass */
  @JSName("UnsupportedObjects")
  override val UnsupportedObjects_Original: DependencyObjects = js.native
}
