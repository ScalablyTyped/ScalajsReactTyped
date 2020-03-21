package typingsJapgolly.reactstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactstrap.formGroupMod.FormGroupProps
import typingsJapgolly.reactstrap.formGroupMod.default
import typingsJapgolly.reactstrap.mod.CSSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormGroup {
  def apply[T](
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    check: js.UndefOr[Boolean] = js.undefined,
    cssModule: CSSModule = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FormGroupProps, default[T], Unit, FormGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactstrap.formGroupMod.FormGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactstrap.formGroupMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactstrap.formGroupMod.FormGroupProps])(children: _*)
  }
  @JSImport("reactstrap/lib/FormGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

