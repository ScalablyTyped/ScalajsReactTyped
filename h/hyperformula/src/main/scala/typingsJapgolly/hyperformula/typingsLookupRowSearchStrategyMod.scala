package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsConfigMod.Config
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.RawInterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue
import typingsJapgolly.hyperformula.typingsLookupAdvancedFindMod.AdvancedFind
import typingsJapgolly.hyperformula.typingsLookupSearchStrategyMod.SearchStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsLookupRowSearchStrategyMod {
  
  @JSImport("hyperformula/typings/Lookup/RowSearchStrategy", "RowSearchStrategy")
  @js.native
  open class RowSearchStrategy protected ()
    extends AdvancedFind
       with SearchStrategy {
    def this(config: Config, dependencyGraph: DependencyGraph) = this()
    
    /* InferMemberOverrides */
    override def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], rangeValue: SimpleRangeValue): Double = js.native
    
    /* private */ var config: Any = js.native
    
    /* CompleteClass */
    override def find(key: RawNoErrorScalarValue, range: SimpleRangeValue, sorted: Boolean): Double = js.native
  }
}
