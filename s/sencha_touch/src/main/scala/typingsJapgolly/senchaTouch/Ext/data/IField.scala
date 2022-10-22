package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField
  extends StObject
     with IBase {
  
  /** [Config Option] (Boolean) */
  var allowNull: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Function) */
  var convert: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the value of allowNull
    * @returns Boolean
    */
  var getAllowNull: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of bubbleEvents
    * @returns String
    */
  var getBubbleEvents: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of convert
    * @returns Function
    */
  var getConvert: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of dateFormat
    * @returns String
    */
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of decode
    * @returns Object
    */
  var getDecode: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of defaultValue
    * @returns Object
    */
  var getDefaultValue: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of encode
    * @returns Object
    */
  var getEncode: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of mapping
    * @returns String/Number
    */
  var getMapping: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of persist
    * @returns Boolean
    */
  var getPersist: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of sortDir
    * @returns String
    */
  var getSortDir: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of sortType
    * @returns Function
    */
  var getSortType: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of type
    * @returns String/Object
    */
  var getType: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the value of allowNull
    * @param allowNull Boolean The new value.
    */
  var setAllowNull: js.UndefOr[js.Function1[/* allowNull */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of bubbleEvents
    * @param bubbleEvents String The new value.
    */
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of convert
    * @param convert Function The new value.
    */
  var setConvert: js.UndefOr[js.Function1[/* convert */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of dateFormat
    * @param dateFormat String The new value.
    */
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of decode
    * @param decode Object The new value.
    */
  var setDecode: js.UndefOr[js.Function1[/* decode */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of defaultValue
    * @param defaultValue Object The new value.
    */
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of encode
    * @param encode Object The new value.
    */
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of mapping
    * @param mapping String/Number The new value.
    */
  var setMapping: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of persist
    * @param persist Boolean The new value.
    */
  var setPersist: js.UndefOr[js.Function1[/* persist */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortDir
    * @param sortDir String The new value.
    */
  var setSortDir: js.UndefOr[js.Function1[/* sortDir */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of sortType
    * @param sortType Function The new value.
    */
  var setSortType: js.UndefOr[js.Function1[/* sortType */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of type
    * @param type String/Object The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Function) */
  var sortType: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.undefined
}
object IField {
  
  inline def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  extension [Self <: IField](x: Self) {
    
    inline def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
    
    inline def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    
    inline def setConvert(value: Any): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setGetAllowNull(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAllowNull", value.toJsFn)
    
    inline def setGetAllowNullUndefined: Self = StObject.set(x, "getAllowNull", js.undefined)
    
    inline def setGetBubbleEvents(value: CallbackTo[String]): Self = StObject.set(x, "getBubbleEvents", value.toJsFn)
    
    inline def setGetBubbleEventsUndefined: Self = StObject.set(x, "getBubbleEvents", js.undefined)
    
    inline def setGetConvert(value: CallbackTo[Any]): Self = StObject.set(x, "getConvert", value.toJsFn)
    
    inline def setGetConvertUndefined: Self = StObject.set(x, "getConvert", js.undefined)
    
    inline def setGetDateFormat(value: CallbackTo[String]): Self = StObject.set(x, "getDateFormat", value.toJsFn)
    
    inline def setGetDateFormatUndefined: Self = StObject.set(x, "getDateFormat", js.undefined)
    
    inline def setGetDecode(value: CallbackTo[Any]): Self = StObject.set(x, "getDecode", value.toJsFn)
    
    inline def setGetDecodeUndefined: Self = StObject.set(x, "getDecode", js.undefined)
    
    inline def setGetDefaultValue(value: CallbackTo[Any]): Self = StObject.set(x, "getDefaultValue", value.toJsFn)
    
    inline def setGetDefaultValueUndefined: Self = StObject.set(x, "getDefaultValue", js.undefined)
    
    inline def setGetEncode(value: CallbackTo[Any]): Self = StObject.set(x, "getEncode", value.toJsFn)
    
    inline def setGetEncodeUndefined: Self = StObject.set(x, "getEncode", js.undefined)
    
    inline def setGetMapping(value: CallbackTo[Any]): Self = StObject.set(x, "getMapping", value.toJsFn)
    
    inline def setGetMappingUndefined: Self = StObject.set(x, "getMapping", js.undefined)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setGetPersist(value: CallbackTo[Boolean]): Self = StObject.set(x, "getPersist", value.toJsFn)
    
    inline def setGetPersistUndefined: Self = StObject.set(x, "getPersist", js.undefined)
    
    inline def setGetSortDir(value: CallbackTo[String]): Self = StObject.set(x, "getSortDir", value.toJsFn)
    
    inline def setGetSortDirUndefined: Self = StObject.set(x, "getSortDir", js.undefined)
    
    inline def setGetSortType(value: CallbackTo[Any]): Self = StObject.set(x, "getSortType", value.toJsFn)
    
    inline def setGetSortTypeUndefined: Self = StObject.set(x, "getSortType", js.undefined)
    
    inline def setGetType(value: CallbackTo[Any]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setMapping(value: Any): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setSetAllowNull(value: /* allowNull */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAllowNull", js.Any.fromFunction1((t0: /* allowNull */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAllowNullUndefined: Self = StObject.set(x, "setAllowNull", js.undefined)
    
    inline def setSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setBubbleEvents", js.Any.fromFunction1((t0: /* bubbleEvents */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetBubbleEventsUndefined: Self = StObject.set(x, "setBubbleEvents", js.undefined)
    
    inline def setSetConvert(value: /* convert */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setConvert", js.Any.fromFunction1((t0: /* convert */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetConvertUndefined: Self = StObject.set(x, "setConvert", js.undefined)
    
    inline def setSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setDateFormat", js.Any.fromFunction1((t0: /* dateFormat */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetDateFormatUndefined: Self = StObject.set(x, "setDateFormat", js.undefined)
    
    inline def setSetDecode(value: /* decode */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDecode", js.Any.fromFunction1((t0: /* decode */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDecodeUndefined: Self = StObject.set(x, "setDecode", js.undefined)
    
    inline def setSetDefaultValue(value: /* defaultValue */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDefaultValue", js.Any.fromFunction1((t0: /* defaultValue */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetDefaultValueUndefined: Self = StObject.set(x, "setDefaultValue", js.undefined)
    
    inline def setSetEncode(value: /* encode */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setEncode", js.Any.fromFunction1((t0: /* encode */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetEncodeUndefined: Self = StObject.set(x, "setEncode", js.undefined)
    
    inline def setSetMapping(value: /* mapping */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMapping", js.Any.fromFunction1((t0: /* mapping */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetMappingUndefined: Self = StObject.set(x, "setMapping", js.undefined)
    
    inline def setSetName(value: /* name */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: /* name */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    inline def setSetPersist(value: /* persist */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setPersist", js.Any.fromFunction1((t0: /* persist */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetPersistUndefined: Self = StObject.set(x, "setPersist", js.undefined)
    
    inline def setSetSortDir(value: /* sortDir */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setSortDir", js.Any.fromFunction1((t0: /* sortDir */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetSortDirUndefined: Self = StObject.set(x, "setSortDir", js.undefined)
    
    inline def setSetSortType(value: /* sortType */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setSortType", js.Any.fromFunction1((t0: /* sortType */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetSortTypeUndefined: Self = StObject.set(x, "setSortType", js.undefined)
    
    inline def setSetType(value: /* type */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: /* type */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
    
    inline def setSortDir(value: String): Self = StObject.set(x, "sortDir", value.asInstanceOf[js.Any])
    
    inline def setSortDirUndefined: Self = StObject.set(x, "sortDir", js.undefined)
    
    inline def setSortType(value: Any): Self = StObject.set(x, "sortType", value.asInstanceOf[js.Any])
    
    inline def setSortTypeUndefined: Self = StObject.set(x, "sortType", js.undefined)
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseNull(value: Boolean): Self = StObject.set(x, "useNull", value.asInstanceOf[js.Any])
    
    inline def setUseNullUndefined: Self = StObject.set(x, "useNull", js.undefined)
  }
}
