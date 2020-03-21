package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactElemental.AnonPrimary
import typingsJapgolly.reactElemental.AnonPrimaryDark
import typingsJapgolly.reactElemental.mod.ElementalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Elemental {
  def apply(
    colorOpts: AnonPrimaryDark = null,
    fontOpts: AnonPrimary = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ElementalProps, typingsJapgolly.reactElemental.mod.Elemental, Unit, ElementalProps] = {
    val __obj = js.Dynamic.literal()
  
      if (colorOpts != null) __obj.updateDynamic("colorOpts")(colorOpts.asInstanceOf[js.Any])
    if (fontOpts != null) __obj.updateDynamic("fontOpts")(fontOpts.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactElemental.mod.ElementalProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactElemental.mod.Elemental](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactElemental.mod.ElementalProps])(children: _*)
  }
  @JSImport("react-elemental", "Elemental")
  @js.native
  object componentImport extends js.Object
  
}

