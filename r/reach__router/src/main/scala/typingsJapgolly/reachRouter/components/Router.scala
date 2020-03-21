package typingsJapgolly.reachRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.reachRouter.mod.RouterProps
import typingsJapgolly.reachRouter.mod.WindowLocation
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    basepath: String = null,
    component: ComponentType[js.Object] | String = null,
    location: WindowLocation = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    RouterProps with HTMLProps[HTMLDivElement], 
    typingsJapgolly.reachRouter.mod.Router, 
    Unit, 
    RouterProps with HTMLProps[HTMLDivElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (basepath != null) __obj.updateDynamic("basepath")(basepath.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reachRouter.mod.RouterProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reachRouter.mod.Router](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachRouter.mod.RouterProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLDivElement]])(children: _*)
  }
  @JSImport("@reach/router", "Router")
  @js.native
  object componentImport extends js.Object
  
}

