package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`1`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`6`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`7`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`8`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`9`
import typingsJapgolly.fundamentalReact.identifierMod.IdentifierModifiers
import typingsJapgolly.fundamentalReact.identifierMod.IdentifierProps
import typingsJapgolly.fundamentalReact.identifierMod.IdentifierSizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Identifier {
  def apply(
    size: IdentifierSizes,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    backgroundImageUrl: String = null,
    className: String = null,
    color: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    label: String = null,
    modifier: IdentifierModifiers = null,
    role: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IdentifierProps, 
    MountedWithRawType[IdentifierProps, js.Object, RawMounted[IdentifierProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.fundamentalReact.identifierMod.IdentifierProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.identifierMod.IdentifierProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/Identifier/Identifier", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

