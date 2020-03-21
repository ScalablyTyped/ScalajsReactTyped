package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.authorizedMod.IAuthorizedProps
import typingsJapgolly.antDesignPro.authorizedRouteMod.authority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Authorized {
  def apply(
    authority: authority,
    noMatch: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IAuthorizedProps, 
    typingsJapgolly.antDesignPro.authorizedMod.Authorized, 
    Unit, 
    IAuthorizedProps
  ] = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
  
      if (noMatch != null) __obj.updateDynamic("noMatch")(noMatch.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.authorizedMod.IAuthorizedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.authorizedMod.Authorized](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.authorizedMod.IAuthorizedProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Authorized", "Authorized")
  @js.native
  object componentImport extends js.Object
  
}

