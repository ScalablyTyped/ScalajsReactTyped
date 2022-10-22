package typingsJapgolly.reactRelay.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRelay.anon.EntryPointReference
import typingsJapgolly.reactRelay.relayHooksEntryPointContainerDotreactMod.GetComponentFromPreloadedEntryPoint
import typingsJapgolly.reactRelay.relayHooksEntryPointContainerDotreactMod.GetRuntimePropsFromComponent
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EntryPointContainer {
  
  inline def apply[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */](
    entryPointReference: TPreloadedEntryPoint,
    props: GetRuntimePropsFromComponent[GetComponentFromPreloadedEntryPoint[TPreloadedEntryPoint]]
  ): Builder[TPreloadedEntryPoint] = {
    val __props = js.Dynamic.literal(entryPointReference = entryPointReference.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    new Builder[TPreloadedEntryPoint](js.Array(this.component, __props.asInstanceOf[EntryPointReference[TPreloadedEntryPoint]]))
  }
  
  @JSImport("react-relay", "EntryPointContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */](p: EntryPointReference[TPreloadedEntryPoint]): Builder[TPreloadedEntryPoint] = new Builder[TPreloadedEntryPoint](js.Array(this.component, p.asInstanceOf[js.Any]))
}
