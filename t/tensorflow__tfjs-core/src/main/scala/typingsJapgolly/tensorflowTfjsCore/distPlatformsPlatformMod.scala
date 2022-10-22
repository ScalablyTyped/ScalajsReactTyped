package typingsJapgolly.tensorflowTfjsCore

import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.RequestDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformsPlatformMod {
  
  @js.native
  trait Platform extends StObject {
    
    /** Decode the provided bytes into a string using the provided encoding. */
    def decode(bytes: js.typedarray.Uint8Array, encoding: String): String = js.native
    
    /**
      * Encode the provided string into an array of bytes using the provided
      * encoding.
      */
    def encode(text: String, encoding: String): js.typedarray.Uint8Array = js.native
    
    /**
      * Makes an HTTP request.
      * @param path The URL path to make a request to
      * @param init The request init. See init here:
      *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request
      */
    def fetch(path: String): js.Promise[Response] = js.native
    def fetch(path: String, requestInits: RequestInit): js.Promise[Response] = js.native
    def fetch(path: String, requestInits: RequestInit, options: RequestDetails): js.Promise[Response] = js.native
    def fetch(path: String, requestInits: Unit, options: RequestDetails): js.Promise[Response] = js.native
    
    /**
      * Returns the current high-resolution time in milliseconds relative to an
      * arbitrary time in the past. It works across different platforms (node.js,
      * browsers).
      */
    def now(): Double = js.native
    
    var setTimeoutCustom: js.UndefOr[js.Function2[/* functionRef */ js.Function, /* delay */ Double, Unit]] = js.native
  }
}
