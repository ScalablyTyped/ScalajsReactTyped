package typingsJapgolly.stylus.mod.Stylus

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.stylus.TypeofHSLA
import typingsJapgolly.stylus.TypeofRGBA
import typingsJapgolly.stylus.mod.Stylus.Nodes.Arguments
import typingsJapgolly.stylus.mod.Stylus.Nodes.Atblock
import typingsJapgolly.stylus.mod.Stylus.Nodes.Atrule
import typingsJapgolly.stylus.mod.Stylus.Nodes.BinOp
import typingsJapgolly.stylus.mod.Stylus.Nodes.Block
import typingsJapgolly.stylus.mod.Stylus.Nodes.Call
import typingsJapgolly.stylus.mod.Stylus.Nodes.Charset
import typingsJapgolly.stylus.mod.Stylus.Nodes.Comment
import typingsJapgolly.stylus.mod.Stylus.Nodes.Each
import typingsJapgolly.stylus.mod.Stylus.Nodes.Expression
import typingsJapgolly.stylus.mod.Stylus.Nodes.Extend
import typingsJapgolly.stylus.mod.Stylus.Nodes.Function
import typingsJapgolly.stylus.mod.Stylus.Nodes.Group
import typingsJapgolly.stylus.mod.Stylus.Nodes.Ident
import typingsJapgolly.stylus.mod.Stylus.Nodes.If
import typingsJapgolly.stylus.mod.Stylus.Nodes.Import
import typingsJapgolly.stylus.mod.Stylus.Nodes.Keyframes
import typingsJapgolly.stylus.mod.Stylus.Nodes.Literal
import typingsJapgolly.stylus.mod.Stylus.Nodes.Media
import typingsJapgolly.stylus.mod.Stylus.Nodes.Member
import typingsJapgolly.stylus.mod.Stylus.Nodes.Namespace
import typingsJapgolly.stylus.mod.Stylus.Nodes.Node
import typingsJapgolly.stylus.mod.Stylus.Nodes.Null
import typingsJapgolly.stylus.mod.Stylus.Nodes.Object
import typingsJapgolly.stylus.mod.Stylus.Nodes.Params
import typingsJapgolly.stylus.mod.Stylus.Nodes.Property
import typingsJapgolly.stylus.mod.Stylus.Nodes.Query
import typingsJapgolly.stylus.mod.Stylus.Nodes.QueryExpr
import typingsJapgolly.stylus.mod.Stylus.Nodes.QueryList
import typingsJapgolly.stylus.mod.Stylus.Nodes.Return
import typingsJapgolly.stylus.mod.Stylus.Nodes.Root
import typingsJapgolly.stylus.mod.Stylus.Nodes.Selector
import typingsJapgolly.stylus.mod.Stylus.Nodes.Ternary
import typingsJapgolly.stylus.mod.Stylus.Nodes.UnaryOp
import typingsJapgolly.stylus.mod.Stylus.Nodes.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatic extends js.Object {
  var Arguments: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Arguments]
  var Atblock: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Atblock]
  var Atrule: Instantiable1[/* type */ String, typingsJapgolly.stylus.mod.Stylus.Nodes.Atrule]
  var BinOp: Instantiable3[
    /* op */ String, 
    /* left */ Expression, 
    /* right */ Expression, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.BinOp
  ]
  var Block: Instantiable1[
    /* parent */ typingsJapgolly.stylus.mod.Stylus.Nodes.Block, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.Block
  ]
  var Boolean: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean]
  var Call: Instantiable2[
    /* name */ String, 
    /* args */ Expression, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.Call
  ]
  var Charset: Instantiable1[/* val */ String, typingsJapgolly.stylus.mod.Stylus.Nodes.Charset]
  var Comment: Instantiable3[
    /* str */ String, 
    /* suppress */ Boolean, 
    /* inline */ Boolean, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.Comment
  ]
  var Each: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Each]
  var Expression: Instantiable1[/* isList */ Boolean, typingsJapgolly.stylus.mod.Stylus.Nodes.Expression]
  var Extend: Instantiable1[/* selectors */ js.Array[Selector], typingsJapgolly.stylus.mod.Stylus.Nodes.Extend]
  var Function: Instantiable3[
    /* name */ String, 
    /* params */ Params, 
    /* body */ Block, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.Function
  ]
  var Group: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Group]
  var HSLA: TypeofHSLA
  var Ident: Instantiable2[/* name */ String, /* val */ Node, typingsJapgolly.stylus.mod.Stylus.Nodes.Ident]
  var If: Instantiable2[
    /* cond */ Expression, 
    /* negate */ Boolean, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.If
  ]
  var Import: Instantiable1[/* path */ Expression, typingsJapgolly.stylus.mod.Stylus.Nodes.Import]
  var Keyframes: Instantiable1[/* segs */ js.Array[Node], typingsJapgolly.stylus.mod.Stylus.Nodes.Keyframes]
  var Literal: Instantiable1[/* str */ String, typingsJapgolly.stylus.mod.Stylus.Nodes.Literal]
  var Media: Instantiable1[/* val */ String, typingsJapgolly.stylus.mod.Stylus.Nodes.Media]
  var Member: Instantiable2[/* left */ Node, /* right */ Node, typingsJapgolly.stylus.mod.Stylus.Nodes.Member]
  var Namespace: Instantiable2[
    /* val */ String, 
    /* prefix */ String, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.Namespace
  ]
  var Node: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Node]
  var Null: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Null]
  var Object: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Object]
  var Params: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Params]
  var Property: Instantiable2[
    /* segs */ js.Array[Node], 
    /* expr */ Expression, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.Property
  ]
  var Query: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Query]
  var QueryExpr: Instantiable1[/* segs */ js.Array[Node], typingsJapgolly.stylus.mod.Stylus.Nodes.QueryExpr]
  var QueryList: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.QueryList]
  var RGBA: TypeofRGBA
  var Return: Instantiable1[/* expr */ Expression, typingsJapgolly.stylus.mod.Stylus.Nodes.Return]
  var Root: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Root]
  var Selector: Instantiable1[/* segs */ js.Array[Node], typingsJapgolly.stylus.mod.Stylus.Nodes.Selector]
  var String: Instantiable1[/* val */ java.lang.String, typingsJapgolly.stylus.mod.Stylus.Nodes.String]
  var Ternary: Instantiable3[
    /* op */ String, 
    /* trueExpr */ Expression, 
    /* falseExpr */ Expression, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.Ternary
  ]
  var UnaryOp: Instantiable2[
    /* op */ String, 
    /* expr */ Expression, 
    typingsJapgolly.stylus.mod.Stylus.Nodes.UnaryOp
  ]
  var Unit: Instantiable2[/* val */ Double, /* type */ String, typingsJapgolly.stylus.mod.Stylus.Nodes.Unit]
  var `false`: typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean
  var `null`: Null
  var `true`: typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean
}

