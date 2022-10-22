package typingsJapgolly.rcFieldForm.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcFieldForm.esInterfaceMod.Meta
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidatorRule
import typingsJapgolly.rcFieldForm.esListMod.ListField
import typingsJapgolly.rcFieldForm.esListMod.ListOperations
import typingsJapgolly.rcFieldForm.rcFieldFormBooleans.`false`
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ListProps_1668479475 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def children(
    value: (/* fields */ js.Array[ListField], /* operations */ ListOperations, /* meta */ Meta) => Element | Node
  ): this.type = set("children", js.Any.fromFunction3(value))
  
  inline def initialValue(value: js.Array[Any]): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  inline def initialValueVarargs(value: Any*): this.type = set("initialValue", js.Array(value*))
  
  inline def rules(value: js.Array[ValidatorRule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  inline def rulesVarargs(value: ValidatorRule*): this.type = set("rules", js.Array(value*))
  
  inline def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
  
  inline def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value*))
}
