package typingsJapgolly.fhirKitClient.mod

import typingsJapgolly.fhir.fhir.Account
import typingsJapgolly.fhir.fhir.ActivityDefinition
import typingsJapgolly.fhir.fhir.AdverseEvent
import typingsJapgolly.fhir.fhir.AllergyIntolerance
import typingsJapgolly.fhir.fhir.Appointment
import typingsJapgolly.fhir.fhir.AppointmentResponse
import typingsJapgolly.fhir.fhir.AuditEvent
import typingsJapgolly.fhir.fhir.Basic
import typingsJapgolly.fhir.fhir.Binary
import typingsJapgolly.fhir.fhir.BodySite
import typingsJapgolly.fhir.fhir.Bundle
import typingsJapgolly.fhir.fhir.CapabilityStatement
import typingsJapgolly.fhir.fhir.CarePlan
import typingsJapgolly.fhir.fhir.CareTeam
import typingsJapgolly.fhir.fhir.ChargeItem
import typingsJapgolly.fhir.fhir.Claim
import typingsJapgolly.fhir.fhir.ClaimResponse
import typingsJapgolly.fhir.fhir.ClinicalImpression
import typingsJapgolly.fhir.fhir.CodeSystem
import typingsJapgolly.fhir.fhir.Communication
import typingsJapgolly.fhir.fhir.CommunicationRequest
import typingsJapgolly.fhir.fhir.CompartmentDefinition
import typingsJapgolly.fhir.fhir.Composition
import typingsJapgolly.fhir.fhir.ConceptMap
import typingsJapgolly.fhir.fhir.Condition
import typingsJapgolly.fhir.fhir.Consent
import typingsJapgolly.fhir.fhir.Contract
import typingsJapgolly.fhir.fhir.Coverage
import typingsJapgolly.fhir.fhir.DataElement
import typingsJapgolly.fhir.fhir.DetectedIssue
import typingsJapgolly.fhir.fhir.Device
import typingsJapgolly.fhir.fhir.DeviceComponent
import typingsJapgolly.fhir.fhir.DeviceMetric
import typingsJapgolly.fhir.fhir.DeviceRequest
import typingsJapgolly.fhir.fhir.DeviceUseStatement
import typingsJapgolly.fhir.fhir.DiagnosticReport
import typingsJapgolly.fhir.fhir.DocumentManifest
import typingsJapgolly.fhir.fhir.DocumentReference
import typingsJapgolly.fhir.fhir.DomainResource
import typingsJapgolly.fhir.fhir.EligibilityRequest
import typingsJapgolly.fhir.fhir.EligibilityResponse
import typingsJapgolly.fhir.fhir.Encounter
import typingsJapgolly.fhir.fhir.Endpoint
import typingsJapgolly.fhir.fhir.EnrollmentRequest
import typingsJapgolly.fhir.fhir.EnrollmentResponse
import typingsJapgolly.fhir.fhir.EpisodeOfCare
import typingsJapgolly.fhir.fhir.ExpansionProfile
import typingsJapgolly.fhir.fhir.ExplanationOfBenefit
import typingsJapgolly.fhir.fhir.FamilyMemberHistory
import typingsJapgolly.fhir.fhir.Flag
import typingsJapgolly.fhir.fhir.Goal
import typingsJapgolly.fhir.fhir.GraphDefinition
import typingsJapgolly.fhir.fhir.Group
import typingsJapgolly.fhir.fhir.GuidanceResponse
import typingsJapgolly.fhir.fhir.HealthcareService
import typingsJapgolly.fhir.fhir.ImagingManifest
import typingsJapgolly.fhir.fhir.ImagingStudy
import typingsJapgolly.fhir.fhir.Immunization
import typingsJapgolly.fhir.fhir.ImmunizationRecommendation
import typingsJapgolly.fhir.fhir.ImplementationGuide
import typingsJapgolly.fhir.fhir.Library
import typingsJapgolly.fhir.fhir.Linkage
import typingsJapgolly.fhir.fhir.List
import typingsJapgolly.fhir.fhir.Location
import typingsJapgolly.fhir.fhir.Measure
import typingsJapgolly.fhir.fhir.MeasureReport
import typingsJapgolly.fhir.fhir.Media
import typingsJapgolly.fhir.fhir.Medication
import typingsJapgolly.fhir.fhir.MedicationAdministration
import typingsJapgolly.fhir.fhir.MedicationDispense
import typingsJapgolly.fhir.fhir.MedicationRequest
import typingsJapgolly.fhir.fhir.MedicationStatement
import typingsJapgolly.fhir.fhir.MessageDefinition
import typingsJapgolly.fhir.fhir.MessageHeader
import typingsJapgolly.fhir.fhir.NamingSystem
import typingsJapgolly.fhir.fhir.NutritionOrder
import typingsJapgolly.fhir.fhir.Observation
import typingsJapgolly.fhir.fhir.OperationDefinition
import typingsJapgolly.fhir.fhir.OperationOutcome
import typingsJapgolly.fhir.fhir.Organization
import typingsJapgolly.fhir.fhir.Parameters
import typingsJapgolly.fhir.fhir.Patient
import typingsJapgolly.fhir.fhir.PaymentNotice
import typingsJapgolly.fhir.fhir.PaymentReconciliation
import typingsJapgolly.fhir.fhir.Person
import typingsJapgolly.fhir.fhir.PlanDefinition
import typingsJapgolly.fhir.fhir.Practitioner
import typingsJapgolly.fhir.fhir.PractitionerRole
import typingsJapgolly.fhir.fhir.Procedure
import typingsJapgolly.fhir.fhir.ProcedureRequest
import typingsJapgolly.fhir.fhir.ProcessRequest
import typingsJapgolly.fhir.fhir.ProcessResponse
import typingsJapgolly.fhir.fhir.Provenance
import typingsJapgolly.fhir.fhir.Questionnaire
import typingsJapgolly.fhir.fhir.QuestionnaireResponse
import typingsJapgolly.fhir.fhir.ReferralRequest
import typingsJapgolly.fhir.fhir.RelatedPerson
import typingsJapgolly.fhir.fhir.RequestGroup
import typingsJapgolly.fhir.fhir.ResearchStudy
import typingsJapgolly.fhir.fhir.ResearchSubject
import typingsJapgolly.fhir.fhir.RiskAssessment
import typingsJapgolly.fhir.fhir.Schedule
import typingsJapgolly.fhir.fhir.SearchParameter
import typingsJapgolly.fhir.fhir.Sequence
import typingsJapgolly.fhir.fhir.ServiceDefinition
import typingsJapgolly.fhir.fhir.Slot
import typingsJapgolly.fhir.fhir.Specimen
import typingsJapgolly.fhir.fhir.StructureDefinition
import typingsJapgolly.fhir.fhir.StructureMap
import typingsJapgolly.fhir.fhir.Subscription
import typingsJapgolly.fhir.fhir.Substance
import typingsJapgolly.fhir.fhir.SupplyDelivery
import typingsJapgolly.fhir.fhir.SupplyRequest
import typingsJapgolly.fhir.fhir.Task
import typingsJapgolly.fhir.fhir.TestReport
import typingsJapgolly.fhir.fhir.TestScript
import typingsJapgolly.fhir.fhir.ValueSet
import typingsJapgolly.fhir.fhir.VisionPrescription
import typingsJapgolly.fhirKitClient.Anon0
import typingsJapgolly.fhirKitClient.Anon1
import typingsJapgolly.fhirKitClient.Anon10
import typingsJapgolly.fhirKitClient.Anon100
import typingsJapgolly.fhirKitClient.Anon101
import typingsJapgolly.fhirKitClient.Anon102
import typingsJapgolly.fhirKitClient.Anon103
import typingsJapgolly.fhirKitClient.Anon104
import typingsJapgolly.fhirKitClient.Anon105
import typingsJapgolly.fhirKitClient.Anon106
import typingsJapgolly.fhirKitClient.Anon107
import typingsJapgolly.fhirKitClient.Anon108
import typingsJapgolly.fhirKitClient.Anon109
import typingsJapgolly.fhirKitClient.Anon11
import typingsJapgolly.fhirKitClient.Anon110
import typingsJapgolly.fhirKitClient.Anon111
import typingsJapgolly.fhirKitClient.Anon112
import typingsJapgolly.fhirKitClient.Anon113
import typingsJapgolly.fhirKitClient.Anon114
import typingsJapgolly.fhirKitClient.Anon115
import typingsJapgolly.fhirKitClient.Anon116
import typingsJapgolly.fhirKitClient.Anon117
import typingsJapgolly.fhirKitClient.Anon118
import typingsJapgolly.fhirKitClient.Anon119
import typingsJapgolly.fhirKitClient.Anon12
import typingsJapgolly.fhirKitClient.Anon120
import typingsJapgolly.fhirKitClient.Anon121
import typingsJapgolly.fhirKitClient.Anon122
import typingsJapgolly.fhirKitClient.Anon123
import typingsJapgolly.fhirKitClient.Anon124
import typingsJapgolly.fhirKitClient.Anon125
import typingsJapgolly.fhirKitClient.Anon126
import typingsJapgolly.fhirKitClient.Anon127
import typingsJapgolly.fhirKitClient.Anon128
import typingsJapgolly.fhirKitClient.Anon129
import typingsJapgolly.fhirKitClient.Anon13
import typingsJapgolly.fhirKitClient.Anon130
import typingsJapgolly.fhirKitClient.Anon131
import typingsJapgolly.fhirKitClient.Anon132
import typingsJapgolly.fhirKitClient.Anon133
import typingsJapgolly.fhirKitClient.Anon134
import typingsJapgolly.fhirKitClient.Anon135
import typingsJapgolly.fhirKitClient.Anon136
import typingsJapgolly.fhirKitClient.Anon137
import typingsJapgolly.fhirKitClient.Anon138
import typingsJapgolly.fhirKitClient.Anon139
import typingsJapgolly.fhirKitClient.Anon14
import typingsJapgolly.fhirKitClient.Anon140
import typingsJapgolly.fhirKitClient.Anon141
import typingsJapgolly.fhirKitClient.Anon142
import typingsJapgolly.fhirKitClient.Anon143
import typingsJapgolly.fhirKitClient.Anon144
import typingsJapgolly.fhirKitClient.Anon145
import typingsJapgolly.fhirKitClient.Anon146
import typingsJapgolly.fhirKitClient.Anon147
import typingsJapgolly.fhirKitClient.Anon148
import typingsJapgolly.fhirKitClient.Anon149
import typingsJapgolly.fhirKitClient.Anon15
import typingsJapgolly.fhirKitClient.Anon150
import typingsJapgolly.fhirKitClient.Anon151
import typingsJapgolly.fhirKitClient.Anon152
import typingsJapgolly.fhirKitClient.Anon153
import typingsJapgolly.fhirKitClient.Anon154
import typingsJapgolly.fhirKitClient.Anon155
import typingsJapgolly.fhirKitClient.Anon156
import typingsJapgolly.fhirKitClient.Anon157
import typingsJapgolly.fhirKitClient.Anon158
import typingsJapgolly.fhirKitClient.Anon159
import typingsJapgolly.fhirKitClient.Anon16
import typingsJapgolly.fhirKitClient.Anon160
import typingsJapgolly.fhirKitClient.Anon161
import typingsJapgolly.fhirKitClient.Anon162
import typingsJapgolly.fhirKitClient.Anon163
import typingsJapgolly.fhirKitClient.Anon164
import typingsJapgolly.fhirKitClient.Anon165
import typingsJapgolly.fhirKitClient.Anon166
import typingsJapgolly.fhirKitClient.Anon167
import typingsJapgolly.fhirKitClient.Anon168
import typingsJapgolly.fhirKitClient.Anon169
import typingsJapgolly.fhirKitClient.Anon17
import typingsJapgolly.fhirKitClient.Anon170
import typingsJapgolly.fhirKitClient.Anon171
import typingsJapgolly.fhirKitClient.Anon172
import typingsJapgolly.fhirKitClient.Anon173
import typingsJapgolly.fhirKitClient.Anon174
import typingsJapgolly.fhirKitClient.Anon175
import typingsJapgolly.fhirKitClient.Anon176
import typingsJapgolly.fhirKitClient.Anon177
import typingsJapgolly.fhirKitClient.Anon178
import typingsJapgolly.fhirKitClient.Anon179
import typingsJapgolly.fhirKitClient.Anon18
import typingsJapgolly.fhirKitClient.Anon180
import typingsJapgolly.fhirKitClient.Anon181
import typingsJapgolly.fhirKitClient.Anon182
import typingsJapgolly.fhirKitClient.Anon183
import typingsJapgolly.fhirKitClient.Anon184
import typingsJapgolly.fhirKitClient.Anon185
import typingsJapgolly.fhirKitClient.Anon186
import typingsJapgolly.fhirKitClient.Anon187
import typingsJapgolly.fhirKitClient.Anon188
import typingsJapgolly.fhirKitClient.Anon189
import typingsJapgolly.fhirKitClient.Anon19
import typingsJapgolly.fhirKitClient.Anon2
import typingsJapgolly.fhirKitClient.Anon20
import typingsJapgolly.fhirKitClient.Anon21
import typingsJapgolly.fhirKitClient.Anon22
import typingsJapgolly.fhirKitClient.Anon23
import typingsJapgolly.fhirKitClient.Anon24
import typingsJapgolly.fhirKitClient.Anon25
import typingsJapgolly.fhirKitClient.Anon26
import typingsJapgolly.fhirKitClient.Anon27
import typingsJapgolly.fhirKitClient.Anon28
import typingsJapgolly.fhirKitClient.Anon29
import typingsJapgolly.fhirKitClient.Anon3
import typingsJapgolly.fhirKitClient.Anon30
import typingsJapgolly.fhirKitClient.Anon31
import typingsJapgolly.fhirKitClient.Anon32
import typingsJapgolly.fhirKitClient.Anon33
import typingsJapgolly.fhirKitClient.Anon34
import typingsJapgolly.fhirKitClient.Anon35
import typingsJapgolly.fhirKitClient.Anon36
import typingsJapgolly.fhirKitClient.Anon37
import typingsJapgolly.fhirKitClient.Anon38
import typingsJapgolly.fhirKitClient.Anon39
import typingsJapgolly.fhirKitClient.Anon4
import typingsJapgolly.fhirKitClient.Anon40
import typingsJapgolly.fhirKitClient.Anon41
import typingsJapgolly.fhirKitClient.Anon42
import typingsJapgolly.fhirKitClient.Anon43
import typingsJapgolly.fhirKitClient.Anon44
import typingsJapgolly.fhirKitClient.Anon45
import typingsJapgolly.fhirKitClient.Anon46
import typingsJapgolly.fhirKitClient.Anon47
import typingsJapgolly.fhirKitClient.Anon48
import typingsJapgolly.fhirKitClient.Anon49
import typingsJapgolly.fhirKitClient.Anon5
import typingsJapgolly.fhirKitClient.Anon50
import typingsJapgolly.fhirKitClient.Anon51
import typingsJapgolly.fhirKitClient.Anon52
import typingsJapgolly.fhirKitClient.Anon53
import typingsJapgolly.fhirKitClient.Anon54
import typingsJapgolly.fhirKitClient.Anon55
import typingsJapgolly.fhirKitClient.Anon56
import typingsJapgolly.fhirKitClient.Anon57
import typingsJapgolly.fhirKitClient.Anon58
import typingsJapgolly.fhirKitClient.Anon59
import typingsJapgolly.fhirKitClient.Anon6
import typingsJapgolly.fhirKitClient.Anon60
import typingsJapgolly.fhirKitClient.Anon61
import typingsJapgolly.fhirKitClient.Anon62
import typingsJapgolly.fhirKitClient.Anon63
import typingsJapgolly.fhirKitClient.Anon64
import typingsJapgolly.fhirKitClient.Anon65
import typingsJapgolly.fhirKitClient.Anon66
import typingsJapgolly.fhirKitClient.Anon67
import typingsJapgolly.fhirKitClient.Anon68
import typingsJapgolly.fhirKitClient.Anon69
import typingsJapgolly.fhirKitClient.Anon7
import typingsJapgolly.fhirKitClient.Anon70
import typingsJapgolly.fhirKitClient.Anon71
import typingsJapgolly.fhirKitClient.Anon72
import typingsJapgolly.fhirKitClient.Anon73
import typingsJapgolly.fhirKitClient.Anon74
import typingsJapgolly.fhirKitClient.Anon75
import typingsJapgolly.fhirKitClient.Anon76
import typingsJapgolly.fhirKitClient.Anon77
import typingsJapgolly.fhirKitClient.Anon78
import typingsJapgolly.fhirKitClient.Anon79
import typingsJapgolly.fhirKitClient.Anon8
import typingsJapgolly.fhirKitClient.Anon80
import typingsJapgolly.fhirKitClient.Anon81
import typingsJapgolly.fhirKitClient.Anon82
import typingsJapgolly.fhirKitClient.Anon83
import typingsJapgolly.fhirKitClient.Anon84
import typingsJapgolly.fhirKitClient.Anon85
import typingsJapgolly.fhirKitClient.Anon86
import typingsJapgolly.fhirKitClient.Anon87
import typingsJapgolly.fhirKitClient.Anon88
import typingsJapgolly.fhirKitClient.Anon89
import typingsJapgolly.fhirKitClient.Anon9
import typingsJapgolly.fhirKitClient.Anon90
import typingsJapgolly.fhirKitClient.Anon91
import typingsJapgolly.fhirKitClient.Anon92
import typingsJapgolly.fhirKitClient.Anon93
import typingsJapgolly.fhirKitClient.Anon94
import typingsJapgolly.fhirKitClient.Anon95
import typingsJapgolly.fhirKitClient.Anon96
import typingsJapgolly.fhirKitClient.Anon97
import typingsJapgolly.fhirKitClient.Anon98
import typingsJapgolly.fhirKitClient.Anon99
import typingsJapgolly.fhirKitClient.AnonBody
import typingsJapgolly.fhirKitClient.AnonBodyAllergyIntolerance
import typingsJapgolly.fhirKitClient.AnonBodyAppointment
import typingsJapgolly.fhirKitClient.AnonBodyAppointmentResponse
import typingsJapgolly.fhirKitClient.AnonBodyAuditEvent
import typingsJapgolly.fhirKitClient.AnonBodyAuditEventHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyBasic
import typingsJapgolly.fhirKitClient.AnonBodyBasicHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyBinary
import typingsJapgolly.fhirKitClient.AnonBodyBinaryHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyBodySite
import typingsJapgolly.fhirKitClient.AnonBodyBodySiteHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyBundle
import typingsJapgolly.fhirKitClient.AnonBodyBundleHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyBundletypebatch
import typingsJapgolly.fhirKitClient.AnonBodyBundletypetransaction
import typingsJapgolly.fhirKitClient.AnonBodyCapabilityStatement
import typingsJapgolly.fhirKitClient.AnonBodyCapabilityStatementHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCarePlan
import typingsJapgolly.fhirKitClient.AnonBodyCarePlanHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCareTeam
import typingsJapgolly.fhirKitClient.AnonBodyCareTeamHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyChargeItem
import typingsJapgolly.fhirKitClient.AnonBodyChargeItemHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyClaim
import typingsJapgolly.fhirKitClient.AnonBodyClaimHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyClaimResponse
import typingsJapgolly.fhirKitClient.AnonBodyClaimResponseHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyClinicalImpression
import typingsJapgolly.fhirKitClient.AnonBodyClinicalImpressionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCodeSystem
import typingsJapgolly.fhirKitClient.AnonBodyCodeSystemHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCommunication
import typingsJapgolly.fhirKitClient.AnonBodyCommunicationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCommunicationRequest
import typingsJapgolly.fhirKitClient.AnonBodyCommunicationRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCompartmentDefinition
import typingsJapgolly.fhirKitClient.AnonBodyCompartmentDefinitionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyComposition
import typingsJapgolly.fhirKitClient.AnonBodyCompositionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyConceptMap
import typingsJapgolly.fhirKitClient.AnonBodyConceptMapHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCondition
import typingsJapgolly.fhirKitClient.AnonBodyConditionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyConsent
import typingsJapgolly.fhirKitClient.AnonBodyConsentHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyContract
import typingsJapgolly.fhirKitClient.AnonBodyContractHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyCoverage
import typingsJapgolly.fhirKitClient.AnonBodyCoverageHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDataElement
import typingsJapgolly.fhirKitClient.AnonBodyDataElementHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDetectedIssue
import typingsJapgolly.fhirKitClient.AnonBodyDetectedIssueHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDevice
import typingsJapgolly.fhirKitClient.AnonBodyDeviceComponent
import typingsJapgolly.fhirKitClient.AnonBodyDeviceComponentHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDeviceHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDeviceMetric
import typingsJapgolly.fhirKitClient.AnonBodyDeviceMetricHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDeviceRequest
import typingsJapgolly.fhirKitClient.AnonBodyDeviceRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDeviceUseStatement
import typingsJapgolly.fhirKitClient.AnonBodyDeviceUseStatementHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDiagnosticReport
import typingsJapgolly.fhirKitClient.AnonBodyDiagnosticReportHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDocumentManifest
import typingsJapgolly.fhirKitClient.AnonBodyDocumentManifestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDocumentReference
import typingsJapgolly.fhirKitClient.AnonBodyDocumentReferenceHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyDomainResource
import typingsJapgolly.fhirKitClient.AnonBodyDomainResourceHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyEligibilityRequest
import typingsJapgolly.fhirKitClient.AnonBodyEligibilityRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyEligibilityResponse
import typingsJapgolly.fhirKitClient.AnonBodyEligibilityResponseHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyEncounter
import typingsJapgolly.fhirKitClient.AnonBodyEncounterHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyEndpoint
import typingsJapgolly.fhirKitClient.AnonBodyEndpointHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyEnrollmentRequest
import typingsJapgolly.fhirKitClient.AnonBodyEnrollmentRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyEnrollmentResponse
import typingsJapgolly.fhirKitClient.AnonBodyEnrollmentResponseHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyEpisodeOfCare
import typingsJapgolly.fhirKitClient.AnonBodyEpisodeOfCareHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyExpansionProfile
import typingsJapgolly.fhirKitClient.AnonBodyExpansionProfileHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyExplanationOfBenefit
import typingsJapgolly.fhirKitClient.AnonBodyExplanationOfBenefitHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyFamilyMemberHistory
import typingsJapgolly.fhirKitClient.AnonBodyFamilyMemberHistoryHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyFlag
import typingsJapgolly.fhirKitClient.AnonBodyFlagHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyGoal
import typingsJapgolly.fhirKitClient.AnonBodyGoalHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyGraphDefinition
import typingsJapgolly.fhirKitClient.AnonBodyGraphDefinitionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyGroup
import typingsJapgolly.fhirKitClient.AnonBodyGroupHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyGuidanceResponse
import typingsJapgolly.fhirKitClient.AnonBodyGuidanceResponseHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyHeaders
import typingsJapgolly.fhirKitClient.AnonBodyHeadersId
import typingsJapgolly.fhirKitClient.AnonBodyHeadersIdOptions
import typingsJapgolly.fhirKitClient.AnonBodyHeadersIdOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonBodyHeadersOptions
import typingsJapgolly.fhirKitClient.AnonBodyHeadersOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonBodyHealthcareService
import typingsJapgolly.fhirKitClient.AnonBodyHealthcareServiceHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyImagingManifest
import typingsJapgolly.fhirKitClient.AnonBodyImagingManifestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyImagingStudy
import typingsJapgolly.fhirKitClient.AnonBodyImagingStudyHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyImmunization
import typingsJapgolly.fhirKitClient.AnonBodyImmunizationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyImmunizationRecommendation
import typingsJapgolly.fhirKitClient.AnonBodyImmunizationRecommendationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyImplementationGuide
import typingsJapgolly.fhirKitClient.AnonBodyImplementationGuideHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyLibrary
import typingsJapgolly.fhirKitClient.AnonBodyLibraryHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyLinkage
import typingsJapgolly.fhirKitClient.AnonBodyLinkageHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyList
import typingsJapgolly.fhirKitClient.AnonBodyListHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyLocation
import typingsJapgolly.fhirKitClient.AnonBodyLocationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMeasure
import typingsJapgolly.fhirKitClient.AnonBodyMeasureHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMeasureReport
import typingsJapgolly.fhirKitClient.AnonBodyMeasureReportHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMedia
import typingsJapgolly.fhirKitClient.AnonBodyMediaHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMedication
import typingsJapgolly.fhirKitClient.AnonBodyMedicationAdministration
import typingsJapgolly.fhirKitClient.AnonBodyMedicationAdministrationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMedicationDispense
import typingsJapgolly.fhirKitClient.AnonBodyMedicationDispenseHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMedicationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMedicationRequest
import typingsJapgolly.fhirKitClient.AnonBodyMedicationRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMedicationStatement
import typingsJapgolly.fhirKitClient.AnonBodyMedicationStatementHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMessageDefinition
import typingsJapgolly.fhirKitClient.AnonBodyMessageDefinitionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyMessageHeader
import typingsJapgolly.fhirKitClient.AnonBodyMessageHeaderHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyNamingSystem
import typingsJapgolly.fhirKitClient.AnonBodyNamingSystemHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyNutritionOrder
import typingsJapgolly.fhirKitClient.AnonBodyNutritionOrderHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyObservation
import typingsJapgolly.fhirKitClient.AnonBodyObservationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyOperationDefinition
import typingsJapgolly.fhirKitClient.AnonBodyOperationDefinitionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyOperationOutcome
import typingsJapgolly.fhirKitClient.AnonBodyOperationOutcomeHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyOrganization
import typingsJapgolly.fhirKitClient.AnonBodyOrganizationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyParameters
import typingsJapgolly.fhirKitClient.AnonBodyParametersHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyPatient
import typingsJapgolly.fhirKitClient.AnonBodyPatientHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyPaymentNotice
import typingsJapgolly.fhirKitClient.AnonBodyPaymentNoticeHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyPaymentReconciliation
import typingsJapgolly.fhirKitClient.AnonBodyPaymentReconciliationHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyPerson
import typingsJapgolly.fhirKitClient.AnonBodyPersonHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyPlanDefinition
import typingsJapgolly.fhirKitClient.AnonBodyPlanDefinitionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyPractitioner
import typingsJapgolly.fhirKitClient.AnonBodyPractitionerHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyPractitionerRole
import typingsJapgolly.fhirKitClient.AnonBodyPractitionerRoleHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyProcedure
import typingsJapgolly.fhirKitClient.AnonBodyProcedureHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyProcedureRequest
import typingsJapgolly.fhirKitClient.AnonBodyProcedureRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyProcessRequest
import typingsJapgolly.fhirKitClient.AnonBodyProcessRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyProcessResponse
import typingsJapgolly.fhirKitClient.AnonBodyProcessResponseHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyProvenance
import typingsJapgolly.fhirKitClient.AnonBodyProvenanceHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyQuestionnaire
import typingsJapgolly.fhirKitClient.AnonBodyQuestionnaireHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyQuestionnaireResponse
import typingsJapgolly.fhirKitClient.AnonBodyQuestionnaireResponseHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyReferralRequest
import typingsJapgolly.fhirKitClient.AnonBodyReferralRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyRelatedPerson
import typingsJapgolly.fhirKitClient.AnonBodyRelatedPersonHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyRequestGroup
import typingsJapgolly.fhirKitClient.AnonBodyRequestGroupHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyResearchStudy
import typingsJapgolly.fhirKitClient.AnonBodyResearchStudyHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyResearchSubject
import typingsJapgolly.fhirKitClient.AnonBodyResearchSubjectHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyRiskAssessment
import typingsJapgolly.fhirKitClient.AnonBodyRiskAssessmentHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySchedule
import typingsJapgolly.fhirKitClient.AnonBodyScheduleHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySearchParameter
import typingsJapgolly.fhirKitClient.AnonBodySearchParameterHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySequence
import typingsJapgolly.fhirKitClient.AnonBodySequenceHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyServiceDefinition
import typingsJapgolly.fhirKitClient.AnonBodyServiceDefinitionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySlot
import typingsJapgolly.fhirKitClient.AnonBodySlotHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySpecimen
import typingsJapgolly.fhirKitClient.AnonBodySpecimenHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyStructureDefinition
import typingsJapgolly.fhirKitClient.AnonBodyStructureDefinitionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyStructureMap
import typingsJapgolly.fhirKitClient.AnonBodyStructureMapHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySubscription
import typingsJapgolly.fhirKitClient.AnonBodySubscriptionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySubstance
import typingsJapgolly.fhirKitClient.AnonBodySubstanceHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySupplyDelivery
import typingsJapgolly.fhirKitClient.AnonBodySupplyDeliveryHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodySupplyRequest
import typingsJapgolly.fhirKitClient.AnonBodySupplyRequestHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyT
import typingsJapgolly.fhirKitClient.AnonBodyTHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyTask
import typingsJapgolly.fhirKitClient.AnonBodyTaskHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyTestReport
import typingsJapgolly.fhirKitClient.AnonBodyTestReportHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyTestScript
import typingsJapgolly.fhirKitClient.AnonBodyTestScriptHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyValueSet
import typingsJapgolly.fhirKitClient.AnonBodyValueSetHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBodyVisionPrescription
import typingsJapgolly.fhirKitClient.AnonBodyVisionPrescriptionHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonBundle
import typingsJapgolly.fhirKitClient.AnonCompartment
import typingsJapgolly.fhirKitClient.AnonCompartmentHeaders
import typingsJapgolly.fhirKitClient.AnonContext
import typingsJapgolly.fhirKitClient.AnonHeaders
import typingsJapgolly.fhirKitClient.AnonHeadersHeaders
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersIdString
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersIdStringJSONPatchArray
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptions
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersIdStringOptionsOptions
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersIdStringOptionsOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersIdStringOptionsOptionsResourceTypeVersionString
import typingsJapgolly.fhirKitClient.AnonHeadersHeadersOptionsOptions
import typingsJapgolly.fhirKitClient.AnonHeadersId
import typingsJapgolly.fhirKitClient.AnonHeadersIdJSONPatch
import typingsJapgolly.fhirKitClient.AnonHeadersIdJSONPatchOptions
import typingsJapgolly.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonHeadersIdOptions
import typingsJapgolly.fhirKitClient.AnonHeadersIdOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonHeadersIdOptionsResourceTypeVersion
import typingsJapgolly.fhirKitClient.AnonHeadersOptions
import typingsJapgolly.fhirKitClient.AnonHeadersOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonId
import typingsJapgolly.fhirKitClient.AnonIdJSONPatch
import typingsJapgolly.fhirKitClient.AnonIdJSONPatchOptions
import typingsJapgolly.fhirKitClient.AnonIdJSONPatchOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonIdOptions
import typingsJapgolly.fhirKitClient.AnonIdOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonIdOptionsResourceTypeVersion
import typingsJapgolly.fhirKitClient.AnonIdString
import typingsJapgolly.fhirKitClient.AnonIdStringJSONPatchArray
import typingsJapgolly.fhirKitClient.AnonIdStringJSONPatchArrayOptionsOptions
import typingsJapgolly.fhirKitClient.AnonIdStringJSONPatchArrayOptionsOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonIdStringOptionsOptions
import typingsJapgolly.fhirKitClient.AnonIdStringOptionsOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonIdStringOptionsOptionsResourceTypeVersionString
import typingsJapgolly.fhirKitClient.AnonJSONPatch
import typingsJapgolly.fhirKitClient.AnonJSONPatchArray
import typingsJapgolly.fhirKitClient.AnonJSONPatchArrayOptionsOptions
import typingsJapgolly.fhirKitClient.AnonJSONPatchArrayOptionsOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonJSONPatchOptions
import typingsJapgolly.fhirKitClient.AnonJSONPatchOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonOptions
import typingsJapgolly.fhirKitClient.AnonOptionsOptions
import typingsJapgolly.fhirKitClient.AnonOptionsOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonOptionsOptionsResourceTypeCustomResourceType
import typingsJapgolly.fhirKitClient.AnonOptionsOptionsResourceTypeResourceType
import typingsJapgolly.fhirKitClient.AnonOptionsOptionsResourceTypeVersionString
import typingsJapgolly.fhirKitClient.AnonOptionsResourceType
import typingsJapgolly.fhirKitClient.AnonOptionsResourceTypeVersion
import typingsJapgolly.fhirKitClient.AnonOptionsSearchParams
import typingsJapgolly.fhirKitClient.AnonResourceType
import typingsJapgolly.fhirKitClient.AnonResourceTypeCustomResourceType
import typingsJapgolly.fhirKitClient.AnonResourceTypeResourceType
import typingsJapgolly.fhirKitClient.AnonResourceTypeVersion
import typingsJapgolly.fhirKitClient.AnonResourceTypeVersionString
import typingsJapgolly.fhirKitClient.AnonSearchParams
import typingsJapgolly.fhirKitClient.AnonType
import typingsJapgolly.fhirKitClient.AnonVersion
import typingsJapgolly.fhirKitClient.AnonVersionString
import typingsJapgolly.fhirKitClient.Bundletypebatchresponse
import typingsJapgolly.fhirKitClient.Bundletypehistory
import typingsJapgolly.fhirKitClient.Bundletypesearchset
import typingsJapgolly.fhirKitClient.Bundletypetransactionresp
import typingsJapgolly.request.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var baseUrl: String = js.native
  var bearerToken: js.UndefOr[String] = js.native
  var customHeaders: Headers = js.native
  /**
    * Submit a set of actions to perform independently as a batch.
    *
    * Update, create or delete a set of resources in a single interaction.
    * There should be no interdependencies between entries in the bundle.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'batch',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.batch({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.batch({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.body - The request body with a type of 'batch'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def batch(params: AnonBodyBundletypebatch): js.Promise[OperationOutcome | Bundletypebatchresponse] = js.native
  /**
    * Get the default capability statement.
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.capabilityStatement().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.capabilityStatement();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} capability statement FHIR resource.
    */
  def capabilityStatement(): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def capabilityStatement(params: AnonHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  /**
    * Search for FHIR resources within a compartment.
    * The resourceType and id must be specified.
    *
    * @example
    *
    * // Using promises
    * fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.compartment - The search compartment.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def compartmentSearch(params: AnonCompartmentHeaders): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Create a resource.
    *
    * @example
    * const newPatient = {
    *   resourceType: 'Patient',
    *   active: true,
    *   name: [{ use: 'official', family: ['Coleman'], given: ['Lisa', 'P.'] }],
    *   gender: 'female',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * })
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The FHIR resource type.
    * @param {Response} params.body - The new resource data to create.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def create(params: AnonBody): js.Promise[OperationOutcome | Account] = js.native
  def create(params: AnonBodyAuditEvent): js.Promise[OperationOutcome | AuditEvent] = js.native
  def create(params: AnonBodyBasic): js.Promise[OperationOutcome | Basic] = js.native
  def create(params: AnonBodyBinary): js.Promise[OperationOutcome | Binary] = js.native
  def create(params: AnonBodyBodySite): js.Promise[OperationOutcome | BodySite] = js.native
  def create(params: AnonBodyBundle): js.Promise[OperationOutcome | Bundle] = js.native
  def create(params: AnonBodyCapabilityStatement): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def create(params: AnonBodyCarePlan): js.Promise[OperationOutcome | CarePlan] = js.native
  def create(params: AnonBodyCareTeam): js.Promise[OperationOutcome | CareTeam] = js.native
  def create(params: AnonBodyChargeItem): js.Promise[OperationOutcome | ChargeItem] = js.native
  def create(params: AnonBodyClaim): js.Promise[OperationOutcome | Claim] = js.native
  def create(params: AnonBodyClaimResponse): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def create(params: AnonBodyClinicalImpression): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def create(params: AnonBodyCodeSystem): js.Promise[OperationOutcome | CodeSystem] = js.native
  def create(params: AnonBodyCommunication): js.Promise[OperationOutcome | Communication] = js.native
  def create(params: AnonBodyCommunicationRequest): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def create(params: AnonBodyCompartmentDefinition): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def create(params: AnonBodyComposition): js.Promise[OperationOutcome | Composition] = js.native
  def create(params: AnonBodyConceptMap): js.Promise[OperationOutcome | ConceptMap] = js.native
  def create(params: AnonBodyCondition): js.Promise[OperationOutcome | Condition] = js.native
  def create(params: AnonBodyConsent): js.Promise[OperationOutcome | Consent] = js.native
  def create(params: AnonBodyContract): js.Promise[OperationOutcome | Contract] = js.native
  def create(params: AnonBodyCoverage): js.Promise[OperationOutcome | Coverage] = js.native
  def create(params: AnonBodyDataElement): js.Promise[OperationOutcome | DataElement] = js.native
  def create(params: AnonBodyDetectedIssue): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def create(params: AnonBodyDevice): js.Promise[OperationOutcome | Device] = js.native
  def create(params: AnonBodyDeviceComponent): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def create(params: AnonBodyDeviceMetric): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def create(params: AnonBodyDeviceRequest): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def create(params: AnonBodyDeviceUseStatement): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def create(params: AnonBodyDiagnosticReport): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def create(params: AnonBodyDocumentManifest): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def create(params: AnonBodyDocumentReference): js.Promise[OperationOutcome | DocumentReference] = js.native
  def create(params: AnonBodyDomainResource): js.Promise[OperationOutcome | DomainResource] = js.native
  def create(params: AnonBodyEligibilityRequest): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def create(params: AnonBodyEligibilityResponse): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def create(params: AnonBodyEncounter): js.Promise[OperationOutcome | Encounter] = js.native
  def create(params: AnonBodyEndpoint): js.Promise[OperationOutcome | Endpoint] = js.native
  def create(params: AnonBodyEnrollmentRequest): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def create(params: AnonBodyEnrollmentResponse): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def create(params: AnonBodyEpisodeOfCare): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def create(params: AnonBodyExpansionProfile): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def create(params: AnonBodyExplanationOfBenefit): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def create(params: AnonBodyFamilyMemberHistory): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def create(params: AnonBodyFlag): js.Promise[OperationOutcome | Flag] = js.native
  def create(params: AnonBodyGoal): js.Promise[OperationOutcome | Goal] = js.native
  def create(params: AnonBodyGraphDefinition): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def create(params: AnonBodyGroup): js.Promise[OperationOutcome | Group] = js.native
  def create(params: AnonBodyGuidanceResponse): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def create(params: AnonBodyHeaders): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def create(params: AnonBodyHeadersOptions): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def create(params: AnonBodyHeadersOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def create(params: AnonBodyHealthcareService): js.Promise[OperationOutcome | HealthcareService] = js.native
  def create(params: AnonBodyImagingManifest): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def create(params: AnonBodyImagingStudy): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def create(params: AnonBodyImmunization): js.Promise[OperationOutcome | Immunization] = js.native
  def create(params: AnonBodyImmunizationRecommendation): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def create(params: AnonBodyImplementationGuide): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def create(params: AnonBodyLibrary): js.Promise[OperationOutcome | Library] = js.native
  def create(params: AnonBodyLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def create(params: AnonBodyList): js.Promise[OperationOutcome | List] = js.native
  def create(params: AnonBodyLocation): js.Promise[OperationOutcome | Location] = js.native
  def create(params: AnonBodyMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def create(params: AnonBodyMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def create(params: AnonBodyMedia): js.Promise[OperationOutcome | Media] = js.native
  def create(params: AnonBodyMedication): js.Promise[OperationOutcome | Medication] = js.native
  def create(params: AnonBodyMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def create(params: AnonBodyMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def create(params: AnonBodyMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def create(params: AnonBodyMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def create(params: AnonBodyMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def create(params: AnonBodyMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def create(params: AnonBodyNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def create(params: AnonBodyNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def create(params: AnonBodyObservation): js.Promise[OperationOutcome | Observation] = js.native
  def create(params: AnonBodyOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def create(params: AnonBodyOperationOutcome): js.Promise[OperationOutcome] = js.native
  def create(params: AnonBodyOrganization): js.Promise[OperationOutcome | Organization] = js.native
  def create(params: AnonBodyParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def create(params: AnonBodyPatient): js.Promise[OperationOutcome | Patient] = js.native
  def create(params: AnonBodyPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def create(params: AnonBodyPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def create(params: AnonBodyPerson): js.Promise[OperationOutcome | Person] = js.native
  def create(params: AnonBodyPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def create(params: AnonBodyPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def create(params: AnonBodyPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def create(params: AnonBodyProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def create(params: AnonBodyProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def create(params: AnonBodyProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def create(params: AnonBodyProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def create(params: AnonBodyProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def create(params: AnonBodyQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def create(params: AnonBodyQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def create(params: AnonBodyReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def create(params: AnonBodyRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def create(params: AnonBodyRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def create(params: AnonBodyResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def create(params: AnonBodyResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def create(params: AnonBodyRiskAssessment): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def create(params: AnonBodySchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def create(params: AnonBodySearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def create(params: AnonBodySequence): js.Promise[OperationOutcome | Sequence] = js.native
  def create(params: AnonBodyServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def create(params: AnonBodySlot): js.Promise[OperationOutcome | Slot] = js.native
  def create(params: AnonBodySpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def create(params: AnonBodyStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def create(params: AnonBodyStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def create(params: AnonBodySubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def create(params: AnonBodySubstance): js.Promise[OperationOutcome | Substance] = js.native
  def create(params: AnonBodySupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def create(params: AnonBodySupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def create(params: AnonBodyTask): js.Promise[OperationOutcome | Task] = js.native
  def create(params: AnonBodyTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def create(params: AnonBodyTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def create(params: AnonBodyValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def create(params: AnonBodyVisionPrescription): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def create(params: AnonHeadersOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def create(params: AnonHeadersOptionsResourceType): js.Promise[OperationOutcome | Appointment] = js.native
  def create[T /* <: CustomResource */](params: AnonBodyT[T]): js.Promise[OperationOutcome | T] = js.native
  /**
    * Delete a resource by FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.delete({
    *   resourceType: 'Patient',
    *   id: 12345,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.delete({ resourceType: 'Patient', id: 12345 });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient", "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} Operation Outcome FHIR resource
    */
  def delete(params: AnonResourceTypeResourceType): js.Promise[OperationOutcome] = js.native
  /**
    * Retrieve the change history for a FHIR resource id, a resource type or the
    * entire system
    *
    * @example
    *
    * // Using promises
    * fhirClient.history({ resourceType: 'Patient', id: '12345' });
    *   .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.history({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {string} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {string} [params.id] - The FHIR id for the resource, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def history(): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def history(params: AnonOptionsOptionsResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Return the next page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def nextPage[T /* <: String */](params: AnonBundle[T]): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def nextPage[T /* <: String */](params: AnonBundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def patch(params: Anon100): js.Promise[OperationOutcome | DataElement] = js.native
  def patch(params: Anon101): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def patch(params: Anon102): js.Promise[OperationOutcome | Device] = js.native
  def patch(params: Anon103): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def patch(params: Anon104): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def patch(params: Anon105): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def patch(params: Anon106): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def patch(params: Anon107): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def patch(params: Anon108): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def patch(params: Anon109): js.Promise[OperationOutcome | DocumentReference] = js.native
  def patch(params: Anon110): js.Promise[OperationOutcome | DomainResource] = js.native
  def patch(params: Anon111): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def patch(params: Anon112): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def patch(params: Anon113): js.Promise[OperationOutcome | Encounter] = js.native
  def patch(params: Anon114): js.Promise[OperationOutcome | Endpoint] = js.native
  def patch(params: Anon115): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def patch(params: Anon116): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def patch(params: Anon117): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def patch(params: Anon118): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def patch(params: Anon119): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def patch(params: Anon120): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def patch(params: Anon121): js.Promise[OperationOutcome | Flag] = js.native
  def patch(params: Anon122): js.Promise[OperationOutcome | Goal] = js.native
  def patch(params: Anon123): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def patch(params: Anon124): js.Promise[OperationOutcome | Group] = js.native
  def patch(params: Anon125): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def patch(params: Anon126): js.Promise[OperationOutcome | HealthcareService] = js.native
  def patch(params: Anon127): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def patch(params: Anon128): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def patch(params: Anon129): js.Promise[OperationOutcome | Immunization] = js.native
  def patch(params: Anon130): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def patch(params: Anon131): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def patch(params: Anon132): js.Promise[OperationOutcome | Library] = js.native
  def patch(params: Anon133): js.Promise[OperationOutcome | Linkage] = js.native
  def patch(params: Anon134): js.Promise[OperationOutcome | List] = js.native
  def patch(params: Anon135): js.Promise[OperationOutcome | Location] = js.native
  def patch(params: Anon136): js.Promise[OperationOutcome | Measure] = js.native
  def patch(params: Anon137): js.Promise[OperationOutcome | MeasureReport] = js.native
  def patch(params: Anon138): js.Promise[OperationOutcome | Media] = js.native
  def patch(params: Anon139): js.Promise[OperationOutcome | Medication] = js.native
  def patch(params: Anon140): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def patch(params: Anon141): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def patch(params: Anon142): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def patch(params: Anon143): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def patch(params: Anon144): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def patch(params: Anon145): js.Promise[OperationOutcome | MessageHeader] = js.native
  def patch(params: Anon146): js.Promise[OperationOutcome | NamingSystem] = js.native
  def patch(params: Anon147): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def patch(params: Anon148): js.Promise[OperationOutcome | Observation] = js.native
  def patch(params: Anon149): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def patch(params: Anon150): js.Promise[OperationOutcome] = js.native
  def patch(params: Anon151): js.Promise[OperationOutcome | Organization] = js.native
  def patch(params: Anon152): js.Promise[OperationOutcome | Parameters] = js.native
  def patch(params: Anon153): js.Promise[OperationOutcome | Patient] = js.native
  def patch(params: Anon154): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def patch(params: Anon155): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def patch(params: Anon156): js.Promise[OperationOutcome | Person] = js.native
  def patch(params: Anon157): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def patch(params: Anon158): js.Promise[OperationOutcome | Practitioner] = js.native
  def patch(params: Anon159): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def patch(params: Anon160): js.Promise[OperationOutcome | Procedure] = js.native
  def patch(params: Anon161): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def patch(params: Anon162): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def patch(params: Anon163): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def patch(params: Anon164): js.Promise[OperationOutcome | Provenance] = js.native
  def patch(params: Anon165): js.Promise[OperationOutcome | Questionnaire] = js.native
  def patch(params: Anon166): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def patch(params: Anon167): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def patch(params: Anon168): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def patch(params: Anon169): js.Promise[OperationOutcome | RequestGroup] = js.native
  def patch(params: Anon170): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def patch(params: Anon171): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def patch(params: Anon172): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def patch(params: Anon173): js.Promise[OperationOutcome | Schedule] = js.native
  def patch(params: Anon174): js.Promise[OperationOutcome | SearchParameter] = js.native
  def patch(params: Anon175): js.Promise[OperationOutcome | Sequence] = js.native
  def patch(params: Anon176): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def patch(params: Anon177): js.Promise[OperationOutcome | Slot] = js.native
  def patch(params: Anon178): js.Promise[OperationOutcome | Specimen] = js.native
  def patch(params: Anon179): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def patch(params: Anon180): js.Promise[OperationOutcome | StructureMap] = js.native
  def patch(params: Anon181): js.Promise[OperationOutcome | Subscription] = js.native
  def patch(params: Anon182): js.Promise[OperationOutcome | Substance] = js.native
  def patch(params: Anon183): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def patch(params: Anon184): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def patch(params: Anon185): js.Promise[OperationOutcome | Task] = js.native
  def patch(params: Anon186): js.Promise[OperationOutcome | TestReport] = js.native
  def patch(params: Anon187): js.Promise[OperationOutcome | TestScript] = js.native
  def patch(params: Anon188): js.Promise[OperationOutcome | ValueSet] = js.native
  def patch(params: Anon189): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def patch(params: Anon90): js.Promise[OperationOutcome | CodeSystem] = js.native
  def patch(params: Anon91): js.Promise[OperationOutcome | Communication] = js.native
  def patch(params: Anon92): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def patch(params: Anon93): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def patch(params: Anon94): js.Promise[OperationOutcome | Composition] = js.native
  def patch(params: Anon95): js.Promise[OperationOutcome | ConceptMap] = js.native
  def patch(params: Anon96): js.Promise[OperationOutcome | Condition] = js.native
  def patch(params: Anon97): js.Promise[OperationOutcome | Consent] = js.native
  def patch(params: Anon98): js.Promise[OperationOutcome | Contract] = js.native
  def patch(params: Anon99): js.Promise[OperationOutcome | Coverage] = js.native
  def patch(params: AnonHeadersHeadersIdStringJSONPatchArray): js.Promise[OperationOutcome | CarePlan] = js.native
  def patch(params: AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | Claim] = js.native
  def patch(params: AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def patch(params: AnonHeadersIdJSONPatch): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptions): js.Promise[OperationOutcome | AuditEvent] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Binary] = js.native
  def patch(params: AnonIdJSONPatch): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def patch(params: AnonIdJSONPatchOptions): js.Promise[OperationOutcome | Appointment] = js.native
  def patch(params: AnonIdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Basic] = js.native
  def patch(params: AnonIdStringJSONPatchArray): js.Promise[OperationOutcome | Bundle] = js.native
  def patch(params: AnonIdStringJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | CareTeam] = js.native
  def patch(params: AnonIdStringJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ClaimResponse] = js.native
  /**
    * Patch a resource by FHIR id.
    *
    * From http://hl7.org/fhir/STU3/http.html#patch:
    * Content-Type is 'application/json-patch+json'
    * Expects a JSON Patch document format, see http://jsonpatch.com/
    *
    * @example
    *
    * // JSON Patch document format from http://jsonpatch.com/
    * const JSONPatch = [{ op: 'replace', path: '/gender', value: 'male' }];
    *
    * // Using promises
    * fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Array} params.JSONPatch - A JSON Patch document containing an array
    *   of patch operations, formatted according to http://jsonpatch.com/.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def patch(params: AnonJSONPatch): js.Promise[OperationOutcome | Account] = js.native
  def patch(params: AnonJSONPatchArray): js.Promise[OperationOutcome | BodySite] = js.native
  def patch(params: AnonJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def patch(params: AnonJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ChargeItem] = js.native
  def patch(params: AnonJSONPatchOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def patch(params: AnonJSONPatchOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def patch(params: AnonOptionsOptionsResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  /**
    * Return the previous page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def prevPage[T /* <: String */](params: AnonBundle[T]): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def prevPage[T /* <: String */](params: AnonBundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  /**
    * Resolve a reference and return FHIR resource
    *
    * From: http://hl7.org/fhir/STU3/references.html, a reference can be: 1)
    * absolute URL, 2) relative URL or 3) an internal fragement. In the case of
    * (2), there are rules on resolving references that are in a FHIR bundle.
    *
    * @async
    *
    * @example
    *
    * // Always does a new http request
    * client.resolve({ reference: 'http://test.com/fhir/Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Always does a new http request, using the client.baseUrl
    * client.resolve({ reference: 'Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Try to resolve a patient in the bundle, otherwise build request
    * // at client.baseUrl
    * client.resolve({ reference: 'Patient/1', context: bundle }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Resolve a patient contained in someResource (see:
    * // http://hl7.org/fhir/STU3/references.html#contained)
    * client.resolve({ reference: '#patient-1', context: someResource }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.reference - FHIR reference
    * @param {Object} [params.context] - Optional bundle with 'entry' array or FHIR resource with 'contained' array (if 'params.reference' starts with '#')
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def resolve(params: AnonContext): js.Promise[FhirResource] = js.native
  /**
    * Retrieve the change history for a particular resource FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {string} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceHistory(params: AnonResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Search for a FHIR resource.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceSearch(params: AnonSearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Search for a FHIR resource, with or without compartments, or the entire
    * system
    *
    * @example
    *
    * // Using promises
    * fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {Object} [params.compartment] - The search compartment, optional.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    *
    * @throws {Error} if neither searchParams nor resourceType are supplied
    */
  def search(params: AnonCompartment): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Obtain the SMART OAuth URLs from the Capability Statement
    * http://docs.smarthealthit.org/authorization/conformance-statement/
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.smartAuthMetadata().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.smartAuthMetadata();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} contains the following SMART URIs: authorizeUrl,
    *   tokenUrl, registerUrl, manageUrl
    */
  def smartAuthMetadata(): js.Promise[SmartAuthMetadata] = js.native
  def smartAuthMetadata(params: AnonHeaders): js.Promise[SmartAuthMetadata] = js.native
  /**
    * Retrieve the change history for all resources.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemHistory();
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemHistory();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemHistory(): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def systemHistory(params: AnonHeaders): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Search across all FHIR resource types in the system.
    * Only the parameters defined for all resources can be used.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemSearch({
    *   searchParams: { name: 'smith' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemSearch({ searchParams: { name: 'smith' } });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemSearch(params: AnonOptionsSearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Submit a set of actions to perform independently as a transaction.
    *
    * Update, create or delete a set of resources in a single interaction.
    * The entire set of changes should succeed or fail as a single entity.
    * Multiple actions on multiple resources different types may be submitted.
    * The outcome should not depend on the order of the resources loaded.
    * Order of processing actions: DELETE, POST, PUT, and GET.
    * The transaction fails if any resource overlap in DELETE, POST and PUT.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'transaction',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.transaction({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.transaction({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.body - The request body with a type of
    *   'transaction'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def transaction(params: AnonBodyBundletypetransaction): js.Promise[OperationOutcome | Bundletypetransactionresp] = js.native
  /**
    * Retrieve the change history for a particular resource type.
    *
    * @example
    *
    * // Using promises
    * fhirClient.typeHistory({ resourceType: 'Patient' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.typeHistory({ resourceType: 'Patient' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def typeHistory(params: AnonHeadersHeadersOptionsOptions): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def update(params: AnonBodyAllergyIntolerance): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def update(params: AnonBodyAppointment): js.Promise[OperationOutcome | Appointment] = js.native
  def update(params: AnonBodyAppointmentResponse): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def update(params: AnonBodyAuditEventHeadersHeaders): js.Promise[OperationOutcome | AuditEvent] = js.native
  def update(params: AnonBodyBasicHeadersHeaders): js.Promise[OperationOutcome | Basic] = js.native
  def update(params: AnonBodyBinaryHeadersHeaders): js.Promise[OperationOutcome | Binary] = js.native
  def update(params: AnonBodyBodySiteHeadersHeaders): js.Promise[OperationOutcome | BodySite] = js.native
  def update(params: AnonBodyBundleHeadersHeaders): js.Promise[OperationOutcome | Bundle] = js.native
  def update(params: AnonBodyCapabilityStatementHeadersHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def update(params: AnonBodyCarePlanHeadersHeaders): js.Promise[OperationOutcome | CarePlan] = js.native
  def update(params: AnonBodyCareTeamHeadersHeaders): js.Promise[OperationOutcome | CareTeam] = js.native
  def update(params: AnonBodyChargeItemHeadersHeaders): js.Promise[OperationOutcome | ChargeItem] = js.native
  def update(params: AnonBodyClaimHeadersHeaders): js.Promise[OperationOutcome | Claim] = js.native
  def update(params: AnonBodyClaimResponseHeadersHeaders): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def update(params: AnonBodyClinicalImpressionHeadersHeaders): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def update(params: AnonBodyCodeSystemHeadersHeaders): js.Promise[OperationOutcome | CodeSystem] = js.native
  def update(params: AnonBodyCommunicationHeadersHeaders): js.Promise[OperationOutcome | Communication] = js.native
  def update(params: AnonBodyCommunicationRequestHeadersHeaders): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def update(params: AnonBodyCompartmentDefinitionHeadersHeaders): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def update(params: AnonBodyCompositionHeadersHeaders): js.Promise[OperationOutcome | Composition] = js.native
  def update(params: AnonBodyConceptMapHeadersHeaders): js.Promise[OperationOutcome | ConceptMap] = js.native
  def update(params: AnonBodyConditionHeadersHeaders): js.Promise[OperationOutcome | Condition] = js.native
  def update(params: AnonBodyConsentHeadersHeaders): js.Promise[OperationOutcome | Consent] = js.native
  def update(params: AnonBodyContractHeadersHeaders): js.Promise[OperationOutcome | Contract] = js.native
  def update(params: AnonBodyCoverageHeadersHeaders): js.Promise[OperationOutcome | Coverage] = js.native
  def update(params: AnonBodyDataElementHeadersHeaders): js.Promise[OperationOutcome | DataElement] = js.native
  def update(params: AnonBodyDetectedIssueHeadersHeaders): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def update(params: AnonBodyDeviceComponentHeadersHeaders): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def update(params: AnonBodyDeviceHeadersHeaders): js.Promise[OperationOutcome | Device] = js.native
  def update(params: AnonBodyDeviceMetricHeadersHeaders): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def update(params: AnonBodyDeviceRequestHeadersHeaders): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def update(params: AnonBodyDeviceUseStatementHeadersHeaders): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def update(params: AnonBodyDiagnosticReportHeadersHeaders): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def update(params: AnonBodyDocumentManifestHeadersHeaders): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def update(params: AnonBodyDocumentReferenceHeadersHeaders): js.Promise[OperationOutcome | DocumentReference] = js.native
  def update(params: AnonBodyDomainResourceHeadersHeaders): js.Promise[OperationOutcome | DomainResource] = js.native
  def update(params: AnonBodyEligibilityRequestHeadersHeaders): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def update(params: AnonBodyEligibilityResponseHeadersHeaders): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def update(params: AnonBodyEncounterHeadersHeaders): js.Promise[OperationOutcome | Encounter] = js.native
  def update(params: AnonBodyEndpointHeadersHeaders): js.Promise[OperationOutcome | Endpoint] = js.native
  def update(params: AnonBodyEnrollmentRequestHeadersHeaders): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def update(params: AnonBodyEnrollmentResponseHeadersHeaders): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def update(params: AnonBodyEpisodeOfCareHeadersHeaders): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def update(params: AnonBodyExpansionProfileHeadersHeaders): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def update(params: AnonBodyExplanationOfBenefitHeadersHeaders): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def update(params: AnonBodyFamilyMemberHistoryHeadersHeaders): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def update(params: AnonBodyFlagHeadersHeaders): js.Promise[OperationOutcome | Flag] = js.native
  def update(params: AnonBodyGoalHeadersHeaders): js.Promise[OperationOutcome | Goal] = js.native
  def update(params: AnonBodyGraphDefinitionHeadersHeaders): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def update(params: AnonBodyGroupHeadersHeaders): js.Promise[OperationOutcome | Group] = js.native
  def update(params: AnonBodyGuidanceResponseHeadersHeaders): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  /**
    * Update a resource by FHIR id.
    *
    * @example
    *
    * const updatedPatient = {
    *   resourceType: 'Patient',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.body - The resource to be updated.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def update(params: AnonBodyHeadersId): js.Promise[OperationOutcome | Account] = js.native
  def update(params: AnonBodyHeadersIdOptions): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def update(params: AnonBodyHealthcareServiceHeadersHeaders): js.Promise[OperationOutcome | HealthcareService] = js.native
  def update(params: AnonBodyImagingManifestHeadersHeaders): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def update(params: AnonBodyImagingStudyHeadersHeaders): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def update(params: AnonBodyImmunizationHeadersHeaders): js.Promise[OperationOutcome | Immunization] = js.native
  def update(params: AnonBodyImmunizationRecommendationHeadersHeaders): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def update(params: AnonBodyImplementationGuideHeadersHeaders): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def update(params: AnonBodyLibraryHeadersHeaders): js.Promise[OperationOutcome | Library] = js.native
  def update(params: AnonBodyLinkageHeadersHeaders): js.Promise[OperationOutcome | Linkage] = js.native
  def update(params: AnonBodyListHeadersHeaders): js.Promise[OperationOutcome | List] = js.native
  def update(params: AnonBodyLocationHeadersHeaders): js.Promise[OperationOutcome | Location] = js.native
  def update(params: AnonBodyMeasureHeadersHeaders): js.Promise[OperationOutcome | Measure] = js.native
  def update(params: AnonBodyMeasureReportHeadersHeaders): js.Promise[OperationOutcome | MeasureReport] = js.native
  def update(params: AnonBodyMediaHeadersHeaders): js.Promise[OperationOutcome | Media] = js.native
  def update(params: AnonBodyMedicationAdministrationHeadersHeaders): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def update(params: AnonBodyMedicationDispenseHeadersHeaders): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def update(params: AnonBodyMedicationHeadersHeaders): js.Promise[OperationOutcome | Medication] = js.native
  def update(params: AnonBodyMedicationRequestHeadersHeaders): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def update(params: AnonBodyMedicationStatementHeadersHeaders): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def update(params: AnonBodyMessageDefinitionHeadersHeaders): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def update(params: AnonBodyMessageHeaderHeadersHeaders): js.Promise[OperationOutcome | MessageHeader] = js.native
  def update(params: AnonBodyNamingSystemHeadersHeaders): js.Promise[OperationOutcome | NamingSystem] = js.native
  def update(params: AnonBodyNutritionOrderHeadersHeaders): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def update(params: AnonBodyObservationHeadersHeaders): js.Promise[OperationOutcome | Observation] = js.native
  def update(params: AnonBodyOperationDefinitionHeadersHeaders): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def update(params: AnonBodyOperationOutcomeHeadersHeaders): js.Promise[OperationOutcome] = js.native
  def update(params: AnonBodyOrganizationHeadersHeaders): js.Promise[OperationOutcome | Organization] = js.native
  def update(params: AnonBodyParametersHeadersHeaders): js.Promise[OperationOutcome | Parameters] = js.native
  def update(params: AnonBodyPatientHeadersHeaders): js.Promise[OperationOutcome | Patient] = js.native
  def update(params: AnonBodyPaymentNoticeHeadersHeaders): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def update(params: AnonBodyPaymentReconciliationHeadersHeaders): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def update(params: AnonBodyPersonHeadersHeaders): js.Promise[OperationOutcome | Person] = js.native
  def update(params: AnonBodyPlanDefinitionHeadersHeaders): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def update(params: AnonBodyPractitionerHeadersHeaders): js.Promise[OperationOutcome | Practitioner] = js.native
  def update(params: AnonBodyPractitionerRoleHeadersHeaders): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def update(params: AnonBodyProcedureHeadersHeaders): js.Promise[OperationOutcome | Procedure] = js.native
  def update(params: AnonBodyProcedureRequestHeadersHeaders): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def update(params: AnonBodyProcessRequestHeadersHeaders): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def update(params: AnonBodyProcessResponseHeadersHeaders): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def update(params: AnonBodyProvenanceHeadersHeaders): js.Promise[OperationOutcome | Provenance] = js.native
  def update(params: AnonBodyQuestionnaireHeadersHeaders): js.Promise[OperationOutcome | Questionnaire] = js.native
  def update(params: AnonBodyQuestionnaireResponseHeadersHeaders): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def update(params: AnonBodyReferralRequestHeadersHeaders): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def update(params: AnonBodyRelatedPersonHeadersHeaders): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def update(params: AnonBodyRequestGroupHeadersHeaders): js.Promise[OperationOutcome | RequestGroup] = js.native
  def update(params: AnonBodyResearchStudyHeadersHeaders): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def update(params: AnonBodyResearchSubjectHeadersHeaders): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def update(params: AnonBodyRiskAssessmentHeadersHeaders): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def update(params: AnonBodyScheduleHeadersHeaders): js.Promise[OperationOutcome | Schedule] = js.native
  def update(params: AnonBodySearchParameterHeadersHeaders): js.Promise[OperationOutcome | SearchParameter] = js.native
  def update(params: AnonBodySequenceHeadersHeaders): js.Promise[OperationOutcome | Sequence] = js.native
  def update(params: AnonBodyServiceDefinitionHeadersHeaders): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def update(params: AnonBodySlotHeadersHeaders): js.Promise[OperationOutcome | Slot] = js.native
  def update(params: AnonBodySpecimenHeadersHeaders): js.Promise[OperationOutcome | Specimen] = js.native
  def update(params: AnonBodyStructureDefinitionHeadersHeaders): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def update(params: AnonBodyStructureMapHeadersHeaders): js.Promise[OperationOutcome | StructureMap] = js.native
  def update(params: AnonBodySubscriptionHeadersHeaders): js.Promise[OperationOutcome | Subscription] = js.native
  def update(params: AnonBodySubstanceHeadersHeaders): js.Promise[OperationOutcome | Substance] = js.native
  def update(params: AnonBodySupplyDeliveryHeadersHeaders): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def update(params: AnonBodySupplyRequestHeadersHeaders): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def update(params: AnonBodyTaskHeadersHeaders): js.Promise[OperationOutcome | Task] = js.native
  def update(params: AnonBodyTestReportHeadersHeaders): js.Promise[OperationOutcome | TestReport] = js.native
  def update(params: AnonBodyTestScriptHeadersHeaders): js.Promise[OperationOutcome | TestScript] = js.native
  def update(params: AnonBodyValueSetHeadersHeaders): js.Promise[OperationOutcome | ValueSet] = js.native
  def update(params: AnonBodyVisionPrescriptionHeadersHeaders): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def update[T /* <: CustomResource */](params: AnonBodyTHeadersHeaders[T]): js.Promise[OperationOutcome | T] = js.native
  def vread(params: Anon0): js.Promise[OperationOutcome | DataElement] = js.native
  def vread(params: Anon1): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def vread(params: Anon10): js.Promise[OperationOutcome | DomainResource] = js.native
  def vread(params: Anon11): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def vread(params: Anon12): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def vread(params: Anon13): js.Promise[OperationOutcome | Encounter] = js.native
  def vread(params: Anon14): js.Promise[OperationOutcome | Endpoint] = js.native
  def vread(params: Anon15): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def vread(params: Anon16): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def vread(params: Anon17): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def vread(params: Anon18): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def vread(params: Anon19): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def vread(params: Anon2): js.Promise[OperationOutcome | Device] = js.native
  def vread(params: Anon20): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def vread(params: Anon21): js.Promise[OperationOutcome | Flag] = js.native
  def vread(params: Anon22): js.Promise[OperationOutcome | Goal] = js.native
  def vread(params: Anon23): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def vread(params: Anon24): js.Promise[OperationOutcome | Group] = js.native
  def vread(params: Anon25): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def vread(params: Anon26): js.Promise[OperationOutcome | HealthcareService] = js.native
  def vread(params: Anon27): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def vread(params: Anon28): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def vread(params: Anon29): js.Promise[OperationOutcome | Immunization] = js.native
  def vread(params: Anon3): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def vread(params: Anon30): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def vread(params: Anon31): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def vread(params: Anon32): js.Promise[OperationOutcome | Library] = js.native
  def vread(params: Anon33): js.Promise[OperationOutcome | Linkage] = js.native
  def vread(params: Anon34): js.Promise[OperationOutcome | List] = js.native
  def vread(params: Anon35): js.Promise[OperationOutcome | Location] = js.native
  def vread(params: Anon36): js.Promise[OperationOutcome | Measure] = js.native
  def vread(params: Anon37): js.Promise[OperationOutcome | MeasureReport] = js.native
  def vread(params: Anon38): js.Promise[OperationOutcome | Media] = js.native
  def vread(params: Anon39): js.Promise[OperationOutcome | Medication] = js.native
  def vread(params: Anon4): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def vread(params: Anon40): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def vread(params: Anon41): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def vread(params: Anon42): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def vread(params: Anon43): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def vread(params: Anon44): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def vread(params: Anon45): js.Promise[OperationOutcome | MessageHeader] = js.native
  def vread(params: Anon46): js.Promise[OperationOutcome | NamingSystem] = js.native
  def vread(params: Anon47): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def vread(params: Anon48): js.Promise[OperationOutcome | Observation] = js.native
  def vread(params: Anon49): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def vread(params: Anon5): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def vread(params: Anon50): js.Promise[OperationOutcome] = js.native
  def vread(params: Anon51): js.Promise[OperationOutcome | Organization] = js.native
  def vread(params: Anon52): js.Promise[OperationOutcome | Parameters] = js.native
  def vread(params: Anon53): js.Promise[OperationOutcome | Patient] = js.native
  def vread(params: Anon54): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def vread(params: Anon55): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def vread(params: Anon56): js.Promise[OperationOutcome | Person] = js.native
  def vread(params: Anon57): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def vread(params: Anon58): js.Promise[OperationOutcome | Practitioner] = js.native
  def vread(params: Anon59): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def vread(params: Anon6): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def vread(params: Anon60): js.Promise[OperationOutcome | Procedure] = js.native
  def vread(params: Anon61): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def vread(params: Anon62): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def vread(params: Anon63): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def vread(params: Anon64): js.Promise[OperationOutcome | Provenance] = js.native
  def vread(params: Anon65): js.Promise[OperationOutcome | Questionnaire] = js.native
  def vread(params: Anon66): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def vread(params: Anon67): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def vread(params: Anon68): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def vread(params: Anon69): js.Promise[OperationOutcome | RequestGroup] = js.native
  def vread(params: Anon7): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def vread(params: Anon70): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def vread(params: Anon71): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def vread(params: Anon72): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def vread(params: Anon73): js.Promise[OperationOutcome | Schedule] = js.native
  def vread(params: Anon74): js.Promise[OperationOutcome | SearchParameter] = js.native
  def vread(params: Anon75): js.Promise[OperationOutcome | Sequence] = js.native
  def vread(params: Anon76): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def vread(params: Anon77): js.Promise[OperationOutcome | Slot] = js.native
  def vread(params: Anon78): js.Promise[OperationOutcome | Specimen] = js.native
  def vread(params: Anon79): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def vread(params: Anon8): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def vread(params: Anon80): js.Promise[OperationOutcome | StructureMap] = js.native
  def vread(params: Anon81): js.Promise[OperationOutcome | Subscription] = js.native
  def vread(params: Anon82): js.Promise[OperationOutcome | Substance] = js.native
  def vread(params: Anon83): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def vread(params: Anon84): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def vread(params: Anon85): js.Promise[OperationOutcome | Task] = js.native
  def vread(params: Anon86): js.Promise[OperationOutcome | TestReport] = js.native
  def vread(params: Anon87): js.Promise[OperationOutcome | TestScript] = js.native
  def vread(params: Anon88): js.Promise[OperationOutcome | ValueSet] = js.native
  def vread(params: Anon89): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def vread(params: Anon9): js.Promise[OperationOutcome | DocumentReference] = js.native
  def vread(params: AnonHeadersHeaders): js.Promise[OperationOutcome | ChargeItem] = js.native
  def vread(params: AnonHeadersHeadersIdString): js.Promise[OperationOutcome | CodeSystem] = js.native
  def vread(params: AnonHeadersHeadersIdStringOptionsOptions): js.Promise[OperationOutcome | Composition] = js.native
  def vread(params: AnonHeadersHeadersIdStringOptionsOptionsResourceType): js.Promise[OperationOutcome | Consent] = js.native
  def vread(params: AnonHeadersHeadersIdStringOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Coverage] = js.native
  def vread(params: AnonHeadersId): js.Promise[OperationOutcome | Appointment] = js.native
  def vread(params: AnonHeadersIdOptions): js.Promise[OperationOutcome | Binary] = js.native
  def vread(params: AnonHeadersIdOptionsResourceType): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeVersion): js.Promise[OperationOutcome | CareTeam] = js.native
  /**
    * Get a resource by id and version.
    *
    * @example
    *
    * // Using promises
    * fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * }).then(data => console.log(data));
    *
    * // Using async
    * let response = await fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.version - The version id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def vread(params: AnonId): js.Promise[OperationOutcome | Account] = js.native
  def vread(params: AnonIdOptions): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def vread(params: AnonIdOptionsResourceType): js.Promise[OperationOutcome | BodySite] = js.native
  def vread(params: AnonIdOptionsResourceTypeVersion): js.Promise[OperationOutcome | CarePlan] = js.native
  def vread(params: AnonIdString): js.Promise[OperationOutcome | Claim] = js.native
  def vread(params: AnonIdStringOptionsOptions): js.Promise[OperationOutcome | Communication] = js.native
  def vread(params: AnonIdStringOptionsOptionsResourceType): js.Promise[OperationOutcome | ConceptMap] = js.native
  def vread(params: AnonIdStringOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Contract] = js.native
  def vread(params: AnonOptions): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def vread(params: AnonOptionsOptions): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def vread(params: AnonOptionsOptionsResourceType): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def vread(params: AnonOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Condition] = js.native
  def vread(params: AnonOptionsResourceType): js.Promise[OperationOutcome | AuditEvent] = js.native
  def vread(params: AnonOptionsResourceTypeVersion): js.Promise[OperationOutcome | Bundle] = js.native
  def vread(params: AnonResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def vread(params: AnonResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def vread(params: AnonResourceTypeVersion): js.Promise[OperationOutcome | Basic] = js.native
  def vread(params: AnonResourceTypeVersionString): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def vread(params: AnonVersion): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def vread(params: AnonVersionString): js.Promise[OperationOutcome | ClinicalImpression] = js.native
}

