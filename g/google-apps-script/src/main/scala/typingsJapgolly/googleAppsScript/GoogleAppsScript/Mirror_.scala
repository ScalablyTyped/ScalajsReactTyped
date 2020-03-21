package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection.AccountsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection.ContactsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection.LocationsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection.SettingsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection.SubscriptionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection.TimelineCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Attachment
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.AuthToken
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Command
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Contact
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Location
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.MenuValue
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Notification
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.NotificationConfig
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.TimelineItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserAction
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.UserData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mirror_ extends js.Object {
  var Accounts: js.UndefOr[AccountsCollection] = js.undefined
  var Contacts: js.UndefOr[ContactsCollection] = js.undefined
  var Locations: js.UndefOr[LocationsCollection] = js.undefined
  var Settings: js.UndefOr[SettingsCollection] = js.undefined
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.undefined
  var Timeline: js.UndefOr[TimelineCollection] = js.undefined
  // Create a new instance of Account
  def newAccount(): Account
  // Create a new instance of Attachment
  def newAttachment(): Attachment
  // Create a new instance of AuthToken
  def newAuthToken(): AuthToken
  // Create a new instance of Command
  def newCommand(): Command
  // Create a new instance of Contact
  def newContact(): Contact
  // Create a new instance of Location
  def newLocation(): Location
  // Create a new instance of MenuItem
  def newMenuItem(): MenuItem
  // Create a new instance of MenuValue
  def newMenuValue(): MenuValue
  // Create a new instance of Notification
  def newNotification(): Notification
  // Create a new instance of NotificationConfig
  def newNotificationConfig(): NotificationConfig
  // Create a new instance of Subscription
  def newSubscription(): Subscription
  // Create a new instance of TimelineItem
  def newTimelineItem(): TimelineItem
  // Create a new instance of UserAction
  def newUserAction(): UserAction
  // Create a new instance of UserData
  def newUserData(): UserData
}

object Mirror_ {
  @scala.inline
  def apply(
    newAccount: CallbackTo[Account],
    newAttachment: CallbackTo[Attachment],
    newAuthToken: CallbackTo[AuthToken],
    newCommand: CallbackTo[Command],
    newContact: CallbackTo[Contact],
    newLocation: CallbackTo[Location],
    newMenuItem: CallbackTo[MenuItem],
    newMenuValue: CallbackTo[MenuValue],
    newNotification: CallbackTo[Notification],
    newNotificationConfig: CallbackTo[NotificationConfig],
    newSubscription: CallbackTo[Subscription],
    newTimelineItem: CallbackTo[TimelineItem],
    newUserAction: CallbackTo[UserAction],
    newUserData: CallbackTo[UserData],
    Accounts: AccountsCollection = null,
    Contacts: ContactsCollection = null,
    Locations: LocationsCollection = null,
    Settings: SettingsCollection = null,
    Subscriptions: SubscriptionsCollection = null,
    Timeline: TimelineCollection = null
  ): Mirror_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAccount")(newAccount.toJsFn)
    __obj.updateDynamic("newAttachment")(newAttachment.toJsFn)
    __obj.updateDynamic("newAuthToken")(newAuthToken.toJsFn)
    __obj.updateDynamic("newCommand")(newCommand.toJsFn)
    __obj.updateDynamic("newContact")(newContact.toJsFn)
    __obj.updateDynamic("newLocation")(newLocation.toJsFn)
    __obj.updateDynamic("newMenuItem")(newMenuItem.toJsFn)
    __obj.updateDynamic("newMenuValue")(newMenuValue.toJsFn)
    __obj.updateDynamic("newNotification")(newNotification.toJsFn)
    __obj.updateDynamic("newNotificationConfig")(newNotificationConfig.toJsFn)
    __obj.updateDynamic("newSubscription")(newSubscription.toJsFn)
    __obj.updateDynamic("newTimelineItem")(newTimelineItem.toJsFn)
    __obj.updateDynamic("newUserAction")(newUserAction.toJsFn)
    __obj.updateDynamic("newUserData")(newUserData.toJsFn)
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (Contacts != null) __obj.updateDynamic("Contacts")(Contacts.asInstanceOf[js.Any])
    if (Locations != null) __obj.updateDynamic("Locations")(Locations.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    if (Timeline != null) __obj.updateDynamic("Timeline")(Timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mirror_]
  }
}

