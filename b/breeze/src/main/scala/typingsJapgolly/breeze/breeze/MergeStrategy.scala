package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.breeze.breeze.core.EnumSymbol
import typingsJapgolly.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeStrategy
  extends StObject
     with IEnum {
  
  var Disallowed: MergeStrategySymbol
  
  var OverwriteChanges: MergeStrategySymbol
  
  var PreserveChanges: MergeStrategySymbol
  
  var SkipMerge: MergeStrategySymbol
}
object MergeStrategy {
  
  inline def apply(
    Disallowed: MergeStrategySymbol,
    OverwriteChanges: MergeStrategySymbol,
    PreserveChanges: MergeStrategySymbol,
    SkipMerge: MergeStrategySymbol,
    contains: Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: CallbackTo[js.Array[String]],
    getSymbols: CallbackTo[js.Array[EnumSymbol]]
  ): MergeStrategy = {
    val __obj = js.Dynamic.literal(Disallowed = Disallowed.asInstanceOf[js.Any], OverwriteChanges = OverwriteChanges.asInstanceOf[js.Any], PreserveChanges = PreserveChanges.asInstanceOf[js.Any], SkipMerge = SkipMerge.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = getNames.toJsFn, getSymbols = getSymbols.toJsFn)
    __obj.asInstanceOf[MergeStrategy]
  }
  
  extension [Self <: MergeStrategy](x: Self) {
    
    inline def setDisallowed(value: MergeStrategySymbol): Self = StObject.set(x, "Disallowed", value.asInstanceOf[js.Any])
    
    inline def setOverwriteChanges(value: MergeStrategySymbol): Self = StObject.set(x, "OverwriteChanges", value.asInstanceOf[js.Any])
    
    inline def setPreserveChanges(value: MergeStrategySymbol): Self = StObject.set(x, "PreserveChanges", value.asInstanceOf[js.Any])
    
    inline def setSkipMerge(value: MergeStrategySymbol): Self = StObject.set(x, "SkipMerge", value.asInstanceOf[js.Any])
  }
}
