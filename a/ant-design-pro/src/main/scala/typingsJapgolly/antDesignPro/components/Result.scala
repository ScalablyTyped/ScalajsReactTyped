package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.antDesignProStrings.error
import typingsJapgolly.antDesignPro.antDesignProStrings.success
import typingsJapgolly.antDesignPro.resultMod.ResultProps
import typingsJapgolly.antDesignPro.resultMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Result {
  def apply(
    `type`: success | error,
    actions: VdomNode = null,
    className: String = null,
    description: VdomNode = null,
    extra: VdomNode = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ResultProps, default, Unit, ResultProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.resultMod.ResultProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.resultMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.resultMod.ResultProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Result", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

