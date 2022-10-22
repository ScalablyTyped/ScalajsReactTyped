package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcFieldForm.esInterfaceMod.ValidatorRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FormListProps_1773376707 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def initialValue(value: js.Array[Any]): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  inline def initialValueVarargs(value: Any*): this.type = set("initialValue", js.Array(value*))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def rules(value: js.Array[ValidatorRule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  inline def rulesVarargs(value: ValidatorRule*): this.type = set("rules", js.Array(value*))
}
