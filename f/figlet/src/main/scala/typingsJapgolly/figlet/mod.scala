package typingsJapgolly.figlet

import typingsJapgolly.figlet.anon.PartialDefaults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(txt: String, cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    txt: String,
    font: Fonts_,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    txt: String,
    // This `unified-signatures` is disabled because `Fonts` type is too long
  // tslint:disable-next-line: unified-signatures
  options: Unit,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    txt: String,
    // This `unified-signatures` is disabled because `Fonts` type is too long
  // tslint:disable-next-line: unified-signatures
  options: Options,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("figlet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(): Defaults_ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[Defaults_]
  inline def defaults(opt: PartialDefaults): Defaults_ = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opt.asInstanceOf[js.Any]).asInstanceOf[Defaults_]
  
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  inline def fonts(cb: js.Function2[/* error */ js.Error | Null, /* fontList */ js.UndefOr[js.Array[Fonts_]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fonts")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @warn
    * This method exists in node environment only.
    * In browser environment, this method does not exist.
    */
  inline def fontsSync(): js.Array[Fonts_] = ^.asInstanceOf[js.Dynamic].applyDynamic("fontsSync")().asInstanceOf[js.Array[Fonts_]]
  
  inline def loadFont(
    font: Fonts_,
    cb: js.Function2[/* error */ js.Error | Null, /* fontOptions */ js.UndefOr[FontOptions], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFont")(font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @todo
    * Use 'node' namespace to add following methods only in node environment.
    */
  /**
    * @warn
    * This method works in node environment only.
    * In browser environment, this method does not work.
    */
  inline def loadFontSync(font: Fonts_): FontOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFontSync")(font.asInstanceOf[js.Any]).asInstanceOf[FontOptions]
  
  inline def metadata(
    font: Fonts_,
    cb: js.Function3[
      /* error */ js.Error | Null, 
      /* fontOptions */ js.UndefOr[FontOptions], 
      /* headerComment */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @desc
    * Load a custom font from a file.
    *
    * @param fontName
    * The name you want to give the new font.
    * @param fontFile
    * The data from the font file.
    */
  inline def parseFont(fontName: String, fontFile: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFont")(fontName.asInstanceOf[js.Any], fontFile.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def text(txt: String, cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def text(
    txt: String,
    font: Fonts_,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def text(
    txt: String,
    options: Unit,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  // tslint:disable-next-line: unified-signatures
  inline def text(
    txt: String,
    options: Options,
    cb: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def textSync(txt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def textSync(txt: String, font: Fonts_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * @desc
    * This `unified-signatures` is disabled because `Fonts` type is too long
    */
  inline def textSync(txt: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("textSync")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Defaults_ extends StObject {
    
    var font: Fonts_
    
    var fontPath: String
  }
  object Defaults_ {
    
    inline def apply(font: Fonts_, fontPath: String): Defaults_ = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontPath = fontPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Defaults_]
    }
    
    extension [Self <: Defaults_](x: Self) {
      
      inline def setFont(value: Fonts_): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontPath(value: String): Self = StObject.set(x, "fontPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait FittingRules extends StObject {
    
    var hLayout: Double
    
    var hRule1: Boolean
    
    var hRule2: Boolean
    
    var hRule3: Boolean
    
    var hRule4: Boolean
    
    var hRule5: Boolean
    
    var hRule6: Boolean
    
    var vLayout: Double
    
    var vRule1: Boolean
    
    var vRule2: Boolean
    
    var vRule3: Boolean
    
    var vRule4: Boolean
    
    var vRule5: Boolean
  }
  object FittingRules {
    
    inline def apply(
      hLayout: Double,
      hRule1: Boolean,
      hRule2: Boolean,
      hRule3: Boolean,
      hRule4: Boolean,
      hRule5: Boolean,
      hRule6: Boolean,
      vLayout: Double,
      vRule1: Boolean,
      vRule2: Boolean,
      vRule3: Boolean,
      vRule4: Boolean,
      vRule5: Boolean
    ): FittingRules = {
      val __obj = js.Dynamic.literal(hLayout = hLayout.asInstanceOf[js.Any], hRule1 = hRule1.asInstanceOf[js.Any], hRule2 = hRule2.asInstanceOf[js.Any], hRule3 = hRule3.asInstanceOf[js.Any], hRule4 = hRule4.asInstanceOf[js.Any], hRule5 = hRule5.asInstanceOf[js.Any], hRule6 = hRule6.asInstanceOf[js.Any], vLayout = vLayout.asInstanceOf[js.Any], vRule1 = vRule1.asInstanceOf[js.Any], vRule2 = vRule2.asInstanceOf[js.Any], vRule3 = vRule3.asInstanceOf[js.Any], vRule4 = vRule4.asInstanceOf[js.Any], vRule5 = vRule5.asInstanceOf[js.Any])
      __obj.asInstanceOf[FittingRules]
    }
    
    extension [Self <: FittingRules](x: Self) {
      
      inline def setHLayout(value: Double): Self = StObject.set(x, "hLayout", value.asInstanceOf[js.Any])
      
      inline def setHRule1(value: Boolean): Self = StObject.set(x, "hRule1", value.asInstanceOf[js.Any])
      
      inline def setHRule2(value: Boolean): Self = StObject.set(x, "hRule2", value.asInstanceOf[js.Any])
      
      inline def setHRule3(value: Boolean): Self = StObject.set(x, "hRule3", value.asInstanceOf[js.Any])
      
      inline def setHRule4(value: Boolean): Self = StObject.set(x, "hRule4", value.asInstanceOf[js.Any])
      
      inline def setHRule5(value: Boolean): Self = StObject.set(x, "hRule5", value.asInstanceOf[js.Any])
      
      inline def setHRule6(value: Boolean): Self = StObject.set(x, "hRule6", value.asInstanceOf[js.Any])
      
      inline def setVLayout(value: Double): Self = StObject.set(x, "vLayout", value.asInstanceOf[js.Any])
      
      inline def setVRule1(value: Boolean): Self = StObject.set(x, "vRule1", value.asInstanceOf[js.Any])
      
      inline def setVRule2(value: Boolean): Self = StObject.set(x, "vRule2", value.asInstanceOf[js.Any])
      
      inline def setVRule3(value: Boolean): Self = StObject.set(x, "vRule3", value.asInstanceOf[js.Any])
      
      inline def setVRule4(value: Boolean): Self = StObject.set(x, "vRule4", value.asInstanceOf[js.Any])
      
      inline def setVRule5(value: Boolean): Self = StObject.set(x, "vRule5", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontOptions extends StObject {
    
    var baseline: Double
    
    var codeTagCount: Double | Null
    
    var fittingRules: FittingRules
    
    var fullLayout: Double | Null
    
    var hardBlank: String
    
    var height: Double
    
    var maxLength: Double
    
    var numCommentLines: Double
    
    var oldLayout: Double
    
    var printDirection: PrintDirection
  }
  object FontOptions {
    
    inline def apply(
      baseline: Double,
      fittingRules: FittingRules,
      hardBlank: String,
      height: Double,
      maxLength: Double,
      numCommentLines: Double,
      oldLayout: Double,
      printDirection: PrintDirection
    ): FontOptions = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], fittingRules = fittingRules.asInstanceOf[js.Any], hardBlank = hardBlank.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], numCommentLines = numCommentLines.asInstanceOf[js.Any], oldLayout = oldLayout.asInstanceOf[js.Any], printDirection = printDirection.asInstanceOf[js.Any], codeTagCount = null, fullLayout = null)
      __obj.asInstanceOf[FontOptions]
    }
    
    extension [Self <: FontOptions](x: Self) {
      
      inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setCodeTagCount(value: Double): Self = StObject.set(x, "codeTagCount", value.asInstanceOf[js.Any])
      
      inline def setCodeTagCountNull: Self = StObject.set(x, "codeTagCount", null)
      
      inline def setFittingRules(value: FittingRules): Self = StObject.set(x, "fittingRules", value.asInstanceOf[js.Any])
      
      inline def setFullLayout(value: Double): Self = StObject.set(x, "fullLayout", value.asInstanceOf[js.Any])
      
      inline def setFullLayoutNull: Self = StObject.set(x, "fullLayout", null)
      
      inline def setHardBlank(value: String): Self = StObject.set(x, "hardBlank", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setNumCommentLines(value: Double): Self = StObject.set(x, "numCommentLines", value.asInstanceOf[js.Any])
      
      inline def setOldLayout(value: Double): Self = StObject.set(x, "oldLayout", value.asInstanceOf[js.Any])
      
      inline def setPrintDirection(value: PrintDirection): Self = StObject.set(x, "printDirection", value.asInstanceOf[js.Any])
    }
  }
  
  object Fonts_ {
    
    inline def `1Row`: typingsJapgolly.figlet.figletStrings.`1Row` = "1Row".asInstanceOf[typingsJapgolly.figlet.figletStrings.`1Row`]
    
    inline def `3-D`: typingsJapgolly.figlet.figletStrings.`3-D` = "3-D".asInstanceOf[typingsJapgolly.figlet.figletStrings.`3-D`]
    
    inline def `3D Diagonal`: typingsJapgolly.figlet.figletStrings.`3D Diagonal` = ("3D Diagonal").asInstanceOf[typingsJapgolly.figlet.figletStrings.`3D Diagonal`]
    
    inline def `3D-ASCII`: typingsJapgolly.figlet.figletStrings.`3D-ASCII` = "3D-ASCII".asInstanceOf[typingsJapgolly.figlet.figletStrings.`3D-ASCII`]
    
    inline def `3x5`: typingsJapgolly.figlet.figletStrings.`3x5` = "3x5".asInstanceOf[typingsJapgolly.figlet.figletStrings.`3x5`]
    
    inline def `4Max`: typingsJapgolly.figlet.figletStrings.`4Max` = "4Max".asInstanceOf[typingsJapgolly.figlet.figletStrings.`4Max`]
    
    inline def `5 Line Oblique`: typingsJapgolly.figlet.figletStrings.`5 Line Oblique` = ("5 Line Oblique").asInstanceOf[typingsJapgolly.figlet.figletStrings.`5 Line Oblique`]
    
    inline def `AMC 3 Line`: typingsJapgolly.figlet.figletStrings.`AMC 3 Line` = ("AMC 3 Line").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC 3 Line`]
    
    inline def `AMC 3 Liv1`: typingsJapgolly.figlet.figletStrings.`AMC 3 Liv1` = ("AMC 3 Liv1").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC 3 Liv1`]
    
    inline def `AMC AAA01`: typingsJapgolly.figlet.figletStrings.`AMC AAA01` = ("AMC AAA01").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC AAA01`]
    
    inline def `AMC Neko`: typingsJapgolly.figlet.figletStrings.`AMC Neko` = ("AMC Neko").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Neko`]
    
    inline def `AMC Razor`: typingsJapgolly.figlet.figletStrings.`AMC Razor` = ("AMC Razor").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Razor`]
    
    inline def `AMC Razor2`: typingsJapgolly.figlet.figletStrings.`AMC Razor2` = ("AMC Razor2").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Razor2`]
    
    inline def `AMC Slash`: typingsJapgolly.figlet.figletStrings.`AMC Slash` = ("AMC Slash").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Slash`]
    
    inline def `AMC Slider`: typingsJapgolly.figlet.figletStrings.`AMC Slider` = ("AMC Slider").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Slider`]
    
    inline def `AMC Thin`: typingsJapgolly.figlet.figletStrings.`AMC Thin` = ("AMC Thin").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Thin`]
    
    inline def `AMC Tubes`: typingsJapgolly.figlet.figletStrings.`AMC Tubes` = ("AMC Tubes").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Tubes`]
    
    inline def `AMC Untitled`: typingsJapgolly.figlet.figletStrings.`AMC Untitled` = ("AMC Untitled").asInstanceOf[typingsJapgolly.figlet.figletStrings.`AMC Untitled`]
    
    inline def `ANSI Regular`: typingsJapgolly.figlet.figletStrings.`ANSI Regular` = ("ANSI Regular").asInstanceOf[typingsJapgolly.figlet.figletStrings.`ANSI Regular`]
    
    inline def `ANSI Shadow`: typingsJapgolly.figlet.figletStrings.`ANSI Shadow` = ("ANSI Shadow").asInstanceOf[typingsJapgolly.figlet.figletStrings.`ANSI Shadow`]
    
    inline def `ASCII New Roman`: typingsJapgolly.figlet.figletStrings.`ASCII New Roman` = ("ASCII New Roman").asInstanceOf[typingsJapgolly.figlet.figletStrings.`ASCII New Roman`]
    
    inline def Acrobatic: typingsJapgolly.figlet.figletStrings.Acrobatic = "Acrobatic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Acrobatic]
    
    inline def Alligator: typingsJapgolly.figlet.figletStrings.Alligator = "Alligator".asInstanceOf[typingsJapgolly.figlet.figletStrings.Alligator]
    
    inline def Alligator2: typingsJapgolly.figlet.figletStrings.Alligator2 = "Alligator2".asInstanceOf[typingsJapgolly.figlet.figletStrings.Alligator2]
    
    inline def Alpha: typingsJapgolly.figlet.figletStrings.Alpha = "Alpha".asInstanceOf[typingsJapgolly.figlet.figletStrings.Alpha]
    
    inline def Alphabet: typingsJapgolly.figlet.figletStrings.Alphabet = "Alphabet".asInstanceOf[typingsJapgolly.figlet.figletStrings.Alphabet]
    
    inline def Arrows: typingsJapgolly.figlet.figletStrings.Arrows = "Arrows".asInstanceOf[typingsJapgolly.figlet.figletStrings.Arrows]
    
    inline def Avatar: typingsJapgolly.figlet.figletStrings.Avatar = "Avatar".asInstanceOf[typingsJapgolly.figlet.figletStrings.Avatar]
    
    inline def B1FF: typingsJapgolly.figlet.figletStrings.B1FF = "B1FF".asInstanceOf[typingsJapgolly.figlet.figletStrings.B1FF]
    
    inline def Banner: typingsJapgolly.figlet.figletStrings.Banner = "Banner".asInstanceOf[typingsJapgolly.figlet.figletStrings.Banner]
    
    inline def Banner3: typingsJapgolly.figlet.figletStrings.Banner3 = "Banner3".asInstanceOf[typingsJapgolly.figlet.figletStrings.Banner3]
    
    inline def `Banner3-D`: typingsJapgolly.figlet.figletStrings.`Banner3-D` = "Banner3-D".asInstanceOf[typingsJapgolly.figlet.figletStrings.`Banner3-D`]
    
    inline def Banner4: typingsJapgolly.figlet.figletStrings.Banner4 = "Banner4".asInstanceOf[typingsJapgolly.figlet.figletStrings.Banner4]
    
    inline def Barbwire: typingsJapgolly.figlet.figletStrings.Barbwire = "Barbwire".asInstanceOf[typingsJapgolly.figlet.figletStrings.Barbwire]
    
    inline def Basic: typingsJapgolly.figlet.figletStrings.Basic = "Basic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Basic]
    
    inline def Bear: typingsJapgolly.figlet.figletStrings.Bear = "Bear".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bear]
    
    inline def Bell: typingsJapgolly.figlet.figletStrings.Bell = "Bell".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bell]
    
    inline def Benjamin: typingsJapgolly.figlet.figletStrings.Benjamin = "Benjamin".asInstanceOf[typingsJapgolly.figlet.figletStrings.Benjamin]
    
    inline def Big: typingsJapgolly.figlet.figletStrings.Big = "Big".asInstanceOf[typingsJapgolly.figlet.figletStrings.Big]
    
    inline def `Big Chief`: typingsJapgolly.figlet.figletStrings.`Big Chief` = ("Big Chief").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Big Chief`]
    
    inline def `Big Money-ne`: typingsJapgolly.figlet.figletStrings.`Big Money-ne` = ("Big Money-ne").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Big Money-ne`]
    
    inline def `Big Money-nw`: typingsJapgolly.figlet.figletStrings.`Big Money-nw` = ("Big Money-nw").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Big Money-nw`]
    
    inline def `Big Money-se`: typingsJapgolly.figlet.figletStrings.`Big Money-se` = ("Big Money-se").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Big Money-se`]
    
    inline def `Big Money-sw`: typingsJapgolly.figlet.figletStrings.`Big Money-sw` = ("Big Money-sw").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Big Money-sw`]
    
    inline def Bigfig: typingsJapgolly.figlet.figletStrings.Bigfig = "Bigfig".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bigfig]
    
    inline def Binary: typingsJapgolly.figlet.figletStrings.Binary = "Binary".asInstanceOf[typingsJapgolly.figlet.figletStrings.Binary]
    
    inline def Block: typingsJapgolly.figlet.figletStrings.Block = "Block".asInstanceOf[typingsJapgolly.figlet.figletStrings.Block]
    
    inline def Blocks: typingsJapgolly.figlet.figletStrings.Blocks = "Blocks".asInstanceOf[typingsJapgolly.figlet.figletStrings.Blocks]
    
    inline def Bloody: typingsJapgolly.figlet.figletStrings.Bloody = "Bloody".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bloody]
    
    inline def Bolger: typingsJapgolly.figlet.figletStrings.Bolger = "Bolger".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bolger]
    
    inline def Braced: typingsJapgolly.figlet.figletStrings.Braced = "Braced".asInstanceOf[typingsJapgolly.figlet.figletStrings.Braced]
    
    inline def Bright: typingsJapgolly.figlet.figletStrings.Bright = "Bright".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bright]
    
    inline def Broadway: typingsJapgolly.figlet.figletStrings.Broadway = "Broadway".asInstanceOf[typingsJapgolly.figlet.figletStrings.Broadway]
    
    inline def `Broadway KB`: typingsJapgolly.figlet.figletStrings.`Broadway KB` = ("Broadway KB").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Broadway KB`]
    
    inline def Bubble: typingsJapgolly.figlet.figletStrings.Bubble = "Bubble".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bubble]
    
    inline def Bulbhead: typingsJapgolly.figlet.figletStrings.Bulbhead = "Bulbhead".asInstanceOf[typingsJapgolly.figlet.figletStrings.Bulbhead]
    
    inline def Caligraphy: typingsJapgolly.figlet.figletStrings.Caligraphy = "Caligraphy".asInstanceOf[typingsJapgolly.figlet.figletStrings.Caligraphy]
    
    inline def Caligraphy2: typingsJapgolly.figlet.figletStrings.Caligraphy2 = "Caligraphy2".asInstanceOf[typingsJapgolly.figlet.figletStrings.Caligraphy2]
    
    inline def `Calvin S`: typingsJapgolly.figlet.figletStrings.`Calvin S` = ("Calvin S").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Calvin S`]
    
    inline def Cards: typingsJapgolly.figlet.figletStrings.Cards = "Cards".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cards]
    
    inline def Catwalk: typingsJapgolly.figlet.figletStrings.Catwalk = "Catwalk".asInstanceOf[typingsJapgolly.figlet.figletStrings.Catwalk]
    
    inline def Chiseled: typingsJapgolly.figlet.figletStrings.Chiseled = "Chiseled".asInstanceOf[typingsJapgolly.figlet.figletStrings.Chiseled]
    
    inline def Chunky: typingsJapgolly.figlet.figletStrings.Chunky = "Chunky".asInstanceOf[typingsJapgolly.figlet.figletStrings.Chunky]
    
    inline def Coinstak: typingsJapgolly.figlet.figletStrings.Coinstak = "Coinstak".asInstanceOf[typingsJapgolly.figlet.figletStrings.Coinstak]
    
    inline def Cola: typingsJapgolly.figlet.figletStrings.Cola = "Cola".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cola]
    
    inline def Colossal: typingsJapgolly.figlet.figletStrings.Colossal = "Colossal".asInstanceOf[typingsJapgolly.figlet.figletStrings.Colossal]
    
    inline def Computer: typingsJapgolly.figlet.figletStrings.Computer = "Computer".asInstanceOf[typingsJapgolly.figlet.figletStrings.Computer]
    
    inline def Contessa: typingsJapgolly.figlet.figletStrings.Contessa = "Contessa".asInstanceOf[typingsJapgolly.figlet.figletStrings.Contessa]
    
    inline def Contrast: typingsJapgolly.figlet.figletStrings.Contrast = "Contrast".asInstanceOf[typingsJapgolly.figlet.figletStrings.Contrast]
    
    inline def Cosmike: typingsJapgolly.figlet.figletStrings.Cosmike = "Cosmike".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cosmike]
    
    inline def Crawford: typingsJapgolly.figlet.figletStrings.Crawford = "Crawford".asInstanceOf[typingsJapgolly.figlet.figletStrings.Crawford]
    
    inline def Crawford2: typingsJapgolly.figlet.figletStrings.Crawford2 = "Crawford2".asInstanceOf[typingsJapgolly.figlet.figletStrings.Crawford2]
    
    inline def Crazy: typingsJapgolly.figlet.figletStrings.Crazy = "Crazy".asInstanceOf[typingsJapgolly.figlet.figletStrings.Crazy]
    
    inline def Cricket: typingsJapgolly.figlet.figletStrings.Cricket = "Cricket".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cricket]
    
    inline def Cursive: typingsJapgolly.figlet.figletStrings.Cursive = "Cursive".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cursive]
    
    inline def Cyberlarge: typingsJapgolly.figlet.figletStrings.Cyberlarge = "Cyberlarge".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cyberlarge]
    
    inline def Cybermedium: typingsJapgolly.figlet.figletStrings.Cybermedium = "Cybermedium".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cybermedium]
    
    inline def Cybersmall: typingsJapgolly.figlet.figletStrings.Cybersmall = "Cybersmall".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cybersmall]
    
    inline def Cygnet: typingsJapgolly.figlet.figletStrings.Cygnet = "Cygnet".asInstanceOf[typingsJapgolly.figlet.figletStrings.Cygnet]
    
    inline def DANC4: typingsJapgolly.figlet.figletStrings.DANC4 = "DANC4".asInstanceOf[typingsJapgolly.figlet.figletStrings.DANC4]
    
    inline def `DOS Rebel`: typingsJapgolly.figlet.figletStrings.`DOS Rebel` = ("DOS Rebel").asInstanceOf[typingsJapgolly.figlet.figletStrings.`DOS Rebel`]
    
    inline def DWhistled: typingsJapgolly.figlet.figletStrings.DWhistled = "DWhistled".asInstanceOf[typingsJapgolly.figlet.figletStrings.DWhistled]
    
    inline def `Dancing Font`: typingsJapgolly.figlet.figletStrings.`Dancing Font` = ("Dancing Font").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Dancing Font`]
    
    inline def Decimal: typingsJapgolly.figlet.figletStrings.Decimal = "Decimal".asInstanceOf[typingsJapgolly.figlet.figletStrings.Decimal]
    
    inline def `Def Leppard`: typingsJapgolly.figlet.figletStrings.`Def Leppard` = ("Def Leppard").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Def Leppard`]
    
    inline def `Delta Corps Priest 1`: typingsJapgolly.figlet.figletStrings.`Delta Corps Priest 1` = ("Delta Corps Priest 1").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Delta Corps Priest 1`]
    
    inline def Diamond: typingsJapgolly.figlet.figletStrings.Diamond = "Diamond".asInstanceOf[typingsJapgolly.figlet.figletStrings.Diamond]
    
    inline def `Diet Cola`: typingsJapgolly.figlet.figletStrings.`Diet Cola` = ("Diet Cola").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Diet Cola`]
    
    inline def Digital: typingsJapgolly.figlet.figletStrings.Digital = "Digital".asInstanceOf[typingsJapgolly.figlet.figletStrings.Digital]
    
    inline def Doh: typingsJapgolly.figlet.figletStrings.Doh = "Doh".asInstanceOf[typingsJapgolly.figlet.figletStrings.Doh]
    
    inline def Doom: typingsJapgolly.figlet.figletStrings.Doom = "Doom".asInstanceOf[typingsJapgolly.figlet.figletStrings.Doom]
    
    inline def `Dot Matrix`: typingsJapgolly.figlet.figletStrings.`Dot Matrix` = ("Dot Matrix").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Dot Matrix`]
    
    inline def Double: typingsJapgolly.figlet.figletStrings.Double = "Double".asInstanceOf[typingsJapgolly.figlet.figletStrings.Double]
    
    inline def `Double Shorts`: typingsJapgolly.figlet.figletStrings.`Double Shorts` = ("Double Shorts").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Double Shorts`]
    
    inline def `Dr Pepper`: typingsJapgolly.figlet.figletStrings.`Dr Pepper` = ("Dr Pepper").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Dr Pepper`]
    
    inline def `Efti Chess`: typingsJapgolly.figlet.figletStrings.`Efti Chess` = ("Efti Chess").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Efti Chess`]
    
    inline def `Efti Font`: typingsJapgolly.figlet.figletStrings.`Efti Font` = ("Efti Font").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Efti Font`]
    
    inline def `Efti Italic`: typingsJapgolly.figlet.figletStrings.`Efti Italic` = ("Efti Italic").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Efti Italic`]
    
    inline def `Efti Piti`: typingsJapgolly.figlet.figletStrings.`Efti Piti` = ("Efti Piti").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Efti Piti`]
    
    inline def `Efti Robot`: typingsJapgolly.figlet.figletStrings.`Efti Robot` = ("Efti Robot").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Efti Robot`]
    
    inline def `Efti Wall`: typingsJapgolly.figlet.figletStrings.`Efti Wall` = ("Efti Wall").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Efti Wall`]
    
    inline def `Efti Water`: typingsJapgolly.figlet.figletStrings.`Efti Water` = ("Efti Water").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Efti Water`]
    
    inline def Electronic: typingsJapgolly.figlet.figletStrings.Electronic = "Electronic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Electronic]
    
    inline def Elite: typingsJapgolly.figlet.figletStrings.Elite = "Elite".asInstanceOf[typingsJapgolly.figlet.figletStrings.Elite]
    
    inline def Epic: typingsJapgolly.figlet.figletStrings.Epic = "Epic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Epic]
    
    inline def Fender: typingsJapgolly.figlet.figletStrings.Fender = "Fender".asInstanceOf[typingsJapgolly.figlet.figletStrings.Fender]
    
    inline def Filter: typingsJapgolly.figlet.figletStrings.Filter = "Filter".asInstanceOf[typingsJapgolly.figlet.figletStrings.Filter]
    
    inline def `Fire Font-k`: typingsJapgolly.figlet.figletStrings.`Fire Font-k` = ("Fire Font-k").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Fire Font-k`]
    
    inline def `Fire Font-s`: typingsJapgolly.figlet.figletStrings.`Fire Font-s` = ("Fire Font-s").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Fire Font-s`]
    
    inline def Flipped: typingsJapgolly.figlet.figletStrings.Flipped = "Flipped".asInstanceOf[typingsJapgolly.figlet.figletStrings.Flipped]
    
    inline def `Flower Power`: typingsJapgolly.figlet.figletStrings.`Flower Power` = ("Flower Power").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Flower Power`]
    
    inline def `Four Tops`: typingsJapgolly.figlet.figletStrings.`Four Tops` = ("Four Tops").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Four Tops`]
    
    inline def Fraktur: typingsJapgolly.figlet.figletStrings.Fraktur = "Fraktur".asInstanceOf[typingsJapgolly.figlet.figletStrings.Fraktur]
    
    inline def `Fun Face`: typingsJapgolly.figlet.figletStrings.`Fun Face` = ("Fun Face").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Fun Face`]
    
    inline def `Fun Faces`: typingsJapgolly.figlet.figletStrings.`Fun Faces` = ("Fun Faces").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Fun Faces`]
    
    inline def Fuzzy: typingsJapgolly.figlet.figletStrings.Fuzzy = "Fuzzy".asInstanceOf[typingsJapgolly.figlet.figletStrings.Fuzzy]
    
    inline def Georgi16: typingsJapgolly.figlet.figletStrings.Georgi16 = "Georgi16".asInstanceOf[typingsJapgolly.figlet.figletStrings.Georgi16]
    
    inline def Georgia11: typingsJapgolly.figlet.figletStrings.Georgia11 = "Georgia11".asInstanceOf[typingsJapgolly.figlet.figletStrings.Georgia11]
    
    inline def Ghost: typingsJapgolly.figlet.figletStrings.Ghost = "Ghost".asInstanceOf[typingsJapgolly.figlet.figletStrings.Ghost]
    
    inline def Ghoulish: typingsJapgolly.figlet.figletStrings.Ghoulish = "Ghoulish".asInstanceOf[typingsJapgolly.figlet.figletStrings.Ghoulish]
    
    inline def Glenyn: typingsJapgolly.figlet.figletStrings.Glenyn = "Glenyn".asInstanceOf[typingsJapgolly.figlet.figletStrings.Glenyn]
    
    inline def Goofy: typingsJapgolly.figlet.figletStrings.Goofy = "Goofy".asInstanceOf[typingsJapgolly.figlet.figletStrings.Goofy]
    
    inline def Gothic: typingsJapgolly.figlet.figletStrings.Gothic = "Gothic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Gothic]
    
    inline def Graceful: typingsJapgolly.figlet.figletStrings.Graceful = "Graceful".asInstanceOf[typingsJapgolly.figlet.figletStrings.Graceful]
    
    inline def Gradient: typingsJapgolly.figlet.figletStrings.Gradient = "Gradient".asInstanceOf[typingsJapgolly.figlet.figletStrings.Gradient]
    
    inline def Graffiti: typingsJapgolly.figlet.figletStrings.Graffiti = "Graffiti".asInstanceOf[typingsJapgolly.figlet.figletStrings.Graffiti]
    
    inline def Greek: typingsJapgolly.figlet.figletStrings.Greek = "Greek".asInstanceOf[typingsJapgolly.figlet.figletStrings.Greek]
    
    inline def `Heart Left`: typingsJapgolly.figlet.figletStrings.`Heart Left` = ("Heart Left").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Heart Left`]
    
    inline def `Heart Right`: typingsJapgolly.figlet.figletStrings.`Heart Right` = ("Heart Right").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Heart Right`]
    
    inline def `Henry 3D`: typingsJapgolly.figlet.figletStrings.`Henry 3D` = ("Henry 3D").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Henry 3D`]
    
    inline def Hex: typingsJapgolly.figlet.figletStrings.Hex = "Hex".asInstanceOf[typingsJapgolly.figlet.figletStrings.Hex]
    
    inline def Hieroglyphs: typingsJapgolly.figlet.figletStrings.Hieroglyphs = "Hieroglyphs".asInstanceOf[typingsJapgolly.figlet.figletStrings.Hieroglyphs]
    
    inline def Hollywood: typingsJapgolly.figlet.figletStrings.Hollywood = "Hollywood".asInstanceOf[typingsJapgolly.figlet.figletStrings.Hollywood]
    
    inline def `Horizontal Left`: typingsJapgolly.figlet.figletStrings.`Horizontal Left` = ("Horizontal Left").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Horizontal Left`]
    
    inline def `Horizontal Right`: typingsJapgolly.figlet.figletStrings.`Horizontal Right` = ("Horizontal Right").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Horizontal Right`]
    
    inline def `ICL-1900`: typingsJapgolly.figlet.figletStrings.`ICL-1900` = "ICL-1900".asInstanceOf[typingsJapgolly.figlet.figletStrings.`ICL-1900`]
    
    inline def Impossible: typingsJapgolly.figlet.figletStrings.Impossible = "Impossible".asInstanceOf[typingsJapgolly.figlet.figletStrings.Impossible]
    
    inline def Invita: typingsJapgolly.figlet.figletStrings.Invita = "Invita".asInstanceOf[typingsJapgolly.figlet.figletStrings.Invita]
    
    inline def Isometric1: typingsJapgolly.figlet.figletStrings.Isometric1 = "Isometric1".asInstanceOf[typingsJapgolly.figlet.figletStrings.Isometric1]
    
    inline def Isometric2: typingsJapgolly.figlet.figletStrings.Isometric2 = "Isometric2".asInstanceOf[typingsJapgolly.figlet.figletStrings.Isometric2]
    
    inline def Isometric3: typingsJapgolly.figlet.figletStrings.Isometric3 = "Isometric3".asInstanceOf[typingsJapgolly.figlet.figletStrings.Isometric3]
    
    inline def Isometric4: typingsJapgolly.figlet.figletStrings.Isometric4 = "Isometric4".asInstanceOf[typingsJapgolly.figlet.figletStrings.Isometric4]
    
    inline def Italic: typingsJapgolly.figlet.figletStrings.Italic = "Italic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Italic]
    
    inline def Ivrit: typingsJapgolly.figlet.figletStrings.Ivrit = "Ivrit".asInstanceOf[typingsJapgolly.figlet.figletStrings.Ivrit]
    
    inline def `JS Block Letters`: typingsJapgolly.figlet.figletStrings.`JS Block Letters` = ("JS Block Letters").asInstanceOf[typingsJapgolly.figlet.figletStrings.`JS Block Letters`]
    
    inline def `JS Bracket Letters`: typingsJapgolly.figlet.figletStrings.`JS Bracket Letters` = ("JS Bracket Letters").asInstanceOf[typingsJapgolly.figlet.figletStrings.`JS Bracket Letters`]
    
    inline def `JS Capital Curves`: typingsJapgolly.figlet.figletStrings.`JS Capital Curves` = ("JS Capital Curves").asInstanceOf[typingsJapgolly.figlet.figletStrings.`JS Capital Curves`]
    
    inline def `JS Cursive`: typingsJapgolly.figlet.figletStrings.`JS Cursive` = ("JS Cursive").asInstanceOf[typingsJapgolly.figlet.figletStrings.`JS Cursive`]
    
    inline def `JS Stick Letters`: typingsJapgolly.figlet.figletStrings.`JS Stick Letters` = ("JS Stick Letters").asInstanceOf[typingsJapgolly.figlet.figletStrings.`JS Stick Letters`]
    
    inline def Jacky: typingsJapgolly.figlet.figletStrings.Jacky = "Jacky".asInstanceOf[typingsJapgolly.figlet.figletStrings.Jacky]
    
    inline def Jazmine: typingsJapgolly.figlet.figletStrings.Jazmine = "Jazmine".asInstanceOf[typingsJapgolly.figlet.figletStrings.Jazmine]
    
    inline def Jerusalem: typingsJapgolly.figlet.figletStrings.Jerusalem = "Jerusalem".asInstanceOf[typingsJapgolly.figlet.figletStrings.Jerusalem]
    
    inline def Katakana: typingsJapgolly.figlet.figletStrings.Katakana = "Katakana".asInstanceOf[typingsJapgolly.figlet.figletStrings.Katakana]
    
    inline def Kban: typingsJapgolly.figlet.figletStrings.Kban = "Kban".asInstanceOf[typingsJapgolly.figlet.figletStrings.Kban]
    
    inline def Keyboard: typingsJapgolly.figlet.figletStrings.Keyboard = "Keyboard".asInstanceOf[typingsJapgolly.figlet.figletStrings.Keyboard]
    
    inline def Knob: typingsJapgolly.figlet.figletStrings.Knob = "Knob".asInstanceOf[typingsJapgolly.figlet.figletStrings.Knob]
    
    inline def Konto: typingsJapgolly.figlet.figletStrings.Konto = "Konto".asInstanceOf[typingsJapgolly.figlet.figletStrings.Konto]
    
    inline def `Konto Slant`: typingsJapgolly.figlet.figletStrings.`Konto Slant` = ("Konto Slant").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Konto Slant`]
    
    inline def LCD: typingsJapgolly.figlet.figletStrings.LCD = "LCD".asInstanceOf[typingsJapgolly.figlet.figletStrings.LCD]
    
    inline def `Larry 3D`: typingsJapgolly.figlet.figletStrings.`Larry 3D` = ("Larry 3D").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Larry 3D`]
    
    inline def `Larry 3D 2`: typingsJapgolly.figlet.figletStrings.`Larry 3D 2` = ("Larry 3D 2").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Larry 3D 2`]
    
    inline def Lean: typingsJapgolly.figlet.figletStrings.Lean = "Lean".asInstanceOf[typingsJapgolly.figlet.figletStrings.Lean]
    
    inline def Letters: typingsJapgolly.figlet.figletStrings.Letters = "Letters".asInstanceOf[typingsJapgolly.figlet.figletStrings.Letters]
    
    inline def `Lil Devil`: typingsJapgolly.figlet.figletStrings.`Lil Devil` = ("Lil Devil").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Lil Devil`]
    
    inline def `Line Blocks`: typingsJapgolly.figlet.figletStrings.`Line Blocks` = ("Line Blocks").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Line Blocks`]
    
    inline def Linux: typingsJapgolly.figlet.figletStrings.Linux = "Linux".asInstanceOf[typingsJapgolly.figlet.figletStrings.Linux]
    
    inline def Lockergnome: typingsJapgolly.figlet.figletStrings.Lockergnome = "Lockergnome".asInstanceOf[typingsJapgolly.figlet.figletStrings.Lockergnome]
    
    inline def Madrid: typingsJapgolly.figlet.figletStrings.Madrid = "Madrid".asInstanceOf[typingsJapgolly.figlet.figletStrings.Madrid]
    
    inline def Marquee: typingsJapgolly.figlet.figletStrings.Marquee = "Marquee".asInstanceOf[typingsJapgolly.figlet.figletStrings.Marquee]
    
    inline def Maxfour: typingsJapgolly.figlet.figletStrings.Maxfour = "Maxfour".asInstanceOf[typingsJapgolly.figlet.figletStrings.Maxfour]
    
    inline def Merlin1: typingsJapgolly.figlet.figletStrings.Merlin1 = "Merlin1".asInstanceOf[typingsJapgolly.figlet.figletStrings.Merlin1]
    
    inline def Merlin2: typingsJapgolly.figlet.figletStrings.Merlin2 = "Merlin2".asInstanceOf[typingsJapgolly.figlet.figletStrings.Merlin2]
    
    inline def Mike: typingsJapgolly.figlet.figletStrings.Mike = "Mike".asInstanceOf[typingsJapgolly.figlet.figletStrings.Mike]
    
    inline def Mini: typingsJapgolly.figlet.figletStrings.Mini = "Mini".asInstanceOf[typingsJapgolly.figlet.figletStrings.Mini]
    
    inline def Mirror: typingsJapgolly.figlet.figletStrings.Mirror = "Mirror".asInstanceOf[typingsJapgolly.figlet.figletStrings.Mirror]
    
    inline def Mnemonic: typingsJapgolly.figlet.figletStrings.Mnemonic = "Mnemonic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Mnemonic]
    
    inline def Modular: typingsJapgolly.figlet.figletStrings.Modular = "Modular".asInstanceOf[typingsJapgolly.figlet.figletStrings.Modular]
    
    inline def Morse: typingsJapgolly.figlet.figletStrings.Morse = "Morse".asInstanceOf[typingsJapgolly.figlet.figletStrings.Morse]
    
    inline def Morse2: typingsJapgolly.figlet.figletStrings.Morse2 = "Morse2".asInstanceOf[typingsJapgolly.figlet.figletStrings.Morse2]
    
    inline def Moscow: typingsJapgolly.figlet.figletStrings.Moscow = "Moscow".asInstanceOf[typingsJapgolly.figlet.figletStrings.Moscow]
    
    inline def Mshebrew210: typingsJapgolly.figlet.figletStrings.Mshebrew210 = "Mshebrew210".asInstanceOf[typingsJapgolly.figlet.figletStrings.Mshebrew210]
    
    inline def Muzzle: typingsJapgolly.figlet.figletStrings.Muzzle = "Muzzle".asInstanceOf[typingsJapgolly.figlet.figletStrings.Muzzle]
    
    inline def NScript: typingsJapgolly.figlet.figletStrings.NScript = "NScript".asInstanceOf[typingsJapgolly.figlet.figletStrings.NScript]
    
    inline def `NT Greek`: typingsJapgolly.figlet.figletStrings.`NT Greek` = ("NT Greek").asInstanceOf[typingsJapgolly.figlet.figletStrings.`NT Greek`]
    
    inline def `NV Script`: typingsJapgolly.figlet.figletStrings.`NV Script` = ("NV Script").asInstanceOf[typingsJapgolly.figlet.figletStrings.`NV Script`]
    
    inline def Nancyj: typingsJapgolly.figlet.figletStrings.Nancyj = "Nancyj".asInstanceOf[typingsJapgolly.figlet.figletStrings.Nancyj]
    
    inline def `Nancyj-Fancy`: typingsJapgolly.figlet.figletStrings.`Nancyj-Fancy` = "Nancyj-Fancy".asInstanceOf[typingsJapgolly.figlet.figletStrings.`Nancyj-Fancy`]
    
    inline def `Nancyj-Improved`: typingsJapgolly.figlet.figletStrings.`Nancyj-Improved` = "Nancyj-Improved".asInstanceOf[typingsJapgolly.figlet.figletStrings.`Nancyj-Improved`]
    
    inline def `Nancyj-Underlined`: typingsJapgolly.figlet.figletStrings.`Nancyj-Underlined` = "Nancyj-Underlined".asInstanceOf[typingsJapgolly.figlet.figletStrings.`Nancyj-Underlined`]
    
    inline def Nipples: typingsJapgolly.figlet.figletStrings.Nipples = "Nipples".asInstanceOf[typingsJapgolly.figlet.figletStrings.Nipples]
    
    inline def O8: typingsJapgolly.figlet.figletStrings.O8 = "O8".asInstanceOf[typingsJapgolly.figlet.figletStrings.O8]
    
    inline def OS2: typingsJapgolly.figlet.figletStrings.OS2 = "OS2".asInstanceOf[typingsJapgolly.figlet.figletStrings.OS2]
    
    inline def Octal: typingsJapgolly.figlet.figletStrings.Octal = "Octal".asInstanceOf[typingsJapgolly.figlet.figletStrings.Octal]
    
    inline def Ogre: typingsJapgolly.figlet.figletStrings.Ogre = "Ogre".asInstanceOf[typingsJapgolly.figlet.figletStrings.Ogre]
    
    inline def `Old Banner`: typingsJapgolly.figlet.figletStrings.`Old Banner` = ("Old Banner").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Old Banner`]
    
    inline def Pagga: typingsJapgolly.figlet.figletStrings.Pagga = "Pagga".asInstanceOf[typingsJapgolly.figlet.figletStrings.Pagga]
    
    inline def `Patorjk-HeX`: typingsJapgolly.figlet.figletStrings.`Patorjk-HeX` = "Patorjk-HeX".asInstanceOf[typingsJapgolly.figlet.figletStrings.`Patorjk-HeX`]
    
    inline def `PatorjkApostrophes Cheese`: /* Patorjk's Cheese */ String = ("Patorjk's Cheese").asInstanceOf[/* Patorjk's Cheese */ String]
    
    inline def Pawp: typingsJapgolly.figlet.figletStrings.Pawp = "Pawp".asInstanceOf[typingsJapgolly.figlet.figletStrings.Pawp]
    
    inline def Peaks: typingsJapgolly.figlet.figletStrings.Peaks = "Peaks".asInstanceOf[typingsJapgolly.figlet.figletStrings.Peaks]
    
    inline def `Peaks Slant`: typingsJapgolly.figlet.figletStrings.`Peaks Slant` = ("Peaks Slant").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Peaks Slant`]
    
    inline def Pebbles: typingsJapgolly.figlet.figletStrings.Pebbles = "Pebbles".asInstanceOf[typingsJapgolly.figlet.figletStrings.Pebbles]
    
    inline def Pepper: typingsJapgolly.figlet.figletStrings.Pepper = "Pepper".asInstanceOf[typingsJapgolly.figlet.figletStrings.Pepper]
    
    inline def Poison: typingsJapgolly.figlet.figletStrings.Poison = "Poison".asInstanceOf[typingsJapgolly.figlet.figletStrings.Poison]
    
    inline def Puffy: typingsJapgolly.figlet.figletStrings.Puffy = "Puffy".asInstanceOf[typingsJapgolly.figlet.figletStrings.Puffy]
    
    inline def Puzzle: typingsJapgolly.figlet.figletStrings.Puzzle = "Puzzle".asInstanceOf[typingsJapgolly.figlet.figletStrings.Puzzle]
    
    inline def Pyramid: typingsJapgolly.figlet.figletStrings.Pyramid = "Pyramid".asInstanceOf[typingsJapgolly.figlet.figletStrings.Pyramid]
    
    inline def Rammstein: typingsJapgolly.figlet.figletStrings.Rammstein = "Rammstein".asInstanceOf[typingsJapgolly.figlet.figletStrings.Rammstein]
    
    inline def Rectangles: typingsJapgolly.figlet.figletStrings.Rectangles = "Rectangles".asInstanceOf[typingsJapgolly.figlet.figletStrings.Rectangles]
    
    inline def `Red Phoenix`: typingsJapgolly.figlet.figletStrings.`Red Phoenix` = ("Red Phoenix").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Red Phoenix`]
    
    inline def Relief: typingsJapgolly.figlet.figletStrings.Relief = "Relief".asInstanceOf[typingsJapgolly.figlet.figletStrings.Relief]
    
    inline def Relief2: typingsJapgolly.figlet.figletStrings.Relief2 = "Relief2".asInstanceOf[typingsJapgolly.figlet.figletStrings.Relief2]
    
    inline def Reverse: typingsJapgolly.figlet.figletStrings.Reverse = "Reverse".asInstanceOf[typingsJapgolly.figlet.figletStrings.Reverse]
    
    inline def Roman: typingsJapgolly.figlet.figletStrings.Roman = "Roman".asInstanceOf[typingsJapgolly.figlet.figletStrings.Roman]
    
    inline def Rot13: typingsJapgolly.figlet.figletStrings.Rot13 = "Rot13".asInstanceOf[typingsJapgolly.figlet.figletStrings.Rot13]
    
    inline def Rotated: typingsJapgolly.figlet.figletStrings.Rotated = "Rotated".asInstanceOf[typingsJapgolly.figlet.figletStrings.Rotated]
    
    inline def Rounded: typingsJapgolly.figlet.figletStrings.Rounded = "Rounded".asInstanceOf[typingsJapgolly.figlet.figletStrings.Rounded]
    
    inline def `Rowan Cap`: typingsJapgolly.figlet.figletStrings.`Rowan Cap` = ("Rowan Cap").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Rowan Cap`]
    
    inline def Rozzo: typingsJapgolly.figlet.figletStrings.Rozzo = "Rozzo".asInstanceOf[typingsJapgolly.figlet.figletStrings.Rozzo]
    
    inline def Runic: typingsJapgolly.figlet.figletStrings.Runic = "Runic".asInstanceOf[typingsJapgolly.figlet.figletStrings.Runic]
    
    inline def Runyc: typingsJapgolly.figlet.figletStrings.Runyc = "Runyc".asInstanceOf[typingsJapgolly.figlet.figletStrings.Runyc]
    
    inline def `S Blood`: typingsJapgolly.figlet.figletStrings.`S Blood` = ("S Blood").asInstanceOf[typingsJapgolly.figlet.figletStrings.`S Blood`]
    
    inline def `SL Script`: typingsJapgolly.figlet.figletStrings.`SL Script` = ("SL Script").asInstanceOf[typingsJapgolly.figlet.figletStrings.`SL Script`]
    
    inline def `Santa Clara`: typingsJapgolly.figlet.figletStrings.`Santa Clara` = ("Santa Clara").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Santa Clara`]
    
    inline def Script: typingsJapgolly.figlet.figletStrings.Script = "Script".asInstanceOf[typingsJapgolly.figlet.figletStrings.Script]
    
    inline def Serifcap: typingsJapgolly.figlet.figletStrings.Serifcap = "Serifcap".asInstanceOf[typingsJapgolly.figlet.figletStrings.Serifcap]
    
    inline def Shadow: typingsJapgolly.figlet.figletStrings.Shadow = "Shadow".asInstanceOf[typingsJapgolly.figlet.figletStrings.Shadow]
    
    inline def Shimrod: typingsJapgolly.figlet.figletStrings.Shimrod = "Shimrod".asInstanceOf[typingsJapgolly.figlet.figletStrings.Shimrod]
    
    inline def Short: typingsJapgolly.figlet.figletStrings.Short = "Short".asInstanceOf[typingsJapgolly.figlet.figletStrings.Short]
    
    inline def Slant: typingsJapgolly.figlet.figletStrings.Slant = "Slant".asInstanceOf[typingsJapgolly.figlet.figletStrings.Slant]
    
    inline def `Slant Relief`: typingsJapgolly.figlet.figletStrings.`Slant Relief` = ("Slant Relief").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Slant Relief`]
    
    inline def Slide: typingsJapgolly.figlet.figletStrings.Slide = "Slide".asInstanceOf[typingsJapgolly.figlet.figletStrings.Slide]
    
    inline def Small: typingsJapgolly.figlet.figletStrings.Small = "Small".asInstanceOf[typingsJapgolly.figlet.figletStrings.Small]
    
    inline def `Small Caps`: typingsJapgolly.figlet.figletStrings.`Small Caps` = ("Small Caps").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Caps`]
    
    inline def `Small Isometric1`: typingsJapgolly.figlet.figletStrings.`Small Isometric1` = ("Small Isometric1").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Isometric1`]
    
    inline def `Small Keyboard`: typingsJapgolly.figlet.figletStrings.`Small Keyboard` = ("Small Keyboard").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Keyboard`]
    
    inline def `Small Poison`: typingsJapgolly.figlet.figletStrings.`Small Poison` = ("Small Poison").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Poison`]
    
    inline def `Small Script`: typingsJapgolly.figlet.figletStrings.`Small Script` = ("Small Script").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Script`]
    
    inline def `Small Shadow`: typingsJapgolly.figlet.figletStrings.`Small Shadow` = ("Small Shadow").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Shadow`]
    
    inline def `Small Slant`: typingsJapgolly.figlet.figletStrings.`Small Slant` = ("Small Slant").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Slant`]
    
    inline def `Small Tengwar`: typingsJapgolly.figlet.figletStrings.`Small Tengwar` = ("Small Tengwar").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Small Tengwar`]
    
    inline def Soft: typingsJapgolly.figlet.figletStrings.Soft = "Soft".asInstanceOf[typingsJapgolly.figlet.figletStrings.Soft]
    
    inline def Speed: typingsJapgolly.figlet.figletStrings.Speed = "Speed".asInstanceOf[typingsJapgolly.figlet.figletStrings.Speed]
    
    inline def Spliff: typingsJapgolly.figlet.figletStrings.Spliff = "Spliff".asInstanceOf[typingsJapgolly.figlet.figletStrings.Spliff]
    
    inline def Stacey: typingsJapgolly.figlet.figletStrings.Stacey = "Stacey".asInstanceOf[typingsJapgolly.figlet.figletStrings.Stacey]
    
    inline def Stampate: typingsJapgolly.figlet.figletStrings.Stampate = "Stampate".asInstanceOf[typingsJapgolly.figlet.figletStrings.Stampate]
    
    inline def Stampatello: typingsJapgolly.figlet.figletStrings.Stampatello = "Stampatello".asInstanceOf[typingsJapgolly.figlet.figletStrings.Stampatello]
    
    inline def Standard: typingsJapgolly.figlet.figletStrings.Standard = "Standard".asInstanceOf[typingsJapgolly.figlet.figletStrings.Standard]
    
    inline def `Star Strips`: typingsJapgolly.figlet.figletStrings.`Star Strips` = ("Star Strips").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Star Strips`]
    
    inline def `Star Wars`: typingsJapgolly.figlet.figletStrings.`Star Wars` = ("Star Wars").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Star Wars`]
    
    inline def Stellar: typingsJapgolly.figlet.figletStrings.Stellar = "Stellar".asInstanceOf[typingsJapgolly.figlet.figletStrings.Stellar]
    
    inline def Stforek: typingsJapgolly.figlet.figletStrings.Stforek = "Stforek".asInstanceOf[typingsJapgolly.figlet.figletStrings.Stforek]
    
    inline def `Stick Letters`: typingsJapgolly.figlet.figletStrings.`Stick Letters` = ("Stick Letters").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Stick Letters`]
    
    inline def Stop: typingsJapgolly.figlet.figletStrings.Stop = "Stop".asInstanceOf[typingsJapgolly.figlet.figletStrings.Stop]
    
    inline def Straight: typingsJapgolly.figlet.figletStrings.Straight = "Straight".asInstanceOf[typingsJapgolly.figlet.figletStrings.Straight]
    
    inline def `Stronger Than All`: typingsJapgolly.figlet.figletStrings.`Stronger Than All` = ("Stronger Than All").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Stronger Than All`]
    
    inline def `Sub-Zero`: typingsJapgolly.figlet.figletStrings.`Sub-Zero` = "Sub-Zero".asInstanceOf[typingsJapgolly.figlet.figletStrings.`Sub-Zero`]
    
    inline def `Swamp Land`: typingsJapgolly.figlet.figletStrings.`Swamp Land` = ("Swamp Land").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Swamp Land`]
    
    inline def Swan: typingsJapgolly.figlet.figletStrings.Swan = "Swan".asInstanceOf[typingsJapgolly.figlet.figletStrings.Swan]
    
    inline def Sweet: typingsJapgolly.figlet.figletStrings.Sweet = "Sweet".asInstanceOf[typingsJapgolly.figlet.figletStrings.Sweet]
    
    inline def THIS: typingsJapgolly.figlet.figletStrings.THIS = "THIS".asInstanceOf[typingsJapgolly.figlet.figletStrings.THIS]
    
    inline def Tanja: typingsJapgolly.figlet.figletStrings.Tanja = "Tanja".asInstanceOf[typingsJapgolly.figlet.figletStrings.Tanja]
    
    inline def Tengwar: typingsJapgolly.figlet.figletStrings.Tengwar = "Tengwar".asInstanceOf[typingsJapgolly.figlet.figletStrings.Tengwar]
    
    inline def Term: typingsJapgolly.figlet.figletStrings.Term = "Term".asInstanceOf[typingsJapgolly.figlet.figletStrings.Term]
    
    inline def Test1: typingsJapgolly.figlet.figletStrings.Test1 = "Test1".asInstanceOf[typingsJapgolly.figlet.figletStrings.Test1]
    
    inline def `The Edge`: typingsJapgolly.figlet.figletStrings.`The Edge` = ("The Edge").asInstanceOf[typingsJapgolly.figlet.figletStrings.`The Edge`]
    
    inline def Thick: typingsJapgolly.figlet.figletStrings.Thick = "Thick".asInstanceOf[typingsJapgolly.figlet.figletStrings.Thick]
    
    inline def Thin: typingsJapgolly.figlet.figletStrings.Thin = "Thin".asInstanceOf[typingsJapgolly.figlet.figletStrings.Thin]
    
    inline def Thorned: typingsJapgolly.figlet.figletStrings.Thorned = "Thorned".asInstanceOf[typingsJapgolly.figlet.figletStrings.Thorned]
    
    inline def `Three Point`: typingsJapgolly.figlet.figletStrings.`Three Point` = ("Three Point").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Three Point`]
    
    inline def Ticks: typingsJapgolly.figlet.figletStrings.Ticks = "Ticks".asInstanceOf[typingsJapgolly.figlet.figletStrings.Ticks]
    
    inline def `Ticks Slant`: typingsJapgolly.figlet.figletStrings.`Ticks Slant` = ("Ticks Slant").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Ticks Slant`]
    
    inline def Tiles: typingsJapgolly.figlet.figletStrings.Tiles = "Tiles".asInstanceOf[typingsJapgolly.figlet.figletStrings.Tiles]
    
    inline def `Tinker-Toy`: typingsJapgolly.figlet.figletStrings.`Tinker-Toy` = "Tinker-Toy".asInstanceOf[typingsJapgolly.figlet.figletStrings.`Tinker-Toy`]
    
    inline def Tombstone: typingsJapgolly.figlet.figletStrings.Tombstone = "Tombstone".asInstanceOf[typingsJapgolly.figlet.figletStrings.Tombstone]
    
    inline def Train: typingsJapgolly.figlet.figletStrings.Train = "Train".asInstanceOf[typingsJapgolly.figlet.figletStrings.Train]
    
    inline def Trek: typingsJapgolly.figlet.figletStrings.Trek = "Trek".asInstanceOf[typingsJapgolly.figlet.figletStrings.Trek]
    
    inline def Tsalagi: typingsJapgolly.figlet.figletStrings.Tsalagi = "Tsalagi".asInstanceOf[typingsJapgolly.figlet.figletStrings.Tsalagi]
    
    inline def Tubular: typingsJapgolly.figlet.figletStrings.Tubular = "Tubular".asInstanceOf[typingsJapgolly.figlet.figletStrings.Tubular]
    
    inline def Twisted: typingsJapgolly.figlet.figletStrings.Twisted = "Twisted".asInstanceOf[typingsJapgolly.figlet.figletStrings.Twisted]
    
    inline def `Two Point`: typingsJapgolly.figlet.figletStrings.`Two Point` = ("Two Point").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Two Point`]
    
    inline def `USA Flag`: typingsJapgolly.figlet.figletStrings.`USA Flag` = ("USA Flag").asInstanceOf[typingsJapgolly.figlet.figletStrings.`USA Flag`]
    
    inline def Univers: typingsJapgolly.figlet.figletStrings.Univers = "Univers".asInstanceOf[typingsJapgolly.figlet.figletStrings.Univers]
    
    inline def Varsity: typingsJapgolly.figlet.figletStrings.Varsity = "Varsity".asInstanceOf[typingsJapgolly.figlet.figletStrings.Varsity]
    
    inline def Wavy: typingsJapgolly.figlet.figletStrings.Wavy = "Wavy".asInstanceOf[typingsJapgolly.figlet.figletStrings.Wavy]
    
    inline def Weird: typingsJapgolly.figlet.figletStrings.Weird = "Weird".asInstanceOf[typingsJapgolly.figlet.figletStrings.Weird]
    
    inline def `Wet Letter`: typingsJapgolly.figlet.figletStrings.`Wet Letter` = ("Wet Letter").asInstanceOf[typingsJapgolly.figlet.figletStrings.`Wet Letter`]
    
    inline def Whimsy: typingsJapgolly.figlet.figletStrings.Whimsy = "Whimsy".asInstanceOf[typingsJapgolly.figlet.figletStrings.Whimsy]
    
    inline def Wow: typingsJapgolly.figlet.figletStrings.Wow = "Wow".asInstanceOf[typingsJapgolly.figlet.figletStrings.Wow]
  }
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.figlet.figletStrings.`1Row`
    - typingsJapgolly.figlet.figletStrings.`3-D`
    - typingsJapgolly.figlet.figletStrings.`3D Diagonal`
    - typingsJapgolly.figlet.figletStrings.`3D-ASCII`
    - typingsJapgolly.figlet.figletStrings.`3x5`
    - typingsJapgolly.figlet.figletStrings.`4Max`
    - typingsJapgolly.figlet.figletStrings.`5 Line Oblique`
    - typingsJapgolly.figlet.figletStrings.`AMC 3 Line`
    - typingsJapgolly.figlet.figletStrings.`AMC 3 Liv1`
    - typingsJapgolly.figlet.figletStrings.`AMC AAA01`
    - typingsJapgolly.figlet.figletStrings.`AMC Neko`
    - typingsJapgolly.figlet.figletStrings.`AMC Razor`
    - typingsJapgolly.figlet.figletStrings.`AMC Razor2`
    - typingsJapgolly.figlet.figletStrings.`AMC Slash`
    - typingsJapgolly.figlet.figletStrings.`AMC Slider`
    - typingsJapgolly.figlet.figletStrings.`AMC Thin`
    - typingsJapgolly.figlet.figletStrings.`AMC Tubes`
    - typingsJapgolly.figlet.figletStrings.`AMC Untitled`
    - typingsJapgolly.figlet.figletStrings.`ANSI Regular`
    - typingsJapgolly.figlet.figletStrings.`ANSI Shadow`
    - typingsJapgolly.figlet.figletStrings.`ASCII New Roman`
    - typingsJapgolly.figlet.figletStrings.Acrobatic
    - typingsJapgolly.figlet.figletStrings.Alligator
    - typingsJapgolly.figlet.figletStrings.Alligator2
    - typingsJapgolly.figlet.figletStrings.Alpha
    - typingsJapgolly.figlet.figletStrings.Alphabet
    - typingsJapgolly.figlet.figletStrings.Arrows
    - typingsJapgolly.figlet.figletStrings.Avatar
    - typingsJapgolly.figlet.figletStrings.B1FF
    - typingsJapgolly.figlet.figletStrings.Banner
    - typingsJapgolly.figlet.figletStrings.`Banner3-D`
    - typingsJapgolly.figlet.figletStrings.Banner3
    - typingsJapgolly.figlet.figletStrings.Banner4
    - typingsJapgolly.figlet.figletStrings.Barbwire
    - typingsJapgolly.figlet.figletStrings.Basic
    - typingsJapgolly.figlet.figletStrings.Bear
    - typingsJapgolly.figlet.figletStrings.Bell
    - typingsJapgolly.figlet.figletStrings.Benjamin
    - typingsJapgolly.figlet.figletStrings.`Big Chief`
    - typingsJapgolly.figlet.figletStrings.`Big Money-ne`
    - typingsJapgolly.figlet.figletStrings.`Big Money-nw`
    - typingsJapgolly.figlet.figletStrings.`Big Money-se`
    - typingsJapgolly.figlet.figletStrings.`Big Money-sw`
    - typingsJapgolly.figlet.figletStrings.Big
    - typingsJapgolly.figlet.figletStrings.Bigfig
    - typingsJapgolly.figlet.figletStrings.Binary
    - typingsJapgolly.figlet.figletStrings.Block
    - typingsJapgolly.figlet.figletStrings.Blocks
    - typingsJapgolly.figlet.figletStrings.Bloody
    - typingsJapgolly.figlet.figletStrings.Bolger
    - typingsJapgolly.figlet.figletStrings.Braced
    - typingsJapgolly.figlet.figletStrings.Bright
    - typingsJapgolly.figlet.figletStrings.`Broadway KB`
    - typingsJapgolly.figlet.figletStrings.Broadway
    - typingsJapgolly.figlet.figletStrings.Bubble
    - typingsJapgolly.figlet.figletStrings.Bulbhead
    - typingsJapgolly.figlet.figletStrings.Caligraphy
    - typingsJapgolly.figlet.figletStrings.Caligraphy2
    - typingsJapgolly.figlet.figletStrings.`Calvin S`
    - typingsJapgolly.figlet.figletStrings.Cards
    - typingsJapgolly.figlet.figletStrings.Catwalk
    - typingsJapgolly.figlet.figletStrings.Chiseled
    - typingsJapgolly.figlet.figletStrings.Chunky
    - typingsJapgolly.figlet.figletStrings.Coinstak
    - typingsJapgolly.figlet.figletStrings.Cola
    - typingsJapgolly.figlet.figletStrings.Colossal
    - typingsJapgolly.figlet.figletStrings.Computer
    - typingsJapgolly.figlet.figletStrings.Contessa
    - typingsJapgolly.figlet.figletStrings.Contrast
    - typingsJapgolly.figlet.figletStrings.Cosmike
    - typingsJapgolly.figlet.figletStrings.Crawford
    - typingsJapgolly.figlet.figletStrings.Crawford2
    - typingsJapgolly.figlet.figletStrings.Crazy
    - typingsJapgolly.figlet.figletStrings.Cricket
    - typingsJapgolly.figlet.figletStrings.Cursive
    - typingsJapgolly.figlet.figletStrings.Cyberlarge
    - typingsJapgolly.figlet.figletStrings.Cybermedium
    - typingsJapgolly.figlet.figletStrings.Cybersmall
    - typingsJapgolly.figlet.figletStrings.Cygnet
    - typingsJapgolly.figlet.figletStrings.DANC4
    - typingsJapgolly.figlet.figletStrings.`DOS Rebel`
    - typingsJapgolly.figlet.figletStrings.DWhistled
    - typingsJapgolly.figlet.figletStrings.`Dancing Font`
    - typingsJapgolly.figlet.figletStrings.Decimal
    - typingsJapgolly.figlet.figletStrings.`Def Leppard`
    - typingsJapgolly.figlet.figletStrings.`Delta Corps Priest 1`
    - typingsJapgolly.figlet.figletStrings.Diamond
    - typingsJapgolly.figlet.figletStrings.`Diet Cola`
    - typingsJapgolly.figlet.figletStrings.Digital
    - typingsJapgolly.figlet.figletStrings.Doh
    - typingsJapgolly.figlet.figletStrings.Doom
    - typingsJapgolly.figlet.figletStrings.`Dot Matrix`
    - typingsJapgolly.figlet.figletStrings.`Double Shorts`
    - typingsJapgolly.figlet.figletStrings.Double
    - typingsJapgolly.figlet.figletStrings.`Dr Pepper`
    - typingsJapgolly.figlet.figletStrings.`Efti Chess`
    - typingsJapgolly.figlet.figletStrings.`Efti Font`
    - typingsJapgolly.figlet.figletStrings.`Efti Italic`
    - typingsJapgolly.figlet.figletStrings.`Efti Piti`
    - typingsJapgolly.figlet.figletStrings.`Efti Robot`
    - typingsJapgolly.figlet.figletStrings.`Efti Wall`
    - typingsJapgolly.figlet.figletStrings.`Efti Water`
    - typingsJapgolly.figlet.figletStrings.Electronic
    - typingsJapgolly.figlet.figletStrings.Elite
    - typingsJapgolly.figlet.figletStrings.Epic
    - typingsJapgolly.figlet.figletStrings.Fender
    - typingsJapgolly.figlet.figletStrings.Filter
    - typingsJapgolly.figlet.figletStrings.`Fire Font-k`
    - typingsJapgolly.figlet.figletStrings.`Fire Font-s`
    - typingsJapgolly.figlet.figletStrings.Flipped
    - typingsJapgolly.figlet.figletStrings.`Flower Power`
    - typingsJapgolly.figlet.figletStrings.`Four Tops`
    - typingsJapgolly.figlet.figletStrings.Fraktur
    - typingsJapgolly.figlet.figletStrings.`Fun Face`
    - typingsJapgolly.figlet.figletStrings.`Fun Faces`
    - typingsJapgolly.figlet.figletStrings.Fuzzy
    - typingsJapgolly.figlet.figletStrings.Georgi16
    - typingsJapgolly.figlet.figletStrings.Georgia11
    - typingsJapgolly.figlet.figletStrings.Ghost
    - typingsJapgolly.figlet.figletStrings.Ghoulish
    - typingsJapgolly.figlet.figletStrings.Glenyn
    - typingsJapgolly.figlet.figletStrings.Goofy
    - typingsJapgolly.figlet.figletStrings.Gothic
    - typingsJapgolly.figlet.figletStrings.Graceful
    - typingsJapgolly.figlet.figletStrings.Gradient
    - typingsJapgolly.figlet.figletStrings.Graffiti
    - typingsJapgolly.figlet.figletStrings.Greek
    - typingsJapgolly.figlet.figletStrings.`Heart Left`
    - typingsJapgolly.figlet.figletStrings.`Heart Right`
    - typingsJapgolly.figlet.figletStrings.`Henry 3D`
    - typingsJapgolly.figlet.figletStrings.Hex
    - typingsJapgolly.figlet.figletStrings.Hieroglyphs
    - typingsJapgolly.figlet.figletStrings.Hollywood
    - typingsJapgolly.figlet.figletStrings.`Horizontal Left`
    - typingsJapgolly.figlet.figletStrings.`Horizontal Right`
    - typingsJapgolly.figlet.figletStrings.`ICL-1900`
    - typingsJapgolly.figlet.figletStrings.Impossible
    - typingsJapgolly.figlet.figletStrings.Invita
    - typingsJapgolly.figlet.figletStrings.Isometric1
    - typingsJapgolly.figlet.figletStrings.Isometric2
    - typingsJapgolly.figlet.figletStrings.Isometric3
    - typingsJapgolly.figlet.figletStrings.Isometric4
    - typingsJapgolly.figlet.figletStrings.Italic
    - typingsJapgolly.figlet.figletStrings.Ivrit
    - typingsJapgolly.figlet.figletStrings.`JS Block Letters`
    - typingsJapgolly.figlet.figletStrings.`JS Bracket Letters`
    - typingsJapgolly.figlet.figletStrings.`JS Capital Curves`
    - typingsJapgolly.figlet.figletStrings.`JS Cursive`
    - typingsJapgolly.figlet.figletStrings.`JS Stick Letters`
    - typingsJapgolly.figlet.figletStrings.Jacky
    - typingsJapgolly.figlet.figletStrings.Jazmine
    - typingsJapgolly.figlet.figletStrings.Jerusalem
    - typingsJapgolly.figlet.figletStrings.Katakana
    - typingsJapgolly.figlet.figletStrings.Kban
    - typingsJapgolly.figlet.figletStrings.Keyboard
    - typingsJapgolly.figlet.figletStrings.Knob
    - typingsJapgolly.figlet.figletStrings.`Konto Slant`
    - typingsJapgolly.figlet.figletStrings.Konto
    - typingsJapgolly.figlet.figletStrings.LCD
    - typingsJapgolly.figlet.figletStrings.`Larry 3D 2`
    - typingsJapgolly.figlet.figletStrings.`Larry 3D`
    - typingsJapgolly.figlet.figletStrings.Lean
    - typingsJapgolly.figlet.figletStrings.Letters
    - typingsJapgolly.figlet.figletStrings.`Lil Devil`
    - typingsJapgolly.figlet.figletStrings.`Line Blocks`
    - typingsJapgolly.figlet.figletStrings.Linux
    - typingsJapgolly.figlet.figletStrings.Lockergnome
    - typingsJapgolly.figlet.figletStrings.Madrid
    - typingsJapgolly.figlet.figletStrings.Marquee
    - typingsJapgolly.figlet.figletStrings.Maxfour
    - typingsJapgolly.figlet.figletStrings.Merlin1
    - typingsJapgolly.figlet.figletStrings.Merlin2
    - typingsJapgolly.figlet.figletStrings.Mike
    - typingsJapgolly.figlet.figletStrings.Mini
    - typingsJapgolly.figlet.figletStrings.Mirror
    - typingsJapgolly.figlet.figletStrings.Mnemonic
    - typingsJapgolly.figlet.figletStrings.Modular
    - typingsJapgolly.figlet.figletStrings.Morse
    - typingsJapgolly.figlet.figletStrings.Morse2
    - typingsJapgolly.figlet.figletStrings.Moscow
    - typingsJapgolly.figlet.figletStrings.Mshebrew210
    - typingsJapgolly.figlet.figletStrings.Muzzle
    - typingsJapgolly.figlet.figletStrings.NScript
    - typingsJapgolly.figlet.figletStrings.`NT Greek`
    - typingsJapgolly.figlet.figletStrings.`NV Script`
    - typingsJapgolly.figlet.figletStrings.`Nancyj-Fancy`
    - typingsJapgolly.figlet.figletStrings.`Nancyj-Improved`
    - typingsJapgolly.figlet.figletStrings.`Nancyj-Underlined`
    - typingsJapgolly.figlet.figletStrings.Nancyj
    - typingsJapgolly.figlet.figletStrings.Nipples
    - typingsJapgolly.figlet.figletStrings.O8
    - typingsJapgolly.figlet.figletStrings.OS2
    - typingsJapgolly.figlet.figletStrings.Octal
    - typingsJapgolly.figlet.figletStrings.Ogre
    - typingsJapgolly.figlet.figletStrings.`Old Banner`
    - typingsJapgolly.figlet.figletStrings.Pagga
    - / * Patorjk's Cheese * / java.lang.String
    - typingsJapgolly.figlet.figletStrings.`Patorjk-HeX`
    - typingsJapgolly.figlet.figletStrings.Pawp
    - typingsJapgolly.figlet.figletStrings.`Peaks Slant`
    - typingsJapgolly.figlet.figletStrings.Peaks
    - typingsJapgolly.figlet.figletStrings.Pebbles
    - typingsJapgolly.figlet.figletStrings.Pepper
    - typingsJapgolly.figlet.figletStrings.Poison
    - typingsJapgolly.figlet.figletStrings.Puffy
    - typingsJapgolly.figlet.figletStrings.Puzzle
    - typingsJapgolly.figlet.figletStrings.Pyramid
    - typingsJapgolly.figlet.figletStrings.Rammstein
    - typingsJapgolly.figlet.figletStrings.Rectangles
    - typingsJapgolly.figlet.figletStrings.`Red Phoenix`
    - typingsJapgolly.figlet.figletStrings.Relief
    - typingsJapgolly.figlet.figletStrings.Relief2
    - typingsJapgolly.figlet.figletStrings.Reverse
    - typingsJapgolly.figlet.figletStrings.Roman
    - typingsJapgolly.figlet.figletStrings.Rot13
    - typingsJapgolly.figlet.figletStrings.Rotated
    - typingsJapgolly.figlet.figletStrings.Rounded
    - typingsJapgolly.figlet.figletStrings.`Rowan Cap`
    - typingsJapgolly.figlet.figletStrings.Rozzo
    - typingsJapgolly.figlet.figletStrings.Runic
    - typingsJapgolly.figlet.figletStrings.Runyc
    - typingsJapgolly.figlet.figletStrings.`S Blood`
    - typingsJapgolly.figlet.figletStrings.`SL Script`
    - typingsJapgolly.figlet.figletStrings.`Santa Clara`
    - typingsJapgolly.figlet.figletStrings.Script
    - typingsJapgolly.figlet.figletStrings.Serifcap
    - typingsJapgolly.figlet.figletStrings.Shadow
    - typingsJapgolly.figlet.figletStrings.Shimrod
    - typingsJapgolly.figlet.figletStrings.Short
    - typingsJapgolly.figlet.figletStrings.`Slant Relief`
    - typingsJapgolly.figlet.figletStrings.Slant
    - typingsJapgolly.figlet.figletStrings.Slide
    - typingsJapgolly.figlet.figletStrings.`Small Caps`
    - typingsJapgolly.figlet.figletStrings.`Small Isometric1`
    - typingsJapgolly.figlet.figletStrings.`Small Keyboard`
    - typingsJapgolly.figlet.figletStrings.`Small Poison`
    - typingsJapgolly.figlet.figletStrings.`Small Script`
    - typingsJapgolly.figlet.figletStrings.`Small Shadow`
    - typingsJapgolly.figlet.figletStrings.`Small Slant`
    - typingsJapgolly.figlet.figletStrings.`Small Tengwar`
    - typingsJapgolly.figlet.figletStrings.Small
    - typingsJapgolly.figlet.figletStrings.Soft
    - typingsJapgolly.figlet.figletStrings.Speed
    - typingsJapgolly.figlet.figletStrings.Spliff
    - typingsJapgolly.figlet.figletStrings.Stacey
    - typingsJapgolly.figlet.figletStrings.Stampate
    - typingsJapgolly.figlet.figletStrings.Stampatello
    - typingsJapgolly.figlet.figletStrings.Standard
    - typingsJapgolly.figlet.figletStrings.`Star Strips`
    - typingsJapgolly.figlet.figletStrings.`Star Wars`
    - typingsJapgolly.figlet.figletStrings.Stellar
    - typingsJapgolly.figlet.figletStrings.Stforek
    - typingsJapgolly.figlet.figletStrings.`Stick Letters`
    - typingsJapgolly.figlet.figletStrings.Stop
    - typingsJapgolly.figlet.figletStrings.Straight
    - typingsJapgolly.figlet.figletStrings.`Stronger Than All`
    - typingsJapgolly.figlet.figletStrings.`Sub-Zero`
    - typingsJapgolly.figlet.figletStrings.`Swamp Land`
    - typingsJapgolly.figlet.figletStrings.Swan
    - typingsJapgolly.figlet.figletStrings.Sweet
    - typingsJapgolly.figlet.figletStrings.THIS
    - typingsJapgolly.figlet.figletStrings.Tanja
    - typingsJapgolly.figlet.figletStrings.Tengwar
    - typingsJapgolly.figlet.figletStrings.Term
    - typingsJapgolly.figlet.figletStrings.Test1
    - typingsJapgolly.figlet.figletStrings.`The Edge`
    - typingsJapgolly.figlet.figletStrings.Thick
    - typingsJapgolly.figlet.figletStrings.Thin
    - typingsJapgolly.figlet.figletStrings.Thorned
    - typingsJapgolly.figlet.figletStrings.`Three Point`
    - typingsJapgolly.figlet.figletStrings.`Ticks Slant`
    - typingsJapgolly.figlet.figletStrings.Ticks
    - typingsJapgolly.figlet.figletStrings.Tiles
    - typingsJapgolly.figlet.figletStrings.`Tinker-Toy`
    - typingsJapgolly.figlet.figletStrings.Tombstone
    - typingsJapgolly.figlet.figletStrings.Train
    - typingsJapgolly.figlet.figletStrings.Trek
    - typingsJapgolly.figlet.figletStrings.Tsalagi
    - typingsJapgolly.figlet.figletStrings.Tubular
    - typingsJapgolly.figlet.figletStrings.Twisted
    - typingsJapgolly.figlet.figletStrings.`Two Point`
    - typingsJapgolly.figlet.figletStrings.`USA Flag`
    - typingsJapgolly.figlet.figletStrings.Univers
    - typingsJapgolly.figlet.figletStrings.Varsity
    - typingsJapgolly.figlet.figletStrings.Wavy
    - typingsJapgolly.figlet.figletStrings.Weird
    - typingsJapgolly.figlet.figletStrings.`Wet Letter`
    - typingsJapgolly.figlet.figletStrings.Whimsy
    - typingsJapgolly.figlet.figletStrings.Wow
  */
  type Fonts_ = _Fonts_ | (/* Patorjk's Cheese */ String)
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.figlet.figletStrings.default
    - typingsJapgolly.figlet.figletStrings.full
    - typingsJapgolly.figlet.figletStrings.fitted
    - typingsJapgolly.figlet.figletStrings.`controlled smushing`
    - typingsJapgolly.figlet.figletStrings.`universal smushing`
  */
  trait KerningMethods extends StObject
  object KerningMethods {
    
    inline def default: typingsJapgolly.figlet.figletStrings.default = "default".asInstanceOf[typingsJapgolly.figlet.figletStrings.default]
    
    inline def `controlled smushing`: typingsJapgolly.figlet.figletStrings.`controlled smushing` = ("controlled smushing").asInstanceOf[typingsJapgolly.figlet.figletStrings.`controlled smushing`]
    
    inline def fitted: typingsJapgolly.figlet.figletStrings.fitted = "fitted".asInstanceOf[typingsJapgolly.figlet.figletStrings.fitted]
    
    inline def full: typingsJapgolly.figlet.figletStrings.full = "full".asInstanceOf[typingsJapgolly.figlet.figletStrings.full]
    
    inline def `universal smushing`: typingsJapgolly.figlet.figletStrings.`universal smushing` = ("universal smushing").asInstanceOf[typingsJapgolly.figlet.figletStrings.`universal smushing`]
  }
  
  trait Options extends StObject {
    
    var font: js.UndefOr[Fonts_] = js.undefined
    
    var horizontalLayout: js.UndefOr[KerningMethods] = js.undefined
    
    var printDirection: js.UndefOr[PrintDirection] = js.undefined
    
    var showHardBlanks: js.UndefOr[Boolean] = js.undefined
    
    var verticalLayout: js.UndefOr[KerningMethods] = js.undefined
    
    /**
      * This option works in conjunction with "width".
      * If this option is set to true, then the library will attempt to break text up on whitespace when limiting the width.
      * @default false
      */
    var whitespaceBreak: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This option allows you to limit the width of the output.
      * For example, if you want your output to be a max of 80 characters wide, you would set this option to 80.
      * @default undefined
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFont(value: Fonts_): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHorizontalLayout(value: KerningMethods): Self = StObject.set(x, "horizontalLayout", value.asInstanceOf[js.Any])
      
      inline def setHorizontalLayoutUndefined: Self = StObject.set(x, "horizontalLayout", js.undefined)
      
      inline def setPrintDirection(value: PrintDirection): Self = StObject.set(x, "printDirection", value.asInstanceOf[js.Any])
      
      inline def setPrintDirectionUndefined: Self = StObject.set(x, "printDirection", js.undefined)
      
      inline def setShowHardBlanks(value: Boolean): Self = StObject.set(x, "showHardBlanks", value.asInstanceOf[js.Any])
      
      inline def setShowHardBlanksUndefined: Self = StObject.set(x, "showHardBlanks", js.undefined)
      
      inline def setVerticalLayout(value: KerningMethods): Self = StObject.set(x, "verticalLayout", value.asInstanceOf[js.Any])
      
      inline def setVerticalLayoutUndefined: Self = StObject.set(x, "verticalLayout", js.undefined)
      
      inline def setWhitespaceBreak(value: Boolean): Self = StObject.set(x, "whitespaceBreak", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceBreakUndefined: Self = StObject.set(x, "whitespaceBreak", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type PrintDirection = Double
  
  trait _Fonts_ extends StObject
}
