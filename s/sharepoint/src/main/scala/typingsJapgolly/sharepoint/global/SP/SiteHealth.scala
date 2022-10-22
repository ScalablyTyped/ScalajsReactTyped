package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.sharepoint.SP.SiteHealth.SiteHealthStatusType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiteHealth {
  
  @JSGlobal("SP.SiteHealth.SiteHealthResult")
  @js.native
  open class SiteHealthResult ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.SiteHealth.SiteHealthResult {
    
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
    override def get_messageAsText(): String = js.native
    
    /* CompleteClass */
    override def get_ruleHelpLink(): String = js.native
    
    /* CompleteClass */
    override def get_ruleId(): typingsJapgolly.sharepoint.SP.Guid = js.native
    
    /* CompleteClass */
    override def get_ruleIsRepairable(): Boolean = js.native
    
    /* CompleteClass */
    override def get_ruleName(): String = js.native
    
    /* CompleteClass */
    override def get_status(): SiteHealthStatusType = js.native
    
    /* CompleteClass */
    override def get_timeStamp(): js.Date = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def set_status(value: SiteHealthStatusType): Unit = js.native
    
    /* CompleteClass */
    override def set_timeStamp(value: js.Date): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.SiteHealth.SiteHealthStatusType")
  @js.native
  object SiteHealthStatusType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.SiteHealth.SiteHealthStatusType & Double] = js.native
    
    /* 2 */ val failedError: typingsJapgolly.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedError & Double = js.native
    
    /* 1 */ val failedWarning: typingsJapgolly.sharepoint.SP.SiteHealth.SiteHealthStatusType.failedWarning & Double = js.native
    
    /* 0 */ val passed: typingsJapgolly.sharepoint.SP.SiteHealth.SiteHealthStatusType.passed & Double = js.native
  }
  
  @JSGlobal("SP.SiteHealth.SiteHealthSummary")
  @js.native
  open class SiteHealthSummary ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.SiteHealth.SiteHealthSummary
}
