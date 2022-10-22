package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.UpgradeInfo")
@js.native
open class UpgradeInfo ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.UpgradeInfo {
  
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
  override def get_errorFile(): String = js.native
  
  /* CompleteClass */
  override def get_errors(): Double = js.native
  
  /* CompleteClass */
  override def get_lastUpdated(): js.Date = js.native
  
  /* CompleteClass */
  override def get_logFile(): String = js.native
  
  /* CompleteClass */
  override def get_requestDate(): js.Date = js.native
  
  /* CompleteClass */
  override def get_retryCount(): Double = js.native
  
  /* CompleteClass */
  override def get_startTime(): js.Date = js.native
  
  /* CompleteClass */
  override def get_status(): typingsJapgolly.sharepoint.SP.UpgradeStatus = js.native
  
  /* CompleteClass */
  override def get_typeId(): String = js.native
  
  /* CompleteClass */
  override def get_upgradeType(): typingsJapgolly.sharepoint.SP.UpgradeType = js.native
  
  /* CompleteClass */
  override def get_warnings(): Double = js.native
  
  /* CompleteClass */
  override def writeToXml(
    writer: typingsJapgolly.sharepoint.SP.XmlWriter,
    serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
  ): Unit = js.native
}
