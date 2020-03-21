package typingsJapgolly.fhirKitClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Account
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ActivityDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.AdverseEvent
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.AllergyIntolerance
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Appointment
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.AppointmentResponse
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.AuditEvent
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Basic
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Binary
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.BodySite
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Bundle
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.CapabilityStatement
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.CarePlan
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.CareTeam
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ChargeItem
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Claim
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ClaimResponse
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ClinicalImpression
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.CodeSystem
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Communication
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.CommunicationRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.CompartmentDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Composition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ConceptMap
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Condition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Consent
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Contract
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Coverage
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DataElement
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DetectedIssue
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Device
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceComponent
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceMetric
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceUseStatement
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DiagnosticReport
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentManifest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentReference
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.EligibilityRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.EligibilityResponse
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Encounter
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Endpoint
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentResponse
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.EpisodeOfCare
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ExpansionProfile
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ExplanationOfBenefit
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.FamilyMemberHistory
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Flag
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Goal
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.GraphDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Group
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.GuidanceResponse
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.HealthcareService
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImagingManifest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImagingStudy
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Immunization
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImplementationGuide
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Library
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Linkage
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.List
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Location
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Measure
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.MeasureReport
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Media
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Medication
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationAdministration
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationDispense
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationStatement
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.MessageDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.MessageHeader
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.NamingSystem
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.NutritionOrder
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Observation
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.OperationDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.OperationOutcome
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Organization
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Parameters
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Patient
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.PaymentNotice
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.PaymentReconciliation
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Person
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.PlanDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Practitioner
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.PractitionerRole
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Procedure
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ProcedureRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ProcessRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ProcessResponse
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Provenance
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Questionnaire
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ReferralRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.RelatedPerson
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.RequestGroup
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ResearchStudy
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ResearchSubject
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.RiskAssessment
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Schedule
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.SearchParameter
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Sequence
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ServiceDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Slot
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Specimen
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.StructureDefinition
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.StructureMap
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Subscription
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Substance
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.SupplyDelivery
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.SupplyRequest
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.Task
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.TestReport
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.TestScript
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.ValueSet
  - typingsJapgolly.fhirKitClient.fhirKitClientStrings.VisionPrescription
*/
trait KnownResourceType extends js.Object

