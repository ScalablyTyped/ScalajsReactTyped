package typingsJapgolly.reactRelay

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPointProps
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntryPointReference[TEntryPointComponent /* <: Component[
(EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]) with js.Object, 
js.Object] */, TRuntimeProps /* <: js.Object */] extends js.Object {
  var entryPointReference: PreloadedEntryPoint[TEntryPointComponent]
  var props: TRuntimeProps
}

object AnonEntryPointReference {
  @scala.inline
  def apply[TEntryPointComponent /* <: Component[
    (EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]) with js.Object, 
    js.Object
  ] */, TRuntimeProps /* <: js.Object */](entryPointReference: PreloadedEntryPoint[TEntryPointComponent], props: TRuntimeProps): AnonEntryPointReference[TEntryPointComponent, TRuntimeProps] = {
    val __obj = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntryPointReference[TEntryPointComponent, TRuntimeProps]]
  }
}

