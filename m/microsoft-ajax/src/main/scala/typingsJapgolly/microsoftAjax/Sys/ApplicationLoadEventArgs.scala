package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Event Args
/*
  * Used by the Application class to hold event arguments for the load event.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383787(v=vs.100).aspx}
  */
trait ApplicationLoadEventArgs extends StObject {
  
  //#endregion
  //#region Properties
  /**
    * Gets an array of all the components that were created since the last time the load event was raised.
    * @return An array of all the components that were created since the last time the load event was raised.
    */
  def get_components(): js.Array[Component]
  
  /**
    * Returns a value that indicates whether the page is engaged in a partial-page update.
    * @return true if the page is engaged in a partial-page update; otherwise, false.
    */
  def get_isPartialLoad(): Boolean
}
object ApplicationLoadEventArgs {
  
  inline def apply(get_components: CallbackTo[js.Array[Component]], get_isPartialLoad: CallbackTo[Boolean]): ApplicationLoadEventArgs = {
    val __obj = js.Dynamic.literal(get_components = get_components.toJsFn, get_isPartialLoad = get_isPartialLoad.toJsFn)
    __obj.asInstanceOf[ApplicationLoadEventArgs]
  }
  
  extension [Self <: ApplicationLoadEventArgs](x: Self) {
    
    inline def setGet_components(value: CallbackTo[js.Array[Component]]): Self = StObject.set(x, "get_components", value.toJsFn)
    
    inline def setGet_isPartialLoad(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isPartialLoad", value.toJsFn)
  }
}
