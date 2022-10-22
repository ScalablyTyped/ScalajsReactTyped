package typingsJapgolly.winrtUwp.global.Windows.Security.Cryptography

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a class that enables you to easily encrypt and decrypt static data or a data stream. */
object DataProtection {
  
  /** Represents a cryptographic provider that can be used to asynchronously encrypt and decrypt static data or a data stream. */
  @JSGlobal("Windows.Security.Cryptography.DataProtection.DataProtectionProvider")
  @js.native
  /** Constructor used for decryption operations. Use this constructor before calling the UnprotectAsync or UnprotectStreamAsync methods. */
  open class DataProtectionProvider ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Security.Cryptography.DataProtection.DataProtectionProvider {
    /**
      * Constructor used for encryption operations. Use this constructor before calling the ProtectAsync or ProtectStreamAsync methods.
      * @param protectionDescriptor Contains the protection descriptor that determines the entity to which the data will be encrypted. For more information, see Remarks.
      */
    def this(protectionDescriptor: String) = this()
    
    /**
      * Asynchronously protects static data.
      * @param data Data to protect.
      * @return Represents an asynchronous operation.
      */
    /* CompleteClass */
    override def protectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
    
    /**
      * Asynchronously protects a data stream.
      * @param src Stream to be protected.
      * @param dest Protected stream.
      * @return Represents an asynchronous action.
      */
    /* CompleteClass */
    override def protectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
    
    /**
      * Asynchronously decrypts static data.
      * @param data Data to decrypt.
      * @return Represents an asynchronous operation.
      */
    /* CompleteClass */
    override def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
    
    /**
      * Asynchronously decrypts a data stream.
      * @param src Stream to decrypt.
      * @param dest Decrypted stream.
      * @return Represents an asynchronous action.
      */
    /* CompleteClass */
    override def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
  }
}
