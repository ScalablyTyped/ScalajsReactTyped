package typingsJapgolly.pageFlip

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.pageFlip.anon.PartialFlipSetting
import typingsJapgolly.pageFlip.distBasicTypesMod.Point
import typingsJapgolly.pageFlip.distBasicTypesMod.Rect
import typingsJapgolly.pageFlip.distBasicTypesMod.Segment
import typingsJapgolly.pageFlip.distFlipFlipMod.FlipCorner
import typingsJapgolly.pageFlip.distFlipFlipMod.FlipDirection
import typingsJapgolly.pageFlip.distPagePageMod.PageDensity
import typingsJapgolly.pageFlip.distSettingsMod.FlipSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("page-flip", "CanvasRender")
  @js.native
  open class CanvasRender protected ()
    extends typingsJapgolly.pageFlip.distRenderCanvasRenderMod.CanvasRender {
    def this(
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip,
      setting: FlipSetting,
      inCanvas: HTMLCanvasElement
    ) = this()
  }
  
  @JSImport("page-flip", "CanvasUI")
  @js.native
  open class CanvasUI protected ()
    extends typingsJapgolly.pageFlip.distUICanvasUIMod.CanvasUI {
    def this(inBlock: HTMLElement, app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting) = this()
  }
  
  /* note: abstract class */ @JSImport("page-flip", "EventObject")
  @js.native
  open class EventObject ()
    extends typingsJapgolly.pageFlip.distEventEventObjectMod.EventObject
  
  @JSImport("page-flip", "Flip")
  @js.native
  open class Flip protected ()
    extends typingsJapgolly.pageFlip.distFlipFlipMod.Flip {
    def this(
      render: typingsJapgolly.pageFlip.distRenderRenderMod.Render,
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip
    ) = this()
  }
  
  @JSImport("page-flip", "FlipCalculation")
  @js.native
  open class FlipCalculation protected ()
    extends typingsJapgolly.pageFlip.distFlipFlipCalculationMod.FlipCalculation {
    def this(direction: FlipDirection, corner: FlipCorner, pageWidth: String, pageHeight: String) = this()
  }
  
  @JSImport("page-flip", "FlipCorner")
  @js.native
  object FlipCorner extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.pageFlip.distFlipFlipMod.FlipCorner & String] = js.native
    
    /* "bottom" */ val BOTTOM: typingsJapgolly.pageFlip.distFlipFlipMod.FlipCorner.BOTTOM & String = js.native
    
    /* "top" */ val TOP: typingsJapgolly.pageFlip.distFlipFlipMod.FlipCorner.TOP & String = js.native
  }
  
  @JSImport("page-flip", "FlipDirection")
  @js.native
  object FlipDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.pageFlip.distFlipFlipMod.FlipDirection & Double] = js.native
    
    /* 1 */ val BACK: typingsJapgolly.pageFlip.distFlipFlipMod.FlipDirection.BACK & Double = js.native
    
    /* 0 */ val FORWARD: typingsJapgolly.pageFlip.distFlipFlipMod.FlipDirection.FORWARD & Double = js.native
  }
  
  @JSImport("page-flip", "FlippingState")
  @js.native
  object FlippingState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.pageFlip.distFlipFlipMod.FlippingState & String] = js.native
    
    /* "flipping" */ val FLIPPING: typingsJapgolly.pageFlip.distFlipFlipMod.FlippingState.FLIPPING & String = js.native
    
    /* "fold_corner" */ val FOLD_CORNER: typingsJapgolly.pageFlip.distFlipFlipMod.FlippingState.FOLD_CORNER & String = js.native
    
    /* "read" */ val READ: typingsJapgolly.pageFlip.distFlipFlipMod.FlippingState.READ & String = js.native
    
    /* "user_fold" */ val USER_FOLD: typingsJapgolly.pageFlip.distFlipFlipMod.FlippingState.USER_FOLD & String = js.native
  }
  
  @JSImport("page-flip", "HTMLPage")
  @js.native
  open class HTMLPage protected ()
    extends typingsJapgolly.pageFlip.distPageHtmlpageMod.HTMLPage {
    def this(
      render: typingsJapgolly.pageFlip.distRenderRenderMod.Render,
      element: HTMLElement,
      density: PageDensity
    ) = this()
  }
  
  @JSImport("page-flip", "HTMLPageCollection")
  @js.native
  open class HTMLPageCollection protected ()
    extends typingsJapgolly.pageFlip.distCollectionHtmlpagecollectionMod.HTMLPageCollection {
    def this(
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip,
      render: typingsJapgolly.pageFlip.distRenderRenderMod.Render,
      element: HTMLElement,
      items: js.Array[HTMLElement]
    ) = this()
    def this(
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip,
      render: typingsJapgolly.pageFlip.distRenderRenderMod.Render,
      element: HTMLElement,
      items: NodeList[HTMLElement & Node]
    ) = this()
  }
  
  @JSImport("page-flip", "HTMLRender")
  @js.native
  open class HTMLRender protected ()
    extends typingsJapgolly.pageFlip.distRenderHtmlrenderMod.HTMLRender {
    def this(app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting, element: HTMLElement) = this()
  }
  
  @JSImport("page-flip", "HTMLUI")
  @js.native
  open class HTMLUI protected ()
    extends typingsJapgolly.pageFlip.distUIHtmluiMod.HTMLUI {
    def this(
      inBlock: HTMLElement,
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip,
      setting: FlipSetting,
      items: js.Array[HTMLElement]
    ) = this()
    def this(
      inBlock: HTMLElement,
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip,
      setting: FlipSetting,
      items: NodeList[HTMLElement & Node]
    ) = this()
  }
  
  object Helper {
    
    @JSImport("page-flip", "Helper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the angle between two lines
      */
    inline def GetAngleBetweenTwoLine(line1: Segment, line2: Segment): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAngleBetweenTwoLine")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Get a list of coordinates (step: 1px) between two points
      */
    inline def GetCordsFromTwoPoint(pointOne: Point, pointTwo: Point): js.Array[Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCordsFromTwoPoint")(pointOne.asInstanceOf[js.Any], pointTwo.asInstanceOf[js.Any])).asInstanceOf[js.Array[Point]]
    
    /**
      * Get the distance between two points
      */
    inline def GetDistanceBetweenTwoPoint(point1: Point, point2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetDistanceBetweenTwoPoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the intersection point of two lines
      *
      * @throws Error if the segments are on the same line
      */
    inline def GetIntersectBeetwenTwoLine(one: Segment, two: Segment): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIntersectBeetwenTwoLine")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Find the intersection of two lines bounded by a rectangle "rectBorder"
      */
    inline def GetIntersectBetweenTwoSegment(rectBorder: Rect, one: Segment, two: Segment): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIntersectBetweenTwoSegment")(rectBorder.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Transform point coordinates to a given angle
      */
    inline def GetRotatedPoint(transformedPoint: Point, startPoint: Point, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRotatedPoint")(transformedPoint.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Get the length of the line segment
      */
    inline def GetSegmentLength(segment: Segment): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSegmentLength")(segment.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Limit a point "linePoint" to a given circle centered at point "startPoint" and a given radius
      */
    inline def LimitPointToCircle(startPoint: Point, radius: Double, limitedPoint: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("LimitPointToCircle")(startPoint.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], limitedPoint.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Check for a point in a rectangle
      */
    inline def PointInRect(rect: Rect, pos: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("PointInRect")(rect.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
  
  @JSImport("page-flip", "ImagePage")
  @js.native
  open class ImagePage protected ()
    extends typingsJapgolly.pageFlip.distPageImagePageMod.ImagePage {
    def this(render: typingsJapgolly.pageFlip.distRenderRenderMod.Render, href: String, density: PageDensity) = this()
  }
  
  @JSImport("page-flip", "ImagePageCollection")
  @js.native
  open class ImagePageCollection protected ()
    extends typingsJapgolly.pageFlip.distCollectionImagePageCollectionMod.ImagePageCollection {
    def this(
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip,
      render: typingsJapgolly.pageFlip.distRenderRenderMod.Render,
      imagesHref: js.Array[String]
    ) = this()
  }
  
  @JSImport("page-flip", "Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.pageFlip.distRenderRenderMod.Orientation & String] = js.native
    
    /* "landscape" */ val LANDSCAPE: typingsJapgolly.pageFlip.distRenderRenderMod.Orientation.LANDSCAPE & String = js.native
    
    /* "portrait" */ val PORTRAIT: typingsJapgolly.pageFlip.distRenderRenderMod.Orientation.PORTRAIT & String = js.native
  }
  
  /* note: abstract class */ @JSImport("page-flip", "Page")
  @js.native
  open class Page protected ()
    extends typingsJapgolly.pageFlip.distPagePageMod.Page {
    /* protected */ def this(render: typingsJapgolly.pageFlip.distRenderRenderMod.Render, density: PageDensity) = this()
  }
  
  /* note: abstract class */ @JSImport("page-flip", "PageCollection")
  @js.native
  open class PageCollection protected ()
    extends typingsJapgolly.pageFlip.distCollectionPageCollectionMod.PageCollection {
    /* protected */ def this(
      app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip,
      render: typingsJapgolly.pageFlip.distRenderRenderMod.Render
    ) = this()
  }
  
  @JSImport("page-flip", "PageDensity")
  @js.native
  object PageDensity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.pageFlip.distPagePageMod.PageDensity & String] = js.native
    
    /* "hard" */ val HARD: typingsJapgolly.pageFlip.distPagePageMod.PageDensity.HARD & String = js.native
    
    /* "soft" */ val SOFT: typingsJapgolly.pageFlip.distPagePageMod.PageDensity.SOFT & String = js.native
  }
  
  @JSImport("page-flip", "PageFlip")
  @js.native
  open class PageFlip protected ()
    extends typingsJapgolly.pageFlip.distPageFlipMod.PageFlip {
    /**
      * Create a new PageFlip instance
      */
    def this(inBlock: HTMLElement, setting: PartialFlipSetting) = this()
  }
  
  @JSImport("page-flip", "PageOrientation")
  @js.native
  object PageOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.pageFlip.distPagePageMod.PageOrientation & Double] = js.native
    
    /* 0 */ val LEFT: typingsJapgolly.pageFlip.distPagePageMod.PageOrientation.LEFT & Double = js.native
    
    /* 1 */ val RIGHT: typingsJapgolly.pageFlip.distPagePageMod.PageOrientation.RIGHT & Double = js.native
  }
  
  /* note: abstract class */ @JSImport("page-flip", "Render")
  @js.native
  open class Render protected ()
    extends typingsJapgolly.pageFlip.distRenderRenderMod.Render {
    /* protected */ def this(app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting) = this()
  }
  
  @JSImport("page-flip", "Settings")
  @js.native
  open class Settings ()
    extends typingsJapgolly.pageFlip.distSettingsMod.Settings
  
  @JSImport("page-flip", "SizeType")
  @js.native
  object SizeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.pageFlip.distSettingsMod.SizeType & String] = js.native
    
    /* "fixed" */ val FIXED: typingsJapgolly.pageFlip.distSettingsMod.SizeType.FIXED & String = js.native
    
    /* "stretch" */ val STRETCH: typingsJapgolly.pageFlip.distSettingsMod.SizeType.STRETCH & String = js.native
  }
  
  /* note: abstract class */ @JSImport("page-flip", "UI")
  @js.native
  open class UI protected ()
    extends typingsJapgolly.pageFlip.distUIUIMod.UI {
    /* protected */ def this(inBlock: HTMLElement, app: typingsJapgolly.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting) = this()
  }
}
