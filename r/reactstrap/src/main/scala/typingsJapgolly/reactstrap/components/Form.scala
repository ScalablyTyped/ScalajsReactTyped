package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLFormElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.formMod.FormProps
import typingsJapgolly.reactstrap.formMod.default
import typingsJapgolly.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Form {
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[HTMLFormElement] = null,
    ClassAttributes: ClassAttributes[HTMLFormElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cssModule: CSSModule = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref = null,
    tag: String | ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FormProps, default[T], Unit, FormProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.formMod.FormProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.formMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.formMod.FormProps])(children: _*)
  }
  @JSImport("reactstrap/lib/Form", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

