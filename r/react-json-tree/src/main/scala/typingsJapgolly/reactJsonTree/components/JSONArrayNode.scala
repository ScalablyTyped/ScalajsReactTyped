package typingsJapgolly.reactJsonTree.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.StylingFunction
import typingsJapgolly.reactJsonTree.libTypesJsonarraynodeMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONArrayNode {
  
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
  ): Builder = {
    val __props = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), nodeType = nodeType.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-json-tree/lib/types/JSONArrayNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def circularCache(value: js.Array[Any]): this.type = set("circularCache", value.asInstanceOf[js.Any])
    
    inline def circularCacheVarargs(value: Any*): this.type = set("circularCache", js.Array(value*))
    
    inline def isCircular(value: Boolean): this.type = set("isCircular", value.asInstanceOf[js.Any])
    
    inline def level(value: Double): this.type = set("level", value.asInstanceOf[js.Any])
    
    inline def sortObjectKeys(value: (js.Function2[/* a */ Any, /* b */ Any, Double]) | Boolean): this.type = set("sortObjectKeys", value.asInstanceOf[js.Any])
    
    inline def sortObjectKeysFunction2(value: (/* a */ Any, /* b */ Any) => Double): this.type = set("sortObjectKeys", js.Any.fromFunction2(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
