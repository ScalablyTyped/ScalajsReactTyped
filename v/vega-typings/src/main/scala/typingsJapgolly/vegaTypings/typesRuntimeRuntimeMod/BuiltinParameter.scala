package typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod

import typingsJapgolly.std.Record
import typingsJapgolly.vegaTypings.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OperatorParam
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.KeyParam
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ExpressionParam
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.FieldParam
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.EncodeParam
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.CompareParam
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ContextParam
  - typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.SubflowParam
*/
trait BuiltinParameter extends StObject
object BuiltinParameter {
  
  inline def CompareParam($compare: OrArray[String], $order: OrArray[Order]): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.CompareParam = {
    val __obj = js.Dynamic.literal($compare = $compare.asInstanceOf[js.Any], $order = $order.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.CompareParam]
  }
  
  inline def ContextParam(): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ContextParam = {
    val __obj = js.Dynamic.literal($context = true)
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ContextParam]
  }
  
  inline def EncodeParam($encode: Record[String, EncodeValue]): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.EncodeParam = {
    val __obj = js.Dynamic.literal($encode = $encode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.EncodeParam]
  }
  
  inline def ExpressionParam($expr: Code): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ExpressionParam = {
    val __obj = js.Dynamic.literal($expr = $expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ExpressionParam]
  }
  
  inline def FieldParam(): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.FieldParam = {
    val __obj = js.Dynamic.literal($field = null)
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.FieldParam]
  }
  
  inline def KeyParam($key: js.Array[String]): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.KeyParam = {
    val __obj = js.Dynamic.literal($key = $key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.KeyParam]
  }
  
  inline def OperatorParam($ref: ID): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OperatorParam = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.OperatorParam]
  }
  
  inline def SubflowParam($subflow: Subflow): typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.SubflowParam = {
    val __obj = js.Dynamic.literal($subflow = $subflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.SubflowParam]
  }
}
