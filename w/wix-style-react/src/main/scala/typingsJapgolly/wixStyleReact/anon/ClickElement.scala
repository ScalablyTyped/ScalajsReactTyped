package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickElement extends StObject {
  
  /**
    * Clicks on the component root element
    * @returns {Promise<void>}
    */
  def click(): js.Promise[Unit]
  
  /**
    * Gets the component root element
    * @returns {Promise<any>}
    */
  def element(): js.Promise[Any]
  
  /**
    * Checks whether the component found with the given data hook
    * @returns {Promise<boolean>}
    */
  def exists(): js.Promise[Boolean]
}
object ClickElement {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]]
  ): ClickElement = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn)
    __obj.asInstanceOf[ClickElement]
  }
  
  extension [Self <: ClickElement](x: Self) {
    
    inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
  }
}
