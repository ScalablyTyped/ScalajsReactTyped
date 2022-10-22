package typingsJapgolly.stylehacks

import japgolly.scalajs.react.Callback
import typingsJapgolly.postcss.mod.Node
import typingsJapgolly.postcss.mod.Result
import typingsJapgolly.std.Set
import typingsJapgolly.stylehacks.anon.Browsers
import typingsJapgolly.stylehacks.anon.Hack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginMod {
  
  @JSImport("stylehacks/types/plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BasePlugin {
    /**
      * @param {string[]} targets
      * @param {string[]} nodeTypes
      * @param {import('postcss').Result=} result
      */
    def this(targets: js.Array[String], nodeTypes: js.Array[String]) = this()
    def this(targets: js.Array[String], nodeTypes: js.Array[String], result: Result) = this()
    
    /**
      * @param {import('postcss').Node} node
      * @return {boolean}
      */
    /* CompleteClass */
    override def any(node: Node): Boolean = js.native
    
    /** @param {import('postcss').Node} node */
    /* CompleteClass */
    override def detect(node: Node): Unit = js.native
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    /* CompleteClass */
    override def detectAndResolve(node: Node): Unit = js.native
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    /* CompleteClass */
    override def detectAndWarn(node: Node): Unit = js.native
    
    /* CompleteClass */
    var nodeTypes: Set[String] = js.native
    
    /** @type {NodeWithInfo[]} */
    /* CompleteClass */
    var nodes: js.Array[NodeWithInfo] = js.native
    
    /**
      * @param {import('postcss').Node} node
      * @param {{identifier: string, hack: string}} metadata
      * @return {void}
      */
    /* CompleteClass */
    override def push(node: Node, metadata: Hack): Unit = js.native
    
    /** @return {void} */
    /* CompleteClass */
    override def resolve(): Unit = js.native
    
    /* CompleteClass */
    var targets: Set[String] = js.native
    
    /* CompleteClass */
    override def warn(): Unit = js.native
  }
  
  trait BasePlugin extends StObject {
    
    /**
      * @param {import('postcss').Node} node
      * @return {boolean}
      */
    def any(node: Node): Boolean
    
    /** @param {import('postcss').Node} node */
    def detect(node: Node): Unit
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    def detectAndResolve(node: Node): Unit
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    def detectAndWarn(node: Node): Unit
    
    var nodeTypes: Set[String]
    
    /** @type {NodeWithInfo[]} */
    var nodes: js.Array[NodeWithInfo]
    
    /**
      * @param {import('postcss').Node} node
      * @param {{identifier: string, hack: string}} metadata
      * @return {void}
      */
    def push(node: Node, metadata: Hack): Unit
    
    /** @return {void} */
    def resolve(): Unit
    
    var result: js.UndefOr[Result] = js.undefined
    
    var targets: Set[String]
    
    def warn(): Unit
  }
  object BasePlugin {
    
    inline def apply(
      any: Node => Boolean,
      detect: Node => Callback,
      detectAndResolve: Node => Callback,
      detectAndWarn: Node => Callback,
      nodeTypes: Set[String],
      nodes: js.Array[NodeWithInfo],
      push: (Node, Hack) => Callback,
      resolve: Callback,
      targets: Set[String],
      warn: Callback
    ): BasePlugin = {
      val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), detect = js.Any.fromFunction1((t0: Node) => detect(t0).runNow()), detectAndResolve = js.Any.fromFunction1((t0: Node) => detectAndResolve(t0).runNow()), detectAndWarn = js.Any.fromFunction1((t0: Node) => detectAndWarn(t0).runNow()), nodeTypes = nodeTypes.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], push = js.Any.fromFunction2((t0: Node, t1: Hack) => (push(t0, t1)).runNow()), resolve = resolve.toJsFn, targets = targets.asInstanceOf[js.Any], warn = warn.toJsFn)
      __obj.asInstanceOf[BasePlugin]
    }
    
    extension [Self <: BasePlugin](x: Self) {
      
      inline def setAny(value: Node => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
      
      inline def setDetect(value: Node => Callback): Self = StObject.set(x, "detect", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setDetectAndResolve(value: Node => Callback): Self = StObject.set(x, "detectAndResolve", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setDetectAndWarn(value: Node => Callback): Self = StObject.set(x, "detectAndWarn", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setNodeTypes(value: Set[String]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[NodeWithInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: NodeWithInfo*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setPush(value: (Node, Hack) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: Node, t1: Hack) => (value(t0, t1)).runNow()))
      
      inline def setResolve(value: Callback): Self = StObject.set(x, "resolve", value.toJsFn)
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setTargets(value: Set[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: Callback): Self = StObject.set(x, "warn", value.toJsFn)
    }
  }
  
  @js.native
  trait NodeWithInfo extends Node {
    
    var _stylehacks: Browsers = js.native
  }
  
  trait Plugin extends StObject {
    
    def detectAndResolve(node: Node): Unit
    
    def detectAndWarn(node: Node): Unit
    
    var nodeTypes: Set[String]
    
    var targets: Set[String]
  }
  object Plugin {
    
    inline def apply(
      detectAndResolve: Node => Callback,
      detectAndWarn: Node => Callback,
      nodeTypes: Set[String],
      targets: Set[String]
    ): Plugin = {
      val __obj = js.Dynamic.literal(detectAndResolve = js.Any.fromFunction1((t0: Node) => detectAndResolve(t0).runNow()), detectAndWarn = js.Any.fromFunction1((t0: Node) => detectAndWarn(t0).runNow()), nodeTypes = nodeTypes.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setDetectAndResolve(value: Node => Callback): Self = StObject.set(x, "detectAndResolve", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setDetectAndWarn(value: Node => Callback): Self = StObject.set(x, "detectAndWarn", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setNodeTypes(value: Set[String]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: Set[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    }
  }
}
