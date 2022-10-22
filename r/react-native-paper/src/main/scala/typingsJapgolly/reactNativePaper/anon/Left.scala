package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  /**
    * @internal
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback which returns a React element to display on the left side.
    */
  var left: js.UndefOr[js.Function1[/* props */ SizeNumber, Node]] = js.undefined
  
  /**
    * Style for the left element wrapper.
    */
  var leftStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Callback which returns a React element to display on the right side.
    */
  var right: js.UndefOr[js.Function1[/* props */ SizeNumber, Node]] = js.undefined
  
  /**
    * Style for the right element wrapper.
    */
  var rightStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Text for the subtitle. Note that this will only accept a string or `<Text>`-based node.
    */
  var subtitle: js.UndefOr[Node] = js.undefined
  
  /**
    * Number of lines for the subtitle.
    */
  var subtitleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Style for the subtitle.
    */
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Text for the title. Note that this will only accept a string or `<Text>`-based node.
    */
  var title: Node
  
  /**
    * Number of lines for the title.
    */
  var titleNumberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Style for the title.
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  /**
    * @internal
    */
  var total: js.UndefOr[Double] = js.undefined
}
object Left {
  
  inline def apply(theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Left = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], title = null)
    __obj.asInstanceOf[Left]
  }
  
  extension [Self <: Left](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLeft(value: /* props */ SizeNumber => Node): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
    
    inline def setLeftStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftStyleNull: Self = StObject.set(x, "leftStyle", null)
    
    inline def setLeftStyleUndefined: Self = StObject.set(x, "leftStyle", js.undefined)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: /* props */ SizeNumber => Node): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
    
    inline def setRightStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightStyle", value.asInstanceOf[js.Any])
    
    inline def setRightStyleNull: Self = StObject.set(x, "rightStyle", null)
    
    inline def setRightStyleUndefined: Self = StObject.set(x, "rightStyle", js.undefined)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
    
    inline def setSubtitleNumberOfLines(value: Double): Self = StObject.set(x, "subtitleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setSubtitleNumberOfLinesUndefined: Self = StObject.set(x, "subtitleNumberOfLines", js.undefined)
    
    inline def setSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStyleNull: Self = StObject.set(x, "subtitleStyle", null)
    
    inline def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
    
    inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
    
    inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
