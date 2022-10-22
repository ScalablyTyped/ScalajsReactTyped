package typingsJapgolly.maquette

import org.scalajs.dom.Node
import typingsJapgolly.maquette.distInterfacesMod.Projection
import typingsJapgolly.maquette.distInterfacesMod.ProjectionOptions
import typingsJapgolly.maquette.distInterfacesMod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProjectionMod {
  
  @JSImport("maquette/dist/projection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/projection", "createDom")
  @js.native
  def createDom: js.Function4[
    /* vnode */ VNode, 
    /* parentNode */ Node, 
    /* insertBefore */ js.UndefOr[Node | Null], 
    /* projectionOptions */ ProjectionOptions, 
    Unit
  ] = js.native
  inline def createDom_=(
    x: js.Function4[
      /* vnode */ VNode, 
      /* parentNode */ Node, 
      /* insertBefore */ js.UndefOr[Node | Null], 
      /* projectionOptions */ ProjectionOptions, 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDom")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette/dist/projection", "createProjection")
  @js.native
  def createProjection: js.Function2[/* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Projection] = js.native
  inline def createProjection_=(x: js.Function2[/* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Projection]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createProjection")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette/dist/projection", "extend")
  @js.native
  def extend: js.Function2[/* base */ Any, /* overrides */ Any, Any] = js.native
  inline def extend_=(x: js.Function2[/* base */ Any, /* overrides */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extend")(x.asInstanceOf[js.Any])
  
  @JSImport("maquette/dist/projection", "initPropertiesAndChildren")
  @js.native
  def initPropertiesAndChildren: js.Function3[/* domNode */ Node, /* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Unit] = js.native
  inline def initPropertiesAndChildren_=(
    x: js.Function3[/* domNode */ Node, /* vnode */ VNode, /* projectionOptions */ ProjectionOptions, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initPropertiesAndChildren")(x.asInstanceOf[js.Any])
}
