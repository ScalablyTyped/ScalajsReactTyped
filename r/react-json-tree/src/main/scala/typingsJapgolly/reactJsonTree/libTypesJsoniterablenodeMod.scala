package typingsJapgolly.reactJsonTree

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.StylingFunction
import typingsJapgolly.reactJsonTree.libTypesTypesMod.CircularPropsPassedThroughJSONNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesJsoniterablenodeMod extends Shortcut {
  
  @JSImport("react-json-tree/lib/types/JSONIterableNode", JSImport.Default)
  @js.native
  val default: FunctionComponent[Props] = js.native
  
  trait Props
    extends StObject
       with CircularPropsPassedThroughJSONNode {
    
    var data: Any
    
    var nodeType: String
  }
  object Props {
    
    inline def apply(
      collectionLimit: Double,
      data: Any,
      getItemString: (String, Any, Node, String, js.Array[String | Double]) => Node,
      hideRoot: Boolean,
      isCustomNode: Any => Boolean,
      keyPath: js.Array[String | Double],
      labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => Node,
      nodeType: String,
      postprocessValue: Any => Any,
      shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
      styling: StylingFunction,
      valueRenderer: (Any, Any, /* repeated */ String | Double) => Node
    ): Props = {
      val __obj = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), nodeType = nodeType.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `libTypesJsoniterablenodeMod.foo` */
  override def _to: FunctionComponent[Props] = default
}
