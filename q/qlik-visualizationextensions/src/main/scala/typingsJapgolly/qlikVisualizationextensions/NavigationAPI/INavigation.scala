package typingsJapgolly.qlikVisualizationextensions.NavigationAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.analysis_
import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.edit_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigation API for Qlik Sense. The Navigation API allows you to navigate
  * within a Qlik Sense app, and is meant to be used in visualization extensions
  * and will not work in Mashup scenarios.
  */
trait INavigation extends js.Object {
  /**
    * Used for edit mode.
    */
  var analysis: analysis_
  /**
    * Used for analysis mode.
    */
  var edit: edit_
  /**
    * Gets the current sheet ID.
    * @return - A navigation result object.
    */
  def getCurrentSheetId(): NavigationResult
  /**
    * Gets the current mode.
    * @return - The current mode as a string.
    */
  def getMode(): String
  /**
    * Navigate to a given sheet in the current app.
    * The method will return before the actual navigation takes place.
    * @param sheetId - Set the sheet ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoSheet(sheetId: String): NavigationResult
  /**
    * Navigate to a given story in the current app.
    * The method will return before the actual navigation takes place.
    * @param storyId - Set the story ID to navigate to.
    * @return - A navigation result object.
    */
  def gotoStory(storyId: String): NavigationResult
  /**
    * Checks if a given mode is allowed.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A Boolean value (true or false).
    */
  def isModeAllowed(mode: NavigationModeType): Boolean
  /**
    * Go to the next sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place.
    * @return - A navigation result object.
    */
  def nextSheet(): NavigationResult
  /**
    * Jumps to the previous sheet in the current app.
    * It will do nothing if you do not have sheets in the current context.
    * The method will return before the actual navigation takes place
    * @return - A navigation result object.
    */
  def prevSheet(): NavigationResult
  /**
    * Sets the current working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def setMode(mode: String): NavigationResult
  /**
    * Switches the working mode of Qlik Sense.
    * @param mode - Can be one of the strings: edit   |   analysis
    * or one of the constants: qlik.navigation.EDIT   |   qlik.navigation.ANALYSIS
    * @return - A navigation result object.
    */
  def switchMode(mode: NavigationModeType): NavigationResult
}

object INavigation {
  @scala.inline
  def apply(
    analysis: analysis_,
    edit: edit_,
    getCurrentSheetId: CallbackTo[NavigationResult],
    getMode: CallbackTo[String],
    gotoSheet: String => CallbackTo[NavigationResult],
    gotoStory: String => CallbackTo[NavigationResult],
    isModeAllowed: NavigationModeType => CallbackTo[Boolean],
    nextSheet: CallbackTo[NavigationResult],
    prevSheet: CallbackTo[NavigationResult],
    setMode: String => CallbackTo[NavigationResult],
    switchMode: NavigationModeType => CallbackTo[NavigationResult]
  ): INavigation = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentSheetId")(getCurrentSheetId.toJsFn)
    __obj.updateDynamic("getMode")(getMode.toJsFn)
    __obj.updateDynamic("gotoSheet")(js.Any.fromFunction1((t0: java.lang.String) => gotoSheet(t0).runNow()))
    __obj.updateDynamic("gotoStory")(js.Any.fromFunction1((t0: java.lang.String) => gotoStory(t0).runNow()))
    __obj.updateDynamic("isModeAllowed")(js.Any.fromFunction1((t0: typingsJapgolly.qlikVisualizationextensions.NavigationAPI.NavigationModeType) => isModeAllowed(t0).runNow()))
    __obj.updateDynamic("nextSheet")(nextSheet.toJsFn)
    __obj.updateDynamic("prevSheet")(prevSheet.toJsFn)
    __obj.updateDynamic("setMode")(js.Any.fromFunction1((t0: java.lang.String) => setMode(t0).runNow()))
    __obj.updateDynamic("switchMode")(js.Any.fromFunction1((t0: typingsJapgolly.qlikVisualizationextensions.NavigationAPI.NavigationModeType) => switchMode(t0).runNow()))
    __obj.asInstanceOf[INavigation]
  }
}

