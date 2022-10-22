package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationListValueArgument
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLiteralArgument
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationObjectValueArgument
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationVariableArgument
*/
trait NormalizationArgument extends StObject
object NormalizationArgument {
  
  inline def NormalizationListValueArgument(items: js.Array[NormalizationArgument | Null], kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationListValueArgument = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationListValueArgument]
  }
  
  inline def NormalizationLiteralArgument(kind: String, name: String, value: Any): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLiteralArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLiteralArgument]
  }
  
  inline def NormalizationObjectValueArgument(fields: js.Array[NormalizationArgument], kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationObjectValueArgument = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationObjectValueArgument]
  }
  
  inline def NormalizationVariableArgument(kind: String, name: String, variableName: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationVariableArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationVariableArgument]
  }
}
