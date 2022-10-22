package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the text rotation settings for a cell.
  */
trait TextRotation extends StObject {
  
  def getDegrees(): Integer
  
  def isVertical(): Boolean
}
object TextRotation {
  
  inline def apply(getDegrees: CallbackTo[Integer], isVertical: CallbackTo[Boolean]): TextRotation = {
    val __obj = js.Dynamic.literal(getDegrees = getDegrees.toJsFn, isVertical = isVertical.toJsFn)
    __obj.asInstanceOf[TextRotation]
  }
  
  extension [Self <: TextRotation](x: Self) {
    
    inline def setGetDegrees(value: CallbackTo[Integer]): Self = StObject.set(x, "getDegrees", value.toJsFn)
    
    inline def setIsVertical(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVertical", value.toJsFn)
  }
}
