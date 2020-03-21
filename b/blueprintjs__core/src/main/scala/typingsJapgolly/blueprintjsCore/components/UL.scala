package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.blueprintjsCore.htmlMod.IElementRefProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UL {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLUListElement] = null,
    ClassAttributes: ClassAttributes[HTMLUListElement] = null,
    elementRef: /* ref */ HTMLUListElement | Null => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    HTMLProps[HTMLUListElement] with IElementRefProps[HTMLUListElement], 
    MountedWithRawType[
      HTMLProps[HTMLUListElement] with IElementRefProps[HTMLUListElement], 
      js.Object, 
      RawMounted[HTMLProps[HTMLUListElement] with IElementRefProps[HTMLUListElement], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (elementRef != null) __obj.updateDynamic("elementRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLUListElement | scala.Null) => elementRef(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLUListElement] with typingsJapgolly.blueprintjsCore.htmlMod.IElementRefProps[org.scalajs.dom.raw.HTMLUListElement], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLUListElement] with typingsJapgolly.blueprintjsCore.htmlMod.IElementRefProps[org.scalajs.dom.raw.HTMLUListElement]])(children: _*)
  }
  @JSImport("@blueprintjs/core", "UL")
  @js.native
  object componentImport extends js.Object
  
}

