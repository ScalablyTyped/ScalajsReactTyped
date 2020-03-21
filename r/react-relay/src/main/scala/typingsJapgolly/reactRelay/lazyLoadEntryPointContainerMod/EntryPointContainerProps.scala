package typingsJapgolly.reactRelay.lazyLoadEntryPointContainerMod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPoint
import typingsJapgolly.reactRelay.entryPointTypesMod.EntryPointProps
import typingsJapgolly.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.entryPointTypesMod.IEnvironmentProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Readonly<{  entryPoint  :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPoint<TEntryPointParams, react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EntryPointComponent<TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps>>,   entryPointParams  :TEntryPointParams,   environmentProvider ? :react-relay.react-relay/lib/relay-experimental/EntryPointTypes.IEnvironmentProvider<react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions>,   props  :TRuntimeProps}>> */
trait EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val entryPoint: EntryPoint[
    TEntryPointParams, 
    Component[
      (EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with js.Object, 
      js.Object
    ]
  ]
  val entryPointParams: TEntryPointParams
  val environmentProvider: js.UndefOr[IEnvironmentProvider[EnvironmentProviderOptions]] = js.undefined
  val props: TRuntimeProps
}

object EntryPointContainerProps {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    entryPoint: EntryPoint[
      TEntryPointParams, 
      Component[
        (EntryPointProps[TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]) with js.Object, 
        js.Object
      ]
    ],
    entryPointParams: TEntryPointParams,
    props: TRuntimeProps,
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions] = null
  ): EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], entryPointParams = entryPointParams.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (environmentProvider != null) __obj.updateDynamic("environmentProvider")(environmentProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointContainerProps[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
}

