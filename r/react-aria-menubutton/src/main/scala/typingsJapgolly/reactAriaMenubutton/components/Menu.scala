package typingsJapgolly.reactAriaMenubutton.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactAriaMenubutton.AnonIsOpen
import typingsJapgolly.reactAriaMenubutton.mod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    tag: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | (js.Function1[/* hasIsOpen */ AnonIsOpen, Element])
  ): UnmountedWithRoot[
    MenuProps[HTMLElement], 
    typingsJapgolly.reactAriaMenubutton.mod.Menu, 
    Unit, 
    MenuProps[HTMLElement]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAriaMenubutton.mod.MenuProps[org.scalajs.dom.raw.HTMLElement], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactAriaMenubutton.mod.Menu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAriaMenubutton.mod.MenuProps[org.scalajs.dom.raw.HTMLElement]])
  }
  @JSImport("react-aria-menubutton", "Menu")
  @js.native
  object componentImport extends js.Object
  
}

