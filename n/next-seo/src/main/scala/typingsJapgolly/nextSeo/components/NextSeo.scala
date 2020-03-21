package typingsJapgolly.nextSeo.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextSeo.mod.Config
import typingsJapgolly.nextSeo.mod.NextSeoProps
import typingsJapgolly.nextSeo.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NextSeo {
  def apply(
    config: Config,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NextSeoProps, default, Unit, NextSeoProps] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nextSeo.mod.NextSeoProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nextSeo.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nextSeo.mod.NextSeoProps])(children: _*)
  }
  @JSImport("next-seo", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

