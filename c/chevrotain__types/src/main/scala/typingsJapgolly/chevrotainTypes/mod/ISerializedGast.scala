package typingsJapgolly.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISerializedGast extends StObject {
  
  var definition: js.UndefOr[js.Array[ISerializedGast]] = js.undefined
  
  var `type`: typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.NonTerminal | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Alternative | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Option | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatory | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatoryWithSeparator | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Repetition | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionWithSeparator | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Alternation | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Terminal | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Rule
}
object ISerializedGast {
  
  inline def apply(
    `type`: typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.NonTerminal | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Alternative | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Option | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatory | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatoryWithSeparator | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Repetition | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionWithSeparator | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Alternation | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Terminal | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Rule
  ): ISerializedGast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerializedGast]
  }
  
  extension [Self <: ISerializedGast](x: Self) {
    
    inline def setDefinition(value: js.Array[ISerializedGast]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: ISerializedGast*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setType(
      value: typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.NonTerminal | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Alternative | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Option | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatory | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionMandatoryWithSeparator | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Repetition | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.RepetitionWithSeparator | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Alternation | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Terminal | typingsJapgolly.chevrotainTypes.chevrotainTypesStrings.Rule
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
