package typingsJapgolly.reactRelay.entryPointTypesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{getPreloadProps (entryPointParams : TEntryPointParams): react-relay.react-relay/lib/relay-experimental/EntryPointTypes.PreloadProps<TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TExtraProps, react-relay.react-relay/lib/relay-experimental/EntryPointTypes.EnvironmentProviderOptions>,   root  :unknown}> */
trait InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] extends js.Object {
  val getPreloadProps: js.Function1[
    /* entryPointParams */ TEntryPointParams, 
    PreloadProps[
      TEntryPointParams, 
      TPreloadedQueries, 
      TPreloadedEntryPoints, 
      TExtraProps, 
      EnvironmentProviderOptions
    ]
  ]
  val root: js.Any
}

object InternalEntryPointRepresentation {
  @scala.inline
  def apply[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps](
    getPreloadProps: /* entryPointParams */ TEntryPointParams => CallbackTo[
      PreloadProps[
        TEntryPointParams, 
        TPreloadedQueries, 
        TPreloadedEntryPoints, 
        TExtraProps, 
        EnvironmentProviderOptions
      ]
    ],
    root: js.Any
  ): InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps] = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("getPreloadProps")(js.Any.fromFunction1((t0: /* entryPointParams */ TEntryPointParams) => getPreloadProps(t0).runNow()))
    __obj.asInstanceOf[InternalEntryPointRepresentation[TEntryPointParams, TPreloadedQueries, TPreloadedEntryPoints, TRuntimeProps, TExtraProps]]
  }
}

