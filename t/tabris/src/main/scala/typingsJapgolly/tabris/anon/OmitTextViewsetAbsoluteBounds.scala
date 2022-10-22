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
import typingsJapgolly.tabris.mod.TextViewTapLinkEvent
import typingsJapgolly.tabris.mod.Transformation
import typingsJapgolly.tabris.mod.Widget
import typingsJapgolly.tabris.mod.WidgetCollection
import typingsJapgolly.tabris.mod.WidgetLongPressEvent
import typingsJapgolly.tabris.mod.WidgetPanEvent
import typingsJapgolly.tabris.mod.WidgetResizeEvent
import typingsJapgolly.tabris.mod.WidgetSwipeEvent
import typingsJapgolly.tabris.mod.WidgetTapEvent
import typingsJapgolly.tabris.mod.WidgetTouchEvent
import typingsJapgolly.tabris.mod.widgets.TextView
import typingsJapgolly.tabris.tabrisBooleans.`true`
import typingsJapgolly.tabris.tabrisStrings.`class`
import typingsJapgolly.tabris.tabrisStrings.alignment
import typingsJapgolly.tabris.tabrisStrings.auto
import typingsJapgolly.tabris.tabrisStrings.background
import typingsJapgolly.tabris.tabrisStrings.baseline
import typingsJapgolly.tabris.tabrisStrings.bottom
import typingsJapgolly.tabris.tabrisStrings.bounds
import typingsJapgolly.tabris.tabrisStrings.centerX
import typingsJapgolly.tabris.tabrisStrings.centerY
import typingsJapgolly.tabris.tabrisStrings.classList
import typingsJapgolly.tabris.tabrisStrings.cornerRadius
import typingsJapgolly.tabris.tabrisStrings.data
import typingsJapgolly.tabris.tabrisStrings.elevation
import typingsJapgolly.tabris.tabrisStrings.enabled
import typingsJapgolly.tabris.tabrisStrings.excludeFromLayout
import typingsJapgolly.tabris.tabrisStrings.font
import typingsJapgolly.tabris.tabrisStrings.height
import typingsJapgolly.tabris.tabrisStrings.highlightOnTouch
import typingsJapgolly.tabris.tabrisStrings.id
import typingsJapgolly.tabris.tabrisStrings.jsxAttributes
import typingsJapgolly.tabris.tabrisStrings.layoutData
import typingsJapgolly.tabris.tabrisStrings.left
import typingsJapgolly.tabris.tabrisStrings.lineSpacing
import typingsJapgolly.tabris.tabrisStrings.markupEnabled
import typingsJapgolly.tabris.tabrisStrings.maxLines
import typingsJapgolly.tabris.tabrisStrings.opacity
import typingsJapgolly.tabris.tabrisStrings.right
import typingsJapgolly.tabris.tabrisStrings.selectable
import typingsJapgolly.tabris.tabrisStrings.set
import typingsJapgolly.tabris.tabrisStrings.text
import typingsJapgolly.tabris.tabrisStrings.textColor
import typingsJapgolly.tabris.tabrisStrings.top
import typingsJapgolly.tabris.tabrisStrings.transform
import typingsJapgolly.tabris.tabrisStrings.visible
import typingsJapgolly.tabris.tabrisStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.widgets.TextView, 'set'> */
trait OmitTextViewsetAbsoluteBounds extends StObject {
  
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
  
  def appendTo(parent: Composite[Widget[Any]]): typingsJapgolly.tabris.global.tabris.widgets.TextView
  @JSName("appendTo")
  var appendTo_Original: js.Function1[
    /* parent */ Composite[Widget[Any]], 
    typingsJapgolly.tabris.global.tabris.widgets.TextView
  ]
  
  var background: LinearGradientValue | ColorValue | ImageValue
  
  var baseline: SiblingReferenceValue | auto | `true`
  
  var bottom: ConstraintValue
  
  var bounds: Bounds
  
  var centerX: typingsJapgolly.tabris.mod.Offset | auto | `true`
  
  var centerY: typingsJapgolly.tabris.mod.Offset | auto | `true`
  
  var cid: String
  
  var `class`: String
  
