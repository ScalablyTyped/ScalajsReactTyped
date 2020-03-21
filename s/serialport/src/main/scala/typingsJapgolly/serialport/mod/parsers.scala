package typingsJapgolly.serialport.mod

import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.serialport.Anon0
import typingsJapgolly.serialport.AnonDelimiter
import typingsJapgolly.serialport.AnonEncoding
import typingsJapgolly.serialport.AnonLength
import typingsJapgolly.serialport.AnonRegex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialport", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class ByteLength protected () extends Transform {
    def this(options: AnonLength) = this()
  }
  
  @js.native
  class CCTalk () extends Transform
  
  @js.native
  class Delimiter protected () extends Transform {
    def this(options: AnonDelimiter) = this()
  }
  
  @js.native
  class Readline protected () extends Delimiter {
    def this(options: AnonEncoding) = this()
  }
  
  @js.native
  class Ready protected () extends Transform {
    def this(options: Anon0) = this()
  }
  
  @js.native
  class Regex protected () extends Transform {
    def this(options: AnonRegex) = this()
  }
  
}

