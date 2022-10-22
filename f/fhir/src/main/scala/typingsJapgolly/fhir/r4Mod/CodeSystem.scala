package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.`classified-with`
import typingsJapgolly.fhir.fhirStrings.`grouped-by`
import typingsJapgolly.fhir.fhirStrings.`is-a`
import typingsJapgolly.fhir.fhirStrings.`not-present`
import typingsJapgolly.fhir.fhirStrings.`part-of`
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.complete
import typingsJapgolly.fhir.fhirStrings.draft
import typingsJapgolly.fhir.fhirStrings.example
import typingsJapgolly.fhir.fhirStrings.fragment
import typingsJapgolly.fhir.fhirStrings.retired
import typingsJapgolly.fhir.fhirStrings.supplement
import typingsJapgolly.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSystem
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _caseSensitive: js.UndefOr[Element] = js.undefined
  
  var _compositional: js.UndefOr[Element] = js.undefined
  
  var _content: js.UndefOr[Element] = js.undefined
  
  var _copyright: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _experimental: js.UndefOr[Element] = js.undefined
  
  var _hierarchyMeaning: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _publisher: js.UndefOr[Element] = js.undefined
  
  var _purpose: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _supplements: js.UndefOr[Element] = js.undefined
  
  var _title: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  var _versionNeeded: js.UndefOr[Element] = js.undefined
  
  /**
    * If this value is missing, then it is not specified whether a code system is case sensitive or not. When the rule is not known, Postel's law should be followed: produce codes with the correct case, and accept codes in any case. This element is primarily provided to support validation software.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Note that the code system resource does not define what the compositional grammar is, only whether or not there is one.
    */
  var compositional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If this is empty, it means that the code system resource does not represent the content of the code system.
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.undefined
  
  /**
    * May be a web site, an email address, a telephone number, etc.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
    */
  var content: `not-present` | example | fragment | complete | supplement
  
  /**
    * ... Sometimes, the copyright differs between the code system and the codes that are included. The copyright statement should clearly differentiate between these when required.
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * The count of concepts defined in this resource cannot be more than this value but may be less for several reasons - see the content element.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Note that this is not the same as the resource last-modified-date, since the resource may be a secondary representation of the code system. Additional specific dates may be added as extensions or be found by consulting Provenances associated with past versions of the resource.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * This description can be used to capture details such as why the code system was built, comments about misuse, instructions for clinical use and interpretation, literature references, examples from the paper world, etc. It is not a rendering of the code system as conveyed in the 'text' field of the resource itself. This item SHOULD be populated unless the information is available from context (e.g. the language of the code system is presumed to be the predominant language in the place the code system was created).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering of code systems that are appropriate for use versus not.
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Note that filters defined in code systems usually require custom code on the part of any terminology engine that will make them available for use in value set filters. For this reason, they are generally only seen in high value published terminologies.
    */
  var filter: js.UndefOr[js.Array[CodeSystemFilter]] = js.undefined
  
  /**
    * Note that other representations might have a different hierarchy or none at all, and represent the information using properties.
    */
  var hierarchyMeaning: js.UndefOr[`grouped-by` | `is-a` | `part-of` | `classified-with`] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data type, and can then identify this code system outside of FHIR, where it is not possible to use the logical URI.  Note that HL7 defines at least three identifiers for many of its code systems - the FHIR canonical URL, the OID and the V2 Table 0396 mnemonic code.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * It may be possible for the code system to be used in jurisdictions other than those for which it was originally designed or intended.
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A property defines an additional slot through which additional information can be provided about a concept.
    */
  var property: js.UndefOr[js.Array[CodeSystemProperty]] = js.undefined
  
  /**
    * Usually an organization but may be an individual. The publisher (or steward) of the code system is the organization or individual primarily responsible for the maintenance and upkeep of the code system. This is not necessarily the same individual or organization that developed and initially authored the content. The publisher is the primary point of contact for questions or issues with the code system. This item SHOULD be populated unless the information is available from context.
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * This element does not describe the usage of the code system. Instead, it provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it is.  This may be used to point to source materials or specifications that drove the structure of this code system.
    */
  var purpose: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CodeSystem: typingsJapgolly.fhir.fhirStrings.CodeSystem
  
  /**
    * Allows filtering of code systems that are appropriate for use versus not.
    */
  var status: draft | active | retired | unknown
  
  /**
    * The most common use of a code system supplement is to add additional language support.
    */
  var supplements: js.UndefOr[String] = js.undefined
  
  /**
    * This name does not need to be machine-processing friendly and may contain punctuation, white-space, etc.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred.  Multiple instances may share the same URL if they have a distinct version.
    * The determination of when to create a new version of a resource (same url, new version) vs. defining a new artifact is up to the author.  Considerations for making this decision are found in [Technical and Business Versions](resource.html#versions).
    * In some cases, the resource can no longer be found at the stated url, but the url itself cannot change. Implementations can use the [meta.source](resource.html#meta) element to indicate where the current master source of the resource can be found.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * When multiple useContexts are specified, there is no expectation that all or any of the contexts apply.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * The definition of the value set SHALL include all codes from this code system and only codes from this code system, and it SHALL be immutable.
    */
  var valueSet: js.UndefOr[String] = js.undefined
  
  /**
    * There may be different code system instances that have the same identifier but different versions.  The version can be appended to the url in a reference to allow a reference to a particular business version of the code system with the format [url]|[version].
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * Best practice is that code systems do not redefine concepts, or that if concepts are redefined, a new code system definition is created. But this is not always possible, so some code systems may be defined as 'versionNeeded'.
    * Most code systems occasionally refine the displays defined for concepts between versions. Contexts in which the concept display values are validated may require that the version be specified for some code systems irrespective of the value of this property.
    */
  var versionNeeded: js.UndefOr[Boolean] = js.undefined
}
object CodeSystem {
  
