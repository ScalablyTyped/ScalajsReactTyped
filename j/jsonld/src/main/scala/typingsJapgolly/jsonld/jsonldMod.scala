package typingsJapgolly.jsonld

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonld.anon.Container
import typingsJapgolly.jsonld.anon.Protected
import typingsJapgolly.jsonld.jsonldStrings.`1Dot1`
import typingsJapgolly.jsonld.jsonldStrings.`@graph`
import typingsJapgolly.jsonld.jsonldStrings.`@id`
import typingsJapgolly.jsonld.jsonldStrings.`@json`
import typingsJapgolly.jsonld.jsonldStrings.`@list`
import typingsJapgolly.jsonld.jsonldStrings.`@none`
import typingsJapgolly.jsonld.jsonldStrings.`@set`
import typingsJapgolly.jsonld.jsonldStrings.ltr
import typingsJapgolly.jsonld.jsonldStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonldMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonld.jsonldStrings.`@language`
    - typingsJapgolly.jsonld.jsonldStrings.`@index`
    - typingsJapgolly.jsonld.jsonldStrings.`@id`
    - typingsJapgolly.jsonld.jsonldStrings.`@graph`
    - typingsJapgolly.jsonld.jsonldStrings.`@type`
  */
  trait ContainerType extends StObject
  object ContainerType {
    
    inline def `@graph`: typingsJapgolly.jsonld.jsonldStrings.`@graph` = "@graph".asInstanceOf[typingsJapgolly.jsonld.jsonldStrings.`@graph`]
    
    inline def `@id`: typingsJapgolly.jsonld.jsonldStrings.`@id` = "@id".asInstanceOf[typingsJapgolly.jsonld.jsonldStrings.`@id`]
    
    inline def `@index`: typingsJapgolly.jsonld.jsonldStrings.`@index` = "@index".asInstanceOf[typingsJapgolly.jsonld.jsonldStrings.`@index`]
    
    inline def `@language`: typingsJapgolly.jsonld.jsonldStrings.`@language` = "@language".asInstanceOf[typingsJapgolly.jsonld.jsonldStrings.`@language`]
    
    inline def `@type`: typingsJapgolly.jsonld.jsonldStrings.`@type` = "@type".asInstanceOf[typingsJapgolly.jsonld.jsonldStrings.`@type`]
  }
  
  type ContainerTypeArray = (js.Tuple2[
    `@graph` | `@id` | `@set` | ContainerType, 
    `@id` | `@graph` | `@set` | ContainerType
  ]) | (js.Tuple3[`@set` | `@graph` | `@id`, `@graph` | `@id` | `@set`, `@id` | `@graph` | `@set`])
  
  trait ContextDefinition
    extends StObject
       with /* key */ StringDictionary[
          js.UndefOr[
            Null | String | ExpandedTermDefinition | Protected | (/* import warning: importer.ImportType#apply Failed type conversion: jsonld.jsonld/jsonld.Keyword['@propagate'] */ js.Any)
          ]
        ] {
    
    var `@base`: js.UndefOr[String | Null] = js.undefined
    
    var `@direction`: js.UndefOr[ltr | rtl | Null] = js.undefined
    
    var `@import`: js.UndefOr[String] = js.undefined
    
    var `@language`: js.UndefOr[String] = js.undefined
    
    var `@propagate`: js.UndefOr[Boolean] = js.undefined
    
    var `@protected`: js.UndefOr[Boolean] = js.undefined
    
    var `@type`: js.UndefOr[Container] = js.undefined
    
    var `@version`: js.UndefOr[`1Dot1`] = js.undefined
    
    var `@vocab`: js.UndefOr[String | Null] = js.undefined
  }
  object ContextDefinition {
    
    inline def apply(): ContextDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextDefinition]
    }
    
    extension [Self <: ContextDefinition](x: Self) {
      
      inline def `set@base`(value: String): Self = StObject.set(x, "@base", value.asInstanceOf[js.Any])
      
      inline def `set@baseNull`: Self = StObject.set(x, "@base", null)
      
      inline def `set@baseUndefined`: Self = StObject.set(x, "@base", js.undefined)
      
      inline def `set@direction`(value: ltr | rtl): Self = StObject.set(x, "@direction", value.asInstanceOf[js.Any])
      
      inline def `set@directionNull`: Self = StObject.set(x, "@direction", null)
      
      inline def `set@directionUndefined`: Self = StObject.set(x, "@direction", js.undefined)
      
      inline def `set@import`(value: String): Self = StObject.set(x, "@import", value.asInstanceOf[js.Any])
      
      inline def `set@importUndefined`: Self = StObject.set(x, "@import", js.undefined)
      
      inline def `set@language`(value: String): Self = StObject.set(x, "@language", value.asInstanceOf[js.Any])
      
      inline def `set@languageUndefined`: Self = StObject.set(x, "@language", js.undefined)
      
      inline def `set@propagate`(value: Boolean): Self = StObject.set(x, "@propagate", value.asInstanceOf[js.Any])
      
      inline def `set@propagateUndefined`: Self = StObject.set(x, "@propagate", js.undefined)
      
      inline def `set@protected`(value: Boolean): Self = StObject.set(x, "@protected", value.asInstanceOf[js.Any])
      
      inline def `set@protectedUndefined`: Self = StObject.set(x, "@protected", js.undefined)
      
      inline def `set@type`(value: Container): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
      
      inline def `set@version`(value: `1Dot1`): Self = StObject.set(x, "@version", value.asInstanceOf[js.Any])
      
      inline def `set@versionUndefined`: Self = StObject.set(x, "@version", js.undefined)
      
      inline def `set@vocab`(value: String): Self = StObject.set(x, "@vocab", value.asInstanceOf[js.Any])
      
      inline def `set@vocabNull`: Self = StObject.set(x, "@vocab", null)
      
      inline def `set@vocabUndefined`: Self = StObject.set(x, "@vocab", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonld.anon.idKeywordidnullundefinedn
    - typingsJapgolly.jsonld.anon.reverseKeywordreversecont
  */
  trait ExpandedTermDefinition extends StObject
  object ExpandedTermDefinition {
    
    inline def idKeywordidnullundefinedn(): typingsJapgolly.jsonld.anon.idKeywordidnullundefinedn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.jsonld.anon.idKeywordidnullundefinedn]
    }
    
    inline def reverseKeywordreversecont(`@reverse`: String): typingsJapgolly.jsonld.anon.reverseKeywordreversecont = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@reverse")(`@reverse`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.jsonld.anon.reverseKeywordreversecont]
    }
  }
  
  trait GraphObject extends StObject {
    
    var `@context`: js.UndefOr[OrArray[Null | String | ContextDefinition]] = js.undefined
    
    var `@graph`: OrArray[NodeObject]
    
    var `@id`: js.UndefOr[OrArray[String]] = js.undefined
    
    var `@index`: js.UndefOr[String] = js.undefined
  }
  object GraphObject {
    
    inline def apply(`@graph`: OrArray[NodeObject]): GraphObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@graph")(`@graph`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphObject]
    }
    
    extension [Self <: GraphObject](x: Self) {
      
      inline def `set@context`(value: OrArray[Null | String | ContextDefinition]): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@contextVarargs`(value: (Null | String | ContextDefinition)*): Self = StObject.set(x, "@context", js.Array(value*))
      
      inline def `set@graph`(value: OrArray[NodeObject]): Self = StObject.set(x, "@graph", value.asInstanceOf[js.Any])
      
      inline def `set@graphVarargs`(value: NodeObject*): Self = StObject.set(x, "@graph", js.Array(value*))
      
      inline def `set@id`(value: OrArray[String]): Self = StObject.set(x, "@id", value.asInstanceOf[js.Any])
      
      inline def `set@idUndefined`: Self = StObject.set(x, "@id", js.undefined)
      
      inline def `set@idVarargs`(value: String*): Self = StObject.set(x, "@id", js.Array(value*))
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
    }
  }
  
  type IdMap = StringDictionary[NodeObject]
  
  type IncludedBlock = OrArray[NodeObject]
  
  type IndexMap = StringDictionary[
    OrArray[
      Null | Boolean | Double | String | NodeObject | ValueObject | ListObject | SetObject
    ]
  ]
  
  type JsonArray = js.Array[JsonValue]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonld.jsonldMod.NodeObject
    - js.Array[typingsJapgolly.jsonld.jsonldMod.NodeObject]
    - typingsJapgolly.jsonld.anon.Context
  */
  type JsonLdDocument = _JsonLdDocument | js.Array[NodeObject]
  
  trait JsonObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[JsonValue]]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  /*
    * JSON Types
    * (not for export)
    */
  type JsonPrimitive = String | Double | Boolean | Null
  
  type JsonValue = JsonPrimitive | Any | JsonObject
  
  /**
    * A list of keywords and their types.
    * Only used for internal reference; not an actual interface.
    * Not for export.
    * @see https://www.w3.org/TR/json-ld/#keywords
    */
  // tslint:disable-next-line:interface-over-type-literal
  trait Keyword extends StObject {
    
    var `@base`: String | Null
    
    var `@container`: (OrArray[`@list` | `@set` | ContainerType]) | ContainerTypeArray | Null
    
    var `@context`: OrArray[Null | String | ContextDefinition]
    
    var `@direction`: ltr | rtl | Null
    
    var `@graph`: OrArray[ValueObject | NodeObject]
    
    var `@id`: OrArray[String]
    
    var `@import`: String
    
    var `@included`: IncludedBlock
    
    var `@index`: String
    
    var `@json`: typingsJapgolly.jsonld.jsonldStrings.`@json`
    
    var `@language`: String
    
    var `@list`: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]
    
    var `@nest`: js.Object
    
    var `@none`: typingsJapgolly.jsonld.jsonldStrings.`@none`
    
    var `@prefix`: Boolean
    
    var `@propagate`: Boolean
    
    var `@protected`: Boolean
    
    var `@reverse`: String
    
    var `@set`: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]
    
    var `@type`: String
    
    var `@value`: Null | Boolean | Double | String
    
    var `@version`: `1Dot1`
    
    var `@vocab`: String | Null
  }
  object Keyword {
    
    inline def apply(
      `@graph`: OrArray[ValueObject | NodeObject],
      `@id`: OrArray[String],
      `@import`: String,
      `@included`: IncludedBlock,
      `@index`: String,
      `@language`: String,
      `@nest`: js.Object,
      `@prefix`: Boolean,
      `@propagate`: Boolean,
      `@protected`: Boolean,
      `@reverse`: String,
      `@type`: String
    ): Keyword = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@graph")(`@graph`.asInstanceOf[js.Any])
      __obj.updateDynamic("@id")(`@id`.asInstanceOf[js.Any])
      __obj.updateDynamic("@import")(`@import`.asInstanceOf[js.Any])
      __obj.updateDynamic("@included")(`@included`.asInstanceOf[js.Any])
      __obj.updateDynamic("@index")(`@index`.asInstanceOf[js.Any])
      __obj.updateDynamic("@json")("@json")
      __obj.updateDynamic("@language")(`@language`.asInstanceOf[js.Any])
      __obj.updateDynamic("@nest")(`@nest`.asInstanceOf[js.Any])
      __obj.updateDynamic("@none")("@none")
      __obj.updateDynamic("@prefix")(`@prefix`.asInstanceOf[js.Any])
      __obj.updateDynamic("@propagate")(`@propagate`.asInstanceOf[js.Any])
      __obj.updateDynamic("@protected")(`@protected`.asInstanceOf[js.Any])
      __obj.updateDynamic("@reverse")(`@reverse`.asInstanceOf[js.Any])
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.updateDynamic("@version")("1.1")
      __obj.updateDynamic("@base")(null)
      __obj.updateDynamic("@container")(null)
      __obj.updateDynamic("@context")(null)
      __obj.updateDynamic("@direction")(null)
      __obj.updateDynamic("@list")(null)
      __obj.updateDynamic("@set")(null)
      __obj.updateDynamic("@value")(null)
      __obj.updateDynamic("@vocab")(null)
      __obj.asInstanceOf[Keyword]
    }
    
    extension [Self <: Keyword](x: Self) {
      
      inline def `set@base`(value: String): Self = StObject.set(x, "@base", value.asInstanceOf[js.Any])
      
      inline def `set@baseNull`: Self = StObject.set(x, "@base", null)
      
      inline def `set@container`(value: (OrArray[`@list` | `@set` | ContainerType]) | ContainerTypeArray): Self = StObject.set(x, "@container", value.asInstanceOf[js.Any])
      
      inline def `set@containerNull`: Self = StObject.set(x, "@container", null)
      
      inline def `set@containerVarargs`(value: (`@list` | `@set` | ContainerType)*): Self = StObject.set(x, "@container", js.Array(value*))
      
      inline def `set@context`(value: OrArray[Null | String | ContextDefinition]): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
      
      inline def `set@contextVarargs`(value: (Null | String | ContextDefinition)*): Self = StObject.set(x, "@context", js.Array(value*))
      
      inline def `set@direction`(value: ltr | rtl): Self = StObject.set(x, "@direction", value.asInstanceOf[js.Any])
      
      inline def `set@directionNull`: Self = StObject.set(x, "@direction", null)
      
      inline def `set@graph`(value: OrArray[ValueObject | NodeObject]): Self = StObject.set(x, "@graph", value.asInstanceOf[js.Any])
      
      inline def `set@graphVarargs`(value: (ValueObject | NodeObject)*): Self = StObject.set(x, "@graph", js.Array(value*))
      
      inline def `set@id`(value: OrArray[String]): Self = StObject.set(x, "@id", value.asInstanceOf[js.Any])
      
      inline def `set@idVarargs`(value: String*): Self = StObject.set(x, "@id", js.Array(value*))
      
      inline def `set@import`(value: String): Self = StObject.set(x, "@import", value.asInstanceOf[js.Any])
      
      inline def `set@included`(value: IncludedBlock): Self = StObject.set(x, "@included", value.asInstanceOf[js.Any])
      
      inline def `set@includedVarargs`(value: NodeObject*): Self = StObject.set(x, "@included", js.Array(value*))
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@json`(value: `@json`): Self = StObject.set(x, "@json", value.asInstanceOf[js.Any])
      
      inline def `set@language`(value: String): Self = StObject.set(x, "@language", value.asInstanceOf[js.Any])
      
      inline def `set@list`(value: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]): Self = StObject.set(x, "@list", value.asInstanceOf[js.Any])
      
      inline def `set@listNull`: Self = StObject.set(x, "@list", null)
      
      inline def `set@listVarargs`(value: (Null | Boolean | Double | String | NodeObject | ValueObject)*): Self = StObject.set(x, "@list", js.Array(value*))
      
      inline def `set@nest`(value: js.Object): Self = StObject.set(x, "@nest", value.asInstanceOf[js.Any])
      
      inline def `set@none`(value: `@none`): Self = StObject.set(x, "@none", value.asInstanceOf[js.Any])
      
      inline def `set@prefix`(value: Boolean): Self = StObject.set(x, "@prefix", value.asInstanceOf[js.Any])
      
      inline def `set@propagate`(value: Boolean): Self = StObject.set(x, "@propagate", value.asInstanceOf[js.Any])
      
      inline def `set@protected`(value: Boolean): Self = StObject.set(x, "@protected", value.asInstanceOf[js.Any])
      
      inline def `set@reverse`(value: String): Self = StObject.set(x, "@reverse", value.asInstanceOf[js.Any])
      
      inline def `set@set`(value: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]): Self = StObject.set(x, "@set", value.asInstanceOf[js.Any])
      
      inline def `set@setNull`: Self = StObject.set(x, "@set", null)
      
      inline def `set@setVarargs`(value: (Null | Boolean | Double | String | NodeObject | ValueObject)*): Self = StObject.set(x, "@set", js.Array(value*))
      
      inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@value`(value: Boolean | Double | String): Self = StObject.set(x, "@value", value.asInstanceOf[js.Any])
      
      inline def `set@valueNull`: Self = StObject.set(x, "@value", null)
      
      inline def `set@version`(value: `1Dot1`): Self = StObject.set(x, "@version", value.asInstanceOf[js.Any])
      
      inline def `set@vocab`(value: String): Self = StObject.set(x, "@vocab", value.asInstanceOf[js.Any])
      
      inline def `set@vocabNull`: Self = StObject.set(x, "@vocab", null)
    }
  }
  
  type LanguageMap = StringDictionary[Null | String | js.Array[String]]
  
  trait ListObject extends StObject {
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@list`: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]
  }
  object ListObject {
    
    inline def apply(): ListObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@list")(null)
      __obj.asInstanceOf[ListObject]
    }
    
    extension [Self <: ListObject](x: Self) {
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@list`(value: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]): Self = StObject.set(x, "@list", value.asInstanceOf[js.Any])
      
      inline def `set@listNull`: Self = StObject.set(x, "@list", null)
      
      inline def `set@listVarargs`(value: (Null | Boolean | Double | String | NodeObject | ValueObject)*): Self = StObject.set(x, "@list", js.Array(value*))
    }
  }
  
  trait NodeObject
    extends StObject
       with /* key */ StringDictionary[
          js.UndefOr[
            (OrArray[
              (/* import warning: importer.ImportType#apply Failed type conversion: jsonld.jsonld/jsonld.Keyword['@type'] */ js.Any) | Boolean | Double | GraphObject | JsonObject | ListObject | NodeObject | Null | SetObject | String | ValueObject
            ]) | LanguageMap | IndexMap | IncludedBlock | IdMap | TypeMap | (StringDictionary[
              /* import warning: importer.ImportType#apply Failed type conversion: jsonld.jsonld/jsonld.Keyword['@reverse'] */ js.Any
            ]) | (/* import warning: importer.ImportType#apply Failed type conversion: jsonld.jsonld/jsonld.Keyword['@index'] */ js.Any)
          ]
        ]
       with _JsonLdDocument {
    
    var `@context`: js.UndefOr[OrArray[Null | String | ContextDefinition]] = js.undefined
    
    var `@graph`: js.UndefOr[OrArray[NodeObject]] = js.undefined
    
    var `@id`: js.UndefOr[OrArray[String]] = js.undefined
    
    var `@included`: js.UndefOr[IncludedBlock] = js.undefined
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@nest`: js.UndefOr[OrArray[JsonObject]] = js.undefined
    
    var `@reverse`: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `@type`: js.UndefOr[OrArray[String]] = js.undefined
  }
  object NodeObject {
    
    inline def apply(): NodeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeObject]
    }
    
    extension [Self <: NodeObject](x: Self) {
      
      inline def `set@context`(value: OrArray[Null | String | ContextDefinition]): Self = StObject.set(x, "@context", value.asInstanceOf[js.Any])
      
      inline def `set@contextNull`: Self = StObject.set(x, "@context", null)
      
      inline def `set@contextUndefined`: Self = StObject.set(x, "@context", js.undefined)
      
      inline def `set@contextVarargs`(value: (Null | String | ContextDefinition)*): Self = StObject.set(x, "@context", js.Array(value*))
      
      inline def `set@graph`(value: OrArray[NodeObject]): Self = StObject.set(x, "@graph", value.asInstanceOf[js.Any])
      
      inline def `set@graphUndefined`: Self = StObject.set(x, "@graph", js.undefined)
      
      inline def `set@graphVarargs`(value: NodeObject*): Self = StObject.set(x, "@graph", js.Array(value*))
      
      inline def `set@id`(value: OrArray[String]): Self = StObject.set(x, "@id", value.asInstanceOf[js.Any])
      
      inline def `set@idUndefined`: Self = StObject.set(x, "@id", js.undefined)
      
      inline def `set@idVarargs`(value: String*): Self = StObject.set(x, "@id", js.Array(value*))
      
      inline def `set@included`(value: IncludedBlock): Self = StObject.set(x, "@included", value.asInstanceOf[js.Any])
      
      inline def `set@includedUndefined`: Self = StObject.set(x, "@included", js.undefined)
      
      inline def `set@includedVarargs`(value: NodeObject*): Self = StObject.set(x, "@included", js.Array(value*))
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@nest`(value: OrArray[JsonObject]): Self = StObject.set(x, "@nest", value.asInstanceOf[js.Any])
      
      inline def `set@nestUndefined`: Self = StObject.set(x, "@nest", js.undefined)
      
      inline def `set@nestVarargs`(value: JsonObject*): Self = StObject.set(x, "@nest", js.Array(value*))
      
      inline def `set@reverse`(value: StringDictionary[String]): Self = StObject.set(x, "@reverse", value.asInstanceOf[js.Any])
      
      inline def `set@reverseUndefined`: Self = StObject.set(x, "@reverse", js.undefined)
      
      inline def `set@type`(value: OrArray[String]): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def `set@typeUndefined`: Self = StObject.set(x, "@type", js.undefined)
      
      inline def `set@typeVarargs`(value: String*): Self = StObject.set(x, "@type", js.Array(value*))
    }
  }
  
  /*
    * Helper Types
    * (not for export)
    */
  type OrArray[T] = T | js.Array[T]
  
  trait SetObject extends StObject {
    
    var `@index`: js.UndefOr[String] = js.undefined
    
    var `@set`: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]
  }
  object SetObject {
    
    inline def apply(): SetObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@set")(null)
      __obj.asInstanceOf[SetObject]
    }
    
    extension [Self <: SetObject](x: Self) {
      
      inline def `set@index`(value: String): Self = StObject.set(x, "@index", value.asInstanceOf[js.Any])
      
      inline def `set@indexUndefined`: Self = StObject.set(x, "@index", js.undefined)
      
      inline def `set@set`(value: OrArray[Null | Boolean | Double | String | NodeObject | ValueObject]): Self = StObject.set(x, "@set", value.asInstanceOf[js.Any])
      
      inline def `set@setNull`: Self = StObject.set(x, "@set", null)
      
      inline def `set@setVarargs`(value: (Null | Boolean | Double | String | NodeObject | ValueObject)*): Self = StObject.set(x, "@set", js.Array(value*))
    }
  }
  
  type TypeMap = StringDictionary[String | NodeObject]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsonld.anon.valueKeywordvaluelanguage
    - typingsJapgolly.jsonld.anon.valueKeywordvaluetypeKeyw
    - typingsJapgolly.jsonld.anon.valueKeywordvalueJsonObje
  */
  trait ValueObject extends StObject
  object ValueObject {
    
    inline def valueKeywordvalueJsonObje(): typingsJapgolly.jsonld.anon.valueKeywordvalueJsonObje = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")("@json")
      __obj.updateDynamic("@value")(null)
      __obj.asInstanceOf[typingsJapgolly.jsonld.anon.valueKeywordvalueJsonObje]
    }
    
    inline def valueKeywordvaluelanguage(): typingsJapgolly.jsonld.anon.valueKeywordvaluelanguage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@value")(null)
      __obj.asInstanceOf[typingsJapgolly.jsonld.anon.valueKeywordvaluelanguage]
    }
    
    inline def valueKeywordvaluetypeKeyw(`@type`: String): typingsJapgolly.jsonld.anon.valueKeywordvaluetypeKeyw = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.updateDynamic("@value")(null)
      __obj.asInstanceOf[typingsJapgolly.jsonld.anon.valueKeywordvaluetypeKeyw]
    }
  }
  
  trait _JsonLdDocument extends StObject
  object _JsonLdDocument {
    
    inline def Context(): typingsJapgolly.jsonld.anon.Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.jsonld.anon.Context]
    }
    
    inline def NodeObject(): typingsJapgolly.jsonld.jsonldMod.NodeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.jsonld.jsonldMod.NodeObject]
    }
  }
}
