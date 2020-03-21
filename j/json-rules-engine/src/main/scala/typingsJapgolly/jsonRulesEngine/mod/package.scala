package typingsJapgolly.jsonRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DynamicFactCallback[T] = js.Function2[
    /* params */ typingsJapgolly.std.Record[java.lang.String, js.Any], 
    /* almanac */ typingsJapgolly.jsonRulesEngine.mod.Almanac, 
    T
  ]
  type EventHandler = js.Function3[
    /* event */ typingsJapgolly.jsonRulesEngine.mod.Event, 
    /* almanac */ typingsJapgolly.jsonRulesEngine.mod.Almanac, 
    /* ruleResult */ typingsJapgolly.jsonRulesEngine.mod.RuleResult, 
    scala.Unit
  ]
  type OperatorEvaluator[A, B] = js.Function2[/* factValue */ A, /* compareToValue */ B, scala.Boolean]
}
