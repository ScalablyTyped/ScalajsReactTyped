package typingsJapgolly.mdxJsReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mdxJsReact.mod.MDXProviderComponentsProp
import typingsJapgolly.mdxJsReact.mod.MDXProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MDXProvider {
  def apply(
    components: MDXProviderComponentsProp,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MDXProviderProps, 
    MountedWithRawType[MDXProviderProps, js.Object, RawMounted[MDXProviderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.mdxJsReact.mod.MDXProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mdxJsReact.mod.MDXProviderProps])(children: _*)
  }
  @JSImport("@mdx-js/react", "MDXProvider")
  @js.native
  object componentImport extends js.Object
  
}