object NodeStatic {
  @scala.inline
  def apply(
    Arguments: Instantiable0[Arguments],
    Atblock: Instantiable0[Atblock],
    Atrule: Instantiable1[/* type */ String, Atrule],
    BinOp: Instantiable3[/* op */ String, /* left */ Expression, /* right */ Expression, BinOp],
    Block: Instantiable1[/* parent */ Block, Block],
    Boolean: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean],
    Call: Instantiable2[/* name */ String, /* args */ Expression, Call],
    Charset: Instantiable1[/* val */ String, Charset],
    Comment: Instantiable3[/* str */ String, /* suppress */ Boolean, /* inline */ Boolean, Comment],
    Each: Instantiable0[Each],
    Expression: Instantiable1[/* isList */ Boolean, Expression],
    Extend: Instantiable1[/* selectors */ js.Array[Selector], Extend],
    Function: Instantiable3[/* name */ String, /* params */ Params, /* body */ Block, Function],
    Group: Instantiable0[Group],
    HSLA: TypeofHSLA,
    Ident: Instantiable2[/* name */ String, /* val */ Node, Ident],
    If: Instantiable2[/* cond */ Expression, /* negate */ Boolean, If],
    Import: Instantiable1[/* path */ Expression, Import],
    Keyframes: Instantiable1[/* segs */ js.Array[Node], Keyframes],
    Literal: Instantiable1[/* str */ String, Literal],
    Media: Instantiable1[/* val */ String, Media],
    Member: Instantiable2[/* left */ Node, /* right */ Node, Member],
    Namespace: Instantiable2[/* val */ String, /* prefix */ String, Namespace],
    Node: Instantiable0[Node],
    Null: Instantiable0[Null],
    Object: Instantiable0[Object],
    Params: Instantiable0[Params],
    Property: Instantiable2[/* segs */ js.Array[Node], /* expr */ Expression, Property],
    Query: Instantiable0[Query],
    QueryExpr: Instantiable1[/* segs */ js.Array[Node], QueryExpr],
    QueryList: Instantiable0[QueryList],
    RGBA: TypeofRGBA,
    Return: Instantiable1[/* expr */ Expression, Return],
    Root: Instantiable0[Root],
    Selector: Instantiable1[/* segs */ js.Array[Node], Selector],
    String: Instantiable1[/* val */ String, typingsJapgolly.stylus.mod.Stylus.Nodes.String],
    Ternary: Instantiable3[/* op */ String, /* trueExpr */ Expression, /* falseExpr */ Expression, Ternary],
    UnaryOp: Instantiable2[/* op */ String, /* expr */ Expression, UnaryOp],
    Unit: Instantiable2[/* val */ Double, /* type */ String, Unit],
    `false`: typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean,
    `null`: Null,
    `true`: typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Atblock = Atblock.asInstanceOf[js.Any], Atrule = Atrule.asInstanceOf[js.Any], BinOp = BinOp.asInstanceOf[js.Any], Block = Block.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Call = Call.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Each = Each.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], HSLA = HSLA.asInstanceOf[js.Any], Ident = Ident.asInstanceOf[js.Any], If = If.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], Keyframes = Keyframes.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], Member = Member.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Params = Params.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryExpr = QueryExpr.asInstanceOf[js.Any], QueryList = QueryList.asInstanceOf[js.Any], RGBA = RGBA.asInstanceOf[js.Any], Return = Return.asInstanceOf[js.Any], Root = Root.asInstanceOf[js.Any], Selector = Selector.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Ternary = Ternary.asInstanceOf[js.Any], UnaryOp = UnaryOp.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatic]
  }
}

