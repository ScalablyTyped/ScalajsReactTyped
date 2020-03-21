package typingsJapgolly.reactInstantsearch.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInstantsearchDom.AnonTranslations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stats {
  def apply(
    translations: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AnonTranslations, 
    typingsJapgolly.reactInstantsearch.domMod.Stats, 
    Unit, 
    AnonTranslations
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInstantsearchDom.AnonTranslations, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInstantsearch.domMod.Stats](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInstantsearchDom.AnonTranslations])(children: _*)
  }
  @JSImport("react-instantsearch/dom", "Stats")
  @js.native
  object componentImport extends js.Object
  
}

