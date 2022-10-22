package typingsJapgolly.customFunctionsRuntime

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CustomFunctions {
    
    @JSGlobal("CustomFunctions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Use this class to handle errors and write custom error messages.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.2]
      */
    @JSGlobal("CustomFunctions.Error")
    @js.native
    open class Error protected ()
      extends StObject
         with typingsJapgolly.customFunctionsRuntime.CustomFunctions.Error {
      def this(code: ErrorCode) = this()
      def this(code: ErrorCode, message: String) = this()
      
      /**
        * The error code returned by your custom function.
        *
        * @remarks
        * [Api set: CustomFunctionsRuntime 1.2]
        */
      /* CompleteClass */
      var code: ErrorCode = js.native
    }
    
    /**
      * Error codes for custom functions. The error codes will appear in the cell that invoked the function.
      *
      * Custom error messages appear in addition to these error codes. Custom messages display in the error
      * indicator menu, which is accessed by hovering over the error flag on each cell with an error.
      */
    @JSGlobal("CustomFunctions.ErrorCode")
    @js.native
    object ErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode & String] = js.native
      
      /* "#DIV/0!" */ val divisionByZero: typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode.divisionByZero & String = js.native
      
      /* "#NAME?" */ val invalidName: typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidName & String = js.native
      
      /* "#NUM!" */ val invalidNumber: typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidNumber & String = js.native
      
      /* "#REF!" */ val invalidReference: typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidReference & String = js.native
      
      /* "#VALUE!" */ val invalidValue: typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode.invalidValue & String = js.native
      
      /* "#N/A" */ val notAvailable: typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode.notAvailable & String = js.native
      
      /* "#NULL!" */ val nullReference: typingsJapgolly.customFunctionsRuntime.CustomFunctions.ErrorCode.nullReference & String = js.native
    }
    
    /**
      * Associates the JavaScript function to the name given by the "id" property in the metadata JSON file.
      */
    inline def associate(id: String, functionObject: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("associate")(id.asInstanceOf[js.Any], functionObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Associates the JavaScript functions to the names given by the "id" properties in the metadata JSON file.
      */
    inline def associate(mappings: StringDictionary[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("associate")(mappings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
