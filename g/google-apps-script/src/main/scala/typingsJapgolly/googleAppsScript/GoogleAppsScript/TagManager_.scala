package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Collection.AccountsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Account
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.AccountAccess
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.BuiltInVariable
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Condition
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Container
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerAccess
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.ContainerVersion
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.CreateContainerVersionRequestVersionOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.CustomTemplate
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Entity
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Environment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Folder
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Parameter
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.SetupTag
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Tag
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.TeardownTag
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Timestamp
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Trigger
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.UserPermission
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Variable
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.VariableFormatValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Workspace
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.Zone
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneBoundary
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneChildContainer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema.ZoneTypeRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagManager_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  // Create a new instance of Account
  def newAccount(): Account
  // Create a new instance of AccountAccess
  def newAccountAccess(): AccountAccess
  // Create a new instance of BuiltInVariable
  def newBuiltInVariable(): BuiltInVariable
  // Create a new instance of Condition
  def newCondition(): Condition
  // Create a new instance of Container
  def newContainer(): Container
  // Create a new instance of ContainerAccess
  def newContainerAccess(): ContainerAccess
  // Create a new instance of ContainerVersion
  def newContainerVersion(): ContainerVersion
  // Create a new instance of CreateContainerVersionRequestVersionOptions
  def newCreateContainerVersionRequestVersionOptions(): CreateContainerVersionRequestVersionOptions
  // Create a new instance of CustomTemplate
  def newCustomTemplate(): CustomTemplate
  // Create a new instance of Entity
  def newEntity(): Entity
  // Create a new instance of Environment
  def newEnvironment(): Environment
  // Create a new instance of Folder
  def newFolder(): Folder
  // Create a new instance of Parameter
  def newParameter(): Parameter
  // Create a new instance of SetupTag
  def newSetupTag(): SetupTag
  // Create a new instance of Tag
  def newTag(): Tag
  // Create a new instance of TeardownTag
  def newTeardownTag(): TeardownTag
  // Create a new instance of Timestamp
  def newTimestamp(): Timestamp
  // Create a new instance of Trigger
  def newTrigger(): Trigger
  // Create a new instance of UserPermission
  def newUserPermission(): UserPermission
  // Create a new instance of Variable
  def newVariable(): Variable
  // Create a new instance of VariableFormatValue
  def newVariableFormatValue(): VariableFormatValue
  // Create a new instance of Workspace
  def newWorkspace(): Workspace
  // Create a new instance of Zone
  def newZone(): Zone
  // Create a new instance of ZoneBoundary
  def newZoneBoundary(): ZoneBoundary
  // Create a new instance of ZoneChildContainer
  def newZoneChildContainer(): ZoneChildContainer
  // Create a new instance of ZoneTypeRestriction
  def newZoneTypeRestriction(): ZoneTypeRestriction
}

object TagManager_ {
  @scala.inline
  def apply(
    newAccount: CallbackTo[Account],
    newAccountAccess: CallbackTo[AccountAccess],
    newBuiltInVariable: CallbackTo[BuiltInVariable],
    newCondition: CallbackTo[Condition],
    newContainer: CallbackTo[Container],
    newContainerAccess: CallbackTo[ContainerAccess],
    newContainerVersion: CallbackTo[ContainerVersion],
    newCreateContainerVersionRequestVersionOptions: CallbackTo[CreateContainerVersionRequestVersionOptions],
    newCustomTemplate: CallbackTo[CustomTemplate],
    newEntity: CallbackTo[Entity],
    newEnvironment: CallbackTo[Environment],
    newFolder: CallbackTo[Folder],
    newParameter: CallbackTo[Parameter],
    newSetupTag: CallbackTo[SetupTag],
    newTag: CallbackTo[Tag],
    newTeardownTag: CallbackTo[TeardownTag],
    newTimestamp: CallbackTo[Timestamp],
    newTrigger: CallbackTo[Trigger],
    newUserPermission: CallbackTo[UserPermission],
    newVariable: CallbackTo[Variable],
    newVariableFormatValue: CallbackTo[VariableFormatValue],
    newWorkspace: CallbackTo[Workspace],
    newZone: CallbackTo[Zone],
    newZoneBoundary: CallbackTo[ZoneBoundary],
    newZoneChildContainer: CallbackTo[ZoneChildContainer],
    newZoneTypeRestriction: CallbackTo[ZoneTypeRestriction],
    Accounts: AccountsCollection = null
  ): TagManager_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAccount")(newAccount.toJsFn)
    __obj.updateDynamic("newAccountAccess")(newAccountAccess.toJsFn)
    __obj.updateDynamic("newBuiltInVariable")(newBuiltInVariable.toJsFn)
    __obj.updateDynamic("newCondition")(newCondition.toJsFn)
    __obj.updateDynamic("newContainer")(newContainer.toJsFn)
    __obj.updateDynamic("newContainerAccess")(newContainerAccess.toJsFn)
    __obj.updateDynamic("newContainerVersion")(newContainerVersion.toJsFn)
    __obj.updateDynamic("newCreateContainerVersionRequestVersionOptions")(newCreateContainerVersionRequestVersionOptions.toJsFn)
    __obj.updateDynamic("newCustomTemplate")(newCustomTemplate.toJsFn)
    __obj.updateDynamic("newEntity")(newEntity.toJsFn)
    __obj.updateDynamic("newEnvironment")(newEnvironment.toJsFn)
    __obj.updateDynamic("newFolder")(newFolder.toJsFn)
    __obj.updateDynamic("newParameter")(newParameter.toJsFn)
    __obj.updateDynamic("newSetupTag")(newSetupTag.toJsFn)
    __obj.updateDynamic("newTag")(newTag.toJsFn)
    __obj.updateDynamic("newTeardownTag")(newTeardownTag.toJsFn)
    __obj.updateDynamic("newTimestamp")(newTimestamp.toJsFn)
    __obj.updateDynamic("newTrigger")(newTrigger.toJsFn)
    __obj.updateDynamic("newUserPermission")(newUserPermission.toJsFn)
    __obj.updateDynamic("newVariable")(newVariable.toJsFn)
    __obj.updateDynamic("newVariableFormatValue")(newVariableFormatValue.toJsFn)
    __obj.updateDynamic("newWorkspace")(newWorkspace.toJsFn)
    __obj.updateDynamic("newZone")(newZone.toJsFn)
    __obj.updateDynamic("newZoneBoundary")(newZoneBoundary.toJsFn)
    __obj.updateDynamic("newZoneChildContainer")(newZoneChildContainer.toJsFn)
    __obj.updateDynamic("newZoneTypeRestriction")(newZoneTypeRestriction.toJsFn)
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagManager_]
  }
}

