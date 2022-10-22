package typingsJapgolly.cucumberGherkinUtils

import typingsJapgolly.cucumberMessages.mod.GherkinDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPrettyMod {
  
  @JSImport("@cucumber/gherkin-utils/dist/src/pretty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(gherkinDocument: GherkinDocument): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(gherkinDocument.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(gherkinDocument: GherkinDocument, syntax: Syntax): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(gherkinDocument.asInstanceOf[js.Any], syntax.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def escapeCell(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeCell")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cucumberGherkinUtils.cucumberGherkinUtilsStrings.markdown
    - typingsJapgolly.cucumberGherkinUtils.cucumberGherkinUtilsStrings.gherkin
  */
  trait Syntax extends StObject
  object Syntax {
    
    inline def gherkin: typingsJapgolly.cucumberGherkinUtils.cucumberGherkinUtilsStrings.gherkin = "gherkin".asInstanceOf[typingsJapgolly.cucumberGherkinUtils.cucumberGherkinUtilsStrings.gherkin]
    
    inline def markdown: typingsJapgolly.cucumberGherkinUtils.cucumberGherkinUtilsStrings.markdown = "markdown".asInstanceOf[typingsJapgolly.cucumberGherkinUtils.cucumberGherkinUtilsStrings.markdown]
  }
}
