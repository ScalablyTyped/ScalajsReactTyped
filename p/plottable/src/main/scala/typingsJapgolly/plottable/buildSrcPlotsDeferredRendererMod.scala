package typingsJapgolly.plottable

import typingsJapgolly.plottable.buildSrcScalesMod.ITransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlotsDeferredRendererMod {
  
  @JSImport("plottable/build/src/plots/deferredRenderer", "DeferredRenderer")
  @js.native
  open class DeferredRenderer[X, Y] protected () extends StObject {
    def this(
      renderCallback: js.Function0[Unit],
      applyTransformCallback: js.Function4[/* tx */ Double, /* ty */ Double, /* sx */ Double, /* sy */ Double, Unit]
    ) = this()
    
    /* private */ var applyTransform: Any = js.native
    
    /* private */ var applyTransformCallback: Any = js.native
    
    /* private */ var domainTransformX: Any = js.native
    
    /* private */ var domainTransformY: Any = js.native
    
    /* private */ var renderCallback: Any = js.native
    
    /* private */ var renderDeferred: Any = js.native
    
    def resetTransforms(): Unit = js.native
    
    def setDomains(): Unit = js.native
    def setDomains(scaleX: Unit, scaleY: ITransformableScale): Unit = js.native
    def setDomains(scaleX: ITransformableScale): Unit = js.native
    def setDomains(scaleX: ITransformableScale, scaleY: ITransformableScale): Unit = js.native
    
    /* private */ var timeoutToken: Any = js.native
    
    def updateDomains(): Unit = js.native
    def updateDomains(scaleX: Unit, scaleY: ITransformableScale): Unit = js.native
    def updateDomains(scaleX: ITransformableScale): Unit = js.native
    def updateDomains(scaleX: ITransformableScale, scaleY: ITransformableScale): Unit = js.native
  }
  /* static members */
  object DeferredRenderer {
    
    @JSImport("plottable/build/src/plots/deferredRenderer", "DeferredRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/deferredRenderer", "DeferredRenderer.DEFERRED_RENDERING_DELAY")
    @js.native
    def DEFERRED_RENDERING_DELAY: Double = js.native
    inline def DEFERRED_RENDERING_DELAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFERRED_RENDERING_DELAY")(x.asInstanceOf[js.Any])
  }
}
