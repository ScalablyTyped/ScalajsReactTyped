package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a library and provides access to its modules
  * @deprecated Deprecated
  */
trait XStarBasicAccess
  extends StObject
     with XInterface {
  
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  val LibraryContainer: XNameContainer
  
  /**
    * Adds an old style basic dialog (SI controls) to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary
    * the caller does not have to implement {@link XStarBasicLibraryInfo} and {@link XStarBasicDialogInfo}
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addDialog(LibraryName: String, DialogName: String, Data: SeqEquiv[Double]): Unit
  
  /**
    * Adds a module to an existing (e.g., created by createLibrary) library. By using this method together with createLibrary the caller does not have to
    * implement {@link XStarBasicLibraryInfo} and XModuleInfo.
    * @throws NoSuchElementException if the library doesn't exist.
    */
  def addModule(LibraryName: String, ModuleName: String, Language: String, Source: String): Unit
  
  /**
    * Creates an empty library. This method can be called alternatively to accessing directly the NameContainer returned by getLibraryContainer. By using
    * this method together with addModule and addStarBasicDialog the caller does not have to implement {@link XStarBasicLibraryInfo} , XModuleInfo, and
    * {@link XStarBasicDialogInfo}
    */
  def createLibrary(LibName: String, Password: String, ExternalSourceURL: String, LinkTargetURL: String): Unit
  
  /** returns the library container giving access to the libraries stored in a document or basic library file. */
  def getLibraryContainer(): XNameContainer
}
object XStarBasicAccess {
  
  inline def apply(
    LibraryContainer: XNameContainer,
    acquire: Callback,
    addDialog: (String, String, SeqEquiv[Double]) => Callback,
    addModule: (String, String, String, String) => Callback,
    createLibrary: (String, String, String, String) => Callback,
    getLibraryContainer: CallbackTo[XNameContainer],
    queryInterface: `type` => Any,
    release: Callback
  ): XStarBasicAccess = {
    val __obj = js.Dynamic.literal(LibraryContainer = LibraryContainer.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDialog = js.Any.fromFunction3((t0: String, t1: String, t2: SeqEquiv[Double]) => (addDialog(t0, t1, t2)).runNow()), addModule = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (addModule(t0, t1, t2, t3)).runNow()), createLibrary = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (createLibrary(t0, t1, t2, t3)).runNow()), getLibraryContainer = getLibraryContainer.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStarBasicAccess]
  }
  
  extension [Self <: XStarBasicAccess](x: Self) {
    
    inline def setAddDialog(value: (String, String, SeqEquiv[Double]) => Callback): Self = StObject.set(x, "addDialog", js.Any.fromFunction3((t0: String, t1: String, t2: SeqEquiv[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddModule(value: (String, String, String, String) => Callback): Self = StObject.set(x, "addModule", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setCreateLibrary(value: (String, String, String, String) => Callback): Self = StObject.set(x, "createLibrary", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetLibraryContainer(value: CallbackTo[XNameContainer]): Self = StObject.set(x, "getLibraryContainer", value.toJsFn)
    
    inline def setLibraryContainer(value: XNameContainer): Self = StObject.set(x, "LibraryContainer", value.asInstanceOf[js.Any])
  }
}
