package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to modify the suggestion list returned by a spell checker.
  *
  * Basically this is needed to post-add further suggestions while keeping the originally returned reference from the spell checker. E.g. from the user
  * dictionaries.
  * @see com.sun.star.linguistic2.XSpellAlternatives
  */
trait XSetSpellAlternatives
  extends StObject
     with XInterface {
  
  /**
    * set the list of suggestions to be returned.
    * @since OOo 3.0.1
    */
  def setAlternatives(aAlternatives: SeqEquiv[String]): Unit
  
  /**
    * set the type of error found.
    * @see com.sun.star.linguistic2.SpellFailure
    * @since OOo 3.0.1
    */
  def setFailureType(nFailureType: Double): Unit
}
object XSetSpellAlternatives {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setAlternatives: SeqEquiv[String] => Callback,
    setFailureType: Double => Callback
  ): XSetSpellAlternatives = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAlternatives = js.Any.fromFunction1((t0: SeqEquiv[String]) => setAlternatives(t0).runNow()), setFailureType = js.Any.fromFunction1((t0: Double) => setFailureType(t0).runNow()))
    __obj.asInstanceOf[XSetSpellAlternatives]
  }
  
  extension [Self <: XSetSpellAlternatives](x: Self) {
    
    inline def setSetAlternatives(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setAlternatives", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
    
    inline def setSetFailureType(value: Double => Callback): Self = StObject.set(x, "setFailureType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
