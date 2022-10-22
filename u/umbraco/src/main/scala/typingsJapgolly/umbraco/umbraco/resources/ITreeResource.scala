package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.treeResource
  * @description Loads in data for trees
  **/
trait ITreeResource extends StObject {
  
  /** Loads in the data to display the nodes for an application */
  def loadApplication(options: Any): Unit
  
  /** Loads in the data to display the nodes menu */
  def loadMenu(node: Any): Unit
  
  /** Loads in the data to display the child nodes for a given node */
  def loadNodes(options: Any): Unit
}
object ITreeResource {
  
  inline def apply(loadApplication: Any => Callback, loadMenu: Any => Callback, loadNodes: Any => Callback): ITreeResource = {
    val __obj = js.Dynamic.literal(loadApplication = js.Any.fromFunction1((t0: Any) => loadApplication(t0).runNow()), loadMenu = js.Any.fromFunction1((t0: Any) => loadMenu(t0).runNow()), loadNodes = js.Any.fromFunction1((t0: Any) => loadNodes(t0).runNow()))
    __obj.asInstanceOf[ITreeResource]
  }
  
  extension [Self <: ITreeResource](x: Self) {
    
    inline def setLoadApplication(value: Any => Callback): Self = StObject.set(x, "loadApplication", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setLoadMenu(value: Any => Callback): Self = StObject.set(x, "loadMenu", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setLoadNodes(value: Any => Callback): Self = StObject.set(x, "loadNodes", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
