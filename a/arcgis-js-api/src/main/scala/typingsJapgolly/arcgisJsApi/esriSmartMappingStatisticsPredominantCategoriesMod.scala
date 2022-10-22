package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PredominantCategoriesResult
import typingsJapgolly.arcgisJsApi.esri.predominantCategoriesPredominantCategoriesParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSmartMappingStatisticsPredominantCategoriesMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/predominantCategories", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[
    /* params */ predominantCategoriesPredominantCategoriesParams, 
    js.Promise[PredominantCategoriesResult]
  ] = js.native
  
  type _To = js.Function1[
    /* params */ predominantCategoriesPredominantCategoriesParams, 
    js.Promise[PredominantCategoriesResult]
  ]
  
  /* This means you don't have to write `^`, but can instead just say `esriSmartMappingStatisticsPredominantCategoriesMod.foo` */
  override def _to: js.Function1[
    /* params */ predominantCategoriesPredominantCategoriesParams, 
    js.Promise[PredominantCategoriesResult]
  ] = ^
}
