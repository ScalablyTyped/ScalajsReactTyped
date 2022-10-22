package typingsJapgolly.qlikVisualizationextensions

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.analysis_
import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.edit_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavigationAPI {
  
  /**
    * Navigation API for Qlik Sense. The Navigation API allows you to navigate
    * within a Qlik Sense app, and is meant to be used in visualization extensions
    * and will not work in Mashup scenarios.
    */
  trait INavigation extends StObject {
    
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
    
    inline def apply(
      getCurrentSheetId: CallbackTo[NavigationResult],
      getMode: CallbackTo[String],
      gotoSheet: String => NavigationResult,
      gotoStory: String => NavigationResult,
      isModeAllowed: NavigationModeType => Boolean,
      nextSheet: CallbackTo[NavigationResult],
      prevSheet: CallbackTo[NavigationResult],
      setMode: String => NavigationResult,
      switchMode: NavigationModeType => NavigationResult
    ): INavigation = {
      val __obj = js.Dynamic.literal(analysis = "analysis", edit = "edit", getCurrentSheetId = getCurrentSheetId.toJsFn, getMode = getMode.toJsFn, gotoSheet = js.Any.fromFunction1(gotoSheet), gotoStory = js.Any.fromFunction1(gotoStory), isModeAllowed = js.Any.fromFunction1(isModeAllowed), nextSheet = nextSheet.toJsFn, prevSheet = prevSheet.toJsFn, setMode = js.Any.fromFunction1(setMode), switchMode = js.Any.fromFunction1(switchMode))
      __obj.asInstanceOf[INavigation]
    }
    
    extension [Self <: INavigation](x: Self) {
      
      inline def setAnalysis(value: analysis_): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
      
      inline def setEdit(value: edit_): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setGetCurrentSheetId(value: CallbackTo[NavigationResult]): Self = StObject.set(x, "getCurrentSheetId", value.toJsFn)
      
      inline def setGetMode(value: CallbackTo[String]): Self = StObject.set(x, "getMode", value.toJsFn)
      
      inline def setGotoSheet(value: String => NavigationResult): Self = StObject.set(x, "gotoSheet", js.Any.fromFunction1(value))
      
      inline def setGotoStory(value: String => NavigationResult): Self = StObject.set(x, "gotoStory", js.Any.fromFunction1(value))
      
      inline def setIsModeAllowed(value: NavigationModeType => Boolean): Self = StObject.set(x, "isModeAllowed", js.Any.fromFunction1(value))
      
      inline def setNextSheet(value: CallbackTo[NavigationResult]): Self = StObject.set(x, "nextSheet", value.toJsFn)
      
      inline def setPrevSheet(value: CallbackTo[NavigationResult]): Self = StObject.set(x, "prevSheet", value.toJsFn)
      
      inline def setSetMode(value: String => NavigationResult): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
      
      inline def setSwitchMode(value: NavigationModeType => NavigationResult): Self = StObject.set(x, "switchMode", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSHEET
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOCURRENTSHEET
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSTORY
  */
  trait NavigationErrorType extends StObject
  object NavigationErrorType {
    
    inline def NOCURRENTSHEET: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOCURRENTSHEET = "NOCURRENTSHEET".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOCURRENTSHEET]
    
    inline def NOSUCHSHEET: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSHEET = "NOSUCHSHEET".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSHEET]
    
    inline def NOSUCHSTORY: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSTORY = "NOSUCHSTORY".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.NOSUCHSTORY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.ANALYSIS
    - typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.EDIT
  */
  trait NavigationModeType extends StObject
  object NavigationModeType {
    
    inline def ANALYSIS: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.ANALYSIS = "ANALYSIS".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.ANALYSIS]
    
    inline def EDIT: typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.EDIT = "EDIT".asInstanceOf[typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.EDIT]
  }
  
  /**
    * The navigation result object.
    */
  trait NavigationResult extends StObject {
    
    /**
      * Error code. Can be: NOSUCHSHEET   |   NOCURRENTSHEET   |   NOSUCHSTORY
      */
    var error: NavigationErrorType
    
    /**
      * Error message, for example 'No current sheet'.
      */
    var errorMsg: String
    
    /**
      * The new mode.
      */
    var mode: String
    
    /**
      * The new sheet ID.
      */
    var sheetId: String
    
    /**
      * The new story ID.
      */
    var storyId: String
    
    /**
      * Returns true if successful.
      */
    var success: Boolean
  }
  object NavigationResult {
    
    inline def apply(
      error: NavigationErrorType,
      errorMsg: String,
      mode: String,
      sheetId: String,
      storyId: String,
      success: Boolean
    ): NavigationResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sheetId = sheetId.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationResult]
    }
    
    extension [Self <: NavigationResult](x: Self) {
      
      inline def setError(value: NavigationErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSheetId(value: String): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
