package typingsJapgolly.reactRelay

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPoint
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPointProps
import typingsJapgolly.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/prepareEntryPoint", JSImport.Namespace)
@js.native
object prepareEntryPointMod extends js.Object {
  def prepareEntryPoint[TEntryPointParams /* <: js.Object */, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TRuntimeProps /* <: js.Object */, TExtraProps, TEntryPointComponent /* <: Component[
    (EntryPointProps[
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedQueries, 
      // tslint:disable-next-line no-unnecessary-generics
  TPreloadedEntryPoints, 
      // tslint:disable-next-line no-unnecessary-generics
  TRuntimeProps, 
      // tslint:disable-next-line no-unnecessary-generics
  TExtraProps
    ]) with js.Object, 
    js.Object
  ] */, // tslint:disable-next-line no-unnecessary-generics
  TEntryPoint /* <: EntryPoint[TEntryPointParams, TEntryPointComponent] */](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions],
    // tslint:disable-next-line no-unnecessary-generics
  entryPoint: TEntryPoint,
    entryPointParams: TEntryPointParams
  ): PreloadedEntryPoint[TEntryPointComponent] = js.native
}

