package typingsJapgolly.sarif.mod

import typingsJapgolly.sarif.mod.Suppression.kind
import typingsJapgolly.sarif.mod.Suppression.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suppression extends StObject {
  
  /**
    * A stable, unique identifer for the suprression in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * A string representing the justification for the suppression.
    */
  var justification: js.UndefOr[String] = js.undefined
  
  /**
    * A string that indicates where the suppression is persisted.
    */
  var kind: kind
  
  /**
    * Identifies the location associated with the suppression.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the suppression.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A string that indicates the review status of the suppression.
    */
  var status: js.UndefOr[status] = js.undefined
}
object Suppression {
  
  inline def apply(kind: kind): Suppression = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppression]
  }
  
  extension [Self <: Suppression](x: Self) {
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    inline def setJustification(value: String): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setKind(value: kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStatus(value: status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sarif.sarifStrings.inSource
    - typingsJapgolly.sarif.sarifStrings.external
  */
  trait kind extends StObject
  object kind {
    
    inline def external: typingsJapgolly.sarif.sarifStrings.external = "external".asInstanceOf[typingsJapgolly.sarif.sarifStrings.external]
    
    inline def inSource: typingsJapgolly.sarif.sarifStrings.inSource = "inSource".asInstanceOf[typingsJapgolly.sarif.sarifStrings.inSource]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sarif.sarifStrings.accepted
    - typingsJapgolly.sarif.sarifStrings.underReview
    - typingsJapgolly.sarif.sarifStrings.rejected
  */
  trait status extends StObject
  object status {
    
    inline def accepted: typingsJapgolly.sarif.sarifStrings.accepted = "accepted".asInstanceOf[typingsJapgolly.sarif.sarifStrings.accepted]
    
    inline def rejected: typingsJapgolly.sarif.sarifStrings.rejected = "rejected".asInstanceOf[typingsJapgolly.sarif.sarifStrings.rejected]
    
    inline def underReview: typingsJapgolly.sarif.sarifStrings.underReview = "underReview".asInstanceOf[typingsJapgolly.sarif.sarifStrings.underReview]
  }
}
