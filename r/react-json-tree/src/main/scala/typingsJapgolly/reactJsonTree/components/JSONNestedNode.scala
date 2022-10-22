package typingsJapgolly.reactJsonTree.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.StylingFunction
import typingsJapgolly.reactJsonTree.libTypesJsonnestednodeMod.Props
import typingsJapgolly.reactJsonTree.libTypesJsonnestednodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONNestedNode {
  
  inline def apply(
    circularCache: js.Array[Any],
    collectionLimit: Double,
    createItemString: (Any, Double) => String,
    data: Any,
    expandable: Boolean,
    getItemString: (String, Any, Node, String, js.Array[String | Double]) => Node,
    hideRoot: Boolean,
    isCustomNode: Any => Boolean,
    keyPath: js.Array[String | Double],
    labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => Node,
    level: Double,
    nodeType: String,
    nodeTypeIndicator: String,
    postprocessValue: Any => Any,
    shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
    styling: StylingFunction,
    valueRenderer: (Any, Any, /* repeated */ String | Double) => Node
  ): Builder = {
    val __props = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], createItemString = js.Any.fromFunction2(createItemString), data = data.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeTypeIndicator = nodeTypeIndicator.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-json-tree/lib/types/JSONNestedNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def isCircular(value: Boolean): this.type = set("isCircular", value.asInstanceOf[js.Any])
    
    inline def sortObjectKeys(value: (js.Function2[/* a */ Any, /* b */ Any, Double]) | Boolean): this.type = set("sortObjectKeys", value.asInstanceOf[js.Any])
    
    inline def sortObjectKeysFunction2(value: (/* a */ Any, /* b */ Any) => Double): this.type = set("sortObjectKeys", js.Any.fromFunction2(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
