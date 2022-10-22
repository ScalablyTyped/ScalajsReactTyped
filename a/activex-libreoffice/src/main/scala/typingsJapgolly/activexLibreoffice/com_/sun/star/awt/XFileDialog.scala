package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to a file dialog.
  * @deprecated Deprecated
  */
trait XFileDialog
  extends StObject
     with XInterface {
  
  /** returns the currently selected filter. */
  var CurrentFilter: String
  
  /** returns the path. */
  var Path: String
  
  /** returns the currently selected filter. */
  def getCurrentFilter(): String
  
  /** returns the path. */
  def getPath(): String
  
  /** sets the current filter. */
  def setCurrentFilter(Filter: String): Unit
  
  /** sets the filters. */
  def setFilters(rFilterNames: SeqEquiv[String], rMasks: SeqEquiv[String]): Unit
  
  /** sets the path. */
  def setPath(Path: String): Unit
}
object XFileDialog {
  
  inline def apply(
    CurrentFilter: String,
    Path: String,
    acquire: Callback,
    getCurrentFilter: CallbackTo[String],
    getPath: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setCurrentFilter: String => Callback,
    setFilters: (SeqEquiv[String], SeqEquiv[String]) => Callback,
    setPath: String => Callback
  ): XFileDialog = {
    val __obj = js.Dynamic.literal(CurrentFilter = CurrentFilter.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCurrentFilter = getCurrentFilter.toJsFn, getPath = getPath.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCurrentFilter = js.Any.fromFunction1((t0: String) => setCurrentFilter(t0).runNow()), setFilters = js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[String]) => (setFilters(t0, t1)).runNow()), setPath = js.Any.fromFunction1((t0: String) => setPath(t0).runNow()))
    __obj.asInstanceOf[XFileDialog]
  }
  
  extension [Self <: XFileDialog](x: Self) {
    
    inline def setCurrentFilter(value: String): Self = StObject.set(x, "CurrentFilter", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentFilter(value: CallbackTo[String]): Self = StObject.set(x, "getCurrentFilter", value.toJsFn)
    
    inline def setGetPath(value: CallbackTo[String]): Self = StObject.set(x, "getPath", value.toJsFn)
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSetCurrentFilter(value: String => Callback): Self = StObject.set(x, "setCurrentFilter", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFilters(value: (SeqEquiv[String], SeqEquiv[String]) => Callback): Self = StObject.set(x, "setFilters", js.Any.fromFunction2((t0: SeqEquiv[String], t1: SeqEquiv[String]) => (value(t0, t1)).runNow()))
    
    inline def setSetPath(value: String => Callback): Self = StObject.set(x, "setPath", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
