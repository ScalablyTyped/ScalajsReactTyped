package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object opsworkscmMod {
  type AWSOpsWorksCMResourceArn = java.lang.String
  type AccountAttributes = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.AccountAttribute]
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type BackupId = java.lang.String
  type BackupRetentionCountDefinition = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.OK
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type BackupStatus = typingsJapgolly.awsSdk.opsworkscmMod._BackupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMATED
    - typingsJapgolly.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type BackupType = typingsJapgolly.awsSdk.opsworkscmMod._BackupType | java.lang.String
  type Backups = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.Backup]
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.opsworkscmMod.ClientApiVersions
  type CustomCertificate = java.lang.String
  type CustomDomain = java.lang.String
  type CustomPrivateKey = java.lang.String
  type EngineAttributeName = java.lang.String
  type EngineAttributeValue = java.lang.String
  type EngineAttributes = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.EngineAttribute]
  type InstanceProfileArn = java.lang.String
  type Integer = scala.Double
  type KeyPair = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type MaintenanceStatus = typingsJapgolly.awsSdk.opsworkscmMod._MaintenanceStatus | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type NodeAssociationStatus = typingsJapgolly.awsSdk.opsworkscmMod._NodeAssociationStatus | java.lang.String
  type NodeAssociationStatusToken = java.lang.String
  type NodeName = java.lang.String
  type ServerEvents = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.ServerEvent]
  type ServerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BACKING_UP
    - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTION_LOST
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFYING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.HEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.RESTORING
    - typingsJapgolly.awsSdk.awsSdkStrings.SETUP
    - typingsJapgolly.awsSdk.awsSdkStrings.UNDER_MAINTENANCE
    - typingsJapgolly.awsSdk.awsSdkStrings.UNHEALTHY
    - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type ServerStatus = typingsJapgolly.awsSdk.opsworkscmMod._ServerStatus | java.lang.String
  type Servers = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.Server]
  type ServiceRoleArn = java.lang.String
  type String = java.lang.String
  type Strings = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.opsworkscmMod.Tag]
  type TagValue = java.lang.String
  type TimeWindowDefinition = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.opsworkscmMod._apiVersion | java.lang.String
}
