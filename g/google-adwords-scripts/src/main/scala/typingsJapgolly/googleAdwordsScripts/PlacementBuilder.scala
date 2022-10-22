package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementBuilder[Placement]
  extends StObject
     with DisplayBuilder[PlacementBuilder[Placement]] {
  
  def withUrl(url: String): PlacementBuilder[Placement]
}
object PlacementBuilder {
  
  inline def apply[Placement](
    build: CallbackTo[AdWordsOperation[PlacementBuilder[Placement]]],
    exclude: CallbackTo[AdWordsOperation[PlacementBuilder[Placement]]],
    withCpc: Double => PlacementBuilder[Placement],
    withCpm: Double => PlacementBuilder[Placement],
    withUrl: String => PlacementBuilder[Placement]
  ): PlacementBuilder[Placement] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withUrl = js.Any.fromFunction1(withUrl))
    __obj.asInstanceOf[PlacementBuilder[Placement]]
  }
  
  extension [Self <: PlacementBuilder[?], Placement](x: Self & PlacementBuilder[Placement]) {
    
    inline def setWithUrl(value: String => PlacementBuilder[Placement]): Self = StObject.set(x, "withUrl", js.Any.fromFunction1(value))
  }
}
