package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ReturnType
import typingsJapgolly.wixStyleReact.anon.EventTrigger
import typingsJapgolly.wixStyleReact.anon.GetTooltipText
import typingsJapgolly.wixStyleReact.distTypesPopoverMenuPopoverMenuDotuniDotdriverMod.PopoverMenuUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableActionCellTableActionCellDotdriverMod {
  
  trait TableActionCellDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickHiddenAction(actionIndex: Double): Unit
    
    def clickHiddenActionByDataHook(actionDataHook: String): Unit
    
    def clickPopoverMenu(): Unit
    
    def clickPrimaryActionButton(): Unit
    
    def clickVisibleAction(actionIndex: Double): Unit
    
    def clickVisibleActionByDataHook(actionDataHook: String): Unit
    
    def element(): T
    
    def getHiddenActionsCount(): Double
    
    def getHiddenActionsPopoverMenuDriver(): PopoverMenuUniDriver
    
    def getIsPrimaryActionButtonDisabled(): Boolean
    
    def getMoreActionsTooltipText(): String
    
    def getVisibleActionByDataHookTooltipDriver(dataHook: String): ReturnType[js.Function1[/* hasElementEventTrigger */ EventTrigger, GetTooltipText]]
    
    def getVisibleActionTooltipDriver(action: Double): ReturnType[js.Function1[/* hasElementEventTrigger */ EventTrigger, GetTooltipText]]
    
    def getVisibleActionsCount(): Double
    
    def primaryActionButtonPrefixIconExists(): Boolean
    
    def primaryActionButtonSuffixIconExists(): Boolean
  }
  object TableActionCellDriver {
    
    inline def apply[T](
      clickHiddenAction: Double => Callback,
      clickHiddenActionByDataHook: String => Callback,
      clickPopoverMenu: Callback,
      clickPrimaryActionButton: Callback,
      clickVisibleAction: Double => Callback,
      clickVisibleActionByDataHook: String => Callback,
      element: CallbackTo[T],
      exists: CallbackTo[Boolean],
      getHiddenActionsCount: CallbackTo[Double],
      getHiddenActionsPopoverMenuDriver: CallbackTo[PopoverMenuUniDriver],
      getIsPrimaryActionButtonDisabled: CallbackTo[Boolean],
      getMoreActionsTooltipText: CallbackTo[String],
      getVisibleActionByDataHookTooltipDriver: String => ReturnType[js.Function1[/* hasElementEventTrigger */ EventTrigger, GetTooltipText]],
      getVisibleActionTooltipDriver: Double => ReturnType[js.Function1[/* hasElementEventTrigger */ EventTrigger, GetTooltipText]],
      getVisibleActionsCount: CallbackTo[Double],
      primaryActionButtonPrefixIconExists: CallbackTo[Boolean],
      primaryActionButtonSuffixIconExists: CallbackTo[Boolean]
    ): TableActionCellDriver[T] = {
      val __obj = js.Dynamic.literal(clickHiddenAction = js.Any.fromFunction1((t0: Double) => clickHiddenAction(t0).runNow()), clickHiddenActionByDataHook = js.Any.fromFunction1((t0: String) => clickHiddenActionByDataHook(t0).runNow()), clickPopoverMenu = clickPopoverMenu.toJsFn, clickPrimaryActionButton = clickPrimaryActionButton.toJsFn, clickVisibleAction = js.Any.fromFunction1((t0: Double) => clickVisibleAction(t0).runNow()), clickVisibleActionByDataHook = js.Any.fromFunction1((t0: String) => clickVisibleActionByDataHook(t0).runNow()), element = element.toJsFn, exists = exists.toJsFn, getHiddenActionsCount = getHiddenActionsCount.toJsFn, getHiddenActionsPopoverMenuDriver = getHiddenActionsPopoverMenuDriver.toJsFn, getIsPrimaryActionButtonDisabled = getIsPrimaryActionButtonDisabled.toJsFn, getMoreActionsTooltipText = getMoreActionsTooltipText.toJsFn, getVisibleActionByDataHookTooltipDriver = js.Any.fromFunction1(getVisibleActionByDataHookTooltipDriver), getVisibleActionTooltipDriver = js.Any.fromFunction1(getVisibleActionTooltipDriver), getVisibleActionsCount = getVisibleActionsCount.toJsFn, primaryActionButtonPrefixIconExists = primaryActionButtonPrefixIconExists.toJsFn, primaryActionButtonSuffixIconExists = primaryActionButtonSuffixIconExists.toJsFn)
      __obj.asInstanceOf[TableActionCellDriver[T]]
    }
    
    extension [Self <: TableActionCellDriver[?], T](x: Self & TableActionCellDriver[T]) {
      
      inline def setClickHiddenAction(value: Double => Callback): Self = StObject.set(x, "clickHiddenAction", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setClickHiddenActionByDataHook(value: String => Callback): Self = StObject.set(x, "clickHiddenActionByDataHook", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setClickPopoverMenu(value: Callback): Self = StObject.set(x, "clickPopoverMenu", value.toJsFn)
      
      inline def setClickPrimaryActionButton(value: Callback): Self = StObject.set(x, "clickPrimaryActionButton", value.toJsFn)
      
      inline def setClickVisibleAction(value: Double => Callback): Self = StObject.set(x, "clickVisibleAction", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setClickVisibleActionByDataHook(value: String => Callback): Self = StObject.set(x, "clickVisibleActionByDataHook", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setElement(value: CallbackTo[T]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setGetHiddenActionsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getHiddenActionsCount", value.toJsFn)
      
      inline def setGetHiddenActionsPopoverMenuDriver(value: CallbackTo[PopoverMenuUniDriver]): Self = StObject.set(x, "getHiddenActionsPopoverMenuDriver", value.toJsFn)
      
      inline def setGetIsPrimaryActionButtonDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsPrimaryActionButtonDisabled", value.toJsFn)
      
      inline def setGetMoreActionsTooltipText(value: CallbackTo[String]): Self = StObject.set(x, "getMoreActionsTooltipText", value.toJsFn)
      
      inline def setGetVisibleActionByDataHookTooltipDriver(
        value: String => ReturnType[js.Function1[/* hasElementEventTrigger */ EventTrigger, GetTooltipText]]
      ): Self = StObject.set(x, "getVisibleActionByDataHookTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionTooltipDriver(
        value: Double => ReturnType[js.Function1[/* hasElementEventTrigger */ EventTrigger, GetTooltipText]]
      ): Self = StObject.set(x, "getVisibleActionTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getVisibleActionsCount", value.toJsFn)
      
      inline def setPrimaryActionButtonPrefixIconExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "primaryActionButtonPrefixIconExists", value.toJsFn)
      
      inline def setPrimaryActionButtonSuffixIconExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "primaryActionButtonSuffixIconExists", value.toJsFn)
    }
  }
}
