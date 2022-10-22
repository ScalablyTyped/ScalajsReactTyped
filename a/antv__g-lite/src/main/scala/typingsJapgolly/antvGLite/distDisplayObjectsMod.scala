package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.distDisplayObjectsCircleMod.CircleStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsEllipseMod.EllipseStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsGroupMod.GroupStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsHtmlMod.HTMLStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsImageMod.ImageStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsLineMod.LineStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsPathMod.PathStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsPolygonMod.PolygonStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsPolylineMod.PolylineStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsRectMod.RectStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsTextMod.TextStyleProps
import typingsJapgolly.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsMod {
  
  @JSImport("@antv/g-lite/dist/display-objects", "Circle")
  @js.native
  open class Circle ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsCircleMod.Circle {
    def this(hasStyleRest: DisplayObjectConfig[CircleStyleProps]) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/display-objects", "CustomElement")
  @js.native
  open class CustomElement[CustomElementStyleProps] ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsCustomElementMod.CustomElement[CustomElementStyleProps] {
    def this(hasStyleRest: DisplayObjectConfig[CustomElementStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "DisplayObject")
  @js.native
  open class DisplayObject[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] protected ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject[StyleProps, ParsedStyleProps] {
    def this(config: DisplayObjectConfig[StyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "DisplayObjectPool")
  @js.native
  open class DisplayObjectPool ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectPoolMod.DisplayObjectPool
  
  @JSImport("@antv/g-lite/dist/display-objects", "Ellipse")
  @js.native
  open class Ellipse ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsEllipseMod.Ellipse {
    def this(hasStyleRest: DisplayObjectConfig[EllipseStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Group")
  @js.native
  open class Group ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsGroupMod.Group {
    def this(hasStyleRest: DisplayObjectConfig[GroupStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "HTML")
  @js.native
  open class HTML ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsHtmlMod.HTML {
    def this(hasStyleRest: DisplayObjectConfig[HTMLStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Image")
  @js.native
  open class Image ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsImageMod.Image {
    def this(hasStyleRest: DisplayObjectConfig[ImageStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Line")
  @js.native
  open class Line ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsLineMod.Line {
    def this(hasStyleRest: DisplayObjectConfig[LineStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Path")
  @js.native
  open class Path ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsPathMod.Path {
    def this(hasStyleRest: DisplayObjectConfig[PathStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Polygon")
  @js.native
  open class Polygon ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsPolygonMod.Polygon {
    def this(hasStyleRest: DisplayObjectConfig[PolygonStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Polyline")
  @js.native
  open class Polyline ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsPolylineMod.Polyline {
    def this(hasStyleRest: DisplayObjectConfig[PolylineStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Rect")
  @js.native
  open class Rect ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsRectMod.Rect {
    def this(hasStyleRest: DisplayObjectConfig[RectStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Text")
  @js.native
  /**
    * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGTextContentElement#constants
    */
  open class Text ()
    extends typingsJapgolly.antvGLite.distDisplayObjectsTextMod.Text {
    def this(hasStyleRest: DisplayObjectConfig[TextStyleProps]) = this()
  }
}
