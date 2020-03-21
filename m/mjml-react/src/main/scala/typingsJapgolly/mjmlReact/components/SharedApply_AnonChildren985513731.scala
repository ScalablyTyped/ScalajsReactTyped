package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_AnonChildren985513731[ComponentRef] () {
  val componentImport: js.Any
  def apply(key: js.UndefOr[Key] = js.undefined, _overrides: StringDictionary[js.Any] = null)(children: String): UnmountedWithRoot[AnonChildren, ComponentRef, Unit, AnonChildren] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.AnonChildren, 
  japgolly.scalajs.react.Children.None, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.AnonChildren])
  }
}

