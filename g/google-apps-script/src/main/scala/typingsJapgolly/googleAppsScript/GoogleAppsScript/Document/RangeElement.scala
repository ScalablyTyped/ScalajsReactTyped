package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A wrapper around an Element with a possible start and end offset. These offsets allow a
  * range of characters within a Text
  * element to be represented in search results, document selections, and named ranges.
  */
trait RangeElement extends StObject {
  
  def getElement(): Element
  
  def getEndOffsetInclusive(): Integer
  
  def getStartOffset(): Integer
  
  def isPartial(): Boolean
}
object RangeElement {
  
  inline def apply(
    getElement: CallbackTo[Element],
    getEndOffsetInclusive: CallbackTo[Integer],
    getStartOffset: CallbackTo[Integer],
    isPartial: CallbackTo[Boolean]
  ): RangeElement = {
    val __obj = js.Dynamic.literal(getElement = getElement.toJsFn, getEndOffsetInclusive = getEndOffsetInclusive.toJsFn, getStartOffset = getStartOffset.toJsFn, isPartial = isPartial.toJsFn)
    __obj.asInstanceOf[RangeElement]
  }
  
  extension [Self <: RangeElement](x: Self) {
    
    inline def setGetElement(value: CallbackTo[Element]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setGetEndOffsetInclusive(value: CallbackTo[Integer]): Self = StObject.set(x, "getEndOffsetInclusive", value.toJsFn)
    
    inline def setGetStartOffset(value: CallbackTo[Integer]): Self = StObject.set(x, "getStartOffset", value.toJsFn)
    
    inline def setIsPartial(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPartial", value.toJsFn)
  }
}
