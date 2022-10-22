package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayField
import typingsJapgolly.antdMobile.esComponentsFormFormArrayMod.FormArrayOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FormArrayProps_2130765192 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def initialValue(value: js.Array[Any]): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  inline def initialValueVarargs(value: Any*): this.type = set("initialValue", js.Array(value*))
  
  inline def onAdd(value: /* operation */ FormArrayOperation => Callback): this.type = set("onAdd", js.Any.fromFunction1((t0: /* operation */ FormArrayOperation) => value(t0).runNow()))
  
  inline def renderAdd(value: CallbackTo[Node]): this.type = set("renderAdd", value.toJsFn)
  
  inline def renderHeader(value: (/* field */ FormArrayField, /* operation */ FormArrayOperation) => Node): this.type = set("renderHeader", js.Any.fromFunction2(value))
}
