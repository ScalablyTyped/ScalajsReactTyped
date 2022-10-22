package typingsJapgolly.maquette

import org.scalajs.dom.Element
import typingsJapgolly.maquette.distInterfacesMod.CalculationCache
import typingsJapgolly.maquette.distInterfacesMod.Mapping
import typingsJapgolly.maquette.distInterfacesMod.Projection
import typingsJapgolly.maquette.distInterfacesMod.ProjectionOptions
import typingsJapgolly.maquette.distInterfacesMod.Projector
import typingsJapgolly.maquette.distInterfacesMod.ProjectorOptions
import typingsJapgolly.maquette.distInterfacesMod.VNode
import typingsJapgolly.maquette.distInterfacesMod.VNodeChild
import typingsJapgolly.maquette.distInterfacesMod.VNodeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("maquette", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette", "createCache")
  @js.native
  def createCache: js.Function0[CalculationCache[Any]] = js.native
  inline def createCache_=(x: js.Function0[CalculationCache[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createCache")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette", "createMapping")
  @js.native
  def createMapping: js.Function3[
    /* getSourceKey */ js.Function1[/* source */ Any, String | Double], 
    /* createResult */ js.Function2[/* source */ Any, /* index */ Double, Any], 
    /* updateResult */ js.Function3[/* source */ Any, /* target */ Any, /* index */ Double, Unit], 
    Mapping[Any, Any]
  ] = js.native
  inline def createMapping_=(
    x: js.Function3[
      /* getSourceKey */ js.Function1[/* source */ Any, String | Double], 
      /* createResult */ js.Function2[/* source */ Any, /* index */ Double, Any], 
      /* updateResult */ js.Function3[/* source */ Any, /* target */ Any, /* index */ Double, Unit], 
      Mapping[Any, Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createMapping")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette", "createProjector")
  @js.native
  def createProjector: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector] = js.native
  inline def createProjector_=(x: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createProjector")(x.asInstanceOf[js.Any])
  
  object dom {
    
    @JSImport("maquette", "dom")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appends a new child node to the DOM which is generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param parentNode - The parent node for the new child node.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    inline def append(parentNode: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(parentNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    inline def append(parentNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(parentNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
    /**
      * Creates a real DOM tree from `vnode`. The [[Projection]] object returned will contain the resulting DOM Node in
      * its [[Projection.domNode|domNode]] property.
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection.
      * @returns The [[Projection]] which also contains the DOM Node that was created.
      */
    inline def create(vnode: VNode): Projection = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any]).asInstanceOf[Projection]
    inline def create(vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
    /**
      * Inserts a new DOM node which is generated from a [[VNode]].
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param beforeNode - The node that the DOM Node is inserted before.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function.
      * NOTE: [[VNode]] objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    inline def insertBefore(beforeNode: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(beforeNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    inline def insertBefore(beforeNode: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(beforeNode.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
    /**
      * Merges a new DOM node which is generated from a [[VNode]] with an existing DOM Node.
      * This means that the virtual DOM and the real DOM will have one overlapping element.
      * Therefore the selector for the root [[VNode]] will be ignored, but its properties and children will be applied to the Element provided.
      * This is a low-level method. Users wil typically use a [[Projector]] instead.
      * @param element - The existing element to adopt as the root of the new virtual DOM. Existing attributes and child nodes are preserved.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]] objects
      * may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the projection, see [[createProjector]].
      * @returns The [[Projection]] that was created.
      */
    inline def merge(element: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    inline def merge(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
    
    /**
      * Replaces an existing DOM node with a node generated from a [[VNode]].
      * This is a low-level method. Users will typically use a [[Projector]] instead.
      * @param element - The node for the [[VNode]] to replace.
      * @param vnode - The root of the virtual DOM tree that was created using the [[h]] function. NOTE: [[VNode]]
      * objects may only be rendered once.
      * @param projectionOptions - Options to be used to create and update the [[Projection]].
      * @returns The [[Projection]] that was created.
      */
    inline def replace(element: Element, vnode: VNode): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[Projection]
    inline def replace(element: Element, vnode: VNode, projectionOptions: ProjectionOptions): Projection = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(element.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any], projectionOptions.asInstanceOf[js.Any])).asInstanceOf[Projection]
  }
  
  inline def h(selector: String): VNode = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any]).asInstanceOf[VNode]
  inline def h(selector: String, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def h(selector: String, properties: Unit, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def h(selector: String, properties: VNodeProperties): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[VNode]
  inline def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode]
}
