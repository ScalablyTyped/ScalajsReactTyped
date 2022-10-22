package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.coordinateMod.CoordinateFormat
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColoncoordinateFormat
import typingsJapgolly.ol.olStrings.changeColonprojection
import typingsJapgolly.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMousePositionMod {
  
  @JSImport("ol/control/MousePosition", JSImport.Default)
  @js.native
  open class default () extends MousePosition {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait MousePosition
    extends typingsJapgolly.ol.controlControlMod.default {
    
    /**
      * Return the coordinate format type used to render the current position or
      * undefined.
      */
    def getCoordinateFormat(): js.UndefOr[CoordinateFormat] = js.native
    
    /**
      * Return the projection that is used to report the mouse position.
      */
    def getProjection(): js.UndefOr[typingsJapgolly.ol.projProjectionMod.default] = js.native
    
    /* protected */ def handleMouseMove(event: MouseEvent): Unit = js.native
    
    /* protected */ def handleMouseOut(event: Event): Unit = js.native
    
    @JSName("on")
    def on_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the coordinate format type used to render the current position.
      */
    def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
    
    /**
      * Set the projection that is used to report the mouse position.
      */
    def setProjection(projection: ProjectionLike): Unit = js.native
    
    @JSName("un")
    def un_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var coordinateFormat: js.UndefOr[CoordinateFormat] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* p0 */ typingsJapgolly.ol.mapEventMod.default, Unit]] = js.undefined
    
    var target: js.UndefOr[HTMLElement | String] = js.undefined
    
    var undefinedHTML: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCoordinateFormat(value: /* p0 */ js.UndefOr[Coordinate] => String): Self = StObject.set(x, "coordinateFormat", js.Any.fromFunction1(value))
      
      inline def setCoordinateFormatUndefined: Self = StObject.set(x, "coordinateFormat", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setRender(value: /* p0 */ typingsJapgolly.ol.mapEventMod.default => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: /* p0 */ typingsJapgolly.ol.mapEventMod.default) => value(t0).runNow()))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUndefinedHTML(value: String): Self = StObject.set(x, "undefinedHTML", value.asInstanceOf[js.Any])
      
      inline def setUndefinedHTMLUndefined: Self = StObject.set(x, "undefinedHTML", js.undefined)
    }
  }
}
