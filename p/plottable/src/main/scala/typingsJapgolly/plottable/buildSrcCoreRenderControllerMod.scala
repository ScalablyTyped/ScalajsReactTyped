package typingsJapgolly.plottable

import typingsJapgolly.plottable.buildSrcComponentsComponentMod.Component
import typingsJapgolly.plottable.buildSrcCoreRenderPolicyMod.IRenderPolicy
import typingsJapgolly.plottable.plottableStrings.animationFrame
import typingsJapgolly.plottable.plottableStrings.immediate
import typingsJapgolly.plottable.plottableStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCoreRenderControllerMod {
  
  @JSImport("plottable/build/src/core/renderController", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* keyof plottable.anon.AnimationFrame */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.plottable.plottableStrings.timeout
    - typingsJapgolly.plottable.plottableStrings.immediate
    - typingsJapgolly.plottable.plottableStrings.animationFrame
  */
  trait Policy extends StObject
  object Policy {
    
    @JSImport("plottable/build/src/core/renderController", "Policy")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/core/renderController", "Policy.animationFrame")
    @js.native
    def animationFrame: typingsJapgolly.plottable.plottableStrings.animationFrame = js.native
    inline def animationFrame_=(x: animationFrame): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/core/renderController", "Policy.immediate")
    @js.native
    def immediate: typingsJapgolly.plottable.plottableStrings.immediate = js.native
    inline def immediate_=(x: immediate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("immediate")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/core/renderController", "Policy.timeout")
    @js.native
    def timeout: typingsJapgolly.plottable.plottableStrings.timeout = js.native
    inline def timeout_=(x: timeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
  
  inline def registerToComputeLayout(component: Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToComputeLayout")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerToComputeLayoutAndRender(component: Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToComputeLayoutAndRender")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerToRender(component: Component): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToRender")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderPolicy(): IRenderPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPolicy")().asInstanceOf[IRenderPolicy]
  inline def renderPolicy(renderPolicy: Policy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
