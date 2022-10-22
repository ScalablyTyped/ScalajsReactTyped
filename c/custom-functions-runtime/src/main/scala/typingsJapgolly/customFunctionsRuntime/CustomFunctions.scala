package typingsJapgolly.customFunctionsRuntime

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomFunctions {
  
  @js.native
  sealed trait ErrorCode extends StObject
  /**
    * Error codes for custom functions. The error codes will appear in the cell that invoked the function.
    *
    * Custom error messages appear in addition to these error codes. Custom messages display in the error
    * indicator menu, which is accessed by hovering over the error flag on each cell with an error.
    */
  @JSGlobal("CustomFunctions.ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    /**
      *
      * This error code indicates that the function used is dividing by zero or empty cells.
      * A custom error message can't be used.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait divisionByZero
      extends StObject
         with ErrorCode
    
    /**
      *
      * This error code indicates that there is a typo in the function name.
      * Note that this error code is supported as a custom function input error, but not as a custom function output error.
      * A custom error message can't be used.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidName
      extends StObject
         with ErrorCode
    
    /**
      *
      * This error code indicates that there is a problem with a number in the function.
      * A custom error message can't be used.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidNumber
      extends StObject
         with ErrorCode
    
    /**
      *
      * This error code indicates that the function refers to an invalid cell.
      * Note that this error code is supported as a custom function input error, but not as a custom function output error.
      * A custom error message can't be used.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidReference
      extends StObject
         with ErrorCode
    
    /**
      *
      * This error code indicates that a value in the function is of the wrong data type.
      * A custom error message can be used in addition to the error code, if desired.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait invalidValue
      extends StObject
         with ErrorCode
    
    /**
      *
      * This error code indicates that the function or service isn't available.
      * A custom error message can be used in addition to the error code, if desired.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait notAvailable
      extends StObject
         with ErrorCode
    
    /**
      *
      * This error code indicates that the ranges in the function don't intersect.
      * A custom error message can't be used.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    @js.native
    sealed trait nullReference
      extends StObject
         with ErrorCode
  }
  
  /**
    * Provides information about the invocation of a cancelable custom function.
    * A cancelable custom function can provide a handler for the onCanceled event.
    *
    * To indicate that a function is cancelable, in the metadata JSON file, the function options should specify:
    * `{ "cancelable": true }`
    *
    * If the metadata JSON file is being generated from JSDoc comments, include the tag `@cancelable`.
    */
  trait CancelableInvocation
    extends StObject
       with Invocation {
    
    /**
      * Event handler called when the custom function is canceled.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.1]
      *
      * @eventproperty
      */
    def onCanceled(): Unit
  }
  object CancelableInvocation {
    
    inline def apply(onCanceled: Callback): CancelableInvocation = {
      val __obj = js.Dynamic.literal(onCanceled = onCanceled.toJsFn)
      __obj.asInstanceOf[CancelableInvocation]
    }
    
    extension [Self <: CancelableInvocation](x: Self) {
      
      inline def setOnCanceled(value: Callback): Self = StObject.set(x, "onCanceled", value.toJsFn)
    }
  }
  
  /**
    * Use this class to handle errors and write custom error messages.
    *
    * @remarks
    * [Api set: CustomFunctionsRuntime 1.2]
    */
  trait Error extends StObject {
    
    /**
      * The error code returned by your custom function.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.2]
      */
    var code: ErrorCode
    
    /**
      * Your custom error message, such as "This stock price is unavailable". Custom messages are only available with certain error codes.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.2]
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object Error {
    
    inline def apply(code: ErrorCode): Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setCode(value: ErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  /**
    * Provides information about the invocation of a custom function.
    */
  trait Invocation extends StObject {
    
    /**
      * The cell address where the function is being called, if requested, otherwise undefined.
      *
      * To request the address for the function, in the metadata JSON file, the function options should specify:
      * `{ "requiresAddress": true }`
      *
      * If the metadata JSON file is being generated from JSDoc comments, include the tag `@requiresAddress`.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.1]
      */
    var address: js.UndefOr[String] = js.undefined
    
    /**
      * The name of this function.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.1]
      */
    var functionName: js.UndefOr[String] = js.undefined
    
    /**
      * The range addresses where the function parameters are located, if requested, otherwise undefined.
      *
      * To request the parameter addresses for the function, in the metadata JSON file, the function options should specify:
      * `{ "requiresParameterAddresses": true }`
      *
      * If the metadata JSON file is being generated from JSDoc comments, include the tag `@requiresParameterAddresses`.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.3]
      */
    var parameterAddresses: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Invocation {
    
    inline def apply(): Invocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Invocation]
    }
    
    extension [Self <: Invocation](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      inline def setParameterAddresses(value: js.Array[String]): Self = StObject.set(x, "parameterAddresses", value.asInstanceOf[js.Any])
      
      inline def setParameterAddressesUndefined: Self = StObject.set(x, "parameterAddresses", js.undefined)
      
      inline def setParameterAddressesVarargs(value: String*): Self = StObject.set(x, "parameterAddresses", js.Array(value*))
    }
  }
  
  /**
    * Provides information about the invocation of a streaming custom function.
    * A streaming custom function can provide results which can change over time.
    *
    * Call `setResult()` one or more times to provide the result instead of returning
    * a result from the function.
    */
  @js.native
  trait StreamingInvocation[ResultType]
    extends StObject
       with CancelableInvocation {
    
    /**
      * Set the result for the custom function. May be called more than once.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.1]
      */
    def setResult(value: ResultType): Unit = js.native
    def setResult(value: Error): Unit = js.native
  }
}
