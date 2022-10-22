package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AppLicenseCollection")
@js.native
open class AppLicenseCollection ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.AppLicenseCollection {
  
  /* CompleteClass */
  override def add(item: typingsJapgolly.sharepoint.SP.AppLicense): Unit = js.native
  
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
  override def getEnumerator(): IEnumerator[typingsJapgolly.sharepoint.SP.AppLicense] = js.native
  
  /* CompleteClass */
  override def get_count(): Double = js.native
  
  /* CompleteClass */
  override def get_item(index: Double): typingsJapgolly.sharepoint.SP.AppLicense = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
