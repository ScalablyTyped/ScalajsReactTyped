package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.openui5.sapUiCoreElementMod.default
import typingsJapgolly.openui5.sapUiCoreLibraryMod.dnd.RelativeDropPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDndDragAndDropMod {
  
  trait DragSession extends StObject {
    
    var __implements__sap_ui_core_dnd_DragSession: Boolean
    
    /**
      * Returns the data that has been set via `setComplexData` method.
      *
      * @returns The previously set data or undefined
      */
    def getComplexData(/**
      * The key of the data
      */
    sKey: String): js.UndefOr[Any]
    
    /**
      * Returns the data that has been set via `setData` method.
      *
      * @returns Data
      */
    def getData(/**
      * The key of the data
      */
    sKey: String): String
    
    /**
      * Returns the dragged control, if available within the same UI5 application frame.
      */
    def getDragControl(): default | Null
    
    /**
      * The valid drop target underneath the dragged control.
      */
    def getDropControl(): default | Null
    
    /**
      * Returns the drop configuration corresponding to the drop control.
      */
    def getDropInfo(): typingsJapgolly.openui5.sapUiCoreDndDropInfoMod.default | Null
    
    /**
      * Returns the calculated position of the drop action relative to the valid dropped control.
      */
    def getDropPosition(): RelativeDropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.RelativeDropPosition * / any */ String)
    
    /**
      * Returns the drop indicator.
      *
      * @returns Drop indicator's DOM reference
      */
    def getIndicator(): HTMLElement | Null
    
    /**
      * Returns the visual configuration of the drop indicator.
      *
      * @returns Drop indicator configuration
      */
    def getIndicatorConfig(): js.Object
    
    /**
      * Returns the data that has been set via `setTextData` method.
      *
      * @returns Data
      */
    def getTextData(): String
    
    /**
      * Sets any type of data (even functions, pointers, anything non-serializable) with any MIME type. **Note:**
      * This works only within a UI5 application within the same window/frame.
      */
    def setComplexData(/**
      * The key of the data
      */
    sKey: String, /**
      * Data
      */
    vData: Any): Unit
    
    /**
      * Sets string data with any MIME type. **Note:** This works if you navigate between different windows.
      */
    def setData(/**
      * The key of the data
      */
    sKey: String, /**
      * Data
      */
    sData: String): Unit
    
    /**
      * Set the valid drop control.
      */
    def setDropControl(): Unit
    
    /**
      * Defines the visual configuration of the drop indicator for the current `DropInfo`.
      */
    def setIndicatorConfig(/**
      * Custom styles of the drop indicator.
      */
    mConfig: js.Object): Unit
    
    /**
      * Sets string data with plain text MIME type. **Note:** This works if you navigate between different windows.
      */
    def setTextData(/**
      * Data
      */
    sData: String): Unit
  }
  object DragSession {
    
    inline def apply(
      __implements__sap_ui_core_dnd_DragSession: Boolean,
      getComplexData: String => js.UndefOr[Any],
      getData: String => String,
      getDragControl: CallbackTo[default | Null],
      getDropControl: CallbackTo[default | Null],
      getDropInfo: CallbackTo[typingsJapgolly.openui5.sapUiCoreDndDropInfoMod.default | Null],
      getDropPosition: CallbackTo[
          RelativeDropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.RelativeDropPosition * / any */ String)
        ],
      getIndicator: CallbackTo[HTMLElement | Null],
      getIndicatorConfig: CallbackTo[js.Object],
      getTextData: CallbackTo[String],
      setComplexData: (String, Any) => Callback,
      setData: (String, String) => Callback,
      setDropControl: Callback,
      setIndicatorConfig: js.Object => Callback,
      setTextData: String => Callback
    ): DragSession = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_core_dnd_DragSession = __implements__sap_ui_core_dnd_DragSession.asInstanceOf[js.Any], getComplexData = js.Any.fromFunction1(getComplexData), getData = js.Any.fromFunction1(getData), getDragControl = getDragControl.toJsFn, getDropControl = getDropControl.toJsFn, getDropInfo = getDropInfo.toJsFn, getDropPosition = getDropPosition.toJsFn, getIndicator = getIndicator.toJsFn, getIndicatorConfig = getIndicatorConfig.toJsFn, getTextData = getTextData.toJsFn, setComplexData = js.Any.fromFunction2((t0: String, t1: Any) => (setComplexData(t0, t1)).runNow()), setData = js.Any.fromFunction2((t0: String, t1: String) => (setData(t0, t1)).runNow()), setDropControl = setDropControl.toJsFn, setIndicatorConfig = js.Any.fromFunction1((t0: js.Object) => setIndicatorConfig(t0).runNow()), setTextData = js.Any.fromFunction1((t0: String) => setTextData(t0).runNow()))
      __obj.asInstanceOf[DragSession]
    }
    
    extension [Self <: DragSession](x: Self) {
      
      inline def setGetComplexData(value: String => js.UndefOr[Any]): Self = StObject.set(x, "getComplexData", js.Any.fromFunction1(value))
      
      inline def setGetData(value: String => String): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setGetDragControl(value: CallbackTo[default | Null]): Self = StObject.set(x, "getDragControl", value.toJsFn)
      
      inline def setGetDropControl(value: CallbackTo[default | Null]): Self = StObject.set(x, "getDropControl", value.toJsFn)
      
      inline def setGetDropInfo(value: CallbackTo[typingsJapgolly.openui5.sapUiCoreDndDropInfoMod.default | Null]): Self = StObject.set(x, "getDropInfo", value.toJsFn)
      
      inline def setGetDropPosition(
        value: CallbackTo[
              RelativeDropPosition | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof dnd.RelativeDropPosition * / any */ String)
            ]
      ): Self = StObject.set(x, "getDropPosition", value.toJsFn)
      
      inline def setGetIndicator(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getIndicator", value.toJsFn)
      
      inline def setGetIndicatorConfig(value: CallbackTo[js.Object]): Self = StObject.set(x, "getIndicatorConfig", value.toJsFn)
      
      inline def setGetTextData(value: CallbackTo[String]): Self = StObject.set(x, "getTextData", value.toJsFn)
      
      inline def setSetComplexData(value: (String, Any) => Callback): Self = StObject.set(x, "setComplexData", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSetData(value: (String, String) => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetDropControl(value: Callback): Self = StObject.set(x, "setDropControl", value.toJsFn)
      
      inline def setSetIndicatorConfig(value: js.Object => Callback): Self = StObject.set(x, "setIndicatorConfig", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      
      inline def setSetTextData(value: String => Callback): Self = StObject.set(x, "setTextData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def set__implements__sap_ui_core_dnd_DragSession(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_dnd_DragSession", value.asInstanceOf[js.Any])
    }
  }
}
