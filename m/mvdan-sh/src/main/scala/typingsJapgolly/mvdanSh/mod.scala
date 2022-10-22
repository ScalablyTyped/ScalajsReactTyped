package typingsJapgolly.mvdanSh

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.mvdanSh.anon.BinaryNextLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mvdan-sh", JSImport.Default)
  @js.native
  val default: ShellScript = js.native
  
  @js.native
  sealed trait LangVariant extends StObject
  @JSImport("mvdan-sh", "LangVariant")
  @js.native
  object LangVariant extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LangVariant & Double] = js.native
    
    @js.native
    sealed trait LangBash
      extends StObject
         with LangVariant
    /* 0 */ val LangBash: typingsJapgolly.mvdanSh.mod.LangVariant.LangBash & Double = js.native
    
    @js.native
    sealed trait LangBats
      extends StObject
         with LangVariant
    /* 3 */ val LangBats: typingsJapgolly.mvdanSh.mod.LangVariant.LangBats & Double = js.native
    
    @js.native
    sealed trait LangMirBSDKorn
      extends StObject
         with LangVariant
    /* 2 */ val LangMirBSDKorn: typingsJapgolly.mvdanSh.mod.LangVariant.LangMirBSDKorn & Double = js.native
    
    @js.native
    sealed trait LangPOSIX
      extends StObject
         with LangVariant
    /* 1 */ val LangPOSIX: typingsJapgolly.mvdanSh.mod.LangVariant.LangPOSIX & Double = js.native
  }
  
  trait Command
    extends StObject
       with Node {
    
    var OpPos: Pos
  }
  object Command {
    
    inline def apply(End: CallbackTo[Pos], OpPos: Pos, Pos: CallbackTo[Pos]): Command = {
      val __obj = js.Dynamic.literal(End = End.toJsFn, OpPos = OpPos.asInstanceOf[js.Any], Pos = Pos.toJsFn)
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setOpPos(value: Pos): Self = StObject.set(x, "OpPos", value.asInstanceOf[js.Any])
    }
  }
  
  trait Comment
    extends StObject
       with Node {
    
    var Hash: Pos
    
    var Text: String
  }
  object Comment {
    
    inline def apply(End: CallbackTo[Pos], Hash: Pos, Pos: CallbackTo[Pos], Text: String): Comment = {
      val __obj = js.Dynamic.literal(End = End.toJsFn, Hash = Hash.asInstanceOf[js.Any], Pos = Pos.toJsFn, Text = Text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setHash(value: Pos): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    }
  }
  
  trait File
    extends StObject
       with Node {
    
    var Last: js.Array[Stmt]
    
    var Name: String
    
    var Stmts: js.UndefOr[js.Array[Stmt]] = js.undefined
  }
  object File {
    
    inline def apply(End: CallbackTo[Pos], Last: js.Array[Stmt], Name: String, Pos: CallbackTo[Pos]): File = {
      val __obj = js.Dynamic.literal(End = End.toJsFn, Last = Last.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pos = Pos.toJsFn)
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setLast(value: js.Array[Stmt]): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
      
      inline def setLastVarargs(value: Stmt*): Self = StObject.set(x, "Last", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setStmts(value: js.Array[Stmt]): Self = StObject.set(x, "Stmts", value.asInstanceOf[js.Any])
      
      inline def setStmtsUndefined: Self = StObject.set(x, "Stmts", js.undefined)
      
      inline def setStmtsVarargs(value: Stmt*): Self = StObject.set(x, "Stmts", js.Array(value*))
    }
  }
  
  trait Lit
    extends StObject
       with Node {
    
    var Value: String
    
    var ValueEnd: Pos
    
    var ValuePos: Pos
  }
  object Lit {
    
    inline def apply(End: CallbackTo[Pos], Pos: CallbackTo[Pos], Value: String, ValueEnd: Pos, ValuePos: Pos): Lit = {
      val __obj = js.Dynamic.literal(End = End.toJsFn, Pos = Pos.toJsFn, Value = Value.asInstanceOf[js.Any], ValueEnd = ValueEnd.asInstanceOf[js.Any], ValuePos = ValuePos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lit]
    }
    
    extension [Self <: Lit](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueEnd(value: Pos): Self = StObject.set(x, "ValueEnd", value.asInstanceOf[js.Any])
      
      inline def setValuePos(value: Pos): Self = StObject.set(x, "ValuePos", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    def End(): Pos
    
    def Pos(): typingsJapgolly.mvdanSh.mod.Pos
  }
  object Node {
    
    inline def apply(End: CallbackTo[Pos], Pos: CallbackTo[Pos]): Node = {
      val __obj = js.Dynamic.literal(End = End.toJsFn, Pos = Pos.toJsFn)
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setEnd(value: CallbackTo[Pos]): Self = StObject.set(x, "End", value.toJsFn)
      
      inline def setPos(value: CallbackTo[Pos]): Self = StObject.set(x, "Pos", value.toJsFn)
    }
  }
  
  @js.native
  trait Parser extends StObject {
    
    def Parse(text: String): File = js.native
    def Parse(text: String, path: String): File = js.native
  }
  
  type ParserOption = js.Function1[/* parser */ Parser, Unit]
  
  trait Pos extends StObject {
    
    def After(p: Pos): Boolean
    
    def Col(): Double
    
    def IsValid(): Boolean
    
    def Line(): Double
    
    def Offset(): Double
    
    def String(): java.lang.String
  }
  object Pos {
    
    inline def apply(
      After: Pos => Boolean,
      Col: CallbackTo[Double],
      IsValid: CallbackTo[Boolean],
      Line: CallbackTo[Double],
      Offset: CallbackTo[Double],
      String: CallbackTo[String]
    ): Pos = {
      val __obj = js.Dynamic.literal(After = js.Any.fromFunction1(After), Col = Col.toJsFn, IsValid = IsValid.toJsFn, Line = Line.toJsFn, Offset = Offset.toJsFn, String = String.toJsFn)
      __obj.asInstanceOf[Pos]
    }
    
    extension [Self <: Pos](x: Self) {
      
      inline def setAfter(value: Pos => Boolean): Self = StObject.set(x, "After", js.Any.fromFunction1(value))
      
      inline def setCol(value: CallbackTo[Double]): Self = StObject.set(x, "Col", value.toJsFn)
      
      inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsValid", value.toJsFn)
      
      inline def setLine(value: CallbackTo[Double]): Self = StObject.set(x, "Line", value.toJsFn)
      
      inline def setOffset(value: CallbackTo[Double]): Self = StObject.set(x, "Offset", value.toJsFn)
      
      inline def setString(value: CallbackTo[String]): Self = StObject.set(x, "String", value.toJsFn)
    }
  }
  
  trait Printer extends StObject {
    
    def Print(node: Node): String
  }
  object Printer {
    
    inline def apply(Print: Node => String): Printer = {
      val __obj = js.Dynamic.literal(Print = js.Any.fromFunction1(Print))
      __obj.asInstanceOf[Printer]
    }
    
    extension [Self <: Printer](x: Self) {
      
      inline def setPrint(value: Node => String): Self = StObject.set(x, "Print", js.Any.fromFunction1(value))
    }
  }
  
  type PrinterOption = js.Function1[/* printer */ Printer, Unit]
  
  trait ShellScript extends StObject {
    
    var syntax: BinaryNextLine
  }
  object ShellScript {
    
    inline def apply(syntax: BinaryNextLine): ShellScript = {
      val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellScript]
    }
    
    extension [Self <: ShellScript](x: Self) {
      
      inline def setSyntax(value: BinaryNextLine): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stmt
    extends StObject
       with Node {
    
    var Background: Boolean
    
    var Cmd: Command
    
    var Comments: js.Array[Comment]
    
    var Coprocess: Boolean
    
    var Negated: Boolean
    
    var Position: Pos
    
    var Semicolon: Pos
  }
  object Stmt {
    
    inline def apply(
      Background: Boolean,
      Cmd: Command,
      Comments: js.Array[Comment],
      Coprocess: Boolean,
      End: CallbackTo[Pos],
      Negated: Boolean,
      Pos: CallbackTo[Pos],
      Position: Pos,
      Semicolon: Pos
    ): Stmt = {
      val __obj = js.Dynamic.literal(Background = Background.asInstanceOf[js.Any], Cmd = Cmd.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], Coprocess = Coprocess.asInstanceOf[js.Any], End = End.toJsFn, Negated = Negated.asInstanceOf[js.Any], Pos = Pos.toJsFn, Position = Position.asInstanceOf[js.Any], Semicolon = Semicolon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stmt]
    }
    
    extension [Self <: Stmt](x: Self) {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
      
      inline def setCmd(value: Command): Self = StObject.set(x, "Cmd", value.asInstanceOf[js.Any])
      
      inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "Comments", js.Array(value*))
      
      inline def setCoprocess(value: Boolean): Self = StObject.set(x, "Coprocess", value.asInstanceOf[js.Any])
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "Negated", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Pos): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
      
      inline def setSemicolon(value: Pos): Self = StObject.set(x, "Semicolon", value.asInstanceOf[js.Any])
    }
  }
  
  trait Word
    extends StObject
       with Node {
    
    def Lit(): String
    
    var Parts: js.Array[WordPart]
  }
  object Word {
    
    inline def apply(End: CallbackTo[Pos], Lit: CallbackTo[String], Parts: js.Array[WordPart], Pos: CallbackTo[Pos]): Word = {
      val __obj = js.Dynamic.literal(End = End.toJsFn, Lit = Lit.toJsFn, Parts = Parts.asInstanceOf[js.Any], Pos = Pos.toJsFn)
      __obj.asInstanceOf[Word]
    }
    
    extension [Self <: Word](x: Self) {
      
      inline def setLit(value: CallbackTo[String]): Self = StObject.set(x, "Lit", value.toJsFn)
      
      inline def setParts(value: js.Array[WordPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: WordPart*): Self = StObject.set(x, "Parts", js.Array(value*))
    }
  }
  
  type WordPart = Node
  
  type _To = ShellScript
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ShellScript = default
}
