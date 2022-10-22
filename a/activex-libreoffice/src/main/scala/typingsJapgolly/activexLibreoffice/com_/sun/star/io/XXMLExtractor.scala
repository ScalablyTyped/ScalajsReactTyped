package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers the capability to extract the XML document stream from a document storage. */
trait XXMLExtractor
  extends StObject
     with XInterface {
  
  /**
    * extracts the XML stream from the document storage.
    * @returns the extracted XML stream.
    */
  def extract(aStream: XInputStream): XInputStream
}
object XXMLExtractor {
  
  inline def apply(
    acquire: Callback,
    extract: XInputStream => XInputStream,
    queryInterface: `type` => Any,
    release: Callback
  ): XXMLExtractor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, extract = js.Any.fromFunction1(extract), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XXMLExtractor]
  }
  
  extension [Self <: XXMLExtractor](x: Self) {
    
    inline def setExtract(value: XInputStream => XInputStream): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
  }
}
