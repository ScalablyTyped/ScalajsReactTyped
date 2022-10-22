package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains select multiple information for the config. Its properties determine how the select
  * multiple is displayed in Data Studio.
  *
  * Usage:
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectMultiple()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
trait SelectMultiple extends StObject {
  
  def addOption(optionBuilder: OptionBuilder): SelectMultiple
  
  def setAllowOverride(allowOverride: Boolean): SelectMultiple
  
  def setHelpText(helpText: String): SelectMultiple
  
  def setId(id: String): SelectMultiple
  
  def setIsDynamic(isDynamic: Boolean): SelectMultiple
  
  def setName(name: String): SelectMultiple
}
object SelectMultiple {
  
  inline def apply(
    addOption: OptionBuilder => SelectMultiple,
    setAllowOverride: Boolean => SelectMultiple,
    setHelpText: String => SelectMultiple,
    setId: String => SelectMultiple,
    setIsDynamic: Boolean => SelectMultiple,
    setName: String => SelectMultiple
  ): SelectMultiple = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SelectMultiple]
  }
  
  extension [Self <: SelectMultiple](x: Self) {
    
    inline def setAddOption(value: OptionBuilder => SelectMultiple): Self = StObject.set(x, "addOption", js.Any.fromFunction1(value))
    
    inline def setSetAllowOverride(value: Boolean => SelectMultiple): Self = StObject.set(x, "setAllowOverride", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => SelectMultiple): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetId(value: String => SelectMultiple): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIsDynamic(value: Boolean => SelectMultiple): Self = StObject.set(x, "setIsDynamic", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => SelectMultiple): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
