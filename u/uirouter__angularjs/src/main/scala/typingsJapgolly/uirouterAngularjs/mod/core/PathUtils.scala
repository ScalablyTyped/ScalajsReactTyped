package typingsJapgolly.uirouterAngularjs.mod.core

import typingsJapgolly.uirouterCore.libCommonCommonMod.Predicate
import typingsJapgolly.uirouterCore.libPathPathNodeMod.GetParamsFn
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.TreeChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "core.PathUtils")
@js.native
open class PathUtils ()
  extends typingsJapgolly.uirouterCore.mod.PathUtils
/* static members */
object PathUtils {
  
  @JSImport("@uirouter/angularjs", "core.PathUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates ViewConfig objects and adds to nodes.
    *
    * On each [[PathNode]], creates ViewConfig objects from the views: property of the node's state
    */
  inline def applyViewConfigs(
    $view: typingsJapgolly.uirouterCore.libViewViewMod.ViewService,
    path: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    states: js.Array[typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyViewConfigs")($view.asInstanceOf[js.Any], path.asInstanceOf[js.Any], states.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def buildPath(targetState: typingsJapgolly.uirouterCore.libStateTargetStateMod.TargetState): js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPath")(targetState.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]]
  
  /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
  inline def buildToPath(
    fromPath: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    targetState: typingsJapgolly.uirouterCore.libStateTargetStateMod.TargetState
  ): js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildToPath")(fromPath.asInstanceOf[js.Any], targetState.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]]
  
  /**
    * Returns true if two paths are identical.
    *
    * @param pathA
    * @param pathB
    * @param paramsFn a function which returns the parameters to consider when comparing
    * @returns true if the the states and parameter values for both paths are identical
    */
  inline def equals(
    pathA: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    pathB: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    pathA: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    pathB: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    paramsFn: GetParamsFn
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], paramsFn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Given a fromPath and a toPath, returns a new to path which inherits parameters from the fromPath
    *
    * For a parameter in a node to be inherited from the from path:
    * - The toPath's node must have a matching node in the fromPath (by state).
    * - The parameter name must not be found in the toKeys parameter array.
    *
    * Note: the keys provided in toKeys are intended to be those param keys explicitly specified by some
    * caller, for instance, $state.transitionTo(..., toParams).  If a key was found in toParams,
    * it is not inherited from the fromPath.
    */
  inline def inheritParams(
    fromPath: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    toPath: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]
  ): js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritParams")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]]
  inline def inheritParams(
    fromPath: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    toPath: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    toKeys: js.Array[String]
  ): js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("inheritParams")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any], toKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]]
  
  /** Given a PathNode[], create an TargetState */
  inline def makeTargetState(
    registry: typingsJapgolly.uirouterCore.libStateMod.StateRegistry,
    path: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]
  ): typingsJapgolly.uirouterCore.libStateTargetStateMod.TargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTargetState")(registry.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.uirouterCore.libStateTargetStateMod.TargetState]
  
  /**
    * Returns a new path which is: the subpath of the first path which matches the second path.
    *
    * The new path starts from root and contains any nodes that match the nodes in the second path.
    * It stops before the first non-matching node.
    *
    * Nodes are compared using their state property and their parameter values.
    * If a `paramsFn` is provided, only the [[Param]] returned by the function will be considered when comparing nodes.
    *
    * @param pathA the first path
    * @param pathB the second path
    * @param paramsFn a function which returns the parameters to consider when comparing
    *
    * @returns an array of PathNodes from the first path which match the nodes in the second path
    */
  inline def matching(
    pathA: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    pathB: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]
  ): js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("matching")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]]
  inline def matching(
    pathA: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    pathB: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    paramsFn: GetParamsFn
  ): js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("matching")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], paramsFn.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]]
  
  inline def nonDynamicParams(node: typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode): js.Array[typingsJapgolly.uirouterCore.libParamsParamMod.Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonDynamicParams")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libParamsParamMod.Param]]
  
  /** Gets the raw parameter values from a path */
  inline def paramValues(path: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("paramValues")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Return a subpath of a path, which stops at the first matching node
    *
    * Given an array of nodes, returns a subset of the array starting from the first node,
    * stopping when the first node matches the predicate.
    *
    * @param path a path of [[PathNode]]s
    * @param predicate a [[Predicate]] fn that matches [[PathNode]]s
    * @returns a subpath up to the matching node, or undefined if no match is found
    */
  inline def subPath(
    path: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    predicate: Predicate[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]
  ): js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("subPath")(path.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode]]
  
  /**
    * Computes the tree changes (entering, exiting) between a fromPath and toPath.
    */
  inline def treeChanges(
    fromPath: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    toPath: js.Array[typingsJapgolly.uirouterCore.libPathPathNodeMod.PathNode],
    reloadState: typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject
  ): TreeChanges = (^.asInstanceOf[js.Dynamic].applyDynamic("treeChanges")(fromPath.asInstanceOf[js.Any], toPath.asInstanceOf[js.Any], reloadState.asInstanceOf[js.Any])).asInstanceOf[TreeChanges]
}
