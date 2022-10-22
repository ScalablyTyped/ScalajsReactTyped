package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.`not-in`
import typingsJapgolly.fhir.fhirStrings.`type`
import typingsJapgolly.fhir.fhirStrings.above
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.ap
import typingsJapgolly.fhir.fhirStrings.below
import typingsJapgolly.fhir.fhirStrings.composite
import typingsJapgolly.fhir.fhirStrings.contains
import typingsJapgolly.fhir.fhirStrings.date
import typingsJapgolly.fhir.fhirStrings.distance
import typingsJapgolly.fhir.fhirStrings.draft
import typingsJapgolly.fhir.fhirStrings.eb
import typingsJapgolly.fhir.fhirStrings.eq
import typingsJapgolly.fhir.fhirStrings.exact
import typingsJapgolly.fhir.fhirStrings.ge
import typingsJapgolly.fhir.fhirStrings.gt
import typingsJapgolly.fhir.fhirStrings.in
import typingsJapgolly.fhir.fhirStrings.le
import typingsJapgolly.fhir.fhirStrings.lt
import typingsJapgolly.fhir.fhirStrings.missing
import typingsJapgolly.fhir.fhirStrings.ne
import typingsJapgolly.fhir.fhirStrings.nearby
import typingsJapgolly.fhir.fhirStrings.normal
import typingsJapgolly.fhir.fhirStrings.not
import typingsJapgolly.fhir.fhirStrings.number
import typingsJapgolly.fhir.fhirStrings.other
import typingsJapgolly.fhir.fhirStrings.phonetic
import typingsJapgolly.fhir.fhirStrings.quantity_
import typingsJapgolly.fhir.fhirStrings.reference
import typingsJapgolly.fhir.fhirStrings.retired
import typingsJapgolly.fhir.fhirStrings.sa
import typingsJapgolly.fhir.fhirStrings.string
import typingsJapgolly.fhir.fhirStrings.text
import typingsJapgolly.fhir.fhirStrings.token
import typingsJapgolly.fhir.fhirStrings.unknown
import typingsJapgolly.fhir.fhirStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParameter
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _base: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _chain: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _comparator: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _derivedFrom: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _expression: js.UndefOr[Element] = js.undefined
  
  var _modifier: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _target: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  var _xpath: js.UndefOr[Element] = js.undefined
  
  var _xpathUsage: js.UndefOr[Element] = js.undefined
  
  /**
    * A search parameter must always have at least one type. When search parameters have more than one resource, they can be used against any of the listed resource types, or in a cross-type search (see [Cross Resource Search](http.html#xres-search)).
    */
  var base: js.Array[String]
  
  /**
    * Systems are not required to list all the chain names they support, but if they don't list them, clients may not know to use them.
    */
  var chain: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For maximum compatibility, use only lowercase ASCII characters.
    */
  var code: String
  
  /**
    * If no comparators are listed, clients should not expect servers to support any comparators.
    */
  var comparator: js.UndefOr[js.Array[eq | ne | gt | lt | ge | le | sa | eb | ap]] = js.undefined
  
  /**
    * Used to define the parts of a composite search parameter.
    */
  var component: js.UndefOr[js.Array[SearchParameterComponent]] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the search parameter. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The intent of this is that a server can designate that it provides support for a search parameter defined in the specification itself (e.g.  [`value-quantity`](http://hl7.org/fhir/SearchParameter/Observation-value-quantity), but detail how it is supported by the server.
    */
  var derivedFrom: js.UndefOr[String] = js.undefined
  
  /**
    * This description can be used to capture details such as why the search parameter was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the search parameter as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the profile is presumed to be the predominant language in the place the profile was created).
    */
  var description: String
  
  /**
    * Allows filtering of search parameter that are appropriate for use vs. not. This is labeled as "Is Modifier" because applications should not use an experimental search parameter in production.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Note that the elements returned by the expression are sometimes complex elements where logic is required to determine quite how to handle them; e.g. CodeableConcepts may contain text and/or multiple codings, where the codings themselves contain a code and a system. For composite search parameters, the outcome of the expression must a collection of base elements from which the composites are derived.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * It may be possible for the search parameter to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A modifier supported for the search parameter.
    */
  var modifier: js.UndefOr[
    js.Array[missing | exact | contains | not | text | in | `not-in` | below | above | `type`]
  ] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alpha-numeric type name to ensure that it is computable friendly.
    */
  var name: String
  
  /**
    * Usually an organization, but may be an individual. The publisher (or steward) of the search parameter is the organization or individual primarily responsible for the maintenance and upkeep of the search parameter. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the search parameter. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * This element does not describe the usage of the search parameter Instead  it provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it is.  This may be used to point to source materials or specifications that drove the structure of this search parameter.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SearchParameter: typingsJapgolly.fhir.fhirStrings.SearchParameter
  
  /**
    * Allows filtering of search parameters that are appropriate for use vs. not.
    * This is labeled as "Is Modifier" because applications should not use a retired search parameter without due consideration.
    */
  var status: draft | active | retired | unknown
  
  /**
    * Types of resource (if a resource is referenced).
    */
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of value a search parameter refers to, and how the content is interpreted.
    */
  var `type`: number | date | string | token | reference | composite | quantity_ | uri
  
  /**
    * Can be a urn:uuid: or a urn:oid:, but real http: addresses are preferred.  Multiple instances may share the same url if they have a distinct version.
    */
  var url: String
  
  /**
    * When multiple useContexts are specified, there is no expectation whether all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * There may be different search parameter instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a refrence to a particular business version of the search parameter with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * Note that the elements returned by the XPath are sometimes complex elements where logic is required to determine quite how to handle them; e.g. CodeableConcepts may contain text and/or multiple codings, where the codings themselves contain a code and a system.
    */
  var xpath: js.UndefOr[String] = js.undefined
  
  /**
    * How the search parameter relates to the set of elements returned by evaluating the xpath query.
    */
  var xpathUsage: js.UndefOr[normal | phonetic | nearby | distance | other] = js.undefined
}
object SearchParameter {
  
  inline def apply(
    base: js.Array[String],
    code: String,
    description: String,
    name: String,
    status: draft | active | retired | unknown,
    `type`: number | date | string | token | reference | composite | quantity_ | uri,
    url: String
  ): SearchParameter = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = "SearchParameter", status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParameter]
  }
  
  extension [Self <: SearchParameter](x: Self) {
    
    inline def setBase(value: js.Array[String]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseVarargs(value: String*): Self = StObject.set(x, "base", js.Array(value*))
    
    inline def setChain(value: js.Array[String]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setChainVarargs(value: String*): Self = StObject.set(x, "chain", js.Array(value*))
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComparator(value: js.Array[eq | ne | gt | lt | ge | le | sa | eb | ap]): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setComparatorVarargs(value: (eq | ne | gt | lt | ge | le | sa | eb | ap)*): Self = StObject.set(x, "comparator", js.Array(value*))
    
    inline def setComponent(value: js.Array[SearchParameterComponent]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setComponentVarargs(value: SearchParameterComponent*): Self = StObject.set(x, "component", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDerivedFrom(value: String): Self = StObject.set(x, "derivedFrom", value.asInstanceOf[js.Any])
    
    inline def setDerivedFromUndefined: Self = StObject.set(x, "derivedFrom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setModifier(value: js.Array[missing | exact | contains | not | text | in | `not-in` | below | above | `type`]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: (missing | exact | contains | not | text | in | `not-in` | below | above | `type`)*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.SearchParameter): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setType(value: number | date | string | token | reference | composite | quantity_ | uri): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
    
    inline def setXpathUndefined: Self = StObject.set(x, "xpath", js.undefined)
    
    inline def setXpathUsage(value: normal | phonetic | nearby | distance | other): Self = StObject.set(x, "xpathUsage", value.asInstanceOf[js.Any])
    
    inline def setXpathUsageUndefined: Self = StObject.set(x, "xpathUsage", js.undefined)
    
    inline def set_base(value: js.Array[Element]): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    inline def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
    
    inline def set_baseVarargs(value: Element*): Self = StObject.set(x, "_base", js.Array(value*))
    
    inline def set_chain(value: js.Array[Element]): Self = StObject.set(x, "_chain", value.asInstanceOf[js.Any])
    
    inline def set_chainUndefined: Self = StObject.set(x, "_chain", js.undefined)
    
    inline def set_chainVarargs(value: Element*): Self = StObject.set(x, "_chain", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_comparator(value: js.Array[Element]): Self = StObject.set(x, "_comparator", value.asInstanceOf[js.Any])
    
    inline def set_comparatorUndefined: Self = StObject.set(x, "_comparator", js.undefined)
    
    inline def set_comparatorVarargs(value: Element*): Self = StObject.set(x, "_comparator", js.Array(value*))
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_derivedFrom(value: Element): Self = StObject.set(x, "_derivedFrom", value.asInstanceOf[js.Any])
    
    inline def set_derivedFromUndefined: Self = StObject.set(x, "_derivedFrom", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_expression(value: Element): Self = StObject.set(x, "_expression", value.asInstanceOf[js.Any])
    
    inline def set_expressionUndefined: Self = StObject.set(x, "_expression", js.undefined)
    
    inline def set_modifier(value: js.Array[Element]): Self = StObject.set(x, "_modifier", value.asInstanceOf[js.Any])
    
    inline def set_modifierUndefined: Self = StObject.set(x, "_modifier", js.undefined)
    
    inline def set_modifierVarargs(value: Element*): Self = StObject.set(x, "_modifier", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_target(value: js.Array[Element]): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
    
    inline def set_targetVarargs(value: Element*): Self = StObject.set(x, "_target", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
    
    inline def set_xpath(value: Element): Self = StObject.set(x, "_xpath", value.asInstanceOf[js.Any])
    
    inline def set_xpathUndefined: Self = StObject.set(x, "_xpath", js.undefined)
    
    inline def set_xpathUsage(value: Element): Self = StObject.set(x, "_xpathUsage", value.asInstanceOf[js.Any])
    
    inline def set_xpathUsageUndefined: Self = StObject.set(x, "_xpathUsage", js.undefined)
  }
}
