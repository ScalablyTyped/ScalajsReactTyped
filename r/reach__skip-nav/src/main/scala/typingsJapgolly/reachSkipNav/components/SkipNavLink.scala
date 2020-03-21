package typingsJapgolly.reachSkipNav.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.reachSkipNav.mod.SkipNavProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SkipNavLink {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String | Node = null
  ): UnmountedWithRoot[
    SkipNavProps with HTMLProps[HTMLAnchorElement], 
    typingsJapgolly.reachSkipNav.mod.SkipNavLink, 
    Unit, 
    SkipNavProps with HTMLProps[HTMLAnchorElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reachSkipNav.mod.SkipNavProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLAnchorElement], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reachSkipNav.mod.SkipNavLink](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachSkipNav.mod.SkipNavProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLAnchorElement]])
  }
  @JSImport("@reach/skip-nav", "SkipNavLink")
  @js.native
  object componentImport extends js.Object
  
}

