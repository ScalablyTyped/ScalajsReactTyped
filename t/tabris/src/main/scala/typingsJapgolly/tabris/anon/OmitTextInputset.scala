package typingsJapgolly.tabris.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tabris.mod.AnimationOptions
import typingsJapgolly.tabris.mod.Bounds
import typingsJapgolly.tabris.mod.BoxDimensions
import typingsJapgolly.tabris.mod.ChangeListeners
import typingsJapgolly.tabris.mod.ColorValue
import typingsJapgolly.tabris.mod.Composite
import typingsJapgolly.tabris.mod.ConstraintValue
import typingsJapgolly.tabris.mod.Dimension
import typingsJapgolly.tabris.mod.EventObject
import typingsJapgolly.tabris.mod.FontValue
import typingsJapgolly.tabris.mod.ImageValue
import typingsJapgolly.tabris.mod.JSXAttributes
import typingsJapgolly.tabris.mod.LayoutDataValue
import typingsJapgolly.tabris.mod.LinearGradientValue
import typingsJapgolly.tabris.mod.Listeners
import typingsJapgolly.tabris.mod.NativeObject
import typingsJapgolly.tabris.mod.Omit
import typingsJapgolly.tabris.mod.Properties
import typingsJapgolly.tabris.mod.Selector
import typingsJapgolly.tabris.mod.SiblingReferenceValue
import typingsJapgolly.tabris.mod.TextInputAcceptEvent
import typingsJapgolly.tabris.mod.TextInputBeforeTextChangeEvent
import typingsJapgolly.tabris.mod.TextInputInputEvent
import typingsJapgolly.tabris.mod.TextInputSelectEvent
import typingsJapgolly.tabris.mod.Transformation
import typingsJapgolly.tabris.mod.Widget
import typingsJapgolly.tabris.mod.WidgetCollection
import typingsJapgolly.tabris.mod.WidgetLongPressEvent
import typingsJapgolly.tabris.mod.WidgetPanEvent
import typingsJapgolly.tabris.mod.WidgetResizeEvent
import typingsJapgolly.tabris.mod.WidgetSwipeEvent
import typingsJapgolly.tabris.mod.WidgetTapEvent
import typingsJapgolly.tabris.mod.WidgetTouchEvent
import typingsJapgolly.tabris.mod.widgets.TextInput
import typingsJapgolly.tabris.tabrisBooleans.`false`
import typingsJapgolly.tabris.tabrisBooleans.`true`
import typingsJapgolly.tabris.tabrisStrings.`class`
import typingsJapgolly.tabris.tabrisStrings.alignment
import typingsJapgolly.tabris.tabrisStrings.all
import typingsJapgolly.tabris.tabrisStrings.ascii
import typingsJapgolly.tabris.tabrisStrings.auto
import typingsJapgolly.tabris.tabrisStrings.autoCapitalize
import typingsJapgolly.tabris.tabrisStrings.autoCorrect
import typingsJapgolly.tabris.tabrisStrings.background
import typingsJapgolly.tabris.tabrisStrings.baseline
import typingsJapgolly.tabris.tabrisStrings.borderColor
import typingsJapgolly.tabris.tabrisStrings.bottom
import typingsJapgolly.tabris.tabrisStrings.bounds
import typingsJapgolly.tabris.tabrisStrings.centerX
import typingsJapgolly.tabris.tabrisStrings.centerY
import typingsJapgolly.tabris.tabrisStrings.classList
import typingsJapgolly.tabris.tabrisStrings.cornerRadius
import typingsJapgolly.tabris.tabrisStrings.cursorColor
import typingsJapgolly.tabris.tabrisStrings.data
import typingsJapgolly.tabris.tabrisStrings.decimal
import typingsJapgolly.tabris.tabrisStrings.default
import typingsJapgolly.tabris.tabrisStrings.done
import typingsJapgolly.tabris.tabrisStrings.editable
import typingsJapgolly.tabris.tabrisStrings.elevation
import typingsJapgolly.tabris.tabrisStrings.email
import typingsJapgolly.tabris.tabrisStrings.enabled
import typingsJapgolly.tabris.tabrisStrings.enterKeyType
import typingsJapgolly.tabris.tabrisStrings.excludeFromLayout
import typingsJapgolly.tabris.tabrisStrings.fill
import typingsJapgolly.tabris.tabrisStrings.floatMessage
import typingsJapgolly.tabris.tabrisStrings.focused
import typingsJapgolly.tabris.tabrisStrings.font
import typingsJapgolly.tabris.tabrisStrings.go
import typingsJapgolly.tabris.tabrisStrings.height
import typingsJapgolly.tabris.tabrisStrings.highlightOnTouch
import typingsJapgolly.tabris.tabrisStrings.id
import typingsJapgolly.tabris.tabrisStrings.jsxAttributes
import typingsJapgolly.tabris.tabrisStrings.keepFocus
import typingsJapgolly.tabris.tabrisStrings.keyboard
import typingsJapgolly.tabris.tabrisStrings.keyboardAppearanceMode
import typingsJapgolly.tabris.tabrisStrings.layoutData
import typingsJapgolly.tabris.tabrisStrings.left
import typingsJapgolly.tabris.tabrisStrings.maxChars
import typingsJapgolly.tabris.tabrisStrings.message
import typingsJapgolly.tabris.tabrisStrings.messageColor
import typingsJapgolly.tabris.tabrisStrings.multiline
import typingsJapgolly.tabris.tabrisStrings.never
import typingsJapgolly.tabris.tabrisStrings.next
import typingsJapgolly.tabris.tabrisStrings.none
import typingsJapgolly.tabris.tabrisStrings.number
import typingsJapgolly.tabris.tabrisStrings.numbersAndPunctuation
import typingsJapgolly.tabris.tabrisStrings.onfocus
import typingsJapgolly.tabris.tabrisStrings.ontouch
import typingsJapgolly.tabris.tabrisStrings.opacity
import typingsJapgolly.tabris.tabrisStrings.outline
import typingsJapgolly.tabris.tabrisStrings.password
import typingsJapgolly.tabris.tabrisStrings.phone
import typingsJapgolly.tabris.tabrisStrings.revealPassword
import typingsJapgolly.tabris.tabrisStrings.right
import typingsJapgolly.tabris.tabrisStrings.search
import typingsJapgolly.tabris.tabrisStrings.selection
import typingsJapgolly.tabris.tabrisStrings.send
import typingsJapgolly.tabris.tabrisStrings.sentence
import typingsJapgolly.tabris.tabrisStrings.set
import typingsJapgolly.tabris.tabrisStrings.text
import typingsJapgolly.tabris.tabrisStrings.textColor
import typingsJapgolly.tabris.tabrisStrings.top
import typingsJapgolly.tabris.tabrisStrings.transform
import typingsJapgolly.tabris.tabrisStrings.underline
import typingsJapgolly.tabris.tabrisStrings.url
import typingsJapgolly.tabris.tabrisStrings.visible
import typingsJapgolly.tabris.tabrisStrings.width
import typingsJapgolly.tabris.tabrisStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.widgets.TextInput, 'set'> */
trait OmitTextInputset extends StObject {
  
  @JSName("$getProperty")
  def $getProperty(name: String): Any
  
  @JSName("$getPropertyGetter")
  def $getPropertyGetter(propertyName: String): Any
  @JSName("$getPropertyGetter")
  var $getPropertyGetter_Original: js.Function1[/* propertyName */ String, Any]
  