  inline def apply(
    content: `not-present` | example | fragment | complete | supplement,
    status: draft | active | retired | unknown
  ): CodeSystem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], resourceType = "CodeSystem", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystem]
  }
  
  extension [Self <: CodeSystem](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setCompositional(value: Boolean): Self = StObject.set(x, "compositional", value.asInstanceOf[js.Any])
    
    inline def setCompositionalUndefined: Self = StObject.set(x, "compositional", js.undefined)
    
    inline def setConcept(value: js.Array[CodeSystemConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: CodeSystemConcept*): Self = StObject.set(x, "concept", js.Array(value*))
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setContent(value: `not-present` | example | fragment | complete | supplement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    inline def setFilter(value: js.Array[CodeSystemFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: CodeSystemFilter*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setHierarchyMeaning(value: `grouped-by` | `is-a` | `part-of` | `classified-with`): Self = StObject.set(x, "hierarchyMeaning", value.asInstanceOf[js.Any])
    
    inline def setHierarchyMeaningUndefined: Self = StObject.set(x, "hierarchyMeaning", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    inline def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    inline def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperty(value: js.Array[CodeSystemProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: CodeSystemProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.CodeSystem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSupplements(value: String): Self = StObject.set(x, "supplements", value.asInstanceOf[js.Any])
    
    inline def setSupplementsUndefined: Self = StObject.set(x, "supplements", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNeeded(value: Boolean): Self = StObject.set(x, "versionNeeded", value.asInstanceOf[js.Any])
    
    inline def setVersionNeededUndefined: Self = StObject.set(x, "versionNeeded", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_caseSensitive(value: Element): Self = StObject.set(x, "_caseSensitive", value.asInstanceOf[js.Any])
    
    inline def set_caseSensitiveUndefined: Self = StObject.set(x, "_caseSensitive", js.undefined)
    
    inline def set_compositional(value: Element): Self = StObject.set(x, "_compositional", value.asInstanceOf[js.Any])
    
    inline def set_compositionalUndefined: Self = StObject.set(x, "_compositional", js.undefined)
    
    inline def set_content(value: Element): Self = StObject.set(x, "_content", value.asInstanceOf[js.Any])
    
    inline def set_contentUndefined: Self = StObject.set(x, "_content", js.undefined)
    
    inline def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    inline def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    inline def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    inline def set_hierarchyMeaning(value: Element): Self = StObject.set(x, "_hierarchyMeaning", value.asInstanceOf[js.Any])
    
    inline def set_hierarchyMeaningUndefined: Self = StObject.set(x, "_hierarchyMeaning", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    inline def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    inline def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    inline def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_supplements(value: Element): Self = StObject.set(x, "_supplements", value.asInstanceOf[js.Any])
    
    inline def set_supplementsUndefined: Self = StObject.set(x, "_supplements", js.undefined)
    
    inline def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    inline def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionNeeded(value: Element): Self = StObject.set(x, "_versionNeeded", value.asInstanceOf[js.Any])
    
    inline def set_versionNeededUndefined: Self = StObject.set(x, "_versionNeeded", js.undefined)
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
