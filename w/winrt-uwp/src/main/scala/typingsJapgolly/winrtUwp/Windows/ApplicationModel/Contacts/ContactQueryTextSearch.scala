package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies parameters to use in a text search of Contact objects. */
trait ContactQueryTextSearch extends StObject {
  
  /** Gets or sets which contact fields to search for a text match. */
  var fields: ContactQuerySearchFields
  
  /** Gets or sets a value that specifies either a local or server search. */
  var searchScope: ContactQuerySearchScope
  
  /** Gets or sets the text for which to search. */
  var text: String
}
object ContactQueryTextSearch {
  
  inline def apply(fields: ContactQuerySearchFields, searchScope: ContactQuerySearchScope, text: String): ContactQueryTextSearch = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], searchScope = searchScope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactQueryTextSearch]
  }
  
  extension [Self <: ContactQueryTextSearch](x: Self) {
    
    inline def setFields(value: ContactQuerySearchFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setSearchScope(value: ContactQuerySearchScope): Self = StObject.set(x, "searchScope", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
