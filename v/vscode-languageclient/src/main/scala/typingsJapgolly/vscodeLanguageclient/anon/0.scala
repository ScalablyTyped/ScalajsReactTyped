package typingsJapgolly.vscodeLanguageclient.anon

import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureState
import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with FeatureState {
  
  var kind: static
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(kind = "static")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setKind(value: static): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
