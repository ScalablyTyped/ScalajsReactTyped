package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GardenTool extends StObject {
  
  /**
    * An HTML string which describes the tool
    */
  var desc: String
  
  /**
    * A function which generates the description for the tool
    */
  var descFunc: js.UndefOr[js.Function0[String]] = js.undefined
  
  /**
    * Function which is called on usage of the tool
    */
  def func(): Unit
  
  /**
    * The icon column of the tool in the plant icon sheet
    */
  var icon: Double
  
  var id: Double
  
  /**
    * Determines if the tool should be displayed
    */
  var isDisplayed: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /**
    * Determines if the tool should be displayed as currently in use
    */
  var isOn: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /**
    * The internal name of the tool
    */
  var key: String
  
  /**
    * The displayed name of the tool
    */
  var name: String
}
object GardenTool {
  
  inline def apply(desc: String, func: Callback, icon: Double, id: Double, key: String, name: String): GardenTool = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], func = func.toJsFn, icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GardenTool]
  }
  
  extension [Self <: GardenTool](x: Self) {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescFunc(value: CallbackTo[String]): Self = StObject.set(x, "descFunc", value.toJsFn)
    
    inline def setDescFuncUndefined: Self = StObject.set(x, "descFunc", js.undefined)
    
    inline def setFunc(value: Callback): Self = StObject.set(x, "func", value.toJsFn)
    
    inline def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDisplayed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisplayed", value.toJsFn)
    
    inline def setIsDisplayedUndefined: Self = StObject.set(x, "isDisplayed", js.undefined)
    
    inline def setIsOn(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOn", value.toJsFn)
    
    inline def setIsOnUndefined: Self = StObject.set(x, "isOn", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
