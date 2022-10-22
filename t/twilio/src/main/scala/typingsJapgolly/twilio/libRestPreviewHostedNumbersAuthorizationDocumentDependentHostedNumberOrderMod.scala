package typingsJapgolly.twilio

import japgolly.scalajs.react.Callback
import typingsJapgolly.twilio.libBasePageMod.TwilioResponsePayload
import typingsJapgolly.twilio.libInterfacesMod.PhoneNumberCapabilities
import typingsJapgolly.twilio.libInterfacesMod.SerializableClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewHostedNumbersAuthorizationDocumentDependentHostedNumberOrderMod {
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument/dependentHostedNumberOrder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument/dependentHostedNumberOrder", "DependentHostedNumberOrderInstance")
  @js.native
  open class DependentHostedNumberOrderInstance protected () extends SerializableClass {
    /**
      * Initialize the DependentHostedNumberOrderContext
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param signingDocumentSid - LOA document sid.
      */
    def this(
      version: typingsJapgolly.twilio.libRestPreviewHostedNumbersMod.^,
      payload: DependentHostedNumberOrderPayload,
      signingDocumentSid: String
    ) = this()
    
    var accountSid: String = js.native
    
    var addressSid: String = js.native
    
    var callDelay: Double = js.native
    
    var capabilities: PhoneNumberCapabilities = js.native
    
    var ccEmails: js.Array[String] = js.native
    
    var dateCreated: js.Date = js.native
    
    var dateUpdated: js.Date = js.native
    
    var email: String = js.native
    
    var `extension`: String = js.native
    
    var failureReason: String = js.native
    
    var friendlyName: String = js.native
    
    var incomingPhoneNumberSid: String = js.native
    
    var phoneNumber: String = js.native
    
    var sid: String = js.native
    
    var signingDocumentSid: String = js.native
    
    var status: DependentHostedNumberOrderStatus = js.native
    
    var uniqueName: String = js.native
    
    var verificationAttempts: Double = js.native
    
    var verificationCallSids: js.Array[String] = js.native
    
    var verificationCode: String = js.native
    
    var verificationDocumentSid: String = js.native
    
    var verificationType: DependentHostedNumberOrderVerificationType = js.native
  }
  
  /**
    * Initialize the DependentHostedNumberOrderList
    *
    * PLEASE NOTE that this class contains preview products that are subject to
    * change. Use them with caution. If you currently do not have developer preview
    * access, please contact help@twilio.com.
    *
    * @param version - Version of the resource
    * @param signingDocumentSid - LOA document sid.
    */
  inline def DependentHostedNumberOrderList(version: typingsJapgolly.twilio.libRestPreviewHostedNumbersMod.^, signingDocumentSid: String): DependentHostedNumberOrderListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("DependentHostedNumberOrderList")(version.asInstanceOf[js.Any], signingDocumentSid.asInstanceOf[js.Any])).asInstanceOf[DependentHostedNumberOrderListInstance]
  
  @JSImport("twilio/lib/rest/preview/hosted_numbers/authorizationDocument/dependentHostedNumberOrder", "DependentHostedNumberOrderPage")
  @js.native
  open class DependentHostedNumberOrderPage protected ()
    extends typingsJapgolly.twilio.libBasePageMod.^[
          typingsJapgolly.twilio.libRestPreviewHostedNumbersMod.^, 
          DependentHostedNumberOrderPayload, 
          DependentHostedNumberOrderResource, 
          DependentHostedNumberOrderInstance
        ] {
    /**
      * Initialize the DependentHostedNumberOrderPage
      *
      * PLEASE NOTE that this class contains preview products that are subject to
      * change. Use them with caution. If you currently do not have developer preview
      * access, please contact help@twilio.com.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typingsJapgolly.twilio.libRestPreviewHostedNumbersMod.^,
      response: typingsJapgolly.twilio.libHttpResponseMod.^[String],
      solution: DependentHostedNumberOrderSolution
    ) = this()
    
    /**
      * Build an instance of DependentHostedNumberOrderInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: DependentHostedNumberOrderPayload): DependentHostedNumberOrderInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @js.native
  trait DependentHostedNumberOrderListInstance extends StObject {
    
    /**
      * Streams DependentHostedNumberOrderInstance records from the API.
      *
      * This operation lazily loads records as efficiently as possible until the limit
      * is reached.
      *
      * The results are passed into the callback function, so this operation is memory
      * efficient.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Function to process each record
      */
    def each(): Unit = js.native
    def each(
      callback: js.Function2[
          /* item */ DependentHostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(
      opts: Unit,
      callback: js.Function2[
          /* item */ DependentHostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    def each(opts: DependentHostedNumberOrderListInstanceEachOptions): Unit = js.native
    def each(
      opts: DependentHostedNumberOrderListInstanceEachOptions,
      callback: js.Function2[
          /* item */ DependentHostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Retrieve a single target page of DependentHostedNumberOrderInstance records from
      * the API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def getPage(): js.Promise[DependentHostedNumberOrderPage] = js.native
    def getPage(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    def getPage(targetUrl: String): js.Promise[DependentHostedNumberOrderPage] = js.native
    def getPage(
      targetUrl: String,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    def getPage(
      targetUrl: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    
    /**
      * Lists DependentHostedNumberOrderInstance records from the API as a list.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def list(): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    def list(
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[DependentHostedNumberOrderInstance], 
          Any
        ]
    ): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    def list(
      opts: Unit,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[DependentHostedNumberOrderInstance], 
          Any
        ]
    ): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    def list(opts: DependentHostedNumberOrderListInstanceOptions): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    def list(
      opts: DependentHostedNumberOrderListInstanceOptions,
      callback: js.Function2[
          /* error */ js.Error | Null, 
          /* items */ js.Array[DependentHostedNumberOrderInstance], 
          Any
        ]
    ): js.Promise[js.Array[DependentHostedNumberOrderInstance]] = js.native
    
    /**
      * Retrieve a single page of DependentHostedNumberOrderInstance records from the
      * API.
      *
      * The request is executed immediately.
      *
      * If a function is passed as the first argument, it will be used as the callback
      * function.
      *
      * @param callback - Callback to handle list of records
      */
    def page(): js.Promise[DependentHostedNumberOrderPage] = js.native
    def page(
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    def page(
      opts: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    def page(opts: DependentHostedNumberOrderListInstancePageOptions): js.Promise[DependentHostedNumberOrderPage] = js.native
    def page(
      opts: DependentHostedNumberOrderListInstancePageOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* items */ DependentHostedNumberOrderPage, Any]
    ): js.Promise[DependentHostedNumberOrderPage] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  /**
    * Options to pass to each
    *
    * @property callback -
    *                         Function to process each record. If this and a positional
    *                         callback are passed, this one will be used
    * @property done - Function to be called upon completion of streaming
    * @property friendlyName - A human readable description of this resource.
    * @property incomingPhoneNumberSid - IncomingPhoneNumber sid.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         each() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no pageSize is defined but a limit is defined,
    *                         each() will attempt to read the limit with the most efficient
    *                         page size, i.e. min(limit, 1000)
    * @property phoneNumber - An E164 formatted phone number.
    * @property status - The Status of this HostedNumberOrder.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    */
  trait DependentHostedNumberOrderListInstanceEachOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[
          /* item */ DependentHostedNumberOrderInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var done: js.UndefOr[js.Function] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[DependentHostedNumberOrderStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DependentHostedNumberOrderListInstanceEachOptions {
    
    inline def apply(): DependentHostedNumberOrderListInstanceEachOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentHostedNumberOrderListInstanceEachOptions]
    }
    
    extension [Self <: DependentHostedNumberOrderListInstanceEachOptions](x: Self) {
      
      inline def setCallback(
        value: (/* item */ DependentHostedNumberOrderInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Callback
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* item */ DependentHostedNumberOrderInstance, t1: /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: js.Function): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  /**
    * Options to pass to list
    *
    * @property friendlyName - A human readable description of this resource.
    * @property incomingPhoneNumberSid - IncomingPhoneNumber sid.
    * @property limit -
    *                         Upper limit for the number of records to return.
    *                         list() guarantees never to return more than limit.
    *                         Default is no limit
    * @property pageSize -
    *                         Number of records to fetch per request,
    *                         when not set will use the default value of 50 records.
    *                         If no page_size is defined but a limit is defined,
    *                         list() will attempt to read the limit with the most
    *                         efficient page size, i.e. min(limit, 1000)
    * @property phoneNumber - An E164 formatted phone number.
    * @property status - The Status of this HostedNumberOrder.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    */
  trait DependentHostedNumberOrderListInstanceOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[DependentHostedNumberOrderStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DependentHostedNumberOrderListInstanceOptions {
    
    inline def apply(): DependentHostedNumberOrderListInstanceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentHostedNumberOrderListInstanceOptions]
    }
    
    extension [Self <: DependentHostedNumberOrderListInstanceOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  /**
    * Options to pass to page
    *
    * @property friendlyName - A human readable description of this resource.
    * @property incomingPhoneNumberSid - IncomingPhoneNumber sid.
    * @property pageNumber - Page Number, this value is simply for client state
    * @property pageSize - Number of records to return, defaults to 50
    * @property pageToken - PageToken provided by the API
    * @property phoneNumber - An E164 formatted phone number.
    * @property status - The Status of this HostedNumberOrder.
    * @property uniqueName - A unique, developer assigned name of this HostedNumberOrder.
    */
  trait DependentHostedNumberOrderListInstancePageOptions extends StObject {
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var incomingPhoneNumberSid: js.UndefOr[String] = js.undefined
    
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var pageToken: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[DependentHostedNumberOrderStatus] = js.undefined
    
    var uniqueName: js.UndefOr[String] = js.undefined
  }
  object DependentHostedNumberOrderListInstancePageOptions {
    
    inline def apply(): DependentHostedNumberOrderListInstancePageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentHostedNumberOrderListInstancePageOptions]
    }
    
    extension [Self <: DependentHostedNumberOrderListInstancePageOptions](x: Self) {
      
      inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      inline def setIncomingPhoneNumberSid(value: String): Self = StObject.set(x, "incomingPhoneNumberSid", value.asInstanceOf[js.Any])
      
      inline def setIncomingPhoneNumberSidUndefined: Self = StObject.set(x, "incomingPhoneNumberSid", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
      
      inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
    }
  }
  
  trait DependentHostedNumberOrderPayload
    extends StObject
       with DependentHostedNumberOrderResource
       with TwilioResponsePayload
  object DependentHostedNumberOrderPayload {
    
    inline def apply(
      account_sid: String,
      address_sid: String,
      call_delay: Double,
      capabilities: PhoneNumberCapabilities,
      cc_emails: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      `extension`: String,
      failure_reason: String,
      first_page_uri: String,
      friendly_name: String,
      incoming_phone_number_sid: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      phone_number: String,
      previous_page_uri: String,
      sid: String,
      signing_document_sid: String,
      status: DependentHostedNumberOrderStatus,
      unique_name: String,
      uri: String,
      verification_attempts: Double,
      verification_call_sids: js.Array[String],
      verification_code: String,
      verification_document_sid: String,
      verification_type: DependentHostedNumberOrderVerificationType
    ): DependentHostedNumberOrderPayload = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_sid = address_sid.asInstanceOf[js.Any], call_delay = call_delay.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], failure_reason = failure_reason.asInstanceOf[js.Any], first_page_uri = first_page_uri.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], incoming_phone_number_sid = incoming_phone_number_sid.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signing_document_sid = signing_document_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], verification_attempts = verification_attempts.asInstanceOf[js.Any], verification_call_sids = verification_call_sids.asInstanceOf[js.Any], verification_code = verification_code.asInstanceOf[js.Any], verification_document_sid = verification_document_sid.asInstanceOf[js.Any], verification_type = verification_type.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependentHostedNumberOrderPayload]
    }
  }
  
  trait DependentHostedNumberOrderResource extends StObject {
    
    var account_sid: String
    
    var address_sid: String
    
    var call_delay: Double
    
    var capabilities: PhoneNumberCapabilities
    
    var cc_emails: js.Array[String]
    
    var date_created: js.Date
    
    var date_updated: js.Date
    
    var email: String
    
    var `extension`: String
    
    var failure_reason: String
    
    var friendly_name: String
    
    var incoming_phone_number_sid: String
    
    var phone_number: String
    
    var sid: String
    
    var signing_document_sid: String
    
    var status: DependentHostedNumberOrderStatus
    
    var unique_name: String
    
    var verification_attempts: Double
    
    var verification_call_sids: js.Array[String]
    
    var verification_code: String
    
    var verification_document_sid: String
    
    var verification_type: DependentHostedNumberOrderVerificationType
  }
  object DependentHostedNumberOrderResource {
    
    inline def apply(
      account_sid: String,
      address_sid: String,
      call_delay: Double,
      capabilities: PhoneNumberCapabilities,
      cc_emails: js.Array[String],
      date_created: js.Date,
      date_updated: js.Date,
      email: String,
      `extension`: String,
      failure_reason: String,
      friendly_name: String,
      incoming_phone_number_sid: String,
      phone_number: String,
      sid: String,
      signing_document_sid: String,
      status: DependentHostedNumberOrderStatus,
      unique_name: String,
      verification_attempts: Double,
      verification_call_sids: js.Array[String],
      verification_code: String,
      verification_document_sid: String,
      verification_type: DependentHostedNumberOrderVerificationType
    ): DependentHostedNumberOrderResource = {
      val __obj = js.Dynamic.literal(account_sid = account_sid.asInstanceOf[js.Any], address_sid = address_sid.asInstanceOf[js.Any], call_delay = call_delay.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], cc_emails = cc_emails.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], failure_reason = failure_reason.asInstanceOf[js.Any], friendly_name = friendly_name.asInstanceOf[js.Any], incoming_phone_number_sid = incoming_phone_number_sid.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signing_document_sid = signing_document_sid.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], verification_attempts = verification_attempts.asInstanceOf[js.Any], verification_call_sids = verification_call_sids.asInstanceOf[js.Any], verification_code = verification_code.asInstanceOf[js.Any], verification_document_sid = verification_document_sid.asInstanceOf[js.Any], verification_type = verification_type.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependentHostedNumberOrderResource]
    }
    
    extension [Self <: DependentHostedNumberOrderResource](x: Self) {
      
      inline def setAccount_sid(value: String): Self = StObject.set(x, "account_sid", value.asInstanceOf[js.Any])
      
      inline def setAddress_sid(value: String): Self = StObject.set(x, "address_sid", value.asInstanceOf[js.Any])
      
      inline def setCall_delay(value: Double): Self = StObject.set(x, "call_delay", value.asInstanceOf[js.Any])
      
      inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCc_emails(value: js.Array[String]): Self = StObject.set(x, "cc_emails", value.asInstanceOf[js.Any])
      
      inline def setCc_emailsVarargs(value: String*): Self = StObject.set(x, "cc_emails", js.Array(value*))
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFailure_reason(value: String): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
      
      inline def setFriendly_name(value: String): Self = StObject.set(x, "friendly_name", value.asInstanceOf[js.Any])
      
      inline def setIncoming_phone_number_sid(value: String): Self = StObject.set(x, "incoming_phone_number_sid", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      inline def setSigning_document_sid(value: String): Self = StObject.set(x, "signing_document_sid", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: DependentHostedNumberOrderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
      
      inline def setVerification_attempts(value: Double): Self = StObject.set(x, "verification_attempts", value.asInstanceOf[js.Any])
      
      inline def setVerification_call_sids(value: js.Array[String]): Self = StObject.set(x, "verification_call_sids", value.asInstanceOf[js.Any])
      
      inline def setVerification_call_sidsVarargs(value: String*): Self = StObject.set(x, "verification_call_sids", js.Array(value*))
      
      inline def setVerification_code(value: String): Self = StObject.set(x, "verification_code", value.asInstanceOf[js.Any])
      
      inline def setVerification_document_sid(value: String): Self = StObject.set(x, "verification_document_sid", value.asInstanceOf[js.Any])
      
      inline def setVerification_type(value: DependentHostedNumberOrderVerificationType): Self = StObject.set(x, "verification_type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependentHostedNumberOrderSolution extends StObject {
    
    var signingDocumentSid: js.UndefOr[String] = js.undefined
  }
  object DependentHostedNumberOrderSolution {
    
    inline def apply(): DependentHostedNumberOrderSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependentHostedNumberOrderSolution]
    }
    
    extension [Self <: DependentHostedNumberOrderSolution](x: Self) {
      
      inline def setSigningDocumentSid(value: String): Self = StObject.set(x, "signingDocumentSid", value.asInstanceOf[js.Any])
      
      inline def setSigningDocumentSidUndefined: Self = StObject.set(x, "signingDocumentSid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.twilio.twilioStrings.received
    - typingsJapgolly.twilio.twilioStrings.`pending-verification`
    - typingsJapgolly.twilio.twilioStrings.verified
    - typingsJapgolly.twilio.twilioStrings.`pending-loa`
    - typingsJapgolly.twilio.twilioStrings.`carrier-processing`
    - typingsJapgolly.twilio.twilioStrings.testing
    - typingsJapgolly.twilio.twilioStrings.completed
    - typingsJapgolly.twilio.twilioStrings.failed
    - typingsJapgolly.twilio.twilioStrings.`action-required`
  */
  trait DependentHostedNumberOrderStatus extends StObject
  object DependentHostedNumberOrderStatus {
    
    inline def `action-required`: typingsJapgolly.twilio.twilioStrings.`action-required` = "action-required".asInstanceOf[typingsJapgolly.twilio.twilioStrings.`action-required`]
    
    inline def `carrier-processing`: typingsJapgolly.twilio.twilioStrings.`carrier-processing` = "carrier-processing".asInstanceOf[typingsJapgolly.twilio.twilioStrings.`carrier-processing`]
    
    inline def completed: typingsJapgolly.twilio.twilioStrings.completed = "completed".asInstanceOf[typingsJapgolly.twilio.twilioStrings.completed]
    
    inline def failed: typingsJapgolly.twilio.twilioStrings.failed = "failed".asInstanceOf[typingsJapgolly.twilio.twilioStrings.failed]
    
    inline def `pending-loa`: typingsJapgolly.twilio.twilioStrings.`pending-loa` = "pending-loa".asInstanceOf[typingsJapgolly.twilio.twilioStrings.`pending-loa`]
    
    inline def `pending-verification`: typingsJapgolly.twilio.twilioStrings.`pending-verification` = "pending-verification".asInstanceOf[typingsJapgolly.twilio.twilioStrings.`pending-verification`]
    
    inline def received: typingsJapgolly.twilio.twilioStrings.received = "received".asInstanceOf[typingsJapgolly.twilio.twilioStrings.received]
    
    inline def testing: typingsJapgolly.twilio.twilioStrings.testing = "testing".asInstanceOf[typingsJapgolly.twilio.twilioStrings.testing]
    
    inline def verified: typingsJapgolly.twilio.twilioStrings.verified = "verified".asInstanceOf[typingsJapgolly.twilio.twilioStrings.verified]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.twilio.twilioStrings.`phone-call`
    - typingsJapgolly.twilio.twilioStrings.`phone-bill`
  */
  trait DependentHostedNumberOrderVerificationType extends StObject
  object DependentHostedNumberOrderVerificationType {
    
    inline def `phone-bill`: typingsJapgolly.twilio.twilioStrings.`phone-bill` = "phone-bill".asInstanceOf[typingsJapgolly.twilio.twilioStrings.`phone-bill`]
    
    inline def `phone-call`: typingsJapgolly.twilio.twilioStrings.`phone-call` = "phone-call".asInstanceOf[typingsJapgolly.twilio.twilioStrings.`phone-call`]
  }
}
