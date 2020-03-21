package typingsJapgolly.fluxibleRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fluxibleRouter.mod.NavLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object NavLink {
  def apply(
    props: NavLinkProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    NavLinkProps with js.Object, 
    typingsJapgolly.fluxibleRouter.mod.NavLink, 
    Unit, 
    NavLinkProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fluxibleRouter.mod.NavLinkProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fluxibleRouter.mod.NavLink](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fluxibleRouter.mod.NavLinkProps with js.Object])(children: _*)
  }
  @JSImport("fluxible-router", "NavLink")
  @js.native
  object componentImport extends js.Object
  
}

