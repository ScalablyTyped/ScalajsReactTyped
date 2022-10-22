package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to convert file system folder tree in to a package. */
trait XPackageStructureCreator
  extends StObject
     with XInterface {
  
  /**
    * converts file system folder tree in to a package.
    * @param sFolderURL the URL of folder that must be converted, the URL must be in format accepted by UCB
    * @param xTargetStream the result package will be written into this stream
    * @throws com::sun::star::io::IOException in case any problem on reading/writing appears
    */
  def convertToPackage(sFolderURL: String, xTargetStream: XOutputStream): Unit
}
object XPackageStructureCreator {
  
  inline def apply(
    acquire: Callback,
    convertToPackage: (String, XOutputStream) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPackageStructureCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, convertToPackage = js.Any.fromFunction2((t0: String, t1: XOutputStream) => (convertToPackage(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPackageStructureCreator]
  }
  
  extension [Self <: XPackageStructureCreator](x: Self) {
    
    inline def setConvertToPackage(value: (String, XOutputStream) => Callback): Self = StObject.set(x, "convertToPackage", js.Any.fromFunction2((t0: String, t1: XOutputStream) => (value(t0, t1)).runNow()))
  }
}
