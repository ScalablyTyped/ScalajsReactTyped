package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libFormFormItemMod.ValidateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ErrorListProps_870714246 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def errors(value: js.Array[japgolly.scalajs.react.facade.React.Node]): this.type = set("errors", value.asInstanceOf[js.Any])
  
  inline def errorsVarargs(value: japgolly.scalajs.react.facade.React.Node*): this.type = set("errors", js.Array(value*))
  
  inline def fieldId(value: String): this.type = set("fieldId", value.asInstanceOf[js.Any])
  
  inline def help(value: VdomNode): this.type = set("help", value.rawNode.asInstanceOf[js.Any])
  
  inline def helpNull: this.type = set("help", null)
  
  inline def helpStatus(value: ValidateStatus): this.type = set("helpStatus", value.asInstanceOf[js.Any])
  
  inline def helpVarargs(
    value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
  ): this.type = set("help", js.Array(value*))
  
  inline def helpVdomElement(value: VdomElement): this.type = set("help", value.rawElement.asInstanceOf[js.Any])
  
  inline def onVisibleChanged(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChanged", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def warnings(value: js.Array[japgolly.scalajs.react.facade.React.Node]): this.type = set("warnings", value.asInstanceOf[js.Any])
  
  inline def warningsVarargs(value: japgolly.scalajs.react.facade.React.Node*): this.type = set("warnings", js.Array(value*))
}
