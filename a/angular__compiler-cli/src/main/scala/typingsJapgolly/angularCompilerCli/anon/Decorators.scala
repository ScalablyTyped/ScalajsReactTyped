package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorators extends StObject {
  
  var decorators: js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator]
  
  var member: ClassMember
}
object Decorators {
  
  inline def apply(
    decorators: js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator],
    member: ClassMember
  ): Decorators = {
    val __obj = js.Dynamic.literal(decorators = decorators.asInstanceOf[js.Any], member = member.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorators]
  }
  
  extension [Self <: Decorators](x: Self) {
    
    inline def setDecorators(value: js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsVarargs(value: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator*): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setMember(value: ClassMember): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
  }
}
