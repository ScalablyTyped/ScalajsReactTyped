package typingsJapgolly.googleAdsScripts.GoogleAdsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Iterator
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorForDateRange
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AdsManagerApp {
  
  /** Represents a Google Ads account-level label. */
  trait AccountLabel extends StObject {
    
    /** Returns the selector of all accounts to which the account label is applied. */
    def accounts(): ManagedAccountSelector
    
    /** Returns the type of this entity as a String, in this case, "AccountLabel" */
    def getEntityType(): String
    
    /** Returns the ID of the account label. */
    def getId(): Double
    
    /** Returns the name of the account label. */
    def getName(): String
    
    /** Removes the account label. */
    def remove(): Unit
    
    /** Changes the name of the account label. */
    def setName(name: String): Unit
  }
  object AccountLabel {
    
    inline def apply(
      accounts: CallbackTo[ManagedAccountSelector],
      getEntityType: CallbackTo[String],
      getId: CallbackTo[Double],
      getName: CallbackTo[String],
      remove: Callback,
      setName: String => Callback
    ): AccountLabel = {
      val __obj = js.Dynamic.literal(accounts = accounts.toJsFn, getEntityType = getEntityType.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, remove = remove.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
      __obj.asInstanceOf[AccountLabel]
    }
    
    extension [Self <: AccountLabel](x: Self) {
      
      inline def setAccounts(value: CallbackTo[ManagedAccountSelector]): Self = StObject.set(x, "accounts", value.toJsFn)
      
      inline def setGetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getEntityType", value.toJsFn)
      
      inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /**
    * An iterator of account labels.
    *
    * Typical usage:
    *
    *
    *      while (accountLabelIterator.hasNext()) {
    *        var accountLabel = accountLabelIterator.next();
    *      }
    */
  type AccountLabelIterator = Iterator[AccountLabel]
  
  /**
    * Fetches account labels. Supports filtering.
    *
    * Typical usage:
    *
    *
    *      var accountLabelSelector = AdsManagerApp.accountLabels()
    *          .withCondition("Name CONTAINS 'priority'");
    *
    *      var accountLabelIterator = accountLabelSelector.get();
    *      while (accountLabelIterator.hasNext()) {
    *        var accountLabel = accountLabelIterator.next();
    *      }
    */
  trait AccountLabelSelector
    extends StObject
       with Selector[AccountLabelIterator]
       with SelectorWithCondition
       with SelectorWithIds
  object AccountLabelSelector {
    
    inline def apply(
      get: CallbackTo[AccountLabelIterator],
      withCondition: String => AccountLabelSelector,
      withIds: js.Array[Double] => AccountLabelSelector
    ): AccountLabelSelector = {
      val __obj = js.Dynamic.literal(get = get.toJsFn, withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds))
      __obj.asInstanceOf[AccountLabelSelector]
    }
  }
  
  trait AdsManagerApp extends StObject {
    
    /** Returns the selector of all account labels in the account. */
    def accountLabels(): AccountLabelSelector
    
    /** Returns the selector of accounts managed by this MCC account. */
    def accounts(): ManagedAccountSelector
    
    /**
      * Creates a new account label.
      * @param name The name of the new account label. Label names are case sensitive and must be unique. Max length is 40 characters.
      * Any leading or trailing white spaces will be trimmed.
      */
    def createAccountLabel(name: String): Unit
    
    /**
      * Selects a ManagedAccount as the next account on which to operate.
      * This can be used to make changes to an account managed by this MCC.
      */
    def select(account: ManagedAccount): Unit
  }
  object AdsManagerApp {
    
    inline def apply(
      accountLabels: CallbackTo[AccountLabelSelector],
      accounts: CallbackTo[ManagedAccountSelector],
      createAccountLabel: String => Callback,
      select: ManagedAccount => Callback
    ): typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsManagerApp.AdsManagerApp = {
      val __obj = js.Dynamic.literal(accountLabels = accountLabels.toJsFn, accounts = accounts.toJsFn, createAccountLabel = js.Any.fromFunction1((t0: String) => createAccountLabel(t0).runNow()), select = js.Any.fromFunction1((t0: ManagedAccount) => select(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsManagerApp.AdsManagerApp]
    }
    
    extension [Self <: typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsManagerApp.AdsManagerApp](x: Self) {
      
      inline def setAccountLabels(value: CallbackTo[AccountLabelSelector]): Self = StObject.set(x, "accountLabels", value.toJsFn)
      
      inline def setAccounts(value: CallbackTo[ManagedAccountSelector]): Self = StObject.set(x, "accounts", value.toJsFn)
      
      inline def setCreateAccountLabel(value: String => Callback): Self = StObject.set(x, "createAccountLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSelect(value: ManagedAccount => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: ManagedAccount) => value(t0).runNow()))
    }
  }
  
  trait ExecutionResult extends StObject {
    
    /** Returns the customer ID of the account. */
    def getCustomerId(): String
    
    /** Returns null if the execution completed successfully. */
    def getError(): String
    
    /** Returns null if no value was returned by the function that executed on the account. */
    def getReturnValue(): String
    
    /** Returns the status of the execution.. */
    def getStatus(): ExecutionResultStatusType
  }
  object ExecutionResult {
    
    inline def apply(
      getCustomerId: CallbackTo[String],
      getError: CallbackTo[String],
      getReturnValue: CallbackTo[String],
      getStatus: CallbackTo[ExecutionResultStatusType]
    ): ExecutionResult = {
      val __obj = js.Dynamic.literal(getCustomerId = getCustomerId.toJsFn, getError = getError.toJsFn, getReturnValue = getReturnValue.toJsFn, getStatus = getStatus.toJsFn)
      __obj.asInstanceOf[ExecutionResult]
    }
    
    extension [Self <: ExecutionResult](x: Self) {
      
      inline def setGetCustomerId(value: CallbackTo[String]): Self = StObject.set(x, "getCustomerId", value.toJsFn)
      
      inline def setGetError(value: CallbackTo[String]): Self = StObject.set(x, "getError", value.toJsFn)
      
      inline def setGetReturnValue(value: CallbackTo[String]): Self = StObject.set(x, "getReturnValue", value.toJsFn)
      
      inline def setGetStatus(value: CallbackTo[ExecutionResultStatusType]): Self = StObject.set(x, "getStatus", value.toJsFn)
    }
  }
  
  /* Inlined {  Ok :'OK',   Error :'ERROR',   TimeOut :'TIMEOUT'}[keyof {  Ok :'OK',   Error :'ERROR',   TimeOut :'TIMEOUT'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.OK
    - typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.ERROR
    - typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.TIMEOUT
  */
  trait ExecutionResultStatusType extends StObject
  object ExecutionResultStatusType {
    
    inline def ERROR: typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.ERROR = "ERROR".asInstanceOf[typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.ERROR]
    
    inline def OK: typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.OK = "OK".asInstanceOf[typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.OK]
    
    inline def TIMEOUT: typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.TIMEOUT = "TIMEOUT".asInstanceOf[typingsJapgolly.googleAdsScripts.googleAdsScriptsStrings.TIMEOUT]
  }
  
  @js.native
  trait ManagedAccount
    extends StObject
       with StatsFor {
    
    /** Applies an account label to the managed account. */
    def applyLabel(name: String): Unit = js.native
    
    /**
      * Returns the currency code of the account. The returned values are in the three-letter ISO 4217 format, e.g. 'USD', 'CAD', 'JPY', etc.
      *
      * Please refer to [AdWords API Currency Codes](https://developers.google.com/adwords/api/docs/appendix/codes-formats#currency-codes)
      * for the full list of possible return values.
      */
    def getCurrencyCode(): String = js.native
    
    // TODO: Add currency code enum
    /** Returns the customer ID of the account. */
    def getCustomerId(): String = js.native
    
    /** Returns the type of this entity as a String, in this case, "Account". */
    def getEntityType(): String = js.native
    
    /** Returns the name of the account. */
    def getName(): String = js.native
    
    /**
      * Returns the POSIX time zone of the account.
      *
      * Returned values are in the standard time zone identifier form, such as 'America/Los_Angeles'.
      *
      * Please refer to [AdWords API Timezones](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
      * for the full list of possible return values.
      */
    def getTimeZone(): String = js.native
    
    // TODO: Add timezone enum
    /** Creates a selector of all account labels that exist in the MCC account. */
    def labels(): AccountLabelSelector = js.native
    
    /** Removes an account label from the managed account. */
    def removeLabel(name: String): Unit = js.native
  }
  
  /**
    * An iterator of accounts.
    *
    * Typical usage:
    *
    *
    *      while (accountIterator.hasNext()) {
    *        var account = accountIterator.next();
    *      }
    */
  type ManagedAccountIterator = Iterator[ManagedAccount]
  
  /**
    * Fetches accounts. Supports filtering and sorting.
    *
    * Typical usage:
    *
    *
    *      var accountSelector = AdsManagerApp
    *          .accounts()
    *          .withCondition("Impressions > 100")
    *          .forDateRange("LAST_MONTH")
    *          .orderBy("Clicks DESC");
    *
    *      var accountIterator = accountSelector.get();
    *      while (accountIterator.hasNext()) {
    *        var account = accountIterator.next();
    *      }
    */
  @js.native
  trait ManagedAccountSelector
    extends StObject
       with Selector[ManagedAccountIterator]
       with SelectorForDateRange
       with SelectorOrderBy
       with SelectorWithCondition
       with SelectorWithLimit {
    
    /**
      * Executes the function specified by functionName on each ManagedAccount that the AccountSelector matches.
      * Once all the accounts have been processed, the callback function, if specified by `optionalCallbackFunctionName`, is executed once.
      * The input, if specified by `optionalInput`, will be passed into the function specified by `functionName`. For example,
      *
      *      accountSelector.executeInParallel(functionName, optionalCallbackFunctionName, optionalInput)
      *
      * The input can then be accessed in the function like this:
      *
      *      function functionName(optionalInput) {
      *        Logger.log(optionalInput);
      *      }
      * The function specified by functionName can optionally return a string. For example,
      *
      *      return "Account name";
      *      return "$100.22";
      *      return "client@companyA.com";
      *      return "5";
      *
      * `JSON.stringify(value)` can be used to convert a value to JSON and then return the string. For example,
      *
      *
      *       return JSON.stringify({value:10, list:[1,2,3,4,5,6], name: "Joe Smith"});
      *
      * These will be passed into the callback function in a list of ExecutionResult objects.
      * If `JSON.stringify(value)` is used in the callback function, the value can then be turned back into a JavaScript object with `JSON.parse(returnValue)`.
      *
      * For example,
      *
      *
      *      function optionalCallbackFunctionName(results) {
      *        for (var i = 0; i < results.length; i++) {
      *          object = JSON.parse(results[i].getReturnValue());
      *        }
      *      }
      *
      * `executeInParallel` can operate simultaneously on up to 50 accounts.
      * If the selector contains more than 50 accounts, an exception is thrown and no accounts are processed.
      * You can limit the number of accounts for the executeInParallel method using `accountSelector.withLimit(accountLimit)`.
      *
      * The signature for the optionalCallbackFunctionName should be:
      *
      *
      *      function callbackMethod(results: ExecutionResult[]) {
      *
      *      }
      *
      * @param functionName The name of the function to execute for each ManagedAccount in the selector.
      * @param optionalCallbackFunctionName Optional. The name of the function to execute, in the scope of the MCC account,
      * once processing of the accounts in the selector has completed. This function will only be executed once.
      * @param optionalInput Optional. A string that can be specified that will be passed into the function being executed for each account.
      */
    def executeInParallel(functionName: String): Unit = js.native
    def executeInParallel(functionName: String, optionalCallbackFunctionName: String): Unit = js.native
    def executeInParallel(functionName: String, optionalCallbackFunctionName: String, optionalInput: String): Unit = js.native
    def executeInParallel(functionName: String, optionalCallbackFunctionName: Unit, optionalInput: String): Unit = js.native
    
    def withIds(ids: js.Array[String]): this.type = js.native
    /**
      * Restricts this selector to return only customers with the given customer IDs.
      *
      *      var customerIds = ['123-456-7890', '234-567-8901', '345-678-9012'];
      *      selector = selector.withIds(customerIds);
      *
      * The resulting selector can be further refined by applying additional conditions to it.
      * The ID-based condition will then be AND-ed together with all the other conditions, including any other ID-based conditions. So, for instance, the following selector:
      *
      *      AdsManagerApp.accounts()
      *         .withIds(['123-456-7890', '234-567-8901', '345-678-9012'])
      *         .withIds(['345-678-9012', '456-789-0123', '567-890-1234']);
      *
      * will only get the customer with ID 345-678-9012, since it would be the only customer that satisfies both ID conditions.
      *
      * The customer IDs can be passed in either as numbers, or as hyphen-separated strings. The following two calls do the same thing:
      *
      *      accounts.withIds(['123-456-7890', '234-567-8901', '345-678-9012']);
      *      accounts.withIds([1234567890, 2345678901, 3456789012]);
      */
    def withIds(ids: Double): this.type = js.native
  }
}
