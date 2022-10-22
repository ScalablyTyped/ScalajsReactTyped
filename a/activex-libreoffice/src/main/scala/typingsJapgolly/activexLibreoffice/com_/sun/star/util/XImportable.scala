package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to import files into the object. */
trait XImportable
  extends StObject
     with XInterface {
  
  /** @returns a descriptor which contains the arguments for an import. */
  def createImportDescriptor(bEmpty: Boolean): SafeArray[PropertyValue]
  
  /** imports data from an external database. */
  def doImport(aDescriptor: SeqEquiv[PropertyValue]): Unit
}
object XImportable {
  
  inline def apply(
    acquire: Callback,
    createImportDescriptor: Boolean => SafeArray[PropertyValue],
    doImport: SeqEquiv[PropertyValue] => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XImportable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createImportDescriptor = js.Any.fromFunction1(createImportDescriptor), doImport = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => doImport(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XImportable]
  }
  
  extension [Self <: XImportable](x: Self) {
    
    inline def setCreateImportDescriptor(value: Boolean => SafeArray[PropertyValue]): Self = StObject.set(x, "createImportDescriptor", js.Any.fromFunction1(value))
    
    inline def setDoImport(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "doImport", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
