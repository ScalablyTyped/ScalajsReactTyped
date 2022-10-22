package typingsJapgolly.postcssSelectorParser.mod

import typingsJapgolly.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceOptions[Value /* <: js.UndefOr[String] */]
  extends StObject
     with NodeOptions[Value] {
  
  var namespace: js.UndefOr[String | `true`] = js.undefined
}
object NamespaceOptions {
  
  inline def apply[Value /* <: js.UndefOr[String] */](value: Value): NamespaceOptions[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceOptions[Value]]
  }
  
  extension [Self <: NamespaceOptions[?], Value /* <: js.UndefOr[String] */](x: Self & NamespaceOptions[Value]) {
    
    inline def setNamespace(value: String | `true`): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
