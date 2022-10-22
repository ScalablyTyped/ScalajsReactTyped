package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreTransformationContext extends StObject {
  
  /** Ends a lexical environment, returning any declarations. */
  def endLexicalEnvironment(): js.UndefOr[js.Array[Statement]]
  
  val factory: NodeFactory
  
  /** Gets the compiler options supplied to the transformer. */
  def getCompilerOptions(): CompilerOptions
  
  /** Hoists a function declaration to the containing scope. */
  def hoistFunctionDeclaration(node: FunctionDeclaration): Unit
  
  /** Hoists a variable declaration to the containing scope. */
  def hoistVariableDeclaration(node: Identifier): Unit
  
  /** Resumes a suspended lexical environment, usually before visiting a function body. */
  def resumeLexicalEnvironment(): Unit
  
  /** Starts a new lexical environment. */
  def startLexicalEnvironment(): Unit
  
  /** Suspends the current lexical environment, usually after visiting a parameter list. */
  def suspendLexicalEnvironment(): Unit
}
object CoreTransformationContext {
  
  inline def apply(
    endLexicalEnvironment: CallbackTo[js.UndefOr[js.Array[Statement]]],
    factory: NodeFactory,
    getCompilerOptions: CallbackTo[CompilerOptions],
    hoistFunctionDeclaration: FunctionDeclaration => Callback,
    hoistVariableDeclaration: Identifier => Callback,
    resumeLexicalEnvironment: Callback,
    startLexicalEnvironment: Callback,
    suspendLexicalEnvironment: Callback
  ): CoreTransformationContext = {
    val __obj = js.Dynamic.literal(endLexicalEnvironment = endLexicalEnvironment.toJsFn, factory = factory.asInstanceOf[js.Any], getCompilerOptions = getCompilerOptions.toJsFn, hoistFunctionDeclaration = js.Any.fromFunction1((t0: FunctionDeclaration) => hoistFunctionDeclaration(t0).runNow()), hoistVariableDeclaration = js.Any.fromFunction1((t0: Identifier) => hoistVariableDeclaration(t0).runNow()), resumeLexicalEnvironment = resumeLexicalEnvironment.toJsFn, startLexicalEnvironment = startLexicalEnvironment.toJsFn, suspendLexicalEnvironment = suspendLexicalEnvironment.toJsFn)
    __obj.asInstanceOf[CoreTransformationContext]
  }
  
  extension [Self <: CoreTransformationContext](x: Self) {
    
    inline def setEndLexicalEnvironment(value: CallbackTo[js.UndefOr[js.Array[Statement]]]): Self = StObject.set(x, "endLexicalEnvironment", value.toJsFn)
    
    inline def setFactory(value: NodeFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setGetCompilerOptions(value: CallbackTo[CompilerOptions]): Self = StObject.set(x, "getCompilerOptions", value.toJsFn)
    
    inline def setHoistFunctionDeclaration(value: FunctionDeclaration => Callback): Self = StObject.set(x, "hoistFunctionDeclaration", js.Any.fromFunction1((t0: FunctionDeclaration) => value(t0).runNow()))
    
    inline def setHoistVariableDeclaration(value: Identifier => Callback): Self = StObject.set(x, "hoistVariableDeclaration", js.Any.fromFunction1((t0: Identifier) => value(t0).runNow()))
    
    inline def setResumeLexicalEnvironment(value: Callback): Self = StObject.set(x, "resumeLexicalEnvironment", value.toJsFn)
    
    inline def setStartLexicalEnvironment(value: Callback): Self = StObject.set(x, "startLexicalEnvironment", value.toJsFn)
    
    inline def setSuspendLexicalEnvironment(value: Callback): Self = StObject.set(x, "suspendLexicalEnvironment", value.toJsFn)
  }
}
