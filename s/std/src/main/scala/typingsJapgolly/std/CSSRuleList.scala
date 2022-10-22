package typingsJapgolly.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects. */
@js.native
trait CSSRuleList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.CSSRule] {
  
  /* standard dom */
  def item(index: Double): org.scalajs.dom.CSSRule | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.CSSRule]] = js.native
  
  /* standard dom */
  val length: Double = js.native
}
