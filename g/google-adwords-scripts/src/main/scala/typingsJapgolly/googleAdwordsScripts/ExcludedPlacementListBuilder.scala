package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedPlacementListBuilder[ExcludedPlacementList]
  extends StObject
     with AdWordsBuilder[ExcludedPlacementList] {
  
  def withName(name: String): ExcludedPlacementListBuilder[ExcludedPlacementList]
}
object ExcludedPlacementListBuilder {
  
  inline def apply[ExcludedPlacementList](
    build: CallbackTo[AdWordsOperation[ExcludedPlacementList]],
    withName: String => ExcludedPlacementListBuilder[ExcludedPlacementList]
  ): ExcludedPlacementListBuilder[ExcludedPlacementList] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
  }
  
  extension [Self <: ExcludedPlacementListBuilder[?], ExcludedPlacementList](x: Self & ExcludedPlacementListBuilder[ExcludedPlacementList]) {
    
    inline def setWithName(value: String => ExcludedPlacementListBuilder[ExcludedPlacementList]): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
