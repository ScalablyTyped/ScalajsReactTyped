package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.EllipsizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  /**
    * Description text for the list item or callback which returns a React element to display the description.
    */
  var description: js.UndefOr[
    typingsJapgolly.reactNativePaper.libTypescriptComponentsListListItemMod.Description
  ] = js.undefined
  
  /**
    * Ellipsize Mode for the Description.  One of `'head'`, `'middle'`, `'tail'`, `'clip'`.
    *
    * See [`ellipsizeMode`](https://reactnative.dev/docs/text#ellipsizemode)
    */
  var descriptionEllipsizeMode: js.UndefOr[EllipsizeProp] = js.undefined
  
  /**
    * Truncate Description text such that the total number of lines does not
    * exceed this number.
    */
  var descriptionNumberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Style that is passed to Description element.
    */
  var descriptionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * Callback which returns a React element to display on the left side.
    */
  var left: js.UndefOr[js.Function1[/* props */ ColorStyle, Node]] = js.undefined
  
  /**
    * Function to execute on press.
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback which returns a React element to display on the right side.
    */
  var right: js.UndefOr[js.Function1[/* props */ ColorStringStyle, Node]] = js.undefined
  
  /**
    * Style that is passed to the wrapping TouchableRipple element.
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Title text for the list item.
    */
  var title: typingsJapgolly.reactNativePaper.libTypescriptComponentsListListItemMod.Title
  
  /**
    * Ellipsize Mode for the Title.  One of `'head'`, `'middle'`, `'tail'`, `'clip'`.
    *
    * See [`ellipsizeMode`](https://reactnative.dev/docs/text#ellipsizemode)
    */
  var titleEllipsizeMode: js.UndefOr[EllipsizeProp] = js.undefined
  
  /**
    * Truncate Title text such that the total number of lines does not
    * exceed this number.
    */
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Style that is passed to Title element.
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object Description {
  
  inline def apply(theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Description = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], title = null)
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: typingsJapgolly.reactNativePaper.libTypescriptComponentsListListItemMod.Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionEllipsizeMode(value: EllipsizeProp): Self = StObject.set(x, "descriptionEllipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setDescriptionEllipsizeModeUndefined: Self = StObject.set(x, "descriptionEllipsizeMode", js.undefined)
    
    inline def setDescriptionFunction1(value: /* props */ EllipsizeMode => Node): Self = StObject.set(x, "description", js.Any.fromFunction1(value))
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionNumberOfLines(value: Double): Self = StObject.set(x, "descriptionNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNumberOfLinesUndefined: Self = StObject.set(x, "descriptionNumberOfLines", js.undefined)
    
    inline def setDescriptionStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "descriptionStyle", value.asInstanceOf[js.Any])
    
    inline def setDescriptionStyleNull: Self = StObject.set(x, "descriptionStyle", null)
    
    inline def setDescriptionStyleUndefined: Self = StObject.set(x, "descriptionStyle", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
    
    inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLeft(value: /* props */ ColorStyle => Node): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setRight(value: /* props */ ColorStringStyle => Node): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: typingsJapgolly.reactNativePaper.libTypescriptComponentsListListItemMod.Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleEllipsizeMode(value: EllipsizeProp): Self = StObject.set(x, "titleEllipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setTitleEllipsizeModeUndefined: Self = StObject.set(x, "titleEllipsizeMode", js.undefined)
    
    inline def setTitleFunction1(value: /* props */ EllipsizeMode => Node): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
