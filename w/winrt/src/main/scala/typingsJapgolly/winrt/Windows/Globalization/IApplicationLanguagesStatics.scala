package typingsJapgolly.winrt.Windows.Globalization

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IApplicationLanguagesStatics extends StObject {
  
  var languages: IVectorView[String]
  
  var manifestLanguages: IVectorView[String]
  
  var primaryLanguageOverride: String
}
object IApplicationLanguagesStatics {
  
  inline def apply(
    languages: IVectorView[String],
    manifestLanguages: IVectorView[String],
    primaryLanguageOverride: String
  ): IApplicationLanguagesStatics = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any], manifestLanguages = manifestLanguages.asInstanceOf[js.Any], primaryLanguageOverride = primaryLanguageOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationLanguagesStatics]
  }
  
  extension [Self <: IApplicationLanguagesStatics](x: Self) {
    
    inline def setLanguages(value: IVectorView[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setManifestLanguages(value: IVectorView[String]): Self = StObject.set(x, "manifestLanguages", value.asInstanceOf[js.Any])
    
    inline def setPrimaryLanguageOverride(value: String): Self = StObject.set(x, "primaryLanguageOverride", value.asInstanceOf[js.Any])
  }
}