object KnownResourceType {
  @scala.inline
  def Account: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Account = this.cast("Account")
  @scala.inline
  def ActivityDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ActivityDefinition = this.cast("ActivityDefinition")
  @scala.inline
  def AdverseEvent: typingsJapgolly.fhirKitClient.fhirKitClientStrings.AdverseEvent = this.cast("AdverseEvent")
  @scala.inline
  def AllergyIntolerance: typingsJapgolly.fhirKitClient.fhirKitClientStrings.AllergyIntolerance = this.cast("AllergyIntolerance")
  @scala.inline
  def Appointment: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Appointment = this.cast("Appointment")
  @scala.inline
  def AppointmentResponse: typingsJapgolly.fhirKitClient.fhirKitClientStrings.AppointmentResponse = this.cast("AppointmentResponse")
  @scala.inline
  def AuditEvent: typingsJapgolly.fhirKitClient.fhirKitClientStrings.AuditEvent = this.cast("AuditEvent")
  @scala.inline
  def Basic: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Basic = this.cast("Basic")
  @scala.inline
  def Binary: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Binary = this.cast("Binary")
  @scala.inline
  def BodySite: typingsJapgolly.fhirKitClient.fhirKitClientStrings.BodySite = this.cast("BodySite")
  @scala.inline
  def Bundle: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Bundle = this.cast("Bundle")
  @scala.inline
  def CapabilityStatement: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CapabilityStatement = this.cast("CapabilityStatement")
  @scala.inline
  def CarePlan: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CarePlan = this.cast("CarePlan")
  @scala.inline
  def CareTeam: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CareTeam = this.cast("CareTeam")
  @scala.inline
  def ChargeItem: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ChargeItem = this.cast("ChargeItem")
  @scala.inline
  def Claim: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Claim = this.cast("Claim")
  @scala.inline
  def ClaimResponse: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ClaimResponse = this.cast("ClaimResponse")
  @scala.inline
  def ClinicalImpression: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ClinicalImpression = this.cast("ClinicalImpression")
  @scala.inline
  def CodeSystem: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CodeSystem = this.cast("CodeSystem")
  @scala.inline
  def Communication: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Communication = this.cast("Communication")
  @scala.inline
  def CommunicationRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CommunicationRequest = this.cast("CommunicationRequest")
  @scala.inline
  def CompartmentDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.CompartmentDefinition = this.cast("CompartmentDefinition")
  @scala.inline
  def Composition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Composition = this.cast("Composition")
  @scala.inline
  def ConceptMap: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ConceptMap = this.cast("ConceptMap")
  @scala.inline
  def Condition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Condition = this.cast("Condition")
  @scala.inline
  def Consent: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Consent = this.cast("Consent")
  @scala.inline
  def Contract: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Contract = this.cast("Contract")
  @scala.inline
  def Coverage: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Coverage = this.cast("Coverage")
  @scala.inline
  def DataElement: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DataElement = this.cast("DataElement")
  @scala.inline
  def DetectedIssue: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DetectedIssue = this.cast("DetectedIssue")
  @scala.inline
  def Device: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Device = this.cast("Device")
  @scala.inline
  def DeviceComponent: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceComponent = this.cast("DeviceComponent")
  @scala.inline
  def DeviceMetric: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceMetric = this.cast("DeviceMetric")
  @scala.inline
  def DeviceRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceRequest = this.cast("DeviceRequest")
  @scala.inline
  def DeviceUseStatement: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DeviceUseStatement = this.cast("DeviceUseStatement")
  @scala.inline
  def DiagnosticReport: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DiagnosticReport = this.cast("DiagnosticReport")
  @scala.inline
  def DocumentManifest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentManifest = this.cast("DocumentManifest")
  @scala.inline
  def DocumentReference: typingsJapgolly.fhirKitClient.fhirKitClientStrings.DocumentReference = this.cast("DocumentReference")
  @scala.inline
  def EligibilityRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EligibilityRequest = this.cast("EligibilityRequest")
  @scala.inline
  def EligibilityResponse: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EligibilityResponse = this.cast("EligibilityResponse")
  @scala.inline
  def Encounter: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Encounter = this.cast("Encounter")
  @scala.inline
  def Endpoint: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Endpoint = this.cast("Endpoint")
  @scala.inline
  def EnrollmentRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentRequest = this.cast("EnrollmentRequest")
  @scala.inline
  def EnrollmentResponse: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EnrollmentResponse = this.cast("EnrollmentResponse")
  @scala.inline
  def EpisodeOfCare: typingsJapgolly.fhirKitClient.fhirKitClientStrings.EpisodeOfCare = this.cast("EpisodeOfCare")
  @scala.inline
  def ExpansionProfile: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ExpansionProfile = this.cast("ExpansionProfile")
  @scala.inline
  def ExplanationOfBenefit: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ExplanationOfBenefit = this.cast("ExplanationOfBenefit")
  @scala.inline
  def FamilyMemberHistory: typingsJapgolly.fhirKitClient.fhirKitClientStrings.FamilyMemberHistory = this.cast("FamilyMemberHistory")
  @scala.inline
  def Flag: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Flag = this.cast("Flag")
  @scala.inline
  def Goal: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Goal = this.cast("Goal")
  @scala.inline
  def GraphDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.GraphDefinition = this.cast("GraphDefinition")
  @scala.inline
  def Group: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Group = this.cast("Group")
  @scala.inline
  def GuidanceResponse: typingsJapgolly.fhirKitClient.fhirKitClientStrings.GuidanceResponse = this.cast("GuidanceResponse")
  @scala.inline
  def HealthcareService: typingsJapgolly.fhirKitClient.fhirKitClientStrings.HealthcareService = this.cast("HealthcareService")
  @scala.inline
  def ImagingManifest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImagingManifest = this.cast("ImagingManifest")
  @scala.inline
  def ImagingStudy: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImagingStudy = this.cast("ImagingStudy")
  @scala.inline
  def Immunization: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Immunization = this.cast("Immunization")
  @scala.inline
  def ImmunizationRecommendation: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImmunizationRecommendation = this.cast("ImmunizationRecommendation")
  @scala.inline
  def ImplementationGuide: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ImplementationGuide = this.cast("ImplementationGuide")
  @scala.inline
  def Library: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Library = this.cast("Library")
  @scala.inline
  def Linkage: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Linkage = this.cast("Linkage")
  @scala.inline
  def List: typingsJapgolly.fhirKitClient.fhirKitClientStrings.List = this.cast("List")
  @scala.inline
  def Location: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Location = this.cast("Location")
  @scala.inline
  def Measure: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Measure = this.cast("Measure")
  @scala.inline
  def MeasureReport: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MeasureReport = this.cast("MeasureReport")
  @scala.inline
  def Media: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Media = this.cast("Media")
  @scala.inline
  def Medication: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Medication = this.cast("Medication")
  @scala.inline
  def MedicationAdministration: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationAdministration = this.cast("MedicationAdministration")
  @scala.inline
  def MedicationDispense: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationDispense = this.cast("MedicationDispense")
  @scala.inline
  def MedicationRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationRequest = this.cast("MedicationRequest")
  @scala.inline
  def MedicationStatement: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MedicationStatement = this.cast("MedicationStatement")
  @scala.inline
  def MessageDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MessageDefinition = this.cast("MessageDefinition")
  @scala.inline
  def MessageHeader: typingsJapgolly.fhirKitClient.fhirKitClientStrings.MessageHeader = this.cast("MessageHeader")
  @scala.inline
  def NamingSystem: typingsJapgolly.fhirKitClient.fhirKitClientStrings.NamingSystem = this.cast("NamingSystem")
  @scala.inline
  def NutritionOrder: typingsJapgolly.fhirKitClient.fhirKitClientStrings.NutritionOrder = this.cast("NutritionOrder")
  @scala.inline
  def Observation: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Observation = this.cast("Observation")
  @scala.inline
  def OperationDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.OperationDefinition = this.cast("OperationDefinition")
  @scala.inline
  def OperationOutcome: typingsJapgolly.fhirKitClient.fhirKitClientStrings.OperationOutcome = this.cast("OperationOutcome")
  @scala.inline
  def Organization: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Organization = this.cast("Organization")
  @scala.inline
  def Parameters: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Parameters = this.cast("Parameters")
  @scala.inline
  def Patient: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Patient = this.cast("Patient")
  @scala.inline
  def PaymentNotice: typingsJapgolly.fhirKitClient.fhirKitClientStrings.PaymentNotice = this.cast("PaymentNotice")
  @scala.inline
  def PaymentReconciliation: typingsJapgolly.fhirKitClient.fhirKitClientStrings.PaymentReconciliation = this.cast("PaymentReconciliation")
  @scala.inline
  def Person: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Person = this.cast("Person")
  @scala.inline
  def PlanDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.PlanDefinition = this.cast("PlanDefinition")
  @scala.inline
  def Practitioner: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Practitioner = this.cast("Practitioner")
  @scala.inline
  def PractitionerRole: typingsJapgolly.fhirKitClient.fhirKitClientStrings.PractitionerRole = this.cast("PractitionerRole")
  @scala.inline
  def Procedure: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Procedure = this.cast("Procedure")
  @scala.inline
  def ProcedureRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ProcedureRequest = this.cast("ProcedureRequest")
  @scala.inline
  def ProcessRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ProcessRequest = this.cast("ProcessRequest")
  @scala.inline
  def ProcessResponse: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ProcessResponse = this.cast("ProcessResponse")
  @scala.inline
  def Provenance: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Provenance = this.cast("Provenance")
  @scala.inline
  def Questionnaire: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Questionnaire = this.cast("Questionnaire")
  @scala.inline
  def QuestionnaireResponse: typingsJapgolly.fhirKitClient.fhirKitClientStrings.QuestionnaireResponse = this.cast("QuestionnaireResponse")
  @scala.inline
  def ReferralRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ReferralRequest = this.cast("ReferralRequest")
  @scala.inline
  def RelatedPerson: typingsJapgolly.fhirKitClient.fhirKitClientStrings.RelatedPerson = this.cast("RelatedPerson")
  @scala.inline
  def RequestGroup: typingsJapgolly.fhirKitClient.fhirKitClientStrings.RequestGroup = this.cast("RequestGroup")
  @scala.inline
  def ResearchStudy: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ResearchStudy = this.cast("ResearchStudy")
  @scala.inline
  def ResearchSubject: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ResearchSubject = this.cast("ResearchSubject")
  @scala.inline
  def RiskAssessment: typingsJapgolly.fhirKitClient.fhirKitClientStrings.RiskAssessment = this.cast("RiskAssessment")
  @scala.inline
  def Schedule: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Schedule = this.cast("Schedule")
  @scala.inline
  def SearchParameter: typingsJapgolly.fhirKitClient.fhirKitClientStrings.SearchParameter = this.cast("SearchParameter")
  @scala.inline
  def Sequence: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Sequence = this.cast("Sequence")
  @scala.inline
  def ServiceDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ServiceDefinition = this.cast("ServiceDefinition")
  @scala.inline
  def Slot: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Slot = this.cast("Slot")
  @scala.inline
  def Specimen: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Specimen = this.cast("Specimen")
  @scala.inline
  def StructureDefinition: typingsJapgolly.fhirKitClient.fhirKitClientStrings.StructureDefinition = this.cast("StructureDefinition")
  @scala.inline
  def StructureMap: typingsJapgolly.fhirKitClient.fhirKitClientStrings.StructureMap = this.cast("StructureMap")
  @scala.inline
  def Subscription: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Subscription = this.cast("Subscription")
  @scala.inline
  def Substance: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Substance = this.cast("Substance")
  @scala.inline
  def SupplyDelivery: typingsJapgolly.fhirKitClient.fhirKitClientStrings.SupplyDelivery = this.cast("SupplyDelivery")
  @scala.inline
  def SupplyRequest: typingsJapgolly.fhirKitClient.fhirKitClientStrings.SupplyRequest = this.cast("SupplyRequest")
  @scala.inline
  def Task: typingsJapgolly.fhirKitClient.fhirKitClientStrings.Task = this.cast("Task")
  @scala.inline
  def TestReport: typingsJapgolly.fhirKitClient.fhirKitClientStrings.TestReport = this.cast("TestReport")
  @scala.inline
  def TestScript: typingsJapgolly.fhirKitClient.fhirKitClientStrings.TestScript = this.cast("TestScript")
  @scala.inline
  def ValueSet: typingsJapgolly.fhirKitClient.fhirKitClientStrings.ValueSet = this.cast("ValueSet")
  @scala.inline
  def VisionPrescription: typingsJapgolly.fhirKitClient.fhirKitClientStrings.VisionPrescription = this.cast("VisionPrescription")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

