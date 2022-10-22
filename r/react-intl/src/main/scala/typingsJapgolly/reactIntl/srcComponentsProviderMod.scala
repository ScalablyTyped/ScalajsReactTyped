package typingsJapgolly.reactIntl

import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactIntl.anon.PartialState
import typingsJapgolly.reactIntl.anon.PickResolvedIntlConfigonE
import typingsJapgolly.reactIntl.srcTypesMod.IntlConfig
import typingsJapgolly.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsProviderMod {
  
  @JSImport("react-intl/src/components/provider", JSImport.Default)
  @js.native
  open class default () extends IntlProvider
  /* static members */
  object default {
    
    @JSImport("react-intl/src/components/provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/src/components/provider", "default.defaultProps")
    @js.native
    def defaultProps: PickResolvedIntlConfigonE = js.native
    inline def defaultProps_=(x: PickResolvedIntlConfigonE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/src/components/provider", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: IntlConfig, hasPrevConfigCache: State): PartialState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevConfigCache.asInstanceOf[js.Any])).asInstanceOf[PartialState | Null]
  }
  
  @JSImport("react-intl/src/components/provider", "createIntl")
  @js.native
  val createIntl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateIntlFn<React.ReactNode, IntlConfig, IntlShape> */ Any = js.native
  
  @js.native
  trait IntlProvider extends PureComponent[PropsWithChildren[IntlConfig], State, Any] {
    
    /* private */ var cache: Any = js.native
  }
  
  trait State extends StObject {
    
    /**
      * Explicit intl cache to prevent memory leaks
      */
    var cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ Any
    
    /**
      * Intl object we created
      */
    var intl: js.UndefOr[IntlShape] = js.undefined
    
    /**
      * list of memoized config we care about.
      * This is important since creating intl is
      * very expensive
      */
    var prevConfig: IntlConfig
  }
  object State {
    
    inline def apply(
      cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ Any,
      prevConfig: IntlConfig
    ): State = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], prevConfig = prevConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCache(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ Any
      ): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
      
      inline def setIntlUndefined: Self = StObject.set(x, "intl", js.undefined)
      
      inline def setPrevConfig(value: IntlConfig): Self = StObject.set(x, "prevConfig", value.asInstanceOf[js.Any])
    }
  }
}
