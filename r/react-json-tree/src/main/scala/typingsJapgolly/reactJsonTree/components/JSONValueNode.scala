package typingsJapgolly.reactJsonTree.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.StylingFunction
import typingsJapgolly.reactJsonTree.libTypesJsonvaluenodeMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONValueNode {
  
  inline def apply(
    keyPath: js.Array[String | Double],
    labelRenderer: (js.Array[String | Double], String, Boolean, Boolean) => Node,
    nodeType: String,
    styling: StylingFunction,
    value: Any,
    valueRenderer: (Any, Any, /* repeated */ String | Double) => Node
  ): Builder = {
    val __props = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], labelRenderer = js.Any.fromFunction4(labelRenderer), nodeType = nodeType.asInstanceOf[js.Any], styling = styling.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRenderer = js.Any.fromFunction3(valueRenderer))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-json-tree/lib/types/JSONValueNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def valueGetter(value: /* value */ Any => Any): this.type = set("valueGetter", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
