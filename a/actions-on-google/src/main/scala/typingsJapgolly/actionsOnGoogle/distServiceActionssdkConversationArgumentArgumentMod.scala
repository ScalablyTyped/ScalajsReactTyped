package typingsJapgolly.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.COMPLETE_PURCHASE_VALUE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.CONFIRMATION
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.DATETIME
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_VALUE
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.DIGITAL_PURCHASE_CHECK_RESULT
import typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.IS_FINAL_REPROMPT
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
import typingsJapgolly.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Argument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationArgumentMediaMod.MediaStatusArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationArgumentNoinputMod.FinalRepromptArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationArgumentNoinputMod.RepromptArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperConfirmationMod.ConfirmationArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionUserIdArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperSigninMod.SignInArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionCompletepurchaseMod.CompletePurchaseArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDecisionMod.TransactionDecisionArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDeliveryaddressMod.DeliveryAddressArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionDigitalpurchasecheckMod.DigitalPurchaseCheckArgument
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionRequirementsMod.TransactionRequirementsArgument
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationArgumentArgumentMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Arguments")
  @js.native
  /** @hidden */
  open class Arguments () extends StObject {
    def this(raw: js.Array[GoogleActionsV2Argument]) = this()
    
    /** @public */
    def get(name: String): Argument = js.native
    @JSName("get")
    def get_COMPLETEPURCHASEVALUE(name: COMPLETE_PURCHASE_VALUE): js.UndefOr[CompletePurchaseArgument] = js.native
    @JSName("get")
    def get_CONFIRMATION(name: CONFIRMATION): js.UndefOr[ConfirmationArgument] = js.native
    @JSName("get")
    def get_DATETIME(name: DATETIME): js.UndefOr[DateTimeArgument] = js.native
    @JSName("get")
    def get_DELIVERYADDRESSVALUE(name: DELIVERY_ADDRESS_VALUE): js.UndefOr[DeliveryAddressArgument] = js.native
    @JSName("get")
    def get_DIGITALPURCHASECHECKRESULT(name: DIGITAL_PURCHASE_CHECK_RESULT): js.UndefOr[DigitalPurchaseCheckArgument] = js.native
    @JSName("get")
    def get_ISFINALREPROMPT(name: IS_FINAL_REPROMPT): js.UndefOr[FinalRepromptArgument] = js.native
    @JSName("get")
    def get_MEDIASTATUS(name: MEDIA_STATUS): js.UndefOr[MediaStatusArgument] = js.native
    @JSName("get")
    def get_NEWSURFACE(name: NEW_SURFACE): js.UndefOr[NewSurfaceArgument] = js.native
    @JSName("get")
    def get_OPTION(name: OPTION): js.UndefOr[OptionArgument] = js.native
    /**
      * Get the argument value by name from the current intent.
      * The first property value not named `name` or `status` will be returned.
      * Will retrieve `textValue` last.
      * If there is no other properties, return undefined.
      *
      * @example
      * ```javascript
      *
      * // Actions SDK
      * app.intent('actions.intent.PERMISSION', conv => {
      *   const granted = conv.arguments.get('PERMISSION') // boolean true if granted, false if not
      * })
      *
      * // Dialogflow
      * // Create a Dialogflow intent with the `actions_intent_PERMISSION` event
      * app.intent('Get Permission', conv => {
      *   const granted = conv.arguments.get('PERMISSION') // boolean true if granted, false if not
      * })
      * ```
      *
      * @param argument Name of the argument.
      * @return First property not named 'name' or 'status' with 'textValue' given last priority
      *     or undefined if no other properties.
      *
      * @public
      */
    @JSName("get")
    def get_PERMISSION(name: PERMISSION): js.UndefOr[PermissionArgument] = js.native
    @JSName("get")
    def get_PLACE(name: PLACE): js.UndefOr[PlaceArgument] = js.native
    @JSName("get")
    def get_REGISTERUPDATE(name: REGISTER_UPDATE): js.UndefOr[RegisterUpdateArgument] = js.native
    @JSName("get")
    def get_REPROMPTCOUNT(name: REPROMPT_COUNT): js.UndefOr[RepromptArgument] = js.native
    @JSName("get")
    def get_SIGNIN(name: SIGN_IN): js.UndefOr[SignInArgument] = js.native
    @JSName("get")
    def get_TRANSACTIONDECISIONVALUE(name: TRANSACTION_DECISION_VALUE): js.UndefOr[TransactionDecisionArgument] = js.native
    @JSName("get")
    def get_TRANSACTIONREQUIREMENTSCHECKRESULT(name: TRANSACTION_REQUIREMENTS_CHECK_RESULT): js.UndefOr[TransactionRequirementsArgument] = js.native
    @JSName("get")
    def get_UPDATESUSERID(name: UPDATES_USER_ID): js.UndefOr[UpdatePermissionUserIdArgument] = js.native
    
    /** @public */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[GoogleActionsV2Argument]] = js.native
    
    /** @public */
    var parsed: Parsed = js.native
    
    /** @public */
    var raw: Raw = js.native
    
    /** @public */
    var status: Status = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Parsed")
  @js.native
  open class Parsed protected () extends StObject {
    /** @hidden */
    def this(raw: js.Array[GoogleActionsV2Argument]) = this()
    
    /** @public */
    def get(name: String): Argument = js.native
    @JSName("get")
    def get_COMPLETEPURCHASEVALUE(name: COMPLETE_PURCHASE_VALUE): js.UndefOr[CompletePurchaseArgument] = js.native
    @JSName("get")
    def get_CONFIRMATION(name: CONFIRMATION): js.UndefOr[ConfirmationArgument] = js.native
    @JSName("get")
    def get_DATETIME(name: DATETIME): js.UndefOr[DateTimeArgument] = js.native
    @JSName("get")
    def get_DELIVERYADDRESSVALUE(name: DELIVERY_ADDRESS_VALUE): js.UndefOr[DeliveryAddressArgument] = js.native
    @JSName("get")
    def get_DIGITALPURCHASECHECKRESULT(name: DIGITAL_PURCHASE_CHECK_RESULT): js.UndefOr[DigitalPurchaseCheckArgument] = js.native
    @JSName("get")
    def get_ISFINALREPROMPT(name: IS_FINAL_REPROMPT): js.UndefOr[FinalRepromptArgument] = js.native
    @JSName("get")
    def get_MEDIASTATUS(name: MEDIA_STATUS): js.UndefOr[MediaStatusArgument] = js.native
    @JSName("get")
    def get_NEWSURFACE(name: NEW_SURFACE): js.UndefOr[NewSurfaceArgument] = js.native
    @JSName("get")
    def get_OPTION(name: OPTION): js.UndefOr[OptionArgument] = js.native
    /** @public */
    @JSName("get")
    def get_PERMISSION(name: PERMISSION): js.UndefOr[PermissionArgument] = js.native
    @JSName("get")
    def get_PLACE(name: PLACE): js.UndefOr[PlaceArgument] = js.native
    @JSName("get")
    def get_REGISTERUPDATE(name: REGISTER_UPDATE): js.UndefOr[RegisterUpdateArgument] = js.native
    @JSName("get")
    def get_REPROMPTCOUNT(name: REPROMPT_COUNT): js.UndefOr[RepromptArgument] = js.native
    @JSName("get")
    def get_SIGNIN(name: SIGN_IN): js.UndefOr[SignInArgument] = js.native
    @JSName("get")
    def get_TRANSACTIONDECISIONVALUE(name: TRANSACTION_DECISION_VALUE): js.UndefOr[TransactionDecisionArgument] = js.native
    @JSName("get")
    def get_TRANSACTIONREQUIREMENTSCHECKRESULT(name: TRANSACTION_REQUIREMENTS_CHECK_RESULT): js.UndefOr[TransactionRequirementsArgument] = js.native
    @JSName("get")
    def get_UPDATESUSERID(name: UPDATES_USER_ID): js.UndefOr[UpdatePermissionUserIdArgument] = js.native
    
    /** @public */
    var input: ArgumentsParsed = js.native
    
    /** @public */
    var list: js.Array[Argument] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Raw")
  @js.native
  open class Raw protected () extends StObject {
    /** @hidden */
    def this(list: js.Array[GoogleActionsV2Argument]) = this()
    
    /** @public */
    def get(name: String): GoogleActionsV2Argument = js.native
    
    /** @public */
    var input: ArgumentsRaw = js.native
    
    var list: js.Array[GoogleActionsV2Argument] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Status")
  @js.native
  open class Status protected () extends StObject {
    /** @hidden */
    def this(raw: js.Array[GoogleActionsV2Argument]) = this()
    
    /** @public */
    def get(name: String): GoogleRpcStatus = js.native
    
    /** @public */
    var input: ArgumentsStatus = js.native
    
    /** @public */
    var list: js.Array[js.UndefOr[GoogleRpcStatus]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - scala.Unit
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus
    - scala.Boolean
    - java.lang.String
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Location
    - typingsJapgolly.actionsOnGoogle.distCommonMod.ApiClientObjectMap[scala.Any]
    - typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DateTime
  */
  type Argument = js.UndefOr[_Argument | ApiClientObjectMap[Any] | Double | Boolean | String]
  
  type ArgumentsIndexable = StringDictionary[Argument]
  
  trait ArgumentsNamed extends StObject {
    
    /**
      * The complete purchase information.
      * Only use after calling {@link CompletePurchase|conv.ask(new CompletePurchase)}.
      * @public
      */
    var COMPLETE_PURCHASE_VALUE: js.UndefOr[CompletePurchaseArgument] = js.undefined
    
    /**
      * The confirmation decision.
      * Use after {@link Confirmation|conv.ask(new Confirmation)}
      * @public
      */
    var CONFIRMATION: js.UndefOr[ConfirmationArgument] = js.undefined
    
    /**
      * The user provided date and time.
      * Use after {@link DateTime|conv.ask(new DateTime)}
      * @public
      */
    var DATETIME: js.UndefOr[DateTimeArgument] = js.undefined
    
    /**
      * The order delivery address.
      * Only use after calling {@link DeliveryAddress|conv.ask(new DeliveryAddress)}.
      * @public
      */
    var DELIVERY_ADDRESS_VALUE: js.UndefOr[DeliveryAddressArgument] = js.undefined
    
    /**
      * Only use after calling {@link DigitalPurchaseCheck|conv.ask(new DigitalPurchaseCheck)}.
      * @public
      */
    var DIGITAL_PURCHASE_CHECK_RESULT: js.UndefOr[DigitalPurchaseCheckArgument] = js.undefined
    
    /**
      * True if it is the final reprompt related to silent input from the user.
      * This should be used along with the `actions.intent.NO_INPUT` intent to give the final
      * response to the user after multiple silences and should be an `conv.close`
      * which ends the conversation.
      * @public
      */
    var IS_FINAL_REPROMPT: js.UndefOr[FinalRepromptArgument] = js.undefined
    
    /**
      * The status of MEDIA_STATUS intent.
      * @public
      */
    var MEDIA_STATUS: js.UndefOr[MediaStatusArgument] = js.undefined
    
    /**
      * The result of {@link NewSurface|conv.ask(new NewSurface)}
      * True if user has triggered conversation on a new device following the
      * `actions.intent.NEW_SURFACE` intent.
      * @public
      */
    var NEW_SURFACE: js.UndefOr[NewSurfaceArgument] = js.undefined
    
    /**
      * The option key user chose from options response.
      * Only use after calling {@link List|conv.ask(new List)}
      * or {@link Carousel|conv.ask(new Carousel)}.
      * @public
      */
    var OPTION: js.UndefOr[OptionArgument] = js.undefined
    
    /**
      * True if the request follows a previous request asking for
      * permission from the user and the user granted the permission(s).
      * Otherwise, false.
      * Only use after calling {@link Permission|conv.ask(new Permission)}
      * or {@link UpdatePermission|conv.ask(new UpdatePermission)}.
      * @public
      */
    var PERMISSION: js.UndefOr[PermissionArgument] = js.undefined
    
    /**
      * The user provided place.
      * Use after {@link Place|conv.ask(new Place)}.
      * @public
      */
    var PLACE: js.UndefOr[PlaceArgument] = js.undefined
    
    /**
      * True if user accepted update registration request.
      * Used with {@link RegisterUpdate|conv.ask(new RegisterUpdate)}
      * @public
      */
    var REGISTER_UPDATE: js.UndefOr[RegisterUpdateArgument] = js.undefined
    
    /**
      * The number of subsequent reprompts related to silent input from the user.
      * This should be used along with the `actions.intent.NO_INPUT` intent to reprompt the
      * user for input in cases where the Google Assistant could not pick up any speech.
      * @public
      */
    var REPROMPT_COUNT: js.UndefOr[RepromptArgument] = js.undefined
    
    /**
      * The status of user sign in request.
      * Use after {@link SignIn|conv.ask(new SignIn)}
      * @public
      */
    var SIGN_IN: js.UndefOr[SignInArgument] = js.undefined
    
    /**
      * The transaction decision information.
      * Is object with userDecision only if user declines.
      * userDecision will be one of {@link GoogleActionsV2TransactionDecisionValueUserDecision}.
      * Only use after calling {@link TransactionDecision|conv.ask(new TransactionDecision)}.
      * @public
      */
    var TRANSACTION_DECISION_VALUE: js.UndefOr[TransactionDecisionArgument] = js.undefined
    
    /**
      * The transactability of user.
      * Only use after calling {@link TransactionRequirements|conv.ask(new TransactionRequirements)}.
      * Undefined if no result given.
      * @public
      */
    var TRANSACTION_REQUIREMENTS_CHECK_RESULT: js.UndefOr[TransactionRequirementsArgument] = js.undefined
    
    /**
      * The updates user id.
      * Only use after calling {@link UpdatePermission|conv.ask(new UpdatePermission)}.
      * @public
      */
    var UPDATES_USER_ID: js.UndefOr[UpdatePermissionUserIdArgument] = js.undefined
  }
  object ArgumentsNamed {
    
    inline def apply(): ArgumentsNamed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentsNamed]
    }
    
    extension [Self <: ArgumentsNamed](x: Self) {
      
      inline def setCOMPLETE_PURCHASE_VALUE(value: CompletePurchaseArgument): Self = StObject.set(x, "COMPLETE_PURCHASE_VALUE", value.asInstanceOf[js.Any])
      
      inline def setCOMPLETE_PURCHASE_VALUEUndefined: Self = StObject.set(x, "COMPLETE_PURCHASE_VALUE", js.undefined)
      
      inline def setCONFIRMATION(value: ConfirmationArgument): Self = StObject.set(x, "CONFIRMATION", value.asInstanceOf[js.Any])
      
      inline def setCONFIRMATIONUndefined: Self = StObject.set(x, "CONFIRMATION", js.undefined)
      
      inline def setDATETIME(value: DateTimeArgument): Self = StObject.set(x, "DATETIME", value.asInstanceOf[js.Any])
      
      inline def setDATETIMEUndefined: Self = StObject.set(x, "DATETIME", js.undefined)
      
      inline def setDELIVERY_ADDRESS_VALUE(value: DeliveryAddressArgument): Self = StObject.set(x, "DELIVERY_ADDRESS_VALUE", value.asInstanceOf[js.Any])
      
      inline def setDELIVERY_ADDRESS_VALUEUndefined: Self = StObject.set(x, "DELIVERY_ADDRESS_VALUE", js.undefined)
      
      inline def setDIGITAL_PURCHASE_CHECK_RESULT(value: DigitalPurchaseCheckArgument): Self = StObject.set(x, "DIGITAL_PURCHASE_CHECK_RESULT", value.asInstanceOf[js.Any])
      
      inline def setDIGITAL_PURCHASE_CHECK_RESULTUndefined: Self = StObject.set(x, "DIGITAL_PURCHASE_CHECK_RESULT", js.undefined)
      
      inline def setIS_FINAL_REPROMPT(value: FinalRepromptArgument): Self = StObject.set(x, "IS_FINAL_REPROMPT", value.asInstanceOf[js.Any])
      
      inline def setIS_FINAL_REPROMPTUndefined: Self = StObject.set(x, "IS_FINAL_REPROMPT", js.undefined)
      
      inline def setMEDIA_STATUS(value: MediaStatusArgument): Self = StObject.set(x, "MEDIA_STATUS", value.asInstanceOf[js.Any])
      
      inline def setMEDIA_STATUSUndefined: Self = StObject.set(x, "MEDIA_STATUS", js.undefined)
      
      inline def setNEW_SURFACE(value: NewSurfaceArgument): Self = StObject.set(x, "NEW_SURFACE", value.asInstanceOf[js.Any])
      
      inline def setNEW_SURFACEUndefined: Self = StObject.set(x, "NEW_SURFACE", js.undefined)
      
      inline def setOPTION(value: OptionArgument): Self = StObject.set(x, "OPTION", value.asInstanceOf[js.Any])
      
      inline def setOPTIONUndefined: Self = StObject.set(x, "OPTION", js.undefined)
      
      inline def setPERMISSION(value: PermissionArgument): Self = StObject.set(x, "PERMISSION", value.asInstanceOf[js.Any])
      
      inline def setPERMISSIONUndefined: Self = StObject.set(x, "PERMISSION", js.undefined)
      
      inline def setPLACE(value: PlaceArgument): Self = StObject.set(x, "PLACE", value.asInstanceOf[js.Any])
      
      inline def setPLACEUndefined: Self = StObject.set(x, "PLACE", js.undefined)
      
      inline def setREGISTER_UPDATE(value: RegisterUpdateArgument): Self = StObject.set(x, "REGISTER_UPDATE", value.asInstanceOf[js.Any])
      
      inline def setREGISTER_UPDATEUndefined: Self = StObject.set(x, "REGISTER_UPDATE", js.undefined)
      
      inline def setREPROMPT_COUNT(value: RepromptArgument): Self = StObject.set(x, "REPROMPT_COUNT", value.asInstanceOf[js.Any])
      
      inline def setREPROMPT_COUNTUndefined: Self = StObject.set(x, "REPROMPT_COUNT", js.undefined)
      
      inline def setSIGN_IN(value: SignInArgument): Self = StObject.set(x, "SIGN_IN", value.asInstanceOf[js.Any])
      
      inline def setSIGN_INUndefined: Self = StObject.set(x, "SIGN_IN", js.undefined)
      
      inline def setTRANSACTION_DECISION_VALUE(value: TransactionDecisionArgument): Self = StObject.set(x, "TRANSACTION_DECISION_VALUE", value.asInstanceOf[js.Any])
      
      inline def setTRANSACTION_DECISION_VALUEUndefined: Self = StObject.set(x, "TRANSACTION_DECISION_VALUE", js.undefined)
      
      inline def setTRANSACTION_REQUIREMENTS_CHECK_RESULT(value: TransactionRequirementsArgument): Self = StObject.set(x, "TRANSACTION_REQUIREMENTS_CHECK_RESULT", value.asInstanceOf[js.Any])
      
      inline def setTRANSACTION_REQUIREMENTS_CHECK_RESULTUndefined: Self = StObject.set(x, "TRANSACTION_REQUIREMENTS_CHECK_RESULT", js.undefined)
      
      inline def setUPDATES_USER_ID(value: UpdatePermissionUserIdArgument): Self = StObject.set(x, "UPDATES_USER_ID", value.asInstanceOf[js.Any])
      
      inline def setUPDATES_USER_IDUndefined: Self = StObject.set(x, "UPDATES_USER_ID", js.undefined)
    }
  }
  
  trait ArgumentsParsed
    extends StObject
       with ArgumentsNamed
       with /** @public */
  /* name */ StringDictionary[js.UndefOr[Argument]]
  object ArgumentsParsed {
    
    inline def apply(): ArgumentsParsed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentsParsed]
    }
  }
  
  type ArgumentsRaw = /** @public */
  StringDictionary[GoogleActionsV2Argument]
  
  type ArgumentsStatus = /** @public */
  StringDictionary[js.UndefOr[GoogleRpcStatus]]
  
  trait _Argument extends StObject
  object _Argument {
    
    inline def GoogleActionsV2DateTime(): typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DateTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DateTime]
    }
    
    inline def GoogleActionsV2Location(): typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Location]
    }
    
    inline def GoogleRpcStatus(): typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleRpcStatus]
    }
  }
}
