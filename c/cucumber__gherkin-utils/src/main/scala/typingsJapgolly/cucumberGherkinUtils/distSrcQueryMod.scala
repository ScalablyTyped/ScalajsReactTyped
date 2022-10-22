package typingsJapgolly.cucumberGherkinUtils

import typingsJapgolly.cucumberMessages.mod.Background
import typingsJapgolly.cucumberMessages.mod.Envelope
import typingsJapgolly.cucumberMessages.mod.Examples
import typingsJapgolly.cucumberMessages.mod.Feature
import typingsJapgolly.cucumberMessages.mod.GherkinDocument
import typingsJapgolly.cucumberMessages.mod.Location
import typingsJapgolly.cucumberMessages.mod.Pickle
import typingsJapgolly.cucumberMessages.mod.Rule
import typingsJapgolly.cucumberMessages.mod.Scenario
import typingsJapgolly.cucumberMessages.mod.Source
import typingsJapgolly.cucumberMessages.mod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryMod {
  
  @JSImport("@cucumber/gherkin-utils/dist/src/Query", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Query
  
  @js.native
  trait Query extends StObject {
    
    /* private */ val backgroundByUriLine: Any = js.native
    
    /* private */ val examplesByUriLine: Any = js.native
    
    /* private */ val featureByUriLine: Any = js.native
    
    def getBackground(uri: String, line: Double): js.UndefOr[Background] = js.native
    
    def getExamples(uri: String, line: Double): js.UndefOr[Examples] = js.native
    
    def getFeature(uri: String, line: Double): js.UndefOr[Feature] = js.native
    
    def getGherkinDocuments(): js.Array[GherkinDocument] = js.native
    
    /**
      * Gets the location (line and column) of an AST node.
      * @param astNodeId
      */
    def getLocation(astNodeId: String): Location = js.native
    
    /**
      * Gets all the pickle IDs
      * @param uri - the URI of the document
      * @param astNodeId - optionally restrict results to a particular AST node
      */
    def getPickleIds(uri: String): js.Array[String] = js.native
    def getPickleIds(uri: String, astNodeId: String): js.Array[String] = js.native
    
    def getPickleStepIds(astNodeId: String): js.Array[String] = js.native
    
    def getPickles(): js.Array[Pickle] = js.native
    
    def getRule(uri: String, line: Double): js.UndefOr[Rule] = js.native
    
    def getScenario(uri: String, line: Double): js.UndefOr[Scenario] = js.native
    
    def getSource(uri: String): js.UndefOr[Source] = js.native
    
    def getSources(): js.Array[Source] = js.native
    
    def getStep(uri: String, line: Double): js.UndefOr[Step] = js.native
    
    /* private */ val gherkinDocuments: Any = js.native
    
    /* private */ val gherkinStepByAstNodeId: Any = js.native
    
    /* private */ val locationByAstNodeId: Any = js.native
    
    /* private */ val pickleIdsByAstNodeId: Any = js.native
    
    /* private */ val pickleIdsMapByUri: Any = js.native
    
    /* private */ val pickleStepIdsByAstNodeId: Any = js.native
    
    /* private */ val pickles: Any = js.native
    
    /* private */ val ruleByUriLine: Any = js.native
    
    /* private */ val scenarioByUriLine: Any = js.native
    
    /* private */ val sourceByUri: Any = js.native
    
    /* private */ val sources: Any = js.native
    
    /* private */ val stepByUriLine: Any = js.native
    
    def update(message: Envelope): Query = js.native
    
    /* private */ var updateGherkinBackground: Any = js.native
    
    /* private */ var updateGherkinExamples: Any = js.native
    
    /* private */ var updateGherkinFeature: Any = js.native
    
    /* private */ var updateGherkinRule: Any = js.native
    
    /* private */ var updateGherkinScenario: Any = js.native
    
    /* private */ var updateGherkinStep: Any = js.native
    
    /* private */ var updatePickle: Any = js.native
    
    /* private */ var updatePickleSteps: Any = js.native
  }
}
