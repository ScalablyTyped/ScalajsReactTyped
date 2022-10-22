package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a set properties providing the current information about certain document structural elements.
  */
@JSGlobal("RichEditDocument")
@js.native
open class RichEditDocument ()
  extends StObject
     with typingsJapgolly.devexpressWeb.RichEditDocument {
  
  /**
    * Provides information about numbered paragraphs in the document.
    */
  /* CompleteClass */
  override val abstractNumberingListsInfo: js.Array[typingsJapgolly.devexpressWeb.AbstractNumberingList] = js.native
  
  /**
    * Provides the information about the active sub-document.
    */
  /* CompleteClass */
  override val activeSubDocument: typingsJapgolly.devexpressWeb.SubDocument = js.native
  
  /**
    * Provides information about character styles in the current document.
    */
  /* CompleteClass */
  override val characterStylesInfo: js.Array[typingsJapgolly.devexpressWeb.CharacterStyle] = js.native
  
  /**
    * Returns the sub-document with the specified identifier. A SubDocument value specifying the sub-document.
    * @param subDocumentId An integer value specifying the required sub-document.
    */
  /* CompleteClass */
  override def getSubDocumentById(subDocumentId: Double): typingsJapgolly.devexpressWeb.SubDocument = js.native
  
  /**
    * Provides access to the document's main sub-document.
    */
  /* CompleteClass */
  override val mainSubDocument: typingsJapgolly.devexpressWeb.SubDocument = js.native
  
  /**
    * Provides information about paragraph styles in the current document.
    */
  /* CompleteClass */
  override val paragraphStylesInfo: js.Array[typingsJapgolly.devexpressWeb.ParagraphStyle] = js.native
  
  /**
    * Provides information about sections in the current document.
    */
  /* CompleteClass */
  override val sectionsInfo: js.Array[typingsJapgolly.devexpressWeb.Section] = js.native
  
  /**
    * Provides information about spell checking in the current document.
    */
  /* CompleteClass */
  override val spellingInfo: typingsJapgolly.devexpressWeb.SpellingInfo = js.native
  
  /**
    * Provides access to the document's sub-documents.
    */
  /* CompleteClass */
  override val subDocuments: js.Array[typingsJapgolly.devexpressWeb.SubDocument] = js.native
  
  /**
    * Provides information about table styles in the current document.
    */
  /* CompleteClass */
  override val tableStylesInfo: js.Array[typingsJapgolly.devexpressWeb.TableStyle] = js.native
}