  var classList: js.Array[String]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[TextView, Omit[TextView, set]]], Any]
  
  var cornerRadius: Double
  
  var data: Any
  
  var defineChangeEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvents: js.UndefOr[Any] = js.undefined
  
  var defineProperties: js.UndefOr[Any] = js.undefined
  
  var defineProperty: js.UndefOr[Any] = js.undefined
  
  def detach(): typingsJapgolly.tabris.global.tabris.widgets.TextView
  @JSName("detach")
  var detach_Original: js.Function0[typingsJapgolly.tabris.global.tabris.widgets.TextView]
  
  def dispose(): Unit
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit]
  
  var elevation: Double
  
  var enabled: Boolean
  
  var excludeFromLayout: Boolean
  
  var extend: js.UndefOr[Any] = js.undefined
  
  var font: FontValue
  
  var height: Dimension | auto
  
  var highlightOnTouch: Boolean
  
  var id: String
  
  def insertAfter(widget: Widget[Any]): typingsJapgolly.tabris.global.tabris.widgets.TextView
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Widget[Any], typingsJapgolly.tabris.global.tabris.widgets.TextView]
  
  def insertBefore(widget: Widget[Any]): typingsJapgolly.tabris.global.tabris.widgets.TextView
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Widget[Any], typingsJapgolly.tabris.global.tabris.widgets.TextView]
  
  def isDisposed(): Boolean
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean]
  
  var jsxAttributes: (JSXAttributes[
    typingsJapgolly.tabris.global.tabris.widgets.TextView, 
    Omit[
      typingsJapgolly.tabris.global.tabris.widgets.TextView, 
      set | typingsJapgolly.tabris.tabrisStrings.jsxAttributes
    ]
  ]) & `3`
  
  var layoutData: LayoutDataValue
  
  var left: ConstraintValue
  
  var lineSpacing: Double
  
  var markupEnabled: Boolean
  
  var maxLines: js.UndefOr[Double | Null] = js.undefined
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): typingsJapgolly.tabris.global.tabris.widgets.TextView
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): typingsJapgolly.tabris.global.tabris.widgets.TextView
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    typingsJapgolly.tabris.global.tabris.widgets.TextView
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): typingsJapgolly.tabris.global.tabris.widgets.TextView
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): typingsJapgolly.tabris.global.tabris.widgets.TextView
  
  var onAlignmentChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, alignment]
  
  var onBackgroundChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, background]
  
  var onBaselineChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, baseline]
  
  var onBottomChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, bottom]
  
  var onBoundsChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, bounds]
  
  var onCenterXChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, centerX]
  
  var onCenterYChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, centerY]
  
  var onClassChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, `class`]
  
  var onClassListChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, classList]
  
  var onCornerRadiusChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, cornerRadius]
  
  var onDataChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, data]
  
  var onDispose: Listeners[EventObject[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onElevationChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, elevation]
  
  var onEnabledChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, enabled]
  
  var onExcludeFromLayoutChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, excludeFromLayout]
  
  var onFontChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, font]
  
  var onHeightChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, height]
  
  var onHighlightOnTouchChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, highlightOnTouch]
  
  var onIdChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, id]
  
  var onLayoutDataChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, layoutData]
  
  var onLeftChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, left]
  
  var onLineSpacingChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, lineSpacing]
  
  var onLongPress: Listeners[WidgetLongPressEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onMarkupEnabledChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, markupEnabled]
  
  var onMaxLinesChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, maxLines]
  
  var onOpacityChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, opacity]
  
  var onPan: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onPanDown: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onPanHorizontal: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onPanLeft: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onPanRight: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onPanUp: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onPanVertical: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onResize: Listeners[WidgetResizeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onRightChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, right]
  
  var onSelectableChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, selectable]
  
  var onSwipeDown: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onSwipeLeft: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onSwipeRight: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onSwipeUp: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onTap: Listeners[WidgetTapEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onTapLink: Listeners[TextViewTapLinkEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onTextChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, text]
  
  var onTextColorChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, textColor]
  
  var onTopChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, top]
  
  var onTouchCancel: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onTouchEnd: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onTouchMove: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onTouchStart: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]
  
  var onTransformChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, transform]
  
  var onVisibleChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, visible]
  
  var onWidthChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, width]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    typingsJapgolly.tabris.global.tabris.widgets.TextView
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): typingsJapgolly.tabris.global.tabris.widgets.TextView
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): typingsJapgolly.tabris.global.tabris.widgets.TextView
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    typingsJapgolly.tabris.global.tabris.widgets.TextView
  ]
  
  var opacity: Double
  
  var padding: js.UndefOr[BoxDimensions | Null] = js.undefined
  
  def parent(): Composite[Widget[Any]]
  @JSName("parent")
  var parent_Original: js.Function0[Composite[Widget[Any]]]
  
  var right: ConstraintValue
  
  var selectable: Boolean
  
  def siblings[Result /* <: Widget[Any] */](): WidgetCollection[Result]
  def siblings[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result]
  @JSName("siblings")
  var siblings_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]], 
    WidgetCollection[Widget[Any]]
  ]
  
  var text: String
  
  var textColor: ColorValue
  
  var top: ConstraintValue
  
  var transform: Transformation
  
  def trigger(`type`: String): typingsJapgolly.tabris.global.tabris.widgets.TextView
  
  def triggerAsync(`type`: String): js.Promise[typingsJapgolly.tabris.global.tabris.widgets.TextView]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[
    /* type */ String, 
    js.Promise[typingsJapgolly.tabris.global.tabris.widgets.TextView]
  ]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, typingsJapgolly.tabris.global.tabris.widgets.TextView]
  
  var visible: Boolean
  
  var width: Dimension | auto
}
object OmitTextViewsetAbsoluteBounds {
  
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
    appendTo: /* parent */ Composite[Widget[Any]] => typingsJapgolly.tabris.global.tabris.widgets.TextView,
    baseline: SiblingReferenceValue | auto | `true`,
    bottom: ConstraintValue,
    bounds: Bounds,
    centerX: typingsJapgolly.tabris.mod.Offset | auto | `true`,
    centerY: typingsJapgolly.tabris.mod.Offset | auto | `true`,
    cid: String,
    `class`: String,
    classList: js.Array[String],
    constructor: /* properties */ js.UndefOr[Properties[TextView, Omit[TextView, set]]] => Any,
    cornerRadius: Double,
    data: Any,
    detach: CallbackTo[typingsJapgolly.tabris.global.tabris.widgets.TextView],
    dispose: Callback,
    elevation: Double,
    enabled: Boolean,
    excludeFromLayout: Boolean,
    height: Dimension | auto,
    highlightOnTouch: Boolean,
    id: String,
    insertAfter: /* widget */ Widget[Any] => typingsJapgolly.tabris.global.tabris.widgets.TextView,
    insertBefore: /* widget */ Widget[Any] => typingsJapgolly.tabris.global.tabris.widgets.TextView,
    isDisposed: CallbackTo[Boolean],
    jsxAttributes: (JSXAttributes[
      typingsJapgolly.tabris.global.tabris.widgets.TextView, 
      Omit[typingsJapgolly.tabris.global.tabris.widgets.TextView, set | jsxAttributes]
    ]) & `3`,
    layoutData: LayoutDataValue,
    left: ConstraintValue,
    lineSpacing: Double,
    markupEnabled: Boolean,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.widgets.TextView,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.widgets.TextView,
    onAlignmentChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, alignment],
    onBackgroundChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, background],
    onBaselineChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, baseline],
    onBottomChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, bottom],
    onBoundsChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, bounds],
    onCenterXChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, centerX],
    onCenterYChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, centerY],
    onClassChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, `class`],
    onClassListChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, classList],
    onCornerRadiusChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, cornerRadius],
    onDataChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, data],
    onDispose: Listeners[EventObject[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onElevationChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, elevation],
    onEnabledChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, enabled],
    onExcludeFromLayoutChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, excludeFromLayout],
    onFontChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, font],
    onHeightChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, height],
    onHighlightOnTouchChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, highlightOnTouch],
    onIdChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, id],
    onLayoutDataChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, layoutData],
    onLeftChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, left],
    onLineSpacingChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, lineSpacing],
    onLongPress: Listeners[WidgetLongPressEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onMarkupEnabledChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, markupEnabled],
    onMaxLinesChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, maxLines],
    onOpacityChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, opacity],
    onPan: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onPanDown: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onPanHorizontal: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onPanLeft: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onPanRight: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onPanUp: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onPanVertical: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onResize: Listeners[WidgetResizeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onRightChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, right],
    onSelectableChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, selectable],
    onSwipeDown: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onSwipeLeft: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onSwipeRight: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onSwipeUp: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onTap: Listeners[WidgetTapEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onTapLink: Listeners[TextViewTapLinkEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onTextChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, text],
    onTextColorChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, textColor],
    onTopChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, top],
    onTouchCancel: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onTouchEnd: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onTouchMove: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onTouchStart: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]],
    onTransformChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, transform],
    onVisibleChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, visible],
    onWidthChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, width],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.widgets.TextView,
    opacity: Double,
    parent: CallbackTo[Composite[Widget[Any]]],
    right: ConstraintValue,
    selectable: Boolean,
    siblings: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]],
    text: String,
    top: ConstraintValue,
    transform: Transformation,
    trigger: /* type */ String => typingsJapgolly.tabris.global.tabris.widgets.TextView,
    triggerAsync: /* type */ String => js.Promise[typingsJapgolly.tabris.global.tabris.widgets.TextView],
    visible: Boolean,
    width: Dimension | auto
  ): OmitTextViewsetAbsoluteBounds = {
    val __obj = js.Dynamic.literal($getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => ($setProperty(t0, t1)).runNow()), $trigger = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => ($trigger(t0, t1)).runNow()), _checkDisposed = _checkDisposed.toJsFn, _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1((t0: /* skipNative */ js.UndefOr[Boolean]) => _dispose(t0).runNow()), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _getDefaultPropertyValue = js.Any.fromFunction1((t0: /* propertyName */ String) => _getDefaultPropertyValue(t0).runNow()), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = _getXMLAttributes.toJsFn, _getXMLContent = _getXMLContent.toJsFn, _getXMLElementName = _getXMLElementName.toJsFn, _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _isListening = js.Any.fromFunction1(_isListening), _listen = js.Any.fromFunction2((t0: /* eventName */ String, t1: /* listening */ Boolean) => (_listen(t0, t1)).runNow()), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1((t0: /* param */ js.UndefOr[StringDictionary[Any]]) => _nativeCreate(t0).runNow()), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* listen */ Boolean) => (_nativeListen(t0, t1)).runNow()), _nativeSet = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ Any) => (_nativeSet(t0, t1)).runNow()), _nativeType = _nativeType.toJsFn, _onoff = js.Any.fromFunction3((t0: /* eventType */ String, t1: /* listening */ Boolean, t2: /* listener */ js.Function) => (_onoff(t0, t1, t2)).runNow()), _register = _register.toJsFn, _release = _release.toJsFn, _reorderProperties = js.Any.fromFunction1(_reorderProperties), _setParent = js.Any.fromFunction2((t0: /* parent */ Composite[Widget[Any]], t1: /* index */ js.UndefOr[Double]) => (_setParent(t0, t1)).runNow()), _storeProperty = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* encodedValue */ Any) => (_storeProperty(t0, t1)).runNow()), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* newEncodedValue */ Any) => (_triggerChangeEvent(t0, t1)).runNow()), _wasSet = js.Any.fromFunction1(_wasSet), absoluteBounds = absoluteBounds.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], animate = js.Any.fromFunction2(animate), appendTo = js.Any.fromFunction1(appendTo), baseline = baseline.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], detach = detach.toJsFn, dispose = dispose.toJsFn, elevation = elevation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], excludeFromLayout = excludeFromLayout.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highlightOnTouch = highlightOnTouch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insertAfter = js.Any.fromFunction1(insertAfter), insertBefore = js.Any.fromFunction1(insertBefore), isDisposed = isDisposed.toJsFn, jsxAttributes = jsxAttributes.asInstanceOf[js.Any], layoutData = layoutData.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], markupEnabled = markupEnabled.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), onAlignmentChanged = onAlignmentChanged.asInstanceOf[js.Any], onBackgroundChanged = onBackgroundChanged.asInstanceOf[js.Any], onBaselineChanged = onBaselineChanged.asInstanceOf[js.Any], onBottomChanged = onBottomChanged.asInstanceOf[js.Any], onBoundsChanged = onBoundsChanged.asInstanceOf[js.Any], onCenterXChanged = onCenterXChanged.asInstanceOf[js.Any], onCenterYChanged = onCenterYChanged.asInstanceOf[js.Any], onClassChanged = onClassChanged.asInstanceOf[js.Any], onClassListChanged = onClassListChanged.asInstanceOf[js.Any], onCornerRadiusChanged = onCornerRadiusChanged.asInstanceOf[js.Any], onDataChanged = onDataChanged.asInstanceOf[js.Any], onDispose = onDispose.asInstanceOf[js.Any], onElevationChanged = onElevationChanged.asInstanceOf[js.Any], onEnabledChanged = onEnabledChanged.asInstanceOf[js.Any], onExcludeFromLayoutChanged = onExcludeFromLayoutChanged.asInstanceOf[js.Any], onFontChanged = onFontChanged.asInstanceOf[js.Any], onHeightChanged = onHeightChanged.asInstanceOf[js.Any], onHighlightOnTouchChanged = onHighlightOnTouchChanged.asInstanceOf[js.Any], onIdChanged = onIdChanged.asInstanceOf[js.Any], onLayoutDataChanged = onLayoutDataChanged.asInstanceOf[js.Any], onLeftChanged = onLeftChanged.asInstanceOf[js.Any], onLineSpacingChanged = onLineSpacingChanged.asInstanceOf[js.Any], onLongPress = onLongPress.asInstanceOf[js.Any], onMarkupEnabledChanged = onMarkupEnabledChanged.asInstanceOf[js.Any], onMaxLinesChanged = onMaxLinesChanged.asInstanceOf[js.Any], onOpacityChanged = onOpacityChanged.asInstanceOf[js.Any], onPan = onPan.asInstanceOf[js.Any], onPanDown = onPanDown.asInstanceOf[js.Any], onPanHorizontal = onPanHorizontal.asInstanceOf[js.Any], onPanLeft = onPanLeft.asInstanceOf[js.Any], onPanRight = onPanRight.asInstanceOf[js.Any], onPanUp = onPanUp.asInstanceOf[js.Any], onPanVertical = onPanVertical.asInstanceOf[js.Any], onResize = onResize.asInstanceOf[js.Any], onRightChanged = onRightChanged.asInstanceOf[js.Any], onSelectableChanged = onSelectableChanged.asInstanceOf[js.Any], onSwipeDown = onSwipeDown.asInstanceOf[js.Any], onSwipeLeft = onSwipeLeft.asInstanceOf[js.Any], onSwipeRight = onSwipeRight.asInstanceOf[js.Any], onSwipeUp = onSwipeUp.asInstanceOf[js.Any], onTap = onTap.asInstanceOf[js.Any], onTapLink = onTapLink.asInstanceOf[js.Any], onTextChanged = onTextChanged.asInstanceOf[js.Any], onTextColorChanged = onTextColorChanged.asInstanceOf[js.Any], onTopChanged = onTopChanged.asInstanceOf[js.Any], onTouchCancel = onTouchCancel.asInstanceOf[js.Any], onTouchEnd = onTouchEnd.asInstanceOf[js.Any], onTouchMove = onTouchMove.asInstanceOf[js.Any], onTouchStart = onTouchStart.asInstanceOf[js.Any], onTransformChanged = onTransformChanged.asInstanceOf[js.Any], onVisibleChanged = onVisibleChanged.asInstanceOf[js.Any], onWidthChanged = onWidthChanged.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), opacity = opacity.asInstanceOf[js.Any], parent = parent.toJsFn, right = right.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], siblings = js.Any.fromFunction1(siblings), text = text.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], background = null, font = null, textColor = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTextViewsetAbsoluteBounds]
  }
  
  extension [Self <: OmitTextViewsetAbsoluteBounds](x: Self) {
    
    inline def set$getProperty(value: /* name */ String => Any): Self = StObject.set(x, "$getProperty", js.Any.fromFunction1(value))
    
    inline def set$getPropertyGetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertyGetter", js.Any.fromFunction1(value))
    
    inline def set$getPropertySetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertySetter", js.Any.fromFunction1(value))
    
    inline def set$props(value: Any): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$setProperty(value: (/* name */ String, /* value */ Any) => Callback): Self = StObject.set(x, "$setProperty", js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def set$trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Callback): Self = StObject.set(x, "$trigger", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => (value(t0, t1)).runNow()))
    
    inline def setAbsoluteBounds(value: Bounds): Self = StObject.set(x, "absoluteBounds", value.asInstanceOf[js.Any])
    
    inline def setAlignment(value: centerX | left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAnimate(value: (/* properties */ Opacity, /* options */ AnimationOptions) => js.Promise[Unit]): Self = StObject.set(x, "animate", js.Any.fromFunction2(value))
    
    inline def setAppendTo(
      value: /* parent */ Composite[Widget[Any]] => typingsJapgolly.tabris.global.tabris.widgets.TextView
    ): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setBackground(value: LinearGradientValue | ColorValue | ImageValue): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    inline def setBaseline(value: SiblingReferenceValue | auto | `true`): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: ConstraintValue): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenterX(value: typingsJapgolly.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: typingsJapgolly.tabris.mod.Offset | auto | `true`): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassList(value: js.Array[String]): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    inline def setClassListVarargs(value: String*): Self = StObject.set(x, "classList", js.Array(value*))
    
    inline def setConstructor(value: /* properties */ js.UndefOr[Properties[TextView, Omit[TextView, set]]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
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
    
    inline def setDetach(value: CallbackTo[typingsJapgolly.tabris.global.tabris.widgets.TextView]): Self = StObject.set(x, "detach", value.toJsFn)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromLayout(value: Boolean): Self = StObject.set(x, "excludeFromLayout", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setFont(value: FontValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setHeight(value: Dimension | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHighlightOnTouch(value: Boolean): Self = StObject.set(x, "highlightOnTouch", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInsertAfter(value: /* widget */ Widget[Any] => typingsJapgolly.tabris.global.tabris.widgets.TextView): Self = StObject.set(x, "insertAfter", js.Any.fromFunction1(value))
    
    inline def setInsertBefore(value: /* widget */ Widget[Any] => typingsJapgolly.tabris.global.tabris.widgets.TextView): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    inline def setIsDisposed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisposed", value.toJsFn)
    
    inline def setJsxAttributes(
      value: (JSXAttributes[
          typingsJapgolly.tabris.global.tabris.widgets.TextView, 
          Omit[typingsJapgolly.tabris.global.tabris.widgets.TextView, set | jsxAttributes]
        ]) & `3`
    ): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setLayoutData(value: LayoutDataValue): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: ConstraintValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setMarkupEnabled(value: Boolean): Self = StObject.set(x, "markupEnabled", value.asInstanceOf[js.Any])
    
    inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
    
    inline def setMaxLinesNull: Self = StObject.set(x, "maxLines", null)
    
    inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
    
    inline def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.widgets.TextView
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    inline def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.widgets.TextView
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    inline def setOnAlignmentChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, alignment]): Self = StObject.set(x, "onAlignmentChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBackgroundChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, background]): Self = StObject.set(x, "onBackgroundChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBaselineChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, baseline]): Self = StObject.set(x, "onBaselineChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBottomChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, bottom]): Self = StObject.set(x, "onBottomChanged", value.asInstanceOf[js.Any])
    
    inline def setOnBoundsChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, bounds]): Self = StObject.set(x, "onBoundsChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterXChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, centerX]): Self = StObject.set(x, "onCenterXChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCenterYChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, centerY]): Self = StObject.set(x, "onCenterYChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, `class`]): Self = StObject.set(x, "onClassChanged", value.asInstanceOf[js.Any])
    
    inline def setOnClassListChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, classList]): Self = StObject.set(x, "onClassListChanged", value.asInstanceOf[js.Any])
    
    inline def setOnCornerRadiusChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, cornerRadius]): Self = StObject.set(x, "onCornerRadiusChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDataChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, data]): Self = StObject.set(x, "onDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnDispose(value: Listeners[EventObject[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onDispose", value.asInstanceOf[js.Any])
    
    inline def setOnElevationChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, elevation]): Self = StObject.set(x, "onElevationChanged", value.asInstanceOf[js.Any])
    
    inline def setOnEnabledChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, enabled]): Self = StObject.set(x, "onEnabledChanged", value.asInstanceOf[js.Any])
    
    inline def setOnExcludeFromLayoutChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, excludeFromLayout]): Self = StObject.set(x, "onExcludeFromLayoutChanged", value.asInstanceOf[js.Any])
    
    inline def setOnFontChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, font]): Self = StObject.set(x, "onFontChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHeightChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, height]): Self = StObject.set(x, "onHeightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnHighlightOnTouchChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, highlightOnTouch]): Self = StObject.set(x, "onHighlightOnTouchChanged", value.asInstanceOf[js.Any])
    
    inline def setOnIdChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, id]): Self = StObject.set(x, "onIdChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutDataChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, layoutData]): Self = StObject.set(x, "onLayoutDataChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLeftChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, left]): Self = StObject.set(x, "onLeftChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLineSpacingChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, lineSpacing]): Self = StObject.set(x, "onLineSpacingChanged", value.asInstanceOf[js.Any])
    
    inline def setOnLongPress(value: Listeners[WidgetLongPressEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnMarkupEnabledChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, markupEnabled]): Self = StObject.set(x, "onMarkupEnabledChanged", value.asInstanceOf[js.Any])
    
    inline def setOnMaxLinesChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, maxLines]): Self = StObject.set(x, "onMaxLinesChanged", value.asInstanceOf[js.Any])
    
    inline def setOnOpacityChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, opacity]): Self = StObject.set(x, "onOpacityChanged", value.asInstanceOf[js.Any])
    
    inline def setOnPan(value: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onPan", value.asInstanceOf[js.Any])
    
    inline def setOnPanDown(value: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onPanDown", value.asInstanceOf[js.Any])
    
    inline def setOnPanHorizontal(value: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onPanHorizontal", value.asInstanceOf[js.Any])
    
    inline def setOnPanLeft(value: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onPanLeft", value.asInstanceOf[js.Any])
    
    inline def setOnPanRight(value: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onPanRight", value.asInstanceOf[js.Any])
    
    inline def setOnPanUp(value: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onPanUp", value.asInstanceOf[js.Any])
    
    inline def setOnPanVertical(value: Listeners[WidgetPanEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onPanVertical", value.asInstanceOf[js.Any])
    
    inline def setOnResize(value: Listeners[WidgetResizeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
    
    inline def setOnRightChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, right]): Self = StObject.set(x, "onRightChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSelectableChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, selectable]): Self = StObject.set(x, "onSelectableChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeDown(value: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onSwipeDown", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeLeft(value: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onSwipeLeft", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeRight(value: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onSwipeRight", value.asInstanceOf[js.Any])
    
    inline def setOnSwipeUp(value: Listeners[WidgetSwipeEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onSwipeUp", value.asInstanceOf[js.Any])
    
    inline def setOnTap(value: Listeners[WidgetTapEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onTap", value.asInstanceOf[js.Any])
    
    inline def setOnTapLink(value: Listeners[TextViewTapLinkEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onTapLink", value.asInstanceOf[js.Any])
    
    inline def setOnTextChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, text]): Self = StObject.set(x, "onTextChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTextColorChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, textColor]): Self = StObject.set(x, "onTextColorChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTopChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, top]): Self = StObject.set(x, "onTopChanged", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancel(value: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEnd(value: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMove(value: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStart(value: Listeners[WidgetTouchEvent[typingsJapgolly.tabris.global.tabris.widgets.TextView]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTransformChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, transform]): Self = StObject.set(x, "onTransformChanged", value.asInstanceOf[js.Any])
    
    inline def setOnVisibleChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, visible]): Self = StObject.set(x, "onVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setOnWidthChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.widgets.TextView, width]): Self = StObject.set(x, "onWidthChanged", value.asInstanceOf[js.Any])
    
    inline def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.widgets.TextView
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: BoxDimensions): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingNull: Self = StObject.set(x, "padding", null)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setParent(value: CallbackTo[Composite[Widget[Any]]]): Self = StObject.set(x, "parent", value.toJsFn)
    
    inline def setRight(value: ConstraintValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSiblings(
      value: /* selector */ js.UndefOr[Selector[Widget[Any], Widget[Any]]] => WidgetCollection[Widget[Any]]
    ): Self = StObject.set(x, "siblings", js.Any.fromFunction1(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: ColorValue): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorNull: Self = StObject.set(x, "textColor", null)
    
    inline def setTop(value: ConstraintValue): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Transformation): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: /* type */ String => typingsJapgolly.tabris.global.tabris.widgets.TextView): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    inline def setTriggerAsync(value: /* type */ String => js.Promise[typingsJapgolly.tabris.global.tabris.widgets.TextView]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
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
