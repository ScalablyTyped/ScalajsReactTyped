package typingsJapgolly.reactJsonTree.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.Theme
import typingsJapgolly.reactJsonTree.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONTree {
  
  inline def apply(
    collectionLimit: Double,
    data: Any,
    getItemString: (String, Any, Node, String, js.Array[String | Double]) => Node,
    hideRoot: Boolean,
    invertTheme: Boolean,
    isCustomNode: Any => Boolean,
    keyPath: js.Array[String | Double],
    labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => Node,
    postprocessValue: Any => Any,
    shouldExpandNode: (js.Array[String | Double], Any, Double) => Boolean,
    valueRenderer: (Any, Any, /* repeated */ String | Double) => Node
  ): Builder = {
    val __props = js.Dynamic.literal(collectionLimit = collectionLimit.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getItemString = js.Any.fromFunction5(getItemString), hideRoot = hideRoot.asInstanceOf[js.Any], invertTheme = invertTheme.asInstanceOf[js.Any], isCustomNode = js.Any.fromFunction1(isCustomNode), keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), postprocessValue = js.Any.fromFunction1(postprocessValue), shouldExpandNode = js.Any.fromFunction3(shouldExpandNode), valueRenderer = js.Any.fromFunction3(valueRenderer))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-json-tree", "JSONTree")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactJsonTree.mod.JSONTree] {
    
    inline def sortObjectKeys(value: (js.Function2[/* a */ Any, /* b */ Any, Double]) | Boolean): this.type = set("sortObjectKeys", value.asInstanceOf[js.Any])
    
    inline def sortObjectKeysFunction2(value: (/* a */ Any, /* b */ Any) => Double): this.type = set("sortObjectKeys", js.Any.fromFunction2(value))
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
