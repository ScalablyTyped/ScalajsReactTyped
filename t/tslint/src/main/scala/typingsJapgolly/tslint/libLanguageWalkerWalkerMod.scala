package typingsJapgolly.tslint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tslint.libLanguageRuleRuleMod.RuleFailure
import typingsJapgolly.tslint.libLanguageWalkerWalkContextMod.WalkContext
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageWalkerWalkerMod {
  
  /* note: abstract class */ @JSImport("tslint/lib/language/walker/walker", "AbstractWalker")
  @js.native
  open class AbstractWalker[T] protected ()
    extends WalkContext[T]
       with IWalker {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
    
    /* CompleteClass */
    override def getFailures(): js.Array[RuleFailure] = js.native
    
    /* CompleteClass */
    override def getSourceFile(): SourceFile = js.native
    
    /* CompleteClass */
    override def walk(sourceFile: SourceFile): Unit = js.native
  }
  
  trait IWalker extends StObject {
    
    def getFailures(): js.Array[RuleFailure]
    
    def getSourceFile(): SourceFile
    
    def walk(sourceFile: SourceFile): Unit
  }
  object IWalker {
    
    inline def apply(
      getFailures: CallbackTo[js.Array[RuleFailure]],
      getSourceFile: CallbackTo[SourceFile],
      walk: SourceFile => Callback
    ): IWalker = {
      val __obj = js.Dynamic.literal(getFailures = getFailures.toJsFn, getSourceFile = getSourceFile.toJsFn, walk = js.Any.fromFunction1((t0: SourceFile) => walk(t0).runNow()))
      __obj.asInstanceOf[IWalker]
    }
    
    extension [Self <: IWalker](x: Self) {
      
      inline def setGetFailures(value: CallbackTo[js.Array[RuleFailure]]): Self = StObject.set(x, "getFailures", value.toJsFn)
      
      inline def setGetSourceFile(value: CallbackTo[SourceFile]): Self = StObject.set(x, "getSourceFile", value.toJsFn)
      
      inline def setWalk(value: SourceFile => Callback): Self = StObject.set(x, "walk", js.Any.fromFunction1((t0: SourceFile) => value(t0).runNow()))
    }
  }
}
