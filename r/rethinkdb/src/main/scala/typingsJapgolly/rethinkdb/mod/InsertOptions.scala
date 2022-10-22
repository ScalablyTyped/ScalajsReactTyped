package typingsJapgolly.rethinkdb.mod

import typingsJapgolly.rethinkdb.rethinkdbStrings.always
import typingsJapgolly.rethinkdb.rethinkdbStrings.error
import typingsJapgolly.rethinkdb.rethinkdbStrings.hard
import typingsJapgolly.rethinkdb.rethinkdbStrings.replace
import typingsJapgolly.rethinkdb.rethinkdbStrings.soft
import typingsJapgolly.rethinkdb.rethinkdbStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertOptions extends StObject {
  
  var conflict: js.UndefOr[
    error | replace | update | (js.Function3[/* id */ String, /* oldDoc */ Any, /* newDoc */ Any, Any])
  ] = js.undefined
  
  var durability: js.UndefOr[hard | soft] = js.undefined
  
  var returnChanges: js.UndefOr[Boolean | always] = js.undefined
}
object InsertOptions {
  
  inline def apply(): InsertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertOptions]
  }
  
  extension [Self <: InsertOptions](x: Self) {
    
    inline def setConflict(
      value: error | replace | update | (js.Function3[/* id */ String, /* oldDoc */ Any, /* newDoc */ Any, Any])
    ): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    inline def setConflictFunction3(value: (/* id */ String, /* oldDoc */ Any, /* newDoc */ Any) => Any): Self = StObject.set(x, "conflict", js.Any.fromFunction3(value))
    
    inline def setConflictUndefined: Self = StObject.set(x, "conflict", js.undefined)
    
    inline def setDurability(value: hard | soft): Self = StObject.set(x, "durability", value.asInstanceOf[js.Any])
    
    inline def setDurabilityUndefined: Self = StObject.set(x, "durability", js.undefined)
    
    inline def setReturnChanges(value: Boolean | always): Self = StObject.set(x, "returnChanges", value.asInstanceOf[js.Any])
    
    inline def setReturnChangesUndefined: Self = StObject.set(x, "returnChanges", js.undefined)
  }
}