  @JSName("$getPropertySetter")
  def $getPropertySetter(propertyName: String): Any
  @JSName("$getPropertySetter")
  var $getPropertySetter_Original: js.Function1[/* propertyName */ String, Any]
  
  @JSName("$getProperty")
  var $getProperty_Original: js.Function1[/* name */ String, Any]
  
  @JSName("$props")
  var $props: Any
  
  @JSName("$setProperty")
  def $setProperty(name: String, value: Any): Unit
  @JSName("$setProperty")
  var $setProperty_Original: js.Function2[/* name */ String, /* value */ Any, Unit]
  
  @JSName("$trigger")
  def $trigger(eventType: String): Unit
  @JSName("$trigger")
  def $trigger(eventType: String, eventData: js.Object): Unit
  @JSName("$trigger")
  var $trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Unit]
  
  def _checkDisposed(): Unit
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit]
  
  def _decodeProperty(propertyName: String, value: Any): Any
  @JSName("_decodeProperty")
  var _decodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ Any, Any]
  
  def _dispose(): Unit
  def _dispose(skipNative: Boolean): Unit
  @JSName("_dispose")
  var _dispose_Original: js.Function1[/* skipNative */ js.UndefOr[Boolean], Unit]
  
  def _encodeProperty(propertyName: String, value: Any): Any
  @JSName("_encodeProperty")
  var _encodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ Any, Any]
  
  def _getDefaultPropertyValue(propertyName: String): Unit
  @JSName("_getDefaultPropertyValue")
  var _getDefaultPropertyValue_Original: js.Function1[/* propertyName */ String, Unit]
  
  def _getStoredProperty(propertyName: String): Any
  @JSName("_getStoredProperty")
  var _getStoredProperty_Original: js.Function1[/* propertyName */ String, Any]
  
  def _getTypeDef(propertyName: String): Any
  @JSName("_getTypeDef")
  var _getTypeDef_Original: js.Function1[/* propertyName */ String, Any]
  
  def _getXMLAttributes(): js.Array[js.Tuple2[String, Any]]
  @JSName("_getXMLAttributes")
  var _getXMLAttributes_Original: js.Function0[js.Array[js.Tuple2[String, Any]]]
  
  def _getXMLContent(): js.Array[String]
  @JSName("_getXMLContent")
  var _getXMLContent_Original: js.Function0[js.Array[String]]
  
  def _getXMLElementName(): String
  @JSName("_getXMLElementName")
  var _getXMLElementName_Original: js.Function0[String]
  
  def _getXMLFooter(hasChild: Boolean): String
  @JSName("_getXMLFooter")
  var _getXMLFooter_Original: js.Function1[/* hasChild */ Boolean, String]
  
  def _getXMLHeader(hasChild: Boolean): String
  @JSName("_getXMLHeader")
  var _getXMLHeader_Original: js.Function1[/* hasChild */ Boolean, String]
  
  var _isDisposed: js.UndefOr[`true`] = js.undefined
  
  def _isListening(eventType: String): Boolean
  @JSName("_isListening")
  var _isListening_Original: js.Function1[/* eventType */ String, Boolean]
  
  def _listen(eventName: String, listening: Boolean): Unit
  @JSName("_listen")
  var _listen_Original: js.Function2[/* eventName */ String, /* listening */ Boolean, Unit]
  
  def _nativeCall(methodName: String, parameters: js.Object): Any
  @JSName("_nativeCall")
  var _nativeCall_Original: js.Function2[/* methodName */ String, /* parameters */ js.Object, Any]
  
  def _nativeCreate(): Unit
  def _nativeCreate(param: StringDictionary[Any]): Unit
  @JSName("_nativeCreate")
  var _nativeCreate_Original: js.Function1[/* param */ js.UndefOr[StringDictionary[Any]], Unit]
  
  def _nativeGet(propertyName: String): Any
  @JSName("_nativeGet")
  var _nativeGet_Original: js.Function1[/* propertyName */ String, Any]
  
  def _nativeListen(eventType: String, listen: Boolean): Unit
  @JSName("_nativeListen")
  var _nativeListen_Original: js.Function2[/* eventType */ String, /* listen */ Boolean, Unit]
  
  def _nativeSet(propertyName: String, value: Any): Unit
  @JSName("_nativeSet")
  var _nativeSet_Original: js.Function2[/* propertyName */ String, /* value */ Any, Unit]
  
  def _nativeType(): String
  @JSName("_nativeType")
  var _nativeType_Original: js.Function0[String]
  
  def _onoff(eventType: String, listening: Boolean, listener: js.Function): Unit
  @JSName("_onoff")
  var _onoff_Original: js.Function3[/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function, Unit]
  
  def _register(): Unit
  @JSName("_register")
  var _register_Original: js.Function0[Unit]
  
  def _release(): Unit
  @JSName("_release")
  var _release_Original: js.Function0[Unit]
  
  def _reorderProperties(propertyNames: js.Array[String]): js.Array[String]
  @JSName("_reorderProperties")
  var _reorderProperties_Original: js.Function1[/* propertyNames */ js.Array[String], js.Array[String]]
  
  def _setParent(parent: Composite[Widget[Any]]): Unit
  def _setParent(parent: Composite[Widget[Any]], index: Double): Unit
  @JSName("_setParent")
  var _setParent_Original: js.Function2[/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double], Unit]
  
  def _storeProperty(propertyName: String, encodedValue: Any): Unit
  @JSName("_storeProperty")
  var _storeProperty_Original: js.Function2[/* propertyName */ String, /* encodedValue */ Any, Unit]
  
  def _trigger(eventType: String): Boolean
  def _trigger(eventType: String, eventData: js.Object): Boolean
  
  def _triggerChangeEvent(propertyName: String, newEncodedValue: Any): Unit
  @JSName("_triggerChangeEvent")
  var _triggerChangeEvent_Original: js.Function2[/* propertyName */ String, /* newEncodedValue */ Any, Unit]
  
  @JSName("_trigger")
  var _trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Boolean]
  
  def _wasSet(propertyName: String): Boolean
  @JSName("_wasSet")
  var _wasSet_Original: js.Function1[/* propertyName */ String, Boolean]
  
  var absoluteBounds: Bounds
  
  var alignment: centerX | left | right
  
  def animate(properties: Opacity, options: AnimationOptions): js.Promise[Unit]
  @JSName("animate")
  var animate_Original: js.Function2[/* properties */ Opacity, /* options */ AnimationOptions, js.Promise[Unit]]
  
  def appendTo(parent: Composite[Widget[Any]]): TextInput
  @JSName("appendTo")
  var appendTo_Original: js.Function1[/* parent */ Composite[Widget[Any]], TextInput]
  
  var autoCapitalize: all | `false` | none | sentence | `true` | word
  
  var autoCorrect: Boolean
  
  var background: LinearGradientValue | ColorValue | ImageValue
  
  var baseline: SiblingReferenceValue | auto | `true`
  
  var borderColor: ColorValue
  
  var bottom: ConstraintValue
  
  var bounds: Bounds
  
  var centerX: typingsJapgolly.tabris.mod.Offset | auto | `true`
  
  var centerY: typingsJapgolly.tabris.mod.Offset | auto | `true`
  
  var cid: String
  
  var `class`: String
  
  var classList: js.Array[String]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[TextInput, Omit[TextInput, set]]], Any]
  
  var cornerRadius: Double
  
  var cursorColor: ColorValue
  
  var data: Any
  
  var defineChangeEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvents: js.UndefOr[Any] = js.undefined
  
  var defineProperties: js.UndefOr[Any] = js.undefined
  
  var defineProperty: js.UndefOr[Any] = js.undefined
  
  def detach(): TextInput
  @JSName("detach")
  var detach_Original: js.Function0[TextInput]
  
  def dispose(): Unit
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit]
  
  var editable: Boolean
  
  var elevation: Double
  
  var enabled: Boolean
  
  var enterKeyType: default | done | go | next | search | send
  
  var excludeFromLayout: Boolean
  
  var extend: js.UndefOr[Any] = js.undefined
  
  var floatMessage: Boolean
  
  var focused: Boolean
  
  var font: FontValue
  
  var height: Dimension | auto
  
  var highlightOnTouch: Boolean
  
  var id: String
  
  def insertAfter(widget: Widget[Any]): TextInput
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget[Any], TextInput]
  
  def insertBefore(widget: Widget[Any]): TextInput
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget[Any], TextInput]
  
  def isDisposed(): Boolean
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean]
  
  var jsxAttributes: (JSXAttributes[
    TextInput, 
    Omit[TextInput, set | typingsJapgolly.tabris.tabrisStrings.jsxAttributes]
  ]) & `3`
  
  var keepFocus: Boolean
  
  var keyboard: ascii | decimal | default | email | number | numbersAndPunctuation | phone | url
  
  var keyboardAppearanceMode: never | ontouch | onfocus
  
  var layoutData: LayoutDataValue
  
  var left: ConstraintValue
  
  var maxChars: Double
  
  var message: String
  
  var messageColor: ColorValue
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): TextInput
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): TextInput
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    TextInput
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): TextInput
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): TextInput
  
  var onAccept: Listeners[TextInputAcceptEvent[TextInput]]
  
  var onAlignmentChanged: ChangeListeners[TextInput, alignment]
  
  var onAutoCapitalizeChanged: ChangeListeners[TextInput, autoCapitalize]
  
  var onAutoCorrectChanged: ChangeListeners[TextInput, autoCorrect]
  
  var onBackgroundChanged: ChangeListeners[TextInput, background]
  
  var onBaselineChanged: ChangeListeners[TextInput, baseline]
  
  var onBeforeTextChange: Listeners[TextInputBeforeTextChangeEvent[TextInput]]
  
  var onBlur: Listeners[EventObject[TextInput]]
  
  var onBorderColorChanged: ChangeListeners[TextInput, borderColor]
  
  var onBottomChanged: ChangeListeners[TextInput, bottom]
  
  var onBoundsChanged: ChangeListeners[TextInput, bounds]
  
  var onCenterXChanged: ChangeListeners[TextInput, centerX]
  
  var onCenterYChanged: ChangeListeners[TextInput, centerY]
  
  var onClassChanged: ChangeListeners[TextInput, `class`]
  
  var onClassListChanged: ChangeListeners[TextInput, classList]
  
  var onCornerRadiusChanged: ChangeListeners[TextInput, cornerRadius]
  
  var onCursorColorChanged: ChangeListeners[TextInput, cursorColor]
  
  var onDataChanged: ChangeListeners[TextInput, data]
  
  var onDispose: Listeners[EventObject[TextInput]]
  
  var onEditableChanged: ChangeListeners[TextInput, editable]
  
  var onElevationChanged: ChangeListeners[TextInput, elevation]
  
  var onEnabledChanged: ChangeListeners[TextInput, enabled]
  
  var onEnterKeyTypeChanged: ChangeListeners[TextInput, enterKeyType]
  
  var onExcludeFromLayoutChanged: ChangeListeners[TextInput, excludeFromLayout]
  
  var onFloatMessageChanged: ChangeListeners[TextInput, floatMessage]
  
  var onFocus: Listeners[EventObject[TextInput]]
  
  var onFocusedChanged: ChangeListeners[TextInput, focused]
  
  var onFontChanged: ChangeListeners[TextInput, font]
  
  var onHeightChanged: ChangeListeners[TextInput, height]
  
  var onHighlightOnTouchChanged: ChangeListeners[TextInput, highlightOnTouch]
  
  var onIdChanged: ChangeListeners[TextInput, id]
  
  var onInput: Listeners[TextInputInputEvent[TextInput]]
  
  var onKeepFocusChanged: ChangeListeners[TextInput, keepFocus]
  
  var onKeyboardAppearanceModeChanged: ChangeListeners[TextInput, keyboardAppearanceMode]
  
  var onKeyboardChanged: ChangeListeners[TextInput, keyboard]
  
  var onLayoutDataChanged: ChangeListeners[TextInput, layoutData]
  
  var onLeftChanged: ChangeListeners[TextInput, left]
  
  var onLongPress: Listeners[WidgetLongPressEvent[TextInput]]
  
  var onMaxCharsChanged: ChangeListeners[TextInput, maxChars]
  
  var onMessageChanged: ChangeListeners[TextInput, message]
  
  var onMessageColorChanged: ChangeListeners[TextInput, messageColor]
  
  var onOpacityChanged: ChangeListeners[TextInput, opacity]
  
  var onPan: Listeners[WidgetPanEvent[TextInput]]
  
  var onPanDown: Listeners[WidgetPanEvent[TextInput]]
  
  var onPanHorizontal: Listeners[WidgetPanEvent[TextInput]]
  
  var onPanLeft: Listeners[WidgetPanEvent[TextInput]]
  
  var onPanRight: Listeners[WidgetPanEvent[TextInput]]
  
  var onPanUp: Listeners[WidgetPanEvent[TextInput]]
  
  var onPanVertical: Listeners[WidgetPanEvent[TextInput]]
  
  var onResize: Listeners[WidgetResizeEvent[TextInput]]
  
  var onRevealPasswordChanged: ChangeListeners[TextInput, revealPassword]
  
  var onRightChanged: ChangeListeners[TextInput, right]
  
  var onSelect: Listeners[TextInputSelectEvent[TextInput]]
  
  var onSelectionChanged: ChangeListeners[TextInput, selection]
  
  var onSwipeDown: Listeners[WidgetSwipeEvent[TextInput]]
  
  var onSwipeLeft: Listeners[WidgetSwipeEvent[TextInput]]
  
  var onSwipeRight: Listeners[WidgetSwipeEvent[TextInput]]
  
  var onSwipeUp: Listeners[WidgetSwipeEvent[TextInput]]
  
  var onTap: Listeners[WidgetTapEvent[TextInput]]
  
  var onTextChanged: ChangeListeners[TextInput, text]
  
  var onTextColorChanged: ChangeListeners[TextInput, textColor]
  
  var onTopChanged: ChangeListeners[TextInput, top]
  
  var onTouchCancel: Listeners[WidgetTouchEvent[TextInput]]
  
  var onTouchEnd: Listeners[WidgetTouchEvent[TextInput]]
  
  var onTouchMove: Listeners[WidgetTouchEvent[TextInput]]
  
  var onTouchStart: Listeners[WidgetTouchEvent[TextInput]]
  
  var onTransformChanged: ChangeListeners[TextInput, transform]
  
  var onVisibleChanged: ChangeListeners[TextInput, visible]
  
  var onWidthChanged: ChangeListeners[TextInput, width]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    TextInput
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): TextInput
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): TextInput
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    TextInput
  ]
  
  var opacity: Double
  
  var padding: js.UndefOr[BoxDimensions | Null] = js.undefined
  
  def parent(): Composite[Widget[Any]]
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget[Any]]]
  
  var revealPassword: Boolean
  
  var right: ConstraintValue
  
  var selection: js.Array[Double]
  
  def siblings[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def siblings[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("siblings")
  var siblings_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var style: default | fill | none | outline | underline
  
  var text: String
  
  var textColor: ColorValue
  
  var top: ConstraintValue
  
  var transform: Transformation
  
  def trigger(`type`: String): TextInput
  
  def triggerAsync(`type`: String): js.Promise[TextInput]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[TextInput]]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, TextInput]
  
  var `type`: default | multiline | password | search
  
  var visible: Boolean
  
  var width: Dimension | auto
}
object OmitTextInputset {
  
