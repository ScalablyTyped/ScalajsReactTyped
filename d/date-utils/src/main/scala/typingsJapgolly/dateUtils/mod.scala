package typingsJapgolly.dateUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def language(lang: LanguageType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("language")(lang.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dateUtils.dateUtilsStrings.es
    - typingsJapgolly.dateUtils.dateUtilsStrings.fr
    - typingsJapgolly.dateUtils.dateUtilsStrings.`pt-BR`
  */
  trait LanguageType extends StObject
  object LanguageType {
    
    inline def es: typingsJapgolly.dateUtils.dateUtilsStrings.es = "es".asInstanceOf[typingsJapgolly.dateUtils.dateUtilsStrings.es]
    
    inline def fr: typingsJapgolly.dateUtils.dateUtilsStrings.fr = "fr".asInstanceOf[typingsJapgolly.dateUtils.dateUtilsStrings.fr]
    
    inline def `pt-BR`: typingsJapgolly.dateUtils.dateUtilsStrings.`pt-BR` = "pt-BR".asInstanceOf[typingsJapgolly.dateUtils.dateUtilsStrings.`pt-BR`]
  }
}
