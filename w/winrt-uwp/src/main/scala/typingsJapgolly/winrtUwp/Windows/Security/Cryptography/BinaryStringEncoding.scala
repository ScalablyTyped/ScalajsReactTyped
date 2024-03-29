package typingsJapgolly.winrtUwp.Windows.Security.Cryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BinaryStringEncoding extends StObject
/** Contains encoding formats that can be used in the ConvertStringToBinary and ConvertBinaryToString methods. */
@JSGlobal("Windows.Security.Cryptography.BinaryStringEncoding")
@js.native
object BinaryStringEncoding extends StObject {
  
  /** Sixteen bit Unicode Transformation Format in big-endian byte order. */
  @js.native
  sealed trait utf16BE
    extends StObject
       with BinaryStringEncoding
  
  /** Sixteen bit Unicode Transformation Format in little-endian byte order. The encoding process creates a variable length result of one or two 8-bit bytes per Unicode code point. */
  @js.native
  sealed trait utf16LE
    extends StObject
       with BinaryStringEncoding
  
  /** Eight bit Unicode Transformation Format. The process encodes each Unicode code point into one to four 8-bit bytes. Code points represented by lower numerical values are encoded using fewer bytes. In particular, the first 128 characters correspond exactly to the ASCII character set and are encoded by using a single octet. */
  @js.native
  sealed trait utf8
    extends StObject
       with BinaryStringEncoding
}
