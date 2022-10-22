package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoadingScreen extends StObject {
  
  /**
    * Function called to display the loading screen
    */
  def displayLoadingUI(): Unit
  
  /**
    * Function called to hide the loading screen
    */
  def hideLoadingUI(): Unit
  
  /**
    * Gets or sets the color to use for the background
    */
  var loadingUIBackgroundColor: String
  
  /**
    * Gets or sets the text to display while loading
    */
  var loadingUIText: String
}
object ILoadingScreen {
  
  inline def apply(
    displayLoadingUI: Callback,
    hideLoadingUI: Callback,
    loadingUIBackgroundColor: String,
    loadingUIText: String
  ): ILoadingScreen = {
    val __obj = js.Dynamic.literal(displayLoadingUI = displayLoadingUI.toJsFn, hideLoadingUI = hideLoadingUI.toJsFn, loadingUIBackgroundColor = loadingUIBackgroundColor.asInstanceOf[js.Any], loadingUIText = loadingUIText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadingScreen]
  }
  
  extension [Self <: ILoadingScreen](x: Self) {
    
    inline def setDisplayLoadingUI(value: Callback): Self = StObject.set(x, "displayLoadingUI", value.toJsFn)
    
    inline def setHideLoadingUI(value: Callback): Self = StObject.set(x, "hideLoadingUI", value.toJsFn)
    
    inline def setLoadingUIBackgroundColor(value: String): Self = StObject.set(x, "loadingUIBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingUIText(value: String): Self = StObject.set(x, "loadingUIText", value.asInstanceOf[js.Any])
  }
}
