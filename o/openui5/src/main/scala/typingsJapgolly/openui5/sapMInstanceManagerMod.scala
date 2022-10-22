package typingsJapgolly.openui5

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMInstanceManagerMod extends Shortcut {
  
  @JSImport("sap/m/InstanceManager", JSImport.Default)
  @js.native
  val default: InstanceManager = js.native
  
  /**
    * @SINCE 1.9.2
    *
    * Provides methods to manage instances. This is specifically designed for managing the opened Popover,
    * Dialog, ActionSheet, and it's possible to close all of the opened Popover, Dialog, ActionSheet in history
    * handling.
    *
    * Example:
    * ```javascript
    *
    *   sap.ui.define([
    *      "sap/m/InstanceManager"
    *   ], function(InstanceManager) {
    *     ...
    *     InstanceManager.closeAllPopovers();
    *     ...
    *   });
    * ```
    */
  trait InstanceManager extends StObject {
    
    /**
      * Adds a control to predefined dialog category in instance manager.
      *
      * @returns Enable method chaining.
      */
    def addDialogInstance(
      /**
      * Dialog to be added to instance manager. Dialog which doesn't inherit from sap.m.Dialog can also be added
      * as long as it has a close method.
      */
    oDialog: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type
    
    /**
      * Adds an instance to the given category. If the instance is already added to the same category, it won't
      * be added again.
      *
      * @returns Enable method chaining.
      */
    def addInstance(
      /**
      * The category's id.
      */
    sCategoryId: String,
      /**
      * The instance that will be added to the given category.
      */
    oInstance: js.Object
    ): this.type
    
    /**
      * Adds a control to predefined lightbox category in instance manager.
      *
      * @returns Enable method chaining.
      */
    def addLightBoxInstance(
      /**
      * LightBox to be added to instance manager.
      */
    oLightBox: typingsJapgolly.openui5.sapMLightBoxMod.default
    ): this.type
    
    /**
      * Adds a control to predefined popover category in instance manager.
      *
      * @returns Enable method chaining.
      */
    def addPopoverInstance(
      /**
      * Popover to be added to instance manager. Custom popover which doesn't inherit from sap.m.Popover can
      * also be added as long as it has a close method.
      */
    oPopover: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): this.type
    
    /**
      * Closes all of the open dialogs.
      *
      * @returns Enable method chaining.
      */
    def closeAllDialogs(fnCallback: js.Function): this.type
    
    /**
      * Closes all open lightboxes.
      *
      * @returns Enable method chaining.
      */
    def closeAllLightBoxes(): this.type
    
    /**
      * Closes all open popovers.
      *
      * @returns Enable method chaining.
      */
    def closeAllPopovers(): this.type
    
    /**
      * Returns an array of managed instances in the given category.
      *
      * @returns Managed instances in the given category.
      */
    def getInstancesByCategoryId(/**
      * The category's id.
      */
    sCategoryId: String): js.Array[js.Object]
    
    /**
      * Gets all of the open dialogs. If there's no dialog open, an empty array is returned.
      *
      * @returns The open dialogs.
      */
    def getOpenDialogs(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]
    
    /**
      * Gets all of the open LightBoxes. If there's no LightBox open, an empty array is returned.
      *
      * @returns The opened LightBoxes.
      */
    def getOpenLightBoxes(): js.Array[typingsJapgolly.openui5.sapMLightBoxMod.default]
    
    /**
      * Gets all of the open popovers. If there's no popover open, an empty array is returned.
      *
      * @returns The open popovers.
      */
    def getOpenPopovers(): js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]
    
    /**
      * Returns true if there's at least one dialog managed in the predefined dialog category, otherwise it returns
      * false.
      *
      * @returns Whether there's dialog(s) open.
      */
    def hasOpenDialog(): Boolean
    
    /**
      * Returns true if there's at least one LightBox managed in the predefined lightbox category, otherwise
      * it returns false.
      *
      * @returns Whether there's LightBox(es) is/are open.
      */
    def hasOpenLightBox(): Boolean
    
    /**
      * Returns true if there's at least one popover managed in the predefined popover category, otherwise it
      * returns false.
      *
      * @returns Whether there's popover(s) open.
      */
    def hasOpenPopover(): Boolean
    
    /**
      * Returns if there's no managed instance in the given category.
      *
      * @returns Whether the category is empty.
      */
    def isCategoryEmpty(/**
      * The category's id.
      */
    sCategoryId: String): Boolean
    
    /**
      * Checks if the given dialog instance is managed under the dialog category. For dialog instances, managed
      * means the dialog is open.
      *
      * This function is specially provided for customized controls which doesn't have the possibility to check
      * whether it's open. If the given dialog is an instance of sap.m.Dialog, sap.m.ActionSheet, the isOpen()
      * method on the instance is preferred to be called than this function.
      *
      * @returns Whether the given dialog is open.
      */
    def isDialogOpen(
      /**
      * The dialog that is checked for the openness.
      */
    oDialog: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): Boolean
    
    /**
      * Checks if an instance is managed under the given category.
      *
      * @returns Whether the instance is managed in the given category.
      */
    def isInstanceManaged(
      /**
      * The category that the instance is supposed to be in.
      */
    sCategoryId: String,
      /**
      * The instance that needs to be checked.
      */
    oInstance: js.Object
    ): Boolean
    
    /**
      * Check if the given LightBox instance is managed under the LightBox category. For LightBox instances,
      * 'managed' means the LightBox is open.
      *
      * This function is specially intended for controls that don't provide a way to check whether they're open.
      * If the given lightbox is an instance of `sap.m.LightBox`, its `isOpen()` should be called instead of
      * this function.
      *
      * @returns Whether the given popover is open.
      */
    def isLightBoxOpen(
      /**
      * The LightBox that is checked.
      */
    oLightBox: typingsJapgolly.openui5.sapMLightBoxMod.default
    ): Boolean
    
    /**
      * Check if the given popover instance is managed under the popover category. For popover instances, managed
      * means the popover is open.
      *
      * This function is specially provided for customized controls which doesn't have the possibility to check
      * whether it's open. If the given popover is an instance of sap.m.Popover, sap.m.ActionSheet, the isOpen()
      * method on the instance is preferred to be called than this function.
      *
      * @returns Whether the given popover is open.
      */
    def isPopoverOpen(
      /**
      * The popover that is checked for the openness.
      */
    oPopover: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): Boolean
    
    /**
      * Removes control from predefined dialog category in instance manager.
      *
      * @returns The removed dialog, or `null` if the dialog isn't managed.
      */
    def removeDialogInstance(
      /**
      * to be removed from instance manager.
      */
    oDialog: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null
    
    /**
      * Removes a managed instance from the given category.
      *
      * @returns The removed instance, or `null` if the instance isn't managed.
      */
    def removeInstance(
      /**
      * The category's id.
      */
    sCategoryId: String,
      /**
      * The instance that will be removed from the given category.
      */
    oInstance: js.Object
    ): js.Object | Null
    
    /**
      * Removes control from predefined lightbox category in instance manager.
      *
      * @returns The removed LightBox, or `null` if the LightBox isn't managed.
      */
    def removeLightBoxInstance(
      /**
      * to be removed from instance manager.
      */
    oLightBox: typingsJapgolly.openui5.sapMLightBoxMod.default
    ): typingsJapgolly.openui5.sapMLightBoxMod.default | Null
    
    /**
      * Removes control from predefined popover category in instance manager.
      *
      * @returns The removed popover, or `null` if the popover isn't managed.
      */
    def removePopoverInstance(
      /**
      * to be removed from instance manager.
      */
    oPopover: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): typingsJapgolly.openui5.sapUiCoreControlMod.default | Null
  }
  object InstanceManager {
    
    inline def apply(
      addDialogInstance: typingsJapgolly.openui5.sapUiCoreControlMod.default => InstanceManager,
      addInstance: (String, js.Object) => InstanceManager,
      addLightBoxInstance: typingsJapgolly.openui5.sapMLightBoxMod.default => InstanceManager,
      addPopoverInstance: typingsJapgolly.openui5.sapUiCoreControlMod.default => InstanceManager,
      closeAllDialogs: js.Function => InstanceManager,
      closeAllLightBoxes: CallbackTo[InstanceManager],
      closeAllPopovers: CallbackTo[InstanceManager],
      getInstancesByCategoryId: String => js.Array[js.Object],
      getOpenDialogs: CallbackTo[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]],
      getOpenLightBoxes: CallbackTo[js.Array[typingsJapgolly.openui5.sapMLightBoxMod.default]],
      getOpenPopovers: CallbackTo[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]],
      hasOpenDialog: CallbackTo[Boolean],
      hasOpenLightBox: CallbackTo[Boolean],
      hasOpenPopover: CallbackTo[Boolean],
      isCategoryEmpty: String => Boolean,
      isDialogOpen: typingsJapgolly.openui5.sapUiCoreControlMod.default => Boolean,
      isInstanceManaged: (String, js.Object) => Boolean,
      isLightBoxOpen: typingsJapgolly.openui5.sapMLightBoxMod.default => Boolean,
      isPopoverOpen: typingsJapgolly.openui5.sapUiCoreControlMod.default => Boolean,
      removeDialogInstance: typingsJapgolly.openui5.sapUiCoreControlMod.default => typingsJapgolly.openui5.sapUiCoreControlMod.default | Null,
      removeInstance: (String, js.Object) => js.Object | Null,
      removeLightBoxInstance: typingsJapgolly.openui5.sapMLightBoxMod.default => typingsJapgolly.openui5.sapMLightBoxMod.default | Null,
      removePopoverInstance: typingsJapgolly.openui5.sapUiCoreControlMod.default => typingsJapgolly.openui5.sapUiCoreControlMod.default | Null
    ): InstanceManager = {
      val __obj = js.Dynamic.literal(addDialogInstance = js.Any.fromFunction1(addDialogInstance), addInstance = js.Any.fromFunction2(addInstance), addLightBoxInstance = js.Any.fromFunction1(addLightBoxInstance), addPopoverInstance = js.Any.fromFunction1(addPopoverInstance), closeAllDialogs = js.Any.fromFunction1(closeAllDialogs), closeAllLightBoxes = closeAllLightBoxes.toJsFn, closeAllPopovers = closeAllPopovers.toJsFn, getInstancesByCategoryId = js.Any.fromFunction1(getInstancesByCategoryId), getOpenDialogs = getOpenDialogs.toJsFn, getOpenLightBoxes = getOpenLightBoxes.toJsFn, getOpenPopovers = getOpenPopovers.toJsFn, hasOpenDialog = hasOpenDialog.toJsFn, hasOpenLightBox = hasOpenLightBox.toJsFn, hasOpenPopover = hasOpenPopover.toJsFn, isCategoryEmpty = js.Any.fromFunction1(isCategoryEmpty), isDialogOpen = js.Any.fromFunction1(isDialogOpen), isInstanceManaged = js.Any.fromFunction2(isInstanceManaged), isLightBoxOpen = js.Any.fromFunction1(isLightBoxOpen), isPopoverOpen = js.Any.fromFunction1(isPopoverOpen), removeDialogInstance = js.Any.fromFunction1(removeDialogInstance), removeInstance = js.Any.fromFunction2(removeInstance), removeLightBoxInstance = js.Any.fromFunction1(removeLightBoxInstance), removePopoverInstance = js.Any.fromFunction1(removePopoverInstance))
      __obj.asInstanceOf[InstanceManager]
    }
    
    extension [Self <: InstanceManager](x: Self) {
      
      inline def setAddDialogInstance(value: typingsJapgolly.openui5.sapUiCoreControlMod.default => InstanceManager): Self = StObject.set(x, "addDialogInstance", js.Any.fromFunction1(value))
      
      inline def setAddInstance(value: (String, js.Object) => InstanceManager): Self = StObject.set(x, "addInstance", js.Any.fromFunction2(value))
      
      inline def setAddLightBoxInstance(value: typingsJapgolly.openui5.sapMLightBoxMod.default => InstanceManager): Self = StObject.set(x, "addLightBoxInstance", js.Any.fromFunction1(value))
      
      inline def setAddPopoverInstance(value: typingsJapgolly.openui5.sapUiCoreControlMod.default => InstanceManager): Self = StObject.set(x, "addPopoverInstance", js.Any.fromFunction1(value))
      
      inline def setCloseAllDialogs(value: js.Function => InstanceManager): Self = StObject.set(x, "closeAllDialogs", js.Any.fromFunction1(value))
      
      inline def setCloseAllLightBoxes(value: CallbackTo[InstanceManager]): Self = StObject.set(x, "closeAllLightBoxes", value.toJsFn)
      
      inline def setCloseAllPopovers(value: CallbackTo[InstanceManager]): Self = StObject.set(x, "closeAllPopovers", value.toJsFn)
      
      inline def setGetInstancesByCategoryId(value: String => js.Array[js.Object]): Self = StObject.set(x, "getInstancesByCategoryId", js.Any.fromFunction1(value))
      
      inline def setGetOpenDialogs(value: CallbackTo[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]): Self = StObject.set(x, "getOpenDialogs", value.toJsFn)
      
      inline def setGetOpenLightBoxes(value: CallbackTo[js.Array[typingsJapgolly.openui5.sapMLightBoxMod.default]]): Self = StObject.set(x, "getOpenLightBoxes", value.toJsFn)
      
      inline def setGetOpenPopovers(value: CallbackTo[js.Array[typingsJapgolly.openui5.sapUiCoreControlMod.default]]): Self = StObject.set(x, "getOpenPopovers", value.toJsFn)
      
      inline def setHasOpenDialog(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasOpenDialog", value.toJsFn)
      
      inline def setHasOpenLightBox(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasOpenLightBox", value.toJsFn)
      
      inline def setHasOpenPopover(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasOpenPopover", value.toJsFn)
      
      inline def setIsCategoryEmpty(value: String => Boolean): Self = StObject.set(x, "isCategoryEmpty", js.Any.fromFunction1(value))
      
      inline def setIsDialogOpen(value: typingsJapgolly.openui5.sapUiCoreControlMod.default => Boolean): Self = StObject.set(x, "isDialogOpen", js.Any.fromFunction1(value))
      
      inline def setIsInstanceManaged(value: (String, js.Object) => Boolean): Self = StObject.set(x, "isInstanceManaged", js.Any.fromFunction2(value))
      
      inline def setIsLightBoxOpen(value: typingsJapgolly.openui5.sapMLightBoxMod.default => Boolean): Self = StObject.set(x, "isLightBoxOpen", js.Any.fromFunction1(value))
      
      inline def setIsPopoverOpen(value: typingsJapgolly.openui5.sapUiCoreControlMod.default => Boolean): Self = StObject.set(x, "isPopoverOpen", js.Any.fromFunction1(value))
      
      inline def setRemoveDialogInstance(
        value: typingsJapgolly.openui5.sapUiCoreControlMod.default => typingsJapgolly.openui5.sapUiCoreControlMod.default | Null
      ): Self = StObject.set(x, "removeDialogInstance", js.Any.fromFunction1(value))
      
      inline def setRemoveInstance(value: (String, js.Object) => js.Object | Null): Self = StObject.set(x, "removeInstance", js.Any.fromFunction2(value))
      
      inline def setRemoveLightBoxInstance(
        value: typingsJapgolly.openui5.sapMLightBoxMod.default => typingsJapgolly.openui5.sapMLightBoxMod.default | Null
      ): Self = StObject.set(x, "removeLightBoxInstance", js.Any.fromFunction1(value))
      
      inline def setRemovePopoverInstance(
        value: typingsJapgolly.openui5.sapUiCoreControlMod.default => typingsJapgolly.openui5.sapUiCoreControlMod.default | Null
      ): Self = StObject.set(x, "removePopoverInstance", js.Any.fromFunction1(value))
    }
  }
  
  type _To = InstanceManager
  
  /* This means you don't have to write `default`, but can instead just say `sapMInstanceManagerMod.foo` */
  override def _to: InstanceManager = default
}
