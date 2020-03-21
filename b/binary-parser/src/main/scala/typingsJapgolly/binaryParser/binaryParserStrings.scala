package typingsJapgolly.binaryParser

import typingsJapgolly.binaryParser.mod.Parser.Endianness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object binaryParserStrings {
  @js.native
  sealed trait Next extends js.Object
  
  @js.native
  sealed trait big extends Endianness
  
  @js.native
  sealed trait little extends Endianness
  
  @scala.inline
  def Next: Next = "Next".asInstanceOf[Next]
  @scala.inline
  def big: big = "big".asInstanceOf[big]
  @scala.inline
  def little: little = "little".asInstanceOf[little]
}

