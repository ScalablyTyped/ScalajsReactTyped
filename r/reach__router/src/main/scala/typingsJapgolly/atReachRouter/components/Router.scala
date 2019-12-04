package typingsJapgolly.atReachRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.atReachRouter.atReachRouterMod.RouterProps
import typingsJapgolly.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object Router {
  def apply(
    props: RouterProps with HTMLProps[HTMLDivElement] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RouterProps with HTMLProps[HTMLDivElement] with js.Object, 
    typingsJapgolly.atReachRouter.atReachRouterMod.Router, 
    Unit, 
    RouterProps with HTMLProps[HTMLDivElement] with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atReachRouter.atReachRouterMod.RouterProps with typingsJapgolly.react.reactMod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atReachRouter.atReachRouterMod.Router](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atReachRouter.atReachRouterMod.RouterProps with typingsJapgolly.react.reactMod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement] with js.Object])(children: _*)
  }
  @JSImport("@reach/router", "Router")
  @js.native
  object componentImport extends js.Object
  
}

