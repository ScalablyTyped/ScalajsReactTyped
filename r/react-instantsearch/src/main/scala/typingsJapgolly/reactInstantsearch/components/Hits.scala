package typingsJapgolly.reactInstantsearch.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactInstantsearchDom.AnonHit
import typingsJapgolly.reactInstantsearchDom.mod.HitsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Hits {
  def apply[T](
    hitComponent: ComponentType[AnonHit[T]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HitsProps[T], typingsJapgolly.reactInstantsearch.domMod.Hits[T], Unit, HitsProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (hitComponent != null) __obj.updateDynamic("hitComponent")(hitComponent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInstantsearchDom.mod.HitsProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInstantsearch.domMod.Hits[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInstantsearchDom.mod.HitsProps[T]])(children: _*)
  }
  @JSImport("react-instantsearch/dom", "Hits")
  @js.native
  object componentImport extends js.Object
  
}

