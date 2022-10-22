package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dynatable.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordsCount extends StObject {
  
  /** Insert the record count inside the page */
  def attach(): Unit
  
  /**
    * Generate the html markup for the record count
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery
  
  /** Create and init the records count */
  def init(): Unit
  
  /**
    * Check if recordCount feature is enabled
    *
    * @return A boolean if recordCount feature is enabled
    */
  def initOnLoad(): Boolean
}
object RecordsCount {
  
  inline def apply(attach: Callback, create: CallbackTo[JQuery], init: Callback, initOnLoad: CallbackTo[Boolean]): RecordsCount = {
    val __obj = js.Dynamic.literal(attach = attach.toJsFn, create = create.toJsFn, init = init.toJsFn, initOnLoad = initOnLoad.toJsFn)
    __obj.asInstanceOf[RecordsCount]
  }
  
  extension [Self <: RecordsCount](x: Self) {
    
    inline def setAttach(value: Callback): Self = StObject.set(x, "attach", value.toJsFn)
    
    inline def setCreate(value: CallbackTo[JQuery]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitOnLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "initOnLoad", value.toJsFn)
  }
}
