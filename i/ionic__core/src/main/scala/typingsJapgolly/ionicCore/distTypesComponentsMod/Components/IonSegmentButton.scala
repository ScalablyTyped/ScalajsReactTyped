package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import typingsJapgolly.ionicCore.distTypesComponentsSegmentSegmentInterfaceMod.SegmentButtonLayout
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSegmentButton extends StObject {
  
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  var disabled: Boolean
  
  /**
    * Set the layout of the text and icon in the segment.
    */
  var layout: js.UndefOr[SegmentButtonLayout] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button
  
  /**
    * The value of the segment button.
    */
  var value: String
}
object IonSegmentButton {
  
  inline def apply(disabled: Boolean, `type`: submit | reset | button, value: String): IonSegmentButton = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSegmentButton]
  }
  
  extension [Self <: IonSegmentButton](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: SegmentButtonLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
