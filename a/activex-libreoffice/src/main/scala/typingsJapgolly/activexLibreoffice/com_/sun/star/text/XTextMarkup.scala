package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to markup text.
  * @since OOo 2.3
  */
trait XTextMarkup extends StObject {
  
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  val MarkupInfoContainer: XStringKeyMap
  
  /**
    * submits a new markup range.
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param aIdentifier A string used to identify the caller.
    * @param nStart Start of the markup range.
    * @param nLength Length of the markup range.
    * @param xMarkupInfoContainer contains additional information about the markup.
    */
  def commitStringMarkup(
    nType: Double,
    aIdentifier: String,
    nStart: Double,
    nLength: Double,
    xMarkupInfoContainer: XStringKeyMap
  ): Unit
  
  def commitTextRangeMarkup(nType: Double, aIdentifier: String, xRange: XTextRange, xMarkupInfoContainer: XStringKeyMap): Unit
  
  /**
    * obtains a container to store additional user defined text markup information.
    * @returns a container to store additional user defined text markup information.
    */
  def getMarkupInfoContainer(): XStringKeyMap
}
object XTextMarkup {
  
  inline def apply(
    MarkupInfoContainer: XStringKeyMap,
    commitStringMarkup: (Double, String, Double, Double, XStringKeyMap) => Callback,
    commitTextRangeMarkup: (Double, String, XTextRange, XStringKeyMap) => Callback,
    getMarkupInfoContainer: CallbackTo[XStringKeyMap]
  ): XTextMarkup = {
    val __obj = js.Dynamic.literal(MarkupInfoContainer = MarkupInfoContainer.asInstanceOf[js.Any], commitStringMarkup = js.Any.fromFunction5((t0: Double, t1: String, t2: Double, t3: Double, t4: XStringKeyMap) => (commitStringMarkup(t0, t1, t2, t3, t4)).runNow()), commitTextRangeMarkup = js.Any.fromFunction4((t0: Double, t1: String, t2: XTextRange, t3: XStringKeyMap) => (commitTextRangeMarkup(t0, t1, t2, t3)).runNow()), getMarkupInfoContainer = getMarkupInfoContainer.toJsFn)
    __obj.asInstanceOf[XTextMarkup]
  }
  
  extension [Self <: XTextMarkup](x: Self) {
    
    inline def setCommitStringMarkup(value: (Double, String, Double, Double, XStringKeyMap) => Callback): Self = StObject.set(x, "commitStringMarkup", js.Any.fromFunction5((t0: Double, t1: String, t2: Double, t3: Double, t4: XStringKeyMap) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setCommitTextRangeMarkup(value: (Double, String, XTextRange, XStringKeyMap) => Callback): Self = StObject.set(x, "commitTextRangeMarkup", js.Any.fromFunction4((t0: Double, t1: String, t2: XTextRange, t3: XStringKeyMap) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetMarkupInfoContainer(value: CallbackTo[XStringKeyMap]): Self = StObject.set(x, "getMarkupInfoContainer", value.toJsFn)
    
    inline def setMarkupInfoContainer(value: XStringKeyMap): Self = StObject.set(x, "MarkupInfoContainer", value.asInstanceOf[js.Any])
  }
}
