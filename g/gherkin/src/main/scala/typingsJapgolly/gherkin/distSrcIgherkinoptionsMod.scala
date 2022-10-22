package typingsJapgolly.gherkin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cucumberMessages.distSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIgherkinoptionsMod {
  
  trait IGherkinOptions extends StObject {
    
    var defaultDialect: js.UndefOr[String] = js.undefined
    
    var includeGherkinDocument: js.UndefOr[Boolean] = js.undefined
    
    var includePickles: js.UndefOr[Boolean] = js.undefined
    
    var includeSource: js.UndefOr[Boolean] = js.undefined
    
    var newId: js.UndefOr[NewId] = js.undefined
  }
  object IGherkinOptions {
    
    inline def apply(): IGherkinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGherkinOptions]
    }
    
    extension [Self <: IGherkinOptions](x: Self) {
      
      inline def setDefaultDialect(value: String): Self = StObject.set(x, "defaultDialect", value.asInstanceOf[js.Any])
      
      inline def setDefaultDialectUndefined: Self = StObject.set(x, "defaultDialect", js.undefined)
      
      inline def setIncludeGherkinDocument(value: Boolean): Self = StObject.set(x, "includeGherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setIncludeGherkinDocumentUndefined: Self = StObject.set(x, "includeGherkinDocument", js.undefined)
      
      inline def setIncludePickles(value: Boolean): Self = StObject.set(x, "includePickles", value.asInstanceOf[js.Any])
      
      inline def setIncludePicklesUndefined: Self = StObject.set(x, "includePickles", js.undefined)
      
      inline def setIncludeSource(value: Boolean): Self = StObject.set(x, "includeSource", value.asInstanceOf[js.Any])
      
      inline def setIncludeSourceUndefined: Self = StObject.set(x, "includeSource", js.undefined)
      
      inline def setNewId(value: CallbackTo[String]): Self = StObject.set(x, "newId", value.toJsFn)
      
      inline def setNewIdUndefined: Self = StObject.set(x, "newId", js.undefined)
    }
  }
}
