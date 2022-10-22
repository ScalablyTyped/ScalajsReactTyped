package typingsJapgolly.ky

import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import typingsJapgolly.ky.distributionTypesResponseMod.KyResponse
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionTypesResponsePromiseMod {
  
  @js.native
  trait ResponsePromise
    extends StObject
       with Promise[KyResponse] {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def blob(): js.Promise[Blob] = js.native
    
    def formData(): js.Promise[FormData] = js.native
    
    /**
      Get the response body as JSON.
      @example
      ```
      import ky from 'ky';
      const json = await ky(…).json();
      ```
      @example
      ```
      import ky from 'ky';
      interface Result {
      value: number;
      }
      const result = await ky(…).json<Result>();
      ```
      */
    def json[T](): js.Promise[T] = js.native
    
    def text(): js.Promise[String] = js.native
  }
}
