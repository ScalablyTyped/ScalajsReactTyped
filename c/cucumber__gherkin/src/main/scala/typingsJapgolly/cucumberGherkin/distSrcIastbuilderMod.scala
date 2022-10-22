package typingsJapgolly.cucumberGherkin

import typingsJapgolly.cucumberGherkin.distSrcItokenMod.IToken
import typingsJapgolly.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typingsJapgolly.cucumberMessages.mod.Comment
import typingsJapgolly.cucumberMessages.mod.Location
import typingsJapgolly.cucumberMessages.mod.TableCell
import typingsJapgolly.cucumberMessages.mod.TableRow
import typingsJapgolly.cucumberMessages.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIastbuilderMod {
  
  @js.native
  trait IAstBuilder[AstNode, TokenType, RuleType] extends StObject {
    
    def build(token: IToken[TokenType]): Unit = js.native
    
    var comments: js.Array[Comment] = js.native
    
    def currentNode(): Any = js.native
    
    def endRule(): Unit = js.native
    
    def ensureCellCount(rows: js.Array[TableRow]): Unit = js.native
    
    def getCells(tableRowToken: IToken[TokenType]): js.Array[TableCell] = js.native
    
    def getDescription(node: AstNode): Any = js.native
    
    def getLocation(token: IToken[TokenType]): Location = js.native
    def getLocation(token: IToken[TokenType], column: Double): Location = js.native
    
    def getResult(): Any = js.native
    
    def getSteps(node: AstNode): js.Array[Any] = js.native
    
    def getTableRows(node: AstNode): js.UndefOr[js.Array[TableRow]] = js.native
    
    def getTags(node: AstNode): js.Array[Tag] = js.native
    
    def newId(): String = js.native
    @JSName("newId")
    var newId_Original: NewId = js.native
    
    def reset(): Unit = js.native
    
    var stack: js.Array[AstNode] = js.native
    
    def startRule(ruleType: RuleType): Unit = js.native
    
    def transformNode(node: AstNode): Any = js.native
  }
}
