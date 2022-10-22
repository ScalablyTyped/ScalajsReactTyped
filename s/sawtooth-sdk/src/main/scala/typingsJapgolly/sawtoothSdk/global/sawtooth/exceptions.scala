package typingsJapgolly.sawtoothSdk.global.sawtooth

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptions {
  
  @JSGlobal("sawtooth.exceptions.AuthorizationException")
  @js.native
  /**
    * Construcs a new AuthorizationException
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  open class AuthorizationException ()
    extends typingsJapgolly.sawtoothSdk.mod.exceptions.AuthorizationException {
    def this(message: String) = this()
  }
  
  @JSGlobal("sawtooth.exceptions.InternalError")
  @js.native
  /* protected */ open class InternalError ()
    extends typingsJapgolly.sawtoothSdk.mod.exceptions.InternalError {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSGlobal("sawtooth.exceptions.InvalidTransaction")
  @js.native
  /* protected */ open class InvalidTransaction ()
    extends typingsJapgolly.sawtoothSdk.mod.exceptions.InvalidTransaction {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSGlobal("sawtooth.exceptions._TransactionProcessorError")
  @js.native
  /* protected */ open class TransactionProcessorError ()
    extends typingsJapgolly.sawtoothSdk.mod.exceptions.TransactionProcessorError {
    /* protected */ def this(message: String) = this()
    /* protected */ def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: String, extendedData: Buffer) = this()
    /* protected */ def this(message: Unit, extendedData: js.typedarray.Uint8Array) = this()
    /* protected */ def this(message: Unit, extendedData: Buffer) = this()
  }
  
  @JSGlobal("sawtooth.exceptions.ValidatorConnectionError")
  @js.native
  /**
    * Construcs a new ValidatorConnectionError
    *
    * @param [message] - an optional message, defaults to the empty
    * string
    */
  open class ValidatorConnectionError ()
    extends typingsJapgolly.sawtoothSdk.mod.exceptions.ValidatorConnectionError {
    def this(message: String) = this()
  }
}
