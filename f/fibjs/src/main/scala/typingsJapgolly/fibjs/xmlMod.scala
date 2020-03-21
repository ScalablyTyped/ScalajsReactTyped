package typingsJapgolly.fibjs

import typingsJapgolly.fibjs.fibjsNumbers.`10`
import typingsJapgolly.fibjs.fibjsNumbers.`1`
import typingsJapgolly.fibjs.fibjsNumbers.`2`
import typingsJapgolly.fibjs.fibjsNumbers.`3`
import typingsJapgolly.fibjs.fibjsNumbers.`4`
import typingsJapgolly.fibjs.fibjsNumbers.`7`
import typingsJapgolly.fibjs.fibjsNumbers.`8`
import typingsJapgolly.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief xml 处理模块
	* @detail 
	*/
@JSImport("xml", JSImport.Namespace)
@js.native
object xmlMod extends js.Object {
  @js.native
  class Document () extends ClassXmlDocument
  
  val ATTRIBUTE_NODE: `2` = js.native
  val CDATA_SECTION_NODE: `4` = js.native
  val COMMENT_NODE: `8` = js.native
  val DOCUMENT_NODE: `9` = js.native
  val DOCUMENT_TYPE_NODE: `10` = js.native
  val ELEMENT_NODE: `1` = js.native
  val PROCESSING_INSTRUCTION_NODE: `7` = js.native
  val TEXT_NODE: `3` = js.native
  def parse(source: String): ClassXmlDocument = js.native
  def parse(source: String, `type`: String): ClassXmlDocument = js.native
  def parse(source: ClassBuffer): ClassXmlDocument = js.native
  def parse(source: ClassBuffer, `type`: String): ClassXmlDocument = js.native
  def serialize(node: ClassXmlNode): String = js.native
}

