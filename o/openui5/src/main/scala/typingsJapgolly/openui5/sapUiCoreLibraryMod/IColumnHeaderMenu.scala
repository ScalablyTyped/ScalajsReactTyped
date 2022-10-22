package typingsJapgolly.openui5.sapUiCoreLibraryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openui5.sapUiCoreControlMod.default
import typingsJapgolly.openui5.sapUiCoreLibraryMod.aria.HasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnHeaderMenu extends StObject {
  
  var __implements__sap_ui_core_IColumnHeaderMenu: Boolean
  
  /**
    * @SINCE 1.98.0
    * @EXPERIMENTAL (since 1.98)
    *
    * Returns the sap.ui.core.aria.HasPopup<\code> type of the menu.
    *
    * @returns sap.ui.core.aria.HasPopup<\code> type of the menu
    */
  def getAriaHasPopupType(): HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String)
  
  /**
    * @SINCE 1.98.0
    * @EXPERIMENTAL (since 1.98)
    *
    * Opens the menu using the column header.
    */
  def openBy(/**
    * Specifies the control where the menu is placed.
    */
  oControl: default): Unit
}
object IColumnHeaderMenu {
  
  inline def apply(
    __implements__sap_ui_core_IColumnHeaderMenu: Boolean,
    getAriaHasPopupType: CallbackTo[
      HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String)
    ],
    openBy: default => Callback
  ): IColumnHeaderMenu = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_IColumnHeaderMenu = __implements__sap_ui_core_IColumnHeaderMenu.asInstanceOf[js.Any], getAriaHasPopupType = getAriaHasPopupType.toJsFn, openBy = js.Any.fromFunction1((t0: default) => openBy(t0).runNow()))
    __obj.asInstanceOf[IColumnHeaderMenu]
  }
  
  extension [Self <: IColumnHeaderMenu](x: Self) {
    
    inline def setGetAriaHasPopupType(
      value: CallbackTo[
          HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String)
        ]
    ): Self = StObject.set(x, "getAriaHasPopupType", value.toJsFn)
    
    inline def setOpenBy(value: default => Callback): Self = StObject.set(x, "openBy", js.Any.fromFunction1((t0: default) => value(t0).runNow()))
    
    inline def set__implements__sap_ui_core_IColumnHeaderMenu(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_IColumnHeaderMenu", value.asInstanceOf[js.Any])
  }
}
