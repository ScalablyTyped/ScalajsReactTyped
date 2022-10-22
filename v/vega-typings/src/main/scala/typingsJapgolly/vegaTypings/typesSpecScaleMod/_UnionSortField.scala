package typingsJapgolly.vegaTypings.typesSpecScaleMod

import typingsJapgolly.vegaTypings.vegaTypingsStrings.count
import typingsJapgolly.vegaTypings.vegaTypingsStrings.max
import typingsJapgolly.vegaTypings.vegaTypingsStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _UnionSortField extends StObject
object _UnionSortField {
  
  inline def FieldOp(field: ScaleField, op: count | min | max): typingsJapgolly.vegaTypings.anon.FieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.FieldOp]
  }
  
  inline def OpOrder(): typingsJapgolly.vegaTypings.anon.OpOrder = {
    val __obj = js.Dynamic.literal(op = "count")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.OpOrder]
  }
}
