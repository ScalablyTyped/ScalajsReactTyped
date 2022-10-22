package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An iterator of negative keyword lists.
  *
  * Typical usage:
  *
  *      while (negativeKeywordListIterator.hasNext()) {
  *        var negativeKeywordList = negativeKeywordListIterator.next();
  *      }
  */
trait NegativeKeywordListIterator
  extends StObject
     with Iterator[NegativeKeywordListIterator]
object NegativeKeywordListIterator {
  
  inline def apply(
    hasNext: CallbackTo[Boolean],
    next: CallbackTo[NegativeKeywordListIterator],
    totalNumEntities: CallbackTo[Double]
  ): NegativeKeywordListIterator = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.toJsFn, next = next.toJsFn, totalNumEntities = totalNumEntities.toJsFn)
    __obj.asInstanceOf[NegativeKeywordListIterator]
  }
}
