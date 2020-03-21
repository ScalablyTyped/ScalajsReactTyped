package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationContext extends js.Object {
  /**
    * Enables before/after emit notifications in the pretty printer for the provided
    * SyntaxKind.
    */
  def enableEmitNotification(kind: SyntaxKind): Unit
  /** Enables expression substitutions in the pretty printer for the provided SyntaxKind. */
  def enableSubstitution(kind: SyntaxKind): Unit
  /** Ends a lexical environment, returning any declarations. */
  def endLexicalEnvironment(): js.UndefOr[js.Array[Statement]]
  /** Gets the compiler options supplied to the transformer. */
  def getCompilerOptions(): CompilerOptions
  /** Hoists a function declaration to the containing scope. */
  def hoistFunctionDeclaration(node: FunctionDeclaration): Unit
  /** Hoists a variable declaration to the containing scope. */
  def hoistVariableDeclaration(node: Identifier): Unit
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
  /** Resumes a suspended lexical environment, usually before visiting a function body. */
  def resumeLexicalEnvironment(): Unit
  /** Starts a new lexical environment. */
  def startLexicalEnvironment(): Unit
  /** Suspends the current lexical environment, usually after visiting a parameter list. */
  def suspendLexicalEnvironment(): Unit
}

object TransformationContext {
  @scala.inline
  def apply(
    enableEmitNotification: SyntaxKind => Callback,
    enableSubstitution: SyntaxKind => Callback,
    endLexicalEnvironment: CallbackTo[js.UndefOr[js.Array[Statement]]],
    getCompilerOptions: CallbackTo[CompilerOptions],
    hoistFunctionDeclaration: FunctionDeclaration => Callback,
    hoistVariableDeclaration: Identifier => Callback,
    isEmitNotificationEnabled: Node => CallbackTo[Boolean],
    isSubstitutionEnabled: Node => CallbackTo[Boolean],
    onEmitNode: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Callback,
    onSubstituteNode: (EmitHint, Node) => CallbackTo[Node],
    readEmitHelpers: CallbackTo[js.UndefOr[js.Array[EmitHelper]]],
    requestEmitHelper: EmitHelper => Callback,
    resumeLexicalEnvironment: Callback,
    startLexicalEnvironment: Callback,
    suspendLexicalEnvironment: Callback
  ): TransformationContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enableEmitNotification")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.SyntaxKind) => enableEmitNotification(t0).runNow()))
    __obj.updateDynamic("enableSubstitution")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.SyntaxKind) => enableSubstitution(t0).runNow()))
    __obj.updateDynamic("endLexicalEnvironment")(endLexicalEnvironment.toJsFn)
    __obj.updateDynamic("getCompilerOptions")(getCompilerOptions.toJsFn)
    __obj.updateDynamic("hoistFunctionDeclaration")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.FunctionDeclaration) => hoistFunctionDeclaration(t0).runNow()))
    __obj.updateDynamic("hoistVariableDeclaration")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.Identifier) => hoistVariableDeclaration(t0).runNow()))
    __obj.updateDynamic("isEmitNotificationEnabled")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.Node) => isEmitNotificationEnabled(t0).runNow()))
    __obj.updateDynamic("isSubstitutionEnabled")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.Node) => isSubstitutionEnabled(t0).runNow()))
    __obj.updateDynamic("onEmitNode")(js.Any.fromFunction3((t0: typingsJapgolly.typescript.mod.EmitHint, t1: typingsJapgolly.typescript.mod.Node, t2: js.Function2[
  /* hint */ typingsJapgolly.typescript.mod.EmitHint, 
  /* node */ typingsJapgolly.typescript.mod.Node, 
  scala.Unit]) => onEmitNode(t0, t1, t2).runNow()))
    __obj.updateDynamic("onSubstituteNode")(js.Any.fromFunction2((t0: typingsJapgolly.typescript.mod.EmitHint, t1: typingsJapgolly.typescript.mod.Node) => onSubstituteNode(t0, t1).runNow()))
    __obj.updateDynamic("readEmitHelpers")(readEmitHelpers.toJsFn)
    __obj.updateDynamic("requestEmitHelper")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.mod.EmitHelper) => requestEmitHelper(t0).runNow()))
    __obj.updateDynamic("resumeLexicalEnvironment")(resumeLexicalEnvironment.toJsFn)
    __obj.updateDynamic("startLexicalEnvironment")(startLexicalEnvironment.toJsFn)
    __obj.updateDynamic("suspendLexicalEnvironment")(suspendLexicalEnvironment.toJsFn)
    __obj.asInstanceOf[TransformationContext]
  }
}

