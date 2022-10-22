package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`amended-with`
import typingsJapgolly.fhir.fhirStrings.`appended-with`
import typingsJapgolly.fhir.fhirStrings.`cited-by`
import typingsJapgolly.fhir.fhirStrings.`comment-in`
import typingsJapgolly.fhir.fhirStrings.`comments-on`
import typingsJapgolly.fhir.fhirStrings.`composed-of`
import typingsJapgolly.fhir.fhirStrings.`contained-in`
import typingsJapgolly.fhir.fhirStrings.`correction-in`
import typingsJapgolly.fhir.fhirStrings.`depends-on`
import typingsJapgolly.fhir.fhirStrings.`derived-from`
import typingsJapgolly.fhir.fhirStrings.`part-of`
import typingsJapgolly.fhir.fhirStrings.`replaced-with`
import typingsJapgolly.fhir.fhirStrings.`retracted-by`
import typingsJapgolly.fhir.fhirStrings.`similar-to`
import typingsJapgolly.fhir.fhirStrings.`supported-with`
import typingsJapgolly.fhir.fhirStrings.`transformed-into`
import typingsJapgolly.fhir.fhirStrings.`transformed-with`
import typingsJapgolly.fhir.fhirStrings.amends
import typingsJapgolly.fhir.fhirStrings.appends
import typingsJapgolly.fhir.fhirStrings.citation_
import typingsJapgolly.fhir.fhirStrings.cites
import typingsJapgolly.fhir.fhirStrings.contains
import typingsJapgolly.fhir.fhirStrings.corrects
import typingsJapgolly.fhir.fhirStrings.documentation
import typingsJapgolly.fhir.fhirStrings.justification
import typingsJapgolly.fhir.fhirStrings.predecessor
import typingsJapgolly.fhir.fhirStrings.replaces
import typingsJapgolly.fhir.fhirStrings.retracts
import typingsJapgolly.fhir.fhirStrings.signs
import typingsJapgolly.fhir.fhirStrings.successor
import typingsJapgolly.fhir.fhirStrings.supports
import typingsJapgolly.fhir.fhirStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedArtifact
  extends StObject
     with Element {
  
  var _citation: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _label: js.UndefOr[Element] = js.undefined
  
  var _resource: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional structured information about citations should be captured as extensions.
    */
  var citation: js.UndefOr[String] = js.undefined
  
  /**
    * Provides additional classifiers of the related artifact.
    */
  var classifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A brief description of the document or knowledge resource being referenced, suitable for display to a consumer.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * The document being referenced, represented as an attachment. This is exclusive with the resource element.
    */
  var document: js.UndefOr[Attachment] = js.undefined
  
  /**
    * A short label that can be used to reference the citation from elsewhere in the containing artifact, such as a footnote index.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * If the type is predecessor, this is a reference to the succeeding knowledge resource. If the type is successor, this is a reference to the prior knowledge resource.
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * If both resource and resourceReference are present, they SHOULD be consistent and reference the same resource. Although relatedArtifact is intended to support references to definitional resources, there are cases where non-definitional resources can be definitional (such as Location where the kind is mode). Related artifacts SHOULD be used to reference definitional resources, and profiles SHOULD be used to make that explicit for particular use cases.
    */
  var resourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The presence of both sides of a relationship type (e.g. successor and predecessor) is required to support use cases where one side of a relationship is not represented in FHIR. However, this feature SHALL NOT be used to create bi-directional resource links in FHIR instances.
    */
  var `type`: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of` | `part-of` | amends | `amended-with` | appends | `appended-with` | cites | `cited-by` | `comments-on` | `comment-in` | contains | `contained-in` | corrects | `correction-in` | replaces | `replaced-with` | retracts | `retracted-by` | signs | `similar-to` | supports | `supported-with` | transforms | `transformed-into` | `transformed-with`
}
object RelatedArtifact {
  
  inline def apply(
    `type`: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of` | `part-of` | amends | `amended-with` | appends | `appended-with` | cites | `cited-by` | `comments-on` | `comment-in` | contains | `contained-in` | corrects | `correction-in` | replaces | `replaced-with` | retracts | `retracted-by` | signs | `similar-to` | supports | `supported-with` | transforms | `transformed-into` | `transformed-with`
  ): RelatedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedArtifact]
  }
  
  extension [Self <: RelatedArtifact](x: Self) {
    
    inline def setCitation(value: String): Self = StObject.set(x, "citation", value.asInstanceOf[js.Any])
    
    inline def setCitationUndefined: Self = StObject.set(x, "citation", js.undefined)
    
    inline def setClassifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
    
    inline def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
    
    inline def setClassifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "classifier", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setDocument(value: Attachment): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceReference(value: Reference): Self = StObject.set(x, "resourceReference", value.asInstanceOf[js.Any])
    
    inline def setResourceReferenceUndefined: Self = StObject.set(x, "resourceReference", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(
      value: documentation | justification | citation_ | predecessor | successor | `derived-from` | `depends-on` | `composed-of` | `part-of` | amends | `amended-with` | appends | `appended-with` | cites | `cited-by` | `comments-on` | `comment-in` | contains | `contained-in` | corrects | `correction-in` | replaces | `replaced-with` | retracts | `retracted-by` | signs | `similar-to` | supports | `supported-with` | transforms | `transformed-into` | `transformed-with`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_citation(value: Element): Self = StObject.set(x, "_citation", value.asInstanceOf[js.Any])
    
    inline def set_citationUndefined: Self = StObject.set(x, "_citation", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_label(value: Element): Self = StObject.set(x, "_label", value.asInstanceOf[js.Any])
    
    inline def set_labelUndefined: Self = StObject.set(x, "_label", js.undefined)
    
    inline def set_resource(value: Element): Self = StObject.set(x, "_resource", value.asInstanceOf[js.Any])
    
    inline def set_resourceUndefined: Self = StObject.set(x, "_resource", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
