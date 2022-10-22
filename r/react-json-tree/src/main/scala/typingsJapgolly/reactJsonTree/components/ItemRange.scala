package typingsJapgolly.reactJsonTree.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.StylingFunction
import typingsJapgolly.reactJsonTree.libTypesItemRangeMod.Props
import typingsJapgolly.reactJsonTree.libTypesItemRangeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ItemRange {
  
  inline def apply(
    circularCache: js.Array[Any],
    collectionLimit: Double,
    data: Any,
    from: Double,
    getItemString: (String, Any, Node, String, js.Array[String | Double]) => Node,
    hideRoot: Boolean,
    isCustomNode: Any => Boolean,
    keyPath: js.Array[String | Double],
    labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => Node,
    level: Double,
    nodeType: String,
    postprocessValue: Any => Any,
    renderChildNodes: (Props, Double, Double) => Node,
    shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
    styling: StylingFunction,
    to: Double,
    valueRenderer: (Any, Any, /* repeated */ String | Double) => Node
  ): Builder = {
    val __props = js.Dynamic.literal(circularCache = circularCache.asInstanceOf[js.Any], collectionLimit = collectionLimit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), level = level.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], postprocessValue = js.Any.fromFunction1(postprocessValue), renderChildNodes = js.Any.fromFunction3(renderChildNodes), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), styling = styling.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-json-tree/lib/types/ItemRange", JSImport.Default)
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
