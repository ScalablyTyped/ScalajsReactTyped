package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetachTypedLink extends StObject {
  
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typingsJapgolly.awsSdk.clientsClouddirectoryMod.TypedLinkSpecifier
}
object BatchDetachTypedLink {
  
  inline def apply(TypedLinkSpecifier: TypedLinkSpecifier): BatchDetachTypedLink = {
    val __obj = js.Dynamic.literal(TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachTypedLink]
  }
  
  extension [Self <: BatchDetachTypedLink](x: Self) {
    
    inline def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
