package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsConfigMod.Config
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.RawInterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue
import typingsJapgolly.hyperformula.typingsLookupAdvancedFindMod.AdvancedFind
import typingsJapgolly.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsLookupColumnBinarySearchMod {
  
  @JSImport("hyperformula/typings/Lookup/ColumnBinarySearch", "ColumnBinarySearch")
  @js.native
  open class ColumnBinarySearch protected ()
    extends AdvancedFind
       with ColumnSearchStrategy {
    def this(dependencyGraph: DependencyGraph, config: Config) = this()
    
    /* InferMemberOverrides */
    override def advancedFind(keyMatcher: js.Function1[/* arg */ RawInterpreterValue, Boolean], rangeValue: SimpleRangeValue): Double = js.native
    
    /* private */ var config: Any = js.native
    
    /* CompleteClass */
    override def find(key: RawNoErrorScalarValue, range: SimpleRangeValue, sorted: Boolean): Double = js.native
  }
}
