package typingsJapgolly.winrtUwp.Windows.Security.Cryptography

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
  trait DataProtectionProvider extends StObject {
    
    /**
      * Asynchronously protects static data.
      * @param data Data to protect.
      * @return Represents an asynchronous operation.
      */
    def protectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer]
    
    /**
      * Asynchronously protects a data stream.
      * @param src Stream to be protected.
      * @param dest Protected stream.
      * @return Represents an asynchronous action.
      */
    def protectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction
    
    /**
      * Asynchronously decrypts static data.
      * @param data Data to decrypt.
      * @return Represents an asynchronous operation.
      */
    def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer]
    
    /**
      * Asynchronously decrypts a data stream.
      * @param src Stream to decrypt.
      * @param dest Decrypted stream.
      * @return Represents an asynchronous action.
      */
    def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction
  }
  object DataProtectionProvider {
    
    inline def apply(
      protectAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer],
      protectStreamAsync: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction,
      unprotectAsync: IBuffer => IPromiseWithIAsyncOperation[IBuffer],
      unprotectStreamAsync: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction
    ): DataProtectionProvider = {
      val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
      __obj.asInstanceOf[DataProtectionProvider]
    }
    
    extension [Self <: DataProtectionProvider](x: Self) {
      
      inline def setProtectAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = StObject.set(x, "protectAsync", js.Any.fromFunction1(value))
      
      inline def setProtectStreamAsync(value: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction): Self = StObject.set(x, "protectStreamAsync", js.Any.fromFunction2(value))
      
      inline def setUnprotectAsync(value: IBuffer => IPromiseWithIAsyncOperation[IBuffer]): Self = StObject.set(x, "unprotectAsync", js.Any.fromFunction1(value))
      
      inline def setUnprotectStreamAsync(value: (IInputStream, IOutputStream) => IPromiseWithIAsyncAction): Self = StObject.set(x, "unprotectStreamAsync", js.Any.fromFunction2(value))
    }
  }
}
