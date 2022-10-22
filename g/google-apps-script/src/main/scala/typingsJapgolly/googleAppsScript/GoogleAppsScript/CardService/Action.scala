package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An action that enables interactivity within UI elements. The action does not happen directly on
  * the client but rather invokes an Apps Script callback function with optional parameters.
  *
  *     var image = CardService.newImage()
  *         .setOnClickAction(CardService.newAction()
  *             .setFunctionName("handleImageClick")
  *             .setParameters({imageSrc: 'carImage'}));
  */
trait Action extends StObject {
  
  def setFunctionName(functionName: String): Action
  
  def setLoadIndicator(loadIndicator: LoadIndicator): Action
  
  /** @deprecated DO NOT USE */ def setMethodName(functionName: String): Action
  
  def setParameters(parameters: StringDictionary[String]): Action
}
object Action {
  
  inline def apply(
    setFunctionName: String => Action,
    setLoadIndicator: LoadIndicator => Action,
    setMethodName: String => Action,
    setParameters: StringDictionary[String] => Action
  ): Action = {
    val __obj = js.Dynamic.literal(setFunctionName = js.Any.fromFunction1(setFunctionName), setLoadIndicator = js.Any.fromFunction1(setLoadIndicator), setMethodName = js.Any.fromFunction1(setMethodName), setParameters = js.Any.fromFunction1(setParameters))
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setSetFunctionName(value: String => Action): Self = StObject.set(x, "setFunctionName", js.Any.fromFunction1(value))
    
    inline def setSetLoadIndicator(value: LoadIndicator => Action): Self = StObject.set(x, "setLoadIndicator", js.Any.fromFunction1(value))
    
    inline def setSetMethodName(value: String => Action): Self = StObject.set(x, "setMethodName", js.Any.fromFunction1(value))
    
    inline def setSetParameters(value: StringDictionary[String] => Action): Self = StObject.set(x, "setParameters", js.Any.fromFunction1(value))
  }
}
