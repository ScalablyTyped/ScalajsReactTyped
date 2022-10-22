package typingsJapgolly.officeJsPreview.Excel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientObject
import typingsJapgolly.officeJsPreview.OfficeExtension.ClientResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the fill formatting for a chart element.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait ChartFill
  extends StObject
     with ClientObject {
  
  /**
    * Clears the fill color of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartFill: RequestContext
  
  /**
    * Gets the uniform color fill formatting of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  def getSolidColor(): ClientResult[String]
  
  /**
    * Sets the fill formatting of a chart element to a uniform color.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param color HTML color code representing the color of the background, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    */
  def setSolidColor(color: String): Unit
}
object ChartFill {
  
  inline def apply(
    clear: Callback,
    context: RequestContext,
    getSolidColor: CallbackTo[ClientResult[String]],
    isNullObject: Boolean,
    setSolidColor: String => Callback
  ): ChartFill = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, context = context.asInstanceOf[js.Any], getSolidColor = getSolidColor.toJsFn, isNullObject = isNullObject.asInstanceOf[js.Any], setSolidColor = js.Any.fromFunction1((t0: String) => setSolidColor(t0).runNow()))
    __obj.asInstanceOf[ChartFill]
  }
  
  extension [Self <: ChartFill](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setContext(value: RequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setGetSolidColor(value: CallbackTo[ClientResult[String]]): Self = StObject.set(x, "getSolidColor", value.toJsFn)
    
    inline def setSetSolidColor(value: String => Callback): Self = StObject.set(x, "setSolidColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
