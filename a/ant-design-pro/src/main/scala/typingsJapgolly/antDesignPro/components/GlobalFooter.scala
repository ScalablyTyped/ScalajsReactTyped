package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonBlankTarget
import typingsJapgolly.antDesignPro.globalFooterMod.GlobalFooterProps
import typingsJapgolly.antDesignPro.globalFooterMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GlobalFooter {
  def apply(
    className: String = null,
    copyright: VdomNode = null,
    links: js.Array[AnonBlankTarget] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GlobalFooterProps, default, Unit, GlobalFooterProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.rawNode.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.globalFooterMod.GlobalFooterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.globalFooterMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.globalFooterMod.GlobalFooterProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/GlobalFooter", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

