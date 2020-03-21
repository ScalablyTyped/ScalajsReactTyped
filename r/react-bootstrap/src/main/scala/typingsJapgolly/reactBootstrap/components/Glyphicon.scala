package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.glyphiconMod.GlyphiconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Glyphicon {
  def apply(
    glyph: String,
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.glyphiconMod.Glyphicon] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.glyphiconMod.Glyphicon] = null,
    bsClass: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GlyphiconProps, typingsJapgolly.reactBootstrap.mod.Glyphicon, Unit, GlyphiconProps] = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.glyphiconMod.GlyphiconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Glyphicon](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.glyphiconMod.GlyphiconProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Glyphicon")
  @js.native
  object componentImport extends js.Object
  
}

