package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XUpdate extends StObject {
  
  def insertExtensionXcsFile(shared: Boolean, fileUri: String): Unit
  
  def insertExtensionXcuFile(shared: Boolean, fileUri: String): Unit
  
  def insertModificationXcuFile(fileUri: String, includedPaths: SeqEquiv[String], excludedPaths: SeqEquiv[String]): Unit
  
  def removeExtensionXcuFile(fileUri: String): Unit
}
object XUpdate {
  
  inline def apply(
    insertExtensionXcsFile: (Boolean, String) => Callback,
    insertExtensionXcuFile: (Boolean, String) => Callback,
    insertModificationXcuFile: (String, SeqEquiv[String], SeqEquiv[String]) => Callback,
    removeExtensionXcuFile: String => Callback
  ): XUpdate = {
    val __obj = js.Dynamic.literal(insertExtensionXcsFile = js.Any.fromFunction2((t0: Boolean, t1: String) => (insertExtensionXcsFile(t0, t1)).runNow()), insertExtensionXcuFile = js.Any.fromFunction2((t0: Boolean, t1: String) => (insertExtensionXcuFile(t0, t1)).runNow()), insertModificationXcuFile = js.Any.fromFunction3((t0: String, t1: SeqEquiv[String], t2: SeqEquiv[String]) => (insertModificationXcuFile(t0, t1, t2)).runNow()), removeExtensionXcuFile = js.Any.fromFunction1((t0: String) => removeExtensionXcuFile(t0).runNow()))
    __obj.asInstanceOf[XUpdate]
  }
  
  extension [Self <: XUpdate](x: Self) {
    
    inline def setInsertExtensionXcsFile(value: (Boolean, String) => Callback): Self = StObject.set(x, "insertExtensionXcsFile", js.Any.fromFunction2((t0: Boolean, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setInsertExtensionXcuFile(value: (Boolean, String) => Callback): Self = StObject.set(x, "insertExtensionXcuFile", js.Any.fromFunction2((t0: Boolean, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setInsertModificationXcuFile(value: (String, SeqEquiv[String], SeqEquiv[String]) => Callback): Self = StObject.set(x, "insertModificationXcuFile", js.Any.fromFunction3((t0: String, t1: SeqEquiv[String], t2: SeqEquiv[String]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveExtensionXcuFile(value: String => Callback): Self = StObject.set(x, "removeExtensionXcuFile", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
