package typingsJapgolly.hapiJoi.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.hapiJoi.anon.Build
import typingsJapgolly.hapiJoi.anon.From
import typingsJapgolly.std.Record
import typingsJapgolly.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension extends StObject {
  
  var args: js.UndefOr[js.Function1[/* repeated */ SchemaLike, Schema]] = js.undefined
  
  var base: js.UndefOr[Schema] = js.undefined
  
  /**
    * undocumented options
    */
  var cast: js.UndefOr[Record[String, From]] = js.undefined
  
  var coerce: js.UndefOr[CoerceFunction | CoerceObject] = js.undefined
  
  var flags: js.UndefOr[Record[String, ExtensionFlag]] = js.undefined
  
  var manifest: js.UndefOr[Build] = js.undefined
  
  var messages: js.UndefOr[LanguageMessages | String] = js.undefined
  
  var modifiers: js.UndefOr[
    Record[String, js.Function2[/* rule */ Any, /* enabled */ js.UndefOr[Boolean], Any]]
  ] = js.undefined
  
  var overrides: js.UndefOr[Record[String, js.Function1[/* value */ Any, Schema]]] = js.undefined
  
  var prepare: js.UndefOr[js.Function2[/* value */ Any, /* helpers */ CustomHelpers[Any], Any]] = js.undefined
  
  var properties: js.UndefOr[Record[String, Any]] = js.undefined
  
  var rebuild: js.UndefOr[js.Function1[/* schema */ ExtensionBoundSchema, Unit]] = js.undefined
  
  var rules: js.UndefOr[Record[String, ExtensionRule & ThisType[SchemaInternals]]] = js.undefined
  
  var terms: js.UndefOr[Record[String, ExtensionTerm]] = js.undefined
  
  var `type`: String
  
  var validate: js.UndefOr[js.Function2[/* value */ Any, /* helpers */ CustomHelpers[Any], Any]] = js.undefined
}
object Extension {
  
  inline def apply(`type`: String): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  extension [Self <: Extension](x: Self) {
    
    inline def setArgs(value: /* repeated */ SchemaLike => Schema): Self = StObject.set(x, "args", js.Any.fromFunction1(value))
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setBase(value: Schema): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setCast(value: Record[String, From]): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
    
    inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
    
    inline def setCoerce(value: CoerceFunction | CoerceObject): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
    
    inline def setCoerceFunction2(value: (/* value */ Any, /* helpers */ CustomHelpers[Any]) => CoerceResult): Self = StObject.set(x, "coerce", js.Any.fromFunction2(value))
    
    inline def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
    
    inline def setFlags(value: Record[String, ExtensionFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setManifest(value: Build): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setMessages(value: LanguageMessages | String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setModifiers(value: Record[String, js.Function2[/* rule */ Any, /* enabled */ js.UndefOr[Boolean], Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setOverrides(value: Record[String, js.Function1[/* value */ Any, Schema]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPrepare(value: (/* value */ Any, /* helpers */ CustomHelpers[Any]) => Any): Self = StObject.set(x, "prepare", js.Any.fromFunction2(value))
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRebuild(value: /* schema */ ExtensionBoundSchema => Callback): Self = StObject.set(x, "rebuild", js.Any.fromFunction1((t0: /* schema */ ExtensionBoundSchema) => value(t0).runNow()))
    
    inline def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    inline def setRules(value: Record[String, ExtensionRule & ThisType[SchemaInternals]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setTerms(value: Record[String, ExtensionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: (/* value */ Any, /* helpers */ CustomHelpers[Any]) => Any): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
