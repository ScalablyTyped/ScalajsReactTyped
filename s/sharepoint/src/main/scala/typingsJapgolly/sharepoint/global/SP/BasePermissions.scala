package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.BasePermissions")
@js.native
open class BasePermissions ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.BasePermissions {
  
  /* CompleteClass */
  override def clear(perm: typingsJapgolly.sharepoint.SP.PermissionKind): Unit = js.native
  
  /* CompleteClass */
  override def clearAll(): Unit = js.native
  
  /* CompleteClass */
  override def customFromJson(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  override def customWriteToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  
  /* CompleteClass */
  override def equals(perm: typingsJapgolly.sharepoint.SP.BasePermissions): Boolean = js.native
  
  /* CompleteClass */
  override def fromJson(obj: Any): Unit = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def has(perm: typingsJapgolly.sharepoint.SP.PermissionKind): Boolean = js.native
  
  /* CompleteClass */
  override def hasPermissions(high: Double, low: Double): Boolean = js.native
  
  /* CompleteClass */
  override def set(perm: typingsJapgolly.sharepoint.SP.PermissionKind): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
