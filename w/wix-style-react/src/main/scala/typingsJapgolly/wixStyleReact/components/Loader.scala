package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wixStyleReact.loaderMod.LoaderColor
import typingsJapgolly.wixStyleReact.loaderMod.LoaderProps
import typingsJapgolly.wixStyleReact.loaderMod.LoaderSize
import typingsJapgolly.wixStyleReact.loaderMod.LoaderStatus
import typingsJapgolly.wixStyleReact.loaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Loader {
  def apply(
    color: LoaderColor = null,
    dataHook: String = null,
    shouldLoadAsync: js.UndefOr[Boolean] = js.undefined,
    size: LoaderSize = null,
    status: LoaderStatus = null,
    statusMessage: String = null,
    styles: String = null,
    text: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LoaderProps, default, Unit, LoaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataHook != null) __obj.updateDynamic("dataHook")(dataHook.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldLoadAsync)) __obj.updateDynamic("shouldLoadAsync")(shouldLoadAsync.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.wixStyleReact.loaderMod.LoaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.wixStyleReact.loaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.wixStyleReact.loaderMod.LoaderProps])(children: _*)
  }
  @JSImport("wix-style-react/Loader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

