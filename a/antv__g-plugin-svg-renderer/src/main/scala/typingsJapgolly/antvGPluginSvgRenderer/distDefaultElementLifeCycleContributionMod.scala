package typingsJapgolly.antvGPluginSvgRenderer

import org.scalajs.dom.SVGElement
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.distTypesMod.Shape
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGPluginSvgRenderer.distTokensMod.ElementLifeCycleContribution
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefaultElementLifeCycleContributionMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/DefaultElementLifeCycleContribution", "DefaultElementLifeCycleContribution")
  @js.native
  open class DefaultElementLifeCycleContribution protected ()
    extends StObject
       with ElementLifeCycleContribution {
    def this(canvasConfig: CanvasConfig) = this()
    
    /* private */ var canvasConfig: Any = js.native
    
    /* CompleteClass */
    override def createElement(`object`: DisplayObject[Any, Any]): SVGElement = js.native
    
    /* CompleteClass */
    override def destroyElement(`object`: DisplayObject[Any, Any], $el: SVGElement): Unit = js.native
    
    /* CompleteClass */
    override def shouldUpdateElementAttribute(`object`: DisplayObject[Any, Any], attributeName: String): Boolean = js.native
    
    def updateElementAttribute(`object`: DisplayObject[Any, Any]): Unit = js.native
    /* CompleteClass */
    override def updateElementAttribute(`object`: DisplayObject[Any, Any], $el: SVGElement): Unit = js.native
  }
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/DefaultElementLifeCycleContribution", "SHAPE2TAGS")
  @js.native
  val SHAPE2TAGS: Record[Shape | String, String] = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/DefaultElementLifeCycleContribution", "SHAPE_UPDATE_DEPS")
  @js.native
  val SHAPE_UPDATE_DEPS: Record[Shape | String, js.Array[String]] = js.native
}
