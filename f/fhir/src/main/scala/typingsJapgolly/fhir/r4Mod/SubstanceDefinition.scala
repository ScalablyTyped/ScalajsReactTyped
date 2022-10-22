package typingsJapgolly.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * A high level categorization, e.g. polymer or nucleic acid, or food, chemical, biological, or a lower level such as the general types of polymer (linear or branch chain) or type of impurity (process related or contaminant).
    */
  var classification: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Codes associated with the substance.
    */
  var code: js.UndefOr[js.Array[SubstanceDefinitionCode]] = js.undefined
  
  /**
    * Textual description of the substance.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If the substance applies to only human or veterinary use.
    */
  var domain: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The quality standard, established benchmark, to which substance complies (e.g. USP/NF, Ph. Eur, JP, BP, Company Standard).
    */
  var grade: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Identifier by which this substance is known.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Supporting literature.
    */
  var informationSource: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A company that makes this substance.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Moiety, for structural modifications.
    */
  var moiety: js.UndefOr[js.Array[SubstanceDefinitionMoiety]] = js.undefined
  
  /**
    * The molecular weight or weight range (for proteins, polymers or nucleic acids).
    */
  var molecularWeight: js.UndefOr[js.Array[SubstanceDefinitionMolecularWeight]] = js.undefined
  
  /**
    * Names applicable to this substance.
    */
  var name: js.UndefOr[js.Array[SubstanceDefinitionName]] = js.undefined
  
  /**
    * Textual comment about the substance's catalogue or registry record.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * General specifications for this substance.
    */
  var property: js.UndefOr[js.Array[SubstanceDefinitionProperty]] = js.undefined
  
  /**
    * A link between this substance and another, with details of the relationship.
    */
  var relationship: js.UndefOr[js.Array[SubstanceDefinitionRelationship]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubstanceDefinition: typingsJapgolly.fhir.fhirStrings.SubstanceDefinition
  
  /**
    * Material or taxonomic/anatomical source for the substance.
    */
  var sourceMaterial: js.UndefOr[SubstanceDefinitionSourceMaterial] = js.undefined
  
  /**
    * Status of substance within the catalogue e.g. approved.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Structural information.
    */
  var structure: js.UndefOr[SubstanceDefinitionStructure] = js.undefined
  
  /**
    * A company that supplies this substance.
    */
  var supplier: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A business level identifier of the substance.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SubstanceDefinition {
  
  inline def apply(): SubstanceDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "SubstanceDefinition")
    __obj.asInstanceOf[SubstanceDefinition]
  }
  
  extension [Self <: SubstanceDefinition](x: Self) {
    
    inline def setClassification(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: CodeableConcept*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setCode(value: js.Array[SubstanceDefinitionCode]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: SubstanceDefinitionCode*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: CodeableConcept): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setGrade(value: js.Array[CodeableConcept]): Self = StObject.set(x, "grade", value.asInstanceOf[js.Any])
    
    inline def setGradeUndefined: Self = StObject.set(x, "grade", js.undefined)
    
    inline def setGradeVarargs(value: CodeableConcept*): Self = StObject.set(x, "grade", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformationSource(value: js.Array[Reference]): Self = StObject.set(x, "informationSource", value.asInstanceOf[js.Any])
    
    inline def setInformationSourceUndefined: Self = StObject.set(x, "informationSource", js.undefined)
    
    inline def setInformationSourceVarargs(value: Reference*): Self = StObject.set(x, "informationSource", js.Array(value*))
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setMoiety(value: js.Array[SubstanceDefinitionMoiety]): Self = StObject.set(x, "moiety", value.asInstanceOf[js.Any])
    
    inline def setMoietyUndefined: Self = StObject.set(x, "moiety", js.undefined)
    
    inline def setMoietyVarargs(value: SubstanceDefinitionMoiety*): Self = StObject.set(x, "moiety", js.Array(value*))
    
    inline def setMolecularWeight(value: js.Array[SubstanceDefinitionMolecularWeight]): Self = StObject.set(x, "molecularWeight", value.asInstanceOf[js.Any])
    
    inline def setMolecularWeightUndefined: Self = StObject.set(x, "molecularWeight", js.undefined)
    
    inline def setMolecularWeightVarargs(value: SubstanceDefinitionMolecularWeight*): Self = StObject.set(x, "molecularWeight", js.Array(value*))
    
    inline def setName(value: js.Array[SubstanceDefinitionName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: SubstanceDefinitionName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setProperty(value: js.Array[SubstanceDefinitionProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: SubstanceDefinitionProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setRelationship(value: js.Array[SubstanceDefinitionRelationship]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setRelationshipVarargs(value: SubstanceDefinitionRelationship*): Self = StObject.set(x, "relationship", js.Array(value*))
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.SubstanceDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterial(value: SubstanceDefinitionSourceMaterial): Self = StObject.set(x, "sourceMaterial", value.asInstanceOf[js.Any])
    
    inline def setSourceMaterialUndefined: Self = StObject.set(x, "sourceMaterial", js.undefined)
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStructure(value: SubstanceDefinitionStructure): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setSupplier(value: js.Array[Reference]): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setSupplierVarargs(value: Reference*): Self = StObject.set(x, "supplier", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
