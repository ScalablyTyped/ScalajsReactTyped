package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Chart object, which can be converted to a static image. For charts embedded in spreadsheets,
  * see EmbeddedChart.
  */
trait Chart extends StObject {
  
  def getAs(contentType: String): Blob
  
  def getBlob(): Blob
  
  def getOptions(): ChartOptions
}
object Chart {
  
  inline def apply(getAs: String => Blob, getBlob: CallbackTo[Blob], getOptions: CallbackTo[ChartOptions]): Chart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = getBlob.toJsFn, getOptions = getOptions.toJsFn)
    __obj.asInstanceOf[Chart]
  }
  
  extension [Self <: Chart](x: Self) {
    
    inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
    
    inline def setGetBlob(value: CallbackTo[Blob]): Self = StObject.set(x, "getBlob", value.toJsFn)
    
    inline def setGetOptions(value: CallbackTo[ChartOptions]): Self = StObject.set(x, "getOptions", value.toJsFn)
  }
}
