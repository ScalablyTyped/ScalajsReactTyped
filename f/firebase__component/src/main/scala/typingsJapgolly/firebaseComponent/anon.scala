package typingsJapgolly.firebaseComponent

import typingsJapgolly.firebaseComponent.firebaseComponentBooleans.`false`
import typingsJapgolly.firebaseComponent.firebaseComponentBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Identifier extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var optional: `true`
  }
  object Identifier {
    
    inline def apply(): Identifier = {
      val __obj = js.Dynamic.literal(optional = true)
      __obj.asInstanceOf[Identifier]
    }
    
    extension [Self <: Identifier](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  trait Optional extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var optional: js.UndefOr[`false`] = js.undefined
  }
  object Optional {
    
    inline def apply(): Optional = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setOptional(value: `false`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
}
