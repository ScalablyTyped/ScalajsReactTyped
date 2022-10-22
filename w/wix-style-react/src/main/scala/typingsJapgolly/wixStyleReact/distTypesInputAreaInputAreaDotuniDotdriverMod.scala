package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDom.testUtilsMod.SyntheticEventData
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputAreaInputAreaDotuniDotdriverMod {
  
  trait InputAreaUniDriver
    extends StObject
       with BaseUniDriver {
    
    def enterText(text: String): js.Promise[String]
    
    def focus(): js.Promise[Unit]
    
    def getAriaControls(): js.Promise[String | Null]
    
    def getAriaDescribedby(): js.Promise[String | Null]
    
    def getAriaLabel(): js.Promise[String | Null]
    
    def getCounterValue(): js.Promise[String]
    
    def getCursorLocation(): js.Promise[Double]
    
    def getDefaultValue(): js.Promise[Any]
    
    def getDisabled(): js.Promise[Boolean]
    
    def getHasCounter(): js.Promise[Boolean]
    
    def getMaxLength(): js.Promise[Any]
    
    def getName(): js.Promise[String | Null]
    
    def getPlaceholder(): js.Promise[Any]
    
    def getReadOnly(): js.Promise[Any]
    
    def getRequired(): js.Promise[Boolean]
    
    def getResizable(): js.Promise[Boolean]
    
    def getRowsCount(): js.Promise[Any]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getStyle(): js.Promise[Any]
    
    def getTabIndex(): js.Promise[Any]
    
    def getTooltipDataHook(): String
    
    def getTooltipElement(): UniDriver[Any]
    
    def getValue(): js.Promise[String]
    
    def hasExclamation(): js.Promise[Boolean]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def isFocus(): js.Promise[Boolean]
    
    def isFocusedStyle(): js.Promise[Boolean]
    
    def isHoveredStyle(): js.Promise[Boolean]
    
    def isSizeSmall(): js.Promise[Boolean]
    
    def trigger(
      trigger: /* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any,
      event: SyntheticEventData
    ): js.Promise[Unit]
  }
  object InputAreaUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      enterText: String => js.Promise[String],
      exists: CallbackTo[js.Promise[Boolean]],
      focus: CallbackTo[js.Promise[Unit]],
      getAriaControls: CallbackTo[js.Promise[String | Null]],
      getAriaDescribedby: CallbackTo[js.Promise[String | Null]],
      getAriaLabel: CallbackTo[js.Promise[String | Null]],
      getCounterValue: CallbackTo[js.Promise[String]],
      getCursorLocation: CallbackTo[js.Promise[Double]],
      getDefaultValue: CallbackTo[js.Promise[Any]],
      getDisabled: CallbackTo[js.Promise[Boolean]],
      getHasCounter: CallbackTo[js.Promise[Boolean]],
      getMaxLength: CallbackTo[js.Promise[Any]],
      getName: CallbackTo[js.Promise[String | Null]],
      getPlaceholder: CallbackTo[js.Promise[Any]],
      getReadOnly: CallbackTo[js.Promise[Any]],
      getRequired: CallbackTo[js.Promise[Boolean]],
      getResizable: CallbackTo[js.Promise[Boolean]],
      getRowsCount: CallbackTo[js.Promise[Any]],
      getStatusMessage: CallbackTo[js.Promise[String | Null]],
      getStyle: CallbackTo[js.Promise[Any]],
      getTabIndex: CallbackTo[js.Promise[Any]],
      getTooltipDataHook: CallbackTo[String],
      getTooltipElement: CallbackTo[UniDriver[Any]],
      getValue: CallbackTo[js.Promise[String]],
      hasExclamation: CallbackTo[js.Promise[Boolean]],
      hasStatus: StatusIndications => js.Promise[Boolean],
      isFocus: CallbackTo[js.Promise[Boolean]],
      isFocusedStyle: CallbackTo[js.Promise[Boolean]],
      isHoveredStyle: CallbackTo[js.Promise[Boolean]],
      isSizeSmall: CallbackTo[js.Promise[Boolean]],
      trigger: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, SyntheticEventData) => js.Promise[Unit]
    ): InputAreaUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, enterText = js.Any.fromFunction1(enterText), exists = exists.toJsFn, focus = focus.toJsFn, getAriaControls = getAriaControls.toJsFn, getAriaDescribedby = getAriaDescribedby.toJsFn, getAriaLabel = getAriaLabel.toJsFn, getCounterValue = getCounterValue.toJsFn, getCursorLocation = getCursorLocation.toJsFn, getDefaultValue = getDefaultValue.toJsFn, getDisabled = getDisabled.toJsFn, getHasCounter = getHasCounter.toJsFn, getMaxLength = getMaxLength.toJsFn, getName = getName.toJsFn, getPlaceholder = getPlaceholder.toJsFn, getReadOnly = getReadOnly.toJsFn, getRequired = getRequired.toJsFn, getResizable = getResizable.toJsFn, getRowsCount = getRowsCount.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getStyle = getStyle.toJsFn, getTabIndex = getTabIndex.toJsFn, getTooltipDataHook = getTooltipDataHook.toJsFn, getTooltipElement = getTooltipElement.toJsFn, getValue = getValue.toJsFn, hasExclamation = hasExclamation.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), isFocus = isFocus.toJsFn, isFocusedStyle = isFocusedStyle.toJsFn, isHoveredStyle = isHoveredStyle.toJsFn, isSizeSmall = isSizeSmall.toJsFn, trigger = js.Any.fromFunction2(trigger))
      __obj.asInstanceOf[InputAreaUniDriver]
    }
    
    extension [Self <: InputAreaUniDriver](x: Self) {
      
      inline def setEnterText(value: String => js.Promise[String]): Self = StObject.set(x, "enterText", js.Any.fromFunction1(value))
      
      inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetAriaControls(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getAriaControls", value.toJsFn)
      
      inline def setGetAriaDescribedby(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getAriaDescribedby", value.toJsFn)
      
      inline def setGetAriaLabel(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getAriaLabel", value.toJsFn)
      
      inline def setGetCounterValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCounterValue", value.toJsFn)
      
      inline def setGetCursorLocation(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getCursorLocation", value.toJsFn)
      
      inline def setGetDefaultValue(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getDefaultValue", value.toJsFn)
      
      inline def setGetDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "getDisabled", value.toJsFn)
      
      inline def setGetHasCounter(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "getHasCounter", value.toJsFn)
      
      inline def setGetMaxLength(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getMaxLength", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetPlaceholder(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getPlaceholder", value.toJsFn)
      
      inline def setGetReadOnly(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getReadOnly", value.toJsFn)
      
      inline def setGetRequired(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "getRequired", value.toJsFn)
      
      inline def setGetResizable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "getResizable", value.toJsFn)
      
      inline def setGetRowsCount(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getRowsCount", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetStyle(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getStyle", value.toJsFn)
      
      inline def setGetTabIndex(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getTabIndex", value.toJsFn)
      
      inline def setGetTooltipDataHook(value: CallbackTo[String]): Self = StObject.set(x, "getTooltipDataHook", value.toJsFn)
      
      inline def setGetTooltipElement(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getTooltipElement", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setHasExclamation(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasExclamation", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setIsFocus(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocus", value.toJsFn)
      
      inline def setIsFocusedStyle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocusedStyle", value.toJsFn)
      
      inline def setIsHoveredStyle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isHoveredStyle", value.toJsFn)
      
      inline def setIsSizeSmall(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSizeSmall", value.toJsFn)
      
      inline def setTrigger(
        value: (/* keyof wix-style-react.anon.TypeofSimulate */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 68, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.compositionStart, typingsJapgolly.wixStyleReact.wixStyleReactStrings.encrypted, typingsJapgolly.wixStyleReact.wixStyleReactStrings.canPlayThrough */ Any, SyntheticEventData) => js.Promise[Unit]
      ): Self = StObject.set(x, "trigger", js.Any.fromFunction2(value))
    }
  }
}
