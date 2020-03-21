package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait INavigationService extends js.Object {
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
  def executeMenuAction(action: js.Any, node: js.Any, section: js.Any): Unit
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
  def reloadNode(node: js.Any): Unit
  //TODO: This should return a promise
  def reloadSection(sectionAlias: String): Unit
  /**
    Called to assign the main tree event handler - this is called by the navigation controller.
    TODO: Potentially another dev could call this which would kind of mung the whole app so potentially there's a better way.
    */
  def setupTreeEvents(treeEventHandler: js.Any): Unit
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
  def showMenu(event: Event_, args: js.Any*): Unit
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
  def syncTree(args: ISyncTreeArgs): js.Any
}

object INavigationService {
  @scala.inline
  def apply(
    _setActiveTreeType: (String, Boolean) => Callback,
    _syncPath: (js.Array[String], Boolean) => Callback,
    changeSection: (String, Boolean) => Callback,
    executeMenuAction: (js.Any, js.Any, js.Any) => Callback,
    hideDialog: Boolean => Callback,
    hideMenu: Callback,
    hideNavigation: Callback,
    hideSearch: Callback,
    hideTray: Callback,
    hideTree: Callback,
    loadLegacyIFrame: String => Callback,
    reloadNode: js.Any => Callback,
    reloadSection: String => Callback,
    setupTreeEvents: js.Any => Callback,
    showDialog: IShowDialogArgs => Callback,
    showHelpDialog: Callback,
    showMenu: (Event_, /* repeated */ js.Any) => Callback,
    showSearch: Callback,
    showTray: Callback,
    showTree: (String, ISyncTreeArgs) => Callback,
    showUserDialog: Callback,
    syncTree: ISyncTreeArgs => CallbackTo[js.Any]
  ): INavigationService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_setActiveTreeType")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => _setActiveTreeType(t0, t1).runNow()))
    __obj.updateDynamic("_syncPath")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: scala.Boolean) => _syncPath(t0, t1).runNow()))
    __obj.updateDynamic("changeSection")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => changeSection(t0, t1).runNow()))
    __obj.updateDynamic("executeMenuAction")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => executeMenuAction(t0, t1, t2).runNow()))
    __obj.updateDynamic("hideDialog")(js.Any.fromFunction1((t0: scala.Boolean) => hideDialog(t0).runNow()))
    __obj.updateDynamic("hideMenu")(hideMenu.toJsFn)
    __obj.updateDynamic("hideNavigation")(hideNavigation.toJsFn)
    __obj.updateDynamic("hideSearch")(hideSearch.toJsFn)
    __obj.updateDynamic("hideTray")(hideTray.toJsFn)
    __obj.updateDynamic("hideTree")(hideTree.toJsFn)
    __obj.updateDynamic("loadLegacyIFrame")(js.Any.fromFunction1((t0: java.lang.String) => loadLegacyIFrame(t0).runNow()))
    __obj.updateDynamic("reloadNode")(js.Any.fromFunction1((t0: js.Any) => reloadNode(t0).runNow()))
    __obj.updateDynamic("reloadSection")(js.Any.fromFunction1((t0: java.lang.String) => reloadSection(t0).runNow()))
    __obj.updateDynamic("setupTreeEvents")(js.Any.fromFunction1((t0: js.Any) => setupTreeEvents(t0).runNow()))
    __obj.updateDynamic("showDialog")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IShowDialogArgs) => showDialog(t0).runNow()))
    __obj.updateDynamic("showHelpDialog")(showHelpDialog.toJsFn)
    __obj.updateDynamic("showMenu")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: /* repeated */ js.Any) => showMenu(t0, t1).runNow()))
    __obj.updateDynamic("showSearch")(showSearch.toJsFn)
    __obj.updateDynamic("showTray")(showTray.toJsFn)
    __obj.updateDynamic("showTree")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.umbraco.umbraco.services.ISyncTreeArgs) => showTree(t0, t1).runNow()))
    __obj.updateDynamic("showUserDialog")(showUserDialog.toJsFn)
    __obj.updateDynamic("syncTree")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.ISyncTreeArgs) => syncTree(t0).runNow()))
    __obj.asInstanceOf[INavigationService]
  }
}

