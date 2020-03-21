package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lightsailMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.inbound__
    - typingsJapgolly.awsSdk.awsSdkStrings.outbound__
    - java.lang.String
  */
  type AccessDirection = typingsJapgolly.awsSdk.lightsailMod._AccessDirection | java.lang.String
  type AddOnList = js.Array[typingsJapgolly.awsSdk.lightsailMod.AddOn]
  type AddOnRequestList = js.Array[typingsJapgolly.awsSdk.lightsailMod.AddOnRequest]
  type AddOnType = typingsJapgolly.awsSdk.awsSdkStrings.AutoSnapshot | java.lang.String
  type AttachedDiskList = js.Array[typingsJapgolly.awsSdk.lightsailMod.AttachedDisk]
  type AttachedDiskMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.lightsailMod.DiskMapList]
  type AutoSnapshotDate = java.lang.String
  type AutoSnapshotDetailsList = js.Array[typingsJapgolly.awsSdk.lightsailMod.AutoSnapshotDetails]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.NotFound
    - java.lang.String
  */
  type AutoSnapshotStatus = typingsJapgolly.awsSdk.lightsailMod._AutoSnapshotStatus | java.lang.String
  type AvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.lightsailMod.AvailabilityZone]
  type Base64 = java.lang.String
  type BlueprintList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Blueprint]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.os_
    - typingsJapgolly.awsSdk.awsSdkStrings.app
    - java.lang.String
  */
  type BlueprintType = typingsJapgolly.awsSdk.lightsailMod._BlueprintType | java.lang.String
  type BundleList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Bundle]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.lightsailMod.ClientApiVersions
  type CloudFormationStackRecordList = js.Array[typingsJapgolly.awsSdk.lightsailMod.CloudFormationStackRecord]
  type CloudFormationStackRecordSourceInfoList = js.Array[typingsJapgolly.awsSdk.lightsailMod.CloudFormationStackRecordSourceInfo]
  type CloudFormationStackRecordSourceType = typingsJapgolly.awsSdk.awsSdkStrings.ExportSnapshotRecord | java.lang.String
  type DiskInfoList = js.Array[typingsJapgolly.awsSdk.lightsailMod.DiskInfo]
  type DiskList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Disk]
  type DiskMapList = js.Array[typingsJapgolly.awsSdk.lightsailMod.DiskMap]
  type DiskSnapshotList = js.Array[typingsJapgolly.awsSdk.lightsailMod.DiskSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.completed__
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type DiskSnapshotState = typingsJapgolly.awsSdk.lightsailMod._DiskSnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-use`
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type DiskState = typingsJapgolly.awsSdk.lightsailMod._DiskState | java.lang.String
  type DomainEntryList = js.Array[typingsJapgolly.awsSdk.lightsailMod.DomainEntry]
  type DomainEntryOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type DomainEntryOptionsKeys = java.lang.String
  type DomainEntryType = java.lang.String
  type DomainList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Domain]
  type DomainName = java.lang.String
  type DomainNameList = js.Array[typingsJapgolly.awsSdk.lightsailMod.DomainName]
  type ExportSnapshotRecordList = js.Array[typingsJapgolly.awsSdk.lightsailMod.ExportSnapshotRecord]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.DiskSnapshot
    - java.lang.String
  */
  type ExportSnapshotRecordSourceType = typingsJapgolly.awsSdk.lightsailMod._ExportSnapshotRecordSourceType | java.lang.String
  type HostKeysList = js.Array[typingsJapgolly.awsSdk.lightsailMod.HostKeyAttributes]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ssh_
    - typingsJapgolly.awsSdk.awsSdkStrings.rdp
    - java.lang.String
  */
  type InstanceAccessProtocol = typingsJapgolly.awsSdk.lightsailMod._InstanceAccessProtocol | java.lang.String
  type InstanceEntryList = js.Array[typingsJapgolly.awsSdk.lightsailMod.InstanceEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LbDotRegistrationInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.LbDotInitialHealthChecking
    - typingsJapgolly.awsSdk.awsSdkStrings.LbDotInternalError
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotResponseCodeMismatch
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotTimeout
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotFailedHealthChecks
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotNotRegistered
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotNotInUse
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotDeregistrationInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotInvalidState
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceDotIpUnusable
    - java.lang.String
  */
  type InstanceHealthReason = typingsJapgolly.awsSdk.lightsailMod._InstanceHealthReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.initial_
    - typingsJapgolly.awsSdk.awsSdkStrings.healthy__
    - typingsJapgolly.awsSdk.awsSdkStrings.unhealthy__
    - typingsJapgolly.awsSdk.awsSdkStrings.unused
    - typingsJapgolly.awsSdk.awsSdkStrings.draining_
    - typingsJapgolly.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type InstanceHealthState = typingsJapgolly.awsSdk.lightsailMod._InstanceHealthState | java.lang.String
  type InstanceHealthSummaryList = js.Array[typingsJapgolly.awsSdk.lightsailMod.InstanceHealthSummary]
  type InstanceList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.NetworkIn
    - typingsJapgolly.awsSdk.awsSdkStrings.NetworkOut
    - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed_Instance
    - typingsJapgolly.awsSdk.awsSdkStrings.StatusCheckFailed_System
    - java.lang.String
  */
  type InstanceMetricName = typingsJapgolly.awsSdk.lightsailMod._InstanceMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LINUX_UNIX
    - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
    - java.lang.String
  */
  type InstancePlatform = typingsJapgolly.awsSdk.lightsailMod._InstancePlatform | java.lang.String
  type InstancePlatformList = js.Array[typingsJapgolly.awsSdk.lightsailMod.InstancePlatform]
  type InstancePortInfoList = js.Array[typingsJapgolly.awsSdk.lightsailMod.InstancePortInfo]
  type InstancePortStateList = js.Array[typingsJapgolly.awsSdk.lightsailMod.InstancePortState]
  type InstanceSnapshotList = js.Array[typingsJapgolly.awsSdk.lightsailMod.InstanceSnapshot]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type InstanceSnapshotState = typingsJapgolly.awsSdk.lightsailMod._InstanceSnapshotState | java.lang.String
  type IpAddress = java.lang.String
  type IpV6Address = java.lang.String
  type IsoDate = js.Date
  type KeyPairList = js.Array[typingsJapgolly.awsSdk.lightsailMod.KeyPair]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HealthCheckPath
    - typingsJapgolly.awsSdk.awsSdkStrings.SessionStickinessEnabled
    - typingsJapgolly.awsSdk.awsSdkStrings.SessionStickiness_LB_CookieDurationSeconds
    - java.lang.String
  */
  type LoadBalancerAttributeName = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerAttributeName | java.lang.String
  type LoadBalancerConfigurationOptions = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LoadBalancerList = js.Array[typingsJapgolly.awsSdk.lightsailMod.LoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ClientTLSNegotiationErrorCount
    - typingsJapgolly.awsSdk.awsSdkStrings.HealthyHostCount
    - typingsJapgolly.awsSdk.awsSdkStrings.UnhealthyHostCount
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_LB_4XX_Count
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_LB_5XX_Count
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_2XX_Count
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_3XX_Count
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_4XX_Count
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTPCode_Instance_5XX_Count
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceResponseTime
    - typingsJapgolly.awsSdk.awsSdkStrings.RejectedConnectionCount
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestCount
    - java.lang.String
  */
  type LoadBalancerMetricName = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerMetricName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_HTTPS
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - java.lang.String
  */
  type LoadBalancerProtocol = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerProtocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.provisioning_
    - typingsJapgolly.awsSdk.awsSdkStrings.active_impaired
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type LoadBalancerState = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - java.lang.String
  */
  type LoadBalancerTlsCertificateDomainStatus = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerTlsCertificateDomainStatus | java.lang.String
  type LoadBalancerTlsCertificateDomainValidationOptionList = js.Array[
    typingsJapgolly.awsSdk.lightsailMod.LoadBalancerTlsCertificateDomainValidationOption
  ]
  type LoadBalancerTlsCertificateDomainValidationRecordList = js.Array[
    typingsJapgolly.awsSdk.lightsailMod.LoadBalancerTlsCertificateDomainValidationRecord
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_AVAILABLE_CONTACTS
    - typingsJapgolly.awsSdk.awsSdkStrings.ADDITIONAL_VERIFICATION_REQUIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_NOT_ALLOWED
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PUBLIC_DOMAIN
    - typingsJapgolly.awsSdk.awsSdkStrings.OTHER
    - java.lang.String
  */
  type LoadBalancerTlsCertificateFailureReason = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerTlsCertificateFailureReason | java.lang.String
  type LoadBalancerTlsCertificateList = js.Array[typingsJapgolly.awsSdk.lightsailMod.LoadBalancerTlsCertificate]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_AUTO_RENEWAL
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRenewalStatus = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerTlsCertificateRenewalStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNSPECIFIED
    - typingsJapgolly.awsSdk.awsSdkStrings.KEY_COMPROMISE
    - typingsJapgolly.awsSdk.awsSdkStrings.CA_COMPROMISE
    - typingsJapgolly.awsSdk.awsSdkStrings.AFFILIATION_CHANGED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUPERCEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CESSATION_OF_OPERATION
    - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_HOLD
    - typingsJapgolly.awsSdk.awsSdkStrings.REMOVE_FROM_CRL
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVILEGE_WITHDRAWN
    - typingsJapgolly.awsSdk.awsSdkStrings.A_A_COMPROMISE
    - java.lang.String
  */
  type LoadBalancerTlsCertificateRevocationReason = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerTlsCertificateRevocationReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typingsJapgolly.awsSdk.awsSdkStrings.ISSUED
    - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_TIMED_OUT
    - typingsJapgolly.awsSdk.awsSdkStrings.REVOKED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type LoadBalancerTlsCertificateStatus = typingsJapgolly.awsSdk.lightsailMod._LoadBalancerTlsCertificateStatus | java.lang.String
  type LoadBalancerTlsCertificateSummaryList = js.Array[typingsJapgolly.awsSdk.lightsailMod.LoadBalancerTlsCertificateSummary]
  type LogEventList = js.Array[typingsJapgolly.awsSdk.lightsailMod.LogEvent]
  type MetricDatapointList = js.Array[typingsJapgolly.awsSdk.lightsailMod.MetricDatapoint]
  type MetricPeriod = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Minimum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Maximum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Sum_
    - typingsJapgolly.awsSdk.awsSdkStrings.Average_
    - typingsJapgolly.awsSdk.awsSdkStrings.SampleCount
    - java.lang.String
  */
  type MetricStatistic = typingsJapgolly.awsSdk.lightsailMod._MetricStatistic | java.lang.String
  type MetricStatisticList = js.Array[typingsJapgolly.awsSdk.lightsailMod.MetricStatistic]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Seconds_
    - typingsJapgolly.awsSdk.awsSdkStrings.Microseconds
    - typingsJapgolly.awsSdk.awsSdkStrings.Milliseconds_
    - typingsJapgolly.awsSdk.awsSdkStrings.Bytes_
    - typingsJapgolly.awsSdk.awsSdkStrings.Kilobytes
    - typingsJapgolly.awsSdk.awsSdkStrings.Megabytes
    - typingsJapgolly.awsSdk.awsSdkStrings.Gigabytes
    - typingsJapgolly.awsSdk.awsSdkStrings.Terabytes
    - typingsJapgolly.awsSdk.awsSdkStrings.Bits_
    - typingsJapgolly.awsSdk.awsSdkStrings.Kilobits
    - typingsJapgolly.awsSdk.awsSdkStrings.Megabits
    - typingsJapgolly.awsSdk.awsSdkStrings.Gigabits
    - typingsJapgolly.awsSdk.awsSdkStrings.Terabits
    - typingsJapgolly.awsSdk.awsSdkStrings.Percent_
    - typingsJapgolly.awsSdk.awsSdkStrings.Count_
    - typingsJapgolly.awsSdk.awsSdkStrings.BytesSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.KilobytesSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.MegabytesSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.GigabytesSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.TerabytesSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.BitsSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.KilobitsSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.MegabitsSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.GigabitsSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.TerabitsSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.CountSlashSecond
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - java.lang.String
  */
  type MetricUnit = typingsJapgolly.awsSdk.lightsailMod._MetricUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.tcp_
    - typingsJapgolly.awsSdk.awsSdkStrings.all__
    - typingsJapgolly.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type NetworkProtocol = typingsJapgolly.awsSdk.lightsailMod._NetworkProtocol | java.lang.String
  type NonEmptyString = java.lang.String
  type OperationList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Operation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NotStarted
    - typingsJapgolly.awsSdk.awsSdkStrings.Started_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type OperationStatus = typingsJapgolly.awsSdk.lightsailMod._OperationStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteKnownHostKeys
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.StopInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.StartInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.RebootInstance
    - typingsJapgolly.awsSdk.awsSdkStrings.OpenInstancePublicPorts
    - typingsJapgolly.awsSdk.awsSdkStrings.PutInstancePublicPorts
    - typingsJapgolly.awsSdk.awsSdkStrings.CloseInstancePublicPorts
    - typingsJapgolly.awsSdk.awsSdkStrings.AllocateStaticIp
    - typingsJapgolly.awsSdk.awsSdkStrings.ReleaseStaticIp
    - typingsJapgolly.awsSdk.awsSdkStrings.AttachStaticIp
    - typingsJapgolly.awsSdk.awsSdkStrings.DetachStaticIp
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateDomainEntry
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDomainEntry
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateDomain
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDomain
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateInstanceSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteInstanceSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateInstancesFromSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateLoadBalancer
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteLoadBalancer
    - typingsJapgolly.awsSdk.awsSdkStrings.AttachInstancesToLoadBalancer
    - typingsJapgolly.awsSdk.awsSdkStrings.DetachInstancesFromLoadBalancer
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateLoadBalancerAttribute
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateLoadBalancerTlsCertificate
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteLoadBalancerTlsCertificate
    - typingsJapgolly.awsSdk.awsSdkStrings.AttachLoadBalancerTlsCertificate
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateDisk
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDisk
    - typingsJapgolly.awsSdk.awsSdkStrings.AttachDisk
    - typingsJapgolly.awsSdk.awsSdkStrings.DetachDisk
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateDiskSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteDiskSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateDiskFromSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateRelationalDatabase
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateRelationalDatabase
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteRelationalDatabase
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateRelationalDatabaseFromSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateRelationalDatabaseSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.DeleteRelationalDatabaseSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateRelationalDatabaseParameters
    - typingsJapgolly.awsSdk.awsSdkStrings.StartRelationalDatabase
    - typingsJapgolly.awsSdk.awsSdkStrings.RebootRelationalDatabase
    - typingsJapgolly.awsSdk.awsSdkStrings.StopRelationalDatabase
    - typingsJapgolly.awsSdk.awsSdkStrings.EnableAddOn
    - typingsJapgolly.awsSdk.awsSdkStrings.DisableAddOn
    - java.lang.String
  */
  type OperationType = typingsJapgolly.awsSdk.lightsailMod._OperationType | java.lang.String
  type PendingMaintenanceActionList = js.Array[typingsJapgolly.awsSdk.lightsailMod.PendingMaintenanceAction]
  type Port = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Public_
    - typingsJapgolly.awsSdk.awsSdkStrings.Private_
    - java.lang.String
  */
  type PortAccessType = typingsJapgolly.awsSdk.lightsailMod._PortAccessType | java.lang.String
  type PortInfoList = js.Array[typingsJapgolly.awsSdk.lightsailMod.PortInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.INSTANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOSED
    - java.lang.String
  */
  type PortInfoSourceType = typingsJapgolly.awsSdk.lightsailMod._PortInfoSourceType | java.lang.String
  type PortList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Port]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.open__
    - typingsJapgolly.awsSdk.awsSdkStrings.closed_
    - java.lang.String
  */
  type PortState = typingsJapgolly.awsSdk.lightsailMod._PortState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Started_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type RecordState = typingsJapgolly.awsSdk.lightsailMod._RecordState | java.lang.String
  type RegionList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Region]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-3`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-south-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
    - java.lang.String
  */
  type RegionName = typingsJapgolly.awsSdk.lightsailMod._RegionName | java.lang.String
  type RelationalDatabaseBlueprintList = js.Array[typingsJapgolly.awsSdk.lightsailMod.RelationalDatabaseBlueprint]
  type RelationalDatabaseBundleList = js.Array[typingsJapgolly.awsSdk.lightsailMod.RelationalDatabaseBundle]
  type RelationalDatabaseEngine = typingsJapgolly.awsSdk.awsSdkStrings.mysql_ | java.lang.String
  type RelationalDatabaseEventList = js.Array[typingsJapgolly.awsSdk.lightsailMod.RelationalDatabaseEvent]
  type RelationalDatabaseList = js.Array[typingsJapgolly.awsSdk.lightsailMod.RelationalDatabase]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CPUUtilization
    - typingsJapgolly.awsSdk.awsSdkStrings.DatabaseConnections
    - typingsJapgolly.awsSdk.awsSdkStrings.DiskQueueDepth
    - typingsJapgolly.awsSdk.awsSdkStrings.FreeStorageSpace
    - typingsJapgolly.awsSdk.awsSdkStrings.NetworkReceiveThroughput
    - typingsJapgolly.awsSdk.awsSdkStrings.NetworkTransmitThroughput
    - java.lang.String
  */
  type RelationalDatabaseMetricName = typingsJapgolly.awsSdk.lightsailMod._RelationalDatabaseMetricName | java.lang.String
  type RelationalDatabaseParameterList = js.Array[typingsJapgolly.awsSdk.lightsailMod.RelationalDatabaseParameter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT
    - typingsJapgolly.awsSdk.awsSdkStrings.PREVIOUS
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type RelationalDatabasePasswordVersion = typingsJapgolly.awsSdk.lightsailMod._RelationalDatabasePasswordVersion | java.lang.String
  type RelationalDatabaseSnapshotList = js.Array[typingsJapgolly.awsSdk.lightsailMod.RelationalDatabaseSnapshot]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[typingsJapgolly.awsSdk.lightsailMod.ResourceName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Instance_
    - typingsJapgolly.awsSdk.awsSdkStrings.StaticIp
    - typingsJapgolly.awsSdk.awsSdkStrings.KeyPair
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.Domain_
    - typingsJapgolly.awsSdk.awsSdkStrings.PeeredVpc
    - typingsJapgolly.awsSdk.awsSdkStrings.LoadBalancer
    - typingsJapgolly.awsSdk.awsSdkStrings.LoadBalancerTlsCertificate
    - typingsJapgolly.awsSdk.awsSdkStrings.Disk
    - typingsJapgolly.awsSdk.awsSdkStrings.DiskSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.RelationalDatabase
    - typingsJapgolly.awsSdk.awsSdkStrings.RelationalDatabaseSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.ExportSnapshotRecord
    - typingsJapgolly.awsSdk.awsSdkStrings.CloudFormationStackRecord
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.lightsailMod._ResourceType | java.lang.String
  type SensitiveString = java.lang.String
  type StaticIpList = js.Array[typingsJapgolly.awsSdk.lightsailMod.StaticIp]
  type StringList = js.Array[java.lang.String]
  type StringMax256 = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.lightsailMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.lightsailMod.Tag]
  type TagValue = java.lang.String
  type TimeOfDay = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.lightsailMod._apiVersion | java.lang.String
  type double = scala.Double
  type float = scala.Double
  type integer = scala.Double
  type timestamp = js.Date
}
