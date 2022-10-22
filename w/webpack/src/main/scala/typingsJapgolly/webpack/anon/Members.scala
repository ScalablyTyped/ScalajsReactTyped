package typingsJapgolly.webpack.anon

import typingsJapgolly.estree.mod.ArrayExpression
import typingsJapgolly.estree.mod.ArrowFunctionExpression
import typingsJapgolly.estree.mod.AssignmentExpression
import typingsJapgolly.estree.mod.AwaitExpression
import typingsJapgolly.estree.mod.BigIntLiteral
import typingsJapgolly.estree.mod.BinaryExpression
import typingsJapgolly.estree.mod.ChainExpression
import typingsJapgolly.estree.mod.ClassExpression
import typingsJapgolly.estree.mod.ConditionalExpression
import typingsJapgolly.estree.mod.FunctionExpression
import typingsJapgolly.estree.mod.Identifier
import typingsJapgolly.estree.mod.ImportExpression
import typingsJapgolly.estree.mod.LogicalExpression
import typingsJapgolly.estree.mod.MemberExpression
import typingsJapgolly.estree.mod.MetaProperty
import typingsJapgolly.estree.mod.NewExpression
import typingsJapgolly.estree.mod.ObjectExpression
import typingsJapgolly.estree.mod.RegExpLiteral
import typingsJapgolly.estree.mod.SequenceExpression
import typingsJapgolly.estree.mod.SimpleCallExpression
import typingsJapgolly.estree.mod.SimpleLiteral
import typingsJapgolly.estree.mod.Super
import typingsJapgolly.estree.mod.TaggedTemplateExpression
import typingsJapgolly.estree.mod.TemplateLiteral
import typingsJapgolly.estree.mod.ThisExpression
import typingsJapgolly.estree.mod.UnaryExpression
import typingsJapgolly.estree.mod.UpdateExpression
import typingsJapgolly.estree.mod.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Members extends StObject {
  
  var members: js.Array[String]
  
  var membersOptionals: js.Array[Boolean]
  
  var `object`: UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | Super
}
object Members {
  
  inline def apply(
    members: js.Array[String],
    membersOptionals: js.Array[Boolean],
    `object`: UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | Super
  ): Members = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], membersOptionals = membersOptionals.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  
  extension [Self <: Members](x: Self) {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersOptionals(value: js.Array[Boolean]): Self = StObject.set(x, "membersOptionals", value.asInstanceOf[js.Any])
    
    inline def setMembersOptionalsVarargs(value: Boolean*): Self = StObject.set(x, "membersOptionals", js.Array(value*))
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setObject(
      value: UnaryExpression | ThisExpression | ArrayExpression | ObjectExpression | FunctionExpression | ArrowFunctionExpression | YieldExpression | SimpleLiteral | RegExpLiteral | BigIntLiteral | UpdateExpression | BinaryExpression | AssignmentExpression | LogicalExpression | MemberExpression | ConditionalExpression | SimpleCallExpression | NewExpression | SequenceExpression | TemplateLiteral | TaggedTemplateExpression | ClassExpression | MetaProperty | Identifier | AwaitExpression | ImportExpression | ChainExpression | Super
    ): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
