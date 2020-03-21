package typingsJapgolly.actionsOnGoogle.argumentArgumentMod

import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.COMPLETE_PURCHASE_VALUE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.CONFIRMATION
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.DATETIME
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_VALUE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.DIGITAL_PURCHASE_CHECK_RESULT
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.IS_FINAL_REPROMPT
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.LINK
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.MEDIA_STATUS
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.NEW_SURFACE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.OPTION
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PERMISSION
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.PLACE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.REGISTER_UPDATE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.REPROMPT_COUNT
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.SIGN_IN
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_DECISION_VALUE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_REQUIREMENTS_CHECK_RESULT
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.UPDATES_USER_ID
import typingsJapgolly.actionsOnGoogle.completepurchaseMod.CompletePurchaseArgument
import typingsJapgolly.actionsOnGoogle.confirmationMod.ConfirmationArgument
import typingsJapgolly.actionsOnGoogle.datetimeMod.DateTimeArgument
import typingsJapgolly.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import typingsJapgolly.actionsOnGoogle.deeplinkMod.DeepLinkArgument
import typingsJapgolly.actionsOnGoogle.deliveryaddressMod.DeliveryAddressArgument
import typingsJapgolly.actionsOnGoogle.digitalpurchasecheckMod.DigitalPurchaseCheckArgument
import typingsJapgolly.actionsOnGoogle.mediaMod.MediaStatusArgument
import typingsJapgolly.actionsOnGoogle.newsurfaceMod.NewSurfaceArgument
import typingsJapgolly.actionsOnGoogle.noinputMod.FinalRepromptArgument
import typingsJapgolly.actionsOnGoogle.noinputMod.RepromptArgument
import typingsJapgolly.actionsOnGoogle.optionOptionMod.OptionArgument
import typingsJapgolly.actionsOnGoogle.permissionPermissionMod.PermissionArgument
import typingsJapgolly.actionsOnGoogle.placeMod.PlaceArgument
import typingsJapgolly.actionsOnGoogle.registerupdateMod.RegisterUpdateArgument
import typingsJapgolly.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import typingsJapgolly.actionsOnGoogle.signinMod.SignInArgument
import typingsJapgolly.actionsOnGoogle.updateMod.UpdatePermissionUserIdArgument
import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Parsed")
@js.native
class Parsed protected () extends js.Object {
  /** @hidden */
  def this(raw: js.Array[GoogleActionsV2Argument]) = this()
  /** @public */
  var input: ArgumentsParsed = js.native
  /** @public */
  var list: js.Array[Argument] = js.native
  /** @public */
  def get(name: String): Argument = js.native
  @JSName("get")
  def get_COMPLETEPURCHASEVALUE(name: COMPLETE_PURCHASE_VALUE): CompletePurchaseArgument = js.native
  @JSName("get")
  def get_CONFIRMATION(name: CONFIRMATION): ConfirmationArgument = js.native
  @JSName("get")
  def get_DATETIME(name: DATETIME): DateTimeArgument = js.native
  @JSName("get")
  def get_DELIVERYADDRESSVALUE(name: DELIVERY_ADDRESS_VALUE): DeliveryAddressArgument = js.native
  @JSName("get")
  def get_DIGITALPURCHASECHECKRESULT(name: DIGITAL_PURCHASE_CHECK_RESULT): DigitalPurchaseCheckArgument = js.native
  @JSName("get")
  def get_ISFINALREPROMPT(name: IS_FINAL_REPROMPT): FinalRepromptArgument = js.native
  @JSName("get")
  def get_LINK(name: LINK): DeepLinkArgument = js.native
  @JSName("get")
  def get_MEDIASTATUS(name: MEDIA_STATUS): MediaStatusArgument = js.native
  @JSName("get")
  def get_NEWSURFACE(name: NEW_SURFACE): NewSurfaceArgument = js.native
  @JSName("get")
  def get_OPTION(name: OPTION): OptionArgument = js.native
  /** @public */
  @JSName("get")
  def get_PERMISSION(name: PERMISSION): PermissionArgument = js.native
  @JSName("get")
  def get_PLACE(name: PLACE): PlaceArgument = js.native
  @JSName("get")
  def get_REGISTERUPDATE(name: REGISTER_UPDATE): RegisterUpdateArgument = js.native
  @JSName("get")
  def get_REPROMPTCOUNT(name: REPROMPT_COUNT): RepromptArgument = js.native
  @JSName("get")
  def get_SIGNIN(name: SIGN_IN): SignInArgument = js.native
  @JSName("get")
  def get_TRANSACTIONDECISIONVALUE(name: TRANSACTION_DECISION_VALUE): TransactionDecisionArgument = js.native
  @JSName("get")
  def get_TRANSACTIONREQUIREMENTSCHECKRESULT(name: TRANSACTION_REQUIREMENTS_CHECK_RESULT): TransactionRequirementsArgument = js.native
  @JSName("get")
  def get_UPDATESUSERID(name: UPDATES_USER_ID): UpdatePermissionUserIdArgument = js.native
}

