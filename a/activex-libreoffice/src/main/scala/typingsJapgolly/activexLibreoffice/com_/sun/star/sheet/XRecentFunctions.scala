package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a list of recently used functions.
  * @see com.sun.star.sheet.RecentFunctions
  */
trait XRecentFunctions
  extends StObject
     with XInterface {
  
  /** returns the maximum number of entries that will be stored as recently used functions. */
  val MaxRecentFunctions: Double
  
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  var RecentFunctionIds: SafeArray[Double]
  
  /** returns the maximum number of entries that will be stored as recently used functions. */
  def getMaxRecentFunctions(): Double
  
  /**
    * returns a sequence of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @returns the sequence of function identifiers most recently used.
    */
  def getRecentFunctionIds(): SafeArray[Double]
  
  /**
    * sets the list of those functions that were most recently used.
    *
    * The functions are represented by their identifiers.
    * @param aRecentFunctionIds the sequence of function identifiers most recently used.
    */
  def setRecentFunctionIds(aRecentFunctionIds: SeqEquiv[Double]): Unit
}
object XRecentFunctions {
  
  inline def apply(
    MaxRecentFunctions: Double,
    RecentFunctionIds: SafeArray[Double],
    acquire: Callback,
    getMaxRecentFunctions: CallbackTo[Double],
    getRecentFunctionIds: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback,
    setRecentFunctionIds: SeqEquiv[Double] => Callback
  ): XRecentFunctions = {
    val __obj = js.Dynamic.literal(MaxRecentFunctions = MaxRecentFunctions.asInstanceOf[js.Any], RecentFunctionIds = RecentFunctionIds.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMaxRecentFunctions = getMaxRecentFunctions.toJsFn, getRecentFunctionIds = getRecentFunctionIds.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setRecentFunctionIds = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setRecentFunctionIds(t0).runNow()))
    __obj.asInstanceOf[XRecentFunctions]
  }
  
  extension [Self <: XRecentFunctions](x: Self) {
    
    inline def setGetMaxRecentFunctions(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxRecentFunctions", value.toJsFn)
    
    inline def setGetRecentFunctionIds(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getRecentFunctionIds", value.toJsFn)
    
    inline def setMaxRecentFunctions(value: Double): Self = StObject.set(x, "MaxRecentFunctions", value.asInstanceOf[js.Any])
    
    inline def setRecentFunctionIds(value: SafeArray[Double]): Self = StObject.set(x, "RecentFunctionIds", value.asInstanceOf[js.Any])
    
    inline def setSetRecentFunctionIds(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setRecentFunctionIds", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
  }
}
