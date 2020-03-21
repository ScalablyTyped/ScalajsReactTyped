package typingsJapgolly.uaParserJs

import typingsJapgolly.uaParserJs.IUAParser.IBrowser
import typingsJapgolly.uaParserJs.IUAParser.ICPU
import typingsJapgolly.uaParserJs.IUAParser.IDevice
import typingsJapgolly.uaParserJs.IUAParser.IEngine
import typingsJapgolly.uaParserJs.IUAParser.IOS
import typingsJapgolly.uaParserJs.IUAParser.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ua-parser-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * Create a new parser with UA prepopulated and extensions extended
    */
  class UAParser () extends js.Object {
    def this(uastring: String) = this()
    def this(uastring: String, extensions: js.Any) = this()
    /**
      *  Returns browser information
      */
    def getBrowser(): IBrowser = js.native
    /**
      *  Returns parsed CPU information
      */
    def getCPU(): ICPU = js.native
    /**
      *  Returns device information
      */
    def getDevice(): IDevice = js.native
    /**
      *  Returns browsers engine information
      */
    def getEngine(): IEngine = js.native
    /**
      *  Returns OS information
      */
    def getOS(): IOS = js.native
    /**
      *  Returns parse result
      */
    def getResult(): IResult = js.native
    /**
      *  Returns UA string of current instance
      */
    def getUA(): String = js.native
    /**
      *  Set & parse UA string
      */
    def setUA(uastring: String): UAParser = js.native
  }
  
  /* static members */
  @js.native
  object UAParser extends js.Object {
    var BROWSER: typingsJapgolly.uaParserJs.IUAParser.BROWSER = js.native
    var CPU: typingsJapgolly.uaParserJs.IUAParser.CPU = js.native
    var DEVICE: typingsJapgolly.uaParserJs.IUAParser.DEVICE = js.native
    var ENGINE: typingsJapgolly.uaParserJs.IUAParser.ENGINE = js.native
    var OS: typingsJapgolly.uaParserJs.IUAParser.OS = js.native
    var VERSION: String = js.native
  }
  
}

