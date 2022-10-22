package typingsJapgolly.stylus.mod.Stylus

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.stylus.anon.TypeofHSLA
import typingsJapgolly.stylus.anon.TypeofRGBA
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeStatic extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: NodeStatic](x: Self) {
    
    inline def setArguments(value: Instantiable0[Arguments]): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    inline def setAtblock(value: Instantiable0[Atblock]): Self = StObject.set(x, "Atblock", value.asInstanceOf[js.Any])
    
    inline def setAtrule(value: Instantiable1[/* type */ String, Atrule]): Self = StObject.set(x, "Atrule", value.asInstanceOf[js.Any])
    
    inline def setBinOp(value: Instantiable3[/* op */ String, /* left */ Expression, /* right */ Expression, BinOp]): Self = StObject.set(x, "BinOp", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: Instantiable1[/* parent */ Block, Block]): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBoolean(value: Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean]): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
    
    inline def setCall(value: Instantiable2[/* name */ String, /* args */ Expression, Call]): Self = StObject.set(x, "Call", value.asInstanceOf[js.Any])
    
    inline def setCharset(value: Instantiable1[/* val */ String, Charset]): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setComment(value: Instantiable3[/* str */ String, /* suppress */ Boolean, /* inline */ Boolean, Comment]): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setEach(value: Instantiable0[Each]): Self = StObject.set(x, "Each", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Instantiable1[/* isList */ Boolean, Expression]): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExtend(value: Instantiable1[/* selectors */ js.Array[Selector], Extend]): Self = StObject.set(x, "Extend", value.asInstanceOf[js.Any])
    
    inline def setFalse(value: typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: Instantiable3[/* name */ String, /* params */ Params, /* body */ Block, Function]): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Instantiable0[Group]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setHSLA(value: TypeofHSLA): Self = StObject.set(x, "HSLA", value.asInstanceOf[js.Any])
    
    inline def setIdent(value: Instantiable2[/* name */ String, /* val */ Node, Ident]): Self = StObject.set(x, "Ident", value.asInstanceOf[js.Any])
    
    inline def setIf(value: Instantiable2[/* cond */ Expression, /* negate */ Boolean, If]): Self = StObject.set(x, "If", value.asInstanceOf[js.Any])
    
    inline def setImport(value: Instantiable1[/* path */ Expression, Import]): Self = StObject.set(x, "Import", value.asInstanceOf[js.Any])
    
    inline def setKeyframes(value: Instantiable1[/* segs */ js.Array[Node], Keyframes]): Self = StObject.set(x, "Keyframes", value.asInstanceOf[js.Any])
    
    inline def setLiteral(value: Instantiable1[/* str */ String, Literal]): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Instantiable1[/* val */ String, Media]): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    inline def setMember(value: Instantiable2[/* left */ Node, /* right */ Node, Member]): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Instantiable2[/* val */ String, /* prefix */ String, Namespace]): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Instantiable0[Node]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    inline def setNull(value: Instantiable0[Null]): Self = StObject.set(x, "Null", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Instantiable0[Object]): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Instantiable0[Params]): Self = StObject.set(x, "Params", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Instantiable2[/* segs */ js.Array[Node], /* expr */ Expression, Property]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Instantiable0[Query]): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setQueryExpr(value: Instantiable1[/* segs */ js.Array[Node], QueryExpr]): Self = StObject.set(x, "QueryExpr", value.asInstanceOf[js.Any])
    
    inline def setQueryList(value: Instantiable0[QueryList]): Self = StObject.set(x, "QueryList", value.asInstanceOf[js.Any])
    
    inline def setRGBA(value: TypeofRGBA): Self = StObject.set(x, "RGBA", value.asInstanceOf[js.Any])
    
    inline def setReturn(value: Instantiable1[/* expr */ Expression, Return]): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Instantiable0[Root]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: Instantiable1[/* segs */ js.Array[Node], Selector]): Self = StObject.set(x, "Selector", value.asInstanceOf[js.Any])
    
    inline def setString(value: Instantiable1[/* val */ String, typingsJapgolly.stylus.mod.Stylus.Nodes.String]): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    
    inline def setTernary(
      value: Instantiable3[/* op */ String, /* trueExpr */ Expression, /* falseExpr */ Expression, Ternary]
    ): Self = StObject.set(x, "Ternary", value.asInstanceOf[js.Any])
    
    inline def setTrue(value: typingsJapgolly.stylus.mod.Stylus.Nodes.Boolean): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
    
    inline def setUnaryOp(value: Instantiable2[/* op */ String, /* expr */ Expression, UnaryOp]): Self = StObject.set(x, "UnaryOp", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Instantiable2[/* val */ Double, /* type */ String, Unit]): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
  }
}
