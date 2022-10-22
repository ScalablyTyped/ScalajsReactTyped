package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings defining a header or footer in a document.
  */
trait HeaderFooter extends StObject {
  
  /**
    * Provides access to an object implementing the basic document functionality that is common to the header, footer and the main document body.
    */
  val subDocument: SubDocument
  
  /**
    * Gets the type of the header (footer).
    */
  val `type`: HeaderFooterType
}
object HeaderFooter {
  
  inline def apply(subDocument: SubDocument, `type`: HeaderFooterType): HeaderFooter = {
    val __obj = js.Dynamic.literal(subDocument = subDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  extension [Self <: HeaderFooter](x: Self) {
    
    inline def setSubDocument(value: SubDocument): Self = StObject.set(x, "subDocument", value.asInstanceOf[js.Any])
    
    inline def setType(value: HeaderFooterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
