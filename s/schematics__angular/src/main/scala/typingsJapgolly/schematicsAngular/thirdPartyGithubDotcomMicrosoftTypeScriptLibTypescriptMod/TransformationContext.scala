package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformationContext
  extends StObject
     with CoreTransformationContext {
  
  /**
    * Enables before/after emit notifications in the pretty printer for the provided
    * SyntaxKind.
    */
  def enableEmitNotification(kind: SyntaxKind): Unit
  
  /** Enables expression substitutions in the pretty printer for the provided SyntaxKind. */
  def enableSubstitution(kind: SyntaxKind): Unit
  
  /**
    * Determines whether before/after emit notifications should be raised in the pretty
    * printer when it emits a node.
    */
  def isEmitNotificationEnabled(node: Node): Boolean
  
  /** Determines whether expression substitutions are enabled for the provided node. */
  def isSubstitutionEnabled(node: Node): Boolean
  
  /**
    * Hook used to allow transformers to capture state before or after
    * the printer emits a node.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onEmitNode(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit
  
  /**
    * Hook used by transformers to substitute expressions just before they
    * are emitted by the pretty printer.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onSubstituteNode(hint: EmitHint, node: Node): Node
  
  /** Gets and resets the requested non-scoped emit helpers. */
  def readEmitHelpers(): js.UndefOr[js.Array[EmitHelper]]
  
  /** Records a request for a non-scoped emit helper in the current context. */
  def requestEmitHelper(helper: EmitHelper): Unit
}
object TransformationContext {
  
  inline def apply(
    enableEmitNotification: SyntaxKind => Callback,
    enableSubstitution: SyntaxKind => Callback,
    endLexicalEnvironment: CallbackTo[js.UndefOr[js.Array[Statement]]],
    factory: NodeFactory,
    getCompilerOptions: CallbackTo[CompilerOptions],
    hoistFunctionDeclaration: FunctionDeclaration => Callback,
    hoistVariableDeclaration: Identifier => Callback,
    isEmitNotificationEnabled: Node => Boolean,
    isSubstitutionEnabled: Node => Boolean,
    onEmitNode: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Callback,
    onSubstituteNode: (EmitHint, Node) => Node,
    readEmitHelpers: CallbackTo[js.UndefOr[js.Array[EmitHelper]]],
    requestEmitHelper: EmitHelper => Callback,
    resumeLexicalEnvironment: Callback,
    startLexicalEnvironment: Callback,
    suspendLexicalEnvironment: Callback
  ): TransformationContext = {
    val __obj = js.Dynamic.literal(enableEmitNotification = js.Any.fromFunction1((t0: SyntaxKind) => enableEmitNotification(t0).runNow()), enableSubstitution = js.Any.fromFunction1((t0: SyntaxKind) => enableSubstitution(t0).runNow()), endLexicalEnvironment = endLexicalEnvironment.toJsFn, factory = factory.asInstanceOf[js.Any], getCompilerOptions = getCompilerOptions.toJsFn, hoistFunctionDeclaration = js.Any.fromFunction1((t0: FunctionDeclaration) => hoistFunctionDeclaration(t0).runNow()), hoistVariableDeclaration = js.Any.fromFunction1((t0: Identifier) => hoistVariableDeclaration(t0).runNow()), isEmitNotificationEnabled = js.Any.fromFunction1(isEmitNotificationEnabled), isSubstitutionEnabled = js.Any.fromFunction1(isSubstitutionEnabled), onEmitNode = js.Any.fromFunction3((t0: EmitHint, t1: Node, t2: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => (onEmitNode(t0, t1, t2)).runNow()), onSubstituteNode = js.Any.fromFunction2(onSubstituteNode), readEmitHelpers = readEmitHelpers.toJsFn, requestEmitHelper = js.Any.fromFunction1((t0: EmitHelper) => requestEmitHelper(t0).runNow()), resumeLexicalEnvironment = resumeLexicalEnvironment.toJsFn, startLexicalEnvironment = startLexicalEnvironment.toJsFn, suspendLexicalEnvironment = suspendLexicalEnvironment.toJsFn)
    __obj.asInstanceOf[TransformationContext]
  }
  
  extension [Self <: TransformationContext](x: Self) {
    
    inline def setEnableEmitNotification(value: SyntaxKind => Callback): Self = StObject.set(x, "enableEmitNotification", js.Any.fromFunction1((t0: SyntaxKind) => value(t0).runNow()))
    
    inline def setEnableSubstitution(value: SyntaxKind => Callback): Self = StObject.set(x, "enableSubstitution", js.Any.fromFunction1((t0: SyntaxKind) => value(t0).runNow()))
    
    inline def setIsEmitNotificationEnabled(value: Node => Boolean): Self = StObject.set(x, "isEmitNotificationEnabled", js.Any.fromFunction1(value))
    
    inline def setIsSubstitutionEnabled(value: Node => Boolean): Self = StObject.set(x, "isSubstitutionEnabled", js.Any.fromFunction1(value))
    
    inline def setOnEmitNode(value: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Callback): Self = StObject.set(x, "onEmitNode", js.Any.fromFunction3((t0: EmitHint, t1: Node, t2: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnSubstituteNode(value: (EmitHint, Node) => Node): Self = StObject.set(x, "onSubstituteNode", js.Any.fromFunction2(value))
    
    inline def setReadEmitHelpers(value: CallbackTo[js.UndefOr[js.Array[EmitHelper]]]): Self = StObject.set(x, "readEmitHelpers", value.toJsFn)
    
    inline def setRequestEmitHelper(value: EmitHelper => Callback): Self = StObject.set(x, "requestEmitHelper", js.Any.fromFunction1((t0: EmitHelper) => value(t0).runNow()))
  }
}
