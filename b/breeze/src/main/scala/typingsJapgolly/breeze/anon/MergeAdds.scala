package typingsJapgolly.breeze.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.breeze.breeze.MergeStrategySymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeAdds extends StObject {
  
  var mergeAdds: js.UndefOr[Boolean] = js.undefined
  
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.undefined
  
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ Any, Unit]] = js.undefined
}
object MergeAdds {
  
  inline def apply(): MergeAdds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeAdds]
  }
  
  extension [Self <: MergeAdds](x: Self) {
    
    inline def setMergeAdds(value: Boolean): Self = StObject.set(x, "mergeAdds", value.asInstanceOf[js.Any])
    
    inline def setMergeAddsUndefined: Self = StObject.set(x, "mergeAdds", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategySymbol): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    inline def setMetadataVersionFn(value: /* any */ Any => Callback): Self = StObject.set(x, "metadataVersionFn", js.Any.fromFunction1((t0: /* any */ Any) => value(t0).runNow()))
    
    inline def setMetadataVersionFnUndefined: Self = StObject.set(x, "metadataVersionFn", js.undefined)
  }
}
