package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the rating control's ItemMouseOver and ItemMouseOut client events (such as ASPxClientRatingControl.ItemMouseOver and ASPxClientRatingControl.ItemMouseOut).
  */
trait ASPxClientRatingControlItemMouseEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double
}
object ASPxClientRatingControlItemMouseEventArgs {
  
  inline def apply(index: Double): ASPxClientRatingControlItemMouseEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRatingControlItemMouseEventArgs]
  }
  
  extension [Self <: ASPxClientRatingControlItemMouseEventArgs](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
