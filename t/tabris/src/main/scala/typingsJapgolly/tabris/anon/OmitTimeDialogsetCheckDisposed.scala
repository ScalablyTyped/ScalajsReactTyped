package typingsJapgolly.tabris.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tabris.mod.ChangeListeners
import typingsJapgolly.tabris.mod.EventObject
import typingsJapgolly.tabris.mod.JSXAttributes
import typingsJapgolly.tabris.mod.Listeners
import typingsJapgolly.tabris.mod.NativeObject
import typingsJapgolly.tabris.mod.Omit
import typingsJapgolly.tabris.mod.Properties
import typingsJapgolly.tabris.mod.TimeDialog
import typingsJapgolly.tabris.mod.TimeDialogCloseEvent
import typingsJapgolly.tabris.mod.TimeDialogSelectEvent
import typingsJapgolly.tabris.tabrisBooleans.`true`
import typingsJapgolly.tabris.tabrisStrings.date
import typingsJapgolly.tabris.tabrisStrings.jsxAttributes
import typingsJapgolly.tabris.tabrisStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tabris.tabris.Omit<tabris.tabris.TimeDialog, 'set'> */
trait OmitTimeDialogsetCheckDisposed extends StObject {
  
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
  
  var cid: String
  
  def close(): typingsJapgolly.tabris.global.tabris.TimeDialog
  @JSName("close")
  var close_Original: js.Function0[typingsJapgolly.tabris.global.tabris.TimeDialog]
  
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[TimeDialog, Omit[TimeDialog, set]]], Any]
  
  var date: js.Date
  
  var defineChangeEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvent: js.UndefOr[Any] = js.undefined
  
  var defineEvents: js.UndefOr[Any] = js.undefined
  
  var defineProperties: js.UndefOr[Any] = js.undefined
  
  var defineProperty: js.UndefOr[Any] = js.undefined
  
  var extend: js.UndefOr[Any] = js.undefined
  
  var jsxAttributes: (JSXAttributes[
    typingsJapgolly.tabris.global.tabris.TimeDialog, 
    Omit[
      typingsJapgolly.tabris.global.tabris.TimeDialog, 
      set | typingsJapgolly.tabris.tabrisStrings.jsxAttributes
    ]
  ]) & `3`
  
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): typingsJapgolly.tabris.global.tabris.TimeDialog
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): typingsJapgolly.tabris.global.tabris.TimeDialog
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    typingsJapgolly.tabris.global.tabris.TimeDialog
  ]
  
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): typingsJapgolly.tabris.global.tabris.TimeDialog
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): typingsJapgolly.tabris.global.tabris.TimeDialog
  
  var onClose: Listeners[TimeDialogCloseEvent[typingsJapgolly.tabris.global.tabris.TimeDialog]]
  
  var onDateChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.TimeDialog, date]
  
  var onSelect: Listeners[TimeDialogSelectEvent[typingsJapgolly.tabris.global.tabris.TimeDialog]]
  
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    typingsJapgolly.tabris.global.tabris.TimeDialog
  ]
  
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Any]): typingsJapgolly.tabris.global.tabris.TimeDialog
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Any],
    context: js.Object
  ): typingsJapgolly.tabris.global.tabris.TimeDialog
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], 
    /* context */ js.UndefOr[js.Object], 
    typingsJapgolly.tabris.global.tabris.TimeDialog
  ]
  
  def open(): typingsJapgolly.tabris.global.tabris.TimeDialog
  @JSName("open")
  var open_Original: js.Function0[typingsJapgolly.tabris.global.tabris.TimeDialog]
  
  def trigger(`type`: String): typingsJapgolly.tabris.global.tabris.TimeDialog
  
  def triggerAsync(`type`: String): js.Promise[typingsJapgolly.tabris.global.tabris.TimeDialog]
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[typingsJapgolly.tabris.global.tabris.TimeDialog]]
  
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, typingsJapgolly.tabris.global.tabris.TimeDialog]
}
object OmitTimeDialogsetCheckDisposed {
  
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
    _storeProperty: (/* propertyName */ String, /* encodedValue */ Any) => Callback,
    _trigger: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean,
    _triggerChangeEvent: (/* propertyName */ String, /* newEncodedValue */ Any) => Callback,
    _wasSet: /* propertyName */ String => Boolean,
    cid: String,
    close: CallbackTo[typingsJapgolly.tabris.global.tabris.TimeDialog],
    constructor: /* properties */ js.UndefOr[Properties[TimeDialog, Omit[TimeDialog, set]]] => Any,
    date: js.Date,
    jsxAttributes: (JSXAttributes[
      typingsJapgolly.tabris.global.tabris.TimeDialog, 
      Omit[typingsJapgolly.tabris.global.tabris.TimeDialog, set | jsxAttributes]
    ]) & `3`,
    off: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.TimeDialog,
    on: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.TimeDialog,
    onClose: Listeners[TimeDialogCloseEvent[typingsJapgolly.tabris.global.tabris.TimeDialog]],
    onDateChanged: ChangeListeners[typingsJapgolly.tabris.global.tabris.TimeDialog, date],
    onSelect: Listeners[TimeDialogSelectEvent[typingsJapgolly.tabris.global.tabris.TimeDialog]],
    once: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.TimeDialog,
    open: CallbackTo[typingsJapgolly.tabris.global.tabris.TimeDialog],
    trigger: /* type */ String => typingsJapgolly.tabris.global.tabris.TimeDialog,
    triggerAsync: /* type */ String => js.Promise[typingsJapgolly.tabris.global.tabris.TimeDialog]
  ): OmitTimeDialogsetCheckDisposed = {
    val __obj = js.Dynamic.literal($getProperty = js.Any.fromFunction1($getProperty), $getPropertyGetter = js.Any.fromFunction1($getPropertyGetter), $getPropertySetter = js.Any.fromFunction1($getPropertySetter), $props = $props.asInstanceOf[js.Any], $setProperty = js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => ($setProperty(t0, t1)).runNow()), $trigger = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => ($trigger(t0, t1)).runNow()), _checkDisposed = _checkDisposed.toJsFn, _decodeProperty = js.Any.fromFunction2(_decodeProperty), _dispose = js.Any.fromFunction1((t0: /* skipNative */ js.UndefOr[Boolean]) => _dispose(t0).runNow()), _encodeProperty = js.Any.fromFunction2(_encodeProperty), _getDefaultPropertyValue = js.Any.fromFunction1((t0: /* propertyName */ String) => _getDefaultPropertyValue(t0).runNow()), _getStoredProperty = js.Any.fromFunction1(_getStoredProperty), _getTypeDef = js.Any.fromFunction1(_getTypeDef), _getXMLAttributes = _getXMLAttributes.toJsFn, _getXMLContent = _getXMLContent.toJsFn, _getXMLElementName = _getXMLElementName.toJsFn, _getXMLFooter = js.Any.fromFunction1(_getXMLFooter), _getXMLHeader = js.Any.fromFunction1(_getXMLHeader), _isListening = js.Any.fromFunction1(_isListening), _listen = js.Any.fromFunction2((t0: /* eventName */ String, t1: /* listening */ Boolean) => (_listen(t0, t1)).runNow()), _nativeCall = js.Any.fromFunction2(_nativeCall), _nativeCreate = js.Any.fromFunction1((t0: /* param */ js.UndefOr[StringDictionary[Any]]) => _nativeCreate(t0).runNow()), _nativeGet = js.Any.fromFunction1(_nativeGet), _nativeListen = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* listen */ Boolean) => (_nativeListen(t0, t1)).runNow()), _nativeSet = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ Any) => (_nativeSet(t0, t1)).runNow()), _nativeType = _nativeType.toJsFn, _onoff = js.Any.fromFunction3((t0: /* eventType */ String, t1: /* listening */ Boolean, t2: /* listener */ js.Function) => (_onoff(t0, t1, t2)).runNow()), _register = _register.toJsFn, _release = _release.toJsFn, _reorderProperties = js.Any.fromFunction1(_reorderProperties), _storeProperty = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* encodedValue */ Any) => (_storeProperty(t0, t1)).runNow()), _trigger = js.Any.fromFunction2(_trigger), _triggerChangeEvent = js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* newEncodedValue */ Any) => (_triggerChangeEvent(t0, t1)).runNow()), _wasSet = js.Any.fromFunction1(_wasSet), cid = cid.asInstanceOf[js.Any], close = close.toJsFn, constructor = js.Any.fromFunction1(constructor), date = date.asInstanceOf[js.Any], jsxAttributes = jsxAttributes.asInstanceOf[js.Any], off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), onClose = onClose.asInstanceOf[js.Any], onDateChanged = onDateChanged.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], once = js.Any.fromFunction3(once), open = open.toJsFn, trigger = js.Any.fromFunction1(trigger), triggerAsync = js.Any.fromFunction1(triggerAsync))
    __obj.asInstanceOf[OmitTimeDialogsetCheckDisposed]
  }
  
  extension [Self <: OmitTimeDialogsetCheckDisposed](x: Self) {
    
    inline def set$getProperty(value: /* name */ String => Any): Self = StObject.set(x, "$getProperty", js.Any.fromFunction1(value))
    
    inline def set$getPropertyGetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertyGetter", js.Any.fromFunction1(value))
    
    inline def set$getPropertySetter(value: /* propertyName */ String => Any): Self = StObject.set(x, "$getPropertySetter", js.Any.fromFunction1(value))
    
    inline def set$props(value: Any): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    
    inline def set$setProperty(value: (/* name */ String, /* value */ Any) => Callback): Self = StObject.set(x, "$setProperty", js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def set$trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Callback): Self = StObject.set(x, "$trigger", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* eventData */ js.UndefOr[js.Object]) => (value(t0, t1)).runNow()))
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClose(value: CallbackTo[typingsJapgolly.tabris.global.tabris.TimeDialog]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConstructor(value: /* properties */ js.UndefOr[Properties[TimeDialog, Omit[TimeDialog, set]]] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
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
    
    inline def setExtend(value: Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setJsxAttributes(
      value: (JSXAttributes[
          typingsJapgolly.tabris.global.tabris.TimeDialog, 
          Omit[typingsJapgolly.tabris.global.tabris.TimeDialog, set | jsxAttributes]
        ]) & `3`
    ): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    
    inline def setOff(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.TimeDialog
    ): Self = StObject.set(x, "off", js.Any.fromFunction3(value))
    
    inline def setOn(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.TimeDialog
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    inline def setOnClose(value: Listeners[TimeDialogCloseEvent[typingsJapgolly.tabris.global.tabris.TimeDialog]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnDateChanged(value: ChangeListeners[typingsJapgolly.tabris.global.tabris.TimeDialog, date]): Self = StObject.set(x, "onDateChanged", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: Listeners[TimeDialogSelectEvent[typingsJapgolly.tabris.global.tabris.TimeDialog]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnce(
      value: (/* type */ String, /* listener */ js.Function1[/* event */ EventObject[NativeObject], Any], /* context */ js.UndefOr[js.Object]) => typingsJapgolly.tabris.global.tabris.TimeDialog
    ): Self = StObject.set(x, "once", js.Any.fromFunction3(value))
    
    inline def setOpen(value: CallbackTo[typingsJapgolly.tabris.global.tabris.TimeDialog]): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setTrigger(value: /* type */ String => typingsJapgolly.tabris.global.tabris.TimeDialog): Self = StObject.set(x, "trigger", js.Any.fromFunction1(value))
    
    inline def setTriggerAsync(value: /* type */ String => js.Promise[typingsJapgolly.tabris.global.tabris.TimeDialog]): Self = StObject.set(x, "triggerAsync", js.Any.fromFunction1(value))
    
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
    
    inline def set_storeProperty(value: (/* propertyName */ String, /* encodedValue */ Any) => Callback): Self = StObject.set(x, "_storeProperty", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* encodedValue */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_trigger(value: (/* eventType */ String, /* eventData */ js.UndefOr[js.Object]) => Boolean): Self = StObject.set(x, "_trigger", js.Any.fromFunction2(value))
    
    inline def set_triggerChangeEvent(value: (/* propertyName */ String, /* newEncodedValue */ Any) => Callback): Self = StObject.set(x, "_triggerChangeEvent", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* newEncodedValue */ Any) => (value(t0, t1)).runNow()))
    
    inline def set_wasSet(value: /* propertyName */ String => Boolean): Self = StObject.set(x, "_wasSet", js.Any.fromFunction1(value))
  }
}
