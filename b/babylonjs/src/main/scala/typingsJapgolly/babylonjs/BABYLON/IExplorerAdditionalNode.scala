package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExplorerAdditionalNode extends StObject {
  
  /**
    * Function used to return the list of child entries
    */
  def getContent(): js.Array[IExplorerAdditionalChild]
  
  /**
    * Gets the name of the additional node
    */
  var name: String
}
object IExplorerAdditionalNode {
  
  inline def apply(getContent: CallbackTo[js.Array[IExplorerAdditionalChild]], name: String): IExplorerAdditionalNode = {
    val __obj = js.Dynamic.literal(getContent = getContent.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExplorerAdditionalNode]
  }
  
  extension [Self <: IExplorerAdditionalNode](x: Self) {
    
    inline def setGetContent(value: CallbackTo[js.Array[IExplorerAdditionalChild]]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
