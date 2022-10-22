package typingsJapgolly.minecraftScriptingTypesShared

import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Equalssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.EqualssignEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.ExclamationmarkEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Greaterthansign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.GreaterthansignEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.Lessthansign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignEqualssign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.LessthansignGreaterthansign
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.equals
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.not
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.other
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.parent
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.player
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.self
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinecraftFilter extends StObject {
  
  var all_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  
  var any_of: js.UndefOr[js.Array[MinecraftFilter]] = js.undefined
  
  var domain: js.UndefOr[String] = js.undefined
  
  var operator: js.UndefOr[
    ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
  ] = js.undefined
  
  var subject: js.UndefOr[other | parent | player | self | target] = js.undefined
  
  var test: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object MinecraftFilter {
  
  inline def apply(): MinecraftFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinecraftFilter]
  }
  
  extension [Self <: MinecraftFilter](x: Self) {
    
    inline def setAll_of(value: js.Array[MinecraftFilter]): Self = StObject.set(x, "all_of", value.asInstanceOf[js.Any])
    
    inline def setAll_ofUndefined: Self = StObject.set(x, "all_of", js.undefined)
    
    inline def setAll_ofVarargs(value: MinecraftFilter*): Self = StObject.set(x, "all_of", js.Array(value*))
    
    inline def setAny_of(value: js.Array[MinecraftFilter]): Self = StObject.set(x, "any_of", value.asInstanceOf[js.Any])
    
    inline def setAny_ofUndefined: Self = StObject.set(x, "any_of", js.undefined)
    
    inline def setAny_ofVarargs(value: MinecraftFilter*): Self = StObject.set(x, "any_of", js.Array(value*))
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setOperator(
      value: ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | LessthansignGreaterthansign | Equalssign | EqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign | equals | not
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setSubject(value: other | parent | player | self | target): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
