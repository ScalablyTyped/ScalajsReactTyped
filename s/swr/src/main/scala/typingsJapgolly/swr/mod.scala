package typingsJapgolly.swr

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.swr.anon.PartialPropsWithChildrenv
import typingsJapgolly.swr.anon.PropsWithChildrenvaluePar
import typingsJapgolly.swr.anon.WeakValidationMapPropsWit
import typingsJapgolly.swr.distTypesMod.FullConfiguration
import typingsJapgolly.swr.distTypesMod.Key
import typingsJapgolly.swr.distTypesMod.SWRHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swr", JSImport.Default)
  @js.native
  val default: SWRHook = js.native
  
  /* Inlined react.react.FC<react.react.PropsWithChildren<{  value :std.Partial<swr.swr/dist/types.PublicConfiguration<any, any, swr.swr/dist/types.BareFetcher<any>>> & std.Partial<swr.swr/dist/types.ProviderConfiguration> & {  provider :(cache : std.Readonly<swr.swr/dist/types.Cache<any>>): swr.swr/dist/types.Cache<any> | undefined} | undefined}>> & {  default :swr.swr/dist/types.FullConfiguration} */
  object SWRConfig {
    
    inline def apply(props: PropsWithChildrenvaluePar): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: PropsWithChildrenvaluePar, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("swr", "SWRConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("swr", "SWRConfig.default")
    @js.native
    def default: FullConfiguration = js.native
    
    @JSImport("swr", "SWRConfig.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("swr", "SWRConfig.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPropsWithChildrenv] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialPropsWithChildrenv]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: FullConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    @JSImport("swr", "SWRConfig.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("swr", "SWRConfig.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPropsWit] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapPropsWit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def unstableSerialize(key: Key): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_serialize")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useSWRConfig(): FullConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useSWRConfig")().asInstanceOf[FullConfiguration]
}
