package typingsJapgolly.antd.components

import typingsJapgolly.antd.anon.Errors
import typingsJapgolly.antd.libFormFormListMod.FormListFieldData
import typingsJapgolly.antd.libFormFormListMod.FormListOperation
import typingsJapgolly.antd.libFormFormListMod.FormListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormList {
  
  inline def apply(
    children: (js.Array[FormListFieldData], FormListOperation, Errors) => japgolly.scalajs.react.facade.React.Node,
    name: String | Double | (js.Array[String | Double])
  ): SharedBuilder_FormListProps_1773376707 = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
    new SharedBuilder_FormListProps_1773376707(js.Array(this.component, __props.asInstanceOf[FormListProps]))
  }
  
  @JSImport("antd/lib/form/FormList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormListProps): SharedBuilder_FormListProps_1773376707 = new SharedBuilder_FormListProps_1773376707(js.Array(this.component, p.asInstanceOf[js.Any]))
}
