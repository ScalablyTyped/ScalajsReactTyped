package typingsJapgolly.activexLibreoffice.com_.sun.star.deployment

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XAsynchronousExecutableDialog
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XDialogClosedListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ui {
  
  /**
    * The {@link LicenseDialog} is used to display a license text.
    * @since OOo 2.0.4
    */
  trait LicenseDialog
    extends StObject
       with XExecutableDialog {
    
    /**
      * Create a GUI using the specific parent window and focus on the given context.
      * @param xParent parent window
      * @param extensionName the display name of the extension
      * @param licenseText text to be displayed
      */
    def create(xParent: XWindow, extensionName: String, licenseText: String): Unit
  }
  object LicenseDialog {
    
    inline def apply(
      acquire: Callback,
      create: (XWindow, String, String) => Callback,
      execute: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      setTitle: String => Callback
    ): LicenseDialog = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, create = js.Any.fromFunction3((t0: XWindow, t1: String, t2: String) => (create(t0, t1, t2)).runNow()), execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
      __obj.asInstanceOf[LicenseDialog]
    }
    
    extension [Self <: LicenseDialog](x: Self) {
      
      inline def setCreate(value: (XWindow, String, String) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: XWindow, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  /**
    * The {@link PackageManagerDialog} is used to visually manage installed packages of the user and shared installation as well as currently open
    * documents.
    * @since OOo 2.0
    */
  trait PackageManagerDialog
    extends StObject
       with XAsynchronousExecutableDialog {
    
    /**
      * Create a GUI using the specific parent window and focus on the given context.
      * @param xParent parent window
      * @param focussedContext context to be focused
      */
    def create(xParent: XWindow, focussedContext: String): Unit
    
    /**
      * Create a GUI and pass the URL of the extension which shall be installed right away. This constructor is intended for the case when unopkg is run as
      * result of clicking an extension in a file browser, etc. The extensions will always be installed for the current user.
      * @param extensionURL URL of extension
      */
    def createAndInstall(extensionURL: String): Unit
    
    /** Create a default GUI. */
    def createDefault(): Unit
  }
  object PackageManagerDialog {
    
    inline def apply(
      acquire: Callback,
      create: (XWindow, String) => Callback,
      createAndInstall: String => Callback,
      createDefault: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      setDialogTitle: String => Callback,
      startExecuteModal: XDialogClosedListener => Callback
    ): PackageManagerDialog = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, create = js.Any.fromFunction2((t0: XWindow, t1: String) => (create(t0, t1)).runNow()), createAndInstall = js.Any.fromFunction1((t0: String) => createAndInstall(t0).runNow()), createDefault = createDefault.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDialogTitle = js.Any.fromFunction1((t0: String) => setDialogTitle(t0).runNow()), startExecuteModal = js.Any.fromFunction1((t0: XDialogClosedListener) => startExecuteModal(t0).runNow()))
      __obj.asInstanceOf[PackageManagerDialog]
    }
    
    extension [Self <: PackageManagerDialog](x: Self) {
      
      inline def setCreate(value: (XWindow, String) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: XWindow, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setCreateAndInstall(value: String => Callback): Self = StObject.set(x, "createAndInstall", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCreateDefault(value: Callback): Self = StObject.set(x, "createDefault", value.toJsFn)
    }
  }
  
  /**
    * The {@link UpdateRequiredDialog} is used to show a list of extensions not compatible with this office version.
    * @since OOo 3.2
    */
  trait UpdateRequiredDialog
    extends StObject
       with XExecutableDialog {
    
    /** Create a GUI using the specific parent window and focus on the given context. */
    def create(): Unit
  }
  object UpdateRequiredDialog {
    
    inline def apply(
      acquire: Callback,
      create: Callback,
      execute: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      setTitle: String => Callback
    ): UpdateRequiredDialog = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, create = create.toJsFn, execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
      __obj.asInstanceOf[UpdateRequiredDialog]
    }
    
    extension [Self <: UpdateRequiredDialog](x: Self) {
      
      inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
    }
  }
}
