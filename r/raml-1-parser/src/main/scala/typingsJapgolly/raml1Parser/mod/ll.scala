package typingsJapgolly.raml1Parser.mod

import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind
import typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import typingsJapgolly.raml1Parser.distParserLowLevelASTMod.InsertionPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ll {
  
  @JSImport("raml-1-parser", "ll")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "ll.ASTChangeCommand")
  @js.native
  open class ASTChangeCommand protected ()
    extends typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand {
    def this(kind: CommandKind, target: ILowLevelASTNode, value: String, position: Double) = this()
    def this(kind: CommandKind, target: ILowLevelASTNode, value: ILowLevelASTNode, position: Double) = this()
  }
  
  @JSImport("raml-1-parser", "ll.ASTDelta")
  @js.native
  open class ASTDelta ()
    extends typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTDelta
  
  @JSImport("raml-1-parser", "ll.CommandKind")
  @js.native
  object CommandKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind & Double] = js.native
    
    /* 0 */ val ADD_CHILD: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind.ADD_CHILD & Double = js.native
    
    /* 3 */ val CHANGE_KEY: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind.CHANGE_KEY & Double = js.native
    
    /* 4 */ val CHANGE_VALUE: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind.CHANGE_VALUE & Double = js.native
    
    /* 5 */ val INIT_RAML_FILE: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind.INIT_RAML_FILE & Double = js.native
    
    /* 2 */ val MOVE_CHILD: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind.MOVE_CHILD & Double = js.native
    
    /* 1 */ val REMOVE_CHILD: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CommandKind.REMOVE_CHILD & Double = js.native
  }
  
  @JSImport("raml-1-parser", "ll.CompositeCommand")
  @js.native
  open class CompositeCommand ()
    extends typingsJapgolly.raml1Parser.distParserLowLevelASTMod.CompositeCommand
  
  @JSImport("raml-1-parser", "ll.InsertionPointType")
  @js.native
  object InsertionPointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.InsertionPointType & Double] = js.native
    
    /* 2 */ val END: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.InsertionPointType.END & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.InsertionPointType.NONE & Double = js.native
    
    /* 3 */ val POINT: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.InsertionPointType.POINT & Double = js.native
    
    /* 1 */ val START: typingsJapgolly.raml1Parser.distParserLowLevelASTMod.InsertionPointType.START & Double = js.native
  }
  
  @JSImport("raml-1-parser", "ll.LineMapperImpl")
  @js.native
  open class LineMapperImpl protected ()
    extends typingsJapgolly.raml1Parser.distParserLowLevelASTMod.LineMapperImpl {
    def this(content: String, absPath: String) = this()
  }
  
  @JSImport("raml-1-parser", "ll.TextChangeCommand")
  @js.native
  open class TextChangeCommand protected ()
    extends typingsJapgolly.raml1Parser.distParserLowLevelASTMod.TextChangeCommand {
    def this(offset: Double, replacementLength: Double, text: String, unit: ICompilationUnit) = this()
    def this(
      offset: Double,
      replacementLength: Double,
      text: String,
      unit: ICompilationUnit,
      target: ILowLevelASTNode
    ) = this()
  }
  
  inline def buildPath(reference: Any, unitPath: Any, rootPath: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(reference.asInstanceOf[js.Any], unitPath.asInstanceOf[js.Any], rootPath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def initRamlFile(root: ILowLevelASTNode, newroot: ILowLevelASTNode): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("initRamlFile")(root.asInstanceOf[js.Any], newroot.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: Unit, toSeq: Boolean): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any], toSeq.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: ILowLevelASTNode): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: ILowLevelASTNode, toSeq: Boolean): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any], toSeq.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: InsertionPoint): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  inline def insertNode(t: ILowLevelASTNode, child: ILowLevelASTNode, insertAfter: InsertionPoint, toSeq: Boolean): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any], insertAfter.asInstanceOf[js.Any], toSeq.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  
  inline def isLowLevelNode(`object`: Any): /* is raml-1-parser.raml-1-parser/dist/parser/lowLevelAST.ILowLevelASTNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowLevelNode")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is raml-1-parser.raml-1-parser/dist/parser/lowLevelAST.ILowLevelASTNode */ Boolean]
  
  inline def isWebPath(reference: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebPath")(reference.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeNode(t: ILowLevelASTNode, child: ILowLevelASTNode): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(t.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  
  inline def setAttr(t: ILowLevelASTNode, value: String): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(t.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  
  inline def setAttrStructured(t: ILowLevelASTNode, value: IStructuredValue): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttrStructured")(t.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  
  inline def setKey(t: ILowLevelASTNode, value: String): typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("setKey")(t.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.raml1Parser.distParserLowLevelASTMod.ASTChangeCommand]
  
  inline def toAbsolutePath(context: String, reference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toAbsolutePath")(context.asInstanceOf[js.Any], reference.asInstanceOf[js.Any])).asInstanceOf[String]
}
