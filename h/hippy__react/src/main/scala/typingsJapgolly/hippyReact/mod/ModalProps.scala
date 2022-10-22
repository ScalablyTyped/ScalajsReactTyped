package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.hippyReact.hippyReactStrings.fade
import typingsJapgolly.hippyReact.hippyReactStrings.none
import typingsJapgolly.hippyReact.hippyReactStrings.slide
import typingsJapgolly.hippyReact.hippyReactStrings.slide_fade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  /**
    * Enable animation to popup or hide
    *
    * Default: true
    *
    * > Deprecated, use animationType to instance of
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The animation effect when toggle
    *
    * Default: 'slide'
    */
  var animationType: js.UndefOr[none | slide | fade | slide_fade] = js.undefined
  
  /**
    * Hide statusbar texts when Modal is showing
    *
    * Default: false
    */
  var autoHideStatusBar: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * Be text color in statusbar dark theme.
    * Default: false
    */
  var darkStatusBarText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Make the Modal content be under of statusbar.
    * > Android Only
    *
    * Default: false
    */
  var immersionStatusBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Trigger when the Modal will hide
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Trigger when the device orientation changed.
    */
  var onOrientationChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Trigger when hardware button pressed
    * > Android Only
    */
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Trigger when the Modal will show
    */
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Primary key
    * > iOS only
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
  
  /**
    * Modal supports orientations
    */
  var supportedOrientations: js.UndefOr[js.Array[ModalOrientation]] = js.undefined
  
  /**
    * Background is transparent or not
    * Default: true
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show or hide
    *
    * Default false
    */
  var visible: Boolean
}
object ModalProps {
  
  inline def apply(visible: Boolean): ModalProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  
  extension [Self <: ModalProps](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimationType(value: none | slide | fade | slide_fade): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setAutoHideStatusBar(value: Boolean): Self = StObject.set(x, "autoHideStatusBar", value.asInstanceOf[js.Any])
    
    inline def setAutoHideStatusBarUndefined: Self = StObject.set(x, "autoHideStatusBar", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDarkStatusBarText(value: Boolean): Self = StObject.set(x, "darkStatusBarText", value.asInstanceOf[js.Any])
    
    inline def setDarkStatusBarTextUndefined: Self = StObject.set(x, "darkStatusBarText", js.undefined)
    
    inline def setImmersionStatusBar(value: Boolean): Self = StObject.set(x, "immersionStatusBar", value.asInstanceOf[js.Any])
    
    inline def setImmersionStatusBarUndefined: Self = StObject.set(x, "immersionStatusBar", js.undefined)
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnOrientationChange(value: Callback): Self = StObject.set(x, "onOrientationChange", value.toJsFn)
    
    inline def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
    
    inline def setOnRequestClose(value: Callback): Self = StObject.set(x, "onRequestClose", value.toJsFn)
    
    inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setSupportedOrientations(value: js.Array[ModalOrientation]): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
    
    inline def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
    
    inline def setSupportedOrientationsVarargs(value: ModalOrientation*): Self = StObject.set(x, "supportedOrientations", js.Array(value*))
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
