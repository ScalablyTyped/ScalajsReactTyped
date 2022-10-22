package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.angularCompilerCli.privateMigrationsMod.PartialEvaluator
import typingsJapgolly.angularCompilerCli.privateMigrationsMod.StaticInterpreter
import typingsJapgolly.angularCompilerCli.privateMigrationsMod.TypeScriptReflectionHost
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.FunctionDeclaration
import typingsJapgolly.typescript.mod.FunctionExpression
import typingsJapgolly.typescript.mod.MethodDeclaration
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.ObjectLiteralExpression
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedMigrations extends StObject {
  
  var DynamicValue: TypeofDynamicValue
  
  var PartialEvaluator: Instantiable2[
    /* host */ ReflectionHost, 
    /* checker */ TypeChecker, 
    typingsJapgolly.angularCompilerCli.privateMigrationsMod.PartialEvaluator
  ]
  
  var Reference: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
    typingsJapgolly.angularCompilerCli.privateMigrationsMod.Reference[Node]
  ]
  
  var StaticInterpreter: Instantiable2[
    /* host */ ReflectionHost, 
    /* checker */ TypeChecker, 
    typingsJapgolly.angularCompilerCli.privateMigrationsMod.StaticInterpreter
  ]
  
  var TypeScriptReflectionHost: Instantiable1[
    /* checker */ TypeChecker, 
    typingsJapgolly.angularCompilerCli.privateMigrationsMod.TypeScriptReflectionHost
  ]
  
  def forwardRefResolver(
    fn: Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression],
    callExpr: CallExpression,
    resolve: js.Function1[/* expr */ Expression, ResolvedValue],
    unresolvable: DynamicValue[Any]
  ): ResolvedValue
  
  def reflectObjectLiteral(node: ObjectLiteralExpression): Map[String, Expression]
}
object TypeofimportedMigrations {
  
  inline def apply(
    DynamicValue: TypeofDynamicValue,
    PartialEvaluator: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, PartialEvaluator],
    Reference: Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
      typingsJapgolly.angularCompilerCli.privateMigrationsMod.Reference[Node]
    ],
    StaticInterpreter: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, StaticInterpreter],
    TypeScriptReflectionHost: Instantiable1[/* checker */ TypeChecker, TypeScriptReflectionHost],
    forwardRefResolver: (Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression], CallExpression, js.Function1[/* expr */ Expression, ResolvedValue], DynamicValue[Any]) => ResolvedValue,
    reflectObjectLiteral: ObjectLiteralExpression => Map[String, Expression]
  ): TypeofimportedMigrations = {
    val __obj = js.Dynamic.literal(DynamicValue = DynamicValue.asInstanceOf[js.Any], PartialEvaluator = PartialEvaluator.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], StaticInterpreter = StaticInterpreter.asInstanceOf[js.Any], TypeScriptReflectionHost = TypeScriptReflectionHost.asInstanceOf[js.Any], forwardRefResolver = js.Any.fromFunction4(forwardRefResolver), reflectObjectLiteral = js.Any.fromFunction1(reflectObjectLiteral))
    __obj.asInstanceOf[TypeofimportedMigrations]
  }
  
  extension [Self <: TypeofimportedMigrations](x: Self) {
    
    inline def setDynamicValue(value: TypeofDynamicValue): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    inline def setForwardRefResolver(
      value: (Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression], CallExpression, js.Function1[/* expr */ Expression, ResolvedValue], DynamicValue[Any]) => ResolvedValue
    ): Self = StObject.set(x, "forwardRefResolver", js.Any.fromFunction4(value))
    
    inline def setPartialEvaluator(value: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, PartialEvaluator]): Self = StObject.set(x, "PartialEvaluator", value.asInstanceOf[js.Any])
    
    inline def setReference(
      value: Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
          typingsJapgolly.angularCompilerCli.privateMigrationsMod.Reference[Node]
        ]
    ): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    inline def setReflectObjectLiteral(value: ObjectLiteralExpression => Map[String, Expression]): Self = StObject.set(x, "reflectObjectLiteral", js.Any.fromFunction1(value))
    
    inline def setStaticInterpreter(value: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, StaticInterpreter]): Self = StObject.set(x, "StaticInterpreter", value.asInstanceOf[js.Any])
    
    inline def setTypeScriptReflectionHost(value: Instantiable1[/* checker */ TypeChecker, TypeScriptReflectionHost]): Self = StObject.set(x, "TypeScriptReflectionHost", value.asInstanceOf[js.Any])
  }
}
