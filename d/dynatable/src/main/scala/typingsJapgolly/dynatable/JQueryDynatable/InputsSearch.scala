package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dynatable.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSearch extends StObject {
  
  /** Inject the search form at the target location */
  def attach(): Unit
  
  /**
    * Build the html markup for the search form
    *
    * @return The jQuery object for the search form
    */
  def create(): JQuery
  
  /** Call the `attach()` method */
  def init(): Unit
  
  /**
    * Check if the search feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
}
object InputsSearch {
  
  inline def apply(attach: Callback, create: CallbackTo[JQuery], init: Callback, initOnLoad: CallbackTo[Boolean]): InputsSearch = {
    val __obj = js.Dynamic.literal(attach = attach.toJsFn, create = create.toJsFn, init = init.toJsFn, initOnLoad = initOnLoad.toJsFn)
    __obj.asInstanceOf[InputsSearch]
  }
  
  extension [Self <: InputsSearch](x: Self) {
    
    inline def setAttach(value: Callback): Self = StObject.set(x, "attach", value.toJsFn)
    
    inline def setCreate(value: CallbackTo[JQuery]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitOnLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "initOnLoad", value.toJsFn)
  }
}
