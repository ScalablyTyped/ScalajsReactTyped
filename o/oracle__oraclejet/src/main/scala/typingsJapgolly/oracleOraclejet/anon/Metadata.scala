package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojcompositeMod.ViewModelContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var metadata: typingsJapgolly.oracleOraclejet.ojcompositeMod.Metadata
  
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, Any]
  ): Any
  
  var view: String
  
  def viewModel(param0: ViewModelContext): Unit | js.Object
}
object Metadata {
  
  inline def apply(
    metadata: typingsJapgolly.oracleOraclejet.ojcompositeMod.Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, Any]) => Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setMetadata(value: typingsJapgolly.oracleOraclejet.ojcompositeMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setParseFunction(value: (String, String, js.Object, js.Function1[/* value */ String, Any]) => Any): Self = StObject.set(x, "parseFunction", js.Any.fromFunction4(value))
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: ViewModelContext => Unit | js.Object): Self = StObject.set(x, "viewModel", js.Any.fromFunction1(value))
  }
}
