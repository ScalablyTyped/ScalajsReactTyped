package typingsJapgolly.browserfs.browserfsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.browserfs.apiErrorMod.ErrorCode
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "Errors")
@js.native
object Errors extends js.Object {
  @js.native
  class ApiError protected ()
    extends typingsJapgolly.browserfs.apiErrorMod.ApiError {
    /**
      * Represents a BrowserFS error. Passed back to applications after a failed
      * call to the BrowserFS API.
      *
      * Error codes mirror those returned by regular Unix file operations, which is
      * what Node returns.
      * @constructor ApiError
      * @param type The type of the error.
      * @param [message] A descriptive error message.
      */
    def this(`type`: ErrorCode) = this()
    def this(`type`: ErrorCode, message: String) = this()
    def this(`type`: ErrorCode, message: String, path: String) = this()
  }
  
  /* static members */
  @js.native
  object ApiError extends js.Object {
    def EEXIST(path: String): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def EISDIR(path: String): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def ENOENT(path: String): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def ENOTDIR(path: String): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def ENOTEMPTY(path: String): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def EPERM(path: String): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def FileError(code: ErrorCode, p: String): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    /**
      * Creates an ApiError object from a buffer.
      */
    def fromBuffer(buffer: Buffer): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def fromBuffer(buffer: Buffer, i: Double): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
    def fromJSON(json: js.Any): typingsJapgolly.browserfs.apiErrorMod.ApiError = js.native
  }
  
  @js.native
  object ErrorCode extends js.Object {
    /* 13 */ val EACCES: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EACCES with Double = js.native
    /* 9 */ val EBADF: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EBADF with Double = js.native
    /* 16 */ val EBUSY: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EBUSY with Double = js.native
    /* 17 */ val EEXIST: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EEXIST with Double = js.native
    /* 27 */ val EFBIG: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EFBIG with Double = js.native
    /* 22 */ val EINVAL: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EINVAL with Double = js.native
    /* 5 */ val EIO: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EIO with Double = js.native
    /* 21 */ val EISDIR: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EISDIR with Double = js.native
    /* 2 */ val ENOENT: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.ENOENT with Double = js.native
    /* 28 */ val ENOSPC: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.ENOSPC with Double = js.native
    /* 20 */ val ENOTDIR: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.ENOTDIR with Double = js.native
    /* 39 */ val ENOTEMPTY: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
    /* 95 */ val ENOTSUP: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.ENOTSUP with Double = js.native
    /* 1 */ val EPERM: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EPERM with Double = js.native
    /* 30 */ val EROFS: typingsJapgolly.browserfs.apiErrorMod.ErrorCode.EROFS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.browserfs.apiErrorMod.ErrorCode with Double] = js.native
  }
  
  @js.native
  object ErrorStrings
    extends /* code */ NumberDictionary[String]
       with /* code */ StringDictionary[String]
  
}

