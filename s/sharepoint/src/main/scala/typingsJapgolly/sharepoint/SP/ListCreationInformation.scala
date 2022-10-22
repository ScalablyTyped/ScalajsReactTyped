package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_customSchemaXml(): String
  
  def get_dataSourceProperties(): Any
  
  def get_description(): String
  
  def get_documentTemplateType(): Double
  
  def get_quickLaunchOption(): QuickLaunchOptions
  
  def get_templateFeatureId(): Guid
  
  def get_templateType(): Double
  
  def get_title(): String
  
  def get_url(): String
  
  def set_customSchemaXml(value: String): Unit
  
  def set_dataSourceProperties(value: Any): Unit
  
  def set_description(value: String): Unit
  
  def set_documentTemplateType(value: Double): Unit
  
  def set_quickLaunchOption(value: QuickLaunchOptions): Unit
  
  def set_templateFeatureId(value: Guid): Unit
  
  def set_templateType(value: Double): Unit
  
  def set_title(value: String): Unit
  
  def set_url(value: String): Unit
}
object ListCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_customSchemaXml: CallbackTo[String],
    get_dataSourceProperties: CallbackTo[Any],
    get_description: CallbackTo[String],
    get_documentTemplateType: CallbackTo[Double],
    get_quickLaunchOption: CallbackTo[QuickLaunchOptions],
    get_templateFeatureId: CallbackTo[Guid],
    get_templateType: CallbackTo[Double],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_url: CallbackTo[String],
    set_customSchemaXml: String => Callback,
    set_dataSourceProperties: Any => Callback,
    set_description: String => Callback,
    set_documentTemplateType: Double => Callback,
    set_quickLaunchOption: QuickLaunchOptions => Callback,
    set_templateFeatureId: Guid => Callback,
    set_templateType: Double => Callback,
    set_title: String => Callback,
    set_url: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ListCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_customSchemaXml = get_customSchemaXml.toJsFn, get_dataSourceProperties = get_dataSourceProperties.toJsFn, get_description = get_description.toJsFn, get_documentTemplateType = get_documentTemplateType.toJsFn, get_quickLaunchOption = get_quickLaunchOption.toJsFn, get_templateFeatureId = get_templateFeatureId.toJsFn, get_templateType = get_templateType.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_url = get_url.toJsFn, set_customSchemaXml = js.Any.fromFunction1((t0: String) => set_customSchemaXml(t0).runNow()), set_dataSourceProperties = js.Any.fromFunction1((t0: Any) => set_dataSourceProperties(t0).runNow()), set_description = js.Any.fromFunction1((t0: String) => set_description(t0).runNow()), set_documentTemplateType = js.Any.fromFunction1((t0: Double) => set_documentTemplateType(t0).runNow()), set_quickLaunchOption = js.Any.fromFunction1((t0: QuickLaunchOptions) => set_quickLaunchOption(t0).runNow()), set_templateFeatureId = js.Any.fromFunction1((t0: Guid) => set_templateFeatureId(t0).runNow()), set_templateType = js.Any.fromFunction1((t0: Double) => set_templateType(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), set_url = js.Any.fromFunction1((t0: String) => set_url(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ListCreationInformation]
  }
  
  extension [Self <: ListCreationInformation](x: Self) {
    
    inline def setGet_customSchemaXml(value: CallbackTo[String]): Self = StObject.set(x, "get_customSchemaXml", value.toJsFn)
    
    inline def setGet_dataSourceProperties(value: CallbackTo[Any]): Self = StObject.set(x, "get_dataSourceProperties", value.toJsFn)
    
    inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
    
    inline def setGet_documentTemplateType(value: CallbackTo[Double]): Self = StObject.set(x, "get_documentTemplateType", value.toJsFn)
    
    inline def setGet_quickLaunchOption(value: CallbackTo[QuickLaunchOptions]): Self = StObject.set(x, "get_quickLaunchOption", value.toJsFn)
    
    inline def setGet_templateFeatureId(value: CallbackTo[Guid]): Self = StObject.set(x, "get_templateFeatureId", value.toJsFn)
    
    inline def setGet_templateType(value: CallbackTo[Double]): Self = StObject.set(x, "get_templateType", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
    
    inline def setSet_customSchemaXml(value: String => Callback): Self = StObject.set(x, "set_customSchemaXml", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_dataSourceProperties(value: Any => Callback): Self = StObject.set(x, "set_dataSourceProperties", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet_description(value: String => Callback): Self = StObject.set(x, "set_description", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_documentTemplateType(value: Double => Callback): Self = StObject.set(x, "set_documentTemplateType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_quickLaunchOption(value: QuickLaunchOptions => Callback): Self = StObject.set(x, "set_quickLaunchOption", js.Any.fromFunction1((t0: QuickLaunchOptions) => value(t0).runNow()))
    
    inline def setSet_templateFeatureId(value: Guid => Callback): Self = StObject.set(x, "set_templateFeatureId", js.Any.fromFunction1((t0: Guid) => value(t0).runNow()))
    
    inline def setSet_templateType(value: Double => Callback): Self = StObject.set(x, "set_templateType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_url(value: String => Callback): Self = StObject.set(x, "set_url", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
