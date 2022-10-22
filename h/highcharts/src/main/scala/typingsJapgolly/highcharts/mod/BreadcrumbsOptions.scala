package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for all breadcrumbs.
  */
trait BreadcrumbsOptions extends StObject {
  
  /**
    * Button theme.
    */
  var buttonTheme: js.UndefOr[SVGAttributes] = js.undefined
}
object BreadcrumbsOptions {
  
  inline def apply(): BreadcrumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbsOptions]
  }
  
  extension [Self <: BreadcrumbsOptions](x: Self) {
    
    inline def setButtonTheme(value: SVGAttributes): Self = StObject.set(x, "buttonTheme", value.asInstanceOf[js.Any])
    
    inline def setButtonThemeUndefined: Self = StObject.set(x, "buttonTheme", js.undefined)
  }
}
