package typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod

import typingsJapgolly.std.Exclude
import typingsJapgolly.vegaTypings.anon.As
import typingsJapgolly.vegaTypings.vegaTypingsStrings.aggregate
import typingsJapgolly.vegaTypings.vegaTypingsStrings.collect
import typingsJapgolly.vegaTypings.vegaTypingsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.DefinedOperator
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OtherOperator
*/
trait Operator extends StObject
object Operator {
  
  inline def AggregateOperator(id: ID, params: As): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.AggregateOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.AggregateOperator]
  }
  
  inline def CollectOperator(id: ID): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.CollectOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.CollectOperator]
  }
  
  inline def OperatorOperator(id: ID): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OperatorOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OperatorOperator]
  }
  
  inline def OtherOperator(
    id: ID,
    `type`: Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 78, starting with typingsJapgolly.vegaTypings.vegaTypingsStrings.axisticks, typingsJapgolly.vegaTypings.vegaTypingsStrings.bound, typingsJapgolly.vegaTypings.vegaTypingsStrings.compare */ Any, 
      operator | collect | aggregate
    ]
  ): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OtherOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OtherOperator]
  }
}
