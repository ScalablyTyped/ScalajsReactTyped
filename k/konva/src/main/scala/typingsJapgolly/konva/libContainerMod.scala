package typingsJapgolly.konva

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.konva.libCanvasMod.HitCanvas
import typingsJapgolly.konva.libCanvasMod.SceneCanvas
import typingsJapgolly.konva.libContextMod.SceneContext
import typingsJapgolly.konva.libNodeMod.Node
import typingsJapgolly.konva.libNodeMod.NodeConfig
import typingsJapgolly.konva.libTypesMod.GetSet
import typingsJapgolly.konva.libTypesMod.IRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerMod {
  
  /* note: abstract class */ @JSImport("konva/lib/Container", "Container")
  @js.native
  open class Container[ChildType /* <: Node[NodeConfig] */] () extends Node[ContainerConfig] {
    def this(config: ContainerConfig) = this()
    
    /* private */ var _descendants: Any = js.native
    
    def _drawChildren(drawMethod: Any, canvas: Any, top: Any): Unit = js.native
    
    def _generalFind[ChildNode /* <: Node[NodeConfig] */](selector: String, findOne: Boolean): js.Array[ChildNode] = js.native
    def _generalFind[ChildNode /* <: Node[NodeConfig] */](selector: js.Function, findOne: Boolean): js.Array[ChildNode] = js.native
    
    def _setChildrenIndices(): Unit = js.native
    
    def _validateAdd(node: Node[NodeConfig]): Unit = js.native
    
    def add(children: ChildType*): this.type = js.native
    
    var children: js.UndefOr[js.Array[ChildType]] = js.native
    
    def clip(): IRect = js.native
    def clip(v: IRect): this.type = js.native
    
    def clipFunc(): js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit] = js.native
    def clipFunc(v: js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit]): this.type = js.native
    @JSName("clipFunc")
    var clipFunc_Original: GetSet[
        js.Function2[/* ctx */ CanvasRenderingContext2D, /* shape */ Container[ChildType], Unit], 
        this.type
      ] = js.native
    
    def clipHeight(): Double = js.native
    def clipHeight(v: Double): this.type = js.native
    @JSName("clipHeight")
    var clipHeight_Original: GetSet[Double, this.type] = js.native
    
    def clipWidth(): Double = js.native
    def clipWidth(v: Double): this.type = js.native
    @JSName("clipWidth")
    var clipWidth_Original: GetSet[Double, this.type] = js.native
    
    def clipX(): Double = js.native
    def clipX(v: Double): this.type = js.native
    @JSName("clipX")
    var clipX_Original: GetSet[Double, this.type] = js.native
    
    def clipY(): Double = js.native
    def clipY(v: Double): this.type = js.native
    @JSName("clipY")
    var clipY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("clip")
    var clip_Original: GetSet[IRect, this.type] = js.native
    
    def destroyChildren(): this.type = js.native
    
    def drawHit(can: HitCanvas): this.type = js.native
    def drawHit(can: HitCanvas, top: Node[NodeConfig]): this.type = js.native
    
    def drawScene(can: SceneCanvas): this.type = js.native
    def drawScene(can: SceneCanvas, top: Node[NodeConfig]): this.type = js.native
    
    def find[ChildNode /* <: Node[NodeConfig] */](selector: Any): js.Array[ChildNode] = js.native
    
    def findOne[ChildNode /* <: Node[NodeConfig] */](selector: String): ChildNode = js.native
    def findOne[ChildNode /* <: Node[NodeConfig] */](selector: js.Function): ChildNode = js.native
    
    def getAllIntersections(pos: Any): js.Array[Any] = js.native
    
    def getChildren(): js.Array[ChildType] = js.native
    def getChildren(filterFunc: js.Function1[/* item */ Node[NodeConfig], Boolean]): js.Array[ChildType] = js.native
    
    def removeChildren(): this.type = js.native
  }
  
  trait ContainerConfig
    extends StObject
       with NodeConfig {
    
    var clearBeforeDraw: js.UndefOr[Boolean] = js.undefined
    
    var clipFunc: js.UndefOr[js.Function1[/* ctx */ SceneContext, Unit]] = js.undefined
    
    var clipHeight: js.UndefOr[Double] = js.undefined
    
    var clipWidth: js.UndefOr[Double] = js.undefined
    
    var clipX: js.UndefOr[Double] = js.undefined
    
    var clipY: js.UndefOr[Double] = js.undefined
  }
  object ContainerConfig {
    
    inline def apply(): ContainerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerConfig]
    }
    
    extension [Self <: ContainerConfig](x: Self) {
      
      inline def setClearBeforeDraw(value: Boolean): Self = StObject.set(x, "clearBeforeDraw", value.asInstanceOf[js.Any])
      
      inline def setClearBeforeDrawUndefined: Self = StObject.set(x, "clearBeforeDraw", js.undefined)
      
      inline def setClipFunc(value: /* ctx */ SceneContext => Callback): Self = StObject.set(x, "clipFunc", js.Any.fromFunction1((t0: /* ctx */ SceneContext) => value(t0).runNow()))
      
      inline def setClipFuncUndefined: Self = StObject.set(x, "clipFunc", js.undefined)
      
      inline def setClipHeight(value: Double): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      inline def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      inline def setClipWidth(value: Double): Self = StObject.set(x, "clipWidth", value.asInstanceOf[js.Any])
      
      inline def setClipWidthUndefined: Self = StObject.set(x, "clipWidth", js.undefined)
      
      inline def setClipX(value: Double): Self = StObject.set(x, "clipX", value.asInstanceOf[js.Any])
      
      inline def setClipXUndefined: Self = StObject.set(x, "clipX", js.undefined)
      
      inline def setClipY(value: Double): Self = StObject.set(x, "clipY", value.asInstanceOf[js.Any])
      
      inline def setClipYUndefined: Self = StObject.set(x, "clipY", js.undefined)
    }
  }
}
