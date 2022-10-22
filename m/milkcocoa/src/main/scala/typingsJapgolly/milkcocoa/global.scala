package typingsJapgolly.milkcocoa

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object milkcocoa {
    
    @JSGlobal("milkcocoa.MilkCocoa")
    @js.native
    open class MilkCocoa protected ()
      extends StObject
         with typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa {
      def this(host: String) = this()
      def this(host: String, callback: js.Function) = this()
    }
    object MilkCocoa {
      
      object Error {
        
        @JSGlobal("milkcocoa.MilkCocoa.Error.AddAccount")
        @js.native
        object AddAccount extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount & Double] = js.native
          
          /* 1 */ val AlreadyExist: typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.AlreadyExist & Double = js.native
          
          /* 0 */ val FormatError: typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.AddAccount.FormatError & Double = js.native
        }
        
        @JSGlobal("milkcocoa.MilkCocoa.Error.GetCurrentUser")
        @js.native
        object GetCurrentUser extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser & Double] = js.native
          
          /* 0 */ val NotLoggedIn: typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.GetCurrentUser.NotLoggedIn & Double = js.native
        }
        
        @JSGlobal("milkcocoa.MilkCocoa.Error.Login")
        @js.native
        object Login extends StObject {
          
          @JSBracketAccess
          def apply(value: Double): js.UndefOr[typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.Login & Double] = js.native
          
          /* 2 */ val EmailNotVerificated: typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.Login.EmailNotVerificated & Double = js.native
          
          /* 0 */ val FormatError: typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.Login.FormatError & Double = js.native
          
          /* 1 */ val LoginError: typingsJapgolly.milkcocoa.milkcocoa.MilkCocoa.Error.Login.LoginError & Double = js.native
        }
      }
    }
  }
}
