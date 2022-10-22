package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains text area information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  * Usage:
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var textArea1 = config.newTextArea()
  *       .setId("textArea1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
trait TextArea extends StObject {
  
  def setAllowOverride(allowOverride: Boolean): TextArea
  
  def setHelpText(helpText: String): TextArea
  
  def setId(id: String): TextArea
  
  def setIsDynamic(isDynamic: Boolean): TextArea
  
  def setName(name: String): TextArea
  
  def setPlaceholder(placeholder: String): TextArea
}
object TextArea {
  
  inline def apply(
    setAllowOverride: Boolean => TextArea,
    setHelpText: String => TextArea,
    setId: String => TextArea,
    setIsDynamic: Boolean => TextArea,
    setName: String => TextArea,
    setPlaceholder: String => TextArea
  ): TextArea = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
    __obj.asInstanceOf[TextArea]
  }
  
  extension [Self <: TextArea](x: Self) {
    
    inline def setSetAllowOverride(value: Boolean => TextArea): Self = StObject.set(x, "setAllowOverride", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => TextArea): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetId(value: String => TextArea): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIsDynamic(value: Boolean => TextArea): Self = StObject.set(x, "setIsDynamic", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => TextArea): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetPlaceholder(value: String => TextArea): Self = StObject.set(x, "setPlaceholder", js.Any.fromFunction1(value))
  }
}
