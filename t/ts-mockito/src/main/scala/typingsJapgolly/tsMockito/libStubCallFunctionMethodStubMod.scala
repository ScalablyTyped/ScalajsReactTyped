package typingsJapgolly.tsMockito

import typingsJapgolly.tsMockito.libMatcherTypeMatcherMod.Matcher
import typingsJapgolly.tsMockito.libStubAbstractMethodStubMod.AbstractMethodStub
import typingsJapgolly.tsMockito.libStubMethodStubMod.MethodStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStubCallFunctionMethodStubMod {
  
  @JSImport("ts-mockito/lib/stub/CallFunctionMethodStub", "CallFunctionMethodStub")
  @js.native
  open class CallFunctionMethodStub protected ()
    extends AbstractMethodStub
       with MethodStub {
    def this(groupIndex: Double, matchers: js.Array[Matcher], func: Any) = this()
    
    /* CompleteClass */
    override def execute(args: js.Array[Any]): Unit = js.native
    
    /* private */ var func: Any = js.native
    
    /* private */ var functionResult: Any = js.native
    
    /* InferMemberOverrides */
    override def getGroupIndex(): Double = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* CompleteClass */
    override def isApplicable(args: js.Array[Any]): Boolean = js.native
    
    /* private */ var matchers: Any = js.native
    
    /* private */ var validator: Any = js.native
  }
}
