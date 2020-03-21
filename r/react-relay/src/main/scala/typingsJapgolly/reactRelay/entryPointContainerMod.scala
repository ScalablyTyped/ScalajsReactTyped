package typingsJapgolly.reactRelay

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ElementType
import typingsJapgolly.react.mod.ClassicElement
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPointProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/EntryPointContainer", JSImport.Namespace)
@js.native
object entryPointContainerMod extends js.Object {
  def EntryPointContainer[TPreloadedQueries /* <: js.Object */, TPreloadedNestedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: Component[
    (EntryPointProps[TPreloadedQueries, TPreloadedNestedEntryPoints, TRuntimeProps, TExtraProps]) with js.Object, 
    js.Object
  ] */](hasEntryPointReferenceProps: AnonEntryPointReference[TEntryPointComponent, TRuntimeProps]): ClassicElement[ElementType] = js.native
}

