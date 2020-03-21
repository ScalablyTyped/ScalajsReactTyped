package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import typingsJapgolly.reactVirtualized.esScrollSyncMod.ScrollSyncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollSync {
  def apply(
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ScrollSyncChildProps => CallbackTo[Node]
  ): UnmountedWithRoot[
    ScrollSyncProps, 
    typingsJapgolly.reactVirtualized.mod.ScrollSync, 
    Unit, 
    ScrollSyncProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps) => children(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esScrollSyncMod.ScrollSyncProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactVirtualized.mod.ScrollSync](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esScrollSyncMod.ScrollSyncProps])
  }
  @JSImport("react-virtualized", "ScrollSync")
  @js.native
  object componentImport extends js.Object
  
}

