package typingsJapgolly.reactResponsiveSpritesheet.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Properties
import typingsJapgolly.csstype.mod.Property.BackgroundPosition
import typingsJapgolly.csstype.mod.Property.BackgroundRepeat
import typingsJapgolly.csstype.mod.Property.BackgroundSize
import typingsJapgolly.reactResponsiveSpritesheet.mod.Direction
import typingsJapgolly.reactResponsiveSpritesheet.mod.Props
import typingsJapgolly.reactResponsiveSpritesheet.mod.default
import typingsJapgolly.reactResponsiveSpritesheet.reactResponsiveSpritesheetInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactResponsiveSpritesheet {
  
  inline def apply(
    direction: Direction,
    fps: Double,
    heightFrame: Double,
    image: String,
    steps: Double,
    widthFrame: Double
  ): Builder = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], heightFrame = heightFrame.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], widthFrame = widthFrame.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-responsive-spritesheet", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def backgroundPosition(value: BackgroundPosition[String | `0`]): this.type = set("backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def backgroundRepeat(value: BackgroundRepeat): this.type = set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def backgroundSize(value: BackgroundSize[String | `0`]): this.type = set("backgroundSize", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def endAt(value: Double): this.type = set("endAt", value.asInstanceOf[js.Any])
    
    inline def getInstance(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("getInstance", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def isResponsive(value: Boolean): this.type = set("isResponsive", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onClick", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onDoubleClick(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onEachFrame(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onEachFrame", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onEnterFrame(value: js.Array[typingsJapgolly.reactResponsiveSpritesheet.anon.Callback]): this.type = set("onEnterFrame", value.asInstanceOf[js.Any])
    
    inline def onEnterFrameVarargs(value: typingsJapgolly.reactResponsiveSpritesheet.anon.Callback*): this.type = set("onEnterFrame", js.Array(value*))
    
    inline def onInit(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onInit", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onLoopComplete(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onLoopComplete", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onMouseDown(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onMouseDown", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onMouseEnter(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onMouseLeave(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onMouseMove(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onMouseOut(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onMouseOut", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onMouseOver(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onMouseOver", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onMouseUp(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onMouseUp", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onPause(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onPause", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onPlay(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onPlay", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def onResize(
      value: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet => Callback
    ): this.type = set("onResize", js.Any.fromFunction1((t0: /* spritesheet */ typingsJapgolly.reactResponsiveSpritesheet.mod.ReactResponsiveSpritesheet) => value(t0).runNow()))
    
    inline def startAt(value: Double): this.type = set("startAt", value.asInstanceOf[js.Any])
    
    inline def style(value: Properties[String | `0`, String]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
