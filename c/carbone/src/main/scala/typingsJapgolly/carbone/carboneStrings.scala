package typingsJapgolly.carbone

import typingsJapgolly.carbone.mod.DocumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carboneStrings {
  
  @js.native
  sealed trait document
    extends StObject
       with DocumentType
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait graphics
    extends StObject
       with DocumentType
  inline def graphics: graphics = "graphics".asInstanceOf[graphics]
  
  @js.native
  sealed trait presentation
    extends StObject
       with DocumentType
  inline def presentation: presentation = "presentation".asInstanceOf[presentation]
  
  @js.native
  sealed trait spreadsheet
    extends StObject
       with DocumentType
  inline def spreadsheet: spreadsheet = "spreadsheet".asInstanceOf[spreadsheet]
  
  @js.native
  sealed trait web
    extends StObject
       with DocumentType
  inline def web: web = "web".asInstanceOf[web]
}
