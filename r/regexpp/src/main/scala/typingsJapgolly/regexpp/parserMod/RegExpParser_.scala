package typingsJapgolly.regexpp.parserMod

import typingsJapgolly.regexpp.astMod.Flags
import typingsJapgolly.regexpp.astMod.Pattern
import typingsJapgolly.regexpp.astMod.RegExpLiteral
import typingsJapgolly.regexpp.parserMod.RegExpParser.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("regexpp/parser", "RegExpParser")
@js.native
class RegExpParser_ () extends js.Object {
  def this(options: Options) = this()
  def parseFlags(source: String): Flags = js.native
  def parseFlags(source: String, start: Double): Flags = js.native
  def parseFlags(source: String, start: Double, end: Double): Flags = js.native
  def parseLiteral(source: String): RegExpLiteral = js.native
  def parseLiteral(source: String, start: Double): RegExpLiteral = js.native
  def parseLiteral(source: String, start: Double, end: Double): RegExpLiteral = js.native
  def parsePattern(source: String): Pattern = js.native
  def parsePattern(source: String, start: Double): Pattern = js.native
  def parsePattern(source: String, start: Double, end: Double): Pattern = js.native
  def parsePattern(source: String, start: Double, end: Double, uFlag: Boolean): Pattern = js.native
}

