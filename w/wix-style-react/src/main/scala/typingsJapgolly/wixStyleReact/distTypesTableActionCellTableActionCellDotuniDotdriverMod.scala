package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ReturnType
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixStyleReact.anon.HasSize
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDotuniDotdriverMod.ButtonUniDriver
import typingsJapgolly.wixStyleReact.distTypesPopoverMenuPopoverMenuDotuniDotdriverMod.PopoverMenuUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableActionCellTableActionCellDotuniDotdriverMod {
  
  trait TableActionCellUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickHiddenAction(actionIndex: Double): js.Promise[Unit]
    
    def clickHiddenActionByDataHook(actionDataHook: String): js.Promise[Unit]
    
    def clickPopoverMenu(): js.Promise[Unit]
    
    def clickPrimaryActionButton(): js.Promise[Unit]
    
    def clickVisibleAction(actionIndex: Double): js.Promise[Unit]
    
    def clickVisibleActionByDataHook(actionDataHook: String): js.Promise[Unit]
    
    def getHiddenActionsCount(): js.Promise[Double]
    
    def getHiddenActionsPopoverMenuDriver(): js.Promise[PopoverMenuUniDriver]
    
    def getIsPrimaryActionButtonDisabled(): js.Promise[Boolean]
    
    def getMoreActionsTooltipText(): js.Promise[String]
    
    def getPrimaryActionButtonDriver(): js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]]
    
    def getVisibleActionByDataHookTooltipDriver(dataHook: String): js.Promise[
        ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
      ]
    
    def getVisibleActionTooltipDriver(action: Double): js.Promise[
        ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
      ]
    
    def getVisibleActionsCount(): js.Promise[Double]
    
    def primaryActionButtonPrefixIconExists(): js.Promise[Boolean]
    
    def primaryActionButtonSuffixIconExists(): js.Promise[Boolean]
  }
  object TableActionCellUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickHiddenAction: Double => js.Promise[Unit],
      clickHiddenActionByDataHook: String => js.Promise[Unit],
      clickPopoverMenu: CallbackTo[js.Promise[Unit]],
      clickPrimaryActionButton: CallbackTo[js.Promise[Unit]],
      clickVisibleAction: Double => js.Promise[Unit],
      clickVisibleActionByDataHook: String => js.Promise[Unit],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getHiddenActionsCount: CallbackTo[js.Promise[Double]],
      getHiddenActionsPopoverMenuDriver: CallbackTo[js.Promise[PopoverMenuUniDriver]],
      getIsPrimaryActionButtonDisabled: CallbackTo[js.Promise[Boolean]],
      getMoreActionsTooltipText: CallbackTo[js.Promise[String]],
      getPrimaryActionButtonDriver: CallbackTo[js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]]],
      getVisibleActionByDataHookTooltipDriver: String => js.Promise[
          ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
        ],
      getVisibleActionTooltipDriver: Double => js.Promise[
          ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
        ],
      getVisibleActionsCount: CallbackTo[js.Promise[Double]],
      primaryActionButtonPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      primaryActionButtonSuffixIconExists: CallbackTo[js.Promise[Boolean]]
    ): TableActionCellUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickHiddenAction = js.Any.fromFunction1(clickHiddenAction), clickHiddenActionByDataHook = js.Any.fromFunction1(clickHiddenActionByDataHook), clickPopoverMenu = clickPopoverMenu.toJsFn, clickPrimaryActionButton = clickPrimaryActionButton.toJsFn, clickVisibleAction = js.Any.fromFunction1(clickVisibleAction), clickVisibleActionByDataHook = js.Any.fromFunction1(clickVisibleActionByDataHook), element = element.toJsFn, exists = exists.toJsFn, getHiddenActionsCount = getHiddenActionsCount.toJsFn, getHiddenActionsPopoverMenuDriver = getHiddenActionsPopoverMenuDriver.toJsFn, getIsPrimaryActionButtonDisabled = getIsPrimaryActionButtonDisabled.toJsFn, getMoreActionsTooltipText = getMoreActionsTooltipText.toJsFn, getPrimaryActionButtonDriver = getPrimaryActionButtonDriver.toJsFn, getVisibleActionByDataHookTooltipDriver = js.Any.fromFunction1(getVisibleActionByDataHookTooltipDriver), getVisibleActionTooltipDriver = js.Any.fromFunction1(getVisibleActionTooltipDriver), getVisibleActionsCount = getVisibleActionsCount.toJsFn, primaryActionButtonPrefixIconExists = primaryActionButtonPrefixIconExists.toJsFn, primaryActionButtonSuffixIconExists = primaryActionButtonSuffixIconExists.toJsFn)
      __obj.asInstanceOf[TableActionCellUniDriver]
    }
    
    extension [Self <: TableActionCellUniDriver](x: Self) {
      
      inline def setClickHiddenAction(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickHiddenAction", js.Any.fromFunction1(value))
      
      inline def setClickHiddenActionByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickHiddenActionByDataHook", js.Any.fromFunction1(value))
      
      inline def setClickPopoverMenu(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickPopoverMenu", value.toJsFn)
      
      inline def setClickPrimaryActionButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickPrimaryActionButton", value.toJsFn)
      
      inline def setClickVisibleAction(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickVisibleAction", js.Any.fromFunction1(value))
      
      inline def setClickVisibleActionByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickVisibleActionByDataHook", js.Any.fromFunction1(value))
      
      inline def setGetHiddenActionsCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getHiddenActionsCount", value.toJsFn)
      
      inline def setGetHiddenActionsPopoverMenuDriver(value: CallbackTo[js.Promise[PopoverMenuUniDriver]]): Self = StObject.set(x, "getHiddenActionsPopoverMenuDriver", value.toJsFn)
      
      inline def setGetIsPrimaryActionButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "getIsPrimaryActionButtonDisabled", value.toJsFn)
      
      inline def setGetMoreActionsTooltipText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMoreActionsTooltipText", value.toJsFn)
      
      inline def setGetPrimaryActionButtonDriver(value: CallbackTo[js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]]]): Self = StObject.set(x, "getPrimaryActionButtonDriver", value.toJsFn)
      
      inline def setGetVisibleActionByDataHookTooltipDriver(
        value: String => js.Promise[
              ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
            ]
      ): Self = StObject.set(x, "getVisibleActionByDataHookTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionTooltipDriver(
        value: Double => js.Promise[
              ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
            ]
      ): Self = StObject.set(x, "getVisibleActionTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionsCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getVisibleActionsCount", value.toJsFn)
      
      inline def setPrimaryActionButtonPrefixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "primaryActionButtonPrefixIconExists", value.toJsFn)
      
      inline def setPrimaryActionButtonSuffixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "primaryActionButtonSuffixIconExists", value.toJsFn)
    }
  }
}
