package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that enables interactivity within UI elements. The action does not happen directly on
  * the client but rather invokes an Apps Script callback function with optional parameters.
  *
  *     var image = CardService.newImage()
  *         .setOnClickAction(CardService.newAction()
  *             .setFunctionName("handleImageClick")
  *             .setParameters({imageSrc: 'carImage'}));
  */
trait Action extends js.Object {
  def setFunctionName(functionName: String): Action
  def setLoadIndicator(loadIndicator: LoadIndicator): Action
  /** @deprecated DO NOT USE */ def setMethodName(functionName: String): Action
  def setParameters(parameters: StringDictionary[String]): Action
}

object Action {
  @scala.inline
  def apply(
    setFunctionName: String => CallbackTo[Action],
    setLoadIndicator: LoadIndicator => CallbackTo[Action],
    setMethodName: String => CallbackTo[Action],
    setParameters: StringDictionary[String] => CallbackTo[Action]
  ): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFunctionName")(js.Any.fromFunction1((t0: java.lang.String) => setFunctionName(t0).runNow()))
    __obj.updateDynamic("setLoadIndicator")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.LoadIndicator) => setLoadIndicator(t0).runNow()))
    __obj.updateDynamic("setMethodName")(js.Any.fromFunction1((t0: java.lang.String) => setMethodName(t0).runNow()))
    __obj.updateDynamic("setParameters")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[java.lang.String]) => setParameters(t0).runNow()))
    __obj.asInstanceOf[Action]
  }
}

