package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsCommand extends StObject {
  
  /** Distance from the left of the browser.Applicable when positionOption is DISTANCE_FROM_TOP_LEFT_CORNER. */
  var left: js.UndefOr[Double] = js.undefined
  
  /** Position in the browser where the window will open. */
  var positionOption: js.UndefOr[String] = js.undefined
  
  /** Distance from the top of the browser. Applicable when positionOption is DISTANCE_FROM_TOP_LEFT_CORNER. */
  var top: js.UndefOr[Double] = js.undefined
  
  /** Height of the window. */
  var windowHeight: js.UndefOr[Double] = js.undefined
  
  /** Width of the window. */
  var windowWidth: js.UndefOr[Double] = js.undefined
}
object FsCommand {
  
  inline def apply(): FsCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsCommand]
  }
  
  extension [Self <: FsCommand](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setPositionOption(value: String): Self = StObject.set(x, "positionOption", value.asInstanceOf[js.Any])
    
    inline def setPositionOptionUndefined: Self = StObject.set(x, "positionOption", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
    
    inline def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
  }
}
