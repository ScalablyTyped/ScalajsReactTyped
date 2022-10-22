package typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod

import typingsJapgolly.vegaTypings.anon.As
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OperatorOperator
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.CollectOperator
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.AggregateOperator
*/
trait DefinedOperator
  extends StObject
     with Operator
object DefinedOperator {
  
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
}
