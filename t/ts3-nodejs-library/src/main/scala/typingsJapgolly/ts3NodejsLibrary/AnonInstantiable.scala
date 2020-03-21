package typingsJapgolly.ts3NodejsLibrary

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.ts3NodejsLibrary.commandMod.Command
import typingsJapgolly.ts3NodejsLibrary.commandMod.Command.Parsers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInstantiable extends Instantiable0[Command] {
  val Identifier: RecordkeyofQueryResponseT = js.native
  /**
    * Checks if a error has been received
    * @return The parsed String which is readable by the TeamSpeak Query
    */
  def build(command: Command): String = js.native
  /**
    * the custom snapshot request parser
    * @param data snapshot string
    * @param cmd command object
    */
  def buildSnapshotDeploy(data: String, cmd: Command): String = js.native
  /** escapes a string */
  def escape(str: String): String = js.native
  /**
    * escapes a key value pair
    * @param {string} key the key used
    * @param {string|string[]} value the value or an array of values
    * @return the parsed String which is readable by the TeamSpeak Query
    */
  def escapeKeyValue(key: String, value: String): String = js.native
  def escapeKeyValue(key: String, value: js.Array[String]): String = js.native
  /**
    * retrieves the key value pair from a string
    * @param str the key value pair to unescape eg foo=bar
    */
  def getKeyValue(str: String): AnonKey = js.native
  /**
    * retrieves the default parsers
    */
  def getParsers(): Parsers = js.native
  /**
    * parses a query response
    * @param data the query response received
    */
  def parse(hasRaw: PickParserArgumentraw): js.Array[PartialPartialQueryRespon] = js.native
  /**
    * parses a number
    * @param value string to parse
    */
  def parseNumber(value: String): Double = js.native
  /**
    * parses a number array
    * @param value string to parse
    */
  def parseNumberArray(value: String): js.Array[Double] = js.native
  def parseRecursive(value: String): js.Array[PartialPartialQueryRespon] = js.native
  /**
    *
    * @param param0 the custom snapshot response parser
    */
  def parseSnapshotCreate(hasRaw: PickParserArgumentraw): js.Array[PartialPartialQueryRespon] = js.native
  /**
    * parses a string value
    * @param value string to parse
    */
  def parseString(value: String): String = js.native
  /**
    * parses a string array
    * @param value string to parse
    */
  def parseStringArray(value: String): js.Array[String] = js.native
  def parseValue(k: String): js.Any = js.native
  /**
    * Parses a value to the type which the key represents
    * @param k the key which should get looked up
    * @param v the value which should get parsed
    */
  def parseValue(k: String, v: String): js.Any = js.native
  /** unescapes a string */
  def unescape(str: String): String = js.native
}

