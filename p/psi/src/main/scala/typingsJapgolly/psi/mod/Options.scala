package typingsJapgolly.psi.mod

import typingsJapgolly.psi.psiStrings.desktop
import typingsJapgolly.psi.psiStrings.mobile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * When using this module for a production-level build process,
    * registering for an API key from the Google Developer Console is recommended.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * If passed adds links with more info about opportunities.
    * Useful for checking documentation about opportunities.
    * @default false
    */
  var links: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Locale results should be generated in.
    * @default 'en_US'
    */
  var locale: js.UndefOr[String] = js.undefined
  
  var nokey: js.UndefOr[String] = js.undefined
  
  /**
    * Strategy to use when analyzing the page.
    * @default 'mobile'
    */
  var strategy: js.UndefOr[mobile | desktop] = js.undefined
  
  /**
    * Threshold score to pass the PageSpeed test. Useful for setting a performance budget.
    * @default 70
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLinks(value: Boolean): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNokey(value: String): Self = StObject.set(x, "nokey", value.asInstanceOf[js.Any])
    
    inline def setNokeyUndefined: Self = StObject.set(x, "nokey", js.undefined)
    
    inline def setStrategy(value: mobile | desktop): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
