package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CSSStyleDeclaration
import typingsJapgolly.reactDom.testUtilsMod.SyntheticEventData
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputAreaInputAreaDotdriverMod {
  
  trait InputAreaDriver[T]
    extends StObject
       with BaseDriver {
    
    def enterText(text: String): Unit
    
    def focus(): Unit
    
    def getAriaControls(): String
    
    def getAriaDescribedby(): String
    
    def getAriaLabel(): String
    
    def getCounterValue(): String
    
    def getCursorLocation(): Double
    
    def getDefaultValue(): String
    
    def getDisabled(): Boolean
    
    def getHasCounter(): Boolean
    
    def getMaxLength(): Double
    
    def getName(): String
    
    def getPlaceholder(): String
    
    def getReadOnly(): Boolean
    
    def getRequired(): Boolean
    
    def getResizable(): Boolean
    
    def getRowsCount(): Double
    
    def getStatusMessage(): String | Null
    
    def getStyle(): CSSStyleDeclaration
    
    def getTabIndex(): Double
    
    def getTooltipDataHook(): String
    
    def getTooltipElement(): T
    
    def getValue(): String
    
    def hasExclamation(): Boolean
    
    // Status
    def hasStatus(status: StatusIndications): Boolean
    
    def isFocus(): Boolean
    
    def isFocusedStyle(): Boolean
    
    def isHoveredStyle(): Boolean
    
    def isSizeSmall(): Boolean
    
    def trigger(
      trigger: /* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any,
      event: SyntheticEventData
    ): Unit
  }
  object InputAreaDriver {
    
    inline def apply[T](
      enterText: String => Callback,
      exists: CallbackTo[Boolean],
      focus: Callback,
      getAriaControls: CallbackTo[String],
      getAriaDescribedby: CallbackTo[String],
      getAriaLabel: CallbackTo[String],
      getCounterValue: CallbackTo[String],
      getCursorLocation: CallbackTo[Double],
      getDefaultValue: CallbackTo[String],
      getDisabled: CallbackTo[Boolean],
      getHasCounter: CallbackTo[Boolean],
      getMaxLength: CallbackTo[Double],
      getName: CallbackTo[String],
      getPlaceholder: CallbackTo[String],
      getReadOnly: CallbackTo[Boolean],
      getRequired: CallbackTo[Boolean],
      getResizable: CallbackTo[Boolean],
      getRowsCount: CallbackTo[Double],
      getStatusMessage: CallbackTo[String | Null],
      getStyle: CallbackTo[CSSStyleDeclaration],
      getTabIndex: CallbackTo[Double],
      getTooltipDataHook: CallbackTo[String],
      getTooltipElement: CallbackTo[T],
      getValue: CallbackTo[String],
      hasExclamation: CallbackTo[Boolean],
      hasStatus: StatusIndications => Boolean,
      isFocus: CallbackTo[Boolean],
      isFocusedStyle: CallbackTo[Boolean],
      isHoveredStyle: CallbackTo[Boolean],
      isSizeSmall: CallbackTo[Boolean],
      trigger: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, SyntheticEventData) => Callback
    ): InputAreaDriver[T] = {
      val __obj = js.Dynamic.literal(enterText = js.Any.fromFunction1((t0: String) => enterText(t0).runNow()), exists = exists.toJsFn, focus = focus.toJsFn, getAriaControls = getAriaControls.toJsFn, getAriaDescribedby = getAriaDescribedby.toJsFn, getAriaLabel = getAriaLabel.toJsFn, getCounterValue = getCounterValue.toJsFn, getCursorLocation = getCursorLocation.toJsFn, getDefaultValue = getDefaultValue.toJsFn, getDisabled = getDisabled.toJsFn, getHasCounter = getHasCounter.toJsFn, getMaxLength = getMaxLength.toJsFn, getName = getName.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getReadOnly = getReadOnly.toJsFn, getRequired = getRequired.toJsFn, getResizable = getResizable.toJsFn, getRowsCount = getRowsCount.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getStyle = getStyle.toJsFn, getTabIndex = getTabIndex.toJsFn, getTooltipDataHook = getTooltipDataHook.toJsFn, getTooltipElement = getTooltipElement.toJsFn, getValue = getValue.toJsFn, hasExclamation = hasExclamation.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), isFocus = isFocus.toJsFn, isFocusedStyle = isFocusedStyle.toJsFn, isHoveredStyle = isHoveredStyle.toJsFn, isSizeSmall = isSizeSmall.toJsFn, trigger = js.Any.fromFunction2((t0: /* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, t1: SyntheticEventData) => (trigger(t0, t1)).runNow()))
      __obj.asInstanceOf[InputAreaDriver[T]]
    }
    
    extension [Self <: InputAreaDriver[?], T](x: Self & InputAreaDriver[T]) {
      
      inline def setEnterText(value: String => Callback): Self = StObject.set(x, "enterText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetAriaControls(value: CallbackTo[String]): Self = StObject.set(x, "getAriaControls", value.toJsFn)
      
      inline def setGetAriaDescribedby(value: CallbackTo[String]): Self = StObject.set(x, "getAriaDescribedby", value.toJsFn)
      
      inline def setGetAriaLabel(value: CallbackTo[String]): Self = StObject.set(x, "getAriaLabel", value.toJsFn)
      
      inline def setGetCounterValue(value: CallbackTo[String]): Self = StObject.set(x, "getCounterValue", value.toJsFn)
      
      inline def setGetCursorLocation(value: CallbackTo[Double]): Self = StObject.set(x, "getCursorLocation", value.toJsFn)
      
      inline def setGetDefaultValue(value: CallbackTo[String]): Self = StObject.set(x, "getDefaultValue", value.toJsFn)
      
      inline def setGetDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDisabled", value.toJsFn)
      
      inline def setGetHasCounter(value: CallbackTo[Boolean]): Self = StObject.set(x, "getHasCounter", value.toJsFn)
      
      inline def setGetMaxLength(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxLength", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetPlaceholder(value: CallbackTo[String]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
      
      inline def setGetReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "getReadOnly", value.toJsFn)
      
      inline def setGetRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "getRequired", value.toJsFn)
      
      inline def setGetResizable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getResizable", value.toJsFn)
      
      inline def setGetRowsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getRowsCount", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[String | Null]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetStyle(value: CallbackTo[CSSStyleDeclaration]): Self = StObject.set(x, "getStyle", value.toJsFn)
      
      inline def setGetTabIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getTabIndex", value.toJsFn)
      
      inline def setGetTooltipDataHook(value: CallbackTo[String]): Self = StObject.set(x, "getTooltipDataHook", value.toJsFn)
      
      inline def setGetTooltipElement(value: CallbackTo[T]): Self = StObject.set(x, "getTooltipElement", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasExclamation(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasExclamation", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => Boolean): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsFocus(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocus", value.toJsFn)
      
      inline def setIsFocusedStyle(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocusedStyle", value.toJsFn)
      
      inline def setIsHoveredStyle(value: CallbackTo[Boolean]): Self = StObject.set(x, "isHoveredStyle", value.toJsFn)
      
      inline def setIsSizeSmall(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSizeSmall", value.toJsFn)
      
      inline def setTrigger(
        value: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, SyntheticEventData) => Callback
      ): Self = StObject.set(x, "trigger", js.Any.fromFunction2((t0: /* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, t1: SyntheticEventData) => (value(t0, t1)).runNow()))
    }
  }
}
