package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.mod.MjmlProps
import typingsJapgolly.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mjml {
  def apply(
    lang: String = null,
    owa: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlProps with RequiredChildrenProps, 
    typingsJapgolly.mjmlReact.mod.Mjml, 
    Unit, 
    MjmlProps with RequiredChildrenProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (owa != null) __obj.updateDynamic("owa")(owa.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.Mjml](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlProps with typingsJapgolly.mjmlReact.mod.RequiredChildrenProps])(children: _*)
  }
  @JSImport("mjml-react", "Mjml")
  @js.native
  object componentImport extends js.Object
  
}

