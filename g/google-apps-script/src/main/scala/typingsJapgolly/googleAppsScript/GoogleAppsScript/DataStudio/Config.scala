package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the configuration entries for a connector. These configuration entries define what
  * questions are asked when adding a new connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info_entry = config.newInfo()
  *       .setId("info_id")
  *       .setHelpText("This connector can connect to multiple data endpoints.");
  */
trait Config extends StObject {
  
  def build(): Config
  
  def newCheckbox(): Checkbox
  
  def newInfo(): Info
  
  def newOptionBuilder(): OptionBuilder
  
  def newSelectMultiple(): SelectMultiple
  
  def newSelectSingle(): SelectSingle
  
  def newTextArea(): TextArea
  
  def newTextInput(): TextInput
  
  def printJson(): String
  
  def setDateRangeRequired(dateRangeRequired: Boolean): Config
  
  def setIsSteppedConfig(isSteppedConfig: Boolean): Config
}
object Config {
  
  inline def apply(
    build: CallbackTo[Config],
    newCheckbox: CallbackTo[Checkbox],
    newInfo: CallbackTo[Info],
    newOptionBuilder: CallbackTo[OptionBuilder],
    newSelectMultiple: CallbackTo[SelectMultiple],
    newSelectSingle: CallbackTo[SelectSingle],
    newTextArea: CallbackTo[TextArea],
    newTextInput: CallbackTo[TextInput],
    printJson: CallbackTo[String],
    setDateRangeRequired: Boolean => Config,
    setIsSteppedConfig: Boolean => Config
  ): Config = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, newCheckbox = newCheckbox.toJsFn, newInfo = newInfo.toJsFn, newOptionBuilder = newOptionBuilder.toJsFn, newSelectMultiple = newSelectMultiple.toJsFn, newSelectSingle = newSelectSingle.toJsFn, newTextArea = newTextArea.toJsFn, newTextInput = newTextInput.toJsFn, printJson = printJson.toJsFn, setDateRangeRequired = js.Any.fromFunction1(setDateRangeRequired), setIsSteppedConfig = js.Any.fromFunction1(setIsSteppedConfig))
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setBuild(value: CallbackTo[Config]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setNewCheckbox(value: CallbackTo[Checkbox]): Self = StObject.set(x, "newCheckbox", value.toJsFn)
    
    inline def setNewInfo(value: CallbackTo[Info]): Self = StObject.set(x, "newInfo", value.toJsFn)
    
    inline def setNewOptionBuilder(value: CallbackTo[OptionBuilder]): Self = StObject.set(x, "newOptionBuilder", value.toJsFn)
    
    inline def setNewSelectMultiple(value: CallbackTo[SelectMultiple]): Self = StObject.set(x, "newSelectMultiple", value.toJsFn)
    
    inline def setNewSelectSingle(value: CallbackTo[SelectSingle]): Self = StObject.set(x, "newSelectSingle", value.toJsFn)
    
    inline def setNewTextArea(value: CallbackTo[TextArea]): Self = StObject.set(x, "newTextArea", value.toJsFn)
    
    inline def setNewTextInput(value: CallbackTo[TextInput]): Self = StObject.set(x, "newTextInput", value.toJsFn)
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
    
    inline def setSetDateRangeRequired(value: Boolean => Config): Self = StObject.set(x, "setDateRangeRequired", js.Any.fromFunction1(value))
    
    inline def setSetIsSteppedConfig(value: Boolean => Config): Self = StObject.set(x, "setIsSteppedConfig", js.Any.fromFunction1(value))
  }
}
