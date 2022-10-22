package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiInts.`1`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiInts.`2`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiInts.`3`
import typingsJapgolly.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemProps extends StObject {
  
  var centerElement: Element | String | ListItemCenterElement
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  var divider: js.UndefOr[Boolean] = js.undefined
  
  var leftElement: js.UndefOr[Element | String] = js.undefined
  
  var numberOfLines: js.UndefOr[`1` | `2` | `3` | dynamic] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPressValue: js.UndefOr[Any] = js.undefined
  
  var onRightElementPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var rightElement: js.UndefOr[Element | String] = js.undefined
  
  var style: js.UndefOr[ListItemStyle] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
}
object ListItemProps {
  
  inline def apply(centerElement: Element | String | ListItemCenterElement): ListItemProps = {
    val __obj = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
  
  extension [Self <: ListItemProps](x: Self) {
    
    inline def setCenterElement(value: Element | String | ListItemCenterElement): Self = StObject.set(x, "centerElement", value.asInstanceOf[js.Any])
    
    inline def setCenterElementVdomElement(value: VdomElement): Self = StObject.set(x, "centerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setLeftElement(value: Element | String): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    inline def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    inline def setLeftElementVdomElement(value: VdomElement): Self = StObject.set(x, "leftElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNumberOfLines(value: `1` | `2` | `3` | dynamic): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnPressValue(value: Any): Self = StObject.set(x, "onPressValue", value.asInstanceOf[js.Any])
    
    inline def setOnPressValueUndefined: Self = StObject.set(x, "onPressValue", js.undefined)
    
    inline def setOnRightElementPress(value: Callback): Self = StObject.set(x, "onRightElementPress", value.toJsFn)
    
    inline def setOnRightElementPressUndefined: Self = StObject.set(x, "onRightElementPress", js.undefined)
    
    inline def setRightElement(value: Element | String): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    inline def setRightElementVdomElement(value: VdomElement): Self = StObject.set(x, "rightElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStyle(value: ListItemStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
  }
}
