package typingsJapgolly.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints ? :{[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>},   extraProps ? :TExtraProps,   queries ? :{[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}}> */
trait PreloadProps[TPreloadParams, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions] extends js.Object {
  val entryPoints: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ typingsJapgolly.reactRelay.reactRelayStrings.PreloadProps with js.Any
  ] = js.undefined
  val extraProps: js.UndefOr[TExtraProps] = js.undefined
  val queries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ typingsJapgolly.reactRelay.reactRelayStrings.PreloadProps with js.Any
  ] = js.undefined
}

object PreloadProps {
  @scala.inline
  def apply[TPreloadParams, TPreloadedQueries /* <: js.Object */, TPreloadedEntryPoints /* <: js.Object */, TExtraProps, TEnvironmentProviderOptions](
    entryPoints: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedEntryPoints ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractEntryPointTypeHelper<TPreloadParams>}
    */ typingsJapgolly.reactRelay.reactRelayStrings.PreloadProps with js.Any = null,
    extraProps: TExtraProps = null,
    queries: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in keyof TPreloadedQueries ]: react-relay.react-relay/lib/relay-experimental/EntryPointTypes.ExtractQueryTypeHelper<TEnvironmentProviderOptions>}
    */ typingsJapgolly.reactRelay.reactRelayStrings.PreloadProps with js.Any = null
  ): PreloadProps[
    TPreloadParams, 
    TPreloadedQueries, 
    TPreloadedEntryPoints, 
    TExtraProps, 
    TEnvironmentProviderOptions
  ] = {
    val __obj = js.Dynamic.literal()
    if (entryPoints != null) __obj.updateDynamic("entryPoints")(entryPoints.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadProps[
  TPreloadParams, 
  TPreloadedQueries, 
  TPreloadedEntryPoints, 
  TExtraProps, 
  TEnvironmentProviderOptions]]
  }
}

