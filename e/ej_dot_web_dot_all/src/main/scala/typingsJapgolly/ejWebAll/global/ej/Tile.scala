package typingsJapgolly.ejWebAll.global.ej

import org.scalajs.dom.Element
import typingsJapgolly.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tile")
@js.native
open class Tile protected ()
  extends StObject
     with typingsJapgolly.ejWebAll.ej.Tile {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsJapgolly.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsJapgolly.ejWebAll.ej.Model) = this()
}
object Tile {
  
  @JSGlobal("ej.Tile")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Tile.BadgePosition")
  @js.native
  object BadgePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tile.BadgePosition & Double] = js.native
    
    /* 1 */ val Bottomright: typingsJapgolly.ejWebAll.ej.Tile.BadgePosition.Bottomright & Double = js.native
    
    /* 0 */ val Topright: typingsJapgolly.ejWebAll.ej.Tile.BadgePosition.Topright & Double = js.native
  }
  
  @JSGlobal("ej.Tile.CaptionAlignment")
  @js.native
  object CaptionAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tile.CaptionAlignment & Double] = js.native
    
    /* 3 */ val Center: typingsJapgolly.ejWebAll.ej.Tile.CaptionAlignment.Center & Double = js.native
    
    /* 1 */ val Left: typingsJapgolly.ejWebAll.ej.Tile.CaptionAlignment.Left & Double = js.native
    
    /* 0 */ val Normal: typingsJapgolly.ejWebAll.ej.Tile.CaptionAlignment.Normal & Double = js.native
    
    /* 2 */ val Right: typingsJapgolly.ejWebAll.ej.Tile.CaptionAlignment.Right & Double = js.native
  }
  
  @JSGlobal("ej.Tile.CaptionPosition")
  @js.native
  object CaptionPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tile.CaptionPosition & Double] = js.native
    
    /* 1 */ val Innerbottom: typingsJapgolly.ejWebAll.ej.Tile.CaptionPosition.Innerbottom & Double = js.native
    
    /* 0 */ val Innertop: typingsJapgolly.ejWebAll.ej.Tile.CaptionPosition.Innertop & Double = js.native
    
    /* 2 */ val Outer: typingsJapgolly.ejWebAll.ej.Tile.CaptionPosition.Outer & Double = js.native
  }
  
  @JSGlobal("ej.Tile.ImagePosition")
  @js.native
  object ImagePosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tile.ImagePosition & Double] = js.native
    
    /* 2 */ val BottomCenter: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.BottomCenter & Double = js.native
    
    /* 8 */ val BottomLeft: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.BottomLeft & Double = js.native
    
    /* 7 */ val BottomRight: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.BottomRight & Double = js.native
    
    /* 0 */ val Center: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.Center & Double = js.native
    
    /* 9 */ val Fill: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.Fill & Double = js.native
    
    /* 4 */ val LeftCenter: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.LeftCenter & Double = js.native
    
    /* 3 */ val RightCenter: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.RightCenter & Double = js.native
    
    /* 1 */ val TopCenter: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.TopCenter & Double = js.native
    
    /* 5 */ val TopLeft: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.TopLeft & Double = js.native
    
    /* 6 */ val TopRight: typingsJapgolly.ejWebAll.ej.Tile.ImagePosition.TopRight & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tile.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tile.TileSize")
  @js.native
  object TileSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tile.TileSize & Double] = js.native
    
    /* 2 */ val Large: typingsJapgolly.ejWebAll.ej.Tile.TileSize.Large & Double = js.native
    
    /* 0 */ val Medium: typingsJapgolly.ejWebAll.ej.Tile.TileSize.Medium & Double = js.native
    
    /* 1 */ val Small: typingsJapgolly.ejWebAll.ej.Tile.TileSize.Small & Double = js.native
    
    /* 3 */ val Wide: typingsJapgolly.ejWebAll.ej.Tile.TileSize.Wide & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tile.fn")
  @js.native
  def fn: typingsJapgolly.ejWebAll.ej.Tile = js.native
  inline def fn_=(x: typingsJapgolly.ejWebAll.ej.Tile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tile.liveTileType")
  @js.native
  object liveTileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ejWebAll.ej.Tile.liveTileType & Double] = js.native
    
    /* 2 */ val Carousel: typingsJapgolly.ejWebAll.ej.Tile.liveTileType.Carousel & Double = js.native
    
    /* 0 */ val Flip: typingsJapgolly.ejWebAll.ej.Tile.liveTileType.Flip & Double = js.native
    
    /* 1 */ val Slide: typingsJapgolly.ejWebAll.ej.Tile.liveTileType.Slide & Double = js.native
  }
}
