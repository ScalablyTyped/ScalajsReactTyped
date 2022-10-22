package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactNative.mod.AccessibilityProps
import typingsJapgolly.reactNative.mod.GestureResponderHandlers
import typingsJapgolly.reactNative.mod.Insets
import typingsJapgolly.reactNative.mod.ModalPropsAndroid
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.PointerEvents
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.Touchable
import typingsJapgolly.reactNative.mod.ViewPropsAndroid
import typingsJapgolly.reactNative.mod.ViewPropsIOS
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNative.reactNativeStrings.`box-none`
import typingsJapgolly.reactNative.reactNativeStrings.`box-only`
import typingsJapgolly.reactNative.reactNativeStrings.`landscape-left`
import typingsJapgolly.reactNative.reactNativeStrings.`landscape-right`
import typingsJapgolly.reactNative.reactNativeStrings.`portrait-upside-down`
import typingsJapgolly.reactNative.reactNativeStrings.auto
import typingsJapgolly.reactNative.reactNativeStrings.formSheet
import typingsJapgolly.reactNative.reactNativeStrings.fullScreen
import typingsJapgolly.reactNative.reactNativeStrings.landscape
import typingsJapgolly.reactNative.reactNativeStrings.none
import typingsJapgolly.reactNative.reactNativeStrings.overFullScreen
import typingsJapgolly.reactNative.reactNativeStrings.pageSheet
import typingsJapgolly.reactNative.reactNativeStrings.portrait
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.bottom
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.center
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.fade_
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.none_
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- typingsJapgolly.reactNative.mod.ViewProps because Inheritance from two classes. Inlined pointerEvents, hitSlop, style, onLayout, removeClippedSubviews, nativeID, testID
- typingsJapgolly.reactNative.mod.ModalPropsIOS because var conflicts: onDismiss. Inlined onOrientationChange, supportedOrientations, presentationStyle
- typingsJapgolly.reactNative.mod.ModalBaseProps because var conflicts: animationType, visible. Inlined onShow, transparent, onRequestClose, animated
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typingsJapgolly.reactNative.mod.ModalProps because Inheritance from two classes. Inlined 
- typingsJapgolly.tuyaPanelKit.mod.ModalProps because Inheritance from two classes. Inlined animationType, alignContainer, onMaskPress, modalChildStyle, mask, maskStyle, onlyLastModalVisible, useKeyboardView, visible, activeIdx, onDismiss */ trait PopupTipsProps
  extends StObject
     with TipsProps
     with ModalPropsAndroid
     with ViewPropsAndroid
     with ViewPropsIOS
     with GestureResponderHandlers
     with Touchable
     with PointerEvents
     with AccessibilityProps {
  
  /**
    * @language zh-CN
    * @description 当前的 idx
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description current idx
    * @defaultValue undefined
    */
  var activeIdx: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description modal默认出现的位置
    * @defaultValue 'bottom'
    */
  /**
    * @language en-US
    * @description The default position of the mask
    * @defaultValue 'bottom'
    */
  var alignContainer: js.UndefOr[top | center | bottom] = js.undefined
  
  /**
    * @deprecated Use animationType instead
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description modal出现的动画效果
    * @defaultValue 'fade
    */
  /**
    * @language en-US
    * @description The animation effect of the mask
    * @defaultValue 'fade'
    */
  var animationType: js.UndefOr[fade_ | none_] = js.undefined
  
  /**
    * This defines how far a touch event can start away from the view.
    * Typical interface guidelines recommend touch targets that are at least
    * 30 - 40 points/density-independent pixels. If a Touchable view has
    * a height of 20 the touchable height can be extended to 40 with
    * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch
    * hits two overlapping views.
    */
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否有遮罩层
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether there is a mask layer
    * @defaultValue true
    */
  var mask: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 遮罩层样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Style of the mask layer
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var maskStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @language zh-CN
    * @description Modal 弹出内容的样式
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description The style of modal pop-up content
    * @types <a target='_blank' href='https://reactnative.dev/docs/view-style-props'>StyleProp<ViewStyle></a>
    * @defaultValue null
    */
  var modalChildStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Used to reference react managed views from native code.
    */
  var nativeID: js.UndefOr[String] = js.undefined
  
  /**
    * @language zh-CN
    * @description Modal 组件销毁回调事件，一般用于在弹窗销毁后跳转新的 native 页面。platform: iOS
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Modal component destruction callback event is generally used to jump to a new native page after the pop-up window is destroyed. platform: iOS
    * @defaultValue undefined
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height}}}.
    */
  var onLayout: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 点击遮罩回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Callback of clicking mask
    * @defaultValue () => {}
    */
  var onMaskPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The `onOrientationChange` callback is called when the orientation changes while the modal is being displayed.
    * The orientation provided is only 'portrait' or 'landscape'. This callback is also called on initial render, regardless of the current orientation.
    */
  var onOrientationChange: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * The `onRequestClose` callback is called when the user taps the hardware back button on Android or the menu button on Apple TV.
    *
    * This is required on Apple TV and Android.
    */
  var onRequestClose: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * The `onShow` prop allows passing a function that will be called once the modal has been shown.
    */
  var onShow: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否只显示最后一个弹出的 modal
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether to show only the last pop-up modal
    * @defaultValue true
    */
  var onlyLastModalVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
    *
    * .box-none {
    *   pointer-events: none;
    * }
    * .box-none * {
    *   pointer-events: all;
    * }
    *
    * box-only is the equivalent of
    *
    * .box-only {
    *   pointer-events: all;
    * }
    * .box-only * {
    *   pointer-events: none;
    * }
    *
    * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
    * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
    */
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  
  /**
    * The `presentationStyle` determines the style of modal to show
    */
  var presentationStyle: js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen] = js.undefined
  
  /**
    *
    * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
    * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
    * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
    */
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * The `supportedOrientations` prop allows the modal to be rotated to any of the specified orientations.
    * On iOS, the modal is still restricted by what's specified in your app's Info.plist's UISupportedInterfaceOrientations field.
    */
  var supportedOrientations: js.UndefOr[
    js.Array[
      portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
    ]
  ] = js.undefined
  
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  /**
    * The `transparent` prop determines whether your modal will fill the entire view.
    * Setting this to `true` will render the modal over a transparent background.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否弹出键盘自适应
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Whether to pop up the keyboard adaptive
    * @defaultValue false
    */
  var useKeyboardView: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否显示
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Whether it is visible or not
    * @defaultValue true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PopupTipsProps {
  
  inline def apply(): PopupTipsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupTipsProps]
  }
  
  extension [Self <: PopupTipsProps](x: Self) {
    
    inline def setActiveIdx(value: Double): Self = StObject.set(x, "activeIdx", value.asInstanceOf[js.Any])
    
    inline def setActiveIdxUndefined: Self = StObject.set(x, "activeIdx", js.undefined)
    
    inline def setAlignContainer(value: top | center | bottom): Self = StObject.set(x, "alignContainer", value.asInstanceOf[js.Any])
    
    inline def setAlignContainerUndefined: Self = StObject.set(x, "alignContainer", js.undefined)
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimationType(value: fade_ | none_): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
    
    inline def setMaskStyleNull: Self = StObject.set(x, "maskStyle", null)
    
    inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setModalChildStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "modalChildStyle", value.asInstanceOf[js.Any])
    
    inline def setModalChildStyleNull: Self = StObject.set(x, "modalChildStyle", null)
    
    inline def setModalChildStyleUndefined: Self = StObject.set(x, "modalChildStyle", js.undefined)
    
    inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnLayout(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onLayout", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMaskPress(value: Callback): Self = StObject.set(x, "onMaskPress", value.toJsFn)
    
    inline def setOnMaskPressUndefined: Self = StObject.set(x, "onMaskPress", js.undefined)
    
    inline def setOnOrientationChange(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onOrientationChange", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
    
    inline def setOnRequestClose(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    inline def setOnShow(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnlyLastModalVisible(value: Boolean): Self = StObject.set(x, "onlyLastModalVisible", value.asInstanceOf[js.Any])
    
    inline def setOnlyLastModalVisibleUndefined: Self = StObject.set(x, "onlyLastModalVisible", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setPresentationStyle(value: fullScreen | pageSheet | formSheet | overFullScreen): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSupportedOrientations(
      value: js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
    ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
    
    inline def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
    
    inline def setSupportedOrientationsVarargs(value: (portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`)*): Self = StObject.set(x, "supportedOrientations", js.Array(value*))
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setUseKeyboardView(value: Boolean): Self = StObject.set(x, "useKeyboardView", value.asInstanceOf[js.Any])
    
    inline def setUseKeyboardViewUndefined: Self = StObject.set(x, "useKeyboardView", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
