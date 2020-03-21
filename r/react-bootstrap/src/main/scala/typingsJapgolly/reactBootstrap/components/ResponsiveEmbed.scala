package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.responsiveEmbedMod.ResponsiveEmbedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveEmbed {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.responsiveEmbedMod.ResponsiveEmbed] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.responsiveEmbedMod.ResponsiveEmbed] = null,
    a16by9: js.UndefOr[Boolean] = js.undefined,
    a4by3: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ResponsiveEmbedProps, 
    typingsJapgolly.reactBootstrap.mod.ResponsiveEmbed, 
    Unit, 
    ResponsiveEmbedProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(a16by9)) __obj.updateDynamic("a16by9")(a16by9.asInstanceOf[js.Any])
    if (!js.isUndefined(a4by3)) __obj.updateDynamic("a4by3")(a4by3.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.responsiveEmbedMod.ResponsiveEmbedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.ResponsiveEmbed](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.responsiveEmbedMod.ResponsiveEmbedProps])(children: _*)
  }
  @JSImport("react-bootstrap", "ResponsiveEmbed")
  @js.native
  object componentImport extends js.Object
  
}

