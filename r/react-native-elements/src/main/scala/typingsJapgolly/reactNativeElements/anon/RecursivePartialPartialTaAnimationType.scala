package typingsJapgolly.reactNativeElements.anon

import typingsJapgolly.reactNativeElements.distConfigThemeMod.RecursivePartial
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.spring
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/tab/TabView.TabViewProps>> */
trait RecursivePartialPartialTaAnimationType extends StObject {
  
  var animationConfig: js.UndefOr[RecursivePartial[js.UndefOr[OmitSpringAnimationConfig]]] = js.undefined
  
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[spring | timing]]] = js.undefined
  
  var onChange: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Any]]]] = js.undefined
  
  var value: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
}
object RecursivePartialPartialTaAnimationType {
  
  inline def apply(): RecursivePartialPartialTaAnimationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialTaAnimationType]
  }
  
  extension [Self <: RecursivePartialPartialTaAnimationType](x: Self) {
    
    inline def setAnimationConfig(value: RecursivePartial[js.UndefOr[OmitSpringAnimationConfig]]): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAnimationType(value: RecursivePartial[js.UndefOr[spring | timing]]): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setOnChange(value: RecursivePartial[js.UndefOr[js.Function1[/* value */ Double, Any]]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
