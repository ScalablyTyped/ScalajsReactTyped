package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonDatetimeButton extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * The ID of the `ion-datetime` instance associated with the datetime button.
    */
  var datetime: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
}
object IonDatetimeButton {
  
  inline def apply(): IonDatetimeButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonDatetimeButton]
  }
  
  extension [Self <: IonDatetimeButton](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
