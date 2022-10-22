package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.FieldUserValue")
@js.native
open class FieldUserValue ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.FieldUserValue {
  
  /* CompleteClass */
  override def customFromJson(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  override def customWriteToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Boolean = js.native
  
  /* CompleteClass */
  override def fromJson(obj: Any): Unit = js.native
  
  /* CompleteClass */
  override def get_lookupId(): Double = js.native
  
  /* CompleteClass */
  override def get_lookupValue(): String = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def set_lookupId(value: Double): Unit = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
object FieldUserValue {
  
  @JSGlobal("SP.FieldUserValue")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromUser(userName: String): typingsJapgolly.sharepoint.SP.FieldUserValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUser")(userName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.FieldUserValue]
}
