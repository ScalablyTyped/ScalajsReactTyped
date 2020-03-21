package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.AspsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ChannelsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ChromeosdevicesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.CustomersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.DomainAliasesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.DomainsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.GroupsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.MembersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.MobiledevicesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.NotificationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.OrgunitsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.PrivilegesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ResolvedAppAccessSettingsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ResourcesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.RoleAssignmentsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.RolesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.SchemasCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.TokensCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.UsersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.VerificationCodesCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Alias
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Building
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.BuildingAddress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.BuildingCoordinates
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.CalendarResource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Channel
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDevice
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceAction
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceActiveTimeRanges
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceCpuStatusReports
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDeviceFiles
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDiskVolumeReports
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDiskVolumeReportsVolumeInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceRecentUsers
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceSystemRamFreeReports
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceTpmVersionInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsMoveDevicesToOu
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.CustomerPostalAddress
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.DomainAlias
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Feature
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.FeatureRename
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Group
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Member
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.MobileDeviceAction
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Notification
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.OrgUnit
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Role
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleAssignment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleRolePrivileges
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.SchemaFieldSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.SchemaFieldSpecNumericIndexingSpec
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserMakeAdmin
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserName
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserPhoto
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserUndelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDirectory_ extends js.Object {
  var Asps: js.UndefOr[AspsCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var Chromeosdevices: js.UndefOr[ChromeosdevicesCollection] = js.undefined
  var Customers: js.UndefOr[CustomersCollection] = js.undefined
  var DomainAliases: js.UndefOr[DomainAliasesCollection] = js.undefined
  var Domains: js.UndefOr[DomainsCollection] = js.undefined
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  var Members: js.UndefOr[MembersCollection] = js.undefined
  var Mobiledevices: js.UndefOr[MobiledevicesCollection] = js.undefined
  var Notifications: js.UndefOr[NotificationsCollection] = js.undefined
  var Orgunits: js.UndefOr[OrgunitsCollection] = js.undefined
  var Privileges: js.UndefOr[PrivilegesCollection] = js.undefined
  var ResolvedAppAccessSettings: js.UndefOr[ResolvedAppAccessSettingsCollection] = js.undefined
  var Resources: js.UndefOr[ResourcesCollection] = js.undefined
  var RoleAssignments: js.UndefOr[RoleAssignmentsCollection] = js.undefined
  var Roles: js.UndefOr[RolesCollection] = js.undefined
  var Schemas: js.UndefOr[SchemasCollection] = js.undefined
  var Tokens: js.UndefOr[TokensCollection] = js.undefined
  var Users: js.UndefOr[UsersCollection] = js.undefined
  var VerificationCodes: js.UndefOr[VerificationCodesCollection] = js.undefined
  // Create a new instance of Alias
  def newAlias(): Alias
  // Create a new instance of Building
  def newBuilding(): Building
  // Create a new instance of BuildingAddress
  def newBuildingAddress(): BuildingAddress
  // Create a new instance of BuildingCoordinates
  def newBuildingCoordinates(): BuildingCoordinates
  // Create a new instance of CalendarResource
  def newCalendarResource(): CalendarResource
  // Create a new instance of Channel
  def newChannel(): Channel
  // Create a new instance of ChromeOsDevice
  def newChromeOsDevice(): ChromeOsDevice
  // Create a new instance of ChromeOsDeviceAction
  def newChromeOsDeviceAction(): ChromeOsDeviceAction
  // Create a new instance of ChromeOsDeviceActiveTimeRanges
  def newChromeOsDeviceActiveTimeRanges(): ChromeOsDeviceActiveTimeRanges
  // Create a new instance of ChromeOsDeviceCpuStatusReports
  def newChromeOsDeviceCpuStatusReports(): ChromeOsDeviceCpuStatusReports
  // Create a new instance of ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
  def newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo(): ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
  // Create a new instance of ChromeOsDeviceDeviceFiles
  def newChromeOsDeviceDeviceFiles(): ChromeOsDeviceDeviceFiles
  // Create a new instance of ChromeOsDeviceDiskVolumeReports
  def newChromeOsDeviceDiskVolumeReports(): ChromeOsDeviceDiskVolumeReports
  // Create a new instance of ChromeOsDeviceDiskVolumeReportsVolumeInfo
  def newChromeOsDeviceDiskVolumeReportsVolumeInfo(): ChromeOsDeviceDiskVolumeReportsVolumeInfo
  // Create a new instance of ChromeOsDeviceRecentUsers
  def newChromeOsDeviceRecentUsers(): ChromeOsDeviceRecentUsers
  // Create a new instance of ChromeOsDeviceSystemRamFreeReports
  def newChromeOsDeviceSystemRamFreeReports(): ChromeOsDeviceSystemRamFreeReports
  // Create a new instance of ChromeOsDeviceTpmVersionInfo
  def newChromeOsDeviceTpmVersionInfo(): ChromeOsDeviceTpmVersionInfo
  // Create a new instance of ChromeOsMoveDevicesToOu
  def newChromeOsMoveDevicesToOu(): ChromeOsMoveDevicesToOu
  // Create a new instance of Customer
  def newCustomer(): Customer
  // Create a new instance of CustomerPostalAddress
  def newCustomerPostalAddress(): CustomerPostalAddress
  // Create a new instance of DomainAlias
  def newDomainAlias(): DomainAlias
  // Create a new instance of Domains
  def newDomains(): Domains
  // Create a new instance of Feature
  def newFeature(): Feature
  // Create a new instance of FeatureRename
  def newFeatureRename(): FeatureRename
  // Create a new instance of Group
  def newGroup(): Group
  // Create a new instance of Member
  def newMember(): Member
  // Create a new instance of MobileDeviceAction
  def newMobileDeviceAction(): MobileDeviceAction
  // Create a new instance of Notification
  def newNotification(): Notification
  // Create a new instance of OrgUnit
  def newOrgUnit(): OrgUnit
  // Create a new instance of Role
  def newRole(): Role
  // Create a new instance of RoleAssignment
  def newRoleAssignment(): RoleAssignment
  // Create a new instance of RoleRolePrivileges
  def newRoleRolePrivileges(): RoleRolePrivileges
  // Create a new instance of Schema
  def newSchema(): Schema
  // Create a new instance of SchemaFieldSpec
  def newSchemaFieldSpec(): SchemaFieldSpec
  // Create a new instance of SchemaFieldSpecNumericIndexingSpec
  def newSchemaFieldSpecNumericIndexingSpec(): SchemaFieldSpecNumericIndexingSpec
  // Create a new instance of User
  def newUser(): User
  // Create a new instance of UserMakeAdmin
  def newUserMakeAdmin(): UserMakeAdmin
  // Create a new instance of UserName
  def newUserName(): UserName
  // Create a new instance of UserPhoto
  def newUserPhoto(): UserPhoto
  // Create a new instance of UserUndelete
  def newUserUndelete(): UserUndelete
}

object AdminDirectory_ {
  @scala.inline
  def apply(
    newAlias: CallbackTo[Alias],
    newBuilding: CallbackTo[Building],
    newBuildingAddress: CallbackTo[BuildingAddress],
    newBuildingCoordinates: CallbackTo[BuildingCoordinates],
    newCalendarResource: CallbackTo[CalendarResource],
    newChannel: CallbackTo[Channel],
    newChromeOsDevice: CallbackTo[ChromeOsDevice],
    newChromeOsDeviceAction: CallbackTo[ChromeOsDeviceAction],
    newChromeOsDeviceActiveTimeRanges: CallbackTo[ChromeOsDeviceActiveTimeRanges],
    newChromeOsDeviceCpuStatusReports: CallbackTo[ChromeOsDeviceCpuStatusReports],
    newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo: CallbackTo[ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo],
    newChromeOsDeviceDeviceFiles: CallbackTo[ChromeOsDeviceDeviceFiles],
    newChromeOsDeviceDiskVolumeReports: CallbackTo[ChromeOsDeviceDiskVolumeReports],
    newChromeOsDeviceDiskVolumeReportsVolumeInfo: CallbackTo[ChromeOsDeviceDiskVolumeReportsVolumeInfo],
    newChromeOsDeviceRecentUsers: CallbackTo[ChromeOsDeviceRecentUsers],
    newChromeOsDeviceSystemRamFreeReports: CallbackTo[ChromeOsDeviceSystemRamFreeReports],
    newChromeOsDeviceTpmVersionInfo: CallbackTo[ChromeOsDeviceTpmVersionInfo],
    newChromeOsMoveDevicesToOu: CallbackTo[ChromeOsMoveDevicesToOu],
    newCustomer: CallbackTo[Customer],
    newCustomerPostalAddress: CallbackTo[CustomerPostalAddress],
    newDomainAlias: CallbackTo[DomainAlias],
    newDomains: CallbackTo[Domains],
    newFeature: CallbackTo[Feature],
    newFeatureRename: CallbackTo[FeatureRename],
    newGroup: CallbackTo[Group],
    newMember: CallbackTo[Member],
    newMobileDeviceAction: CallbackTo[MobileDeviceAction],
    newNotification: CallbackTo[Notification],
    newOrgUnit: CallbackTo[OrgUnit],
    newRole: CallbackTo[Role],
    newRoleAssignment: CallbackTo[RoleAssignment],
    newRoleRolePrivileges: CallbackTo[RoleRolePrivileges],
    newSchema: CallbackTo[Schema],
    newSchemaFieldSpec: CallbackTo[SchemaFieldSpec],
    newSchemaFieldSpecNumericIndexingSpec: CallbackTo[SchemaFieldSpecNumericIndexingSpec],
    newUser: CallbackTo[User],
    newUserMakeAdmin: CallbackTo[UserMakeAdmin],
    newUserName: CallbackTo[UserName],
    newUserPhoto: CallbackTo[UserPhoto],
    newUserUndelete: CallbackTo[UserUndelete],
    Asps: AspsCollection = null,
    Channels: ChannelsCollection = null,
    Chromeosdevices: ChromeosdevicesCollection = null,
    Customers: CustomersCollection = null,
    DomainAliases: DomainAliasesCollection = null,
    Domains: DomainsCollection = null,
    Groups: GroupsCollection = null,
    Members: MembersCollection = null,
    Mobiledevices: MobiledevicesCollection = null,
    Notifications: NotificationsCollection = null,
    Orgunits: OrgunitsCollection = null,
    Privileges: PrivilegesCollection = null,
    ResolvedAppAccessSettings: ResolvedAppAccessSettingsCollection = null,
    Resources: ResourcesCollection = null,
    RoleAssignments: RoleAssignmentsCollection = null,
    Roles: RolesCollection = null,
    Schemas: SchemasCollection = null,
    Tokens: TokensCollection = null,
    Users: UsersCollection = null,
    VerificationCodes: VerificationCodesCollection = null
  ): AdminDirectory_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAlias")(newAlias.toJsFn)
    __obj.updateDynamic("newBuilding")(newBuilding.toJsFn)
    __obj.updateDynamic("newBuildingAddress")(newBuildingAddress.toJsFn)
    __obj.updateDynamic("newBuildingCoordinates")(newBuildingCoordinates.toJsFn)
    __obj.updateDynamic("newCalendarResource")(newCalendarResource.toJsFn)
    __obj.updateDynamic("newChannel")(newChannel.toJsFn)
    __obj.updateDynamic("newChromeOsDevice")(newChromeOsDevice.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceAction")(newChromeOsDeviceAction.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceActiveTimeRanges")(newChromeOsDeviceActiveTimeRanges.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceCpuStatusReports")(newChromeOsDeviceCpuStatusReports.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo")(newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceDeviceFiles")(newChromeOsDeviceDeviceFiles.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceDiskVolumeReports")(newChromeOsDeviceDiskVolumeReports.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceDiskVolumeReportsVolumeInfo")(newChromeOsDeviceDiskVolumeReportsVolumeInfo.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceRecentUsers")(newChromeOsDeviceRecentUsers.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceSystemRamFreeReports")(newChromeOsDeviceSystemRamFreeReports.toJsFn)
    __obj.updateDynamic("newChromeOsDeviceTpmVersionInfo")(newChromeOsDeviceTpmVersionInfo.toJsFn)
    __obj.updateDynamic("newChromeOsMoveDevicesToOu")(newChromeOsMoveDevicesToOu.toJsFn)
    __obj.updateDynamic("newCustomer")(newCustomer.toJsFn)
    __obj.updateDynamic("newCustomerPostalAddress")(newCustomerPostalAddress.toJsFn)
    __obj.updateDynamic("newDomainAlias")(newDomainAlias.toJsFn)
    __obj.updateDynamic("newDomains")(newDomains.toJsFn)
    __obj.updateDynamic("newFeature")(newFeature.toJsFn)
    __obj.updateDynamic("newFeatureRename")(newFeatureRename.toJsFn)
    __obj.updateDynamic("newGroup")(newGroup.toJsFn)
    __obj.updateDynamic("newMember")(newMember.toJsFn)
    __obj.updateDynamic("newMobileDeviceAction")(newMobileDeviceAction.toJsFn)
    __obj.updateDynamic("newNotification")(newNotification.toJsFn)
    __obj.updateDynamic("newOrgUnit")(newOrgUnit.toJsFn)
    __obj.updateDynamic("newRole")(newRole.toJsFn)
    __obj.updateDynamic("newRoleAssignment")(newRoleAssignment.toJsFn)
    __obj.updateDynamic("newRoleRolePrivileges")(newRoleRolePrivileges.toJsFn)
    __obj.updateDynamic("newSchema")(newSchema.toJsFn)
    __obj.updateDynamic("newSchemaFieldSpec")(newSchemaFieldSpec.toJsFn)
    __obj.updateDynamic("newSchemaFieldSpecNumericIndexingSpec")(newSchemaFieldSpecNumericIndexingSpec.toJsFn)
    __obj.updateDynamic("newUser")(newUser.toJsFn)
    __obj.updateDynamic("newUserMakeAdmin")(newUserMakeAdmin.toJsFn)
    __obj.updateDynamic("newUserName")(newUserName.toJsFn)
    __obj.updateDynamic("newUserPhoto")(newUserPhoto.toJsFn)
    __obj.updateDynamic("newUserUndelete")(newUserUndelete.toJsFn)
    if (Asps != null) __obj.updateDynamic("Asps")(Asps.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Chromeosdevices != null) __obj.updateDynamic("Chromeosdevices")(Chromeosdevices.asInstanceOf[js.Any])
    if (Customers != null) __obj.updateDynamic("Customers")(Customers.asInstanceOf[js.Any])
    if (DomainAliases != null) __obj.updateDynamic("DomainAliases")(DomainAliases.asInstanceOf[js.Any])
    if (Domains != null) __obj.updateDynamic("Domains")(Domains.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (Mobiledevices != null) __obj.updateDynamic("Mobiledevices")(Mobiledevices.asInstanceOf[js.Any])
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications.asInstanceOf[js.Any])
    if (Orgunits != null) __obj.updateDynamic("Orgunits")(Orgunits.asInstanceOf[js.Any])
    if (Privileges != null) __obj.updateDynamic("Privileges")(Privileges.asInstanceOf[js.Any])
    if (ResolvedAppAccessSettings != null) __obj.updateDynamic("ResolvedAppAccessSettings")(ResolvedAppAccessSettings.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (RoleAssignments != null) __obj.updateDynamic("RoleAssignments")(RoleAssignments.asInstanceOf[js.Any])
    if (Roles != null) __obj.updateDynamic("Roles")(Roles.asInstanceOf[js.Any])
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas.asInstanceOf[js.Any])
    if (Tokens != null) __obj.updateDynamic("Tokens")(Tokens.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    if (VerificationCodes != null) __obj.updateDynamic("VerificationCodes")(VerificationCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDirectory_]
  }
}

