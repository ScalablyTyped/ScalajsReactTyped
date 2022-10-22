package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLMapping extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val CustomXMLNode: typingsJapgolly.activexOffice.Office.CustomXMLNode = js.native
  
  val CustomXMLPart: typingsJapgolly.activexOffice.Office.CustomXMLPart = js.native
  
  def Delete(): Unit = js.native
  
  val IsMapped: Boolean = js.native
  
  val Parent: Any = js.native
  
  val PrefixMappings: String = js.native
  
  /**
    * @param string [PrefixMapping='']
    * @param Office.CustomXMLPart [Source=0]
    */
  def SetMapping(XPath: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: String, Source: typingsJapgolly.activexOffice.Office.CustomXMLPart): Boolean = js.native
  def SetMapping(XPath: String, PrefixMapping: Unit, Source: typingsJapgolly.activexOffice.Office.CustomXMLPart): Boolean = js.native
  
  def SetMappingByNode(Node: typingsJapgolly.activexOffice.Office.CustomXMLNode): Boolean = js.native
  
  /* private */ @JSName("Word.XMLMapping_typekey")
  var WordDotXMLMapping_typekey: XMLMapping = js.native
  
  val XPath: String = js.native
}
