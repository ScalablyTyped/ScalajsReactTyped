package typingsJapgolly.jsdocToMarkdown

import typingsJapgolly.jsdocToMarkdown.mod.MemberIndexFormat
import typingsJapgolly.jsdocToMarkdown.mod.RenderListFormat
import typingsJapgolly.jsdocToMarkdown.mod.StyleListFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsdocToMarkdownStrings {
  
  @js.native
  sealed trait dl
    extends StObject
       with StyleListFormat
  inline def dl: dl = "dl".asInstanceOf[dl]
  
  @js.native
  sealed trait grouped
    extends StObject
       with MemberIndexFormat
       with StyleListFormat
  inline def grouped: grouped = "grouped".asInstanceOf[grouped]
  
  @js.native
  sealed trait list
    extends StObject
       with MemberIndexFormat
       with RenderListFormat
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait none
    extends StObject
       with StyleListFormat
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait table
    extends StObject
       with RenderListFormat
       with StyleListFormat
  inline def table: table = "table".asInstanceOf[table]
}
