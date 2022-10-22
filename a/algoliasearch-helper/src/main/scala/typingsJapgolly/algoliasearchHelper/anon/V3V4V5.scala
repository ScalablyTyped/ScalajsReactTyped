package typingsJapgolly.algoliasearchHelper.anon

import typingsJapgolly.algoliaClientSearch.mod.RankingInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V3V4V5 extends StObject {
  
  var v3: Record[String, Any]
  
  // @ts-ignore
  var v4: RankingInfo
  
  // @ts-ignore
  var v5: typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.RankingInfo
}
object V3V4V5 {
  
  inline def apply(
    v3: Record[String, Any],
    v4: RankingInfo,
    v5: typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.RankingInfo
  ): V3V4V5 = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3V4V5]
  }
  
  extension [Self <: V3V4V5](x: Self) {
    
    inline def setV3(value: Record[String, Any]): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: RankingInfo): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(value: typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.RankingInfo): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
