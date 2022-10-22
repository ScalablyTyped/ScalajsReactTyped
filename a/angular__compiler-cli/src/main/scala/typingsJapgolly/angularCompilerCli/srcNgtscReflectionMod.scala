package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.Decorators
import typingsJapgolly.angularCompilerCli.anon.From
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.EntityName
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.ObjectLiteralExpression
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscReflectionMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection", "ClassMemberKind")
  @js.native
  object ClassMemberKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind & Double
      ] = js.native
    
    /* 0 */ val Constructor: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Constructor & Double = js.native
    
    /* 1 */ val Getter: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Getter & Double = js.native
    
    /* 4 */ val Method: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Method & Double = js.native
    
    /* 3 */ val Property: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Property & Double = js.native
    
    /* 2 */ val Setter: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Setter & Double = js.native
  }
  
  object Decorator {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/reflection", "Decorator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def nodeForError(decorator: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeForError")(decorator.asInstanceOf[js.Any]).asInstanceOf[Node]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection", "KnownDeclaration")
  @js.native
  object KnownDeclaration extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration & Double
      ] = js.native
    
    /* 0 */ val JsGlobalObject: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration.JsGlobalObject & Double = js.native
    
    /* 1 */ val TsHelperAssign: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration.TsHelperAssign & Double = js.native
    
    /* 5 */ val TsHelperRead: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration.TsHelperRead & Double = js.native
    
    /* 2 */ val TsHelperSpread: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration.TsHelperSpread & Double = js.native
    
    /* 4 */ val TsHelperSpreadArray: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration.TsHelperSpreadArray & Double = js.native
    
    /* 3 */ val TsHelperSpreadArrays: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration.TsHelperSpreadArrays & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection", "TypeScriptReflectionHost")
  @js.native
  open class TypeScriptReflectionHost protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcTypescriptMod.TypeScriptReflectionHost {
    def this(checker: TypeChecker) = this()
  }
  
  inline def filterToMembersWithDecorator(members: js.Array[ClassMember], name: String): js.Array[Decorators] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterToMembersWithDecorator")(members.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Decorators]]
  inline def filterToMembersWithDecorator(members: js.Array[ClassMember], name: String, module: String): js.Array[Decorators] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterToMembersWithDecorator")(members.asInstanceOf[js.Any], name.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[js.Array[Decorators]]
  
  inline def isConcreteDeclaration(decl: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ConcreteDeclaration<typescript.typescript.Declaration> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConcreteDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ConcreteDeclaration<typescript.typescript.Declaration> */ Boolean]
  
  inline def isDecoratorIdentifier(exp: Expression): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecoratorIdentifier")(exp.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean]
  
  inline def isNamedClassDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationClassDecl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationClassDecl */ Boolean]
  
  inline def isNamedFunctionDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationFunctionD */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedFunctionDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationFunctionD */ Boolean]
  
  inline def isNamedVariableDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationVariableD */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationVariableD */ Boolean]
  
  inline def reflectIdentifierOfDeclaration(decl: Declaration): Identifier | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectIdentifierOfDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[Identifier | Null]
  
  inline def reflectNameOfDeclaration(decl: Declaration): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectNameOfDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def reflectObjectLiteral(node: ObjectLiteralExpression): Map[String, Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectObjectLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Map[String, Expression]]
  
  inline def reflectTypeEntityToDeclaration(`type`: EntityName, checker: TypeChecker): From = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectTypeEntityToDeclaration")(`type`.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[From]
  
  inline def typeNodeToValueExpr(node: TypeNode): Expression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("typeNodeToValueExpr")(node.asInstanceOf[js.Any]).asInstanceOf[Expression | Null]
}
