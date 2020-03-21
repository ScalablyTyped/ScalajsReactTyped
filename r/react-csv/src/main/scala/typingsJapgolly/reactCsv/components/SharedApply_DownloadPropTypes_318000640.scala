package typingsJapgolly.reactCsv.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCsv.commonPropTypesMod.AsyncClickHandler
import typingsJapgolly.reactCsv.commonPropTypesMod.Data
import typingsJapgolly.reactCsv.commonPropTypesMod.Headers
import typingsJapgolly.reactCsv.commonPropTypesMod.SyncClickHandler
import typingsJapgolly.reactCsv.downloadMod.DownloadPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_DownloadPropTypes_318000640[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    data: String | Data,
    asyncOnClick: js.UndefOr[Boolean] = js.undefined,
    enclosingCharacter: String = null,
    filename: String = null,
    headers: Headers = null,
    onClick: SyncClickHandler | AsyncClickHandler = null,
    separator: String = null,
    target: String = null,
    uFEFF: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DownloadPropTypes, ComponentRef, Unit, DownloadPropTypes] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (!js.isUndefined(asyncOnClick)) __obj.updateDynamic("asyncOnClick")(asyncOnClick.asInstanceOf[js.Any])
    if (enclosingCharacter != null) __obj.updateDynamic("enclosingCharacter")(enclosingCharacter.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(uFEFF)) __obj.updateDynamic("uFEFF")(uFEFF.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCsv.downloadMod.DownloadPropTypes, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCsv.downloadMod.DownloadPropTypes])(children: _*)
  }
}

