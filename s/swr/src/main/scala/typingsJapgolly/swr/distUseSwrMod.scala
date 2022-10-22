package typingsJapgolly.swr

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.swr.anon.PartialPropsWithChildrenv
import typingsJapgolly.swr.anon.PropsWithChildrenvaluePar
import typingsJapgolly.swr.anon.WeakValidationMapPropsWit
import typingsJapgolly.swr.distTypesMod.BareFetcher
import typingsJapgolly.swr.distTypesMod.FetcherResponse
import typingsJapgolly.swr.distTypesMod.FullConfiguration
import typingsJapgolly.swr.distTypesMod.InternalConfiguration
import typingsJapgolly.swr.distTypesMod.Key
import typingsJapgolly.swr.distTypesMod.PublicConfiguration
import typingsJapgolly.swr.distTypesMod.SWRHook
import typingsJapgolly.swr.distTypesMod.SWRResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUseSwrMod {
  
  @JSImport("swr/dist/use-swr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swr/dist/use-swr", JSImport.Default)
  @js.native
  val default: SWRHook = js.native
  
  /* Inlined react.react.FC<react.react.PropsWithChildren<{  value :std.Partial<swr.swr/dist/types.PublicConfiguration<any, any, swr.swr/dist/types.BareFetcher<any>>> & std.Partial<swr.swr/dist/types.ProviderConfiguration> & {  provider :(cache : std.Readonly<swr.swr/dist/types.Cache<any>>): swr.swr/dist/types.Cache<any> | undefined} | undefined}>> & {  default :swr.swr/dist/types.FullConfiguration} */
  object SWRConfig {
    
    inline def apply(props: PropsWithChildrenvaluePar): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: PropsWithChildrenvaluePar, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("swr/dist/use-swr", "SWRConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swr/dist/use-swr", "SWRConfig.default")
    @js.native
    def default: FullConfiguration = js.native
    
    @JSImport("swr/dist/use-swr", "SWRConfig.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("swr/dist/use-swr", "SWRConfig.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPropsWithChildrenv] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialPropsWithChildrenv]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: FullConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("swr/dist/use-swr", "SWRConfig.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("swr/dist/use-swr", "SWRConfig.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPropsWit] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapPropsWit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def unstableSerialize(key: Key): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_serialize")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useSWRHandler[Data, Error_1](
    _key: Key,
    fetcher: js.Function1[
      Array[Any] | (/* args_0 */ Record[Any, Any]) | (/* args_0 */ String), 
      FetcherResponse[Data]
    ],
    config: InternalConfiguration & (PublicConfiguration[Any, Any, BareFetcher[Any]]) & (Partial[PublicConfiguration[Data, Error_1, BareFetcher[Any]]])
  ): SWRResponse[Data, Error_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSWRHandler")(_key.asInstanceOf[js.Any], fetcher.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[SWRResponse[Data, Error_1]]
  inline def useSWRHandler[Data, Error_1](
    _key: Key,
    fetcher: js.Function2[/* args_0 */ Any, /* repeated */ Any, FetcherResponse[Data]],
    config: InternalConfiguration & (PublicConfiguration[Any, Any, BareFetcher[Any]]) & (Partial[PublicConfiguration[Data, Error_1, BareFetcher[Any]]])
  ): SWRResponse[Data, Error_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSWRHandler")(_key.asInstanceOf[js.Any], fetcher.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[SWRResponse[Data, Error_1]]
  inline def useSWRHandler[Data, Error_1](
    _key: Key,
    fetcher: Null,
    config: InternalConfiguration & (PublicConfiguration[Any, Any, BareFetcher[Any]]) & (Partial[PublicConfiguration[Data, Error_1, BareFetcher[Any]]])
  ): SWRResponse[Data, Error_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSWRHandler")(_key.asInstanceOf[js.Any], fetcher.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[SWRResponse[Data, Error_1]]
}
