package typingsJapgolly.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMRectList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.DOMRect] {
  
  /* standard dom */
  def item(index: Double): org.scalajs.dom.DOMRect | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.DOMRect]] = js.native
  
  /* standard dom */
  val length: Double = js.native
}
