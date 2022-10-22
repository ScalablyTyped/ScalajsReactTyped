package typingsJapgolly.algoliasearchHelper.anon

import typingsJapgolly.algoliaClientSearch.mod.SearchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V3ResponseappliedRelevancyS[T] extends StObject {
  
  // @ts-ignore
  var v3: ResponseappliedRelevancyS
  
  // @ts-ignore
  var v4: SearchResponse[T]
  
  // @ts-ignore
  var v5: typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.SearchResponse[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
  ]
}
object V3ResponseappliedRelevancyS {
  
  inline def apply[T](
    v3: ResponseappliedRelevancyS,
    v4: SearchResponse[T],
    v5: typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.SearchResponse[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
    ]
  ): V3ResponseappliedRelevancyS[T] = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3ResponseappliedRelevancyS[T]]
  }
  
  extension [Self <: V3ResponseappliedRelevancyS[?], T](x: Self & V3ResponseappliedRelevancyS[T]) {
    
    inline def setV3(value: ResponseappliedRelevancyS): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: SearchResponse[T]): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(
      value: typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.SearchResponse[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ]
    ): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
