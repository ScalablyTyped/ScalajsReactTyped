package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.navigationService
  *
  * @requires $rootScope
  * @requires $routeParams
  * @requires $log
  * @requires $location
  * @requires dialogService
  * @requires treeService
  * @requires sectionResource
  *
  * @description
  * Service to handle the main application navigation. Responsible for invoking the tree
  * Section navigation and search, and maintain their state for the entire application lifetime
  *
  */
trait INavigationService extends StObject {
  
  /**
    Internal method that should ONLY be used by the legacy API wrapper, the legacy API used to
    have to set an active tree and then sync, the new API does this in one method by using syncTreePath
    */
  def _setActiveTreeType(treeAlias: String, loadChildren: Boolean): Unit
  
  /**
    Internal method that should ONLY be used by the legacy API wrapper, the legacy API used to
    have to set an active tree and then sync, the new API does this in one method by using syncTree
    */
  def _syncPath(path: js.Array[String], forceReload: Boolean): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#changeSection
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Changes the active section to a given section alias
    * If the navigation is 'sticky' this will load the associated tree
    * and load the dashboard related to the section
    * @param {string} sectionAlias The alias of the section
    */
  def changeSection(sectionAlias: String, force: Boolean): Unit
  
  /** Executes a given menu action */
  def executeMenuAction(action: Any, node: Any, section: Any): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides the currently open dialog
    */
  def hideDialog(showMenu: Boolean): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideMenu
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the menu by hiding the containing dom element
    */
  def hideMenu(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideNavigation
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides any open navigation panes and resets the tree, actions and the currently selected node
    */
  def hideNavigation(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideSearch
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * hides the search pane
    */
  def hideSearch(): Unit
  
  def hideTray(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#hideTree
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the tree by hiding the containing dom element
    */
  def hideTree(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#load
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Shows the legacy iframe and loads in the content based on the source url
    * @param {String} source The URL to load into the iframe
    */
  def loadLegacyIFrame(source: String): Unit
  
  //TODO: This should return a promise
  def reloadNode(node: Any): Unit
  
  //TODO: This should return a promise
  def reloadSection(sectionAlias: String): Unit
  
  /**
    Called to assign the main tree event handler - this is called by the navigation controller.
    TODO: Potentially another dev could call this which would kind of mung the whole app so potentially there's a better way.
    */
  def setupTreeEvents(treeEventHandler: Any): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens a dialog, for a given action on a given tree node
    * uses the dialogService to inject the selected action dialog
    * into #dialog div.umb-panel-body
    * the path to the dialog view is determined by:
    * "views/" + current tree + "/" + action alias + ".html"
    * The dialog controller will get passed a scope object that is created here with the properties:
    *  scope.currentNode = the selected tree node
    *  scope.currentAction = the selected menu item
    *  so that the dialog controllers can use these properties
    *
    * @param {Object} args arguments passed to the function
    * @param {Scope} args.scope current scope passed to the dialog
    * @param {Object} args.action the clicked action containing `name` and `alias`
    */
  def showDialog(args: IShowDialogArgs): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showUserDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens the user dialog, next to the sections navigation
    * template is located in views/common/dialogs/user.html
    */
  def showHelpDialog(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showMenu
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Hides the tree by hiding the containing dom element.
    * This always returns a promise!
    *
    * @param {Event} event the click event triggering the method, passed from the DOM element
    */
  def showMenu(event: Event, args: Any*): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showSearch
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * shows the search pane
    */
  def showSearch(): Unit
  
  def showTray(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showTree
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Displays the tree for a given section alias but turning on the containing dom element
    * only changes if the section is different from the current one
    * @param {string} sectionAlias The alias of the section to load
    * @param {Object} syncArgs Optional object of arguments for syncing the tree for the section being shown
    */
  def showTree(sectionAlias: String, syncArgs: ISyncTreeArgs): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#showUserDialog
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Opens the user dialog, next to the sections navigation
    * template is located in views/common/dialogs/user.html
    */
  def showUserDialog(): Unit
  
  /**
    * @ngdoc method
    * @name umbraco.services.navigationService#syncTree
    * @methodOf umbraco.services.navigationService
    *
    * @description
    * Syncs a tree with a given path, returns a promise
    * The path format is: ["itemId","itemId"], and so on
    * so to sync to a specific document type node do:
    * <pre>
    * navigationService.syncTree({tree: 'content', path: ["-1","123d"], forceReload: true});
    * </pre>
    * @param {Object} args arguments passed to the function
    * @param {String} args.tree the tree alias to sync to
    * @param {Array} args.path the path to sync the tree to
    * @param {Boolean} args.forceReload optional, specifies whether to force reload the node data from the server even if it already exists in the tree currently
    * @param {Boolean} args.activate optional, specifies whether to set the synced node to be the active node, this will default to true if not specified
    */
  def syncTree(args: ISyncTreeArgs): Any
}
object INavigationService {
  
  inline def apply(
    _setActiveTreeType: (String, Boolean) => Callback,
    _syncPath: (js.Array[String], Boolean) => Callback,
    changeSection: (String, Boolean) => Callback,
    executeMenuAction: (Any, Any, Any) => Callback,
    hideDialog: Boolean => Callback,
    hideMenu: Callback,
    hideNavigation: Callback,
    hideSearch: Callback,
    hideTray: Callback,
    hideTree: Callback,
    loadLegacyIFrame: String => Callback,
    reloadNode: Any => Callback,
    reloadSection: String => Callback,
    setupTreeEvents: Any => Callback,
    showDialog: IShowDialogArgs => Callback,
    showHelpDialog: Callback,
    showMenu: (Event, /* repeated */ Any) => Callback,
    showSearch: Callback,
    showTray: Callback,
    showTree: (String, ISyncTreeArgs) => Callback,
    showUserDialog: Callback,
    syncTree: ISyncTreeArgs => Any
  ): INavigationService = {
    val __obj = js.Dynamic.literal(_setActiveTreeType = js.Any.fromFunction2((t0: String, t1: Boolean) => (_setActiveTreeType(t0, t1)).runNow()), _syncPath = js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (_syncPath(t0, t1)).runNow()), changeSection = js.Any.fromFunction2((t0: String, t1: Boolean) => (changeSection(t0, t1)).runNow()), executeMenuAction = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (executeMenuAction(t0, t1, t2)).runNow()), hideDialog = js.Any.fromFunction1((t0: Boolean) => hideDialog(t0).runNow()), hideMenu = hideMenu.toJsFn, hideNavigation = hideNavigation.toJsFn, hideSearch = hideSearch.toJsFn, hideTray = hideTray.toJsFn, hideTree = hideTree.toJsFn, loadLegacyIFrame = js.Any.fromFunction1((t0: String) => loadLegacyIFrame(t0).runNow()), reloadNode = js.Any.fromFunction1((t0: Any) => reloadNode(t0).runNow()), reloadSection = js.Any.fromFunction1((t0: String) => reloadSection(t0).runNow()), setupTreeEvents = js.Any.fromFunction1((t0: Any) => setupTreeEvents(t0).runNow()), showDialog = js.Any.fromFunction1((t0: IShowDialogArgs) => showDialog(t0).runNow()), showHelpDialog = showHelpDialog.toJsFn, showMenu = js.Any.fromFunction2((t0: Event, t1: /* repeated */ Any) => (showMenu(t0, t1)).runNow()), showSearch = showSearch.toJsFn, showTray = showTray.toJsFn, showTree = js.Any.fromFunction2((t0: String, t1: ISyncTreeArgs) => (showTree(t0, t1)).runNow()), showUserDialog = showUserDialog.toJsFn, syncTree = js.Any.fromFunction1(syncTree))
    __obj.asInstanceOf[INavigationService]
  }
  
  extension [Self <: INavigationService](x: Self) {
    
    inline def setChangeSection(value: (String, Boolean) => Callback): Self = StObject.set(x, "changeSection", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setExecuteMenuAction(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "executeMenuAction", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setHideDialog(value: Boolean => Callback): Self = StObject.set(x, "hideDialog", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setHideMenu(value: Callback): Self = StObject.set(x, "hideMenu", value.toJsFn)
    
    inline def setHideNavigation(value: Callback): Self = StObject.set(x, "hideNavigation", value.toJsFn)
    
    inline def setHideSearch(value: Callback): Self = StObject.set(x, "hideSearch", value.toJsFn)
    
    inline def setHideTray(value: Callback): Self = StObject.set(x, "hideTray", value.toJsFn)
    
    inline def setHideTree(value: Callback): Self = StObject.set(x, "hideTree", value.toJsFn)
    
    inline def setLoadLegacyIFrame(value: String => Callback): Self = StObject.set(x, "loadLegacyIFrame", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReloadNode(value: Any => Callback): Self = StObject.set(x, "reloadNode", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setReloadSection(value: String => Callback): Self = StObject.set(x, "reloadSection", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetupTreeEvents(value: Any => Callback): Self = StObject.set(x, "setupTreeEvents", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setShowDialog(value: IShowDialogArgs => Callback): Self = StObject.set(x, "showDialog", js.Any.fromFunction1((t0: IShowDialogArgs) => value(t0).runNow()))
    
    inline def setShowHelpDialog(value: Callback): Self = StObject.set(x, "showHelpDialog", value.toJsFn)
    
    inline def setShowMenu(value: (Event, /* repeated */ Any) => Callback): Self = StObject.set(x, "showMenu", js.Any.fromFunction2((t0: Event, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setShowSearch(value: Callback): Self = StObject.set(x, "showSearch", value.toJsFn)
    
    inline def setShowTray(value: Callback): Self = StObject.set(x, "showTray", value.toJsFn)
    
    inline def setShowTree(value: (String, ISyncTreeArgs) => Callback): Self = StObject.set(x, "showTree", js.Any.fromFunction2((t0: String, t1: ISyncTreeArgs) => (value(t0, t1)).runNow()))
    
    inline def setShowUserDialog(value: Callback): Self = StObject.set(x, "showUserDialog", value.toJsFn)
    
    inline def setSyncTree(value: ISyncTreeArgs => Any): Self = StObject.set(x, "syncTree", js.Any.fromFunction1(value))
    
    inline def set_setActiveTreeType(value: (String, Boolean) => Callback): Self = StObject.set(x, "_setActiveTreeType", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def set_syncPath(value: (js.Array[String], Boolean) => Callback): Self = StObject.set(x, "_syncPath", js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
