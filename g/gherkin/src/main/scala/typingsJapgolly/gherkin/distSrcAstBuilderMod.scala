package typingsJapgolly.gherkin

import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ILocation
import typingsJapgolly.cucumberMessages.distSrcIdGeneratorMod.NewId
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.Background
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.FeatureChild.Rule
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.Scenario
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.Scenario.Examples
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.Step
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.Step.DataTable
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.Step.DocString
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.TableRow
import typingsJapgolly.cucumberMessages.mod.messages.GherkinDocument.Feature.TableRow.TableCell
import typingsJapgolly.gherkin.distSrcParserMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAstBuilderMod {
  
  @JSImport("gherkin/dist/src/AstBuilder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AstBuilder {
    def this(newId: NewId) = this()
  }
  
  @js.native
  trait AstBuilder extends StObject {
    
    def build(token: typingsJapgolly.gherkin.distSrcTokenMod.default): Unit = js.native
    
    /* private */ var comments: Any = js.native
    
    def currentNode(): typingsJapgolly.gherkin.distSrcAstNodeMod.default = js.native
    
    def endRule(ruleType: RuleType): Unit = js.native
    
    def ensureCellCount(rows: js.Array[Any]): Unit = js.native
    
    def getCells(tableRowToken: typingsJapgolly.gherkin.distSrcTokenMod.default): js.Array[TableCell] = js.native
    
    def getDescription(node: typingsJapgolly.gherkin.distSrcAstNodeMod.default): Any = js.native
    
    def getLocation(token: typingsJapgolly.gherkin.distSrcTokenMod.default): ILocation = js.native
    def getLocation(token: typingsJapgolly.gherkin.distSrcTokenMod.default, column: Double): ILocation = js.native
    
    def getResult(): Any = js.native
    
    def getSteps(node: typingsJapgolly.gherkin.distSrcAstNodeMod.default): js.Array[Any] = js.native
    
    def getTableRows(node: typingsJapgolly.gherkin.distSrcAstNodeMod.default): js.Array[TableRow] = js.native
    
    def getTags(node: typingsJapgolly.gherkin.distSrcAstNodeMod.default): js.Array[ITag] = js.native
    
    /* private */ val newId: Any = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var stack: Any = js.native
    
    def startRule(ruleType: RuleType): Unit = js.native
    
    def transformNode(node: typingsJapgolly.gherkin.distSrcAstNodeMod.default): String | typingsJapgolly.gherkin.distSrcAstNodeMod.default | GherkinDocument | Feature | Step | DocString | DataTable | js.Array[TableRow] | Background | Scenario | Examples | Rule = js.native
  }
}
