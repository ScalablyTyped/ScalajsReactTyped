package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.Html
import typingsJapgolly.nextAuth.coreTypesMod.Theme
import typingsJapgolly.nextAuth.utilsParseUrlMod.InternalUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePagesErrorMod {
  
  @JSImport("next-auth/core/pages/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ErrorProps): Html = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Html]
  
  trait ErrorProps extends StObject {
    
    var error: js.UndefOr[ErrorType] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var url: js.UndefOr[InternalUrl] = js.undefined
  }
  object ErrorProps {
    
    inline def apply(): ErrorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorProps]
    }
    
    extension [Self <: ErrorProps](x: Self) {
      
      inline def setError(value: ErrorType): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUrl(value: InternalUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nextAuth.nextAuthStrings.default
    - typingsJapgolly.nextAuth.nextAuthStrings.configuration
    - typingsJapgolly.nextAuth.nextAuthStrings.accessdenied
    - typingsJapgolly.nextAuth.nextAuthStrings.verification
  */
  trait ErrorType extends StObject
  object ErrorType {
    
    inline def default: typingsJapgolly.nextAuth.nextAuthStrings.default = "default".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.default]
    
    inline def accessdenied: typingsJapgolly.nextAuth.nextAuthStrings.accessdenied = "accessdenied".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.accessdenied]
    
    inline def configuration: typingsJapgolly.nextAuth.nextAuthStrings.configuration = "configuration".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.configuration]
    
    inline def verification: typingsJapgolly.nextAuth.nextAuthStrings.verification = "verification".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.verification]
  }
}
