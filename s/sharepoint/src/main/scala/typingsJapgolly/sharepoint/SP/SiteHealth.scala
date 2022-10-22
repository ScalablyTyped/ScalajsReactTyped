package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiteHealth {
  
  @js.native
  sealed trait SiteHealthStatusType extends StObject
  @JSGlobal("SP.SiteHealth.SiteHealthStatusType")
  @js.native
  object SiteHealthStatusType extends StObject {
    
    @js.native
    sealed trait failedError
      extends StObject
         with SiteHealthStatusType
    
    @js.native
    sealed trait failedWarning
      extends StObject
         with SiteHealthStatusType
    
    @js.native
    sealed trait passed
      extends StObject
         with SiteHealthStatusType
  }
  
  trait SiteHealthResult
    extends StObject
       with ClientValueObject {
    
    def get_messageAsText(): String
    
    def get_ruleHelpLink(): String
    
    def get_ruleId(): Guid
    
    def get_ruleIsRepairable(): Boolean
    
    def get_ruleName(): String
    
    def get_status(): SiteHealthStatusType
    
    def get_timeStamp(): js.Date
    
    def set_status(value: SiteHealthStatusType): Unit
    
    def set_timeStamp(value: js.Date): Unit
  }
  object SiteHealthResult {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_messageAsText: CallbackTo[String],
      get_ruleHelpLink: CallbackTo[String],
      get_ruleId: CallbackTo[Guid],
      get_ruleIsRepairable: CallbackTo[Boolean],
      get_ruleName: CallbackTo[String],
      get_status: CallbackTo[SiteHealthStatusType],
      get_timeStamp: CallbackTo[js.Date],
      get_typeId: CallbackTo[String],
      set_status: SiteHealthStatusType => Callback,
      set_timeStamp: js.Date => Callback,
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): SiteHealthResult = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_messageAsText = get_messageAsText.toJsFn, get_ruleHelpLink = get_ruleHelpLink.toJsFn, get_ruleId = get_ruleId.toJsFn, get_ruleIsRepairable = get_ruleIsRepairable.toJsFn, get_ruleName = get_ruleName.toJsFn, get_status = get_status.toJsFn, get_timeStamp = get_timeStamp.toJsFn, get_typeId = get_typeId.toJsFn, set_status = js.Any.fromFunction1((t0: SiteHealthStatusType) => set_status(t0).runNow()), set_timeStamp = js.Any.fromFunction1((t0: js.Date) => set_timeStamp(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[SiteHealthResult]
    }
    
    extension [Self <: SiteHealthResult](x: Self) {
      
      inline def setGet_messageAsText(value: CallbackTo[String]): Self = StObject.set(x, "get_messageAsText", value.toJsFn)
      
      inline def setGet_ruleHelpLink(value: CallbackTo[String]): Self = StObject.set(x, "get_ruleHelpLink", value.toJsFn)
      
      inline def setGet_ruleId(value: CallbackTo[Guid]): Self = StObject.set(x, "get_ruleId", value.toJsFn)
      
      inline def setGet_ruleIsRepairable(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_ruleIsRepairable", value.toJsFn)
      
      inline def setGet_ruleName(value: CallbackTo[String]): Self = StObject.set(x, "get_ruleName", value.toJsFn)
      
      inline def setGet_status(value: CallbackTo[SiteHealthStatusType]): Self = StObject.set(x, "get_status", value.toJsFn)
      
      inline def setGet_timeStamp(value: CallbackTo[js.Date]): Self = StObject.set(x, "get_timeStamp", value.toJsFn)
      
      inline def setSet_status(value: SiteHealthStatusType => Callback): Self = StObject.set(x, "set_status", js.Any.fromFunction1((t0: SiteHealthStatusType) => value(t0).runNow()))
      
      inline def setSet_timeStamp(value: js.Date => Callback): Self = StObject.set(x, "set_timeStamp", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait SiteHealthSummary
    extends StObject
       with ClientObject {
    
    def get_failedErrorCount(): Double = js.native
    
    def get_failedWarningCount(): Double = js.native
    
    def get_passedCount(): Double = js.native
    
    def get_results(): js.Array[SiteHealthResult] = js.native
  }
}