  inline def apply(
    $getProperty: /* name */ String => Any,
    $getPropertyGetter: /* propertyName */ String => Any,
    $getPropertySetter: /* propertyName */ String => Any,
    $props: Any,
    $setProperty: (/* name */ String, /* value */ Any) => Callback,
    $trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Callback,
    _checkDisposed: Callback,
    _decodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _dispose: /* skipNative */ js.UndefOr[Boolean] => Callback,
    _encodeProperty: (/* propertyName */ String, /* value */ Any) => Any,
    _getDefaultPropertyValue: /* propertyName */ String => Callback,
    _getStoredProperty: /* propertyName */ String => Any,
    _getTypeDef: /* propertyName */ String => Any,
    _getXMLAttributes: CallbackTo[js.Array[js.Tuple2[String, Any]]],
    _getXMLContent: CallbackTo[js.Array[String]],
    _getXMLElementName: CallbackTo[String],
    _getXMLFooter: /* hasChild */ Boolean => String,
    _getXMLHeader: /* hasChild */ Boolean => String,
    _isListening: /* eventType */ String => Boolean,
    _listen: (/* eventName */ String, /* listening */ Boolean) => Callback,
    _nativeCall: (/* methodName */ String, /* parameters */ js.Object) => Any,
    _nativeCreate: /* param */ js.UndefOr[StringDictionary[Any]] => Callback,
    _nativeGet: /* propertyName */ String => Any,
    _nativeListen: (/* eventType */ String, /* listen */ Boolean) => Callback,
    _nativeSet: (/* propertyName */ String, /* value */ Any) => Callback,
    _nativeType: CallbackTo[String],
    _onoff: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Callback,
    _register: Callback,
    _release: Callback,
    _reorderProperties: /* propertyNames */ js.Array[String] => js.Array[String],
    _setParent: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Callback,
    _storeProperty: (/* propertyName */ String, /* encodedValue */ Any) => Callback,
    _trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean,
    _triggerChangeEvent: (/* propertyName */ String, /* newEncodedValue */ Any) => Callback,
    _wasSet: /* propertyName */ String => Boolean,
    absoluteBounds: Bounds,
    alignment: centerX | left | right,
    animate: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit],
    appendTo: /* parent */ Composite[Widget[Any]] => TextInput,
    autoCapitalize: all | `false` | none | sentence | `true` | word,
    autoCorrect: Boolean,
    baseline: SiblingReferenceValue | auto | `true`,
    bottom: ConstraintValue,
    bounds: Bounds,
    centerX: typingsJapgolly.tabris.mod.Offset | auto | `true`,
    centerY: typingsJapgolly.tabris.mod.Offset | auto | `true`,
    cid: String,
    `class`: String,
    classList: js.Array[String],
    constructor: /* properties */ js.UndefOr[Properties[TextInput, Omit[TextInput, set]]] => Any,
    cornerRadius: Double,
    data: Any,
    detach: CallbackTo[TextInput],
    dispose: Callback,
    editable: Boolean,
    elevation: Double,
    enabled: Boolean,
    enterKeyType: default | done | go | next | search | send,
    excludeFromLayout: Boolean,
    floatMessage: Boolean,
    focused: Boolean,
    height: Dimension | auto,
    highlightOnTouch: Boolean,
    id: String,
    insertAfter: /* widget */ Widget[Any] => TextInput,
    insertBefore: /* widget */ Widget[Any] => TextInput,
    isDisposed: CallbackTo[Boolean],
    jsxAttributes: (JSXAttributes[TextInput, Omit[TextInput, set | jsxAttributes]]) & `3`,
    keepFocus: Boolean,
    keyboard: ascii | decimal | default | email | number | numbersAndPunctuation | phone | url,
    keyboardAppearanceMode: never | ontouch | onfocus,
    layoutData: LayoutDataValue,
    left: ConstraintValue,
    maxChars: Double,
    message: String,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => TextInput,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TextInput,
    onAccept: Listeners[TextInputAcceptEvent[TextInput]],
    onAlignmentChanged: ChangeListeners[TextInput, alignment],
    onAutoCapitalizeChanged: ChangeListeners[TextInput, autoCapitalize],
    onAutoCorrectChanged: ChangeListeners[TextInput, autoCorrect],
    onBackgroundChanged: ChangeListeners[TextInput, background],
    onBaselineChanged: ChangeListeners[TextInput, baseline],
    onBeforeTextChange: Listeners[TextInputBeforeTextChangeEvent[TextInput]],
    onBlur: Listeners[EventObject[TextInput]],
    onBorderColorChanged: ChangeListeners[TextInput, borderColor],
    onBottomChanged: ChangeListeners[TextInput, bottom],
    onBoundsChanged: ChangeListeners[TextInput, bounds],
    onCenterXChanged: ChangeListeners[TextInput, centerX],
    onCenterYChanged: ChangeListeners[TextInput, centerY],
    onClassChanged: ChangeListeners[TextInput, `class`],
    onClassListChanged: ChangeListeners[TextInput, classList],
    onCornerRadiusChanged: ChangeListeners[TextInput, cornerRadius],
    onCursorColorChanged: ChangeListeners[TextInput, cursorColor],
    onDataChanged: ChangeListeners[TextInput, data],
    onDispose: Listeners[EventObject[TextInput]],
    onEditableChanged: ChangeListeners[TextInput, editable],
    onElevationChanged: ChangeListeners[TextInput, elevation],
    onEnabledChanged: ChangeListeners[TextInput, enabled],
    onEnterKeyTypeChanged: ChangeListeners[TextInput, enterKeyType],
    onExcludeFromLayoutChanged: ChangeListeners[TextInput, excludeFromLayout],
    onFloatMessageChanged: ChangeListeners[TextInput, floatMessage],
    onFocus: Listeners[EventObject[TextInput]],
    onFocusedChanged: ChangeListeners[TextInput, focused],
    onFontChanged: ChangeListeners[TextInput, font],
    onHeightChanged: ChangeListeners[TextInput, height],
    onHighlightOnTouchChanged: ChangeListeners[TextInput, highlightOnTouch],
    onIdChanged: ChangeListeners[TextInput, id],
    onInput: Listeners[TextInputInputEvent[TextInput]],
    onKeepFocusChanged: ChangeListeners[TextInput, keepFocus],
    onKeyboardAppearanceModeChanged: ChangeListeners[TextInput, keyboardAppearanceMode],
    onKeyboardChanged: ChangeListeners[TextInput, keyboard],
    onLayoutDataChanged: ChangeListeners[TextInput, layoutData],
    onLeftChanged: ChangeListeners[TextInput, left],
    onLongPress: Listeners[WidgetLongPressEvent[TextInput]],
    onMaxCharsChanged: ChangeListeners[TextInput, maxChars],
    onMessageChanged: ChangeListeners[TextInput, message],
    onMessageColorChanged: ChangeListeners[TextInput, messageColor],
    onOpacityChanged: ChangeListeners[TextInput, opacity],
    onPan: Listeners[WidgetPanEvent[TextInput]],
    onPanDown: Listeners[WidgetPanEvent[TextInput]],
    onPanHorizontal: Listeners[WidgetPanEvent[TextInput]],
    onPanLeft: Listeners[WidgetPanEvent[TextInput]],
    onPanRight: Listeners[WidgetPanEvent[TextInput]],
    onPanUp: Listeners[WidgetPanEvent[TextInput]],
    onPanVertical: Listeners[WidgetPanEvent[TextInput]],
    onResize: Listeners[WidgetResizeEvent[TextInput]],
    onRevealPasswordChanged: ChangeListeners[TextInput, revealPassword],
    onRightChanged: ChangeListeners[TextInput, right],
    onSelect: Listeners[TextInputSelectEvent[TextInput]],
    onSelectionChanged: ChangeListeners[TextInput, selection],
    onSwipeDown: Listeners[WidgetSwipeEvent[TextInput]],
    onSwipeLeft: Listeners[WidgetSwipeEvent[TextInput]],
    onSwipeRight: Listeners[WidgetSwipeEvent[TextInput]],
    onSwipeUp: Listeners[WidgetSwipeEvent[TextInput]],
    onTap: Listeners[WidgetTapEvent[TextInput]],
    onTextChanged: ChangeListeners[TextInput, text],
    onTextColorChanged: ChangeListeners[TextInput, textColor],
    onTopChanged: ChangeListeners[TextInput, top],
    onTouchCancel: Listeners[WidgetTouchEvent[TextInput]],
    onTouchEnd: Listeners[WidgetTouchEvent[TextInput]],
    onTouchMove: Listeners[WidgetTouchEvent[TextInput]],
    onTouchStart: Listeners[WidgetTouchEvent[TextInput]],
    onTransformChanged: ChangeListeners[TextInput, transform],
    onVisibleChanged: ChangeListeners[TextInput, visible],
    onWidthChanged: ChangeListeners[TextInput, width],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TextInput,
    opacity: Double,
    parent: CallbackTo[Composite[Widget[Any]]],
    revealPassword: Boolean,
    right: ConstraintValue,
    selection: js.Array[Double],
    siblings: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    style: default | fill | none | outline | underline,
    text: String,
    top: ConstraintValue,
    transform: Transformation,
    trigger: /* type */ String => TextInput,
    triggerAsync: /* type */ String => js.Promise[TextInput],
    `type`: default | multiline | password | search,
    visible: Boolean,
    width: Dimension | auto
  ): OmitTextInputset = {
    val __obj = js.Dynamic.literal($getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => ($setProperty(t0, t1)).runNow()), $trigger = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => ($trigger(t0, t1)).runNow()), _checkDisposed = _checkDisposed.toJsFn, _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1((t0: /* skipNative */ js.UndefOr[Boolean]) => _dispose(t0).runNow()), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _getDefaultPropertyValue = js.Any.fromFunction1((t0: /* propertyName */ String) => _getDefaultPropertyValue(t0).runNow()), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = _getXMLAttributes.toJsFn, _getXMLContent = _getXMLContent.toJsFn, _getXMLElementName = _getXMLElementName.toJsFn, _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _isListening = js.Any.fromFunction1(_isListening), _listen = js.Any.fromFunction2((t0: /* eventName */ String, t1: /* listening */ Boolean) => (_listen(t0, t1)).runNow()), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1((t0: /* param */ js.UndefOr[StringDictionary[Any]]) => _nativeCreate(t0).runNow()), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* listen */ Boolean) => (_nativeListen(t0, t1)).runNow()), _nativeSet = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ Any) => (_nativeSet(t0, t1)).runNow()), _nativeType = _nativeType.toJsFn, _onoff = js.Any.fromFunction3((t0: /* eventType */ String, t1: /* listening */ Boolean, t2: /* listener */ js.Function) => (_onoff(t0, t1, t2)).runNow()), _register = _register.toJsFn, _release = _release.toJsFn, _reorderProperties = js.Any.fromFunction1(_reorderProperties), _setParent = js.Any.fromFunction2((t0: /* parent */ Composite[Widget[Any]], t1: /* index */ js.UndefOr[Double]) => (_setParent(t0, t1)).runNow()), _storeProperty = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* encodedValue */ Any) => (_storeProperty(t0, t1)).runNow()), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* newEncodedValue */ Any) => (_triggerChangeEvent(t0, t1)).runNow()), _wasSet = js.Any.fromFunction1(_wasSet), absoluteBounds = absoluteBounds.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], animate = js.Any.fromFunction2(animate), appendTo = js.Any.fromFunction1(appendTo), autoCapitalize = autoCapitalize.asInstanceOf[js.Any], autoCorrect = autoCorrect.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], detach = detach.toJsFn, dispose = dispose.toJsFn, editable = editable.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], enterKeyType = enterKeyType.asInstanceOf[js.Any], excludeFromLayout = excludeFromLayout.asInstanceOf[js.Any], floatMessage = floatMessage.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highlightOnTouch = highlightOnTouch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertAfter = js.Any.fromFunction1(insertAfter), insertBefore = js.Any.fromFunction1(insertBefore), isDisposed = isDisposed.toJsFn, jsxAttributes = jsxAttributes.asInstanceOf[js.Any], keepFocus = keepFocus.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], keyboardAppearanceMode = keyboardAppearanceMode.asInstanceOf[js.Any], layoutData = layoutData.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], maxChars = maxChars.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), onAccept = onAccept.asInstanceOf[js.Any], onAlignmentChanged = onAlignmentChanged.asInstanceOf[js.Any], onAutoCapitalizeChanged = onAutoCapitalizeChanged.asInstanceOf[js.Any], onAutoCorrectChanged = onAutoCorrectChanged.asInstanceOf[js.Any], onBackgroundChanged = onBackgroundChanged.asInstanceOf[js.Any], onBaselineChanged = onBaselineChanged.asInstanceOf[js.Any], onBeforeTextChange = onBeforeTextChange.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onBorderColorChanged = onBorderColorChanged.asInstanceOf[js.Any], onBottomChanged = onBottomChanged.asInstanceOf[js.Any], onBoundsChanged = onBoundsChanged.asInstanceOf[js.Any], onCenterXChanged = onCenterXChanged.asInstanceOf[js.Any], onCenterYChanged = onCenterYChanged.asInstanceOf[js.Any], onClassChanged = onClassChanged.asInstanceOf[js.Any], onClassListChanged = onClassListChanged.asInstanceOf[js.Any], onCornerRadiusChanged = onCornerRadiusChanged.asInstanceOf[js.Any], onCursorColorChanged = onCursorColorChanged.asInstanceOf[js.Any], onDataChanged = onDataChanged.asInstanceOf[js.Any], onDispose = onDispose.asInstanceOf[js.Any], onEditableChanged = onEditableChanged.asInstanceOf[js.Any], onElevationChanged = onElevationChanged.asInstanceOf[js.Any], onEnabledChanged = onEnabledChanged.asInstanceOf[js.Any], onEnterKeyTypeChanged = onEnterKeyTypeChanged.asInstanceOf[js.Any], onExcludeFromLayoutChanged = onExcludeFromLayoutChanged.asInstanceOf[js.Any], onFloatMessageChanged = onFloatMessageChanged.asInstanceOf[js.Any], onFocus = onFocus.asInstanceOf[js.Any], onFocusedChanged = onFocusedChanged.asInstanceOf[js.Any], onFontChanged = onFontChanged.asInstanceOf[js.Any], onHeightChanged = onHeightChanged.asInstanceOf[js.Any], onHighlightOnTouchChanged = onHighlightOnTouchChanged.asInstanceOf[js.Any], onIdChanged = onIdChanged.asInstanceOf[js.Any], onInput = onInput.asInstanceOf[js.Any], onKeepFocusChanged = onKeepFocusChanged.asInstanceOf[js.Any], onKeyboardAppearanceModeChanged = onKeyboardAppearanceModeChanged.asInstanceOf[js.Any], onKeyboardChanged = onKeyboardChanged.asInstanceOf[js.Any], onLayoutDataChanged = onLayoutDataChanged.asInstanceOf[js.Any], onLeftChanged = onLeftChanged.asInstanceOf[js.Any], onLongPress = onLongPress.asInstanceOf[js.Any], onMaxCharsChanged = onMaxCharsChanged.asInstanceOf[js.Any], onMessageChanged = onMessageChanged.asInstanceOf[js.Any], onMessageColorChanged = onMessageColorChanged.asInstanceOf[js.Any], onOpacityChanged = onOpacityChanged.asInstanceOf[js.Any], onPan = onPan.asInstanceOf[js.Any], onPanDown = onPanDown.asInstanceOf[js.Any], onPanHorizontal = onPanHorizontal.asInstanceOf[js.Any], onPanLeft = onPanLeft.asInstanceOf[js.Any], onPanRight = onPanRight.asInstanceOf[js.Any], onPanUp = onPanUp.asInstanceOf[js.Any], onPanVertical = onPanVertical.asInstanceOf[js.Any], onResize = onResize.asInstanceOf[js.Any], onRevealPasswordChanged = onRevealPasswordChanged.asInstanceOf[js.Any], onRightChanged = onRightChanged.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any], onSwipeDown = onSwipeDown.asInstanceOf[js.Any], onSwipeLeft = onSwipeLeft.asInstanceOf[js.Any], onSwipeRight = onSwipeRight.asInstanceOf[js.Any], onSwipeUp = onSwipeUp.asInstanceOf[js.Any], onTap = onTap.asInstanceOf[js.Any], onTextChanged = onTextChanged.asInstanceOf[js.Any], onTextColorChanged = onTextColorChanged.asInstanceOf[js.Any], onTopChanged = onTopChanged.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransformChanged = onTransformChanged.asInstanceOf[js.Any], onVisibleChanged = onVisibleChanged.asInstanceOf[js.Any], onWidthChanged = onWidthChanged.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), opacity = opacity.asInstanceOf[js.Any], parent = parent.toJsFn, revealPassword = revealPassword.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], siblings = js.Any.fromFunction1(siblings), style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], background = null, borderColor = null, cursorColor = null, font = null, messageColor = null, textColor = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTextInputset]
  }
  
  extension [Self <: OmitTextInputset](x: Self) {
    
    inline def set$getProperty(value: /* name */ String => Any): Self = StObject.set(x, "$getProperty", js.Any.fromFunction1(value))
    
    inline def set$getPropertyGetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertyGetter", js.Any.fromFunction1(value))
    
    inline def set$getPropertySetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertySetter", js.Any.fromFunction1(value))
    
    inline def set$props(value: Any): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$setProperty(value: (/* name */ String, /* value */ Any) => Callback): Self = StObject.set(x, "$setProperty", js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def set$trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Callback): Self = StObject.set(x, "$trigger", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => (value(t0, t1)).runNow()))
    
    inline def setAbsoluteBounds(value: Bounds): Self = StObject.set(x, "absoluteBounds", value.asInstanceOf[js.Any])
    
    inline def setAlignment(value: centerX | left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit]): Self = StObject.set(x, "animate", js.Any.fromFunction2(value))
    
    inline def setAppendTo(value: /* parent */ Composite[Widget[Any]] => TextInput): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setAutoCapitalize(value: all | `false` | none | sentence | `true` | word): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setBackground(value: LinearGradientValue | ColorValue | ImageValue): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBaseline(value: SiblingReferenceValue | auto | `true`): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: ColorValue): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorNull: Self = StObject.set(x, "borderColor", null)
    
    inline def setBottom(value: ConstraintValue): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenterX(value: typingsJapgolly.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: typingsJapgolly.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassList(value: js.Array[String]): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    inline def setClassListVarargs(value: String*): Self = StObject.set(x, "classList", js.Array(value*))
    
    inline def setConstructor(value: /* properties */ js.UndefOr[Properties[TextInput, Omit[TextInput, set]]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCursorColor(value: ColorValue): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
    
    inline def setCursorColorNull: Self = StObject.set(x, "cursorColor", null)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDefineChangeEvent(value: Any): Self = StObject.set(x, "defineChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setDefineChangeEventUndefined: Self = StObject.set(x, "defineChangeEvent", js.undefined)
    
    inline def setDefineEvent(value: Any): Self = StObject.set(x, "defineEvent", value.asInstanceOf[js.Any])
    
    inline def setDefineEventUndefined: Self = StObject.set(x, "defineEvent", js.undefined)
    
    inline def setDefineEvents(value: Any): Self = StObject.set(x, "defineEvents", value.asInstanceOf[js.Any])
    
    inline def setDefineEventsUndefined: Self = StObject.set(x, "defineEvents", js.undefined)
    
    inline def setDefineProperties(value: Any): Self = StObject.set(x, "defineProperties", value.asInstanceOf[js.Any])
    
    inline def setDefinePropertiesUndefined: Self = StObject.set(x, "defineProperties", js.undefined)
    
    inline def setDefineProperty(value: Any): Self = StObject.set(x, "defineProperty", value.asInstanceOf[js.Any])
    
    inline def setDefinePropertyUndefined: Self = StObject.set(x, "defineProperty", js.undefined)
    
    inline def setDetach(value: CallbackTo[TextInput]): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyType(value: default | done | go | next | search | send): Self = StObject.set(x, "enterKeyType", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromLayout(value: Boolean): Self = StObject.set(x, "excludeFromLayout", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setFloatMessage(value: Boolean): Self = StObject.set(x, "floatMessage", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFont(value: FontValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setHeight(value: Dimension | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHighlightOnTouch(value: Boolean): Self = StObject.set(x, "highlightOnTouch", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsertAfter(value: /* widget */ Widget[Any] => TextInput): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    inline def setInsertBefore(value: /* widget */ Widget[Any] => TextInput): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setIsDisposed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisposed", value.toJsFn)
    
    inline def setJsxAttributes(value: (JSXAttributes[TextInput, Omit[TextInput, set | jsxAttributes]]) & `3`): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setKeepFocus(value: Boolean): Self = StObject.set(x, "keepFocus", value.asInstanceOf[js.Any])
    
    inline def setKeyboard(value: ascii | decimal | default | email | number | numbersAndPunctuation | phone | url): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardAppearanceMode(value: never | ontouch | onfocus): Self = StObject.set(x, "keyboardAppearanceMode", value.asInstanceOf[js.Any])
    
    inline def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: ConstraintValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setMaxChars(value: Double): Self = StObject.set(x, "maxChars", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageColor(value: ColorValue): Self = StObject.set(x, "messageColor", value.asInstanceOf[js.Any])
    
    inline def setMessageColorNull: Self = StObject.set(x, "messageColor", null)
    
    inline def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => TextInput
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    inline def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TextInput
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    inline def setOnAccept(value: Listeners[TextInputAcceptEvent[TextInput]]): Self = StObject.set(x, "onAccept", value.asInstanceOf[js.Any])
    
    inline def setOnAlignmentChanged(value: ChangeListeners[TextInput, alignment]): Self = StObject.set(x, "onAlignmentChanged", value.asInstanceOf[js.Any])
    
    inline def setOnAutoCapitalizeChanged(value: ChangeListeners[TextInput, autoCapitalize]): Self = StObject.set(x, "onAutoCapitalizeChanged", value.asInstanceOf[js.Any])
    
    inline def setOnAutoCorrectChanged(value: ChangeListeners[TextInput, autoCorrect]): Self = StObject.set(x, "onAutoCorrectChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBackgroundChanged(value: ChangeListeners[TextInput, background]): Self = StObject.set(x, "onBackgroundChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBaselineChanged(value: ChangeListeners[TextInput, baseline]): Self = StObject.set(x, "onBaselineChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeTextChange(value: Listeners[TextInputBeforeTextChangeEvent[TextInput]]): Self = StObject.set(x, "onBeforeTextChange", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Listeners[EventObject[TextInput]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBorderColorChanged(value: ChangeListeners[TextInput, borderColor]): Self = StObject.set(x, "onBorderColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBottomChanged(value: ChangeListeners[TextInput, bottom]): Self = StObject.set(x, "onBottomChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBoundsChanged(value: ChangeListeners[TextInput, bounds]): Self = StObject.set(x, "onBoundsChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterXChanged(value: ChangeListeners[TextInput, centerX]): Self = StObject.set(x, "onCenterXChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterYChanged(value: ChangeListeners[TextInput, centerY]): Self = StObject.set(x, "onCenterYChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassChanged(value: ChangeListeners[TextInput, `class`]): Self = StObject.set(x, "onClassChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassListChanged(value: ChangeListeners[TextInput, classList]): Self = StObject.set(x, "onClassListChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCornerRadiusChanged(value: ChangeListeners[TextInput, cornerRadius]): Self = StObject.set(x, "onCornerRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCursorColorChanged(value: ChangeListeners[TextInput, cursorColor]): Self = StObject.set(x, "onCursorColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDataChanged(value: ChangeListeners[TextInput, data]): Self = StObject.set(x, "onDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDispose(value: Listeners[EventObject[TextInput]]): Self = StObject.set(x, "onDispose", value.asInstanceOf[js.Any])
    
    inline def setOnEditableChanged(value: ChangeListeners[TextInput, editable]): Self = StObject.set(x, "onEditableChanged", value.asInstanceOf[js.Any])
    
    inline def setOnElevationChanged(value: ChangeListeners[TextInput, elevation]): Self = StObject.set(x, "onElevationChanged", value.asInstanceOf[js.Any])
    
    inline def setOnEnabledChanged(value: ChangeListeners[TextInput, enabled]): Self = StObject.set(x, "onEnabledChanged", value.asInstanceOf[js.Any])
    
    inline def setOnEnterKeyTypeChanged(value: ChangeListeners[TextInput, enterKeyType]): Self = StObject.set(x, "onEnterKeyTypeChanged", value.asInstanceOf[js.Any])
    
    inline def setOnExcludeFromLayoutChanged(value: ChangeListeners[TextInput, excludeFromLayout]): Self = StObject.set(x, "onExcludeFromLayoutChanged", value.asInstanceOf[js.Any])
    
    inline def setOnFloatMessageChanged(value: ChangeListeners[TextInput, floatMessage]): Self = StObject.set(x, "onFloatMessageChanged", value.asInstanceOf[js.Any])
    
    inline def setOnFocus(value: Listeners[EventObject[TextInput]]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusedChanged(value: ChangeListeners[TextInput, focused]): Self = StObject.set(x, "onFocusedChanged", value.asInstanceOf[js.Any])
    
    inline def setOnFontChanged(value: ChangeListeners[TextInput, font]): Self = StObject.set(x, "onFontChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHeightChanged(value: ChangeListeners[TextInput, height]): Self = StObject.set(x, "onHeightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHighlightOnTouchChanged(value: ChangeListeners[TextInput, highlightOnTouch]): Self = StObject.set(x, "onHighlightOnTouchChanged", value.asInstanceOf[js.Any])
    
    inline def setOnIdChanged(value: ChangeListeners[TextInput, id]): Self = StObject.set(x, "onIdChanged", value.asInstanceOf[js.Any])
    
    inline def setOnInput(value: Listeners[TextInputInputEvent[TextInput]]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
    
    inline def setOnKeepFocusChanged(value: ChangeListeners[TextInput, keepFocus]): Self = StObject.set(x, "onKeepFocusChanged", value.asInstanceOf[js.Any])
    
    inline def setOnKeyboardAppearanceModeChanged(value: ChangeListeners[TextInput, keyboardAppearanceMode]): Self = StObject.set(x, "onKeyboardAppearanceModeChanged", value.asInstanceOf[js.Any])
    
    inline def setOnKeyboardChanged(value: ChangeListeners[TextInput, keyboard]): Self = StObject.set(x, "onKeyboardChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutDataChanged(value: ChangeListeners[TextInput, layoutData]): Self = StObject.set(x, "onLayoutDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLeftChanged(value: ChangeListeners[TextInput, left]): Self = StObject.set(x, "onLeftChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLongPress(value: Listeners[WidgetLongPressEvent[TextInput]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnMaxCharsChanged(value: ChangeListeners[TextInput, maxChars]): Self = StObject.set(x, "onMaxCharsChanged", value.asInstanceOf[js.Any])
    
    inline def setOnMessageChanged(value: ChangeListeners[TextInput, message]): Self = StObject.set(x, "onMessageChanged", value.asInstanceOf[js.Any])
    
    inline def setOnMessageColorChanged(value: ChangeListeners[TextInput, messageColor]): Self = StObject.set(x, "onMessageColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnOpacityChanged(value: ChangeListeners[TextInput, opacity]): Self = StObject.set(x, "onOpacityChanged", value.asInstanceOf[js.Any])
    
    inline def setOnPan(value: Listeners[WidgetPanEvent[TextInput]]): Self = StObject.set(x, "onPan", value.asInstanceOf[js.Any])
    
    inline def setOnPanDown(value: Listeners[WidgetPanEvent[TextInput]]): Self = StObject.set(x, "onPanDown", value.asInstanceOf[js.Any])
    
    inline def setOnPanHorizontal(value: Listeners[WidgetPanEvent[TextInput]]): Self = StObject.set(x, "onPanHorizontal", value.asInstanceOf[js.Any])
    
    inline def setOnPanLeft(value: Listeners[WidgetPanEvent[TextInput]]): Self = StObject.set(x, "onPanLeft", value.asInstanceOf[js.Any])
    
    inline def setOnPanRight(value: Listeners[WidgetPanEvent[TextInput]]): Self = StObject.set(x, "onPanRight", value.asInstanceOf[js.Any])
    
    inline def setOnPanUp(value: Listeners[WidgetPanEvent[TextInput]]): Self = StObject.set(x, "onPanUp", value.asInstanceOf[js.Any])
    
    inline def setOnPanVertical(value: Listeners[WidgetPanEvent[TextInput]]): Self = StObject.set(x, "onPanVertical", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: Listeners[WidgetResizeEvent[TextInput]]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    inline def setOnRevealPasswordChanged(value: ChangeListeners[TextInput, revealPassword]): Self = StObject.set(x, "onRevealPasswordChanged", value.asInstanceOf[js.Any])
    
    inline def setOnRightChanged(value: ChangeListeners[TextInput, right]): Self = StObject.set(x, "onRightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: Listeners[TextInputSelectEvent[TextInput]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectionChanged(value: ChangeListeners[TextInput, selection]): Self = StObject.set(x, "onSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeDown(value: Listeners[WidgetSwipeEvent[TextInput]]): Self = StObject.set(x, "onSwipeDown", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeLeft(value: Listeners[WidgetSwipeEvent[TextInput]]): Self = StObject.set(x, "onSwipeLeft", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeRight(value: Listeners[WidgetSwipeEvent[TextInput]]): Self = StObject.set(x, "onSwipeRight", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeUp(value: Listeners[WidgetSwipeEvent[TextInput]]): Self = StObject.set(x, "onSwipeUp", value.asInstanceOf[js.Any])
    
    inline def setOnTap(value: Listeners[WidgetTapEvent[TextInput]]): Self = StObject.set(x, "onTap", value.asInstanceOf[js.Any])
    
    inline def setOnTextChanged(value: ChangeListeners[TextInput, text]): Self = StObject.set(x, "onTextChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTextColorChanged(value: ChangeListeners[TextInput, textColor]): Self = StObject.set(x, "onTextColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTopChanged(value: ChangeListeners[TextInput, top]): Self = StObject.set(x, "onTopChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancel(value: Listeners[WidgetTouchEvent[TextInput]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEnd(value: Listeners[WidgetTouchEvent[TextInput]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMove(value: Listeners[WidgetTouchEvent[TextInput]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStart(value: Listeners[WidgetTouchEvent[TextInput]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTransformChanged(value: ChangeListeners[TextInput, transform]): Self = StObject.set(x, "onTransformChanged", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleChanged(value: ChangeListeners[TextInput, visible]): Self = StObject.set(x, "onVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setOnWidthChanged(value: ChangeListeners[TextInput, width]): Self = StObject.set(x, "onWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => TextInput
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: BoxDimensions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setParent(value: CallbackTo[Composite[Widget[Any]]]): Self = StObject.set(x, "parent", value.toJsFn)
    
    inline def setRevealPassword(value: Boolean): Self = StObject.set(x, "revealPassword", value.asInstanceOf[js.Any])
    
    inline def setRight(value: ConstraintValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[Double]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: Double*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setSiblings(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "siblings", js.Any.fromFunction1(value))
    
    inline def setStyle(value: default | fill | none | outline | underline): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: ColorValue): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorNull: Self = StObject.set(x, "textColor", null)
    
    inline def setTop(value: ConstraintValue): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: /* type */ String => TextInput): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    inline def setTriggerAsync(value: /* type */ String => js.Promise[TextInput]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
    inline def setType(value: default | multiline | password | search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Dimension | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def set_checkDisposed(value: Callback): Self = StObject.set(x, "_checkDisposed", value.toJsFn)
    
    inline def set_decodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_decodeProperty", js.Any.fromFunction2(value))
    
    inline def set_dispose(value: /* skipNative */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "_dispose", js.Any.fromFunction1((t0: /* skipNative */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def set_encodeProperty(value: (/* propertyName */ String, /* value */ Any) => Any): Self = StObject.set(x, "_encodeProperty", js.Any.fromFunction2(value))
    
    inline def set_getDefaultPropertyValue(value: /* propertyName */ String => Callback): Self = StObject.set(x, "_getDefaultPropertyValue", js.Any.fromFunction1((t0: /* propertyName */ String) => value(t0).runNow()))
    
    inline def set_getStoredProperty(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getStoredProperty", js.Any.fromFunction1(value))
    
    inline def set_getTypeDef(value: /* propertyName */ String => Any): Self = StObject.set(x, "_getTypeDef", js.Any.fromFunction1(value))
    
    inline def set_getXMLAttributes(value: CallbackTo[js.Array[js.Tuple2[String, Any]]]): Self = StObject.set(x, "_getXMLAttributes", value.toJsFn)
    
    inline def set_getXMLContent(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "_getXMLContent", value.toJsFn)
    
    inline def set_getXMLElementName(value: CallbackTo[String]): Self = StObject.set(x, "_getXMLElementName", value.toJsFn)
    
    inline def set_getXMLFooter(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLFooter", js.Any.fromFunction1(value))
    
    inline def set_getXMLHeader(value: /* hasChild */ Boolean => String): Self = StObject.set(x, "_getXMLHeader", js.Any.fromFunction1(value))
    
    inline def set_isDisposed(value: `true`): Self = StObject.set(x, "_isDisposed", value.asInstanceOf[js.Any])
    
    inline def set_isDisposedUndefined: Self = StObject.set(x, "_isDisposed", js.undefined)
    
    inline def set_isListening(value: /* eventType */ String => Boolean): Self = StObject.set(x, "_isListening", js.Any.fromFunction1(value))
    
    inline def set_listen(value: (/* eventName */ String, /* listening */ Boolean) => Callback): Self = StObject.set(x, "_listen", js.Any.fromFunction2((t0: /* eventName */ String, t1: /* listening */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def set_nativeCall(value: (/* methodName */ String, /* parameters */ js.Object) => Any): Self = StObject.set(x, "_nativeCall", js.Any.fromFunction2(value))
    
    inline def set_nativeCreate(value: /* param */ js.UndefOr[StringDictionary[Any]] => Callback): Self = StObject.set(x, "_nativeCreate", js.Any.fromFunction1((t0: /* param */ js.UndefOr[StringDictionary[Any]]) => value(t0).runNow()))
    
    inline def set_nativeGet(value: /* propertyName */ String => Any): Self = StObject.set(x, "_nativeGet", js.Any.fromFunction1(value))
    
    inline def set_nativeListen(value: (/* eventType */ String, /* listen */ Boolean) => Callback): Self = StObject.set(x, "_nativeListen", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* listen */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def set_nativeSet(value: (/* propertyName */ String, /* value */ Any) => Callback): Self = StObject.set(x, "_nativeSet", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_nativeType(value: CallbackTo[String]): Self = StObject.set(x, "_nativeType", value.toJsFn)
    
    inline def set_onoff(value: (/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function) => Callback): Self = StObject.set(x, "_onoff", js.Any.fromFunction3((t0: /* eventType */ String, t1: /* listening */ Boolean, t2: /* listener */ js.Function) => (value(t0, t1, t2)).runNow()))
    
    inline def set_register(value: Callback): Self = StObject.set(x, "_register", value.toJsFn)
    
    inline def set_release(value: Callback): Self = StObject.set(x, "_release", value.toJsFn)
    
    inline def set_reorderProperties(value: /* propertyNames */ js.Array[String] => js.Array[String]): Self = StObject.set(x, "_reorderProperties", js.Any.fromFunction1(value))
    
    inline def set_setParent(value: (/* parent */ Composite[Widget[Any]], /* index */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "_setParent", js.Any.fromFunction2((t0: /* parent */ Composite[Widget[Any]], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def set_storeProperty(value: (/* propertyName */ String, /* encodedValue */ Any) => Callback): Self = StObject.set(x, "_storeProperty", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* encodedValue */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "_trigger", js.Any.fromFunction2(value))
    
    inline def set_triggerChangeEvent(value: (/* propertyName */ String, /* newEncodedValue */ Any) => Callback): Self = StObject.set(x, "_triggerChangeEvent", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* newEncodedValue */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_wasSet(value: /* propertyName */ String => Boolean): Self = StObject.set(x, "_wasSet", js.Any.fromFunction1(value))
  }
}
