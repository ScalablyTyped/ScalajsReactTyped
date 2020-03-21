package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.mod.ClassNameProps
import typingsJapgolly.mjmlReact.mod.HrefProps
import typingsJapgolly.mjmlReact.mod.MjmlCarouselImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlCarouselImage {
  def apply(
    alt: String = null,
    cssClass: String = null,
    href: String = null,
    rel: String = null,
    src: String = null,
    target: String = null,
    thumbnailsSrc: String = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MjmlCarouselImageProps with ClassNameProps with HrefProps, 
    typingsJapgolly.mjmlReact.mod.MjmlCarouselImage, 
    Unit, 
    MjmlCarouselImageProps with ClassNameProps with HrefProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (thumbnailsSrc != null) __obj.updateDynamic("thumbnailsSrc")(thumbnailsSrc.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlCarouselImageProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.HrefProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlCarouselImage](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlCarouselImageProps with typingsJapgolly.mjmlReact.mod.ClassNameProps with typingsJapgolly.mjmlReact.mod.HrefProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlCarouselImage")
  @js.native
  object componentImport extends js.Object
  
}

