package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a mapping from `string` to `string` */
trait XStringMapping
  extends StObject
     with XInterface {
  
  /** provides a mapping for a given sequence of strings to a sequence of belonging strings. */
  def mapStrings(Parameter: js.Array[SeqEquiv[String]]): Boolean
}
object XStringMapping {
  
  inline def apply(
    acquire: Callback,
    mapStrings: js.Array[SeqEquiv[String]] => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XStringMapping = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, mapStrings = js.Any.fromFunction1(mapStrings), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStringMapping]
  }
  
  extension [Self <: XStringMapping](x: Self) {
    
    inline def setMapStrings(value: js.Array[SeqEquiv[String]] => Boolean): Self = StObject.set(x, "mapStrings", js.Any.fromFunction1(value))
  }
}
