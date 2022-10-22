package typingsJapgolly.fontkit

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.fontkit.fontkitStrings.bezierCurveTo
import typingsJapgolly.fontkit.fontkitStrings.closePath
import typingsJapgolly.fontkit.fontkitStrings.lineTo
import typingsJapgolly.fontkit.fontkitStrings.moveTo
import typingsJapgolly.fontkit.fontkitStrings.quadraticCurveTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fontkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(buffer: Buffer): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(buffer.asInstanceOf[js.Any]).asInstanceOf[Font]
  inline def create(buffer: Buffer, postscriptName: String): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(buffer.asInstanceOf[js.Any], postscriptName.asInstanceOf[js.Any])).asInstanceOf[Font]
  
  inline def open(
    filename: String,
    postscriptName: String,
    callback: js.Function2[/* err */ js.Error | Null, /* font */ Font, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(filename.asInstanceOf[js.Any], postscriptName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openSync(filename: String): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Font]
  inline def openSync(filename: String, postscriptName: String): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(filename.asInstanceOf[js.Any], postscriptName.asInstanceOf[js.Any])).asInstanceOf[Font]
  
  trait BBOX extends StObject {
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
  }
  object BBOX {
    
    inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): BBOX = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBOX]
    }
    
    extension [Self <: BBOX](x: Self) {
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Font extends StObject {
    
    /** the font’s ascender */
    var ascent: Double = js.native
    
    /** an array of all OpenType feature tags (or mapped AAT tags) supported by the font */
    var availableFeatures: js.Array[String] = js.native
    
    /** the font’s bounding box, i.e. the box that encloses all glyphs in the font */
    var bbox: BBOX = js.native
    
    /** the height of capital letters above the baseline */
    var capHeight: Double = js.native
    
    /** an array of all of the unicode code points supported by the font */
    var characterSet: js.Array[Double] = js.native
    
    var copyright: String = js.native
    
    /** the font’s descender */
    var descent: Double = js.native
    
    var familyName: String = js.native
    
    var fullName: String = js.native
    
    /**
      * Maps a single unicode code point to a Glyph object.
      * Does not perform any advanced substitutions (there is no context to do so).
      */
    def glyphForCodePoint(codePoint: Double): Glyph = js.native
    
    /**
      * Returns an array of Glyph objects for the given string.
      * This is only a one-to-one mapping from characters to glyphs.
      * For most uses, you should use font.layout (described below), which
      * provides a much more advanced mapping supporting AAT and OpenType shaping.
      */
    def glyphsForString(string: String): js.Array[Glyph] = js.native
    
    /**
      * Returns whether there is glyph in the font for the given unicode code point.
      */
    def hasGlyphForCodePoint(codePoint: Double): Boolean = js.native
    
    /** if this is an italic font, the angle the cursor should be drawn at to match the font design */
    var italicAngle: Double = js.native
    
    /**
      * Returns a GlyphRun object, which includes an array of Glyphs and GlyphPositions for the given string.
      */
    def layout(string: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String]): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String, language: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: String, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: Unit, language: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: Unit, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: js.Array[String], script: Unit, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String, language: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: String, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: Unit, language: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: Unit, language: String, direction: String): GlyphRun = js.native
    def layout(string: String, features: Unit, script: Unit, language: Unit, direction: String): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean]): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: String): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: String, language: String): GlyphRun = js.native
    def layout(
      string: String,
      features: Record[String, Boolean],
      script: String,
      language: String,
      direction: String
    ): GlyphRun = js.native
    def layout(
      string: String,
      features: Record[String, Boolean],
      script: String,
      language: Unit,
      direction: String
    ): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: Unit, language: String): GlyphRun = js.native
    def layout(
      string: String,
      features: Record[String, Boolean],
      script: Unit,
      language: String,
      direction: String
    ): GlyphRun = js.native
    def layout(string: String, features: Record[String, Boolean], script: Unit, language: Unit, direction: String): GlyphRun = js.native
    
    /** the amount of space that should be included between lines */
    var lineGap: Double = js.native
    
    /** the number of glyphs in the font */
    var numGlyphs: Double = js.native
    
    var postscriptName: String = js.native
    
    /**
      * Returns an array of strings that map to the given glyph id.
      */
    def stringsForGlyph(gid: Double): js.Array[String] = js.native
    
    var subfamilyName: String = js.native
    
    /** the offset from the normal underline position that should be used */
    var underlinePosition: Double = js.native
    
    /** the weight of the underline that should be used */
    var underlineThickness: Double = js.native
    
    /** the size of the font’s internal coordinate grid */
    var unitsPerEm: Double = js.native
    
    var version: Double = js.native
    
    /**
      * Returns the advance width for a single glyph id.
      */
    def widthOfGlyph(glyph_id: Double): Double = js.native
    
    /** the height of lower case letters */
    var xHeight: Double = js.native
  }
  
  trait Glyph extends StObject {
    
    /** the glyph’s advance width */
    var advanceWidth: Double
    
    /** the glyph’s bounding box, i.e. the rectangle that encloses the glyph outline as tightly as possible. */
    var bbox: BBOX
    
    /**
      * The glyph’s control box.
      * This is often the same as the bounding box, but is faster to compute.
      * Because of the way bezier curves are defined, some of the control points
      * can be outside of the bounding box. Where `bbox` takes this into account,
      * `cbox` does not. Thus, cbox is less accurate, but faster to compute.
      * See [here](http://www.freetype.org/freetype2/docs/glyphs/glyphs-6.html#section-2)
      * for a more detailed description.
      */
    var cbox: BBOX
    
    /**
      * An array of unicode code points that are represented by this glyph.
      * There can be multiple code points in the case of ligatures and other glyphs
      * that represent multiple visual characters.
      */
    var codePoints: js.Array[Double]
    
    /** the glyph id in the font */
    var id: Double
    
    /** is a ligature glyph (multiple character, spacing glyph) */
    var isLigature: Boolean
    
    /** is a mark glyph (non-spacing combining glyph) */
    var isMark: Boolean
    
    /** a vector Path object representing the glyph */
    var path: Path
    
    /** Renders the glyph to the given graphics context, at the specified font size. */
    def render(ctx: CanvasRenderingContext2D, size: Double): Unit
  }
  object Glyph {
    
    inline def apply(
      advanceWidth: Double,
      bbox: BBOX,
      cbox: BBOX,
      codePoints: js.Array[Double],
      id: Double,
      isLigature: Boolean,
      isMark: Boolean,
      path: Path,
      render: (CanvasRenderingContext2D, Double) => Callback
    ): Glyph = {
      val __obj = js.Dynamic.literal(advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], cbox = cbox.asInstanceOf[js.Any], codePoints = codePoints.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLigature = isLigature.asInstanceOf[js.Any], isMark = isMark.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], render = js.Any.fromFunction2((t0: CanvasRenderingContext2D, t1: Double) => (render(t0, t1)).runNow()))
      __obj.asInstanceOf[Glyph]
    }
    
    extension [Self <: Glyph](x: Self) {
      
      inline def setAdvanceWidth(value: Double): Self = StObject.set(x, "advanceWidth", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: BBOX): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setCbox(value: BBOX): Self = StObject.set(x, "cbox", value.asInstanceOf[js.Any])
      
      inline def setCodePoints(value: js.Array[Double]): Self = StObject.set(x, "codePoints", value.asInstanceOf[js.Any])
      
      inline def setCodePointsVarargs(value: Double*): Self = StObject.set(x, "codePoints", js.Array(value*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsLigature(value: Boolean): Self = StObject.set(x, "isLigature", value.asInstanceOf[js.Any])
      
      inline def setIsMark(value: Boolean): Self = StObject.set(x, "isMark", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (CanvasRenderingContext2D, Double) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: CanvasRenderingContext2D, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  trait GlyphPosition extends StObject {
    
    /** The amount to move the virtual pen in the X direction after rendering this glyph. */
    var xAdvance: Double
    
    /** The offset from the pen position in the X direction at which to render this glyph. */
    var xOffset: Double
    
    /** The amount to move the virtual pen in the Y direction after rendering this glyph. */
    var yAdvance: Double
    
    /** The offset from the pen position in the Y direction at which to render this glyph. */
    var yOffset: Double
  }
  object GlyphPosition {
    
    inline def apply(xAdvance: Double, xOffset: Double, yAdvance: Double, yOffset: Double): GlyphPosition = {
      val __obj = js.Dynamic.literal(xAdvance = xAdvance.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yAdvance = yAdvance.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphPosition]
    }
    
    extension [Self <: GlyphPosition](x: Self) {
      
      inline def setXAdvance(value: Double): Self = StObject.set(x, "xAdvance", value.asInstanceOf[js.Any])
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setYAdvance(value: Double): Self = StObject.set(x, "yAdvance", value.asInstanceOf[js.Any])
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlyphRun extends StObject {
    
    /**
      * The total advance height of the run.
      */
    var advanceHeight: Double
    
    /**
      * The total advance width of the run.
      */
    var advanceWidth: Double
    
    /**
      * The bounding box containing all glyphs in the run.
      */
    var bbox: BBOX
    
    /**
      * The direction requested for shaping, as passed in (either ltr or rtl).
      * If `null`, the default direction of the script is used.
      */
    var direction: String
    
    /**
      * The features requested during shaping. This is a combination of user
      * specified features and features chosen by the shaper.
      */
    var features: Record[String, Boolean]
    
    /**
      * An array of Glyph objects in the run
      */
    var glyphs: js.Array[Glyph]
    
    /**
      * The language requested for shaping, as passed in. If `null`, the default language for the
      * script was used.
      */
    var language: String
    
    /**
      * An array of GlyphPosition objects for each glyph in the run
      */
    var positions: js.Array[GlyphPosition]
    
    /**
      * The script that was requested for shaping. This was either passed in or detected automatically.
      */
    var script: String
  }
  object GlyphRun {
    
    inline def apply(
      advanceHeight: Double,
      advanceWidth: Double,
      bbox: BBOX,
      direction: String,
      features: Record[String, Boolean],
      glyphs: js.Array[Glyph],
      language: String,
      positions: js.Array[GlyphPosition],
      script: String
    ): GlyphRun = {
      val __obj = js.Dynamic.literal(advanceHeight = advanceHeight.asInstanceOf[js.Any], advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphRun]
    }
    
    extension [Self <: GlyphRun](x: Self) {
      
      inline def setAdvanceHeight(value: Double): Self = StObject.set(x, "advanceHeight", value.asInstanceOf[js.Any])
      
      inline def setAdvanceWidth(value: Double): Self = StObject.set(x, "advanceWidth", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: BBOX): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: Record[String, Boolean]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setGlyphs(value: js.Array[Glyph]): Self = StObject.set(x, "glyphs", value.asInstanceOf[js.Any])
      
      inline def setGlyphsVarargs(value: Glyph*): Self = StObject.set(x, "glyphs", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPositions(value: js.Array[GlyphPosition]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: GlyphPosition*): Self = StObject.set(x, "positions", js.Array(value*))
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Path extends StObject {
    
    /**
      * Gets the exact bounding box of the path by evaluating curve segments.
      * Slower to compute than the control box, but more accurate.
      */
    var bbox: BBOX = js.native
    
    /**
      * Gets the "control box" of a path.
      * This is like the bounding box, but it includes all points including
      * control points of bezier segments and is much faster to compute than
      * the real bounding box.
      */
    var cbox: BBOX = js.native
    
    var commands: js.Array[PathCommand] = js.native
    
    /** Rotates the path by the given angle (in radians) */
    def rotate(angle: Double): this.type = js.native
    
    /** Scales the path */
    def scale(scaleX: Double): this.type = js.native
    def scale(scaleX: Double, scaleY: Double): this.type = js.native
    
    /**
      * Compiles the path to a JavaScript function that can be applied with
      * a graphics context in order to render the path.
      */
    def toFunction(): js.Function1[/* ctx */ CanvasRenderingContext2D, Unit] = js.native
    
    /** Converts the path to an SVG path data string */
    def toSVG(): String = js.native
    
    /** Transforms the path by the given matrix */
    def transform(m0: Double, m1: Double, m2: Double, m3: Double, m4: Double, m5: Double): this.type = js.native
    
    /** Translates the path by the given offset */
    def translate(x: Double, y: Double): this.type = js.native
  }
  
  trait PathCommand extends StObject {
    
    var args: js.Array[Double]
    
    var command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath
  }
  object PathCommand {
    
    inline def apply(args: js.Array[Double], command: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): PathCommand = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathCommand]
    }
    
    extension [Self <: PathCommand](x: Self) {
      
      inline def setArgs(value: js.Array[Double]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Double*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCommand(value: moveTo | lineTo | quadraticCurveTo | bezierCurveTo | closePath): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
}
