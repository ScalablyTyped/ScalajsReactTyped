package typingsJapgolly.jupyterlabMainmenuExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabApplication.mod.JupyterFrontEnd
import typingsJapgolly.jupyterlabApplication.shellMod.ILabShell
import typingsJapgolly.jupyterlabApplication.tokensMod.IRouter
import typingsJapgolly.jupyterlabMainmenu.mod.EditMenu
import typingsJapgolly.jupyterlabMainmenu.mod.FileMenu
import typingsJapgolly.jupyterlabMainmenu.mod.KernelMenu
import typingsJapgolly.jupyterlabMainmenu.mod.RunMenu
import typingsJapgolly.jupyterlabMainmenu.mod.SettingsMenu
import typingsJapgolly.jupyterlabMainmenu.mod.TabsMenu
import typingsJapgolly.jupyterlabMainmenu.mod.ViewMenu
import typingsJapgolly.jupyterlabMainmenu.tokensMod.IMainMenu
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColonclear-all`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColonclear-current`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`editmenuColongo-to-line`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`filemenuColonclose-and-cleanup`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`filemenuColoncreate-console`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`kernelmenuColonrestart-and-clear`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`mainmenuColonopen-first`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrestart-and-run-all`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-above`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-all`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`runmenuColonrun-below`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`tabsmenuColonactivate-by-id`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`tabsmenuColonactivate-previously-used-tab`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonline-numbering`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonmatch-brackets`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.`viewmenuColonword-wrap`
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonfind
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonopen
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonredo
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.editmenuColonundo
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonlogout
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonopen
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.filemenuColonshutdown
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.helpmenuColonopen
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonchange
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColoninterrupt
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonopen
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonrestart
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonshutdown
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.kernelmenuColonshutdownAll
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.runmenuColonopen
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.runmenuColonrun
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.settingsmenuColonopen
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.tabsmenuColonopen
import typingsJapgolly.jupyterlabMainmenuExtension.jupyterlabMainmenuExtensionStrings.viewmenuColonopen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A service providing an interface to the main menu.
    */
  val default: JupyterFrontEndPlugin[IMainMenu] = js.native
  def createEditMenu(app: JupyterFrontEnd[IShell], menu: EditMenu): Unit = js.native
  def createFileMenu(app: JupyterFrontEnd[IShell], menu: FileMenu, router: IRouter): Unit = js.native
  def createKernelMenu(app: JupyterFrontEnd[IShell], menu: KernelMenu): Unit = js.native
  def createRunMenu(app: JupyterFrontEnd[IShell], menu: RunMenu): Unit = js.native
  def createSettingsMenu(_underscore: JupyterFrontEnd[IShell], menu: SettingsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu): Unit = js.native
  def createTabsMenu(app: JupyterFrontEnd[IShell], menu: TabsMenu, labShell: ILabShell): Unit = js.native
  def createViewMenu(app: JupyterFrontEnd[IShell], menu: ViewMenu): Unit = js.native
  @js.native
  object CommandIDs extends js.Object {
    val activateById: `tabsmenuColonactivate-by-id` = js.native
    val activatePreviouslyUsedTab: `tabsmenuColonactivate-previously-used-tab` = js.native
    val changeKernel: kernelmenuColonchange = js.native
    val clearAll: `editmenuColonclear-all` = js.native
    val clearCurrent: `editmenuColonclear-current` = js.native
    val closeAndCleanup: `filemenuColonclose-and-cleanup` = js.native
    val createConsole: `filemenuColoncreate-console` = js.native
    val find: editmenuColonfind = js.native
    val goToLine: `editmenuColongo-to-line` = js.native
    val interruptKernel: kernelmenuColoninterrupt = js.native
    val lineNumbering: `viewmenuColonline-numbering` = js.native
    val logout: filemenuColonlogout = js.native
    val matchBrackets: `viewmenuColonmatch-brackets` = js.native
    val openEdit: editmenuColonopen = js.native
    val openFile: filemenuColonopen = js.native
    val openFirst: `mainmenuColonopen-first` = js.native
    val openHelp: helpmenuColonopen = js.native
    val openKernel: kernelmenuColonopen = js.native
    val openRun: runmenuColonopen = js.native
    val openSettings: settingsmenuColonopen = js.native
    val openTabs: tabsmenuColonopen = js.native
    val openView: viewmenuColonopen = js.native
    val redo: editmenuColonredo = js.native
    val restartAndRunAll: `runmenuColonrestart-and-run-all` = js.native
    val restartKernel: kernelmenuColonrestart = js.native
    val restartKernelAndClear: `kernelmenuColonrestart-and-clear` = js.native
    val run: runmenuColonrun = js.native
    val runAbove: `runmenuColonrun-above` = js.native
    val runAll: `runmenuColonrun-all` = js.native
    val runBelow: `runmenuColonrun-below` = js.native
    val shutdown: filemenuColonshutdown = js.native
    val shutdownAllKernels: kernelmenuColonshutdownAll = js.native
    val shutdownKernel: kernelmenuColonshutdown = js.native
    val undo: editmenuColonundo = js.native
    val wordWrap: `viewmenuColonword-wrap` = js.native
  }
  
}

